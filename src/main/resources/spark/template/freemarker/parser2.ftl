<#import "masterTemplate.ftl" as layout />

<@layout.masterTemplate title="Parser">

<div class="row">
    <div class="col-xs-11">
        <h3>${pageTitle}</h3>

        <div class="row">
            <div class="col-xs-11">
                <div id="media-list" class="row">
                    <#if feedList??>
                        <#list feedList as feed>
                            <hr/>

                            <div class="media">
                                <div class="media-body">
                                    <h4 class="media-heading">
                                        ${feed.title}
                                        </a>
                                    </h4>

                                ${feed.link} <br/>

                                </div>
                            </div>
                        <#else>
                            <hr/>
                            <div class="well">
                                There're no messages so far.
                            </div>
                        </#list>
                    <#else>
                        <hr/>
                        <div class="well">
                            There're no messages so far.
                        </div>
                    </#if>
                </div>
            </div>
        </div>

    </div>
</div>

</@layout.masterTemplate>