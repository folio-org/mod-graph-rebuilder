package org.folio.graph.rebuilder;

import static org.springframework.context.annotation.FilterType.REGEX;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "org.folio", excludeFilters = @ComponentScan.Filter(type = REGEX, pattern =
  {"org.folio.spring.tools.systemuser.*", "org.folio.spring.tools.batch.*"}))
public class GraphRebuilderApplication {

  public static void main(String[] args) {
    SpringApplication.run(GraphRebuilderApplication.class, args);
  }

}
