<!DOCTYPE html>
<html lang="zh">
<#-- 后台用户批量管理 -->
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Full-Stack 系统后台管理</title>

    <!-- Bootstrap Core CSS -->
    <link href="../vendor/admin/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../vendor/admin/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../dist/admin/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="../vendor/admin/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../vendor/admin/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Bootstrap 表格 -->
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/bootstrap-table.min.css">

    <!-- 自定义样式 -->
    <link rel="stylesheet" href="/css/public.css">

    <!-- 后台通用 css -->
    <#include "public/public_css.ftl">
</head>

<body>

<div id="wrapper">
<#-- s 导航 -->
<#include "public/nav.ftl">
<#-- e 导航 -->

<#-- s 页面内容 -->
    <div id="page-wrapper">
    <#-- s 页面内容 -->
        <!-- 按钮组 -->
        <div id="toolbar" class="btn-group">
            <button id="id_btn_add" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span> 新增
            </button>
            <button id="id_btn_edit" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> 修改
            </button>
            <button id="id_btn_delete" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span> 删除
            </button>
        </div>
        <!-- s 表格 -->
        <table id="id_table_blog">

        </table>
        <!-- e 表格 -->
    <#-- e 页面内容 -->
    </div>
<#-- e 页面内容 -->

</div>

<!-- jQuery -->
<script src="../vendor/admin/jquery/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../vendor/admin/bootstrap/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="../vendor/admin/metisMenu/metisMenu.min.js"></script>

<!-- Custom Theme JavaScript -->
<script src="../dist/admin/js/sb-admin-2.js"></script>

<#-- Bootstrap 表格 -->
<!-- Latest compiled and minified JavaScript -->
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/bootstrap-table.min.js"></script>

<!-- Latest compiled and minified Locales -->
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js"></script>

<#-- 自定义 js -->
<script src="../js/b_admin_user_manage.js"></script>
<script src="../js/public.js"></script>

<#-- 后台通用 js -->
<#include "public/public_js.ftl">
</body>

</html>
