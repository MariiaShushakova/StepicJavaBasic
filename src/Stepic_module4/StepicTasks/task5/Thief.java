package Stepic_module4.StepicTasks.task5;
/*Thief – вор, который ворует самые ценные посылки и игнорирует все остальное. Вор принимает в конструкторе переменную int – минимальную стоимость посылки, которую он будет воровать. Также, в данном классе должен присутствовать метод getSumStolenValue, который возвращает суммарную стоимость всех посылок, которые он своровал. Воровство происходит следующим образом: вместо посылки, которая пришла вору, он отдает новую, такую же, только с нулевой ценностью и содержимым посылки "stones instead of {content}".*/

public class Thief implements MailService{
    private int minCostOfPackage; // минимальная стоимость посылки, которую он будет воровать
    private int sumStolenValue; //Здесь будем хранить сумму украденного

    public Thief(int minCostOfPackage) { //Вор принимает в конструкторе переменную int – минимальную стоимость посылки, которую он будет воровать.*/
        this.minCostOfPackage = minCostOfPackage;
        this.sumStolenValue = 0;   // При создании Вора сумма украденного будет = 0
    }

    public int getSumStolenValue() { //метод, который возвращает суммарную стоимость всех посылок, которые он своровал.
        return sumStolenValue;
    }
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) { //Проверяем sandable является ли посылкой
            MailPackage mail2 = (MailPackage) mail; // Создаем объект посылка, и присваиваем ему наше sandable

            /**Наша посылка состоит из:
             *   private final Package content;
             *
             *
             *   a Package, в свою очередь, состоит из:
             *   public static class Package {
                       private final String content;
                       private final int price;
             *
             *ПОэтому для того, что бы получить стоимость посылки, надо взять метод getPrice () от
             * метода getContent () объекта mail2.
             */
            if (mail2.getContent().getPrice() >= this.minCostOfPackage) { // Проверяем ценная ли посылка
                this.sumStolenValue += mail2.getContent().getPrice(); //Вор прибавляет стоимость воруемой посылки себе
                    /* Отдает вместо посылки,которая пришла вору, он отдает новую, такую же, только с нулевой ценностью
                     и содержимым посылки "stones instead of {content}"*/
                return new MailPackage(mail2.getFrom(), mail2.getTo(),
                        new Package(
                                "stones instead of " + mail2.getContent().getContent(), 0));
            }
        }
        return mail; //Вор отдает послыки с неценными посылками и письмами, без изменений
    }
}