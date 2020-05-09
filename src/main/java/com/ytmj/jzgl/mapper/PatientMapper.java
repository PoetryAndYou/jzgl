package com.ytmj.jzgl.mapper;

import com.ytmj.jzgl.domain.Patient;
import com.ytmj.jzgl.domain.Viewdepartment;
import com.ytmj.jzgl.utils.JsonData;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-15 0:35
 */
public interface PatientMapper {
    //根据用户idcard查询
    @Select("select * from patient where idcard=#{idcard} ")
    public Patient findPatientByIdcard(@Param("idcard") String idcard);
    //查询科室
    @Select("select * from viewdepartment")
    public List<Viewdepartment> findAllViewdepartment();

    //删除挂号记录
    @Delete("delete from patient where patient.id=#{id}")
    public void delectById(@Param("id") int id);

    //查询所有挂号记录
    @Select("select * from patient where status=1 ORDER BY patient.create_time DESC")
    public List<Patient> findAllPatient();

    //添加挂号信息
    @Insert("insert into patient(name,age,sex,number,money,idcard,department,create_time,status) values (#{name},#{age},#{sex},#{number} ,#{money} ,#{idcard},#{department} ,#{create_time} ,'1'  )")
    public void addPatient(Patient patient) throws Exception;

    //更新病人信息
    @Update("update patient set idcard=#{idcard} ,name=#{name} ,number=#{number} ,money=#{money} ,department=#{department},status='1',create_time=#{create_time}  where id=#{id}")
    public void updatePatient(Patient patient)throws Exception;
    //更新病人信息
    @Update("update patient set  name=#{name},age=#{age} ,sex=#{sex} ,number=#{number},status='2' where id=#{id}")
    public void updatePatientPro(Patient patient)throws Exception;

    //去除挂号信息
    @Update("update patient set status='3' where id=#{id}")
    public void clearPatient(@Param("id")int id);

    //根据科室查询所在科室的病人信息

    @Select("select * from patient where department=#{department} and status='1'")
    public List<Patient> findPatientByDepartment(@Param("department") String department);

    //确认就诊结束
    @Update("update patient set status='2' where id=#{id}")
    public void viewPatient(@Param("id")int id);

    //根据用户名查找
    @Select("select * from patient where name=#{name} and status='1'")
    public List<Patient> findPatientByName(@Param("name") String name);

    //查询所有就诊记录

    @Select("select * from patient where status=2 ORDER BY patient.create_time DESC")
    public List<Patient> findAllOldPatient();
    //查询所有病人信息
    @Select("select * from patient")
    public List<Patient> findAllPatient1();

    //通过用户名查询病人信息
    @Select("select * from patient where name=#{name} ")
    List<Patient> findByName(@Param("name")String name);

}
