package com.ytmj.jzgl.service;

import com.ytmj.jzgl.domain.Drug;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-19 19:14
 */
public interface DrugService {
    List<Drug> findAllDrug(Integer page, Integer size);

    public void updataDrug(Drug drug);

    public void addDrug(Drug drug);

    List<Drug> findAlladdDrug();
    public void deleteDrug(Integer id);

}
