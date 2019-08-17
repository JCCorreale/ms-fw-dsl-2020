Partire da Lab12
Aggiungere anche resourceModel.pl (eccezione tuprolog dopo ROBOT 

MIND STARTED)

Altra e cezione tuprolog dopo "coap server started": aggiungere 

sonarDataConfig

provato con maincoapckt client

mettere/messo a startup con crontab -e

adjust message to compensate (da moddare sia su arduino che
su unibo supporto) --> fixata solamente su arduino mettendolo 

sempre dopo il movimento dritto

*** Possibiltà di programmare arduino direttamente da raspberry

Fixati errori compilazione spostando in software serial e servo 

da libraries a utility

NOTE: spegnere robotmind per fare uploade!

***
Fatti esperimenti modificando la rotazione:
in pratica fa indietro, ruota su una sola ruota e poi aggiusta
tornando ancora indietro (indietreggiare serve a evitare di 
scontrarsi con eventuale ostacolo davanti). Provando è 

relativamente affidabile sia per perimetro che per "scala" 

alternata che per percorso arbitrario. Da calibrare meglio.

***

Errore su Pi4J: aggiornare alla versione 1.2 (prendere codice
dal repository di Maven e aggiornare il build.gradle)