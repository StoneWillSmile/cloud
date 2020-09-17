package org.wwh.cloud.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author wwh
 * @date 2020/9/14 19:12
 */
@ApiModel(description="支付模块持久化实体类")
@Data
@Accessors(chain = true)
public class Payment {

    @ApiModelProperty(value = "id,自增长")
    private Long id;

    @ApiModelProperty("描述")
    private String serial;
}
