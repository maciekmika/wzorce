<#import "masterTemplateKeyboardUse.ftl" as layout />

<@layout.masterTemplate title="Timeline">

    <#if feedMessages??>
<ul class="list-unstyled">


        <#list feedMessages as message>
            <li class="media">
                <div class="media-body">
                    <h4 class="mt-0 mb-1">
                        <a href="${message.link}">
                        ${message.title}
                        </a>
                    </h4>
                ${message.description}
                </div>
            </li>
        <#else>
            <div class="well">
                There're no feeds so far.
            </div>
        </#list>
    <#else>
        <div class="well">
            There're no feeds so far.
        </div>


</ul>
    </#if>

<nav aria-label="Page navigation">
    <#if pages??>
        <ul class="pagination">



            <#list pages as page>
                <#if page == (pageNumber-1) && pageNumber != 1>
                    <li class="page-item">
                        <a class="page-link" href="/main/${page}" >Previous</a>
                    </li>
                <#elseif pageNumber == 1  && page == pageNumber>
                    <li class="page-item disabled">
                        <a class="page-link" href="/main/${page}" >Previous</a>
                    </li>
                </#if>
            </#list>

            <#list pages as page>
                <#if (page < (pageNumber+5)) && (page > (pageNumber-5))>
                    <#if page == pageNumber>
                        <li class="page-item active">
                            <a class="page-link" href="/main/${page}">${page}<span class="sr-only">(current)</span></a>
                        </li>
                    <#else>
                        <li class="page-item"><a class="page-link" href="/main/${page}">${page}</a></li>
                    </#if>
                </#if>
            </#list>

            <#list pages as page>
                <#if page == (pageNumber+1) && pageNumber != pagesAmount>
                    <li class="page-item">
                        <a class="page-link" href="/main/${page}">Next</a>
                    </li>
                <#elseif pageNumber == pagesAmount && page == pageNumber>
                    <li class="page-item disabled">
                        <a class="page-link" href="/main/${page}">Next</a>
                    </li>
                </#if>
            </#list>
        </ul>
    </#if>
</nav>

</@layout.masterTemplate>