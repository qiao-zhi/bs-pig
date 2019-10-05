function initReport3(){
	$.post("/report/report3Data.html",function (response){
		 var option = createOption3(response);
		 var myChart = echarts.init(document.getElementById('main'));
		// 使用刚指定的配置项和数据显示图表。
	    myChart.setOption(option);
	});
}

function createOption3(response){
	// 指定图表的配置项和数据
	option = {
		    title : {
		        text: '瘟疫率占比图',
		        subtext: '',
		        x:'center'
		    },
		    tooltip : {
		        trigger: 'item',
		        formatter: "{a} <br/>{b} : {c} ({d}%)"
		    },
		    legend: {
		        orient: 'vertical',
		        left: 'left',
		    },
		    series : [
		        {
		            name: '瘟疫率',
		            data : [{name:"无",value:1}],
		            type: 'pie',
		            radius : '55%',
		            center: ['50%', '60%'],
		            itemStyle: {
		                emphasis: {
		                    shadowBlur: 10,
		                    shadowOffsetX: 0,
		                    shadowColor: 'rgba(0, 0, 0, 0.5)'
		                }
		            }
		        }
		    ]
	};

	if(response && response.length>0){
		option.series[0].data = response;
	}
	return option;
}

function initReport2(){
	$.post("/report/report2Data.html",function (response){
		var option = createOption(response);
		var myChart = echarts.init(document.getElementById('main'));
		// 使用刚指定的配置项和数据显示图表。
		myChart.setOption(option);
	});
}

function createOption(response){
	// 指定图表的配置项和数据
	option = {
		    title : {
		        text: '合格率占比图',
		        subtext: '',
		        x:'center'
		    },
		    tooltip : {
		        trigger: 'item',
		        formatter: "{a} <br/>{b} : {c} ({d}%)"
		    },
		    legend: {
		        orient: 'vertical',
		        left: 'left',
		    },
		    series : [
		        {
		            name: '合格率',
		            data : [{name:"无",value:1}],
		            type: 'pie',
		            radius : '55%',
		            center: ['50%', '60%'],
		            itemStyle: {
		                emphasis: {
		                    shadowBlur: 10,
		                    shadowOffsetX: 0,
		                    shadowColor: 'rgba(0, 0, 0, 0.5)'
		                }
		            }
		        }
		    ]
	};

	if(response && response.length>0){
		option.series[0].data = response;
	}
	return option;
}

function initReport1(){
	$.post("/report/report1Data.html",function (response){
		 var option = createHotReportOption(response);
		 var myChart = echarts.init(document.getElementById('main'));
		// 使用刚指定的配置项和数据显示图表。
	    myChart.setOption(option);
	});
}

function createHotReportOption(response){
	option = {
		    title: {
		        text: '热量对比图'
		    },
		    tooltip: {
		        trigger: 'axis'
		    },
		    legend: {
		        data:['摄入热量','消耗热量','剩余热量']
		    },
		    grid: {
		        left: '3%',
		        right: '4%',
		        bottom: '3%',
		        containLabel: true
		    },
		    toolbox: {
		        feature: {
		            saveAsImage: {}
		        }
		    },
		    xAxis: {
		        type: 'category',
		        boundaryGap: false,
		        data: ["no"]
		    },
		    yAxis: {
		        type: 'value'
		    },
		    series: [
		        {
		            name:'检疫合格率',
		            type:'line',
		            data:[0]
		        }
		    ]
		};
	
	if(response && response.XAxis){
		option.xAxis.data = response.XAxis;
	}
	if(response && response.YAxis){
		option.series[0].data = response.YAxis;
	}
	return option;
}

