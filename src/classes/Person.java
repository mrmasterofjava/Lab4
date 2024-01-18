package classes;


import Enums.Statuses;


public abstract class Person {
    private String name;

    private Statuses status;

    public Person(String name, Statuses status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
        }


    public void setStatus(Statuses stat) {
        this.status = stat;
        System.out.println("---Добавлено состояние объекта " + this.name + ": " + status);

    }

    public void deleteStatus(Statuses status) {
        this.status = status;
        System.out.println("---Из состояния объекта " + this.name + " удаляется: " + status);
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    // Статический вложенный класс
    public static class Face{
        private String name;
        private Statuses status;

        public Face(String name, Statuses status) {
            this.name = name;
            this.status = status;
        }

        public void toAppear(){
            //Локальный класс
            class Display{
                private String name;

                public Display(String name) {
                    this.name = name;
                }

                public String getName() {
                    return name;
                }
            }
            Display display = new Display("Экран");
            System.out.println(status + " " + name + " появилось на " + display.getName() );
        }
    }
}


