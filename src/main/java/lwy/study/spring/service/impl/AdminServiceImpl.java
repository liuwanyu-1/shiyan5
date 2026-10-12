package lwy.study.spring.service.impl;

import lwy.study.spring.mapper.AdminMapper;
import lwy.study.spring.service.IAdminService;
import lwy.study.spring.vo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Boolean login(String email, String password) {

        Admin admin = adminMapper.selectByEmail(email);
//        int i = 1 / 0;
        //有对应email账号存在
        if (admin != null) {
            if (admin.getAdminPassword().equals(password)) {
                return true;
            }else{
                //账号对、密码不对
                return false;
            }
        }
        //账号不对
        return false;
    }
}
