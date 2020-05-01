package com.ytmj.jzgl.service;

import com.ytmj.jzgl.domain.Viewdepartment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * @author rui
 * @create 2020-04-26 23:46
 */
public interface DepartmentService {
    //删除
    public void deleteDepartment(Integer id);
    //添加
    public void addDepartment(Viewdepartment viewdepartment);
    //更新
    public void updateDepartment(Viewdepartment viewdepartment);
}
