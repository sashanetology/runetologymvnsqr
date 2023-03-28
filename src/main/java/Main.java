import ru.netology.sqr.runetologymvnsqr.services.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        int number = service.calculate(100,101);
        System.out.println(number);
    }
}