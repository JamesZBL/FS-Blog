<!DOCTYPE html>
<html lang="zh">

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
        <div class=".container-fluid">
            <div class="row">
                <div class="col-md-6">
                    <form id="id_form">
                        <div class="form-group row">
                            <label for="id_ori_pwd" class="col-sm-2 col-form-label">原密码</label>
                            <div class="col-sm-10">
                                <input name="oriPwd" type="password" class="form-control" id="id_ori_pwd">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="id_new_pwd" class="col-sm-2 col-form-label">新密码</label>
                            <div class="col-sm-10">
                                <input name="newPwd" type="password" class="form-control" id="id_new_pwd">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="id_confirm_pwd" class="col-sm-2 col-form-label">确认密码</label>
                            <div class="col-sm-10">
                                <input name="confirmPwd" type="password" class="form-control" id="id_confirm_pwd">
                            </div>
                        </div>
                    </form>
                    <button id="id_btn_submit" class="btn btn-default">确认修改</button>
                </div>
            </div>
        </div>

    </div>
<#-- e 页面内容 -->

</div>

<!-- jQuery -->
<script src="../vendor/admin/jquery/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../vendor/admin/bootstrap/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="../vendor/admin/metisMenu/metisMenu.min.js"></script>

<!-- Morris Charts JavaScript -->
<script src="../vendor/admin/raphael/raphael.min.js"></script>
<script src="../vendor/admin/morrisjs/morris.min.js"></script>
<script src="../data/morris-data.js"></script>

<!-- Custom Theme JavaScript -->
<script src="../dist/admin/js/sb-admin-2.js"></script>
<script src="../js/public.js"></script>
<script src="/js/b_admin_user_pwd_modify.js"></script>
<#-- 后台通用 js -->
<#include "public/public_js.ftl">
</body>

</html>

<style>
    #page-wrapper {
        padding: 15px 15px;
    }
</style>