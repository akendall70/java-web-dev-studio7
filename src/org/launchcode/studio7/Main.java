package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD newCd = new CD ("Enema of the State", 4000, "Compact Disc/ CD-RW", 400, 3600, 128);
        DVD newDVD = new DVD ("Mission Impossible", 8000, "Digital Video Disc", 0, 8000, 1080);

        System.out.println(newCd);
        System.out.println(newDVD);

        newCd.spinDisc();
        newCd.playDisc();
        newCd.skip();
        newCd.previous();

        newDVD.spinDisc();
        newDVD.playDisc();
        newDVD.skip();
        newDVD.previous();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
