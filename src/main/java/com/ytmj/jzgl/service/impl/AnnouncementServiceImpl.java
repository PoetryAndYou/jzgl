package com.ytmj.jzgl.service.impl;

import com.ytmj.jzgl.domain.Announcement;
import com.ytmj.jzgl.domain.Imgs;
import com.ytmj.jzgl.mapper.AnnouncementMapper;
import com.ytmj.jzgl.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author rui
 * @create 2020-04-14 11:41
 */
@Service
@Transactional
public class AnnouncementServiceImpl implements AnnouncementService {
    @Autowired
    private AnnouncementMapper announcementMapper;

    @Override
    public List<Imgs> findAllImgs() {
        return announcementMapper.findAllImgs();
    }

    @Override
    public List<Announcement> findAllAnno() {
        return announcementMapper.findAllAnno();
    }

    @Override
    public void addImgs(Imgs imgs) {

        announcementMapper.addImgs(imgs);
    }

    @Override
    public void deleteImgs(Integer id) {
        announcementMapper.deleteImgs(id);
    }

    @Override
    public void updataAnnouncement(Announcement announcement) {
        announcementMapper.updataAnnouncement(announcement);
    }

    @Override
    public void addAnno(Announcement announcement) {
        announcement.setTime(new Date());
        announcementMapper.addAnno(announcement);
    }

    @Override
    public void deleteAnno(Integer id) {
        announcementMapper.deleteAnno(id);
    }
}
