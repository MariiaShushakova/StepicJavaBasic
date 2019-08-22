package Stepic_module4.StepicTasks.task5;
// UntrustworthyMailWorker – класс, моделирующий ненадежного работника почты, который вместо того, чтобы передать почтовый объект непосредственно в сервис почты, последовательно передает этот объект набору третьих лиц, а затем, в конце концов, передает получившийся объект непосредственно экземпляру RealMailService. У UntrustworthyMailWorker должен быть конструктор от массива MailService ( результат вызова processMail первого элемента массива передается на вход processMail второго элемента, и т. д.) и метод getRealMailService, который возвращает ссылку на внутренний экземпляр RealMailService.

public class UntrustworthyMailWorker implements MailService {
    private RealMailService realMailService;  //внутренний экземпляр RealMailService
    private MailService[] mailServices; //набор третьих лиц

    //конструктор от массива MailService
    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
        this.realMailService = new RealMailService();
    }

    /* моделирующий ненадежного работника почты, который вместо того,
     *  чтобы передать почтовый объект непосредственно в сервис почты, последовательно передает этот объект
     *  набору третьих лиц, а затем, в конце концов, передает получившийся объект непосредственно экземпляру RealMailService.*/
    public Sendable processMail(Sendable mail) {
        for (int i=0; i < mailServices.length; i++) { // for(MailService mailService : mailService) перебор набора третьих лиц
            mail = mailServices[i].processMail(mail); //результат вызова processMail первого элемента массива передается на вход processMail второго элемента
        }
        return realMailService.processMail(mail); /* а затем, в конце концов, передает получившийся объект непосредственно экземпляру RealMailService. */
    }

    public RealMailService getRealMailService() { //метод getRealMailService, который возвращает ссылку на внутренний экземпляр RealMailService.
        return this.realMailService;
    }
}

