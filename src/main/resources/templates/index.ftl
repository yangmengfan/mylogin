<#include "/layout/header.ftl">
<body>
    <div class="container-fluid" >
        <div class="row-fluid">
            <div class="col-md-2">
                <form class="form-search">
                    <input class="input-medium search-query" type="text"/>
                    <button type="submit" class="btn">查找</button>
                </form>
                <ul class="nav" style="background: -webkit-linear-gradient(left,lightgray,gainsboro,lightgray);box-shadow: 10px 10px 5px #888888;">
                    <li class="nav-header">
                        列表标题
                    </li>
                    <li class="active">
                        <a href="#">首页</a>
                    </li>
                    <li>
                        <a href="#">库</a>
                    </li>
                    <li>
                        <a href="#">应用</a>
                    </li>
                </ul>
            </div>
            <div class="col-md-10" style="margin-top: 30px">
                <ul class="thumbnails">
                    <li class="span4">
                        <div class="thumbnail">
                            <img alt="300x200" src="img/people.jpg"/>
                            <div class="caption">
                                <h3>
                                    冯诺尔曼结构
                                </h3>
                                <p>
                                    也称普林斯顿结构，是一种将程序指令存储器和数据存储器合并在一起的存储器结构。程序指令存储地址和数据存储地址指向同一个存储器的不同物理位置。
                                </p>
                                <p>
                                    <a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">分享</a>
                                </p>
                            </div>
                        </div>
                    </li>

                </ul>
            </div>
        </div>
    </div>
</body>
<#include "/layout/footer.ftl">