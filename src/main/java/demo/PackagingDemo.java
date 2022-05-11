package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PackagingDemo {

  private static final Logger log = LogManager.getLogger(PackagingDemo.class);

  public static void main(String[] args) {
    String name = "World";
    if (args.length > 0) {
      name = args[0];
    }
    log.info("Hello " + name);
  }

}
