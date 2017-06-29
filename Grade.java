/**
 * Created by ktw on 2017-06-29.
 */
public class Grade {
    public void Distribute(int a){
        if(a>80) {
            System.out.println("A");
        }
        else if(a>60){
            System.out.println("B");
        }
        else if(a>40){
            System.out.println("C");
        }
        else if(a<=40){
            System.out.println("F");
        }
    }

}
