<!DOCTYPE html>
<html lang="zh">
<#-- 编辑已有博客 -->
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Full-Stack 系统后台管理</title>

    <!-- Bootstrap Core CSS -->
    <link href="/vendor/admin/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="/vendor/admin/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/dist/admin/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="/vendor/admin/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="/vendor/admin/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- EditorMD -->
    <link rel="stylesheet" href="/vendor/editor/css/editormd.css"/>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- 自定义样式 -->
    <link rel="stylesheet" href="/css/public.css">
</head>

<body>

<div id="wrapper">
<#-- s 导航 -->
<#include "public/nav.ftl">
<#-- e 导航 -->

<#-- s 页面内容 -->
    <div id="page-wrapper">
    <#-- s 页面内容 -->
        <form>
        <#-- s 隐藏字段 -->
            <input name="mdMaterial" id="id_input_md" type="hidden">
            <input name="htmlMaterial" id="id_input_html" type="hidden">
            <input name="description" id="id_input_article_description" type="hidden">
            <input name="id" id="id_input_article_id" type="hidden" value=${article.id!0}>
        <#--<input name="rawTags" id="id_input_article_tags" type="hidden">-->
        <#-- e 隐藏字段 -->
        <#-- s 标题、标签等 -->
            <div class="row">
                <div class="col-sm-12">
                    <div class="input-group">
                        <div class="row">
                            <div class="col-md-12"></div>
                        </div>
                    <#-- 文章标题 -->
                        <input name="title" type="text" class="form-control" placeholder="标题"
                               value="${article.title!""}">
                        <div class="row">
                            <div class="col-md-12"></div>
                        </div>
                        <span class="input-group-btn">
                        <button id="id_btn_blog_submit" class="btn btn-primary" type="button">提交</button>
                    </span>
                    </div>
                </div>
            </div>
        <#-- e 标题 -->
        </form>
        <div class="row">
            <div class="col-sm-12">
                <div id="test-editormd">
                <#-- 文章内容 -->
                    <textarea style="display:none;"> ${article.mdMaterial!""}</textarea>
                </div>
            </div>
        </div>
    <#-- e 页面内容 -->
    </div>
<#-- e 页面内容 -->

</div>

<#-- s 文章描述内容填写模态框 -->
<div class="modal fade" tabindex="-1" role="dialog" id="id_modal_article_detail">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">文章详情</h4>
            </div>
            <div class="modal-body">
            <#-- s 模态内容 -->
                <div class="form-group">
                    <label for="id_input_article_description_in_modal">对文章内容的描述</label>
                    <textarea type="text" class="form-control" id="id_input_article_description_in_modal"
                              placeholder="Description">${article.description}</textarea>
                </div>
            <#--<div class="form-group">-->
            <#--<label for="id_input_article_tags_in_modal">为文章添加标签（以逗号分隔）</label>-->
            <#--<input type="text" class="form-control" id="id_input_article_tags_in_modal" placeholder="Tags">-->
            <#--</div>-->
            <#-- e 模态内容 -->
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="id_btn_release_in_modal">确认发布</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<#-- e 文章描述内容填写模态框 -->

<!-- jQuery -->
<script src="/vendor/admin/jquery/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="/vendor/admin/bootstrap/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="/vendor/admin/metisMenu/metisMenu.min.js"></script>

<!-- Morris Charts JavaScript -->
<script src="/vendor/admin/raphael/raphael.min.js"></script>
<script src="/vendor/admin/morrisjs/morris.min.js"></script>
<script src="/data/morris-data.js"></script>

<!-- Custom Theme JavaScript -->
<script src="/dist/admin/js/sb-admin-2.js"></script>
<script src="/vendor/editor/editormd.min.js"></script>

<#-- 自定义 js -->
<script src="/js/b_blog_modify.js"></script>
<script src="/js/public.js"></script>
</body>

</html>
