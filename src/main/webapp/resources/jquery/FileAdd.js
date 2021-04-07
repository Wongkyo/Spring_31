/**
 * 
 */

let count=0;

$("#add").click(function(){	
	if(count<5){
	let contents = $("#sample").html();
	$("#files").append(contents);
	count++; 
	}else{
		alert("최대 5개만 가능");
	}
});


//왜 이렇게 돌아 갈깝??


$("#del").click(function(){
	$("#files").empty();
	count=0;
});

//이벤트 전달(위임)
$("#files").on("click", ".delete",function(){
	$(this).parent().remove();
	count--;
});









