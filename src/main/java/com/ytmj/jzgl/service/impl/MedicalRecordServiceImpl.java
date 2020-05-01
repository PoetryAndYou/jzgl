package com.ytmj.jzgl.service.impl;

import com.github.pagehelper.PageHelper;
import com.ytmj.jzgl.utils.DateUtils;
import com.ytmj.jzgl.domain.MRQuery;
import com.ytmj.jzgl.domain.MedicalRecord;
import com.ytmj.jzgl.domain.PatientMid;
import com.ytmj.jzgl.mapper.MedicalRecordMapper;
import com.ytmj.jzgl.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-18 16:59
 */
@Service
@Transactional
public class MedicalRecordServiceImpl implements MedicalRecordService {
    @Autowired
    private MedicalRecordMapper medicalRecordMapper;
    @Override
    public List<MedicalRecord> findAllPMByUserId(Integer id) {
        return medicalRecordMapper.findAllPMByUserId(id);
    }

    @Override
    public void addPatientMD(MedicalRecord medicalRecord,Integer paid) {
        medicalRecord.setVisittime(DateUtils.simpleDate());
        medicalRecord.setState("1");
        medicalRecordMapper.addPatientMD(medicalRecord);
        Integer id = medicalRecord.getId();//medicalRecord的id
        PatientMid patientMid=new PatientMid();
        patientMid.setMedicalrecordId(id);
        patientMid.setPatientId(paid);
        medicalRecordMapper.addPatientMid(patientMid);
    }

    @Override
    public List<MRQuery> findAllMR(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        return medicalRecordMapper.findAllMR();
    }

    @Override
    public void deleteCheck(Integer id) {
        medicalRecordMapper.deleteCheck(id);
    }

    @Override
    public void deleteDurdRecord(Integer id) {
        medicalRecordMapper.deleteDurdRecord(id);
    }
}
