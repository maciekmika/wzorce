<#import "masterTemplateLowVision.ftl" as layout />

<@layout.masterTemplate title="Sign In">

    <#if error??>
        <div class="alert alert-danger">
            <strong>Error:</strong> ${error}
        </div>
    </#if>

    <h6>Sign Up</h6>

    <form class="form-horizontal" action="/register" role="form" method="post">

        <div class="form-group">
            <label for="username" class="col-sm-2 control-label">Username: </label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="username" placeholder="Username" value="${username!}" />
            </div>
        </div>

        <div class="form-group">
            <label for="email" class="col-sm-2 control-label">Email: </label>
            <div class="col-sm-10">
                <input type="email" class="form-control" name="email" placeholder="E-Mail" value="${email!}" />
            </div>
        </div>

        <div class="form-group">
            <label for="password" class="col-sm-2 control-label">Password: </label>
            <div class="col-sm-10">
                <input type="password" class="form-control" name="password" placeholder="Password" />
            </div>
        </div>

        <div class="form-group">
            <label for="password2" class="col-sm-2 control-label">Password <small>(repeat)</small>:</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" name="password2"/>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary">Sign Up</button>
            </div>
        </div>
  </form>
</@layout.masterTemplate>