
(Q.01)

01.Add Jackson Dependency

02.check the jason values are null or not null using if condition

  if (req.getContentType() == null ||

  !req.getContentType().toLowerCase().startsWith("application/json")) {
  resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
  
} else {
  resp.setContentType("application/json");
  }

03.and check the jeson type
  1.JSON Processing
  2.JSON Binding

04.if that jason is null send error

05.if that jason not null create jason object useing json buildr
   Jsonb jsonb = JsonbBuilder.create();

06.Use fromJson in the created object and pass req.getReader()


