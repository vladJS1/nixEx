<#import "parts/common.ftl" as c>
<#import "parts/article.ftl" as art>

<@c.page>
    <div>
        <form method="post" action="/addArticle">
            <div class="form-group">
                <input type="text" class="form-control" name="topic" placeholder="Тема статьи"/>
            </div>
            <div class="form-group">
                <input type="text" class="form-control mb-3" name="description" placeholder="Описание"/>
                <div class="form-group">
                    <label for="articleBody">Тело статьи</label>
                    <textarea class="form-control" id="articleBody" name="text" rows="10"
                              placeholder="Текст"></textarea>
                </div>
            </div>
            <div class="form-group">
                <input type="hidden" name="_csrf" value="${_csrf.token}"/>
                <button class="btn btn-primary" type="submit">Create</button>
            </div>
        </form>
    </div>
    <#if sketches??>
        <div class="card-columns">
        <#list sketches as sketch>

                <@art.article sketch></@art.article>

        </#list>
        </div>
    </#if>
</@c.page>