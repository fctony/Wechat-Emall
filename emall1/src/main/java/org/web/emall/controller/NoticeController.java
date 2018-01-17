package org.web.emall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.web.emall.ResponseNoticeModel;
import org.web.emall.models.Notice;
import org.web.emall.service.NoticeService;

import java.util.List;

/**
 * 公告接口
 */
@RestController
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @GetMapping("/notice/list")
    public ResponseNoticeModel getNoticeList(Integer pageSize) {
        List<Notice> notices = noticeService.getNoticePage(pageSize);
        if(notices != null) {
            return new ResponseNoticeModel(0,notices.size(),1,notices,"success");
        }
        return ResponseNoticeModel.NotFound();
    }

}
