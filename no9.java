import java.util.*;

public class no9 {
    ArrayList <String> list = new ArrayList<String>();

    public void display() {
        list.add("CSE");
        list.add("ISE");
        list.add("ME");
        System.out.println("ArrayList element are");
        System.out.println(list);
        System.out.println("");
    }

    public void appendEnd() {
        System.out.println("Enter the element to append at end");
        Scanner sc = new Scanner(System.in);
        String ele = sc.next();
        list.add(ele);
        System.out.println("Element added");
    }

    public void insertPOS() {
        System.out.println("Enter the position and element to insert");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        String ele = sc.next();
        list.add(pos, ele);
        System.out.println("Element inserted");
    }

    public void search()
    {
        System.out.println("Enter the Array element to search");
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        int in = list.indexOf(key);
        if(in == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at " + in);
        }
    }

    void print() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting character");
        char c = sc.next().charAt(0);
        System.out.println("String starting with character " + Character.toString(c));

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).startsWith(Character.toString(c))) {
                System.out.println(list.get(i));
            }
        }
    }

    public static void main(String args[]) {
        no9 obj = new no9();
        obj.appendEnd();
        obj.insertPOS();
        obj.search();
        obj.print();
        obj.display();
    }
}
