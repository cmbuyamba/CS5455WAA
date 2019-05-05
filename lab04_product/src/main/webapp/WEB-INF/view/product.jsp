<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Save Product</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
    <h4>The product has been saved.</h4>
    <p>
        <h5>Details:</h5>
        Product Name: ${newProduct.name}<br/>
        Category: ${newProduct.category.name}<br/>
        Description: ${newProduct.description}<br/>
        Price: $${newProduct.price}
    </p>
    
    <form action="products" method="get">
           <input id="submit" type="submit" value="List products">
	</form>
    
</div>
</body>
</html>