package semester_1;

import java.util.Scanner;

class Character {
    public void sounds() {
    }
}

class Hero extends Character {
    public void sounds() {
        System.out.println("Aku adalah hero pembasmi Monster");
    }
}

class Monster extends Character {
    public void sounds() {
        System.out.println("Grrr! Arrghhh! Manusia, aku akan memangsamu!!");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Character knight = new Hero();
        Character goblin = new Monster();
        // knight.sounds();
        // goblin.sounds();

        System.out.println("Character yang tersedia: ");
        System.out.println("1. Knight Hero \n2. Goblin Monster");
        System.out.print("Pilihanmu: ");

        int pilihan = input.nextInt();

        if (pilihan == 1) {
            knight.sounds();
        } else if (pilihan == 2) {
            goblin.sounds();
        } else {
            System.out.println("pilihan tidak tersedia");
        }
    }
}
