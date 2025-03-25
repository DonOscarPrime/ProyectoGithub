public class PruebaPersona {

    public static void main(String[] args) {

        persona p1= new persona("Oscar","Cruz","2000000L");

        persona p2= new persona("Oswaldo","de la Cruz","2000000L");


        if(p1.equals(p2)){
            System.out.println("los dos tienen el mismo dni");
        }else {
            System.out.println("son personas distintas");
        }







    }

}
