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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
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
import com.dtsre.acos.sdk.JSON;


/**
 * AlertNotifyCreateParam
 */
@JsonPropertyOrder({
  AlertNotifyCreateParam.JSON_PROPERTY_NOTIFY_GROUP_IDS,
  AlertNotifyCreateParam.JSON_PROPERTY_NOTIFY_INTERVAL,
  AlertNotifyCreateParam.JSON_PROPERTY_NOTIFY_TYPES,
  AlertNotifyCreateParam.JSON_PROPERTY_SEVERITIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-16T17:06:47.813+08:00[Asia/Shanghai]")
public class AlertNotifyCreateParam {
  public static final String JSON_PROPERTY_NOTIFY_GROUP_IDS = "notifyGroupIds";
  private List<Long> notifyGroupIds = null;

  public static final String JSON_PROPERTY_NOTIFY_INTERVAL = "notifyInterval";
  private String notifyInterval;

  /**
   * Gets or Sets notifyTypes
   */
  public enum NotifyTypesEnum {
    EMAIL("EMAIL"),
    
    SMS("SMS"),
    
    DINGDING("DINGDING"),
    
    WECHAT_ROBOT("WECHAT_ROBOT"),
    
    PHONE("PHONE"),
    
    WEBHOOK("WEBHOOK"),
    
    OTHER("OTHER");

    private String value;

    NotifyTypesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NotifyTypesEnum fromValue(String value) {
      for (NotifyTypesEnum b : NotifyTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NOTIFY_TYPES = "notifyTypes";
  private List<NotifyTypesEnum> notifyTypes = new ArrayList<>();

  /**
   * Gets or Sets severities
   */
  public enum SeveritiesEnum {
    OK("OK"),
    
    WARNING("WARNING"),
    
    CRITICAL("CRITICAL"),
    
    FATAL("FATAL"),
    
    NO_DATA("NO_DATA");

    private String value;

    SeveritiesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeveritiesEnum fromValue(String value) {
      for (SeveritiesEnum b : SeveritiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SEVERITIES = "severities";
  private List<SeveritiesEnum> severities = new ArrayList<>();

  public AlertNotifyCreateParam() { 
  }

  public AlertNotifyCreateParam notifyGroupIds(List<Long> notifyGroupIds) {
    this.notifyGroupIds = notifyGroupIds;
    return this;
  }

  public AlertNotifyCreateParam addNotifyGroupIdsItem(Long notifyGroupIdsItem) {
    if (this.notifyGroupIds == null) {
      this.notifyGroupIds = new ArrayList<>();
    }
    this.notifyGroupIds.add(notifyGroupIdsItem);
    return this;
  }

   /**
   * 通知组ID集合
   * @return notifyGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "通知组ID集合")
  @JsonProperty(JSON_PROPERTY_NOTIFY_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getNotifyGroupIds() {
    return notifyGroupIds;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyGroupIds(List<Long> notifyGroupIds) {
    this.notifyGroupIds = notifyGroupIds;
  }


  public AlertNotifyCreateParam notifyInterval(String notifyInterval) {
    this.notifyInterval = notifyInterval;
    return this;
  }

   /**
   * 通知时间间隔：never:从不,last_5m:5分钟,last_1h:1小时
   * @return notifyInterval
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "通知时间间隔：never:从不,last_5m:5分钟,last_1h:1小时")
  @JsonProperty(JSON_PROPERTY_NOTIFY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNotifyInterval() {
    return notifyInterval;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNotifyInterval(String notifyInterval) {
    this.notifyInterval = notifyInterval;
  }


  public AlertNotifyCreateParam notifyTypes(List<NotifyTypesEnum> notifyTypes) {
    this.notifyTypes = notifyTypes;
    return this;
  }

  public AlertNotifyCreateParam addNotifyTypesItem(NotifyTypesEnum notifyTypesItem) {
    this.notifyTypes.add(notifyTypesItem);
    return this;
  }

   /**
   * 通知方式
   * @return notifyTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "通知方式")
  @JsonProperty(JSON_PROPERTY_NOTIFY_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<NotifyTypesEnum> getNotifyTypes() {
    return notifyTypes;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNotifyTypes(List<NotifyTypesEnum> notifyTypes) {
    this.notifyTypes = notifyTypes;
  }


  public AlertNotifyCreateParam severities(List<SeveritiesEnum> severities) {
    this.severities = severities;
    return this;
  }

  public AlertNotifyCreateParam addSeveritiesItem(SeveritiesEnum severitiesItem) {
    this.severities.add(severitiesItem);
    return this;
  }

   /**
   * 通知级别
   * @return severities
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "通知级别")
  @JsonProperty(JSON_PROPERTY_SEVERITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SeveritiesEnum> getSeverities() {
    return severities;
  }


  @JsonProperty(JSON_PROPERTY_SEVERITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSeverities(List<SeveritiesEnum> severities) {
    this.severities = severities;
  }


  /**
   * Return true if this AlertNotifyCreateParam object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertNotifyCreateParam alertNotifyCreateParam = (AlertNotifyCreateParam) o;
    return Objects.equals(this.notifyGroupIds, alertNotifyCreateParam.notifyGroupIds) &&
        Objects.equals(this.notifyInterval, alertNotifyCreateParam.notifyInterval) &&
        Objects.equals(this.notifyTypes, alertNotifyCreateParam.notifyTypes) &&
        Objects.equals(this.severities, alertNotifyCreateParam.severities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyGroupIds, notifyInterval, notifyTypes, severities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertNotifyCreateParam {\n");
    sb.append("    notifyGroupIds: ").append(toIndentedString(notifyGroupIds)).append("\n");
    sb.append("    notifyInterval: ").append(toIndentedString(notifyInterval)).append("\n");
    sb.append("    notifyTypes: ").append(toIndentedString(notifyTypes)).append("\n");
    sb.append("    severities: ").append(toIndentedString(severities)).append("\n");
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

