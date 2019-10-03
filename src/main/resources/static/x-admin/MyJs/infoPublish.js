var pageUrl = "/infoPublish/page.html";
var deleteUrl = "/infoPublish/delete.html";
var updateUrl = "/infoPublish/update.html";

$(function(){
	queryFY();
});

/**
 * 填充表格数据
 * @param pageInfo  ajax返回的参数信息
 */
function showTable(pageInfo) {
    var total = pageInfo.totalPages;//页总数
    var pageNum = parseFloat(pageInfo.number)+1;//页号
    var pageSize = pageInfo.size;//页大小

    var users = pageInfo.content;
    $("#tbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_1 = users.length;i<length_1;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr = "<tr>"
            +'<td>'+index+'</td>'
            +'<td>'+replaceNull(users[i].farmStatus)+'</td>'
            +'<td>'+replaceNull(users[i].stickPigInfo)+'</td>'
            +'<td>'+replaceNull(users[i].unpassPigNumber)+'</td>'
            +'<td>'+replaceNull(users[i].unpassPigReason)+'</td>'
            +'<td>';
	        if(isAdmin()){
	        	tr+='<a href=javascript:void(0) title="修改" onclick="update('+users[i].id+', 800, 400)"><i class="layui-icon">&#xe642;</i></a>'
	        		+'<a href=javascript:void(0) title="删除" onclick="remove('+users[i].id+')"><i class="layui-icon">&#xe640;</i></a>'
	        }
            
        	tr +='</td></tr>'
        		
        $("#tbody").append(tr);
    }

    //开启分页组件
    showPage(total, pageNum, pageSize);
}