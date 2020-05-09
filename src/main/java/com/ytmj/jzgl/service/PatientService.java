package com.ytmj.jzgl.service;

import com.ytmj.jzgl.domain.Patient;
import com.ytmj.jzgl.domain.Viewdepartment;
import com.ytmj.jzgl.utils.JsonData;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-15 0:31
 */
public interface PatientService {
    //根据用户idcard查询
    public Patient findPatientByIdcard( String idcard);
    //查询科室
    public List<Viewdepartment> findAllViewdepartment();

    //删除挂号记录
    public void delectById( int id);

    //查询所有挂号记录
    public List<Patient> findAllPatient(Integer page, Integer size);

    //添加或更新挂号信息
    public void addPatient(Patient patient) throws Exception;


    //去除挂号信息
    public void clearPatient(int id);

    //根据科室查询所在科室的病人信息
    public List<Patient> findPatientByDepartment(Integer page, Integer size,String department);

    public List<Patient> findPatientByName( String name);

    //更新病人信息
    public void updatePatientPro(Patient patient)throws Exception;
    //查询所有就诊记录
    public List<Patient> findAllOldPatient(Integer page, Integer size);

    public List<Patient> findAllPatient1(Integer page, Integer size);

    List<Patient> findByName(String name);
}
