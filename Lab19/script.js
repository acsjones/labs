$(document).ready(function() {
	
	var shoppingCart = [];
	
	$(".add-button").click(function() {
		var row = $(this).parent();
		var price = row.children(".price").text();
		var name = row.children(".name").text();
		shoppingCart.push({ name: name, price: price})
	});
	
	$("#finish-button").click(printReceipt);
	
	
	function printReceipt() {
		var total = 0;
		for (var i = 0; i  < shoppingCart.length; i++) {
			var item = shoppingCart[i]
			total += Number(item.price);
			console.log("$" + item.price + " " + item.name);

	}
		console.log("Total: $" + total);
	}

});