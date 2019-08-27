%====================================================================================
% butlermind description   
%====================================================================================
mqttBroker("localhost", "1883").
context(ctxbutlermind, "localhost",  "MQTT", "0" ).
context(ctxfridge, "localhost",  "MQTT", "0" ).
 qactor( resourcemodel, ctxfridge, "external").
  qactor( roomstate, ctxbutlermind, "it.unibo.roomstate.Roomstate").
