In this, we follow below steps

Starbucks

Login page send authentication request to edu.mum.cs.cmbk.controller.LoginController
Login info are fetch from edu.mum.cs.cmbk.service;.UserService
If login success, the user is forwarded WEB-INF/view/advice.jsp page
The request from advice.jsp is handled by edu.mum.cs.cmbk.controller.AdviceController, this controller compute the advice list from data and put the roast and data collected into the request attributes
The result is forwarded WEB-INF/view/display.jsp page which contains a html table with tr background color based on the data index using c:forEach