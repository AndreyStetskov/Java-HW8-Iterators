import java.util.List;

public class Main {

    public static void main(String[] args) {
        Worker firstPerson = new Worker("Sam", 65, 198, 118, 748.89, 355.77);
        List<String> firstPersonChild = List.of("William", "Ava", "Olivia");
        firstPerson.setChild(firstPersonChild);
        double firstPersonsPension = firstPerson.calculatePension(19, 65);
        firstPerson.infoAboutChildren();

        List<Company>workedFirstPerson = List.of(new Company("Akamai"), new Company("Nvidia"), new Company("Bain Capital"));
        firstPerson.setCompanies(workedFirstPerson);
        firstPerson.workedOut();


        System.out.println("---------------------------------------------------------------------------------------");


        Worker secondPerson = new Worker("Anna", 41, 168, 75, 1184.11, 9514.78);
        List<String> secondPersonChild = List.of("Liam", "Emma", "Charlotte", "James");
        secondPerson.setChild(secondPersonChild);
        double secondPersonsPension = secondPerson.calculatePension(18, 60);
        secondPerson.infoAboutChildren();

        List<Company>workedSecondPerson = List.of(new Company("Inter-American Development Bank"), new Company("Bank of America"));
        secondPerson.setCompanies(workedSecondPerson);
        secondPerson.workedOut();


        System.out.println("---------------------------------------------------------------------------------------");


        Worker thirdPerson = new Worker("Bill", 11, 139, 31, 0, 0);
        List<String> thirdPersonChild = List.of();
        thirdPerson.setChild(thirdPersonChild);
        double thirdPersonsPension = thirdPerson.calculatePension(18, 65);
        thirdPerson.infoAboutChildren();

        List<Company>workedThirdPerson = List.of();
        thirdPerson.setCompanies(workedThirdPerson);
        thirdPerson.workedOut();


        System.out.println("---------------------------------------------------------------------------------------");


        Worker fourthPerson = new Worker("Jessica", 25, 165, 52, 4556.99, 5500);
        List<String> fourPersonChild = List.of("Benjamin", "Evelyn", "Christopher", "Donald");
        fourthPerson.setChild(fourPersonChild);
        double fourthPersonsPension = fourthPerson.calculatePension(18, 60);
        fourthPerson.infoAboutChildren();

        List<Company>workedFourthPerson = List.of(new Company("City garden waldorf school"));
        fourthPerson.setCompanies(workedFourthPerson);
        fourthPerson.workedOut();


        System.out.println("---------------------------------------------------------------------------------------");


        Worker fifthPerson = new Worker("Jenifer", 0, 49, 4, 0, 0);
        List<String> fifthPersonChild = List.of();
        fifthPerson.setChild(fifthPersonChild);
        double fifthPersonsPension = fifthPerson.calculatePension(18, 60);
        fifthPerson.infoAboutChildren();

        List<Company>workedFifthPerson = List.of();
        fifthPerson.setCompanies(workedFifthPerson);
        fifthPerson.workedOut();

        System.out.println("---------------------------------------------------------------------------------------");


        Worker sixthPerson = new Worker("Alisa", 49, 158, 51, 897.11, 7538.03);
        List<String> sixPersonChild = List.of("Noah", "Mia", "Jesse", "Gabriel");
        sixthPerson.setChild(sixPersonChild);
        double sixthPersonsPension = sixthPerson.calculatePension(16, 60);
        sixthPerson.infoAboutChildren();

        List<Company>workedSixthPerson = List.of(new Company("I.T. CONSORTIUM"), new Company("Adventhealth"), new Company("Tyco integrated security"));
        sixthPerson.setCompanies(workedSixthPerson);
        sixthPerson.workedOut();


        System.out.println("---------------------------------------------------------------------------------------");


        Pensioner seventhPerson = new Pensioner("Bruce", 71, 187, 71, 1965.75);
        List<String> seventhPersonChild = List.of("John", "Arnold", "Jason");
        seventhPerson.setChild(seventhPersonChild);
        seventhPerson.infoAboutChildren();
        seventhPerson.die(65);


        System.out.println("---------------------------------------------------------------------------------------");


        Worker eighthPerson = new Worker("Sarah", 19, 171, 61, 2358.07, 3154.44);
        List<String> eighthPersonChild = List.of("William", "Ava", "Olivia", "Melissa");
        eighthPerson.setChild(eighthPersonChild);
        double eighthPersonsPension = eighthPerson.calculatePension(17, 60);
        eighthPerson.infoAboutChildren();

        List<Company>workedEighthPerson = List.of(new Company("Checkers & Rally's"), new Company("McDonald's"));
        eighthPerson.setCompanies(workedEighthPerson);
        eighthPerson.workedOut();


        System.out.println("---------------------------------------------------------------------------------------");


        Pensioner ninthPerson = new Pensioner("Laura", 57, 172, 61, 5481.24);
        List<String> ninthPersonChild = List.of("Elijah", "Ellen", "Elliott", "Katherine");
        ninthPerson.setChild(ninthPersonChild);
        ninthPerson.infoAboutChildren();
        ninthPerson.die(43);


        System.out.println("---------------------------------------------------------------------------------------");


        Pensioner tenthPerson = new Pensioner("Monica", 25, 175, 89,7780.87);
        List<String> tenthPersonChild = List.of("Amelia", "Jonathan", "Sabrina");
        tenthPerson.setChild(tenthPersonChild);
        tenthPerson.infoAboutChildren();
        tenthPerson.die(23);
    }
}