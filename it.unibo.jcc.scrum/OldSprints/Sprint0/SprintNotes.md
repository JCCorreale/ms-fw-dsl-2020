MBot su Arduino con Line Follower
Codice Planner

Dubbi su Requisiti:
. Prepare/Clear: robot riesce a prendere tutto rispettivamente da 

frigo/dispensa in un unico giro o possono essere necessari più giri?
. Prepare/Clear: Posso considerare atomiche le azioni "prendi tutti gli oggetti 

trasportati" da frigo/dispensa/tavolo e "metti tutti gli oggetti trasportati" 

in frigo/dispensa/tavolo"? Ovvero il Maitre in pratica può interrompere solo il 

movimento?
. Stop/Reactivate: Quando sospendo un task, il robot resta fermo o torna in RH?
. Consult: lo stato corrente deve tenere conto del fatto che il cibo può essere 

consumato e quindi non esserci più?

Dubbi Planner:

(NumStep<5) (perché deve fare 4 lati - non è il singolo muro ma tutto il giro)
"the virtual robot could not work without a back step 	"

Machine Learning?

TODO

Copiare progetto con WEnve (per ora importato quello su git) e resettare il 

repository.

IMPORTANT!

Crash con virtual e robotmind (number format)

Dalle 14:00 alle 17:00 18/07/19
(1 precedente a lezione + varie sere - almeno 3 + 1-2 pomeriggi)

DUBBIO:
Chi manda onestep a actor onestepforward?
Da qualcuno all'esterno (es. robotappl, moveUtils (attemptTomoveAhead, ...), 

...). In robotmind.qak c'è sia onestepahead sia la mind propriamente detta. Il 

onestepahead riceve comandi dall'"esterno" (es. dall'attore che gestisce il 

tutto, che a sua volta potrebbe o meno riceverli dall'utente). onestepahead 

aggiorna il resourcemodel, il che è recepito dalla mind (tramite evento LOCALE 

- perché so che sono sullo stesso contesto). La mind in risposta a questo 

evento invia il comando corrispondente al basic robot (che quindi non è 

direttamente reattivo rispetto ai cambiamenti del modello). Alternativamente i 

cambiamenti del modello possono essere fatti dall'esterno tramite COAP (ed 

esposti all'esterno nello stesso modo).

ModelChange VS ModelUpdate
ModelChange rappresenta un "comando" o meglio l'intenzione di cambiare il 

modello ("voglio che il robot vada avanti") mentre modelUpdate rappresenta il 

fatto che è effettivamente cambiato (arriva un aggiornamento dal sonar o il 

robot è effettivamente stato mosso). Invece modelChanged (con la d finale) 

serve a "rimbalzare" alla mind il fatto che qualcuno ha manifestato il 

desiderio di cambiare il modello (a modelChange/d non corrisponde un effettivo 

aggiornamento del modello, che invece è modificato solo da modelUpdate! - in 

generale, vedi Nota sotto).

Nota: in realtà in changeModel di resourceModel la modifica del modello viene 

fatta direttamente quando arriva il modelChange (diversamente dagli altri casi, 

del sonar e dell'OSTACOLO, in cui è la mind che fa update sul modello), ma in 

teoria si potrebbe fare in maniera omogenea (la mind che fa update solamente 

quando ha effettivamente inviato il comando).

TODO
Vedere come è fatto un server COAP.

ALTRI DUBBI:
. E' corretto quello che ho pensato su modelChanged/modelUpdate (in 

particolare, potrei fare solo modelUpdate da parte della mind e fare 

aggiornamento effettivo solo in risposta a modelUpdate nel resourceModel)
. Come funziona updateMapAfterAheadOk? (In particolare sembra che esegua 

nuovamente la mossa!)

ALTRI ANCORA:

. NEVER HERE!!! (Lo può fare in caso che lo step effettivo non corrisponda
a quello della mappa) NOTA: perché step non sempre uguale?!

. Come si passa da doPlan (nella testa del plan) e l'esecuzione effettiva?!

. Devo fare per forza Frigo->Tavolo Pantry->Tavolo o anche Frigo->Pantry-

>Tavolo

TODO

. Rifare mappe in modo che funzioni sempre uguale (tenere conto di posizione di 

partenza iniziale che è leggermente spostata dal muro, usare quella e vedere se 

viene sempre uguale, in caso contrario modificarla opportunamente!

Tempi: + 2 ore.

Regole:
. Ad ogni sprint corrisponde un proprio workspace con, oltre ai progetti 

it.unibo.*, un progetto it.unibo.jcc.scrum contenente i vari Scrum Artifacts 

(eventualmente importato dai progetti precedenti) e vari progetti 

it.unibo.jcc.* contenenti il codice fatto da me. In tal modo ad ogni nuovo 

sprint sarà possibile aggiornare dal repository i progetti it.unibo.* 

semplicemente rimpiazzandoli con i nuovi senza intaccare il codice fatto da me 

(ogni sprint utilizzerà una specifica versione dei progetti).