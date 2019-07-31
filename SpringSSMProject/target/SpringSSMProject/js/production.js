$(function () {
    $("#logout").click(function () {
        $.get("logout",{},function () {
            $("#logout").hide()
            $("#name").hide()
        })
    })
})
