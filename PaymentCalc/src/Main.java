public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Łukasz", "Jedrusik",
                4500);
        System.out.printf("Roczna wyplata dla %s %s wynosi %.0fzl", employee.getNamme(),employee.getSurname(),PaymentCalculator.nettoYearPayment(employee));
        System.out.println();
        System.out.println("Roczny koszt pracodawcy to: " + PaymentCalculator.bruttoYearPayment(employee));
    }
}
