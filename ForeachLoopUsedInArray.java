package DS_Java_Training;

public class ForeachLoopUsedInArray {
    public static void main(String[] args) {

        String[] name = new String[5];
        name = new String[]{"wasif" , "harsh" ,"mayank","rahul","yasharth"};

        name[2] = "Kuch bhi";

        for (String i : name) {
            System.out.println(i);
        }



    }
}
