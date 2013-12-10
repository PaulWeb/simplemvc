<html>
    <head>
    </head>
    <body>
        <form method="POST">
            <input type="text" name="name"/>
            <button type="submit">Set Name</button>
        </form>
        <br>
        <label>User name from session:</label>${user.name!""}<br>
        <label>User class is ${user.class} </label>
            
    </body>
</html>