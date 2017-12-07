<html lang="en">
<#-- 博客列表页 -->
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
<#if postlist??>
    <#list postlist as post>
        ${post.title}
    </#list>
</#if>
</div>


<#-- s-footer -->
<#include "public/footer.ftl">
<#-- e-footer -->

<!-- Bootstrap core JavaScript -->
<script src="/vendor/jquery/jquery.min.js"></script>
<script src="/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
</html>
