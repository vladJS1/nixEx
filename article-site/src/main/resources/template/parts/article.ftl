<#import "common.ftl" as c>
<#macro article sketch>


    <div class="card my-2 ">
        <div class="card-header text-center font-weight-bold border-primary">
            ${sketch.topic}
        </div>
        <div class="card-body text-primary border-primary">
            <ul class="list-group list-group-flush">
                <label for="article_text">
                    <h3>Описание</h3>
                </label>
                <li class="list-group-item">${sketch.description}</li>
                <form>
                    <li>
                        <button type="submit" id="ReadMore" class="btn btn-primary"
                                formaction="articleReadMore/${sketch.author.username}/${sketch.article.id}"
                                formmethod="get">
                            Читать дальше
                        </button>
                    </li>
                </form>
            </ul>
        </div>
        <div class="card-footer border-primary">
            <#include "security.ftl">
            <form action="/like" method="post">
                <div class="p-2 mr-1">
                    <div class="btn-group btn-group-sm" role="group" aria-label="status_bar" style="alignment: left ">
                        <button type="submit" name="btnLike" class="btn btn-secondary">
                            Оценка <span class="badge badge-light">${sketch.statusBar.mark}</span>
                            <span class="sr-only">Средняя оценка статьи</span>
                        </button>
                        <input type="hidden" name="currentUser" value="${name}"/>
                        <button type="button" class="btn btn-secondary">
                            Просмотров <span class="badge badge-light">${sketch.statusBar.views}</span>
                            <span class="sr-only">Количество просмотров</span>
                        </button>
                    </div>
                </div>
            </form>
            <div class="mr-auto p-2">
                <i>Автор: </i>
                <small class="text-muted ">${sketch.author.username}</small>
            </div>
        </div>
    </div>

</#macro>
