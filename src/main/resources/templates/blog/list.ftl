<#include "/layout/top.ftl">
<form class="bs-example bs-example-form boder-top" role="form">
    <div class="input-group">
        <span class="input-group-addon">标题</span>
        <input type="text" id="searchTitle" class="form-control" style="width: 120px">
        <button type="button" onclick="search()" class="btn btn-primary" style="margin-left: 200px">搜索</button>
    </div>

</form>
<table id="grid-table"
       class="col-xs-12"
       data-row-attributes="rowAttributes">

</table>
<#include "/layout/bootom.ftl">
<script>
    var $gride = $('#grid-table');
    initTable()
    function initTable() {
        var columns = [{
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
                var url = "/blogContent/get/"+ value;
                return '<a href='+url+' >查看详情</a>';
            }
        }];
        tableParam.url= "/blogContent/listData";
        tableParam.columns = columns;
        $gride.bootstrapTable(tableParam);
    }
    function rowAttributes(row, index) {
        return {
            'data-toggle': 'popover',
            'data-placement': 'bottom',
            'data-trigger': 'hover'
            // ,
            // 'data-content': [
            //     'Index: ' + index,
            //     'ID: ' + row.id,
            //     'Name: ' + row.name,
            //     'Price: ' + row.price
            // ].join(', ')
        }
    }
    function search(){
        var title = $("#searchTitle").val();

    }

    $(function() {
        $('#grid-table').on('post-body.bs.table', function (e) {
            $('[data-toggle="popover"]').popover()
        })
    })
</script>