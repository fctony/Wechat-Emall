package org.web.emall;

import java.util.List;

public class ResponseNoticeModel implements java.io.Serializable{

    public ResponseNoticeModel(Integer code,Integer totalRow,Integer totalPage,Object dataList , String msg) {
        this.code = code;
        this.msg = msg;
        this.data = new Data(totalRow,totalPage,dataList);
    }

    public ResponseNoticeModel(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ResponseNoticeModel NotFound() {
        return new ResponseNoticeModel(404,"资源不存在");
    }


    private Integer code;

    private Data data;

    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }



    private class Data {

        public Data(Integer totalRow, Integer totalPage, Object dataList) {
            this.totalRow = totalRow;
            this.totalPage = totalPage;
            this.dataList = dataList;
        }

        private Integer totalRow;

        private Integer totalPage;

        private Object dataList;

        public Integer getTotalRow() {
            return totalRow;
        }

        public void setTotalRow(Integer totalRow) {
            this.totalRow = totalRow;
        }

        public Integer getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
        }

        public Object getDataList() {
            return dataList;
        }

        public void setDataList(Object dataList) {
            this.dataList = dataList;
        }
    }
}
