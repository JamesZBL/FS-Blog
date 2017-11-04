<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>出错啦</title>

<#--<!-- Bootstrap core CSS &ndash;&gt;-->
<#--<link href="/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">-->

    <!-- Custom styles for this template -->
    <link href="css/full-slider/full-slider.css" rel="stylesheet">

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
        <#--<p class="text-center">${(msg)!"服务器需要冷静一下"}</p>-->
        <#--<p class="text-center">错误代码：${(code)!"未知错误"}</p>-->
        <h2 class="m-3 text-center">${(msg)!"服务器需要冷静一下"}</h2>
        <h3 class="text-center">错误代码：${(code)!"未知错误"}</h3>
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
