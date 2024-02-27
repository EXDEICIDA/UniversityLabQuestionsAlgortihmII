public class SportCenter {
    private String name;
    private Member[] members;
    private int count;

    public SportCenter(String name, int capacity) {
        this.name = name;
        this.members = new Member[capacity];
        this.count = 0;
    }

    public void addMember(Member member) {
        if (count < members.length) {
            members[count++] = member;
            System.out.println(member.getName() + " " + member.getSurname() + " added to the center.");
        } else {
            System.out.println("Cannot add member, the center is full.");
        }
    }

    public void search(String name, String surname) {
        for (Member member : members) {
            if (member != null && member.getName().equalsIgnoreCase(name) && member.getSurname().equalsIgnoreCase(surname)) {
                member.display();
                return;
            }
        }
        System.out.println("Member not found.");
    }

    public void printAllMembers() {
        System.out.println("Members of " + this.name + ":");
        for (Member member : members) {
            if (member != null) {
                member.display();
            }
        }
    }
}

