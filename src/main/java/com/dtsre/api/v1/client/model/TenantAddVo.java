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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.dtsre.api.v1.client.JSON;


/**
 * TenantAddVo
 */
@JsonPropertyOrder({
  TenantAddVo.JSON_PROPERTY_BELONG_USER,
  TenantAddVo.JSON_PROPERTY_DESCRIPTION,
  TenantAddVo.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T14:34:25.795+08:00[Asia/Shanghai]")
public class TenantAddVo {
  public static final String JSON_PROPERTY_BELONG_USER = "belongUser";
  private String belongUser;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public TenantAddVo() { 
  }

  public TenantAddVo belongUser(String belongUser) {
    this.belongUser = belongUser;
    return this;
  }

   /**
   * 租户初始化的归属者
   * @return belongUser
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "这是什么租户", required = true, value = "租户初始化的归属者")
  @JsonProperty(JSON_PROPERTY_BELONG_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBelongUser() {
    return belongUser;
  }


  @JsonProperty(JSON_PROPERTY_BELONG_USER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBelongUser(String belongUser) {
    this.belongUser = belongUser;
  }


  public TenantAddVo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 租户描述
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "这是什么租户", required = true, value = "租户描述")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public TenantAddVo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 租户名称
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "默认租户", required = true, value = "租户名称")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this TenantAddVo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantAddVo tenantAddVo = (TenantAddVo) o;
    return Objects.equals(this.belongUser, tenantAddVo.belongUser) &&
        Objects.equals(this.description, tenantAddVo.description) &&
        Objects.equals(this.name, tenantAddVo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(belongUser, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantAddVo {\n");
    sb.append("    belongUser: ").append(toIndentedString(belongUser)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
