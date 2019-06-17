<#include "/layout/header.ftl">
<body>
        <div class="" >
            <div>
                <div class="" id="title" style="font-size:30px;width:100%;background-color: #0d6aad;height: 40px;padding-left: 260px;padding-top: 10px">

                </div>
                <div class=""  style="font-size:20px;width:100%;background-color: #0d6aad;height: 40px;padding-left: 600px;padding-top: 10px">
                    作者:  <span id="author"></span>
                </div>
            </div>

            <div style="width: 1000px;position: absolute;left: 50%;margin-left: -500px;margin-bottom: 60px;" id="content">

            </div>
            <div class="" style="position:fixed;bottom: 0; background-color:lightgrey;width: 100%;height: 60px">
                1
            </div>
        </div>
</body>
<#include "/layout/footer.ftl">
<script>
    $(function () {
        $.ajax({
            type: "Get",
            url: "/blogContent/data/${id}",
            success: function(res){
                debugger
                $("#content").append(res.data.content);
                $("#author").text(res.data.author);
                $("#title").text(res.data.title);
            }
        });
    })
</script>
