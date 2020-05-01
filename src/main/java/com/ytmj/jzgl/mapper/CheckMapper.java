package com.ytmj.jzgl.mapper;

import com.ytmj.jzgl.domain.ICheck;
import com.ytmj.jzgl.domain.PCheck;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-18 21:42
 */
public interface CheckMapper {
    //查询所有的检查项

    @Select("SELECT * from icheck")
    public List<ICheck> findAllCheck();

    //查询所有的待检查记录
    @Select("SELECT * from pcheck")
    public List<PCheck> findAllPCheck();

    //添加检查
    @Insert("insert into pcheck(pname, name) values (#{pname} ,#{name} )")
    public void addPcheck(@Param("name")String name,@Param("pname") String pname);

    @Delete("delete from pcheck where id=#{id}")
    public void deleteCheck(@Param("id")Integer id);

}
