public class Main {
    public static void main(String[] args) {
        int balance = 100; // сумма начального счёта
        int replenishment = 2500; // сумма пополнения
        int limit = 1000; // предел ниже которого бонусы не начисляются
        int bonus = 100; // 1ед. бонуса со ста рублей
        if (replenishment >= limit) {

            System.out.println("Бонусное начисление с пополнения счёта");
            System.out.println((replenishment / bonus) + " Число полученных бонусов");
            System.out.println((balance + replenishment) + (replenishment / bonus) +" Итоговая сумма на счету клиента");
        } else {
            System.out.println("Нет бонусного начисления с пополнения счёта");
            System.out.println((balance + replenishment) + " Итоговая сумма без начисления бонусов");
        }
    }
}