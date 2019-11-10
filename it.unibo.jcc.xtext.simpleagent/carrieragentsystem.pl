%====================================================================================
% carrieragentsystem description   
%====================================================================================
mqttBroker("localhost", "1883").
context(ctxcarrieragent, "localhost",  "MQTT", "0" ).
context(ctxdummyformovebehavior, "otherresourcelocalhost",  "MQTT", "0" ).
context(ctxdummyforgotobehavior, "otherresourcelocalhost",  "MQTT", "0" ).
context(ctxdummyforroomstate, "otherresourcelocalhost",  "MQTT", "0" ).
 qactor( movebehavior, ctxdummyformovebehavior, "external").
  qactor( gotobehavior, ctxdummyforgotobehavior, "external").
  qactor( roomstate, ctxdummyforroomstate, "external").
  qactor( carrierbehavior, ctxcarrieragent, "it.unibo.carrierbehavior.Carrierbehavior").
