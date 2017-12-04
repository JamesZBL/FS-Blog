<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>${title!'全栈博客'}</title>

<#--<!-- Bootstrap core CSS &ndash;&gt;-->
<#--<link href="/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">-->

    <!-- Custom styles for this template -->
    <link href="css/full-slider/full-slider.css" rel="stylesheet">
    <#-- EditorMD -->
    <link href="vendor/editor/css/editormd.css" rel="stylesheet">

    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>

    <#-- 自定义 样式 -->
    <link rel="stylesheet" href="css/public.css">

</head>

<body>

<#-- s-nav.ftl -->
<#include "public/nav.ftl">
<#-- e-nav.ftl -->


<section class="py-3">
    <div class="container">
    <#-- 博客标题 -->
        <h1>${artileTitle!'标题'}</h1>
    <#-- 文章内容 -->
    ${articleMd!''}
        
    </div>
</section>

<#-- s-footer -->
<footer class="py-5 bg-dark fixed-bottom">
    <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; FullStack by James 2016-2017</p>
    </div>
</footer>
<#-- e-footer -->

<!-- Bootstrap core JavaScript -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
</html>
