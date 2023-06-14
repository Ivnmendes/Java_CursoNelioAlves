package exercicio03;
public class Student {
    private double firstQuarter;
    private double secondQuarter;
    private double thirdQuarter;
    private double grade;
    private boolean passed;
   
   private double finalGrade() {
       this.grade = this.firstQuarter + this.secondQuarter + this.thirdQuarter;
       this.passed = this.grade >=60;
       return this.grade;
   }
   
   public double missingPoints() {
       if (this.grade<60.)
           return 60. - this.grade;
       else
           return 0.;
   }
   
   @Override
   public String toString() {
       finalGrade();
       if(this.passed)
            return String.format("Final grade: %.2f%nPassed: %s", finalGrade(), this.passed? "Pass" : "Failed");
       else
            return String.format("Final grade: %.2f%nPassed: %s%nMissing Points: %.2f", finalGrade(), this.passed? "Pass" : "Failed",this.missingPoints());
   }

    public double getFirstQuarter() {
        return firstQuarter;
    }

    public void setFirstQuarter(double firstQuarter) {
        this.firstQuarter = firstQuarter;
    }

    public double getSecondQuarter() {
        return secondQuarter;
    }

    public void setSecondQuarter(double secondQuarter) {
        this.secondQuarter = secondQuarter;
    }

    public double getThirdQuarter() {
        return thirdQuarter;
    }

    public void setThirdQuarter(double thirdQuarter) {
        this.thirdQuarter = thirdQuarter;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
