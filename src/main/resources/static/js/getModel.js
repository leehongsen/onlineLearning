$.ajax({
    async: false,
    url: "/OnlineLearning/selectModel",
    success: function (data) {
        var text = "";
        console.log(data);
        var flag = 0;
        $.each(data, function (i, test) {
            if (test.parMod == 0) {
                flag = i;
                text = " <li class=\"layui-nav-item";
                if(flag!=0){
                    text+=" layui-nav-itemed";
                }
                text+="\">\n" +
                    "<a href=\"javascript:;\"><i class=\"fa fa-plug\" aria-hidden=\"true\"></i><span>"+test.modName+"</span></a>\n" +
                    "<dl class=\"layui-nav-child\" id='imp"+flag+"'></dl>\n" +
                    "</li>";
                $("#model").append(text);
            } else {
                text = "<dd><a href=\"javascript:;\" kit-target=\"kit-target\" data-options=\"{url:'/OnlineLearning/"+test.modUrl+"',icon:'&#xe658;',title:'" + test.modName + "',id:'menu"+
                    i+"'}\">\n" +
                    "<i class=\"layui-icon\">&#xe658;</i><span>" + test.modName + "</span></a></dd>";
                var a = "#imp" + flag;
                $(a).append(text);
            }
        });
        //菜单列表html

    }
});