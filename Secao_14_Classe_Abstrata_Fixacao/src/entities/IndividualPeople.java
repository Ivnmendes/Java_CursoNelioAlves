package entities;

public class IndividualPeople extends People{
    private double healthExpenditure;

    public IndividualPeople(String name, Double anualIncome, double healthExpenditure) {
        super(name, anualIncome);
        this.healthExpenditure = healthExpenditure;
    }

    public double getHealthExpenditure() {
        return healthExpenditure;
    }

    public void setHealthExpenditure(double healthExpenditure) {
        this.healthExpenditure = healthExpenditure;
    }

    @Override
    public double taxes() {
        double tax;

        if (getAnualIncome() >= 20000) {
            tax = getAnualIncome() * 0.25 - healthExpenditure * 0.5;
        } else {
            tax = getAnualIncome() * 0.15 - healthExpenditure * 0.5;
        }

        return tax;
    }
}
