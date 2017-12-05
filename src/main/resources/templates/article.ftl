<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>${articleTitle!'全栈博客'}</title>

<#--<!-- Bootstrap core CSS &ndash;&gt;-->
<#--<link href="/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">-->

    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>

<#-- EditorMD -->
    <link href="/vendor/editor/css/editormd.css" rel="stylesheet">

<#-- 自定义 样式 -->
    <link rel="stylesheet" href="/css/public.css">

</head>

<body>

<#-- s-nav.ftl -->
<#include "public/nav.ftl">
<#-- e-nav.ftl -->

<div class="container-fluid cus_content">
<#-- 博客标题 -->
    <div class="row mt-5">
    <#-- 博客内容 -->
        <div class="col-md-8 offset-md-2">
            <h3 class="p-3">${articleTitle!'标题'}</h3>
        ${articleMd!'文章内容'}
        </div>
    </div>

</div>


<#-- s-footer -->
<footer class="py-5 bg-dark">
    <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; FullStack by James 2016-2017</p>
    </div>
</footer>
<#-- e-footer -->

<!-- Bootstrap core JavaScript -->
<script src="/vendor/jquery/jquery.min.js"></script>
<script src="/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
</html>
