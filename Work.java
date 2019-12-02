package BTU;

import java.util.ArrayList;
import java.util.Random;

public class Work implements Manage{
    ArrayList col = new ArrayList();
    ArrayList col2=new ArrayList();
    Random rand=new Random();
    @Override
    public void collection1() {
        for (int i=0; i<12; i++){
            col.add(rand.nextInt(50));
        }
        System.out.println("N1-1:"+col);
        for (int i=2; i<col.size(); i+=1){
            col.remove(i);
        }
        System.out.println("N1-2:"+col);
    }

    @Override
    public void collection2() {
        for (int i=0; i<12; i++){
            col2.add(rand.nextInt(10-5)+5);
        }
        System.out.println("N2-1:"+col2);
        for (int i=3; i<col2.size(); i+=3){
            col2.add(i,rand.nextInt(25-20)+20);
        }
        System.out.println("N2-2:"+col2);
    }
}
