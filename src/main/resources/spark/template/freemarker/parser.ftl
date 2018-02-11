<#import "masterTemplate.ftl" as layout />

<@layout.masterTemplate title="Channel">

<div class="row">
    <div class="col-xs-11">
                <div id="media-list" class="row">
                    <#if feedMessages??>
                        <#list feedMessages as message>
                            <div class="media">
                                <div class="media-body">
                                    <h4 class="media-heading">
                                        <a href="${message.link}">
                                        ${message.title}
                                        </a>
                                    </h4>
                                    ${message.description}
                                </div>
                            </div>
                        <#else>
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

</@layout.masterTemplate>