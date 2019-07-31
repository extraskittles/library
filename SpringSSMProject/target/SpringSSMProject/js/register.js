$(function () {
    $("#userName").blur(function () {
        var userName = $("#userName").val()
        $.post("existName",{userName:userName},function (data) {
            var span = $("#tips")
            if(data.existName){
                span.css("color","red")
                span.html(data.msg)
            }else {
                span.css("color","green")
                span.html(data.msg)
            }
        },"json")
    })
})
