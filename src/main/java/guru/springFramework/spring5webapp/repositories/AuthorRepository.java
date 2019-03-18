package guru.springFramework.spring5webapp.repositories;

import guru.springFramework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kyrie on 3/17/19.
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{
}
