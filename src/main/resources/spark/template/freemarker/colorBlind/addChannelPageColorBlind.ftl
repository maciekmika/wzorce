<#import "masterTemplateColorBlind.ftl" as layout />

<@layout.masterTemplate title="Add new channel">





        <#if user??>
            <form action="/newFeed" method="post" id="addFeedForm">
                <h3 id="TitleAddChannel">${pageTitle}</h3>
                <div class="form-group">
                    <label for="ChannelName">Name for new channel</label>
                    <input type="text" class="form-control" name="name"  placeholder="Enter name" required/>
                </div>
                <div class="form-group">
                    <label for="ChannelUrl">Url of new channel</label>
                    <input type="text" class="form-control" name="link"  placeholder="Enter url" required/>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </#if>


</@layout.masterTemplate>