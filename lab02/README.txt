In this lab we follow steps below

1. Install the framework in local maven repository by the command below
mvn install:install-file -Dfile=mvcframework1.0.0.jar -DgroupId=edu.mum.cs -DartifactId=mvcframework -Dversion=1.0.0 -Dpackaging=jar

2. Components

mum.lab02.controller.CalculatorController : the controller to handle http request
mum.lab02.domain.Calculator : the computation model
mum.lab02.validator.CalculatorValidatorImpl : validator implementation
mum.lab02.validator.CalculatorValidator : validator interface

WEB-INF/jsp/calculator.jsp : web form allowing to get sum / product of numbers

calculator.jsp send http request to CalculatorController which calls the domain model and compute result after checking the error messages from the validator.