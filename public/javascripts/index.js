$(document).ready( function() {
	
	//console.log(sessionStorage);
	
	$('#dologin').click( function() {
		sessionStorage.username = $('#username').val();
	})
	
	
	
	if (sessionStorage.username==null) {
		console.log("no hay usuario en session")
		window.location.href = "/";
		window.stop();
	}
	
	$.ajax({
		url:"/posts",
		success: function(data) {
			Posts = data;
			var div_post = $('#div_post');
			var contenido = "";
			
			
			var cc = "";
			for (var z = 0; z < data.length; z++) {
				cc += "<div class='card blue-grey darken-1' style='padding-top: 30px;'>" +
						"<div class='card-content white-text'>" +
							"<span class='card-title'>"+ data[z].title + "</span><br>" +
							"<p>" +  data[z].comment + "</p>" +
							"<p>" +  data[z].author + "</p>" +
						"</div>" +
						"<div class='card-action'><a>" + data[z].category + "</a></div>" +
						"</div><br><br>";
			}
			
			div_post.html(cc);
			
			window.location.href = "/home";
			window.stop();
		}
	});
});