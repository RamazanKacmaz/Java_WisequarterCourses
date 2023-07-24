package day27_parametreliConsructer;

public class C02_hastaneRunner {
    public static void main(String[] args) {

        C01_kranken personel1 = new C01_kranken();

        System.out.println(personel1.oersonelIsmi);
        System.out.println(personel1.personelte);
        System.out.println(personel1.hastaneAdi);
        System.out.println(personel1.hastenetel);

        personel1.personelte ="125489";
        personel1.oersonelIsmi = "mertkan";

        C01_kranken personel2 = new C01_kranken();
        System.out.println(personel2.oersonelIsmi);
        System.out.println(personel2.personelte);


    }
}
