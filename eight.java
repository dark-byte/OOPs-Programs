import java.util.Random;

class Square extends Thread{
    int num;
    Square(int num){
        this.num = num;
    }

    public void run(){
        int square = num * num;
        System.out.printf("Sqauare of %d is %d\n", num, square);
    }
}

class Cube extends Thread{
    int num;
    Cube(int num){
        this.num = num;
    }

    public void run(){
        int cube = num * num * num;
        System.out.printf("Cube of %d is %d\n", num, cube);
    }
}



public class eight extends Thread{

    public void run(){
        Random random = new Random();
        for(int i = 0; i<5; i++){
            int randInt = random.nextInt(10);
            System.out.println("Random Integer = " + randInt);
            
            Square s = new Square(randInt);
            s.start();
    
            Cube c = new Cube(randInt);
            c.start();
            try{
                Thread.sleep(1000);
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String args[]){
        eight e = new eight();
        e.start();
    }
}
