package com.fuck.service.impl;

import com.fuck.dao.TestDao;
import com.fuck.service.TestService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * DESCRIPTION:
 *
 * @author
 * @create 2018-04-11 上午11:53
 * created by fuck~
 **/
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestDao testDao;

    @Override
    public List<Map<String, Object>> queryData() {
        return testDao.queryData();
    }
}
