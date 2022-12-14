package org.example;

public class House {
        // all ways public
        public static void main(String[] args) {
                Kitchen a = new Kitchen();
                a.check();
                BedRoom b = new BedRoom();
                b.check();
                Garage c = new Garage();
                System.out.println(c);
        }
}

class Kitchen {
        String a;
        Kitchen(){
                System.out.println("Constructor A");
        }

        void check() {
                System.out.println("Check Class A");
        }
}

class BedRoom {
        String b;
        BedRoom(){
                System.out.println("Constructor B");
        }

        void check() {
                System.out.println("Check Class B");
        }
}

class Garage {
        String c;
}