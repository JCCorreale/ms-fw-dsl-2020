%====================================================================================
% carrieragentsystem description   
%====================================================================================
mqttBroker("localhost", "1883").
context(ctxcarrieragent, "localhost",  "MQTT", "0" ).
context(ctxdummy, "otherresourcelocalhost",  "MQTT", "0" ).
 qactor( gotobehavior, ctxdummy, "external").
  qactor( carrierbehavior, ctxcarrieragent, "it.unibo.carrierbehavior.Carrierbehavior").
