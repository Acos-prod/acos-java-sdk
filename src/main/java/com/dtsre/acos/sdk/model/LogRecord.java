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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * LogRecord
 */
@JsonPropertyOrder({
  LogRecord.JSON_PROPERTY_COLLECT_TIME,
  LogRecord.JSON_PROPERTY_CONTEXT_SEQ,
  LogRecord.JSON_PROPERTY_HOSTNAME,
  LogRecord.JSON_PROPERTY_IP,
  LogRecord.JSON_PROPERTY_KVS,
  LogRecord.JSON_PROPERTY_MESSAGE,
  LogRecord.JSON_PROPERTY_PATH,
  LogRecord.JSON_PROPERTY_TAGS,
  LogRecord.JSON_PROPERTY_TIMESTAMP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-16T17:06:47.813+08:00[Asia/Shanghai]")
public class LogRecord {
  public static final String JSON_PROPERTY_COLLECT_TIME = "collectTime";
  private Long collectTime;

  public static final String JSON_PROPERTY_CONTEXT_SEQ = "contextSeq";
  private Long contextSeq;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_IP = "ip";
  private String ip;

  public static final String JSON_PROPERTY_KVS = "kvs";
  private List<KV> kvs = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<Tag> tags = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public LogRecord() { 
  }

  public LogRecord collectTime(Long collectTime) {
    this.collectTime = collectTime;
    return this;
  }

   /**
   * 日志采集时间戳：Unix Nano
   * @return collectTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "日志采集时间戳：Unix Nano")
  @JsonProperty(JSON_PROPERTY_COLLECT_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCollectTime() {
    return collectTime;
  }


  @JsonProperty(JSON_PROPERTY_COLLECT_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCollectTime(Long collectTime) {
    this.collectTime = collectTime;
  }


  public LogRecord contextSeq(Long contextSeq) {
    this.contextSeq = contextSeq;
    return this;
  }

   /**
   * 日志序号
   * @return contextSeq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "日志序号")
  @JsonProperty(JSON_PROPERTY_CONTEXT_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getContextSeq() {
    return contextSeq;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_SEQ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContextSeq(Long contextSeq) {
    this.contextSeq = contextSeq;
  }


  public LogRecord hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * 主机名称
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "主机名称")
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


  public LogRecord ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * 主机IP
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "主机IP")
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


  public LogRecord kvs(List<KV> kvs) {
    this.kvs = kvs;
    return this;
  }

  public LogRecord addKvsItem(KV kvsItem) {
    if (this.kvs == null) {
      this.kvs = new ArrayList<>();
    }
    this.kvs.add(kvsItem);
    return this;
  }

   /**
   * 键值对集合
   * @return kvs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "键值对集合")
  @JsonProperty(JSON_PROPERTY_KVS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<KV> getKvs() {
    return kvs;
  }


  @JsonProperty(JSON_PROPERTY_KVS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKvs(List<KV> kvs) {
    this.kvs = kvs;
  }


  public LogRecord message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 日志原文
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "日志原文")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(String message) {
    this.message = message;
  }


  public LogRecord path(String path) {
    this.path = path;
    return this;
  }

   /**
   * 文件路径
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "文件路径")
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


  public LogRecord tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public LogRecord addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 标签
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Tag> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  public LogRecord timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * 时间戳，单位：毫秒
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1651110830000", required = true, value = "时间戳，单位：毫秒")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  /**
   * Return true if this LogRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogRecord logRecord = (LogRecord) o;
    return Objects.equals(this.collectTime, logRecord.collectTime) &&
        Objects.equals(this.contextSeq, logRecord.contextSeq) &&
        Objects.equals(this.hostname, logRecord.hostname) &&
        Objects.equals(this.ip, logRecord.ip) &&
        Objects.equals(this.kvs, logRecord.kvs) &&
        Objects.equals(this.message, logRecord.message) &&
        Objects.equals(this.path, logRecord.path) &&
        Objects.equals(this.tags, logRecord.tags) &&
        Objects.equals(this.timestamp, logRecord.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectTime, contextSeq, hostname, ip, kvs, message, path, tags, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogRecord {\n");
    sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
    sb.append("    contextSeq: ").append(toIndentedString(contextSeq)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    kvs: ").append(toIndentedString(kvs)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
