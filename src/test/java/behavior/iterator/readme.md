## Применимость
- Когда у вас есть сложная структура данных, и вы хотите скрыть от клиента
  детали её реализации (из-за сложности или вопросов безопасности).
  
- Когда вам нужно иметь несколько вариантов обхода одной и той же структуры данных.

-  Когда вам хочется иметь единый интерфейс обхода различных структур данных.
## Шаги реализации

1. Создайте общий интерфейс итераторов. Обязательный минимум — это операция 
   получения следующего элемента коллекции. Но для удобства можно предусмотреть 
   и другое. Например, методы для получения предыдущего элемента, текущей позиции, 
   проверки окончания обхода и прочие.

2. Создайте интерфейс коллекции и опишите в нём метод получения итератора. 
   Важно, чтобы сигнатура метода возвращала общий интерфейс итераторов, а 
   не один из конкретных итераторов.

3. Создайте классы конкретных итераторов для тех коллекций, которые нужно 
   обходить с помощью паттерна. Итератор должен быть привязан только к 
   одному объекту коллекции. Обычно эта связь устанавливается через конструктор.

4. Реализуйте методы получения итератора в конкретных классах коллекций. 
   Они должны создавать новый итератор того класса, который способен работать 
   с данным типом коллекции. Коллекция должна передавать ссылку на собственный 
   объект в конструктор итератора.

5. В клиентском коде и в классах коллекций не должно остаться кода обхода элементов.
   Клиент должен получать новый итератор из объекта коллекции каждый раз, 
   когда ему нужно перебрать её элементы.