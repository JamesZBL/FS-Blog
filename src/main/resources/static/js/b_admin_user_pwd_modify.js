$(function () {
    $("#id_btn_submit").bind("click", function () {
        $.ajax({
            type: "POST",
            dataType: "json",
            url: "/admin/admin_user_pwd_modify.f",
            data: $('#id_form').serialize(),
            success: function (result) {
                if (!(result.hasError)) {
                    msg("修改成功");
                    // 返回博客批量管理页
                    c_location("/admin/blogmanage");
                } else {
                    msg("修改失败");
                }
            },
            error: function () {
                msg("失败");
            }
        });
    });
});