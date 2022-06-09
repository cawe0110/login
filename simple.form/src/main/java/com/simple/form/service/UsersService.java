package com.simple.form.service;

import com.simple.form.model.UsersModel;
import com.simple.form.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UsersModel registerUser(String login, String password, String email){
        if (login == null || password == null) {
            return null;
        } else {
            UsersModel usersModel= new UsersModel();
            UsersModel.setLogin(login);
            UsersModel.setPassword(password);
            UsersModel.setEmail(email);
            return usersRepository.save(usersModel);
        }
    }

    public UsersModel authenticate(String login, String password ){
        return usersRepository.findByLoginAndPassword(login, password)
        //minuto 8:39 link do video(https://www.youtube.com/watch?v=x_nfnVU0wAI)
    }
}
