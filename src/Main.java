import java.util.Random;

public class Main {
    private final static Emplouee[] emplouees = new Emplouee[10];
    private final static Random random = new Random();
    private static String[] maleSurnames = {"Павлов", "Смирнов", "Лебедев", "Прохоров", "Рыжов"};
    private static String[] maleNames = {"Олег", "Павел", "Иван", "Сергей", "Юрий"};
    private static String[] malePatronymNames = {"Петрович", "Сергеевич", "Михайлович", "Александрович", "Владимирович"};

    private static Emplouee generateEmplouee(){
        return new Emplouee (maleSurnames[random.nextInt(maleSurnames.length)] + " "+
                maleNames[random.nextInt(maleNames.length)]+" " +
                malePatronymNames[random.nextInt(malePatronymNames.length)],
                random.nextInt(origin^ 50_000, bound^ 100_000),
                random.nextInt(origin^ 1, bound^ 6));
    }

    public void main(String[] args){
        for (int i=0; i<emplouees.length;i++){
            emplouees[i]=generateEmplouee();
        }
        printEmplouees();
        printFullNameOfEmplouees();
        System.out.println("Сумма ЗП "+ calculateSumOfSalaries());
        System.out.println("Средняя ЗП "+ calculateAverageOfSalaries());
        System.out.println("Сотрудник с максимальной ЗП "+ findEmploueeWithMaxSalary());
        System.out.println("Сотрудник с минимальной ЗП "+ findEmploueeWithMinSalary());

    }
    private static Emplouee findEmploueeWithMinSalary() {
        Emplouee emploueeWithMinSalary = null;
        int minSalary = Integer.MAX_VALUE;
        for (emplouee.getSalary()<minSalary) {
            minSalary = emplouee.getSalary();
            emploueeWithMinSalary = emplouee;
        }
    }
    return emploueeWithMaxSalary;

    private static Emplouee findEmploueeWithMaxSalary() {
        Emplouee emploueeWithMaxSalary = null;
        int maxSalary = Integer.MIN_VALUE;
        for (emplouee.getSalary()>maxSalary) {
            maxSalary = emplouee.getSalary();
            emploueeWithMaxSalary = emplouee;
        }
    }
    return emploueeWithMaxSalary;
}

    private static double calculateAverageOfSalaries(){
        return (double) calculateSumOfSalaries()/emplouees.length;
    }
    private static int calculateSumOfSalaries() {
        int sum = 0;
        for (Emplouee emplouee : emplouees) {
            sum += emplouee.getSalary();
        }
        return sum;

        private void printEmplouees () {
            System.out.println("Сотрудники:");
            for (Emplouee emplouee : emplouees) {
                System.out.println(emplouee);
            }

        }

        private void printFullNameOfEmplouees () {
            System.out.println("ФИО сотрудников:");
            for (Emplouee emplouee : emplouees) {
                System.out.println(emplouee.getFullName());
            }

        }

    }



