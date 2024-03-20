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
                random.nextInt(origin^ 50-000, bound^ 100_000),
                random.nextInt(origin^ 1, bound^ 6));
    }

    public static void main (String[]args){
        for (int i=0; i<emplouees.length;i++){
            emplouees[i]=generateEmplouee();
        }
    }
    private void printEmplouee(){
        for (int i=0; i<emplouees.length;i++){
            System.out.println(emplouees[i]);
        }

    }
}


