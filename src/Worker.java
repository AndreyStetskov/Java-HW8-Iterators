import java.util.List;
import java.util.Objects;

public class Worker extends Person implements AbleToCalculatePension {
    private double minSalary;
    private double maxSalary;
    private final int CHILD_ALLOWANCE = 200;
    private List<Company> companies;

    public Worker(String name, int age, int height, int weight, double minSalary, double maxSalary) {
        super(name, age, height, weight);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    @Override
    public void die(int retirementAge) {
        System.out.println(getName() + " didn't live up to pension");
    }

    @Override
    public void infoAboutChildren() {
        switch (getChild().size()) {
            case 0 -> System.out.println(getName() + " doesn't have children");
            case 1 -> System.out.println(getName() + " has a child, " + getChild().get(0));
            default -> System.out.println(getName() + " has " + getChild().size() + " children");
        }

        int index = 0;
        for (String s : getChild()) {
            if (getChild().size() > 1) {
                System.out.println(index + 1 + ") " + getChild().get(index));
            }
            index ++;
        }
    }

    @Override
    public double calculatePension(int startUpAge, int retirementAge) {
        String nameOFPensionFond = "The pension fund has a registered: " + getName();

        int experience;;

        if (getAge() > startUpAge && getAge() < retirementAge) {
            experience = getAge() - startUpAge;
        } else if (getAge() >= retirementAge){
            experience = retirementAge - startUpAge;
        } else {
            experience = 0;
        }

        SuperannuationFund fund = new SuperannuationFund(nameOFPensionFond, TypeOfFund.generateRandom(), DateGeneration.generateOfDate(getAge()));
        double changeMinSalary = minSalary + CHILD_ALLOWANCE * getChild().size();
        return fund.pensionCalculation(experience, changeMinSalary, maxSalary);
    }

public void workedOut() {
    switch (getCompanies().size()) {
        case 0 -> System.out.println(getName() + " haven't worked officially anywhere");
        case 1 -> System.out.println(getName() + " only worked in " + getCompanies().get(0));
        default -> {
            System.out.print(getName() + " has worked for the following companies: ");
            for (int i = 0; i < getCompanies().size() - 1; i++) {
                System.out.print(getCompanies().get(getCompanies().size() - i - 1) + ", ");
            }
            System.out.println(getCompanies().get(0) + ".");
        }
    }
}

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getCHILD_ALLOWANCE() {
        return CHILD_ALLOWANCE;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        return Double.compare(worker.minSalary, minSalary) == 0 && Double.compare(worker.maxSalary, maxSalary) == 0 && CHILD_ALLOWANCE == worker.CHILD_ALLOWANCE && Objects.equals(companies, worker.companies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), minSalary, maxSalary, CHILD_ALLOWANCE, companies);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", CHILD_ALLOWANCE=" + CHILD_ALLOWANCE +
                ", companies=" + companies +
                '}';
    }
}
