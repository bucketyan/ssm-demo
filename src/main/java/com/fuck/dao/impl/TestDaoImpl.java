package com.fuck.dao.impl;

import com.fuck.dao.TestDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * DESCRIPTION:
 *
 * @author
 * @create 2018-04-11 下午2:04
 * created by fuck~
 **/
@Repository
public class TestDaoImpl implements TestDao {

    @Resource
    private SqlSession sqlSession;

    @Override
    public List<Map<String, Object>> queryData() {
        return sqlSession.selectList("DataSourceMapper.query");
    }
}
