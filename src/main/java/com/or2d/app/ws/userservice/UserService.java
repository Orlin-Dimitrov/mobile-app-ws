package com.or2d.app.ws.userservice;

import com.or2d.app.ws.ui.model.request.UserDetailsRequestModel;
import com.or2d.app.ws.ui.model.response.UserRest;

public interface UserService {

	UserRest createUser(UserDetailsRequestModel userDetails);
}
