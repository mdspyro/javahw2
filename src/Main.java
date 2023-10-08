public class Main  {
    public static void main(String[] args) {
        // Цена билета
        int x = 15855;

        // Количество рублей за одну милю
        double d = 20.0;

        // Количество начисленных бонусов
        int xx = (int) (x / d);

        System.out.println(" При стоимости билета в " + x + " рублей начислено " + xx + " бонуса.");
    }
}

