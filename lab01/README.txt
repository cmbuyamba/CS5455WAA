In this, we follow below steps

1. create welcome page index.jsp containing the links to each part of lab

<a href="lab01.jsp">Calculator</a> ==> forward to private page WEB-INF/jsp/lab01/calculator.jsp
<a href="lab02.jsp">Starbucks</a> ==> forward to private page WEB-INF/jsp/lab02/login.jsp
<a href="lab03.jsp">Optional</a> ==> forward to servlet /RandomServlet which forward to

2. Labs implementation

2.1. Calculator
A servlet lab01.Calculator collect add1, add2, mult1 and mult2 parameters, compute the sum of add1 + add2, the product of mult1*mult2
and then put all items in the request attributes and forward request to the same page WEB-INF/jsp/lab01/calculator.jsp

2.2 Starbucks
Login page send authentication request to lab02.edu.cs.AuthenticationServlet servlet
Login info are fetch from lab02.edu.data.Database
If login success, the user is forwarded WEB-INF/jsp/lab02/advice.jsp page
The request from advice.jsp is handled by lab02.edu.cs.AdviceServlet, this servlet compute the advice list from data and put the roast and data collected into the request attributes
The result is forwarded WEB-INF/jsp/lab02/display.jsp page which contains a html table with tr background color based on the data index using c:forEach

2.3. Randoms numbers
The control number and the 3 random numbers are modeled in lab03.RandomModel bean which generate randomNumber and a list of 3 others random numbers called generatedNumbers.
RandomModel is called by lab03.RandomServlet by generating the model and putting into the request attributes.
After forwarding the request to WEB-INF/jsp/lab03/random.jsp, we use c:choose to display result depend on numbers generated as per requirement.