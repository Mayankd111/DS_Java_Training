package DS_Java_Training;

public class ArrayDemo {
    public static void main(String[] args) {

        String[] name = new String[5];
        name = new String[]{"wasif" , "harsh" ,"mayank","rahul","yasharth"};

        name[2] = "Kuch bhi";

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }



    }


}
