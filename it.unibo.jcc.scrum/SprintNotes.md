Ogni risorsa � rappresentata da un attore e risponde a messaggi take/put (da parte del Butler).
Nel caso di risorse "fittizie" gli attori sono nello stesso contesto del Butler (di fatto nello stesso file QAK?)
Gli attori corrispondenti alle risorse "fittizie" aggiornano il resource model del Butler (che � un attore separato
dal butler, mentre quello del frigo � quello che va ad aggiornare la corrispondente risorsa coap (processo e contesto
completamente separato dal Butler). Introdurre un attore intermedio tra butler e fridge o limitarsi ad avere "per caso"
interfaccia corrispondente take/put? (Requirement: pantry and dishwasher AT THE MOMENT non-smart resources).

Il butler ha un modello del mondo del tipo:

at(robot, home)
at(pizza, table)
carry(robot, pizza)
at(robot, traveling) (?)
// Queste devono essere tutte nello state of the room (del butler)? O le aggiorno "alla bisogna"?
// O ancora do al maitre una VISTA che le aggrega entrambe? (Un altro attore roomview/roomstate?)
at(caviar, fridge)


Spunti per tesi:
- esemplificare il ruolo delle software factory evidenziando i limiti dei singoli livelli di astrazione
(es. planner "procedurale" vs planner autogenerato su base di ADL - procedurale ha azioni che necessitano
di sapere implementazione dello stato. Esemplificazione del fatto che ci� ha richiesto lavoro in Sprint3)

TODO
* Fridge frontend
* Maitre app
* Comunicazione Maitre-Butler (request-response - es. quando manca il cibo manda un warning?)