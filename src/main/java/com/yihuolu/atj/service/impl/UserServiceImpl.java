package com.yihuolu.atj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yihuolu.atj.entity.dataobject.User;
import com.yihuolu.atj.service.UserService;
import com.yihuolu.atj.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 31742
* @description 针对表【atj_user】的数据库操作Service实现
* @createDate 2022-11-17 14:33:55
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




