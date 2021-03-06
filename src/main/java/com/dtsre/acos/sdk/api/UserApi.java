package com.dtsre.acos.sdk.api;

import com.dtsre.acos.sdk.ApiException;
import com.dtsre.acos.sdk.ApiClient;
import com.dtsre.acos.sdk.ApiResponse;
import com.dtsre.acos.sdk.Configuration;
import com.dtsre.acos.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.dtsre.acos.sdk.model.ROfPagerOfTenantUserListVo;
import com.dtsre.acos.sdk.model.ROfboolean;
import com.dtsre.acos.sdk.model.UserCreate;
import com.dtsre.acos.sdk.model.UserUpdate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-16T17:06:47.813+08:00[Asia/Shanghai]")
public class UserApi {
  private ApiClient apiClient;

  public UserApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserApi(ApiClient apiClient) {
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
   * 新增租户的用户
   * 
   * @param param param (required)
   * @return ROfboolean
   * @throws ApiException if fails to make API call
   */
  public ROfboolean createTenantUser(UserCreate param) throws ApiException {
    return createTenantUserWithHttpInfo(param).getData();
  }

  /**
   * 新增租户的用户
   * 
   * @param param param (required)
   * @return ApiResponse&lt;ROfboolean&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ROfboolean> createTenantUserWithHttpInfo(UserCreate param) throws ApiException {
    Object localVarPostBody = param;
    
    // verify the required parameter 'param' is set
    if (param == null) {
      throw new ApiException(400, "Missing the required parameter 'param' when calling createTenantUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/user/create";

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

    GenericType<ROfboolean> localVarReturnType = new GenericType<ROfboolean>() {};

    return apiClient.invokeAPI("UserApi.createTenantUser", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 删除用户
   * 
   * @param userId userId (required)
   * @return ROfboolean
   * @throws ApiException if fails to make API call
   */
  public ROfboolean deleteUserFromTenant(String userId) throws ApiException {
    return deleteUserFromTenantWithHttpInfo(userId).getData();
  }

  /**
   * 删除用户
   * 
   * @param userId userId (required)
   * @return ApiResponse&lt;ROfboolean&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ROfboolean> deleteUserFromTenantWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserFromTenant");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/user/delete-from-tenant";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "API_KEY" };

    GenericType<ROfboolean> localVarReturnType = new GenericType<ROfboolean>() {};

    return apiClient.invokeAPI("UserApi.deleteUserFromTenant", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 获取租户下的用户列表
   * 
   * @param tenantId tenantId (required)
   * @param pageNum pageNum (optional, default to 0)
   * @param pageSize pageSize (optional, default to 15)
   * @param searchText searchText (optional)
   * @return ROfPagerOfTenantUserListVo
   * @throws ApiException if fails to make API call
   */
  public ROfPagerOfTenantUserListVo getUsersFromTenant(Long tenantId, Integer pageNum, Integer pageSize, String searchText) throws ApiException {
    return getUsersFromTenantWithHttpInfo(tenantId, pageNum, pageSize, searchText).getData();
  }

  /**
   * 获取租户下的用户列表
   * 
   * @param tenantId tenantId (required)
   * @param pageNum pageNum (optional, default to 0)
   * @param pageSize pageSize (optional, default to 15)
   * @param searchText searchText (optional)
   * @return ApiResponse&lt;ROfPagerOfTenantUserListVo&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ROfPagerOfTenantUserListVo> getUsersFromTenantWithHttpInfo(Long tenantId, Integer pageNum, Integer pageSize, String searchText) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tenantId' is set
    if (tenantId == null) {
      throw new ApiException(400, "Missing the required parameter 'tenantId' when calling getUsersFromTenant");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/user/{tenantId}/list-users"
      .replaceAll("\\{" + "tenantId" + "\\}", apiClient.escapeString(tenantId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageNum", pageNum));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchText", searchText));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "API_KEY" };

    GenericType<ROfPagerOfTenantUserListVo> localVarReturnType = new GenericType<ROfPagerOfTenantUserListVo>() {};

    return apiClient.invokeAPI("UserApi.getUsersFromTenant", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 修改用户的基本信息
   * 
   * @param param param (required)
   * @return ROfboolean
   * @throws ApiException if fails to make API call
   */
  public ROfboolean updateUser(UserUpdate param) throws ApiException {
    return updateUserWithHttpInfo(param).getData();
  }

  /**
   * 修改用户的基本信息
   * 
   * @param param param (required)
   * @return ApiResponse&lt;ROfboolean&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ROfboolean> updateUserWithHttpInfo(UserUpdate param) throws ApiException {
    Object localVarPostBody = param;
    
    // verify the required parameter 'param' is set
    if (param == null) {
      throw new ApiException(400, "Missing the required parameter 'param' when calling updateUser");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/user/update";

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

    GenericType<ROfboolean> localVarReturnType = new GenericType<ROfboolean>() {};

    return apiClient.invokeAPI("UserApi.updateUser", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
