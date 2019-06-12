<#include "/layout/header.ftl">
<body id="skin-blur-violate">
<section id="login">
    <header>
        <h1>my backstage</h1>
        <h3>create this project to learn more about computer</h3>
    </header>

    <div class="clearfix"></div>

    <!-- Login -->
    <form class="box tile animated active" action="//login" id="box-login">
        <h2 class="m-t-0 m-b-15">Login</h2>
        <input type="text" name="username" class="login-control m-b-10" placeholder="Username or Email Address">
        <input type="password" name="password" class="login-control" placeholder="Password">
        <div class="checkbox m-b-20">
            <label>
                <input type="checkbox">
                Remember Me
            </label>
        </div>
        <button  class="btn btn-sm m-r-5">Sign In</button>

        <small>
            <a class="box-switcher" data-switch="box-register" href="">Don't have an Account?</a> or
            <a class="box-switcher" data-switch="box-reset" href="">Forgot Password?</a>
        </small>
    </form>

    <!-- Register -->
    <form class="box animated tile" id="box-register">
        <h2 class="m-t-0 m-b-15">Register</h2>
        <input type="text" class="login-control m-b-10" placeholder="Full Name">
        <input type="text" class="login-control m-b-10" placeholder="Username">
        <input type="email" class="login-control m-b-10" placeholder="Email Address">
        <input type="password" class="login-control m-b-10" placeholder="Password">
        <input type="password" class="login-control m-b-20" placeholder="Confirm Password">

        <button class="btn btn-sm m-r-5">Register</button>

        <small><a class="box-switcher" data-switch="box-login" href="">Already have an Account?</a></small>
    </form>

    <!-- Forgot Password -->
    <form class="box animated tile" id="box-reset">
        <h2 class="m-t-0 m-b-15">Reset Password</h2>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla eu risus. Curabitur commodo lorem fringilla enim feugiat commodo sed ac lacus.</p>
        <input type="email" class="login-control m-b-20" placeholder="Email Address">

        <button class="btn btn-sm m-r-5">Reset Password</button>

        <small><a class="box-switcher" data-switch="box-login" href="">Already have an Account?</a></small>
    </form>
</section>
</body>
<#include "/layout/footer.ftl">