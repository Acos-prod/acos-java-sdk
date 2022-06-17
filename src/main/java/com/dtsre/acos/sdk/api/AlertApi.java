package com.dtsre.acos.sdk.api;

import com.dtsre.acos.sdk.ApiException;
import com.dtsre.acos.sdk.ApiClient;
import com.dtsre.acos.sdk.ApiResponse;
import com.dtsre.acos.sdk.Configuration;
import com.dtsre.acos.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.dtsre.acos.sdk.model.AlertCreateParam;
import com.dtsre.acos.sdk.model.AlertUpdateParam;
import com.dtsre.acos.sdk.model.ROfboolean;
import com.dtsre.acos.sdk.model.ROflong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-16T17:06:47.813+08:00[Asia/Shanghai]")
public class AlertApi {
  private ApiClient apiClient;

  public AlertApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AlertApi(ApiClient apiClient) {
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
   *
   * @param param 参数
   * @return ROflong id
   * @throws ApiException 异常
   */
  public ROflong createAlert(AlertCreateParam param) throws ApiException {
    return createAlertWithHttpInfo(param).getData();
  }

  /**
   * 创建告警规则
   * 
   * @param param param (required)
   * @return ApiResponse&lt;ROflong&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ROflong> createAlertWithHttpInfo(AlertCreateParam param) throws ApiException {
    Object localVarPostBody = param;
    
    // verify the required parameter 'param' is set
    if (param == null) {
      throw new ApiException(400, "Missing the required parameter 'param' when calling createAlert");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/alert/create";

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

    return apiClient.invokeAPI("AlertApi.createAlert", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 修改告警规则
   * 
   * @param param param (required)
   * @return ROfboolean
   * @throws ApiException if fails to make API call
   */
  public ROfboolean updateAlert(AlertUpdateParam param) throws ApiException {
    return updateAlertWithHttpInfo(param).getData();
  }

  /**
   * 修改告警规则
   * 
   * @param param param (required)
   * @return ApiResponse&lt;ROfboolean&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ROfboolean> updateAlertWithHttpInfo(AlertUpdateParam param) throws ApiException {
    Object localVarPostBody = param;
    
    // verify the required parameter 'param' is set
    if (param == null) {
      throw new ApiException(400, "Missing the required parameter 'param' when calling updateAlert");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/alert/update";

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

    return apiClient.invokeAPI("AlertApi.updateAlert", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
