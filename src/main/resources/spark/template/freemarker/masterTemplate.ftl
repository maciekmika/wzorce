<#macro masterTemplate title="Welcome">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>${title} | MiniTwit</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>

<div class="container-fluid" id="menu-top">
    <div class="row justify-content-md-center">
        <div class="col">
            <div class="container">
                <nav class="navbar navbar-expand-lg navbar-light bg-light">
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <#if user??>
                            <ul class="navbar-nav mr-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="/">Home</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="/addNewFeed">Add new channel</a>
                                </li>
                            </ul>
                            <ul class="navbar-nav ml-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="/logout">Sign Out ${user.username}</a>
                                </li>
                            </ul>
                        <#else>
                            <ul class="navbar-nav mr-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="/">Home</a>
                                </li>
                            </ul>
                            <ul class="navbar-nav ml-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="/register">Sign Up</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="/login">Sign In</a>
                                </li>
                            </ul>
                        </#if>
                    </div>
                </nav>
            </div>
        </div>

    </div>
</div>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-2">
            <#if user??>
            <div class="dropdown">
                <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Channels
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenu2">
                    <#if feedList??>
                        <#list feedList as feed>
                            <a href="/f/${feed.title}/page/1"><button class="dropdown-item" type="button">${feed.title}</button></a>
                        </#list>
                    </#if>
                </div>
            </div>
            </#if>
        </div>
        <div class="col-sm-8">
            <div class="container">

                <#nested />

            </div>
        </div>
        <div class="col-sm-2">

        </div>

    </div>
</div>

<div class="container">
    <footer class="footer">
        <p>RssReader &mdash; Application that connects</p>
    </footer>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>

</body>
</html>
</#macro>