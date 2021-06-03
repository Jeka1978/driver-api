package proxy_pattern;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface PersonRepo {

    List<Person> findSomePersons();
}
