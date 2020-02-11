public class Kaugus {
    
    //Muudab miilid kilomeetriteks
    static double mileToKm(double miles) {
        double km = 1.609 * miles;
        return km;
    }
    
    //Muudab kilomeetrid miilideks
    static double kmToMile(double km){
        double miles = km / 1.609;
        return miles;
    }
    
    
    //Kasutaja sisestab arvu
    public static void main(String[] args) {
        try{
            Scanner sc  =   new Scanner(System.in);
            System.out.print("Sisestage kaugus miilides: ");
            double miles   =   sc.nextDouble();
            System.out.println(miles+" Miili võrdub: "+mileToKm(miles)+" Km");
            
            System.out.print("Sisestage kaugus kilomeetrites: ");
            double km   =   sc.nextDouble();
            System.out.println(km+" kilomeetrit võrdub: "+kmToMile(km)+" miili");
            
            
        }
        catch(Exception E){
            System.err.println("Erand: "+E.getMessage());
        }
    }
}