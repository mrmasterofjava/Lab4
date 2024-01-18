import Enums.Action;
import Enums.Statuses;
import Interfaces.Smilable;
import classes.*;

/*
Малыш попытался объяснить, что это не живой человек, а только изображение, но Карлсон даже рассердился: Малыш мало что знал о телевидении, но он все же очень старался объяснить Карлсону, что это такое.
А кроме того, он хотел предостеречь Карлсона от грозящей ему опасности.
Но Карлсон прервал его новым взрывом хохота: Малыш вздохнул. Карлсон явно ничего не понял. Малыш начал объяснять все сначала.
Особым успехом эта попытка не увенчалась, но в конце концов ему все же удалось втолковать Карлсону, как удивительно действует эта штуковина.
Как раз в этот момент на экране появилось личико хорошенькой дикторши. Она так приветливо улыбалась, что Карлсон широко открыл глаза.
Дикторша продолжала улыбаться Карлсону, и он улыбался ей в ответ. Потом он оттолкнул Малыша в сторону.
*/

public class Main {
    public static void main(String[] args) throws DeadException {

        Malysh malysh = new Malysh("Малыш", Statuses.NORMAL);
        Karlson karlson = new Karlson("Карлсон", Statuses.NOUNDERSTAND);
        Laughter laughter = new Laughter("Хохот");





        malysh.approves();
        karlson.deleteStatus(Statuses.NORMAL);
        karlson.setStatus(Statuses.ANGRY);
        malysh.notEnoughToKnow();
        malysh.warn(karlson);
        Person.Face face = new Person.Face("Личико",Statuses.PRETTY);
        face.toAppear();

        //Анонимный класс
        Smilable announcer = new Smilable() {
            @Override
            public void smile(String name) {
                System.out.println(name + " улыбалась " + Statuses.FRIENDLY);
            }
        };
        announcer.smile("Дикторша");
        karlson.open();
        karlson.smile("Дикторша");

        karlson.explode(laughter);
        malysh.explode(laughter);
        karlson.stop(malysh);
        karlson.laugh();
        karlson.deleteStatus(Statuses.ANGRY);
        karlson.setStatus(Statuses.FUNNY);
        malysh.deleteStatus(Statuses.NORMAL);
        malysh.setStatus(Statuses.TRIED);

        malysh.Breathe();
        malysh.startingExplainig();
        malysh.explain(karlson, Action.ACTION_OF_THING);
        karlson.deleteStatus(Statuses.NOUNDERSTAND);
        karlson.setStatus(Statuses.UNDERSTAND);
        Karlson.Kik Kik = new Karlson.Kik();
        Kik.Kiking(malysh);
        malysh.toLoseHealth();

    }
}
