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
 * MetricMetaUpdateParam
 */
@JsonPropertyOrder({
  MetricMetaUpdateParam.JSON_PROPERTY_DESCRIPTION,
  MetricMetaUpdateParam.JSON_PROPERTY_METRIC,
  MetricMetaUpdateParam.JSON_PROPERTY_NAME,
  MetricMetaUpdateParam.JSON_PROPERTY_UNIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-16T17:06:47.813+08:00[Asia/Shanghai]")
public class MetricMetaUpdateParam {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public MetricMetaUpdateParam() { 
  }

  public MetricMetaUpdateParam description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 指标描述
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指标描述")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public MetricMetaUpdateParam metric(String metric) {
    this.metric = metric;
    return this;
  }

   /**
   * 指标
   * @return metric
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "指标")
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMetric() {
    return metric;
  }


  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetric(String metric) {
    this.metric = metric;
  }


  public MetricMetaUpdateParam name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 指标中文名
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指标中文名")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public MetricMetaUpdateParam unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * 单位
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单位")
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnit(String unit) {
    this.unit = unit;
  }


  /**
   * Return true if this MetricMetaUpdateParam object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricMetaUpdateParam metricMetaUpdateParam = (MetricMetaUpdateParam) o;
    return Objects.equals(this.description, metricMetaUpdateParam.description) &&
        Objects.equals(this.metric, metricMetaUpdateParam.metric) &&
        Objects.equals(this.name, metricMetaUpdateParam.name) &&
        Objects.equals(this.unit, metricMetaUpdateParam.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, metric, name, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricMetaUpdateParam {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

