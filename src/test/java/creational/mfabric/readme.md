## Применимость

- Когда заранее неизвестны типы и зависимости объектов, с которыми должен работать ваш код.
  
- Когда вы хотите экономить системные ресурсы, повторно используя 
  уже созданные объекты, вместо порождения новых.

## Шаги реализации

1. Приведите все создаваемые объекты к общему интерфейсу.

2. В классе, который создает объекты, создайте пустой фабричный метод. 
   В качестве возвращаемого типа укажите общий интерфейс объекта.

3. Затем пройдитесь по коду класса и найдите все участки, создающие объекты. 
   Поочерёдно замените эти участки вызовами фабричного метода, перенося в него 
   код создания различных объектов.

4. В фабричный метод, возможно, придётся добавить несколько параметров, 
   контролирующих, какой из объектов нужно создать.

5. Для каждого типа объекта заведите подкласс и переопределите в нём фабричный метод. 
   Переместите туда код создания соответствующего объекта из суперкласса.

6. Если создаваемых продуктов слишком много для существующих подклассов создателя, 
   вы можете подумать о введении параметров в фабричный метод, которые позволят возвращать 
   различные продукты в пределах одного подкласса.
   