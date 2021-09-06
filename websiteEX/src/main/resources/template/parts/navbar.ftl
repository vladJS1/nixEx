<#include "security.ftl">
<#import "login.ftl" as l>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">Sweater</a>
    <button class="navbar-toggler" id="collapseMenu" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item ">
                <a class="nav-link" href="/">Главная </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="/community">Сообщество </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="/chat">Чат </a>
            </li>
            <li class="nav-item ">
                <a class="nav-link" href="/faq">Помощь </a>
            </li>

            <#if isAdmin>
                <li class="nav-item ">
                    <a class="nav-link" href="/userList">Список пользователей</a>
                </li>
            </#if>
            <#if user??>
                <li class="nav-item ">
                    <a class="nav-link" href="/user/profile">Профиль</a>
                </li>
            </#if>
        </ul>
        <div class="navbar-text mr-3">${name}</div>
        <#if name !="unknown">
            <@l.logout/>
        <#else>
            <@l.modalLogin>
                <button type="button" id="loginButton" class="btn btn-primary" data-toggle="modal"
                        data-target="#RegistrationForm">
                    Sign In
                </button>
            </@l.modalLogin>
        </#if>
    </div>
</nav>
<#if message??>
<div class="alert alert-warning" role="alert">
    ${message}
    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
</div>
</#if>


