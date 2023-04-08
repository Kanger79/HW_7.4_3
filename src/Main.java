public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditSumm = 1_000_000;
        double yearBet = 9.99;
        //  double creditPeriod = 12;

        double payOne = service.calc(creditSumm, yearBet, 12);
        int oneYear = (int) payOne;
        System.out.println("При сумме кредита в " + creditSumm + " рублей, сроком на 12 месяцев (1 год), и процентной ставке " + yearBet + "%, ");
        System.out.println("ежемесячный платёж составит " + oneYear + " рублей.");
        System.out.println();

        double payTwo = service.calc(creditSumm, yearBet, 24);
        int twoYears = (int) payTwo;
        System.out.println("При сумме кредита в " + creditSumm + " рублей, сроком на 24 месяца (2 года), и процентной ставке " + yearBet + "%, ");
        System.out.println("ежемесячный платёж составит " + twoYears + " рублей.");
        System.out.println();

        double payThree = service.calc(creditSumm, yearBet, 36);
        int threeYears = (int) payThree;
        System.out.println("При сумме кредита в " + creditSumm + " рублей, сроком на 36 месяцев (3 года), и процентной ставке " + yearBet + "%, ");
        System.out.println("ежемесячный платёж составит " + threeYears + " рубля.");


    }

}
