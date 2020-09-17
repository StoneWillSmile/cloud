package org.wwh.cloud.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wwh
 * @date 2020/9/14 19:18
 */
@ApiModel(description = "公共返回实体，VO类")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    @ApiModelProperty("响应代码：200->正常，400->失败")
    private Integer code;

    @ApiModelProperty("响应消息")
    private String message;

    @ApiModelProperty("响应数据")
    private T data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
