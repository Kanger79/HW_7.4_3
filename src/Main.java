public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditSumm = 1_000_000;
        double yearBet = 9.99;
        //  double creditPeriod = 12;

        double oneYear = service.calc(creditSumm, yearBet, 12);
        int payOneYear = (int) oneYear;
        System.out.println("При сумме кредита в " + creditSumm + " рублей, сроком на 12 месяцев (1 год), и процентной ставке " + yearBet + "%, ");
        System.out.println("ежемесячный платёж составит " + payOneYear + " рублей.");
        System.out.println();

        double twoYears = service.calc(creditSumm, yearBet, 24);
        int payTwoYears = (int) twoYears;
        System.out.println("При сумме кредита в " + creditSumm + " рублей, сроком на 24 месяца (2 года), и процентной ставке " + yearBet + "%, ");
        System.out.println("ежемесячный платёж составит " + payTwoYears + " рублей.");
        System.out.println();

        double threeYears = service.calc(creditSumm, yearBet, 36);
        int payThreeYears = (int) threeYears;
        System.out.println("При сумме кредита в " + creditSumm + " рублей, сроком на 36 месяцев (3 года), и процентной ставке " + yearBet + "%, ");
        System.out.println("ежемесячный платёж составит " + payThreeYears + " рубля.");


    }

}
