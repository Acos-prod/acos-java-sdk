package com.dtsre.acos.sdk.api;

import com.dtsre.acos.sdk.ApiException;
import com.dtsre.acos.sdk.ApiClient;
import com.dtsre.acos.sdk.ApiResponse;
import com.dtsre.acos.sdk.Configuration;
import com.dtsre.acos.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.dtsre.acos.sdk.model.LogSearchParam;
import com.dtsre.acos.sdk.model.LogSendParam;
import com.dtsre.acos.sdk.model.ROfLogSearchVO;
import com.dtsre.acos.sdk.model.ROfboolean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-16T17:06:47.813+08:00[Asia/Shanghai]")
public class LogApi {
  private ApiClient apiClient;

  public LogApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LogApi(ApiClient apiClient) {
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
   * 日志查询
   * 
   * @param param param (required)
   * @return ROfLogSearchVO
   * @throws ApiException if fails to make API call
   */
  public ROfLogSearchVO searchLogs(LogSearchParam param) throws ApiException {
    return searchLogsWithHttpInfo(param).getData();
  }

  /**
   * 日志查询
   * 
   * @param param param (required)
   * @return ApiResponse&lt;ROfLogSearchVO&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ROfLogSearchVO> searchLogsWithHttpInfo(LogSearchParam param) throws ApiException {
    Object localVarPostBody = param;
    
    // verify the required parameter 'param' is set
    if (param == null) {
      throw new ApiException(400, "Missing the required parameter 'param' when calling searchLogs");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/log/search";

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

    GenericType<ROfLogSearchVO> localVarReturnType = new GenericType<ROfLogSearchVO>() {};

    return apiClient.invokeAPI("LogApi.searchLogs", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 日志上报
   * 
   * @param param param (required)
   * @return ROfboolean
   * @throws ApiException if fails to make API call
   */
  public ROfboolean sendLogs(LogSendParam param) throws ApiException {
    return sendLogsWithHttpInfo(param).getData();
  }

  /**
   * 日志上报
   * 
   * @param param param (required)
   * @return ApiResponse&lt;ROfboolean&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ROfboolean> sendLogsWithHttpInfo(LogSendParam param) throws ApiException {
    Object localVarPostBody = param;
    
    // verify the required parameter 'param' is set
    if (param == null) {
      throw new ApiException(400, "Missing the required parameter 'param' when calling sendLogs");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/log/send";

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

    return apiClient.invokeAPI("LogApi.sendLogs", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
