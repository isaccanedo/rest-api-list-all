package br.com.isaccanedo.controller;

import br.com.isaccanedo.model.UserModel;
import br.com.isaccanedo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Isac Canedo
 */

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<UserModel> list() {
        return userService.listAll();
    }

}
