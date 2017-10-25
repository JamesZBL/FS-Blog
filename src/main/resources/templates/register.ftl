<!DOCTYPE html>
<html lang="cn">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>${title!'全栈之路-注册'}</title>

  <!-- Bootstrap core CSS-->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="css/sb-admin/sb-admin.css" rel="stylesheet">
</head>

<body class="bg-dark">
  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">Full-Stack</div>
      <div class="card-body">
        <form>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="id_username">用户名</label>
                <input class="form-control" id="id_username" type="text" aria-describedby="nameHelp" placeholder="Enter Username" name="username">
              </div>
              <div class="col-md-6">
                <label for="id_nickname">昵称</label>
                <input class="form-control" id="id_nickname" type="text" aria-describedby="nameHelp" placeholder="Enter Nickname" name="nickname">
              </div>
            </div>
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="id_password">密码</label>
                <input class="form-control" id="id_password" type="password" placeholder="Password" name="password">
              </div>
              <div class="col-md-6">
                <label for="id_confirm_password">确认密码</label>
                <input class="form-control" id="id_confirm_password" type="password" placeholder="Confirm password" name="confirmpassword">
              </div>
            </div>
          </div>
          <a class="btn btn-primary btn-block" href="userregister">立即注册</a>
        </form>
        <div class="container text-center mt-3">
          <div class="row text-right">
            <a class="d-block small col-sm" href="userlogin">已有账号?立即登录</a>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <#-- 自定义js -->
  <script src="js/f_register.js"></script>
</body>

</html>
