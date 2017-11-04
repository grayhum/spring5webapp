package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mansoo@woowahan.com on 2017. 11. 5..
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long>{
}
