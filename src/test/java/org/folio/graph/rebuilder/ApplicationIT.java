package org.folio.graph.rebuilder;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.folio.spring.testing.extension.EnablePostgres;
import org.folio.spring.testing.type.IntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@EnablePostgres
@IntegrationTest
@SpringBootTest
public class ApplicationIT {

  @Test
  void testApplicationIsUp() {
    assertTrue(true);
  }
}
