<%--
  Created by IntelliJ IDEA.
  User: gfire
  Date: 2020-11-15
  Time: 오후 5:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <style>
        .login-wrapper {
            width: fit-content;
            height: fit-content;
            margin: 0 auto;
            top:20vh;
            position: relative;
            border: 1px solid black;
            box-sizing: border-box;
            padding: 50px;
        }
    </style>
</head>
<body>
    <div class="login-wrapper">
        <p>ID: <input type="text" id="userId" name="userId"></p>
        <p>PW: <input type="text" id="userPw" name="userPw"></p>
        <button onclick="login()" class="btn btn-secondary" style="float: right">Login</button>
    </div>

    <script>

        function login() {
            var id = $('#userId').val();
            var pw = $('#userPw').val();

            console.log(id);
            console.log(pw);

            $.ajax({
                url: '/login/loginRequest',
                type: 'POST',
                data: {userId: id, userPw: pw},
                dataType: "json",
                success : function (res) {
                    console.log(res)
                }, error : function(error) {
                    console.log('error')
                    console.log(error)
                },
                complete : function() {
                    console.log('complete!')
                    alert("complete!");
                }
            });


        }
        console.log($)
    </script>
</body>
</html>
