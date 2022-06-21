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
 * OpenFuncTreeNodeVO
 */
@JsonPropertyOrder({
  OpenFuncTreeNodeVO.JSON_PROPERTY_CHILDREN,
  OpenFuncTreeNodeVO.JSON_PROPERTY_ID,
  OpenFuncTreeNodeVO.JSON_PROPERTY_NAME,
  OpenFuncTreeNodeVO.JSON_PROPERTY_PARENT_ID,
  OpenFuncTreeNodeVO.JSON_PROPERTY_STATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-16T17:06:47.813+08:00[Asia/Shanghai]")
public class OpenFuncTreeNodeVO {
  public static final String JSON_PROPERTY_CHILDREN = "children";
  private List<OpenFuncTreeNodeVO> children = null;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PARENT_ID = "parentId";
  private Long parentId;

  public static final String JSON_PROPERTY_STATE = "state";
  private Boolean state;

  public OpenFuncTreeNodeVO() { 
  }

  public OpenFuncTreeNodeVO children(List<OpenFuncTreeNodeVO> children) {
    this.children = children;
    return this;
  }

  public OpenFuncTreeNodeVO addChildrenItem(OpenFuncTreeNodeVO childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OpenFuncTreeNodeVO> getChildren() {
    return children;
  }


  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChildren(List<OpenFuncTreeNodeVO> children) {
    this.children = children;
  }


  public OpenFuncTreeNodeVO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * 功能模块Id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "功能模块Id")
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


  public OpenFuncTreeNodeVO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 功能模块名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "功能模块名称")
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


  public OpenFuncTreeNodeVO parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * 上级功能模块Id
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上级功能模块Id")
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getParentId() {
    return parentId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  public OpenFuncTreeNodeVO state(Boolean state) {
    this.state = state;
    return this;
  }

   /**
   * 当前角色是否授权该模块
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "当前角色是否授权该模块")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(Boolean state) {
    this.state = state;
  }


  /**
   * Return true if this OpenFuncTreeNodeVO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenFuncTreeNodeVO openFuncTreeNodeVO = (OpenFuncTreeNodeVO) o;
    return Objects.equals(this.children, openFuncTreeNodeVO.children) &&
        Objects.equals(this.id, openFuncTreeNodeVO.id) &&
        Objects.equals(this.name, openFuncTreeNodeVO.name) &&
        Objects.equals(this.parentId, openFuncTreeNodeVO.parentId) &&
        Objects.equals(this.state, openFuncTreeNodeVO.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, id, name, parentId, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenFuncTreeNodeVO {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
