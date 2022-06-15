/*
 * 开放API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: V1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dtsre.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.dtsre.api.v1.client.model.LogVO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.dtsre.api.v1.client.JSON;


/**
 * LogSearchVO
 */
@JsonPropertyOrder({
  LogSearchVO.JSON_PROPERTY_LOGS,
  LogSearchVO.JSON_PROPERTY_TOTAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T14:34:25.795+08:00[Asia/Shanghai]")
public class LogSearchVO {
  public static final String JSON_PROPERTY_LOGS = "logs";
  private List<LogVO> logs = null;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public LogSearchVO() { 
  }

  public LogSearchVO logs(List<LogVO> logs) {
    this.logs = logs;
    return this;
  }

  public LogSearchVO addLogsItem(LogVO logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<>();
    }
    this.logs.add(logsItem);
    return this;
  }

   /**
   * 日志结果集
   * @return logs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "日志结果集")
  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LogVO> getLogs() {
    return logs;
  }


  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogs(List<LogVO> logs) {
    this.logs = logs;
  }


  public LogSearchVO total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * 总日志数
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "总日志数")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(Long total) {
    this.total = total;
  }


  /**
   * Return true if this LogSearchVO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogSearchVO logSearchVO = (LogSearchVO) o;
    return Objects.equals(this.logs, logSearchVO.logs) &&
        Objects.equals(this.total, logSearchVO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogSearchVO {\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

