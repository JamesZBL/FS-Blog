<#-- s 导航（顶部、左侧）-->
<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">

<#-- s 导航左侧 -->
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="index.html">Full-Stack 系统后台管理</a>
    </div>
<#-- e 导航左侧-->

<#-- s 导航右侧 -->
    <ul class="nav navbar-top-links navbar-right">
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-user">
                <#--<li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>-->
                <#--</li>-->
                <li><a href="/admin/admin_user_pwd_modify"><i class="fa fa-gear fa-fw"></i> 修改密码</a>
                </li>
                <li class="divider"></li>
                <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> 注销登录</a>
                </li>
            </ul>
            <!-- /.dropdown-user -->
        </li>
        <!-- /.dropdown -->
    </ul>
<#-- e 导航右侧-->

<#-- s 侧边栏 -->
    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <ul class="nav" id="side-menu">
                <li>
                    <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> 博客管理<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="/admin/blogadd"> 博客发布</a>
                        </li>
                        <li>
                            <a href="/admin/blogmanage"> 博客批量管理</a>
                        </li>
                    </ul>
                    <!-nav.ftl.nav-second-level -->
                </li>
                <li>
                    <a href="/admin/resume_modify"><i class="fa fa-table fa-fw"></i> 简历管理</a>
                </li>
                <li>
                    <a href="/admin/admin_user_manage"><i class="fa fa-edit fa-fw"></i> 用户管理</a>
                </li>
            </ul>
        </div>
        <!-- /.sidebar-collapse -->
    </div>
<#-- e 侧边栏 -->
</nav>
<#-- e 导航（顶部、左侧）-->