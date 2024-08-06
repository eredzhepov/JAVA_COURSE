package org.example.HomeWork.Lesson26;

public class HomeWork26 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("myaso");
        try {
           t.drink("voda");
           try {
              t.drink("pivo");
           }catch (NeWodaException e2){
               System.out.println(e2.getMessage());}
           catch (Exception e2){
                   System.out.println(e2.getMessage());
           }finally {
               System.out.println("Eto finally inner block");
           }
        }
        catch (RuntimeException e3){
            System.out.println(e3.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
class NeMyasoException extends RuntimeException {
    NeMyasoException(String s){
        super(s);
    }
}
class NeWodaException extends Exception{
    NeWodaException(String s){
        super(s);
    }
}
class Tiger{
    void eat(String food){
        if(food.equals("myaso")){
            System.out.println("Tiger yest myaso");
        } else {
            throw new NeMyasoException("Tiger ne est " + food);
        }
    }
    void drink(String voda) throws Exception{
        if(voda.equals("voda")){
            System.out.println("Tiger pyet vodu");
        } else {
            throw new NeWodaException("Tiger ne pyet " + voda);
        }
    }
}
