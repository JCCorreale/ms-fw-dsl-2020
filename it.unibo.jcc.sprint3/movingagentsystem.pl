%====================================================================================
% movingagentsystem description   
%====================================================================================
mqttBroker("localhost", "1883").
context(ctxmovingagent, "localhost",  "MQTT", "0" ).
context(ctxdummyformind, "otherresourcelocalhost",  "MQTT", "0" ).
 qactor( resourcemodel, ctxdummyformind, "external").
  qactor( onestepahead, ctxdummyformind, "external").
  qactor( movebehavior, ctxmovingagent, "it.unibo.movebehavior.Movebehavior").
