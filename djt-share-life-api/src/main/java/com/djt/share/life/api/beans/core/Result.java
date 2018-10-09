package com.djt.share.life.api.beans.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 统一返回结果对象
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Result implements Serializable {
    private static final long serialVersionUID = 6747666208905433497L;
    public static final String SUCCESS = "0";
    /**
     * data 中类型为普通 Map&lt;String,Object>对象
     */
    public static final int DATA_TYPE_MAP = 0;
    /**
     * <p>data 中类型为普通 集合列表对象 List&lt;Map&lt;String,Object>> </p>
     */
    public static final int DATA_TYPE_LIST = 1;
    /**
     * data 中类型为普通 javabean 单个对象
     */
    public static final int DATA_TYPE_OBJECT = 2;
    private String errorNo = "0";
    private int dataType = 0;
    private String errorInfo = "";
    private Object data;

    public static final Result create(Object data) {
        return new Result("0", "", 0, data);
    }

    public static final Result createListData(Object data) {
        return new Result("0", "", 1, data);
    }

    public static final Result createFail(String errorNo, String errorInfo) {
        return new Result(errorNo, errorInfo, 0, null);
    }

    public static final Result createFailList(String errorNo, String errorInfo) {
        return new Result(errorNo, errorInfo, 1, null);
    }

    public static final Result create(String errorNo, String errorInfo, int dataType, Object data) {
        return new Result(errorNo, errorInfo, dataType, data);
    }

    private Result(String errorNo, String errorInfo, int dataType, Object data) {
        this.errorNo = errorNo;
        this.dataType = dataType;
        this.errorInfo = errorInfo;
        this.data = data;
    }

    public String getCode() {
        return errorNo;
    }

    public void setErrorNo(String errorNo) {
        this.errorNo = errorNo;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    ;

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public Map<String, Object> toApiRestult() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", (StringUtils.equalsIgnoreCase(errorNo, SUCCESS)));
        result.put("msg", errorInfo);
        result.put("kind", String.valueOf(errorNo));
        result.put("data", null == data ? null : JSON.parseObject(JSON.toJSONString(data, SerializerFeature.WriteNullStringAsEmpty), data.getClass()));
        return result;
    }
}
