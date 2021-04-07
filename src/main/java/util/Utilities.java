package util;

import org.apache.log4j.Logger;
import register.Register;

import java.util.Random;

/**
 * Created by rsingh on 8/5/18.
 */
public class Utilities {
  private final static Logger logger = Logger.getLogger(Register.class);

  public static void pegCpu() {
    logger.info("pegging cpu");
    Random r = new Random();
    int counter = 0;
    for (int i = 0; i < 100000; i++) {
      if (i % 100 == 0) {
        logger.info("counter is " + counter + " rand is " + r.nextInt());
      }
      if (i % 2 == 0) {
        counter += r.nextInt(100);
      }
    }
  }
}
