var tableParam = {
    method: 'get',
    height: 460,
    toolbar: '#toolbar',    //工具按钮用哪个容器
    pagination: true,
    cache: false,      //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
    queryParamsType: '', //默认值为 'limit' ,在默认情况下 传给服务端的参数为：offset,limit,sort
    //search: true,      //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
    strictSearch: true,
    showRefresh: false     //是否显示刷新按钮
}