<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="#">Full-Stack</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="/index">首页</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">博客</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"></a>
                </li>
            <#--<li class="nav.ftl-item">-->
            <#--<a class="nav.ftl-link" href="#">${(Session.cur_user.username)!'登录'}</a>-->
            <#--</li>-->
            <#if userinfo??>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button"
                       aria-haspopup="true" aria-expanded="false">${(userinfo.username)!'登录'}</a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="#">我的资料</a>
                        <a class="dropdown-item" href="#">写博客</a>
                        <a class="dropdown-item" href="#">消息</a>
                        <a class="dropdown-item" href="#">草稿箱</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="userregister">注册</a>
                        <a class="dropdown-item" href="usersignout.c">注销登录</a>
                    </div>
                </li>
            <#else>
                <li class="nav-item">
                    <a class="nav-link" href="userregister">注册</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="userlogin">登录</a>
                </li>
            </#if>
            </ul>
        </div>
    </div>
</nav>