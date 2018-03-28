/* 博客修改 */
// Markdown 编辑器
var testEditor;

$(function () {
    testEditor = editormd("test-editormd", {
        width: "100%",
        height: 640,
        syncScrolling: "single",
        path: "/vendor/editor/lib/",
        saveHTMLToTextarea: true
    });

    $("#id_btn_blog_submit").bind("click", function () {
        /* markdown 格式文本 */
        $("#id_input_md").val(testEditor.getMarkdown());
        /* html 格式内容 */
        $("#id_input_html").val($(".markdown-body").prop('outerHTML'));
        /* 展示文章描述填写的模态框 */
        showDetailModal();
    });

    $('#id_btn_release_in_modal').bind('click', function () {
        saveDetailText();
        submitBlogAddForm();
    });
});

/**
 * 展示文章详情填写的模态框
 */
function showDetailModal() {
    $('#id_modal_article_detail').modal({
        // backdrop: false
    });
}

/**
 * 将模态框中填写的内容保存到表单中
 */
function saveDetailText() {
    // 内容描述
    $('#id_input_article_description').val($('#id_input_article_description_in_modal').val());
    // Tags
    $('#id_input_article_tags').val($('#id_input_article_tags_in_modal').val());
}

/**
 * 提交文章表单
 */
function submitBlogAddForm() {
    $.ajax({
        type: "POST",
        dataType: "json",
        url: "/update_resume.f",
        data: $("#id_form_resume").serialize(),
        success: function (result) {
            if (!(result.hasError)) {
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
}