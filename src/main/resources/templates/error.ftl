<html lang="zh">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>出错啦</title>

<#-- 自定义 样式 -->
<#include "public/front_custom_css.ftl">

<#-- CSS -->
<#include "public/front_css.ftl">
</head>

<body>

<#-- s-nav.ftl -->
<#include "public/nav.ftl">
<#-- e-nav.ftl -->


<section class="py-3">
    <div class="container">
    <#--<p class="text-center">${(msg)!"服务器需要冷静一下"}</p>-->
    <#--<p class="text-center">错误代码：${(code)!"未知错误"}</p>-->
        <img  class="-align-center" src="/img/404.png" alt="" style="width:80%;">
        <h2 class="m-3 text-center">${(msg)!"服务器需要冷静一下"}</h2>
        <h3 class="text-center">错误代码：${(code)!"未知错误"}</h3>
    </div>
</section>

<#-- s-footer -->
<#--<#include "public/footer.ftl">-->
<#-- e-footer -->

<#-- JS -->
<#include "public/front_js.ftl">

</body>
</html>
