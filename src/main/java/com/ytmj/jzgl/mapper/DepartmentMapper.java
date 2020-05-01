package com.ytmj.jzgl.mapper;

import com.ytmj.jzgl.domain.Viewdepartment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author rui
 * @create 2020-04-26 23:41
 */
public interface DepartmentMapper {
    //删除
    @Delete("delete from viewdepartment where id=#{id} ")
    public void deleteDepartment(@Param("id")Integer id);
    //添加
    @Insert("insert into viewdepartment(name, description) values (#{name} ,#{description} )")
    public void addDepartment(Viewdepartment viewdepartment);
    //更新
    @Update("update viewdepartment set name=#{name},description=#{description} where id=#{id} ")
    public void updateDepartment(Viewdepartment viewdepartment);
}
