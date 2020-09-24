<h1>О проекте</h1>
<p>Предназначен для закрепления знаний, полученных при изучении блока посвященного ООП из <a href="https://github.com/ReyBos/job4j_elementary">курса по основам языка Java</a>.</p>
<p>Этот проект - консольное приложение. После запуска пользователю отображается меню с возможностями программы. Программа просит ввести в консоль пункт меню для дальнейшего действия. Например, пользователь ввел цифру 0. Система просит пользователя ввести имя заявки. После этого действия система сохраняет в памяти заявку и снова отображает пункты меню. Если пользователь выбрал пункт 6 - это будет выход из программы, т.е. программа закрывается.</p>
<p align="center">
  <img src="screenshots/main_menu.png" height="200" title="главное меню программы">
  <img src="screenshots/example_edit_item.png" height="200" title="редактирование элемента">
  <img src="screenshots/example_find_item.png" height="200" title="поиск элемента">
</p>
<h2>Структура проекта</h2>
<ul>
  <li>Данные будут храниться в памяти. Хранилище будет описывать класс <a href="https://github.com/ReyBos/job4j_tracker/blob/master/src/main/java/ru/job4j/tracker/Tracker.java">ru.job4j.tracker.Tracker</a></li>
  <li><a href="https://github.com/ReyBos/job4j_tracker/blob/master/src/main/java/ru/job4j/tracker/Item.java">ru.job4j.tracker.Item</a> объект этого класса будет описывать модель данных</li>
  <li>Объект для управления меню <a href="https://github.com/ReyBos/job4j_tracker/blob/master/src/main/java/ru/job4j/tracker/StartUI.java">ru.job4j.tracker.StartUI</a></li>
</ul>
<h2>Интересные моменты</h2>
<ul>
  <li><a href="https://github.com/ReyBos/job4j_tracker/commit/a58d1785c10198cda033c863257130bc39d99a83">Удалили</a> зависимость StartUI от внешних ресурсов (Scanner)</li>
  <li><a href="https://github.com/ReyBos/job4j_tracker/commit/fd96dec057015d842fd711148bea39398baa3eff">Удалили</a> зависимость классов от внешних ресурсов (System.out)</li>
  <li><a href="https://github.com/ReyBos/job4j_tracker/commit/4e623b37c1e3905dcba94e4855a374b7c3c7609e">Реализовали</a> StartUI за счет шаблона стратегия</li>
</ul>
