package QUIZ_PRAKTIKUM;

public class GameTest {
    public static void main(String[] args) {
        // Ganti nama player dengan nama kamu
        Player p1 = new Player("Dimas", 120, 25, 5);

        Monster m1 = new Monster("Goblin", 80, 15, "Goblin");
        Monster m2 = new Monster("Dragon", 200, 30, "Dragon");
        BossMonster boss = new BossMonster("Demon Lord", 300, 50, "Demon");

        Character[] characters = {m1, m2, boss};

        // Simulasi pertarungan
        System.out.println("=== Battle Start ===");

        while (p1.getHealth() > 0 && 
              (m1.getHealth() > 0 || m2.getHealth() > 0 || boss.getHealth() > 0)) {

            // Player menyerang dulu
            if (m1.getHealth() > 0) p1.attack(m1);
            else if (m2.getHealth() > 0) p1.attack(m2);
            else if (boss.getHealth() > 0) p1.attack(boss);

            // Player bisa healing tiap ronde
            p1.heal(10);

            // Musuh menyerang balik
            for (Character c : characters) {
                if (c.getHealth() > 0) {
                    c.attack(p1);
                }
            }

            System.out.println("---------------------------");
        }

        System.out.println("=== Battle End ===");
        if (p1.getHealth() <= 0) {
            System.out.println(p1.getName() + " has been defeated!");
        } else {
            System.out.println(p1.getName() + " wins the battle!");
        }
    }
}