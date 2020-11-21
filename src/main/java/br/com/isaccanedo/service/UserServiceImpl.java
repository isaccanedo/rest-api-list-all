package br.com.isaccanedo.service;

import br.com.isaccanedo.model.UserModel;
import br.com.isaccanedo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author Isac Canedo
 */

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserModel> listAll() {
        return userRepository.findAll();
    }
}
