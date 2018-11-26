/**
 * 
 */
function fn_write(){
    
    var form = document.getElementById("boardForm");
    
    form.action = "<c:url value='/board/writeForm.do'/>";
    form.submit();
    
}
 
function fn_view(code){
    
    var form = document.getElementById("boardForm");
    var url = "<c:url value='/board/viewContent.do'/>";
    url = url + "?code=" + code;
    
    form.action = url;    
    form.submit(); 
}
