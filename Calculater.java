/**
 * Created by ktw on 2017-06-29.
 */
public class Calculater{
    Double a;
    Double b;
    public void Calculater(Double a, Double b){
        this.a = a;
        this.b = b;
    }
    public Double plus(){
        return a + b;
    }
    public Double minus(){
        return a - b;
    }
    public Double multiply(){
        return a * b;
    }
    public Double Distribute(){
        return  a / b;
    }
    //    public Double plus(Double a, Double b){
//        return a + b;
//    }
//    public Double minus(Double a, Double b){
//        return a - b;
//    }
//    public Double multiply(Double a, Double b){
//        return a * b;
//    }
//    public Double Distribute(Double a, Double b){
//        return  a / b;
//    }
}
