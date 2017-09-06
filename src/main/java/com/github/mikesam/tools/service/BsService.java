package com.github.mikesam.tools.service;

import com.github.mikesam.tools.model.MUser;
import com.github.mikesam.tools.model.TUser;
import org.springframework.stereotype.Service;

/**
 * Created by Mikesam on 2017/9/6.
 */
@Service
public interface BsService {

    void insertUser(TUser tUser);

    void createUser(MUser mUser);

}
