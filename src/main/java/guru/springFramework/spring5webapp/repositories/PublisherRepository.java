package guru.springFramework.spring5webapp.repositories;

import guru.springFramework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kyrie on 4/2/19.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long>{
}
