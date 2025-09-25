import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = -1;
        String st = scanner.nextLine();
        while (!st.isEmpty()) {
            st=st+" ";
            int value=-1;
            for(int i=0;i<st.length();i++)
            if(st.charAt(i)==' ')
            {
                if (value > max) max = value;
                if ((value < min && value>=0)||(min==-1)) min = value;
                value=-1;
            }else
            {
                if(value==-1)value=0;
                value=value*10+((int)st.charAt(i))-48;
            }
            st = scanner.nextLine();
        }
        System.out.println("Max: "+max+", Min: "+min);
    }
}
