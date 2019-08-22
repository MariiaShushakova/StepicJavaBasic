package Stepic_module4.StepicTasks.task5;
import java.util.logging.Level;
import java.util.logging.Logger;
/*Spy – шпион, который логгирует о всей почтовой переписке, которая проходит через его руки. Объект конструируется от экземпляра Logger, с помощью которого шпион будет сообщать о всех действиях. Он следит только за объектами класса MailMessage и пишет в логгер следующие сообщения (в выражениях нужно заменить части в фигурных скобках на значения полей почты):
       2.1) Если в качестве отправителя или получателя указан "Austin Powers", то нужно написать в лог сообщение с уровнем WARN: Detected target mail correspondence: from {from} to {to} "{message}"
       2.2) Иначе, необходимо написать в лог сообщение с уровнем INFO: Usual correspondence: from {from} to {to}*/

public class Spy implements MailService{
    public static final String AUSTIN_POWERS = "Austin Powers"; // закомментить потом
    private final Logger logger; // внутренний логгер, во избежание беды

    public Spy(final Logger logger) {// Объект конструируется от экземпляра Logger
        this.logger = logger;
    }

    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) { // проверяем, что входящая почта  MailMessage (так как  Он следит только за объектами класса MailMessage) ИЗ условия - Для определения, посылкой или письмом является Sendable объект воспользуйтесь оператором instanceof.
            MailMessage mail2 = (MailMessage) mail; //создаем объект (MailMessage) и присваиваем ему пришедший (Sendable) mail
            /* Если в качестве отправителя или получателя указан "Austin Powers", то нужно написать в лог сообщение с уровнем WARN:
     Detected target mail correspondence: from {from} to {to} "{message}" */

            if (mail2.getFrom().equals(AUSTIN_POWERS) || mail2.getTo().equals(AUSTIN_POWERS)) {
                this.logger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                        new Object[]{mail2.getFrom(), mail2.getTo(), mail2.getMessage()});
            }
            /*Иначе, необходимо написать в лог сообщение с уровнем INFO: Usual correspondence: from {from} to {to}*/
            else {
                logger.log(Level.INFO, "Usual correspondence: from {0} to {1}",
                        new Object[]{mail2.getFrom(), mail2.getTo()});
            }
        }
        return mail; // метод класса возвращает почту в вызыващий его код
    }
}

