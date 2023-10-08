public class Main  {
    public static void main(String[] args) {
        // Цена билета
        int price = 15855;

        // Количество рублей за одну милю
        double rub = 20.0;

        // Количество начисленных бонусов
        int bonus = (int) (price / rub);

        System.out.println(" При стоимости билета в " + price + " рублей начислено " + bonus + " бонуса.");
    }
}

