package com.ytmj.jzgl.service.impl;

import com.github.pagehelper.PageHelper;
import com.ytmj.jzgl.domain.Drug;
import com.ytmj.jzgl.mapper.DrugMapper;
import com.ytmj.jzgl.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-19 19:14
 */
@Service
@Transactional
public class DrugServiceImpl implements DrugService {
    @Autowired
    private DrugMapper drugMapper;


    @Override
    public List<Drug> findAllDrug(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        return drugMapper.findAllDrug();
    }

    @Override
    public void updataDrug(Drug drug) {
        drugMapper.updataDrug(drug);
    }

    @Override
    public void addDrug(Drug drug) {
            drugMapper.addDrug(drug);
    }

    @Override
    public List<Drug> findAlladdDrug() {
        return drugMapper.findAllDrug();
    }

    @Override
    public void deleteDrug(Integer id) {
        drugMapper.deleteDrug(id);
    }
}
