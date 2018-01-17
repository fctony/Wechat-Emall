package org.web.emall.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.emall.mappers.NoticeMapper;
import org.web.emall.models.Notice;
import org.web.emall.service.NoticeService;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService{

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> getAll() {
        return null;
    }

    @Override
    public Notice findById(Integer id) {
        return null;
    }

    @Override
    public List<Notice> getNoticePage(Integer pageSize) {
        PageHelper.startPage(1 ,pageSize);
        List<Notice> notices = noticeMapper.selectByExample(null);
        PageInfo<Notice> info = new PageInfo<>(notices);
        return info.getList();
    }
}
