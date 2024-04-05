
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


class CreditCard {
    String accountNumber;
    double currentAmountAccount;

    public CreditCard(String accountNumber, double currentAmountAccount) {
        this.accountNumber = accountNumber;
        this.currentAmountAccount = currentAmountAccount;
    }

    public void fundAccount(double transactionAmount) {
        this.currentAmountAccount = this.currentAmountAccount + transactionAmount;
    }

    public void withdrawalAmount(double transactionAmount) {
        this.currentAmountAccount = this.currentAmountAccount - transactionAmount;
    }

    public void availableAmount() {
        System.out.println("Номер счета: " + accountNumber + "    Сумма: " + currentAmountAccount);
    }
}