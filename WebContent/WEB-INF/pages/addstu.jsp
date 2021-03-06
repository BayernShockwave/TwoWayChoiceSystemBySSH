<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
  <head>
  <meta charset="utf-8">
     <title>添加学生</title>
     <style>
        .smart-green {
            margin-left: auto;
            margin-right: auto;
            max-width: 500px;
            background: #F8F8F8;
            padding: 30px 30px 20px 30px;
            font: 12px Arial, Helvetica, sans-serif;
            color: #666;
            border-radius: 5px;
            -webkit-border-radius: 5px;
            -moz-border-radius: 5px;
        }

        .smart-green h1 {
            font: 24px "Trebuchet MS", Arial, Helvetica, sans-serif;
            padding: 20px 0px 20px 40px;
            display: block;
            margin: -30px -30px 10px -30px;
            color: #FFF;
            background: #9DC45F;
            text-shadow: 1px 1px 1px #949494;
            border-radius: 5px 5px 0px 0px;
            -webkit-border-radius: 5px 5px 0px 0px;
            -moz-border-radius: 5px 5px 0px 0px;
            border-bottom: 1px solid #89AF4C;
        }

        .smart-green h1 > span {
            display: block;
            font-size: 11px;
            color: #FFF;
        }

        .smart-green label {
            display: block;
            margin: 0px 0px 5px;
        }

        .smart-green label > span {
            float: left;
            margin-top: 10px;
            color: #5E5E5E;
        }

        .smart-green input[type="text"], .smart-green input[type="email"], .smart-green textarea, .smart-green select {
            color: #555;
            height: 30px;
            line-height: 15px;
            width: 100%;
            padding: 0px 0px 0px 10px;
            margin-top: 2px;
            border: 1px solid #E5E5E5;
            background: #FBFBFB;
            outline: 0;
            -webkit-box-shadow: inset 1px 1px 2px rgba(238, 238, 238, 0.2);
            box-shadow: inset 1px 1px 2px rgba(238, 238, 238, 0.2);
            font: normal 14px/14px Arial, Helvetica, sans-serif;
        }

        .smart-green textarea {
            height: 100px;
            padding-top: 10px;
        }


        .smart-green .button {
            background-color: #9DC45F;
            border-radius: 5px;
            -webkit-border-radius: 5px;
            -moz-border-border-radius: 5px;
            border: none;
            padding: 10px 25px 10px 25px;
            color: #FFF;
            text-shadow: 1px 1px 1px #949494;
        }

        .smart-green .button:hover {
            background-color: #80A24A;
        }

        .error-msg{
            color: red;
            margin-top: 10px;
        }
        .success-msg{
            color: #80A24A;
            margin-top: 10px;
            margin-bottom: 10px;
        }
    </style>
   </head>
   <body>
    
   <form action="save" method="post" class="smart-green">
     <input type=hidden name="operation" value="update"/>
    <h1>添加学生
        <span>添加学生信息</span>
    </h1>
     <label>
        <span>学号:</span>
        <input id="sno" type="text" name="sno" value="${s.sno}" />
    </label>
    
    <label>
        <span>密码:</span>
        <input id="spwd" type="text" name="spwd" value="${s.spwd}" />
    </label>

    <label>
        <span>姓名 :</span>
        <input id="sname" type="text" name="sname" value="${s.sname}" />
    </label>

    <label>
        <span>学院:</span>
        <input id="scol" type="text"  name="scol" value="${s.scol}"/>
    </label>
    
    <label>
        <span>专业:</span>
        <input id="sdis" type="text"  name="sdis" value="${s.sdis}"/>
    </label>
    
    <label>
        <span>方向:</span>
        <input id="shob" type="text"  name="shob" value="${s.shob}"/>
    </label>

    <label>
        <span>&nbsp;</span>
        <input type="submit" class="button" value="提交"/>
    </label>
</form>
   </body>
</html>