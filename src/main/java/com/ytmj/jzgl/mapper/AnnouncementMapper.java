package com.ytmj.jzgl.mapper;

import com.ytmj.jzgl.domain.Announcement;
import com.ytmj.jzgl.domain.Imgs;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-14 11:39
 */
public interface AnnouncementMapper {

    @Select("select * from imgs")
    public List<Imgs> findAllImgs();

    @Select("select * from announcement order by time desc ")
    public List<Announcement> findAllAnno();

    //添加图片
    @Insert("insert into imgs(name, url) values (#{name} ,#{url} )")
    public void addImgs(Imgs imgs);

    //删除图片
    @Delete("delete from imgs where id=#{id}")
    public void deleteImgs(@Param("id")Integer id);
    //修改日志
    @Update("update announcement set title=#{title} ,content=#{content} where id=#{id}")
    public void updataAnnouncement(Announcement announcement);

    //添加日志
    @Insert("insert into announcement(title, content, time)values (#{title} ,#{content} ,#{time} )")
    public void addAnno(Announcement announcement);

    //删除日志
    @Delete("delete from announcement where id=#{id} ")
    public void deleteAnno(@Param("id")Integer id);

}
