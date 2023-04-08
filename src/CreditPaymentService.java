public class CreditPaymentService {
    public double calc(double creditSumm, double yearBet, double creditPeriod) {
        //creditSumm - сумма кредита,
        //yearBet - процентная ставка (годовая),
        //creditPeriod - период кредитования (в месяцах).
        double monthBet;        //месячная процентная ставка
        monthBet = yearBet / 100 / 12;     
        double pay;             //ежемесячный платеж
        pay = (creditSumm * monthBet) / (1 - Math.pow(1 + monthBet, - creditPeriod)); // формула расчета
        return pay;

    }
}
