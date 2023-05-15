public class Main {
    public static void main(String[] args){


    MyConverter converter = new MyConverter();


    double cm = 700;
    double meter = converter.cmToMeter(cm);
            System.out.println(cm + " سم = " + meter + " متر");

    meter = 3;
    cm = converter.meterToCm(meter);
            System.out.println(meter + " متر = " + cm + " سم");

    meter = 3000;
    double km = converter.meterToKm(meter);
            System.out.println(meter + " متر = " + km + " كم");


    km=6.5;
    meter = converter.kmToMeter(km);
            System.out.println(meter +"  متر ="+km + "كم ");


}

}