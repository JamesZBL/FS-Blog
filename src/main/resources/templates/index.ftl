<html lang="zh">
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>${title!'全栈之路'}</title>

    <!-- Custom styles for this template -->
    <link href="/css/full-slider/full-slider.css" rel="stylesheet">

    <#-- 自定义 样式 -->
    <#include "public/front_custom_css.ftl">

    <#-- CSS -->
    <#include "public/front_css.ftl">
</head>

<body>

<#-- s-nav.ftl -->
<#include "public/nav.ftl">
<#-- e-nav.ftl -->

<#-- s-slide-header-->
<header>
    <div id="slideIndicators" class="carousel slide" data-ride="carousel" data-interval="3000" data-pause="">
        <ol class="carousel-indicators">
            <li data-target="#slideIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#slideIndicators" data-slide-to="1"></li>
            <li data-target="#slideIndicators" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
            <!-- Slide One - Set the background image for this slide in the line below -->
            <div class="carousel-item active" style="background-image: url('https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508595325008&di=a92fb4ba0eda9f7a993a57137d0b8e9a&imgtype=0&src=http%3A%2F%2Fupload.chinaz.com%2F2013%2F0830%2F1377855974198.jpg')">
                <div class="carousel-caption d-none d-md-block">
                    <h3>Full-Stack</h3>
                    <p>全栈工程师成长之路</p>
                </div>
            </div>
            <!-- Slide Two - Set the background image for this slide in the line below -->
            <div class="carousel-item" style="background-image: url('https://timgsa.baidu.com/timg?image&quality=100&size=b9999_10000&sec=1508523500405&di=bb1baca46a7cd2f0ea734bb0bfb9c237&imgtype=0&src=http%3A%2F%2Fimages0.cnblogs.com%2Fnews%2F66372%2F201503%2F280056553805856.png')">
                <div class="carousel-caption d-none d-md-block">
                    <h3>Second Slide</h3>
                    <p>This is a description for the second slide.</p>
                </div>
            </div>
            <!-- Slide Three - Set the background image for this slide in the line below -->
            <div class="carousel-item" style="background-image: url('https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1508595894382&di=d57e201a36a9dda9a285821954315a17&imgtype=0&src=http%3A%2F%2Fyzhtml01.book118.com%2F2016%2F12%2F15%2F03%2F51638095%2F1.png')">
                <div class="carousel-caption d-none d-md-block">
                    <h3>Third Slide</h3>
                    <p>This is a description for the third slide.</p>
                </div>
            </div>
        </div>
        <#--<a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">-->
            <#--<span class="carousel-control-prev-icon" aria-hidden="true"></span>-->
            <#--<span class="sr-only">Previous</span>-->
        <#--</a>-->
        <#--<a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">-->
            <#--<span class="carousel-control-next-icon" aria-hidden="true"></span>-->
            <#--<span class="sr-only">Next</span>-->
        <#--</a>-->
    </div>
</header>
<#-- e-slide-header-->

<!-- Page Content -->
<section class="py-5">
    <div class="container container-fluid">
        <h1>Full Slider by Start Bootstrap</h1>
        <p>The background images for the slider are set directly in the HTML using inline CSS. The rest of the styles
            for this template are contained within the
            <code>full-slider.css</code>file.</p>
    </div>
</section>

<#-- s-footer -->
<#include "public/footer.ftl">
<#-- e-footer -->

<#-- JS -->
<#include "public/front_js.ftl">
</body>
</html>
