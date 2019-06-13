<#include "/layout/header.ftl">
<body>
    <div class="container-fluid">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        66后台管理系统
                        <small>只为66</small>
                    </h1>
                </div>
            </div>
        </div>
        <div class="row clearfix">
            <div class="col-md-2 column">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            目录
                        </h3>
                    </div>
                    <div class="panel-body">
                        blog列表
                    </div>

                </div>
            </div>
            <div class="col-md-1 column">
            </div>
            <div class="col-md-9 column">
                <table id="grid-table" data-height="460" class="col-xs-12" data-toolbar="#toolbar">

                </table>
            </div>
        </div>
    </div>
</body>
<#include "/layout/footer.ftl">
<script>
    debugger
    var $gride = $('#grid-table');
    initTable()
    function initTable() {
        $gride.bootstrapTable({
            method: 'get',
            toolbar: '#toolbar',    //工具按钮用哪个容器
            striped: true,      //是否显示行间隔色
            cache: false,      //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,     //是否显示分页（*）
            sortable: false,      //是否启用排序
            sortOrder: "asc",     //排序方式
            pageNumber: 1,      //初始化加载第一页，默认第一页
            pageSize: 10,      //每页的记录行数（*）
            pageList: [10, 25, 50, 100],  //可供选择的每页的行数（*）
            url: "/blogContent/list",//这个接口需要处理bootstrap table传递的固定参数
            queryParamsType: '', //默认值为 'limit' ,在默认情况下 传给服务端的参数为：offset,limit,sort
            // 设置为 ''  在这种情况下传给服务器的参数为：pageSize,pageNumber

            //queryParams: queryParams,//前端调用服务时，会默认传递上边提到的参数，如果需要添加自定义参数，可以自定义一个函数返回请求参数
            sidePagination: "server",   //分页方式：client客户端分页，server服务端分页（*）
            //search: true,      //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            strictSearch: true,
            //showColumns: true,     //是否显示所有的列
            //showRefresh: true,     //是否显示刷新按钮
            minimumCountColumns: 2,    //最少允许的列数
            clickToSelect: true,    //是否启用点击选中行
            searchOnEnterKey: true,
            columns: [{
                field: 'title',
                title: '标题',
                align: 'center'
            }, {
                field: 'author',
                title: '作者',
                align: 'center'
            }, {
                field: 'modifyTime',
                title: '更新时间',
                align: 'center'
            }, {
                field: 'createTime',
                title: '创建时间',
                align: 'center'
            },{
                field: 'id',
                title: '操作',
                align: 'center',
                formatter: function (value, row, index) {
                    //通过formatter可以自定义列显示的内容
                    //value：当前field的值，即id
                    //row：当前行的数据
                    debugger
                    var a = '<a href="" >查看详情</a>';
                    return a;
                }
            }],
            pagination: true
        });
    }
</script>