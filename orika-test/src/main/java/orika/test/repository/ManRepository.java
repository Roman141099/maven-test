package orika.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import orika.test.model.Man;

public interface ManRepository extends JpaRepository<Man, String> {
}
