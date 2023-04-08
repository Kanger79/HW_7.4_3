public class CreditPaymentService {
    public double calc(double summK, double ys, double lk) {
        //sunnK - сумма кредита,
        //ys - процентная ставка (годовая),
        //lk - период кредитования (в месяцах).
        double ms;
        ms = ys / 100 / 12;     //месячная процентная ставка
        double pay;             //ежемесячный платеж
        pay = (summK * ms) / (1 - Math.pow(1 + ms, -lk)); // формула расчета
        return pay;

    }
}
