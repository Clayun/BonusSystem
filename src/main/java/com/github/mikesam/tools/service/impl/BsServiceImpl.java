package com.github.mikesam.tools.service.impl;

import com.github.mikesam.tools.model.MUser;
import com.github.mikesam.tools.model.TUser;
import com.github.mikesam.tools.mapper.BsMapper;
import com.github.mikesam.tools.service.BsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mikesam on 2017/9/6.
 */
@Service
public class BsServiceImpl implements BsService {

    @Autowired
    private BsMapper bsMapper;

    @Override
    public void insertUser(TUser tUser) {
        bsMapper.insertUser(tUser.getUuid(),tUser.getUsername(),tUser.getRecommenderUuid(),tUser.getPhone(),tUser.getKeyString());
    }

    @Override
    public void createUser(MUser mUser) {

    }
}
