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


package com.dtsre.acos.sdk.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * LogVO
 */
@JsonPropertyOrder({
  LogVO.JSON_PROPERTY_APPNAME,
  LogVO.JSON_PROPERTY_HOSTNAME,
  LogVO.JSON_PROPERTY_IP,
  LogVO.JSON_PROPERTY_PATH,
  LogVO.JSON_PROPERTY_AT_TIMESTAMP,
  LogVO.JSON_PROPERTY_COLLECT_TIME,
  LogVO.JSON_PROPERTY_CONTEXT_SEQ,
  LogVO.JSON_PROPERTY_MESSAGE,
  LogVO.JSON_PROPERTY_RECEIVE_TIMESTAMP,
  LogVO.JSON_PROPERTY_CUSTOM_FIELDS,
  LogVO.JSON_PROPERTY_CUSTOM_TAGS,
  LogVO.JSON_PROPERTY_SYS_FIELDS,
  LogVO.JSON_PROPERTY_SYS_TAGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-16T17:06:47.813+08:00[Asia/Shanghai]")
public class LogVO {
  public static final String JSON_PROPERTY_APPNAME = "__appname__";
  private String appname;

  public static final String JSON_PROPERTY_HOSTNAME = "__hostname__";
  private String hostname;

  public static final String JSON_PROPERTY_IP = "__ip__";
  private String ip;

  public static final String JSON_PROPERTY_PATH = "__path__";
  private String path;

  public static final String JSON_PROPERTY_AT_TIMESTAMP = "_at_timestamp_";
  private String atTimestamp;

  public static final String JSON_PROPERTY_COLLECT_TIME = "_collect_time_";
  private String collectTime;

  public static final String JSON_PROPERTY_CONTEXT_SEQ = "_context_seq_";
  private String contextSeq;

  public static final String JSON_PROPERTY_MESSAGE = "_message_";
  private String message;

  public static final String JSON_PROPERTY_RECEIVE_TIMESTAMP = "_receive_timestamp_";
  private String receiveTimestamp;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "customFields";
  private Object customFields;

  public static final String JSON_PROPERTY_CUSTOM_TAGS = "customTags";
  private Object customTags;

  public static final String JSON_PROPERTY_SYS_FIELDS = "sysFields";
  private Object sysFields;

  public static final String JSON_PROPERTY_SYS_TAGS = "sysTags";
  private Object sysTags;

  public LogVO() { 
  }

  public LogVO appname(String appname) {
    this.appname = appname;
    return this;
  }

   /**
   * 数据集
   * @return appname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "数据集")
  @JsonProperty(JSON_PROPERTY_APPNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppname() {
    return appname;
  }


  @JsonProperty(JSON_PROPERTY_APPNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppname(String appname) {
    this.appname = appname;
  }


  public LogVO hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * 主机名
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "主机名")
  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHostname() {
    return hostname;
  }


  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public LogVO ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * ip
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ip")
  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIp() {
    return ip;
  }


  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIp(String ip) {
    this.ip = ip;
  }


  public LogVO path(String path) {
    this.path = path;
    return this;
  }

   /**
   * 日周路径
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "日周路径")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(String path) {
    this.path = path;
  }


  public LogVO atTimestamp(String atTimestamp) {
    this.atTimestamp = atTimestamp;
    return this;
  }

   /**
   * 日志时间
   * @return atTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "日志时间")
  @JsonProperty(JSON_PROPERTY_AT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAtTimestamp() {
    return atTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_AT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAtTimestamp(String atTimestamp) {
    this.atTimestamp = atTimestamp;
  }


  public LogVO collectTime(String collectTime) {
    this.collectTime = collectTime;
    return this;
  }

   /**
   * 日志采集时间
   * @return collectTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "日志采集时间")
  @JsonProperty(JSON_PROPERTY_COLLECT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCollectTime() {
    return collectTime;
  }


  @JsonProperty(JSON_PROPERTY_COLLECT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectTime(String collectTime) {
    this.collectTime = collectTime;
  }


  public LogVO contextSeq(String contextSeq) {
    this.contextSeq = contextSeq;
    return this;
  }

   /**
   * 序号
   * @return contextSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "序号")
  @JsonProperty(JSON_PROPERTY_CONTEXT_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContextSeq() {
    return contextSeq;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContextSeq(String contextSeq) {
    this.contextSeq = contextSeq;
  }


  public LogVO message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 日志原文
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "日志原文")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public LogVO receiveTimestamp(String receiveTimestamp) {
    this.receiveTimestamp = receiveTimestamp;
    return this;
  }

   /**
   * 日志接收时间
   * @return receiveTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "日志接收时间")
  @JsonProperty(JSON_PROPERTY_RECEIVE_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceiveTimestamp() {
    return receiveTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVE_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiveTimestamp(String receiveTimestamp) {
    this.receiveTimestamp = receiveTimestamp;
  }


  public LogVO customFields(Object customFields) {
    this.customFields = customFields;
    return this;
  }

   /**
   * 自定义字段
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "自定义字段")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(Object customFields) {
    this.customFields = customFields;
  }


  public LogVO customTags(Object customTags) {
    this.customTags = customTags;
    return this;
  }

   /**
   * 自定义标签
   * @return customTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "自定义标签")
  @JsonProperty(JSON_PROPERTY_CUSTOM_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getCustomTags() {
    return customTags;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomTags(Object customTags) {
    this.customTags = customTags;
  }


  public LogVO sysFields(Object sysFields) {
    this.sysFields = sysFields;
    return this;
  }

   /**
   * 系统字段
   * @return sysFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统字段")
  @JsonProperty(JSON_PROPERTY_SYS_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getSysFields() {
    return sysFields;
  }


  @JsonProperty(JSON_PROPERTY_SYS_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSysFields(Object sysFields) {
    this.sysFields = sysFields;
  }


  public LogVO sysTags(Object sysTags) {
    this.sysTags = sysTags;
    return this;
  }

   /**
   * 系统标签
   * @return sysTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统标签")
  @JsonProperty(JSON_PROPERTY_SYS_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getSysTags() {
    return sysTags;
  }


  @JsonProperty(JSON_PROPERTY_SYS_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSysTags(Object sysTags) {
    this.sysTags = sysTags;
  }


  /**
   * Return true if this LogVO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogVO logVO = (LogVO) o;
    return Objects.equals(this.appname, logVO.appname) &&
        Objects.equals(this.hostname, logVO.hostname) &&
        Objects.equals(this.ip, logVO.ip) &&
        Objects.equals(this.path, logVO.path) &&
        Objects.equals(this.atTimestamp, logVO.atTimestamp) &&
        Objects.equals(this.collectTime, logVO.collectTime) &&
        Objects.equals(this.contextSeq, logVO.contextSeq) &&
        Objects.equals(this.message, logVO.message) &&
        Objects.equals(this.receiveTimestamp, logVO.receiveTimestamp) &&
        Objects.equals(this.customFields, logVO.customFields) &&
        Objects.equals(this.customTags, logVO.customTags) &&
        Objects.equals(this.sysFields, logVO.sysFields) &&
        Objects.equals(this.sysTags, logVO.sysTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appname, hostname, ip, path, atTimestamp, collectTime, contextSeq, message, receiveTimestamp, customFields, customTags, sysFields, sysTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogVO {\n");
    sb.append("    appname: ").append(toIndentedString(appname)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    atTimestamp: ").append(toIndentedString(atTimestamp)).append("\n");
    sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
    sb.append("    contextSeq: ").append(toIndentedString(contextSeq)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    receiveTimestamp: ").append(toIndentedString(receiveTimestamp)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    customTags: ").append(toIndentedString(customTags)).append("\n");
    sb.append("    sysFields: ").append(toIndentedString(sysFields)).append("\n");
    sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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

