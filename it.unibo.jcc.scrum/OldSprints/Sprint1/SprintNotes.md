Planning come principale espressione del BEHAVIOUR
Rappresento "l'implementazione delle Action", del tipo:

Agent BUTLER {

  Action W {...}
  Action TAKE(ITEM, FROM) {...}
  Action PUT(ITEM, ON) {...}

  Task PREPARE {
    Goal: ON(FOOD, TABLE) && ON(DISHES, TABLE)
  }

  Task ADDFOOD {
    Goal: ON(FOOD, TABLE)
    Precondition: /* e.g. check fridge contains food */
  }

  ...
}

TASK rappresentano dei "goal predefiniti" che corrispondono a 

messaggi/comandi che l'agente pu� ricevere eseguendo il task 

corrispondente tramite un PLAN generato autonomamente (il DSL consente 

di esprimere tutte le azioni che il planner conosce e specificare quale 

deve essere la loro esecuzione runtime).

Ma anche possibilit� di "settare" esplicitamente un goal "qualunque" 

(tra quelli supportati) tramite messaggio:
setGoal(ON(STUFF, TABLE)).

Possibilit� built-in SUSPEND/RESUME (azioni considerate "atomiche").

Modello del mondo dell'agente � lo stesso del planning (o sono 

sincronizzati automaticamente).

EVENTI quando si raggiunge il goal (ed eventualmente quando si effettua 

il singolo step, per poter essere sospesi in momenti specifici). Inoltre 

anche eventi di FAIL per consentire comandi
dall'esterno.

Le ACTION dovrebbero essere in qualche modo in grado di specificare cosa 

fare in caso di successo o fallimento (es.
aspettare/ripianificare). 

Funzione REPLAN e REATTIVITA'!

Compila in QAK.

Nota: deve essere semplice estendere il "framework" del planner per 

includere la rappresentazione di nuove azioni e goal che poi troveranno 

corrispondenza nel DSL (e.g. DSL che esprime le azioni di robot che si 

muovo e portano cose da un posto all'altro).

ESEMPIO REATTIVITA':

Action W {
  execution {
delayVar PauseTimeL  //Otherwise is too fast, even with remote 

interaction
        run itunibo.planner.moveUtils.attemptTomoveAhead(myself, 

StepTime)
  }
  onSuccess {
// handleStepOk
    run itunibo.planner.moveUtils.updateMapAfterAheadOk(myself)
  }
  onFailure {
    // hadleStepFail
println("NEVER HERE!!!") // ma pu� succedere se ho ostacoli mobili
  }
}

La cosa pi� semplice (e uniforme con quello che si ha gi�) sarebbe 

mappare successo/fallimento (e altri possibili esiti?) su messaggi che 

ci si aspetta di ricevere subito dopo e relative transizioni. Esempio:

Action W {
  execution {
    /* Tenta lo step */
  }
  on(stepOk) {
    /*update mappa*/
  }
  on(stepFail) {
    /*aspetta che l'ostacolo si sposti ed eventualmente dopo un
      certo tempo ripianifica*/
  }
}

La politica in stepFail � difficilmente rappresentabile in maniera 

generale, ed inventare "poltiche" tipo WAIT/REPLAN pu� non essere 

sufficientemente generale. Una possibilit� sarebbe dare due comandi 

"speciali" RESUME e REPLAN utilizzabili nella clausola "on".

Serve anche RETRY che consenta di riprovare l'esecuzione (ad esempio
dopo un delay) onde evitare di dover fare ad esempio un accesso 
esplicito a un sensore (esempio: per sapere se l'ostacolo si � spostato
posso leggere lo stato del sonar oppure semplicemente riprovare lo step).

Nota: differenze fra RETRY e RESUME?

PLANNER:

Il .dsl consente di definire il "behaviour" relativo a ciascuna azione.
Le azioni sono quelle predefinito nel dominio di riferimento (quelle che il
robot pu� effettivamente fare). Il migliore dei casi sarebbe quello di generale
il DSL e il planner che supporti determinate azioni a partire da un metalivello
piu astratto (eventualmente compatibile con la sintassi di STRIPS o altri planner),
che consenta di DEFINIRE i goal e le azioni (che devono essere in automatico comprese
e gestite dall'infrastruttura).

NOTE

Importante mettere moves.pl direttamente nel progetto per far funzionare showMoves
(il resto funziona comunque, per qualche motivo...)

Reasserire la mossa non funziona perch� viene messa in fondo. Occorre quindi evitare 
di ritrattarla all'inizio di executePlannedActions ma farlo solo una volta che � stata 
effettivamente eseguita.

DUBBI

Come funziona setObstacleOnCurrentDirection? Fa doPlannedMove..?
XTEXT: come creare il plugin in modo da usare nei progetti "normali" (cio� senza lanciare
un nuovo Eclipse?). Possibile usare contemporaneamente sia .agt che .qak?
XTEXT: come specificare, ad esempio, che dentro a un ACTION ci sia la sintassi
presa da un altro linguaggio (e.g. QAK)? NOTA: per ora uso subset opportuno della sintassi 
QAK (in particolare quella relativa a RUN/ANYACTION)