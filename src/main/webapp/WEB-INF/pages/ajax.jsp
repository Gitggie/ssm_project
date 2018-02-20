<%--
  Created by IntelliJ IDEA.
  User: WuLei
  Date: 2018/2/2
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax</title>
    <script>
        //点击按钮“修改内容”会调用此函数
        function loadXMLDoc() {
            //定义一个xmlhttp变量
            var xmlhttp;
            // code for IE7+, Firefox, Chrome, Opera, Safari
            if (window.XMLHttpRequest) {
                //创建一个新的XMLHttpRequest对象,XMLHttpRequest 是 AJAX 的基础。所有现代浏览器均支持 XMLHttpRequest 对象（IE5 和 IE6 使用 ActiveXObject）。
                //XMLHttpRequest 用于在后台与服务器交换数据。这意味着可以在不重新加载整个网页的情况下，对网页的某部分进行更新。
                xmlhttp = new XMLHttpRequest();
            }
            // code for IE6, IE5
            else {
                //创建一个新的ActiveXObject对象
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
            //当请求被发送到服务器时，我们需要执行一些基于响应的任务。
            //每当 readyState 改变时，就会触发 onreadystatechange 事件。
            //readyState 属性存有 XMLHttpRequest 的状态信息。
            //onreadystatechange 存储函数（或函数名），每当 readyState 属性改变时，就会调用该函数。
            xmlhttp.onreadystatechange = function () {
                if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                    //responseText	获得字符串形式的响应数据
                    document.getElementById("myDiv").innerHTML = xmlhttp.responseText;
                }
            }
            //如需将请求发送到服务器，我们使用 XMLHttpRequest 对象的 open() 和 send() 方法：
            xmlhttp.open("POST", "", true);
            xmlhttp.send();

        }
    </script>
</head>
<body>
<%--div 部分用于显示来自服务器的信息。当按钮被点击时，它负责调用名为 loadXMLDoc() 的函数--%>
<div id="myDiv"><h2>使用 AJAX 修改该文本内容</h2></div>
<button type="button" onclick="loadXMLDoc()">修改内容</button>
</body>
</html>
