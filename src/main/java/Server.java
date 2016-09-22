import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.*;

/**
 * Created by jalexander on 9/22/2016.
 */
public class Server {
    public void setup(){
        Logger logger = LoggerFactory.getLogger(this.getClass());

        logger.info("Starting server.");

        port(8080); // Runs on port 8080 by default
        get("/hello", (req, res) -> {
            logger.info("Received request to /hello");
            return "Hello world";
        });
        get("/hi", (req, res) -> {
            logger.info("Received request to /hi");
            return "Hi world";
        });

        logger.info("Server setup complete.");
    }
}
