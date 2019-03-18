package guru.springFramework.spring5webapp.repositories;

import guru.springFramework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kyrie on 3/17/19.
 */
public interface BookRepository extends CrudRepository<Book, Long>{

}
