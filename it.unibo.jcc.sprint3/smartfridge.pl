%====================================================================================
% smartfridge description   
%====================================================================================
mqttBroker("localhost", "1883").
context(ctxfridge, "localhost",  "MQTT", "0" ).
 qactor( resourcemodel, ctxfridge, "it.unibo.resourcemodel.Resourcemodel").
