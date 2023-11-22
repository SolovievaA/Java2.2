// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int initialBalance = 250;//Баланс телефона до пополнения
        int deposit = 1500;// Сумма пополнения
        int bonus = deposit > 1000 ? deposit / 100 : 0;
        int balance = initialBalance + deposit + bonus;
        System.out.printf("Поздравляем! Ваш бонус " + bonus + "рублей. На вашем счёте " + balance + "рублей");


    }
}