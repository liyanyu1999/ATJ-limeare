package com.yihuolu.atj.interceptor;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;

public class MyBatisPluginInterceptor {
    @Bean
    public MybatisPlusInterceptor
    mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor =
                new MybatisPlusInterceptor();

        interceptor.addInnerInterceptor(new
                PaginationInnerInterceptor(DbType.MYSQL));
        interceptor.addInnerInterceptor(new
                OptimisticLockerInnerInterceptor());
        return interceptor;
    }
}
