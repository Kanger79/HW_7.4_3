public class CreditPaymentService {
    public double calc(double creditSumm, double yearBet, double creditPeriod) {
        //creditSumm - сумма кредита,
        //yearBet - процентная ставка (годовая),
        //creditPeriod - период кредитования (в месяцах).
        double monthBet;
        monthBet = yearBet / 100 / 12;     //месячная процентная ставка
        double pay;             //ежемесячный платеж
        pay = (creditSumm * monthBet) / (1 - Math.pow(1 + monthBet, - creditPeriod)); // формула расчета
        return pay;

    }
}
