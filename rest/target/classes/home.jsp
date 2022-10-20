<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
</head>

<body style="text-align: center;" >
    <br><br><br><br><br><br>
    <h1>Welcome</h1><br>
    <form action="add" class=".form-control-large">
        <input type="text" name="id" class=".form-control-large"><br>
        <input type="text" name="name"><br>
        <input type="submit" value="Add Alien" class="btn btn-success">
    </form>
    <br>
    <br>
    <form action="update">
            <input type="text" name="id"><br>
            <input type="text" name="name"><br>
            <input type="submit" value="Update Alien" class="btn btn-warning">
        </form>
        <br>
        <br>
    <form action="fetch">
            <input type="text" name="id"><br>
            <input type="submit" value="Fetch Alien" class="btn btn-warning">
    </form>
    <br><br>
    <form action="delete">
                <input type="text" name="id"><br>
                <input type="submit" value="Delete Alien" class="btn btn-danger">
    </form>
</body>

</html>