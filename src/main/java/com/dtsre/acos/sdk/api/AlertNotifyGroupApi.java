package com.dtsre.acos.sdk.api;

import com.dtsre.acos.sdk.ApiException;
import com.dtsre.acos.sdk.ApiClient;
import com.dtsre.acos.sdk.ApiResponse;
import com.dtsre.acos.sdk.Configuration;
import com.dtsre.acos.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.dtsre.acos.sdk.model.AlertNotifyGroupCreateParam;
import com.dtsre.acos.sdk.model.AlertNotifyGroupUpdateParam;
import com.dtsre.acos.sdk.model.ROfboolean;
import com.dtsre.acos.sdk.model.ROflong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-16T17:06:47.813+08:00[Asia/Shanghai]")
public class AlertNotifyGroupApi {
  private ApiClient apiClient;

  public AlertNotifyGroupApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AlertNotifyGroupApi(ApiClient apiClient) {
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
   * 创建通知组
   * 
   * @param param param (required)
   * @return ROflong
   * @throws ApiException if fails to make API call
   */
  public ROflong createNotifyGroup(AlertNotifyGroupCreateParam param) throws ApiException {
    return createNotifyGroupWithHttpInfo(param).getData();
  }

  /**
   * 创建通知组
   * 
   * @param param param (required)
   * @return ApiResponse&lt;ROflong&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ROflong> createNotifyGroupWithHttpInfo(AlertNotifyGroupCreateParam param) throws ApiException {
    Object localVarPostBody = param;
    
    // verify the required parameter 'param' is set
    if (param == null) {
      throw new ApiException(400, "Missing the required parameter 'param' when calling createNotifyGroup");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/alert/notify-group/create";

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

    return apiClient.invokeAPI("AlertNotifyGroupApi.createNotifyGroup", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 修改通知组
   * 
   * @param param param (required)
   * @return ROfboolean
   * @throws ApiException if fails to make API call
   */
  public ROfboolean updateNotifyGroup(AlertNotifyGroupUpdateParam param) throws ApiException {
    return updateNotifyGroupWithHttpInfo(param).getData();
  }

  /**
   * 修改通知组
   * 
   * @param param param (required)
   * @return ApiResponse&lt;ROfboolean&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ROfboolean> updateNotifyGroupWithHttpInfo(AlertNotifyGroupUpdateParam param) throws ApiException {
    Object localVarPostBody = param;
    
    // verify the required parameter 'param' is set
    if (param == null) {
      throw new ApiException(400, "Missing the required parameter 'param' when calling updateNotifyGroup");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/alert/notify-group/update";

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

    return apiClient.invokeAPI("AlertNotifyGroupApi.updateNotifyGroup", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
