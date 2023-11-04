package lk.ijse.Travel_Planning_System.UsersServices.service;

import lk.ijse.Travel_Planning_System.UsersServices.dto.UserDTO;
import lk.ijse.Travel_Planning_System.UsersServices.dto.UserLoginDTO;
import lk.ijse.Travel_Planning_System.UsersServices.util.Response;

public interface UserService {

    UserDTO saveUser(UserDTO userDTO);

    Response loginUser(UserLoginDTO userLoginDTO);
}
