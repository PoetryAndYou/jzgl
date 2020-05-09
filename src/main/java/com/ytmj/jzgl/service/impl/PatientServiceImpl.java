package com.ytmj.jzgl.service.impl;

import com.github.pagehelper.PageHelper;
import com.ytmj.jzgl.domain.Patient;
import com.ytmj.jzgl.domain.Viewdepartment;
import com.ytmj.jzgl.mapper.PatientMapper;
import com.ytmj.jzgl.service.PatientService;
import com.ytmj.jzgl.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author rui
 * @create 2020-04-15 9:43
 */
@Service
@Transactional
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientMapper patientMapper;
    @Override
    public Patient findPatientByIdcard(String idcard) {
        return patientMapper.findPatientByIdcard(idcard);
    }

    @Override
    public List<Viewdepartment> findAllViewdepartment() {
        return patientMapper.findAllViewdepartment();
    }

    @Override
    public void delectById(int id) {
        //此处可以先查询后删除剖出个异常
        patientMapper.delectById(id);
    }

    @Override
    public List<Patient> findAllPatient(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        return patientMapper.findAllPatient();
    }

    public String simpleDate(Date date){

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        return format;

    }
    //添加或更新挂号信息
    @Override
    public void addPatient(Patient patient) throws Exception {
        if("".equals(patient.getId())||null==patient.getId()){
            System.out.println("这是新增");
            patient.setCreate_time(simpleDate(new Date()));
            patientMapper.addPatient(patient);
        }else {
            System.out.println("这是更新");
            patient.setCreate_time(simpleDate(new Date()));
            patientMapper.updatePatient(patient);
        }
    }

    @Override
    public void clearPatient(int id) {
        patientMapper.clearPatient(id);
    }

    @Override
    public List<Patient> findPatientByDepartment(Integer page, Integer size,String department) {
        PageHelper.startPage(page,size);
        return patientMapper.findPatientByDepartment(department);
    }

    @Override
    public List<Patient> findPatientByName(String name) {
        return patientMapper.findPatientByName(name);
    }

    @Override
    public void updatePatientPro(Patient patient) throws Exception {
        patientMapper.updatePatientPro(patient);
    }

    @Override
    public List<Patient> findAllOldPatient(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        return patientMapper.findAllOldPatient();
    }

    @Override
    public List<Patient> findAllPatient1(Integer page, Integer size) {
        PageHelper.startPage(page,size);
       return   patientMapper.findAllPatient1();
    }

    @Override
    public List<Patient> findByName(String name) {
        return patientMapper.findByName(name);
    }
}
