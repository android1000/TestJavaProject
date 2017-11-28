package NewPackage;

public class NewClassInNewProject {
    public static void main(String[] args) {
        DoPrintlnMoreTimes("Fuck yea", 5);
    }

    public static void DoPrintlnMoreTimes(String s, int count){
        for (int i=0;i<count;i++){
            System.out.println(s);
        }
    }

}
