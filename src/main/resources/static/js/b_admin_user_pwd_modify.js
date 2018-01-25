$(function () {
    $("#id_btn_submit").bind("click", function () {
        $.ajax({
            type: "POST",
            dataType: "json",
            url: "/admin/admin_user_pwd_modify.f",
            data: $('#id_form').serialize(),
            success: function (result) {
                if (result.hasError != true) {
                    msg("成功");
                } else {
                    msg("失败");
                }
            },
            error: function () {
                msg("失败");
            }
        });
    });
});