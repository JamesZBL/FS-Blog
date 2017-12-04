/* 博客发布 */
// Markdown 编辑器
var testEditor;

$(function () {
    testEditor = editormd("test-editormd", {
        width: "100%",
        height: 640,
        syncScrolling: "single",
        path: "../vendor/editor/lib/",
        saveHTMLToTextarea : true
    });

    /*
     // or
     testEditor = editormd({
     id      : "test-editormd",
     width   : "90%",
     height  : 640,
     path    : "../lib/"
     });
     */

    $("#id_btn_blog_submit").bind("click", function () {
        $("#id_input_md").val(testEditor.getMarkdown());
        // 提交表单
        var form = document.forms[0];
        form.action = "/admin/blogadd.f";
        form.method = "post";
        form.submit();
    });
});