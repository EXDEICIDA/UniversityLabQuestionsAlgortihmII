public class Main {
    public static void main(String[] args) {
        SportCenter center = new SportCenter("DEU Fitness Center", 3);

        Member member1 = new Member("John", "Doe", 1.80, 75); // Height in meters
        Member member2 = new Member("Alice", "Smith", 1.70, 60);
        Member member3 = new Member("Bob", "Johnson", 1.75, 85);

        center.addMember(member1);
        center.addMember(member2);
        center.addMember(member3);

        center.printAllMembers();

        System.out.println("Weight status for John Doe: " + member1.getWeightStatus());

        center.search("Alice", "Smith");
    }
}
