package com.ytmj.jzgl.service;

import com.ytmj.jzgl.domain.MRQuery;
import com.ytmj.jzgl.domain.MedicalRecord;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-18 16:56
 */
public interface MedicalRecordService {
    /**
     *
     * @param id
     * @return
     */
    public List<MedicalRecord> findAllPMByUserId(Integer id);

    public void addPatientMD(MedicalRecord medicalRecord,Integer paid);

    public List<MRQuery> findAllMR(Integer page, Integer size);

    //删除检查项
    public void deleteCheck(Integer id);
    //删除拿药记录
    public void deleteDurdRecord(Integer id);
}
