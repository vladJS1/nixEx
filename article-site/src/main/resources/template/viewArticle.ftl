<#import "parts/common.ftl" as c>
<#include "parts/security.ftl">

<@c.page>
    <form method="post">
        <div class="container">
            <haeder>
                <div class="row m-4 font-weight-bold" id="ArticleTopic">
                    <h5>${article.sketch.topic}</h5>
                </div>
            </haeder>
            <main>
                <article>
                    <div class="row">
                        <div class="form-italic article-text">
                            ${article.text}
                        </div>
                    </div>

                    <div class="row position-relative">
                        <label for="exampleFormControlTextarea1">Оставить комментарий</label>
                        <textarea class="form-control mb-2" id="exampleFormControlTextarea1" rows="3"
                                  name="textComment"></textarea>
                        <input type="hidden" name="articleId" value="${article.id}"/>
                        <input type="hidden" name="name" value="${name}"/>
                        <input type="hidden" name="_csrf" value="${_csrf.token}"/>
                        <button type="submit" id="SendComment" class="btn btn-primary">Отправить</button>
                    </div>
                </article>
            </main>
        </div>
    </form>
    <#if comments??>
        <div class="card-group"
        <#list  comments as comment>
            <div class="card mb-3"  style="margin-top: 15px">
            <div class="card-header">${comment.author}</div>
            <div class="card-body text-dark">
                <p class="card-text">${comment.text}</p>
            </div>
        </#list>
        </div>

    </#if>

</@c.page>
<style type="text/css">
    #SendComment {
        border-radius: 30px;
        margin-left: auto;

    }

    #ArticleTopic {
        justify-content: center;
    }

    .article-text {
        padding: 0 30px;
        margin: 20px;
        font-size: 16px;
        line-height: 22px;
        font-family: "Georgia", serif;
        align-content: center;
    }
</style>