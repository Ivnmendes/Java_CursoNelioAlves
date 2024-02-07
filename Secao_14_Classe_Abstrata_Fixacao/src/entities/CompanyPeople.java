package entities;

public class CompanyPeople extends People{
    private int numberEmployees;

    public CompanyPeople(String name, Double anualIncome, int numberEmployees) {
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double taxes() {
        double tax;

        if(numberEmployees > 10) {
            tax = getAnualIncome() * 0.14;
        } else {
            tax = getAnualIncome() * 0.16;
        }

        return tax;
    }
}
