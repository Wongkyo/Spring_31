/**
 * 
 */

function check() {
	alert("check")
	let check = document.getElementsByClassName("check");
	const all = document.getElementById("all");
	
	let result = true;
	
	
	for(ch of check){
		if(!ch.checked){
			result=false;
			break;
		}
	}
	
	all.checked=result;
	
}