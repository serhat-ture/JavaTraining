package serhatcode.homework3;
/*Citizen ad?nda bir class olu?turunuz. Class’?n attribute leri tcNumber,name,surname(hepsi string) olmal?d?r.
Ayr?ca class ?n toString ve tüm attributelerini içeren contructor ?n? tan?mlaman?z? istiyorum.
Daha sonra main de Citizen s?n?f?n?n 2 objesini olu?turun.
Objelerden birini olu?tururken parametresiz contructor  ile olu?turunuz.
 Daha sonra toString i ile ekrana yazd?r?n?z.
  Di?er objeyi ise parametreli contructor  ile olu?turup toString ile ekrana yazd?r?n?z.*/

public class Citizen {
    String tcNumber;
    String name;
    String surName;

    public Citizen(String tcNumber) {
        this.tcNumber = tcNumber;
    }

    public Citizen(String tcNumber, String name, String surName) {
        this.tcNumber = tcNumber;
        this.name = name;
        this.surName = surName;
    }



    @Override
    public String toString() {
        return "Citizen{" +
                "tcNumber='" + tcNumber + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
