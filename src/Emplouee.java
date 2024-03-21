public class Emplouee {

    private static int idGenerator =1;
    private final int id;
    private final String fullName;
    private int salary;
    private int departament;

    public Emplouee(String fullName, int salary, int departament) {
        this.id = idGenerator++;
       this.fullName = fullName;
       this.salary=salary;
       this.departament=departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartament() {
        return departament;
    }
    @Override
    public String toString(){
        return "id="+id+", ФИО="+fullName+"/" + ", ЗП="+salary+", отдел="+departament;
    }

}
