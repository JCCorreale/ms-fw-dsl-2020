%====================================================================================
% butlermind description   
%====================================================================================
mqttBroker("localhost", "1883").
context(ctxbutlermind, "localhost",  "MQTT", "0" ).
context(ctxdummyforfridge, "localhost",  "MQTT", "0" ).
 qactor( resourcemodel, ctxdummyforfridge, "external").
  qactor( roomstate, ctxbutlermind, "it.unibo.roomstate.Roomstate").
