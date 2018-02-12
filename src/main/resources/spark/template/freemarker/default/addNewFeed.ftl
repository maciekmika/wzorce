<#import "masterTemplate.ftl" as layout />

<@layout.masterTemplate title="Timeline">

<div class="row">
    <div class="col-xs-11">
        <h3>${pageTitle}</h3>

        <#if user??>
            <#if pageTitle != 'Public Timeline'>
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h3 class="panel-title">Wpisz nazwe suba i linka:</h3>
                    </div>

                    <div class="panel-body">
                        <form class="form-horizontal" action="/newFeed" method="post">
                            <div class="input-group">
                                <input type="text" name="name" class="form-control" required/>
                                <input type="text" name="link" class="form-control" required/>
                                <span class="input-group-btn">
                                    <button class="btn btn-primary" type="submit"> Dodaj </button>
                                </span>
                            </div>
                        </form>
                    </div>
                </div>
            </#if>
        </#if>
    </div>
</div>


</@layout.masterTemplate>