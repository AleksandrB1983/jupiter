public class Main {
    public static void main(String[] args) {
        int a = 100; // сумма начального счёта
        int b = 2500; // сумма пополнения
        int c = 1000; // предел ниже которого бонусы не начисляются
        int d = 100; // 1ед. бонуса со ста рублей
        if (b >= c) {

            System.out.println("Бонусное начисление с пополнения счёта");
            System.out.println((b / d) + " Число полученных бонусов");
            System.out.println((a + b) + (b / d) +" Итоговая сумма на счету клиента");
        } else {
            System.out.println("Нет бонусного начисления с пополнения счёта");
            System.out.println((a + b) + " Итоговая сумма без начисления бонусов");
        }
    }
}