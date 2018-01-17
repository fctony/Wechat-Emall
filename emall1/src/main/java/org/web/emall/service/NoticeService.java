package org.web.emall.service;

import org.web.emall.models.Notice;

import java.util.List;

public interface NoticeService extends BaseService<Notice> {

    List<Notice> getNoticePage(Integer pageSize);

}
