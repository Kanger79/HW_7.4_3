public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double summK = 1_000_000;
        double ys = 9.99;
        //  double lk = 12;

        double pay1 = service.calc(summK, ys, 12);
        int oneY = (int) pay1;
        System.out.println("При сумме кредита в " + summK + " рублей, сроком на 12 месяцев (1 год), и процентной ставке " + ys + "%, ");
        System.out.println("ежемесячный платёж составит " + oneY + " рублей.");
        System.out.println();

        double pay2 = service.calc(summK, ys, 24);
        int twoY = (int) pay2;
        System.out.println("При сумме кредита в " + summK + " рублей, сроком на 24 месяца (2 года), и процентной ставке " + ys + "%, ");
        System.out.println("ежемесячный платёж составит " + twoY + " рублей.");
        System.out.println();

        double pay3 = service.calc(summK, ys, 36);
        int threeY = (int) pay3;
        System.out.println("При сумме кредита в " + summK + " рублей, сроком на 36 месяцев (3 года), и процентной ставке " + ys + "%, ");
        System.out.println("ежемесячный платёж составит " + threeY + " рубля.");


    }

}
