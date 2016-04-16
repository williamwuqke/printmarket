package com.printmarket.service.imp;

import com.printmarket.model.UserInfoDO;
import com.printmarket.service.MemberCenterService;
import org.springframework.stereotype.Service;

/**
 * Created by wuqiongke on 15/12/1.
 */
@Service(value = "memberCenterService")
public class MemberCenterServiceImp implements MemberCenterService {

    public boolean registerMember(UserInfoDO userInfoDO) {
        System.out.println("service has been autowired");
        return false;
    }
}
