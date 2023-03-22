package LoggerSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chain of Responsibility Logger System");

        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log("ERROR", "message");

    }
}
