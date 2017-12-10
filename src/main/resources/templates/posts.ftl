<html lang="zh">
<#-- 博客列表页 -->
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>${articleTitle!'全栈博客'}</title>

<#-- EditorMD -->
    <link href="/vendor/editor/css/editormd.css" rel="stylesheet">

<#-- landing-page -->
    <link rel="stylesheet" href="/vendor/landing-page/landing-page.min.css">

<#-- 自定义 样式 -->
<#include "public/front_custom_css.ftl">

<#-- CSS -->
<#include "public/front_css.ftl">
</head>

<body>

<#-- s-nav.ftl -->
<#include "public/nav.ftl">
<#-- e-nav.ftl -->
<!-- 落地页 -->
<header class="masthead text-white text-center"
        style="background-image: url('http://blackrockdigital.github.io/startbootstrap-clean-blog/img/home-bg.jpg')">
    <div class="overlay"></div>
    <div class="container">
        <div class="row">
            <div class="col mx-auto text-left pl-5">
                <h1>FS-Blog</h1>
                <h3>记录技术成长点滴</h3>
            </div>
        </div>
    </div>
</header>
<div class="container container-fluid mt-5 mb-5">
<#--<img src="http://blackrockdigital.github.io/startbootstrap-clean-blog/img/home-bg.jpg" alt="">-->
    <div class="row">
        <div class="col-md-8">
            <ul class="list-unstyled">
            <#if postlist??>
                <#list postlist as post>
                    <div class="card mt-3">
                        <div class="card-body">
                            <a href="/blog/${post.id!""}" class="text-dark"><h4
                                    class="card-title font-weight-bold">${post.title!""}</h4>
                            </a>
                            <p class="card-text">${post.description}</p>
                            <p class="text-right text-secondary">${post.dateTime!""}</p>
                        </div>
                    </div>
                </#list>
            </#if>
            </ul>
        </div>
        <div class="col-md-4 mt-3">
            <div class="card mb-3">
                <div class="card-header">
                    搜索文章
                </div>
                <div class="card-body">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="输入你想查找的题目..." aria-label="输入你想查找的题目...">
                        <span class="input-group-btn">
                        <button class="btn btn-primary" type="button">搜索</button>
                    </span>
                    </div>
                </div>
            </div>
        <#if taglist??>
            <div class="card mb-3">
                <div class="card-header">
                    热门标签
                </div>
                <div class="card-body">
                    <#list taglist as tag>
                        <!-- tag -->
                        <a href="/post?tagId=${tag.tagId!''}">
                            <button type="button" class="btn btn-outline-primary mb-3">
                            ${tag.tagName!""} <span class="badge badge-primary">${tag.articleCount!""}</span>
                            </button>
                        </a>
                    </#list>
                </div>
            </div>
        </#if>
        </div>
    </div>
</div>


<#-- s-footer -->
<#include "public/footer.ftl">
<#-- e-footer -->

<#-- JS -->
<#include "public/front_js.ftl">
</body>
</html>
