/**
 * 
 */
 
 
 const del = document.getElementById("del");

 const frm = document.getElementById("frm");
 const up = document.getElementById("up");
console.log(up.getAttribute('data-region-id'));
 up.addEventListener("click" , function(){
    frm.setAttribute("action", "update")
    frm.setAttribute("method", "get")
   frm.submit(); 
    // let id=up.getAttribute('data-region-id');
    // location.href="./update?region_id="+id;
 });
 del.addEventListener("click", function(){
   let result = confirm("정말 지울꼬야?? ㅠㅠ")
   if(result){ 
   frm.submit();
   }
 });
 