package excercism;

public class LogLevels {

    private static final String[] LOG_LEVELS = new String[] {"INFO", "WARNING", "ERROR"};

    public static String message(String logLine) {
        String output =  logLine
                .replace("\t", "")
                .replace("\r", "")
                .replace("\n", "");
        for(String lvl : LOG_LEVELS) {
            String startToken = LogLevels.generateStartToken(lvl);
            output = output.replace(startToken, "");
        }
        return output.trim();
    }

    public static String logLevel(String logLine) {
        for(String lvl: LOG_LEVELS) {
            String startToken = LogLevels.generateStartToken(lvl);
            if (logLine.startsWith(startToken)) {
                return lvl.toLowerCase();
            }
        }
        return "";
    }

    public static String reformat(String logLine) {
        String msg = LogLevels.message(logLine);
        String level = LogLevels.logLevel(logLine);
        return msg + " (" + level + ")";
    }

    private static String generateStartToken(String lvl)  {
        return "[" + lvl + "]:";
    }
}