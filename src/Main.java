public class Main {
    public static void main(String[] args) {

        solarSystemBasic s = new solarSystemBasic();
        s.moon="2";
        s.sun="1";
        s.Planet="2";
        s.star="4";

        featureSun fS = new featureSun();
        fS.name="laura";
        fS.color="yellow";
        fS.heat="40939302F";


        planetOne p1 = new planetOne();
        p1.name="voila";
        p1.color="pink";
        p1.temp="-45celcius";
        p1.size="1cm";

        planetTwo p2 = new planetTwo();
        p2.name="horwa";
        p2.color="white";
        p2.temp="25 celcius";
        p2.size="1234billion km";

    }
}
