<#include "/layout/header.ftl">
<style>
    html,
    body {
        height: 100%;
    }

    body {
        display: -ms-flexbox;
        display: -webkit-box;
        display: flex;
        -ms-flex-align: center;
        -ms-flex-pack: center;
        -webkit-box-align: center;
        align-items: center;
        -webkit-box-pack: center;
        justify-content: center;
        padding-top: 40px;
        padding-bottom: 40px;
        background-color: #f5f5f5;
    }

    .form-signin {
        width: 100%;
        max-width: 330px;
        padding: 15px;
        margin: 0 auto;
    }
    .form-signin .checkbox {
        font-weight: 400;
    }
    .form-signin .form-control {
        position: relative;
        box-sizing: border-box;
        height: auto;
        padding: 10px;
        font-size: 16px;
    }
    .form-signin .form-control:focus {
        z-index: 2;
    }
    .form-signin input[type="email"] {
        margin-bottom: -1px;
        border-bottom-right-radius: 0;
        border-bottom-left-radius: 0;
    }
    .form-signin input[type="password"] {
        margin-bottom: 10px;
        border-top-left-radius: 0;
        border-top-right-radius: 0;
    }
</style>
<body id="skin-blur-violate">
<body class="text-center" style="margin-top: -100px;">
<form class="form-signin" action="/login">
    <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
    <label for="name" class="sr-only">Email address</label>
    <input type="email" id="name" name="name" class="form-control" placeholder="Email address" required autofocus>
    <label for="password" class="sr-only">Password</label>
    <input type="password" id="password" name="password" class="form-control" placeholder="Password" required>
    <div class="checkbox mb-3">
        <label>
            <input type="checkbox" value="remember-me"> Remember me
        </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" onclick="submit()">Sign in</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2018-2019</p>
</form>
</body>

</body>
<#include "/layout/footer.ftl">
<script>
    var superAd;
    $(function () {
        superAd = new superAd();
    })
    function submit(){
        superAd.get("form-signin").superAjax(function (res) {
            debugger
            if (res.success) {
                window.location.href = "/index"
            } else {
                layer.tips(res.message, '#username');
            }
        });
    }

    function superAd(){
        this.id = "";
        this.get = function(res){
            this.id = res;
            return this;
        };
        this.superAjax = function (callback) {
            var data = {};
            $.each($("#"+this.id +"> input"),function (i,obj) {
                data[$(obj).attr("name")] = $(obj).val();
            });
            var method = $("#"+this.id).attr("method");
            var url = $("#"+this.id).attr("action");
            $.ajax({
                url: url,
                data: data,
                type: "POST",
                success: callback
            })
        }

    }
</script>