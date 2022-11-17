package com.yihuolu.atj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yihuolu.atj.entity.dataobject.StudentInfo;
import com.yihuolu.atj.service.StudentInfoService;
import com.yihuolu.atj.mapper.StudentInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author 31742
* @description 针对表【atj_student_info】的数据库操作Service实现
* @createDate 2022-11-17 14:33:55
*/
@Service
public class StudentInfoServiceImpl extends ServiceImpl<StudentInfoMapper, StudentInfo>
    implements StudentInfoService{

}




