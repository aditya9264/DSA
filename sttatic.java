class Sstudent {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }
}
public class sttatic {
    public static void main(String[] args) {
        Sstudent.school = "ABC";
        Sstudent st1 = new Sstudent();
        st1.name = "tony";
        System.out.println(st1.school);
    }
}
