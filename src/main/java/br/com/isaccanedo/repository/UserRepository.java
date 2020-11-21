package br.com.isaccanedo.repository;

import br.com.isaccanedo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Isac Canedo
 */

@Repository
public interface UserRepository extends JpaRepository <UserModel, Long> {
}
