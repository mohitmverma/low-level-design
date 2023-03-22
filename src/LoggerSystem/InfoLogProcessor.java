package LoggerSystem;

public class InfoLogProcessor extends LogProcessor {


    InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(String level, String msg) {
        if(level == "INFO") {
            System.out.println("info: " + msg);
        } else {
            super.log(level, msg);
        }
    }
}
