<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>F6系统</title>
    <link rel="stylesheet" type="text/css" href="/WEB-INF/css/layout.css">
<%--    <style type="text/css">--%>
<%--        .background{--%>
<%--            margin:0;--%>
<%--            padding:20px 30px ;--%>
<%--            overflow: auto;--%>
<%--            background:url(WEB-INF/img/雪景.jpg) no-repeat 0 0;--%>
<%--            background-size: 100% 100%;--%>
<%--        }--%>
<%--        ._up{--%>
<%--            border-bottom: 2px solid  #D4D4D4;--%>
<%--            width:100%;--%>
<%--            height: 30%;--%>
<%--            float:left;--%>
<%--            text-align: center;--%>
<%--        }--%>
<%--        ._left{--%>
<%--            margin: 0;--%>
<%--            border-right: 2px solid #D4D4D4;--%>
<%--            width: 30%;--%>
<%--            height: 70%;--%>
<%--            float: left;--%>
<%--        }--%>
<%--        ._right{--%>
<%--            margin: 0;--%>
<%--            width:70%;--%>
<%--            height:70%;--%>
<%--        }--%>
<%--        #login{--%>
<%--            float: right;--%>
<%--            width: 80px;--%>
<%--            height: 80px;--%>
<%--        }--%>
<%--        #center_layout{--%>
<%--            align-items: center;--%>
<%--            border-radius: 25px;--%>

<%--        }--%>
<%--    </style>--%>
</head>
<body>
<div class="background">
    <div class="_up">
        <h1>F6系统</h1>
        <form id="login">
            <table border="1">
                <tr onclick="">
                    <th>登录</td>
                </tr>
                <tr onclick="">
                    <td>注册</td>
                </tr>
                <tr onclick="">
                    <td>忘记密码</td>
                </tr>
            </table>
        </form>
    </div>
    <div class="_left">
    </div>
    <div class="_right">
        <form action="/myWeb/test.do">
            <table border="1">
                <tr>
                    <td>用户:</td>
                    <td>
                        <input type="text" name="user">
                    </td>
                </tr>
                <tr>
                    <td>密码:</td>
                    <td><input type="text" name="password"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="提交"></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>