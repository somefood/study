package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit[] members = {member1};

        for (MemberInit member : members) {
            System.out.println(member.name + " " + member.age + " " + member.grade);
        }
    }
}
