package Stepic_module4.StepicTasks.task5;

import Stepic_module4.StepicTasks.task5.exceptions.IllegalPackageException;
import Stepic_module4.StepicTasks.task5.exceptions.StolenPackageException;
/*Inspector – Инспектор, который следит за запрещенными и украденными посылками и бьет тревогу в виде исключения, если была обнаружена подобная посылка. Если он заметил запрещенную посылку с одним из запрещенных содержимым ("weapons" и "banned substance", то он бросает IllegalPackageException. Если он находит посылку, состоящую из камней (содержит слово "stones"), то тревога прозвучит в виде StolenPackageException. Оба исключения вы должны объявить самостоятельно в виде непроверяемых исключений.*/

public class Inspector implements MailService {
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) { //Проверка посылка ли пришла
            MailPackage mail2 = (MailPackage) mail;

            //Если он заметил запрещенную посылку с одним из запрещенных содержимым "weapons" и "banned substance"), то он бросает IllegalPackageException.
            if (mail2.getContent().getContent().contains("weapons") ||
                    mail2.getContent().getContent().contains("banned substance")) {
                throw new IllegalPackageException();
            }
                //Если он находит посылку, состоящую из камней (содержит слово "stones") то тревога прозвучит в виде StolenPackageException.
            if (mail2.getContent().getContent().contains("stones"))
                throw new StolenPackageException();
            return mail2;
        }
        return mail;
    }
}

