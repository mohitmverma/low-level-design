package LoggerSystem;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(String level, String msg) {
        if(level == "ERROR") {
            System.out.println("error: " + msg);
        } else {
            super.log(level, msg);
        }
    }
}
