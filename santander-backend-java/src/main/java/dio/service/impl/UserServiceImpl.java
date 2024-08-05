package dio.service.impl;

import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;
import dio.domain.model.User;
import dio.domain.repository.UserRepository;
import dio.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        //if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
        //    throw new IllegalArgumentException("Este usuário já existe");
        //}
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("Este número de conta já existe");
        }
        return userRepository.save(userToCreate);
    }   
}