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
 * MetricMetadataVO
 */
@JsonPropertyOrder({
  MetricMetadataVO.JSON_PROPERTY_CODE,
  MetricMetadataVO.JSON_PROPERTY_DESCRIPTION,
  MetricMetadataVO.JSON_PROPERTY_ID,
  MetricMetadataVO.JSON_PROPERTY_NAME,
  MetricMetadataVO.JSON_PROPERTY_UNIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-16T17:06:47.813+08:00[Asia/Shanghai]")
public class MetricMetadataVO {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private UnitDTO unit;

  public MetricMetadataVO() { 
  }

  public MetricMetadataVO code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 指标code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指标code")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public MetricMetadataVO description(String description) {
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


  public MetricMetadataVO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * 指标id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指标id")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public MetricMetadataVO name(String name) {
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


  public MetricMetadataVO unit(UnitDTO unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UnitDTO getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnit(UnitDTO unit) {
    this.unit = unit;
  }


  /**
   * Return true if this MetricMetadataVO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricMetadataVO metricMetadataVO = (MetricMetadataVO) o;
    return Objects.equals(this.code, metricMetadataVO.code) &&
        Objects.equals(this.description, metricMetadataVO.description) &&
        Objects.equals(this.id, metricMetadataVO.id) &&
        Objects.equals(this.name, metricMetadataVO.name) &&
        Objects.equals(this.unit, metricMetadataVO.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, id, name, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricMetadataVO {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
