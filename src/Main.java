/*
Задача 1:
Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
выводит текущую информацию о карточке. Напишите программу, которая создает три
объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
третьей. Выведите на экран текущее состояние всех трех карточек.
 */


public class Main {
    public static void main(String[] args) {
        CreditCard cardOne = new CreditCard("0010115180715101", 1500);
        CreditCard cardTwo = new CreditCard("0010115180715102", 2000);
        CreditCard cardThree = new CreditCard("0010115180715103", 1000);


        cardOne.fundAccount(330);
        cardTwo.fundAccount(250);
        cardThree.withdrawalAmount(600);

        cardOne.availableAmount();
        cardTwo.availableAmount();
        cardThree.availableAmount();
    }
}