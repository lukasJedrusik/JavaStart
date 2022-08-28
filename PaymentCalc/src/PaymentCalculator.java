public class PaymentCalculator {

    public static double nettoYearPayment(Employee employee){
        return employee.getSalary() * 12;
    }

    public static double bruttoYearPayment(Employee employee){

        return (nettoYearPayment(employee) * 0.2)
                + nettoYearPayment(employee) + 12000;
    }
}
