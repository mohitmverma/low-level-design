package LoggerSystem;

public class DebugLogProcessor extends LogProcessor {
    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(String level, String msg) {
        if(level == "DEBUG") {
            System.out.println("debug: " + msg);
        } else {
            super.log(level, msg);
        }
    }

}
