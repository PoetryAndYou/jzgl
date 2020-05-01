package com.ytmj.jzgl.controller;


import com.github.pagehelper.PageInfo;
import com.ytmj.jzgl.domain.*;
import com.ytmj.jzgl.service.CheckService;
import com.ytmj.jzgl.service.DrugService;
import com.ytmj.jzgl.service.MedicalRecordService;
import com.ytmj.jzgl.service.PatientService;
import com.ytmj.jzgl.utils.JsonData;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *  就诊
 * @author rui
 * @create 2020-04-07 11:18
 */
@RestController
@RequestMapping("viewdoctor")
public class MedicalRecordController {

    @Autowired
    private PatientService patientService;
    @Autowired
    private MedicalRecordService medicalRecordService;
    @RequestMapping("findPatientByDepartment")
    public JsonData findPatientByDepartment(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "4") Integer size, @RequestParam(name="department")String department) {
        List<Patient> patientByDepartment = patientService.findPatientByDepartment(page, size,department);
        PageInfo<Patient> patientPageInfo=new PageInfo<>(patientByDepartment);
            return  JsonData.buildSuccess(patientPageInfo);

    }
    //查询科室
    @RequestMapping("findAllViewdepartment")
    public JsonData findAllViewdepartment(){
        List<Viewdepartment> allViewdepartment = patientService.findAllViewdepartment();
        return  JsonData.buildSuccess(allViewdepartment);
    }
    //根据用户姓名查询
    @RequestMapping("findPatientByName")
    public JsonData findPatientByName( @RequestParam(name="name") String name){

        List<Patient> patientByName = patientService.findPatientByName(name);

        return JsonData.buildSuccess(patientByName);

    }
    //去除挂号记录
    @RequestMapping("clearPatient")
    public JsonData clearPatient(@Param("id") Integer id) {
        patientService.clearPatient(id);
        return JsonData.buildError("清除成功");
    }

    /**
     *
     */

    //根据用户id查询所有相关病例
    @RequestMapping("findAllPMByUserId")
    public JsonData  findAllPMByUserId(Integer id){
        List<MedicalRecord> allPMByUserId = medicalRecordService.findAllPMByUserId(id);
        return JsonData.buildSuccess(allPMByUserId);
    }

    @Autowired
    private CheckService checkService;
    @RequestMapping("findAllCheck")
    public JsonData findAllCheck(){
        List<ICheck> allCheck = checkService.findAllCheck();
        return JsonData.buildSuccess(allCheck);
    }
    //添加检查项
    @RequestMapping("addPcheck")
    public JsonData addPcheck(String name, String pname){
        checkService.addPcheck(name,pname);
        return JsonData.buildSuccess("成功");
    }
    //更新病人信息
    @RequestMapping("updatePatientPro")
    public JsonData updatePatientPro(Patient patient) throws Exception {
            patientService.updatePatientPro(patient);
        return JsonData.buildSuccess("更新成功");
    }

    @Autowired
    private DrugService drugService;
    //查询所有药物
    @RequestMapping("findAllDrug")
    public JsonData findAllDrug() {

        List<Drug> allDrug = drugService.findAlladdDrug();

        return JsonData.buildSuccess(allDrug);
    }
    //添加病例
    @RequestMapping("addPatientMD")
    public JsonData addPatientMD(MedicalRecord medicalRecord,Integer paid) {
        medicalRecordService.addPatientMD(medicalRecord,paid);
        return JsonData.buildSuccess();
    }
    //查询所有就诊记录
    @RequestMapping("findAllOldPatient")
    public JsonData findAllOldPatient(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) {
        List<Patient> allOldPatient = patientService.findAllOldPatient(page, size);
        PageInfo<Patient> patientPageInfo=new PageInfo<>(allOldPatient);

        return  JsonData.buildSuccess(patientPageInfo);
    }
    @RequestMapping("findAllPatient")
    public JsonData findAllPatient(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) {
        List<Patient> allPatient = patientService.findAllPatient(page, size);
        PageInfo<Patient> patientPageInfo=new PageInfo<>(allPatient);
        return JsonData.buildSuccess(patientPageInfo);
    }
    @RequestMapping("findAllPatient1")
    public JsonData findAllPatient1(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) {
        List<Patient> allPatient1 = patientService.findAllPatient1(page, size);
        PageInfo<Patient> patientPageInfo=new PageInfo<>(allPatient1);
        return JsonData.buildSuccess(patientPageInfo);

    }
}
