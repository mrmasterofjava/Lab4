package classes;

import Enums.Statuses;
import Interfaces.Explosive;
import Interfaces.Smilable;

public class Karlson extends Person implements Explosive, Smilable {

    private static String name;
    private Statuses status;

    public Karlson(String name, Statuses status) {
        super(name, status);
        this.name = name;
        this.status = status;
    }

    @Override
    public void explode(Laughter l){
        status = Statuses.FUNNY;
        System.out.println(name + " " + status);
    }

    public void stop(Malysh m) {
        System.out.println(name + " прервал " + m.getName());
    }

        public void laugh() {
            System.out.println(name + " засмеялся ");
        }

        //Вложенный класс
        class Eyes{
            private String name;
            private Statuses status;

            public Eyes(String name,Statuses status) {
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
        Eyes eyes = new Eyes("Глаза",Statuses.WIDELY);

        public void open(){
            System.out.println(name + " " + eyes.getStatus() + " открыл " + eyes.getName());
        }

        @Override
        public void smile(String name){
            System.out.println(this.name + " засмеялся в ответ " + name);
        }

    public static class Kik{
        public static void Kiking(Malysh malysh) {
            int luck = (int)(Math.random()*10 + 1);
            if (luck < 0.01) {
                try {
                    throw new KIkingExeption("Не получилось толкнуть.");
                } catch (KIkingExeption e) {
                    e.printStackTrace();
                }
            }

            Do_kik(malysh);


            }
        }

        private static void Do_kik(Malysh malysh) {
            System.out.println(name+ " толкнул " + malysh.getName() );
        }
    }
