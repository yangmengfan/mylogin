<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/plugins/bootstrap/bootstrap.min.css">
    <script src="/plugins/jquery/jquery-3.3.1.min.js"></script>
    <script src="/plugins/bootstrap/bootstrap.min.js"></script>
    <link href="/plugins/superadmin/css/bootstrap.min.css" rel="stylesheet">
    <link href="/plugins/superadmin/css/form.css" rel="stylesheet">
    <link href="/plugins/superadmin/css/style.css" rel="stylesheet">
    <link href="/plugins/superadmin/css/animate.css" rel="stylesheet">
    <link href="/plugins/superadmin/css/generics.css" rel="stylesheet">
</head>
<body>
    <div class="container-fluid" style="margin-top: 13%;overflow: hidden">
        <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-4">
                <div class="jumbotron">
                    <form class="form-horizontal" role="form" style="height: 200px">
                        <div class="form-group">
                            <label for="username" class="col-sm-2 control-label">账号</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="username" placeholder="请输入账号">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="password" class="col-sm-2 control-label">密码</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="password" placeholder="密码">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-12">
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox">请记住我
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-default">登录</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="col-md-4"></div>
        </div>
    </div>

</body>
</html>