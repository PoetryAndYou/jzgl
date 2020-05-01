package com.ytmj.jzgl.controller;

import com.github.pagehelper.PageInfo;
import com.ytmj.jzgl.domain.Patient;
import com.ytmj.jzgl.domain.Viewdepartment;
import com.ytmj.jzgl.service.PatientService;
import com.ytmj.jzgl.utils.JsonData;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 挂号
 * @author rui
 * @create 2020-04-07 12:35
 */
@RestController
@RequestMapping("registered")
public class RegisteredController {
    @Autowired
    private PatientService patientService;

    @RequestMapping("findAllPatient")
    public JsonData findAllPatient(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) {

        List<Patient> list = patientService.findAllPatient(page, size);
        PageInfo<Patient> pageInfo=new PageInfo<Patient>(list);
        return JsonData.buildSuccess(pageInfo);

    }

    //根据用户idcard查询
    @RequestMapping("findPatientByIdcard")
    public JsonData findPatientByIdcard( @RequestParam(name="idcard") String idcard){

        Patient patientByIdcard = patientService.findPatientByIdcard(idcard);

        return JsonData.buildSuccess(patientByIdcard);

    }
    //查询科室
    @RequestMapping("findAllViewdepartment")
    public JsonData findAllViewdepartment(){
        List<Viewdepartment> allViewdepartment = patientService.findAllViewdepartment();
        return  JsonData.buildSuccess(allViewdepartment);
    }

    //删除挂号记录
    @RequestMapping("delectById")
    public JsonData delectById( int id){
        patientService.delectById(id);
        return JsonData.buildSuccess("删除成功");
    }
    //添加挂号信息
    @RequestMapping("addPatient")
    public JsonData addPatient(@RequestBody Patient patient) throws Exception{
        patientService.addPatient(patient);
        return JsonData.buildSuccess("添加成功");
    }
    //去除挂号记录
    @RequestMapping("clearPatient")
    public JsonData clearPatient(@Param("id") Integer id) {
        patientService.clearPatient(id);
        return JsonData.buildError("清除成功");
    }

}
