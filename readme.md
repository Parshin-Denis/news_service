# SPRING приложение, реализирующее REST API для новостного сервиса.

## Описание работы
Приложение в соответсвии со стандартом REST API может по HTTP-запросу создавать, изменять, удалять и получать данные,
хранящиеся в базе данных в виде 4-х связанных между собой таблиц: новости, пользователи, категории новостей,
комментарии к новостям.

## Настройки

### Образ базы данных
В файле `docker/docker-compose.yml` указаны параметры образа базы данных в `Docker`. Для его создания необходимо в
командной строке перейти в папку, где находится указанный выше файл, и ввести команду `docker compose up`.

### Файл конфигурации
В файле конфигурации `src/resources/application.properties` указаны параметры для подключения к базе данных, они
полностью соответствуют параметрам, использумым при создании базы данных в предущем пункте.

## Управление
Для работы с приложением необходимо пользоваться любым инструментом для тестирования HTTP-запросов:
* расширение для браузера [Chrome Talend API](https://chrome.google.com/webstore/detail/talend-api-tester-free-ed/aejoelaoggembcahagimdiliamlcdmfm)
  или [Postman](https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=ru);
* приложение [Postman](https://www.postman.com/downloads/) [(видео, как пользоваться приложением)](https://youtu.be/V1fRT3RVCRw).

Описание обрабатываемых HTTP-запросов доступно в [API Doc](http://localhost:8080/swagger-ui/index.html) после
запуска приложения.