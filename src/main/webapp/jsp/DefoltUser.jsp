<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Time Page</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            text-align: center;
        }

        h1 {
            color: #333;
        }

        img {
            max-width: 100%;
            height: auto;
            margin-top: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        p {
            margin-top: 20px;
            color: #555;
        }
    </style>
</head>
<body>
<h1><%= new java.util.Date() %></h1>
<p>Default User</p>
<img src="https://mr-7.ru/static/records/3a2ae8fbde53448db559bddb31d3df29.webp" alt="Default User Image">
</body>
</html>
