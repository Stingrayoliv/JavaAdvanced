# polymorphism and inheritance

1. В проекте Employee реализовать несколько классов : CProgrammer, JavaProgrammer,
JavaScriptProgrammer.
2. В каждом классе переопределить метод work(). Пусть он в каждом случае выводит
надпись вида “I am Java programmer. I write Java Programm“
3. В каждом классе программистов реализуйте метод codeReview, который выодит на экран
строку вида “This Java code is good”.
4. В main создайте массив из разных программистов и массив из всех Employee. Убедитесь,
что всем Employee доступны методы work(), pay() и что при вызове выполняется метод
соответствующий типу объекта. Убедитесь, что метод codeReview доступен только для
программистов.
5. Создайте класс Manager. Он тоже расширяет Employee. Добавьте у него свойство
double managerBonus. Это свойство должно быть только у Managera.
6. При вызове метода pay Manager должен получать salary+managerBonus
