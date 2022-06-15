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
 * TenantVO
 */
@JsonPropertyOrder({
  TenantVO.JSON_PROPERTY_TENANT_ID,
  TenantVO.JSON_PROPERTY_TENANT_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T14:34:25.795+08:00[Asia/Shanghai]")
public class TenantVO {
  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private Long tenantId;

  public static final String JSON_PROPERTY_TENANT_NAME = "tenantName";
  private String tenantName;

  public TenantVO() { 
  }

  public TenantVO tenantId(Long tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * 租户id
   * @return tenantId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "租户id")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenantId(Long tenantId) {
    this.tenantId = tenantId;
  }


  public TenantVO tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

   /**
   * 租户id
   * @return tenantName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "租户名称", required = true, value = "租户id")
  @JsonProperty(JSON_PROPERTY_TENANT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTenantName() {
    return tenantName;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }


  /**
   * Return true if this TenantVO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantVO tenantVO = (TenantVO) o;
    return Objects.equals(this.tenantId, tenantVO.tenantId) &&
        Objects.equals(this.tenantName, tenantVO.tenantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, tenantName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantVO {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
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

