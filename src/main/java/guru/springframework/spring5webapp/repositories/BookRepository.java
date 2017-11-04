package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mansoo@woowahan.com on 2017. 11. 5..
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
