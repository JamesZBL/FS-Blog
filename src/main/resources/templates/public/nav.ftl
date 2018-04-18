<!-- Navigation -->
<nav class="navbar navbar-expand-xl navbar-dark bg-dark fixed-top">
    <div class="container-fluid">
    <#-- Logo 位置 -->
        <img class="mr-3" alt="Logo"
             src="/img/logo.png" style="max-width: 30px">
        <a class="navbar-brand" href="#">
            FS-Blog
        </a>
    <#-- 响应式导航下拉按钮 -->
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
        <#-- s 左侧导航 -->
            <ul class="nav navbar-nav">
                <li class="nav-item">
                    <a class="nav-link"><#-- 占位 --></a>
                </li>
                <li class="nav-item <#if page_index?? && page_index == 0>active</#if>">
                    <a class="nav-link" href="/">首页</a>
                </li>
                <li class="nav-item <#if page_index?? && page_index == 1>active</#if>">
                    <a class="nav-link" href="/post">博客</a>
                </li>
                <li class="nav-item <#if page_index?? && page_index == 2>active</#if>">
                    <a class="nav-link" href="/resume">关于</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"></a>
                </li>
            </ul>
        <#-- e 左侧导航 -->
        <#-- s 右侧导航 -->
            <ul class="nav navbar-nav ml-auto">
            <#if Session ["session_current_user"]??>
                <li class="nav-item">
                <#-- 用户头像位置 -->
                    <img class="img-circle"
                         src="/img/logo.png"
                         alt="头像"
                         style="max-width: 30px;"/>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button"
                       aria-haspopup="true" aria-expanded="false">${Session ["session_current_user"].username!'登录'}<span
                            class="caret"></span></a>
                    <div class="dropdown-menu dropdown-menu-right">
                        <a class="dropdown-item" href="#">我的资料</a>
                        <a class="dropdown-item" href="#">消息</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="/usersignout.c">注销登录</a>
                    </div>
                </li>
            <#else>
                <li class="nav-item">
                    <a class="nav-link" href="/userregister">注册</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/userlogin">登录</a>
                </li>
            </#if>
            </ul>
        <#-- e 右侧导航 -->
        </div>
    </div>
</nav>