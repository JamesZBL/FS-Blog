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

<div class="container container-fluid cus_content">
    <div class="row">
        <div class="col-8">
            <ul class="list-unstyled">
            <#if postlist??>
                <#list postlist as post>
                    <div class="card mt-3">
                        <img class="card-img-top img-fluid"
                             src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512641621739&di=ddd78d52299e55fe65761839018105d1&imgtype=0&src=http%3A%2F%2Fp5.qhimg.com%2Ft0138c3eacb74c59dac.png"
                             alt="Card image cap" style="">
                        <div class="card-body">
                            <a href="/blog/${post.id!""}" class="text-dark"><h4 class="card-title">${post.title!""}</h4></a>
                            <p class="card-text text-secondary">Freemarker中list的用法 - 秦营的博客 - ITeye博客
                                2012年7月30日 - freemarker 使用list进行遍历基本遍历:其中sequence是变量名,它代表一个list。item是我起的...</p>
                            <p class="text-right text-secondary">${post.dateTime!""}</p>
                        </div>
                    </div>
                </#list>
            </#if>
            </ul>
        </div>
    </div>
</div>


<#-- s-footer -->
<#include "public/footer.ftl">
<#-- e-footer -->

<!-- Bootstrap core JavaScript -->
<script src="/vendor/jquery/jquery.min.js"></script>
<script src="/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
</html>
