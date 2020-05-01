package com.ytmj.jzgl.service.impl;

import com.github.pagehelper.PageHelper;
import com.ytmj.jzgl.domain.ICheck;
import com.ytmj.jzgl.domain.PCheck;
import com.ytmj.jzgl.mapper.CheckMapper;
import com.ytmj.jzgl.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-18 21:47
 */
@Service
@Transactional
public class CheckServiceImpl implements CheckService {
    @Autowired
    private CheckMapper checkMapper;
    @Override
    public List<ICheck> findAllCheck() {
        return checkMapper.findAllCheck();
    }

    @Override
    public List<PCheck> findAllPCheck(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        return checkMapper.findAllPCheck();
    }

    @Override
    public void addPcheck(String name, String pname) {
        checkMapper.addPcheck(name,pname);
    }

    @Override
    public void deleteCheck(Integer id) {
        checkMapper.deleteCheck(id);
    }
}
