package cn.myplay.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ymfa
 * @Date: 2019/6/5 17:39
 * @Description:
 */
public class ResultDto<T> implements Serializable {
    private Integer total;
    private List<T> rows;
    private String message;

    public static ResultDto success(String message){
        ResultDto dto = new ResultDto();
        dto.setMessage(message);
        return dto;
    }

    public String getMessage() {
        return message;
    }

    public ResultDto setMessage(String message) {
        this.message = message;
        return this;
    }

    public ResultDto(Integer total, List<T> rows) {
        this.total = total;
        if (rows == null) {
            rows = new ArrayList();
        }

        this.rows = rows;
    }

    public ResultDto() {
        this.total = 0;
        this.setRows(new ArrayList());
    }

    public ResultDto(List<T> list) {
        if (list == null) {
            this.total = 0;
            this.setRows(new ArrayList());
        } else {
            this.setRows(list);
            this.total = list.size();
        }

    }

    public Integer getTotal() {
        return this.total;
    }

    public ResultDto<T> setTotal(Integer total) {
        if (total != null) {
            this.total = total;
        } else {
            this.total = 0;
        }
        return this;
    }

    public List<T> getRows() {
        return this.rows;
    }

    public ResultDto<T> setRows(List<T> rows) {
        this.rows = rows;
        return this;
    }


}
