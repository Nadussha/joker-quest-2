Infobip Joker 2020 Quest 2
==========

В этом квесте Вам необходимо связаться с чат-ботом Infobippy и получить у него ключ-ответ к задаче.

Для этого необходимо:

* Расшифровать ключ-идентификатор к чату Infobip в методе `KeyProvider.getChatkey`;
* Открыть страницу `localhost:8080` на которой должно отобразиться окно чата Infobip и следовать инструкциям бота;
* Полученный от бота ключ, является ответом квеста, внесите его в эту [форму](https://forms.office.com/Pages/ResponsePage.aspx?id=hgrv93kxzEeEl_O13Q0p-mdhyP2HxxdAu1hjtHc3TOBUOU01TkJLTVNKTDJaVFk3Tk02TlJJSTVTTy4u).

После запуска приложения, оно начинает отдавать страницу с окном чата по адресу `localhost:8080`, также на ней описаны детали алгоритма, который использовался для шифрования ключа чата.

Кроме того, для удобства в проект добавлены тесты, проверяющие корректность реализации `KeyProvider.getChatkey`.

Installation
------------
Данный проект представляет собой Spring Boot приложение. 
```$xslt
$ git clone git@github.com:infobip/joker-quest-2
$ cd joker-quest-2
$ ./mvnw install 
```
```$xslt
$ ./mvnw spring-boot:run
```


