package com.ytmj.jzgl.service;

import com.ytmj.jzgl.domain.Announcement;
import com.ytmj.jzgl.domain.Imgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author rui
 * @create 2020-04-14 11:40
 */
public interface AnnouncementService {
    public List<Imgs> findAllImgs();
    public List<Announcement> findAllAnno();
    //添加图片
    public void addImgs(Imgs imgs);

    //删除图片
    public void deleteImgs(Integer id);
    //修改日志
    public void updataAnnouncement(Announcement announcement);

    //添加日志
    public void addAnno(Announcement announcement);

    //删除日志
    public void deleteAnno(Integer id);
}
