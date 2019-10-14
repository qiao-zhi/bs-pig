var pageUrl = "/report/report7Data.html";
var deleteUrl = "/farm/delete.html";
var updateUrl = "/farm/update.html";

$(function(){
	queryFY();
});

/**
 * 填充表格数据
 * @param pageInfo  ajax返回的参数信息
 */
function showTable(pageInfo) {
    var total = pageInfo.total;//页总数
    var pageNum = pageInfo.pageNum;//页号
    var pageSize = pageInfo.pageSize;//页大小

    var users = pageInfo.list;
    $("#tbody").html("");//清空表格中数据并重新填充数据

    var users = pageInfo.list;
    $("#tbody").html("");//清空表格中数据并重新填充数据
    for(var i=0,length_1 = users.length;i<length_1;i++){
        var index = (pageNum - 1) * pageSize + i + 1;
        var tr = "<tr>"
            +'<td>'+index+'</td>'
            +'<td>'+replaceNull(users[i].name)+'</td>'
            +'<td>'+replaceNull(users[i].address)+'</td>'
            +'<td>'+replaceNull(users[i].network)+'</td>'
            +'<td>'+replaceNull(users[i].companycode)+'</td>'
            +'<td>'+replaceNull(users[i].type)+'</td>'
            +'<td>'+replaceNull(users[i].manager_name)+'</td>'
            +'<td>'+replaceNull(users[i].manager_number)+'</td>'
            +'<td>'+replaceNull(users[i].manager_phone)+'</td>'
            +'<td>'+replaceNull(users[i].remark1)+'</td>'
            +'<td>'+replaceNull(users[i].remark2)+'</td>'
            +'<td>'+replaceNull(users[i].remark3)+'</td>'
            +'<td>';
	        if(isAdmin()){
	        	tr+='<a href=javascript:void(0) title="修改" onclick="update('+users[i].id+', 800, 400)"><i class="layui-icon">&#xe642;</i></a>'
	        		+'<a href=javascript:void(0) title="删除" onclick="remove('+users[i].id+')"><i class="layui-icon">&#xe640;</i></a>'
	        }
            
        	tr +='</td></tr>'
        		
        $("#tbody").append(tr);
        	
    	if (i == 2) {
    		break;
    	}
    }

    //开启分页组件
//    showPage(total, pageNum, pageSize);
}