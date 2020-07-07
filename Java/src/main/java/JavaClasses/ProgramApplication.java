package JavaClasses;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class ProgramApplication {
    public static void main(String[] args) {
        Cars carOne = new Cars(Make.FORD,"S-MAX",2008, Color.BLACK,10340,"0123 ВМ-4");
        Cars carTwo = new Cars(Make.LEXUS,"RX",2004, Color.WHITE,9650,"4111 II-4");
        Cars carThree = new Cars(Make.PEUGEOT,"607",2000, Color.BLUE,4830,"7564 BB-4");
        Cars carFour = new Cars(Make.RENAULT,"Scenic",2006, Color.WHITE,4900,"7621 IM-3");
        Cars carFive = new Cars(Make.OPEL,"Vectra",2000, Color.GREEN,3800,"6889 HI-6");
        Cars carSix = new Cars(Make.LEXUS,"LS",2002, Color.RED,10000,"4100 НЕ-7");
        Cars carSeven = new Cars(Make.FORD,"S-MAX",2012, Color.BLUE,12400,"1167 CA-7");

        List<Cars> cars = Arrays.asList(carOne, carTwo, carThree, carFour, carFive, carSix, carSeven);
        Program program=new Program(cars);
        program.run();
    }
}
