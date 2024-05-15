public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    //Konstruktor untuk menginisialisasi atribut karyawan
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    //Mengembalikan ID karyawan
    public int getID() {
        return id;
    }

    //Mengembalikan nama depan karyawan
    public String getFirstName() {
        return firstName;
    }

    //Mengembalikan nama belakang karyawan
    public String getLastName() {
        return lastName;
    }

    //Mengembalikan nama lengkap karyawan
    public String getName() {
        return firstName + " " + lastName;
    }

    //Mengembalikan gaji karyawan
    public int getSalary() {
        return salary;
    }

    //Mengatur gaji karyawan
    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Mengembalikan gaji tahunan karyawan
    public int getAnnualSalary() {
        return salary * 12;
    }

    //Menaikkan gaji karyawan sebesar persentase tertentu dan mengembalikan gaji yang dinaikkan
    public int raiseSalary(double percent) {
        int raiseAmount = (int) (salary * percent / 100); // Casting hasil perkalian ke int
        salary += raiseAmount;
        return salary;
    }

    //String dari objek karyawan
    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
}
