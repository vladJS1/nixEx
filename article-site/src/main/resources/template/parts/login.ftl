<#macro login path isRegisterForm>
    <form action="/registration" method="post">
        <div class="form-group row">
            <label class="col-sm-2 col-form-label text-primary"> User Name : </label>
            <div class="col-sm-6 text-secondary">
                <input type="text" name="username" class="form-control" placeholder="User name"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label text-primary">Password:</label>
            <div class="col-sm-6 text-secondary">
                <input type="password" name="password" class="form-control" placeholder="Password"/>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Email:</label>
            <div class="col-sm-6">
                <input type="email" name="email" class="form-control" placeholder="some@some.com"/>
            </div>
        </div>
        <input type="hidden" name="_csrf" value="${_csrf.token}"/>
        <button class="btn btn-outline-primary btn-block"
                type="submit">Create
        </button>
    </form>
    <#if !isRegisterForm>
        <script>
            document.getElementById('collapseMenu').click()
            document.getElementById('loginButton').click()

        </script>
    </#if>
</#macro>
<#macro modalLogin>
    <#nested>

    <div class="modal fade" id="RegistrationForm" tabindex="-1" role="dialog"
         aria-labelledby="RegistrationFormTitle" aria-hidden="true"  data-backdrop="false">
            <div class="modal-dialog modal-dialog-centered" role="document" >

                <div class="modal-content" id="modalLogin" style=" width: 300px; height: 520px; border-radius: 30px; margin: 0; position: absolute;top: 50%;left: 50%;transform: translate(-50%, -50%);">
                    <div class="modal-header">
                        <h5 class="modal-title" id="RegistrationFormLongTitle">Авторизация</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form action="/login" method="post">
                    <div class="modal-body" style="position: relative">
                        <div class="container">
                            <div class="form-group">
                                <label for="LoginForm">Логин:</label>
                                <div class="input-group input-group-md" style="margin-bottom: 20px">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text" id="basic-addon1">@</span>
                                    </div>
                                    <input type="text" class="form-control" id="LoginForm" name="username"
                                           placeholder="Имя пользователя"
                                           aria-label="username"/>
                                </div>
                            </div>
                            <div class="form-group" >
                                <label for="PasswordForm">Пароль:</label>
                                <div class="input-group">
                                    <input type="password" id="PasswordForm" class="form-control" name="password"
                                           placeholder="Пароль"
                                           aria-label="password"/>
                                </div>
<#--                                <div class="alert alert-warning" role="alert" >-->
<#--                                    Not correct login or password-->
<#--                                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">-->
<#--                                        <span aria-hidden="true">&times;</span>-->
<#--                                    </button>-->
<#--                                </div>-->

                                <div class="form-check" style="margin-top:40px; margin-bottom:20px">
                                    <input type="checkbox" class="form-check-input" id="exampleCheck1" style="transform:scale(1.5)">
                                    <label class="form-check-label" for="exampleCheck1"> Remember me</label>
                                </div>

                                <div class="form-group" align="center" style="margin-top: 10px">
                                    <a href="/registration">Зарегистрироваться</a>
                                </div>

                                <div class="form-group" align="center" style="margin-top: 10px">
                                    <a href="/forgotPassword">Забыли пароль?</a>
                                </div>

                                <input type="hidden" name="_csrf" value="${_csrf.token}"/>
                            </div>

                        </div>

                    </div>
                    <div class="modal-footer ">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Login</button>
                    </div>
                    </form>

                </div>

            </div>

    </div>

</#macro>

<#macro logout>
    <form action="/logout" method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}"/>
        <button class="btn btn-primary" type="submit">Sign Out</button>
    </form>
</#macro>