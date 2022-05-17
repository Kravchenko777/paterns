## Применимость
- Ленивая инициализация (виртуальный прокси). 
Когда у вас есть тяжёлый объект, грузящий данные из файловой системы или базы данных.
  
-Защита доступа (защищающий прокси). Когда в программе есть разные типы пользователей, 
и вам хочется защищать объект от неавторизованного доступа. Например, если ваши объекты — 
это важная часть операционной системы, а пользователи — сторонние программы (хорошие или вредоносные).

-Локальный запуск сервиса (удалённый прокси). Когда настоящий сервисный объект находится на удалённом сервере.

-Логирование запросов (логирующий прокси). Когда требуется хранить историю обращений к сервисному объекту.

-Кеширование объектов («умная» ссылка). Когда нужно кешировать результаты запросов клиентов и управлять их жизненным циклом.

## Шаги реализации
1. Определите интерфейс, который бы сделал заместитель и оригинальный объект взаимозаменяемыми.

2. Создайте класс заместителя. Он должен содержать ссылку на сервисный объект. 
   Чаще всего, сервисный объект создаётся самим заместителем. 
   В редких случаях заместитель получает готовый сервисный объект от клиента через конструктор.

3. Реализуйте методы заместителя в зависимости от его предназначения. 
   В большинстве случаев, проделав какую-то полезную работу, методы заместителя должны передать запрос сервисному объекту.

4. Подумайте о введении фабрики, которая решала бы, какой из объектов создавать — 
   заместитель или реальный сервисный объект. Но, с другой стороны, эта логика 
   может быть помещена в создающий метод самого заместителя.

5. Подумайте, не реализовать ли вам ленивую инициализацию сервисного объекта 
   при первом обращении клиента к методам заместителя.