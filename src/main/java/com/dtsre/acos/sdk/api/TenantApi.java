package com.dtsre.acos.sdk.api;

import com.dtsre.acos.sdk.ApiException;
import com.dtsre.acos.sdk.ApiClient;
import com.dtsre.acos.sdk.ApiResponse;
import com.dtsre.acos.sdk.Configuration;
import com.dtsre.acos.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.dtsre.acos.sdk.model.ROfListOfTenantVO;
import com.dtsre.acos.sdk.model.ROfTenantDetailVO;
import com.dtsre.acos.sdk.model.ROflong;
import com.dtsre.acos.sdk.model.TenantAddVo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-16T17:06:47.813+08:00[Asia/Shanghai]")
public class TenantApi {
  private ApiClient apiClient;

  public TenantApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TenantApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 创建租户
   * 
   * @param param param (required)
   * @return ROflong
   * @throws ApiException if fails to make API call
   */
  public ROflong createTenant(TenantAddVo param) throws ApiException {
    return createTenantWithHttpInfo(param).getData();
  }

  /**
   * 创建租户
   * 
   * @param param param (required)
   * @return ApiResponse&lt;ROflong&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ROflong> createTenantWithHttpInfo(TenantAddVo param) throws ApiException {
    Object localVarPostBody = param;
    
    // verify the required parameter 'param' is set
    if (param == null) {
      throw new ApiException(400, "Missing the required parameter 'param' when calling createTenant");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/tenant/add-tenant";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "API_KEY" };

    GenericType<ROflong> localVarReturnType = new GenericType<ROflong>() {};

    return apiClient.invokeAPI("TenantApi.createTenant", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 获取租户详情
   * 
   * @param tenantId tenantId (required)
   * @return ROfTenantDetailVO
   * @throws ApiException if fails to make API call
   */
  public ROfTenantDetailVO getTenantDetail(Long tenantId) throws ApiException {
    return getTenantDetailWithHttpInfo(tenantId).getData();
  }

  /**
   * 获取租户详情
   * 
   * @param tenantId tenantId (required)
   * @return ApiResponse&lt;ROfTenantDetailVO&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ROfTenantDetailVO> getTenantDetailWithHttpInfo(Long tenantId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenantId' is set
    if (tenantId == null) {
      throw new ApiException(400, "Missing the required parameter 'tenantId' when calling getTenantDetail");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/tenant/detail/{tenantId}"
      .replaceAll("\\{" + "tenantId" + "\\}", apiClient.escapeString(tenantId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "API_KEY" };

    GenericType<ROfTenantDetailVO> localVarReturnType = new GenericType<ROfTenantDetailVO>() {};

    return apiClient.invokeAPI("TenantApi.getTenantDetail", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 查询所有租户
   * 
   * @return ROfListOfTenantVO
   * @throws ApiException if fails to make API call
   */
  public ROfListOfTenantVO listTenants() throws ApiException {
    return listTenantsWithHttpInfo().getData();
  }

  /**
   * 查询所有租户
   * 
   * @return ApiResponse&lt;ROfListOfTenantVO&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ROfListOfTenantVO> listTenantsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/tenant/list-tenants";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "API_KEY" };

    GenericType<ROfListOfTenantVO> localVarReturnType = new GenericType<ROfListOfTenantVO>() {};

    return apiClient.invokeAPI("TenantApi.listTenants", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
