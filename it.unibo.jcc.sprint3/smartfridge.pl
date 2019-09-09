%====================================================================================
% smartfridge description   
%====================================================================================
mqttBroker("localhost", "1883").
context(ctxfridge, "localhost",  "MQTT", "0" ).
 qactor( fridgeresourcemodel, ctxfridge, "it.unibo.fridgeresourcemodel.Fridgeresourcemodel").
