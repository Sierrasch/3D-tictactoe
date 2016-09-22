public class Main {
    public static void main(String[] args) {
        setLoggingLevel(ch.qos.logback.classic.Level.INFO);

        Server server = new Server();
        server.setup();
    }

    public static void setLoggingLevel(ch.qos.logback.classic.Level level) {
        ch.qos.logback.classic.Logger root = (ch.qos.logback.classic.Logger) org.slf4j.LoggerFactory.getLogger(ch.qos.logback.classic.Logger.ROOT_LOGGER_NAME);
        root.setLevel(level);
    }
}