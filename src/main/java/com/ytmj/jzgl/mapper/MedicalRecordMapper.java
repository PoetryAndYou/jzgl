package com.ytmj.jzgl.mapper;

import com.ytmj.jzgl.domain.MRQuery;
import com.ytmj.jzgl.domain.MedicalRecord;
import com.ytmj.jzgl.domain.PatientMid;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-18 15:42
 */
public interface MedicalRecordMapper {

    //根据病人id查询他的所有记录
    @Select("select mr.* from patient_med pm left join medicalrecord mr  on pm.medicalrecord_id=mr.id where pm.patient_id=#{id} ; ")
    public List<MedicalRecord> findAllPMByUserId(@Param("id")Integer id);
    //添加病例

    @Insert("insert into medicalrecord(visittime, conclusion, symptom, drug, doctor, drugnum,state)values (#{visittime} ,#{conclusion} ,#{symptom} ,#{drug} ,#{doctor},#{drugnum},#{state}  )")
    @Options(useGeneratedKeys=true ,keyProperty="id", keyColumn="id")
    public void addPatientMD(MedicalRecord medicalRecord);
    //添加病人和病例之间的关联关系
    @Insert("insert into  patient_med(patient_id, medicalrecord_id) values (#{patientId} ,#{medicalrecordId} );")
    public void addPatientMid(PatientMid patientMid);

    //查询所有病例
    @Select("select p.name as name,p.number as number, p.sex as sex,mr.drug as drug ,mr.id as id from medicalrecord mr,patient_med pm,patient p where mr.id=pm.medicalrecord_id and pm.patient_id=p.id and mr.state=1")
    public List<MRQuery> findAllMR();
    //删除检查项

    @Delete("delete  from pcheck where id=#{id} ")
    public void deleteCheck(@Param("id")Integer id);
    //删除拿药记录
    @Update("update medicalrecord set state=0 where id=#{id} ")
    public void deleteDurdRecord(@Param("id")Integer id);

}
