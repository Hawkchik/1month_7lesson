public class Family {
    public static void main(String[] args) {
        Father Roman = new Father();
        Son Ivan = new Son();
        Roman.Eyes="Brown";
        Roman.Height=170;
        Roman.Hair="Black";

        Roman.start();
        Roman.volleybol(1);

        Ivan.Eyes="Blue";
        Ivan.Hair="Black";
        Ivan.volleybol(2);
        Ivan.finish();



    }
}
