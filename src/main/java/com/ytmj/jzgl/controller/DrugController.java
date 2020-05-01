package com.ytmj.jzgl.controller;

import com.github.pagehelper.PageInfo;
import com.ytmj.jzgl.domain.Drug;
import com.ytmj.jzgl.domain.MRQuery;
import com.ytmj.jzgl.domain.MedicalRecord;
import com.ytmj.jzgl.domain.PCheck;
import com.ytmj.jzgl.mapper.DrugMapper;
import com.ytmj.jzgl.service.CheckService;
import com.ytmj.jzgl.service.DrugService;
import com.ytmj.jzgl.service.MedicalRecordService;
import com.ytmj.jzgl.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 药品管理
 *
 * @author rui
 * @create 2020-04-15 0:20
 */
@RestController
@RequestMapping("drug")
public class DrugController {
    @Autowired
    private DrugService drugService;

    //查询所有药品
    @RequestMapping("findAllDrug")
    JsonData findAllDrug(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) {
        List<Drug> allDrug = drugService.findAllDrug(page, size);
        PageInfo<Drug> pageInfo = new PageInfo<>(allDrug);
        return JsonData.buildSuccess(pageInfo);
    }

    @RequestMapping("updataDrug")
    public JsonData updataDrug(Drug drug) {

        drugService.updataDrug(drug);
        return JsonData.buildSuccess("更新成功");

    }

    @RequestMapping("addDrug")
    public JsonData addDrug(Drug drug) {
        drugService.addDrug(drug);
        return JsonData.buildSuccess("添加成功");
    }

    @Autowired
    private CheckService checkService;

    //查询所有待检查项
    @RequestMapping("findAllPCheck")
    public JsonData findAllPCheck(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) {
        List<PCheck> allPCheck = checkService.findAllPCheck(page, size);
        PageInfo<PCheck> pCheckPageInfo = new PageInfo<>(allPCheck);
        return JsonData.buildSuccess(pCheckPageInfo);

    }

    @RequestMapping("deleteCheck")
    public JsonData deleteCheck(Integer id) {
        drugService.deleteDrug(id);
        return JsonData.buildSuccess("删除成功");
    }

    @Autowired
    private MedicalRecordService medicalRecordService;
    @RequestMapping("findAllMR")
    public JsonData findAllMR(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "4") Integer size) {

        List<MRQuery> allMR = medicalRecordService.findAllMR(page, size);
        PageInfo<MRQuery> pageInfo=new PageInfo<>(allMR);
        return JsonData.buildSuccess(pageInfo);
    }
    //删除检查项
    @RequestMapping("deleteCheck1")
    public JsonData deleteCheck1(Integer id){
        medicalRecordService.deleteCheck(id);
        return JsonData.buildSuccess();
    }
    //删除拿药记录
    @RequestMapping("deleteDurdRecord")
    public JsonData deleteDurdRecord(Integer id){
        medicalRecordService.deleteDurdRecord(id);
        return JsonData.buildSuccess();
    }

}
