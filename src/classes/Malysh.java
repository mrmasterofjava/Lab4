package classes;

import Enums.*;
import Interfaces.Explanation;
import Interfaces.Explosive;

public class Malysh extends Person implements Explanation, Explosive {
    private String name;
    private Statuses status;


    public Malysh(String name, Statuses status) {
        super(name, status);
        this.name = name;
        this.status = status;
    }


    @Override
    public void explode(Laughter l) {

        status = Statuses.TRIED;
        System.out.println(l.getName() + " " + null);
        System.out.println("Хохот взорвался");

    }


    public void Breathe() {
        System.out.println(name + " вздыхает");

    }

    public void startingExplainig() {
        System.out.println(Action.START_EXPLAINING);
    }

    public void explain(Karlson k, Action what) {
        System.out.println(name + " объясняет " + k.getName() + " " + what);
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.println(Attempt.UNLUCKY);

            } else {
                System.out.println(name + " объясняет " + k.getName() + " " + what + " заново");
                System.out.println(Attempt.LUCKY);
            }


        }
    }

    public void approves() {
        // 2 Локальных класса
        class LivingPerson {
            String name;

            public LivingPerson(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }
        class Picture {
            String name;

            public Picture(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }
        LivingPerson livingPerson = new LivingPerson("Живой человек");
        Picture picture = new Picture("Изображение");
        System.out.println(name + " утверждает, что это не " + livingPerson.getName() + " а " + picture.getName());


    }

    public void notEnoughToKnow() {
        // Локальный класс
        class Television {
            private String name;

            public Television(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }
        Television television = new Television("Телевидение");
        System.out.println(name + " мало знал о " + television.getName());
    }

    public void warn(Karlson k) {
        //Локальный класс
        class Danger {
            private String name;
            private Statuses status;

            public Danger(String name, Statuses status) {
                this.name = name;
                this.status = status;
            }

            public String getName() {
                return name;
            }

            public Statuses getStatus() {
                return status;
            }
        }
        Danger danger = new Danger("Опасность", Statuses.THREATENING);
        System.out.println(name + " предостерегает " + k.getName() + " o " + danger.getStatus() + " " + danger.getName());
    }

    public void toLoseHealth() throws DeadException {
        int health = (int)(Math.random()*10);
        if (health == 0) {
            throw new DeadException(name + " умер ");
        } else{
            System.out.println(name + " потерял " + health + " здоровья" );
        }


    }
}