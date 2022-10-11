package hu.petrik.autok;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Auto> autoList = new ArrayList<>();

    public static void main(String[] args) {
        Porsche p1 = new Porsche(60);
        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Porsche p2 = new Porsche(120);
        Porsche p3 = new Porsche(200);

        autoList.add(p1);
        autoList.add(t1);
        autoList.add(t2);
        autoList.add(p2);
        autoList.add(p3);
    }
}
