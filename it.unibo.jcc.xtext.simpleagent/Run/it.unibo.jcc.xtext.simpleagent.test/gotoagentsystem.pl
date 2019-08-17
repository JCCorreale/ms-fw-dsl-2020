%====================================================================================
% gotoagentsystem description   
%====================================================================================
mqttBroker("localhost", "1883").
context(ctxgotoagent, "localhost",  "MQTT", "0" ).
context(ctxdummy, "otherresourcelocalhost",  "MQTT", "0" ).
 qactor( movebehavior, ctxdummy, "external").
  qactor( gotobehavior, ctxgotoagent, "it.unibo.gotobehavior.Gotobehavior").
