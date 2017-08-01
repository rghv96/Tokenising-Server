package hello;

import org.springframework.data.repository.CrudRepository;

import hello.Dsm;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface DsmRepository extends CrudRepository<Dsm, String> {
  List<Dsm> findByLast4(String last4);
}
