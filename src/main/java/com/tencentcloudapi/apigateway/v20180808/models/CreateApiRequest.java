/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApiRequest extends AbstractModel{

    /**
    * Unique ID of API's service.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * API backend service type. Valid values: HTTP, MOCK, TSF, CLB, SCF, WEBSOCKET, TARGET (in beta test).
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * API backend service timeout period in seconds.
    */
    @SerializedName("ServiceTimeout")
    @Expose
    private Long ServiceTimeout;

    /**
    * API frontend request type, such as HTTP, HTTPS, or HTTP and HTTPS.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Request frontend configuration.
    */
    @SerializedName("RequestConfig")
    @Expose
    private ApiRequestConfig RequestConfig;

    /**
    * Custom API name.
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * Custom API description.
    */
    @SerializedName("ApiDesc")
    @Expose
    private String ApiDesc;

    /**
    * API type. Valid values: NORMAL (general API), TSF (microservice API). Default value: NORMAL.
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * API authentication type. Valid values: SECRET (key pair authentication), NONE (no authentication), OAUTH. Default value: NONE.
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * Whether to enable CORS.
    */
    @SerializedName("EnableCORS")
    @Expose
    private Boolean EnableCORS;

    /**
    * Constant parameters.
    */
    @SerializedName("ConstantParameters")
    @Expose
    private ConstantParameter [] ConstantParameters;

    /**
    * Frontend request parameters.
    */
    @SerializedName("RequestParameters")
    @Expose
    private RequestParameter [] RequestParameters;

    /**
    * This field takes effect when `AuthType` is `OAUTH`. NORMAL: business API. OAUTH: authorization API.
    */
    @SerializedName("ApiBusinessType")
    @Expose
    private String ApiBusinessType;

    /**
    * Returned information of API backend mocking. This parameter is required when `ServiceType` is `Mock`.
    */
    @SerializedName("ServiceMockReturnMessage")
    @Expose
    private String ServiceMockReturnMessage;

    /**
    * List of microservices bound to API.
    */
    @SerializedName("MicroServices")
    @Expose
    private MicroServiceReq [] MicroServices;

    /**
    * Microservice load balancing configuration.
    */
    @SerializedName("ServiceTsfLoadBalanceConf")
    @Expose
    private TsfLoadBalanceConfResp ServiceTsfLoadBalanceConf;

    /**
    * Microservice health check configuration.
    */
    @SerializedName("ServiceTsfHealthCheckConf")
    @Expose
    private HealthCheckConf ServiceTsfHealthCheckConf;

    /**
    * `target` type backend resource information (in beta test).
    */
    @SerializedName("TargetServices")
    @Expose
    private TargetServicesReq [] TargetServices;

    /**
    * `target` type load balancing configuration (in beta test).
    */
    @SerializedName("TargetServicesLoadBalanceConf")
    @Expose
    private Long TargetServicesLoadBalanceConf;

    /**
    * `target` health check configuration (in beta test).
    */
    @SerializedName("TargetServicesHealthCheckConf")
    @Expose
    private HealthCheckConf TargetServicesHealthCheckConf;

    /**
    * SCF function name. This parameter takes effect when the backend type is `SCF`.
    */
    @SerializedName("ServiceScfFunctionName")
    @Expose
    private String ServiceScfFunctionName;

    /**
    * SCF WebSocket registration function. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
    */
    @SerializedName("ServiceWebsocketRegisterFunctionName")
    @Expose
    private String ServiceWebsocketRegisterFunctionName;

    /**
    * SCF WebSocket cleanup function. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
    */
    @SerializedName("ServiceWebsocketCleanupFunctionName")
    @Expose
    private String ServiceWebsocketCleanupFunctionName;

    /**
    * SCF WebSocket transfer function. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
    */
    @SerializedName("ServiceWebsocketTransportFunctionName")
    @Expose
    private String ServiceWebsocketTransportFunctionName;

    /**
    * SCF function namespace. This parameter takes effect when the backend type is `SCF`.
    */
    @SerializedName("ServiceScfFunctionNamespace")
    @Expose
    private String ServiceScfFunctionNamespace;

    /**
    * SCF function version. This parameter takes effect when the backend type is `SCF`.
    */
    @SerializedName("ServiceScfFunctionQualifier")
    @Expose
    private String ServiceScfFunctionQualifier;

    /**
    * SCF WebSocket registration function namespace. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
    */
    @SerializedName("ServiceWebsocketRegisterFunctionNamespace")
    @Expose
    private String ServiceWebsocketRegisterFunctionNamespace;

    /**
    * SCF WebSocket transfer function version. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
    */
    @SerializedName("ServiceWebsocketRegisterFunctionQualifier")
    @Expose
    private String ServiceWebsocketRegisterFunctionQualifier;

    /**
    * SCF WebSocket transfer function namespace. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
    */
    @SerializedName("ServiceWebsocketTransportFunctionNamespace")
    @Expose
    private String ServiceWebsocketTransportFunctionNamespace;

    /**
    * SCF WebSocket transfer function version. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
    */
    @SerializedName("ServiceWebsocketTransportFunctionQualifier")
    @Expose
    private String ServiceWebsocketTransportFunctionQualifier;

    /**
    * SCF WebSocket cleanup function namespace. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
    */
    @SerializedName("ServiceWebsocketCleanupFunctionNamespace")
    @Expose
    private String ServiceWebsocketCleanupFunctionNamespace;

    /**
    * SCF WebSocket cleanup function version. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
    */
    @SerializedName("ServiceWebsocketCleanupFunctionQualifier")
    @Expose
    private String ServiceWebsocketCleanupFunctionQualifier;

    /**
    * Whether to enable response integration. This parameter takes effect when the backend type is `SCF`.
    */
    @SerializedName("ServiceScfIsIntegratedResponse")
    @Expose
    private Boolean ServiceScfIsIntegratedResponse;

    /**
    * Billing after debugging starts (reserved for marketplace).
    */
    @SerializedName("IsDebugAfterCharge")
    @Expose
    private Boolean IsDebugAfterCharge;

    /**
    * Whether to delete the custom response configuration error codes. If the value is left empty or `False`, the error codes will not be deleted. If the value is `True`, all custom response configuration error codes of the API will be deleted.
    */
    @SerializedName("IsDeleteResponseErrorCodes")
    @Expose
    private Boolean IsDeleteResponseErrorCodes;

    /**
    * Return type.
    */
    @SerializedName("ResponseType")
    @Expose
    private String ResponseType;

    /**
    * Successful response sample of custom response configuration.
    */
    @SerializedName("ResponseSuccessExample")
    @Expose
    private String ResponseSuccessExample;

    /**
    * Response failure sample of custom response configuration.
    */
    @SerializedName("ResponseFailExample")
    @Expose
    private String ResponseFailExample;

    /**
    * API backend service configuration.
    */
    @SerializedName("ServiceConfig")
    @Expose
    private ServiceConfig ServiceConfig;

    /**
    * Unique ID of associated authorization API. This parameter takes effect only when `AuthType` is `OAUTH` and `ApiBusinessType` is `NORMAL`. It is the unique ID of the OAuth 2.0 authorization API bound to the business API.
    */
    @SerializedName("AuthRelationApiId")
    @Expose
    private String AuthRelationApiId;

    /**
    * API backend service parameters.
    */
    @SerializedName("ServiceParameters")
    @Expose
    private ServiceParameter [] ServiceParameters;

    /**
    * OAuth configuration. This parameter takes effect when `AuthType` is `OAUTH`.
    */
    @SerializedName("OauthConfig")
    @Expose
    private OauthConfig OauthConfig;

    /**
    * Custom error code configuration.
    */
    @SerializedName("ResponseErrorCodes")
    @Expose
    private ResponseErrorCodeReq [] ResponseErrorCodes;

    /**
    * TSF Serverless namespace ID (in beta test).
    */
    @SerializedName("TargetNamespaceId")
    @Expose
    private String TargetNamespaceId;

    /**
    * User type.
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
     * Get Unique ID of API's service. 
     * @return ServiceId Unique ID of API's service.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique ID of API's service.
     * @param ServiceId Unique ID of API's service.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get API backend service type. Valid values: HTTP, MOCK, TSF, CLB, SCF, WEBSOCKET, TARGET (in beta test). 
     * @return ServiceType API backend service type. Valid values: HTTP, MOCK, TSF, CLB, SCF, WEBSOCKET, TARGET (in beta test).
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set API backend service type. Valid values: HTTP, MOCK, TSF, CLB, SCF, WEBSOCKET, TARGET (in beta test).
     * @param ServiceType API backend service type. Valid values: HTTP, MOCK, TSF, CLB, SCF, WEBSOCKET, TARGET (in beta test).
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get API backend service timeout period in seconds. 
     * @return ServiceTimeout API backend service timeout period in seconds.
     */
    public Long getServiceTimeout() {
        return this.ServiceTimeout;
    }

    /**
     * Set API backend service timeout period in seconds.
     * @param ServiceTimeout API backend service timeout period in seconds.
     */
    public void setServiceTimeout(Long ServiceTimeout) {
        this.ServiceTimeout = ServiceTimeout;
    }

    /**
     * Get API frontend request type, such as HTTP, HTTPS, or HTTP and HTTPS. 
     * @return Protocol API frontend request type, such as HTTP, HTTPS, or HTTP and HTTPS.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set API frontend request type, such as HTTP, HTTPS, or HTTP and HTTPS.
     * @param Protocol API frontend request type, such as HTTP, HTTPS, or HTTP and HTTPS.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Request frontend configuration. 
     * @return RequestConfig Request frontend configuration.
     */
    public ApiRequestConfig getRequestConfig() {
        return this.RequestConfig;
    }

    /**
     * Set Request frontend configuration.
     * @param RequestConfig Request frontend configuration.
     */
    public void setRequestConfig(ApiRequestConfig RequestConfig) {
        this.RequestConfig = RequestConfig;
    }

    /**
     * Get Custom API name. 
     * @return ApiName Custom API name.
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set Custom API name.
     * @param ApiName Custom API name.
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get Custom API description. 
     * @return ApiDesc Custom API description.
     */
    public String getApiDesc() {
        return this.ApiDesc;
    }

    /**
     * Set Custom API description.
     * @param ApiDesc Custom API description.
     */
    public void setApiDesc(String ApiDesc) {
        this.ApiDesc = ApiDesc;
    }

    /**
     * Get API type. Valid values: NORMAL (general API), TSF (microservice API). Default value: NORMAL. 
     * @return ApiType API type. Valid values: NORMAL (general API), TSF (microservice API). Default value: NORMAL.
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set API type. Valid values: NORMAL (general API), TSF (microservice API). Default value: NORMAL.
     * @param ApiType API type. Valid values: NORMAL (general API), TSF (microservice API). Default value: NORMAL.
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get API authentication type. Valid values: SECRET (key pair authentication), NONE (no authentication), OAUTH. Default value: NONE. 
     * @return AuthType API authentication type. Valid values: SECRET (key pair authentication), NONE (no authentication), OAUTH. Default value: NONE.
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set API authentication type. Valid values: SECRET (key pair authentication), NONE (no authentication), OAUTH. Default value: NONE.
     * @param AuthType API authentication type. Valid values: SECRET (key pair authentication), NONE (no authentication), OAUTH. Default value: NONE.
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get Whether to enable CORS. 
     * @return EnableCORS Whether to enable CORS.
     */
    public Boolean getEnableCORS() {
        return this.EnableCORS;
    }

    /**
     * Set Whether to enable CORS.
     * @param EnableCORS Whether to enable CORS.
     */
    public void setEnableCORS(Boolean EnableCORS) {
        this.EnableCORS = EnableCORS;
    }

    /**
     * Get Constant parameters. 
     * @return ConstantParameters Constant parameters.
     */
    public ConstantParameter [] getConstantParameters() {
        return this.ConstantParameters;
    }

    /**
     * Set Constant parameters.
     * @param ConstantParameters Constant parameters.
     */
    public void setConstantParameters(ConstantParameter [] ConstantParameters) {
        this.ConstantParameters = ConstantParameters;
    }

    /**
     * Get Frontend request parameters. 
     * @return RequestParameters Frontend request parameters.
     */
    public RequestParameter [] getRequestParameters() {
        return this.RequestParameters;
    }

    /**
     * Set Frontend request parameters.
     * @param RequestParameters Frontend request parameters.
     */
    public void setRequestParameters(RequestParameter [] RequestParameters) {
        this.RequestParameters = RequestParameters;
    }

    /**
     * Get This field takes effect when `AuthType` is `OAUTH`. NORMAL: business API. OAUTH: authorization API. 
     * @return ApiBusinessType This field takes effect when `AuthType` is `OAUTH`. NORMAL: business API. OAUTH: authorization API.
     */
    public String getApiBusinessType() {
        return this.ApiBusinessType;
    }

    /**
     * Set This field takes effect when `AuthType` is `OAUTH`. NORMAL: business API. OAUTH: authorization API.
     * @param ApiBusinessType This field takes effect when `AuthType` is `OAUTH`. NORMAL: business API. OAUTH: authorization API.
     */
    public void setApiBusinessType(String ApiBusinessType) {
        this.ApiBusinessType = ApiBusinessType;
    }

    /**
     * Get Returned information of API backend mocking. This parameter is required when `ServiceType` is `Mock`. 
     * @return ServiceMockReturnMessage Returned information of API backend mocking. This parameter is required when `ServiceType` is `Mock`.
     */
    public String getServiceMockReturnMessage() {
        return this.ServiceMockReturnMessage;
    }

    /**
     * Set Returned information of API backend mocking. This parameter is required when `ServiceType` is `Mock`.
     * @param ServiceMockReturnMessage Returned information of API backend mocking. This parameter is required when `ServiceType` is `Mock`.
     */
    public void setServiceMockReturnMessage(String ServiceMockReturnMessage) {
        this.ServiceMockReturnMessage = ServiceMockReturnMessage;
    }

    /**
     * Get List of microservices bound to API. 
     * @return MicroServices List of microservices bound to API.
     */
    public MicroServiceReq [] getMicroServices() {
        return this.MicroServices;
    }

    /**
     * Set List of microservices bound to API.
     * @param MicroServices List of microservices bound to API.
     */
    public void setMicroServices(MicroServiceReq [] MicroServices) {
        this.MicroServices = MicroServices;
    }

    /**
     * Get Microservice load balancing configuration. 
     * @return ServiceTsfLoadBalanceConf Microservice load balancing configuration.
     */
    public TsfLoadBalanceConfResp getServiceTsfLoadBalanceConf() {
        return this.ServiceTsfLoadBalanceConf;
    }

    /**
     * Set Microservice load balancing configuration.
     * @param ServiceTsfLoadBalanceConf Microservice load balancing configuration.
     */
    public void setServiceTsfLoadBalanceConf(TsfLoadBalanceConfResp ServiceTsfLoadBalanceConf) {
        this.ServiceTsfLoadBalanceConf = ServiceTsfLoadBalanceConf;
    }

    /**
     * Get Microservice health check configuration. 
     * @return ServiceTsfHealthCheckConf Microservice health check configuration.
     */
    public HealthCheckConf getServiceTsfHealthCheckConf() {
        return this.ServiceTsfHealthCheckConf;
    }

    /**
     * Set Microservice health check configuration.
     * @param ServiceTsfHealthCheckConf Microservice health check configuration.
     */
    public void setServiceTsfHealthCheckConf(HealthCheckConf ServiceTsfHealthCheckConf) {
        this.ServiceTsfHealthCheckConf = ServiceTsfHealthCheckConf;
    }

    /**
     * Get `target` type backend resource information (in beta test). 
     * @return TargetServices `target` type backend resource information (in beta test).
     */
    public TargetServicesReq [] getTargetServices() {
        return this.TargetServices;
    }

    /**
     * Set `target` type backend resource information (in beta test).
     * @param TargetServices `target` type backend resource information (in beta test).
     */
    public void setTargetServices(TargetServicesReq [] TargetServices) {
        this.TargetServices = TargetServices;
    }

    /**
     * Get `target` type load balancing configuration (in beta test). 
     * @return TargetServicesLoadBalanceConf `target` type load balancing configuration (in beta test).
     */
    public Long getTargetServicesLoadBalanceConf() {
        return this.TargetServicesLoadBalanceConf;
    }

    /**
     * Set `target` type load balancing configuration (in beta test).
     * @param TargetServicesLoadBalanceConf `target` type load balancing configuration (in beta test).
     */
    public void setTargetServicesLoadBalanceConf(Long TargetServicesLoadBalanceConf) {
        this.TargetServicesLoadBalanceConf = TargetServicesLoadBalanceConf;
    }

    /**
     * Get `target` health check configuration (in beta test). 
     * @return TargetServicesHealthCheckConf `target` health check configuration (in beta test).
     */
    public HealthCheckConf getTargetServicesHealthCheckConf() {
        return this.TargetServicesHealthCheckConf;
    }

    /**
     * Set `target` health check configuration (in beta test).
     * @param TargetServicesHealthCheckConf `target` health check configuration (in beta test).
     */
    public void setTargetServicesHealthCheckConf(HealthCheckConf TargetServicesHealthCheckConf) {
        this.TargetServicesHealthCheckConf = TargetServicesHealthCheckConf;
    }

    /**
     * Get SCF function name. This parameter takes effect when the backend type is `SCF`. 
     * @return ServiceScfFunctionName SCF function name. This parameter takes effect when the backend type is `SCF`.
     */
    public String getServiceScfFunctionName() {
        return this.ServiceScfFunctionName;
    }

    /**
     * Set SCF function name. This parameter takes effect when the backend type is `SCF`.
     * @param ServiceScfFunctionName SCF function name. This parameter takes effect when the backend type is `SCF`.
     */
    public void setServiceScfFunctionName(String ServiceScfFunctionName) {
        this.ServiceScfFunctionName = ServiceScfFunctionName;
    }

    /**
     * Get SCF WebSocket registration function. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`. 
     * @return ServiceWebsocketRegisterFunctionName SCF WebSocket registration function. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public String getServiceWebsocketRegisterFunctionName() {
        return this.ServiceWebsocketRegisterFunctionName;
    }

    /**
     * Set SCF WebSocket registration function. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     * @param ServiceWebsocketRegisterFunctionName SCF WebSocket registration function. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public void setServiceWebsocketRegisterFunctionName(String ServiceWebsocketRegisterFunctionName) {
        this.ServiceWebsocketRegisterFunctionName = ServiceWebsocketRegisterFunctionName;
    }

    /**
     * Get SCF WebSocket cleanup function. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`. 
     * @return ServiceWebsocketCleanupFunctionName SCF WebSocket cleanup function. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public String getServiceWebsocketCleanupFunctionName() {
        return this.ServiceWebsocketCleanupFunctionName;
    }

    /**
     * Set SCF WebSocket cleanup function. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     * @param ServiceWebsocketCleanupFunctionName SCF WebSocket cleanup function. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public void setServiceWebsocketCleanupFunctionName(String ServiceWebsocketCleanupFunctionName) {
        this.ServiceWebsocketCleanupFunctionName = ServiceWebsocketCleanupFunctionName;
    }

    /**
     * Get SCF WebSocket transfer function. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`. 
     * @return ServiceWebsocketTransportFunctionName SCF WebSocket transfer function. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public String getServiceWebsocketTransportFunctionName() {
        return this.ServiceWebsocketTransportFunctionName;
    }

    /**
     * Set SCF WebSocket transfer function. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     * @param ServiceWebsocketTransportFunctionName SCF WebSocket transfer function. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public void setServiceWebsocketTransportFunctionName(String ServiceWebsocketTransportFunctionName) {
        this.ServiceWebsocketTransportFunctionName = ServiceWebsocketTransportFunctionName;
    }

    /**
     * Get SCF function namespace. This parameter takes effect when the backend type is `SCF`. 
     * @return ServiceScfFunctionNamespace SCF function namespace. This parameter takes effect when the backend type is `SCF`.
     */
    public String getServiceScfFunctionNamespace() {
        return this.ServiceScfFunctionNamespace;
    }

    /**
     * Set SCF function namespace. This parameter takes effect when the backend type is `SCF`.
     * @param ServiceScfFunctionNamespace SCF function namespace. This parameter takes effect when the backend type is `SCF`.
     */
    public void setServiceScfFunctionNamespace(String ServiceScfFunctionNamespace) {
        this.ServiceScfFunctionNamespace = ServiceScfFunctionNamespace;
    }

    /**
     * Get SCF function version. This parameter takes effect when the backend type is `SCF`. 
     * @return ServiceScfFunctionQualifier SCF function version. This parameter takes effect when the backend type is `SCF`.
     */
    public String getServiceScfFunctionQualifier() {
        return this.ServiceScfFunctionQualifier;
    }

    /**
     * Set SCF function version. This parameter takes effect when the backend type is `SCF`.
     * @param ServiceScfFunctionQualifier SCF function version. This parameter takes effect when the backend type is `SCF`.
     */
    public void setServiceScfFunctionQualifier(String ServiceScfFunctionQualifier) {
        this.ServiceScfFunctionQualifier = ServiceScfFunctionQualifier;
    }

    /**
     * Get SCF WebSocket registration function namespace. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`. 
     * @return ServiceWebsocketRegisterFunctionNamespace SCF WebSocket registration function namespace. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public String getServiceWebsocketRegisterFunctionNamespace() {
        return this.ServiceWebsocketRegisterFunctionNamespace;
    }

    /**
     * Set SCF WebSocket registration function namespace. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     * @param ServiceWebsocketRegisterFunctionNamespace SCF WebSocket registration function namespace. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public void setServiceWebsocketRegisterFunctionNamespace(String ServiceWebsocketRegisterFunctionNamespace) {
        this.ServiceWebsocketRegisterFunctionNamespace = ServiceWebsocketRegisterFunctionNamespace;
    }

    /**
     * Get SCF WebSocket transfer function version. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`. 
     * @return ServiceWebsocketRegisterFunctionQualifier SCF WebSocket transfer function version. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public String getServiceWebsocketRegisterFunctionQualifier() {
        return this.ServiceWebsocketRegisterFunctionQualifier;
    }

    /**
     * Set SCF WebSocket transfer function version. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     * @param ServiceWebsocketRegisterFunctionQualifier SCF WebSocket transfer function version. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public void setServiceWebsocketRegisterFunctionQualifier(String ServiceWebsocketRegisterFunctionQualifier) {
        this.ServiceWebsocketRegisterFunctionQualifier = ServiceWebsocketRegisterFunctionQualifier;
    }

    /**
     * Get SCF WebSocket transfer function namespace. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`. 
     * @return ServiceWebsocketTransportFunctionNamespace SCF WebSocket transfer function namespace. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public String getServiceWebsocketTransportFunctionNamespace() {
        return this.ServiceWebsocketTransportFunctionNamespace;
    }

    /**
     * Set SCF WebSocket transfer function namespace. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     * @param ServiceWebsocketTransportFunctionNamespace SCF WebSocket transfer function namespace. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public void setServiceWebsocketTransportFunctionNamespace(String ServiceWebsocketTransportFunctionNamespace) {
        this.ServiceWebsocketTransportFunctionNamespace = ServiceWebsocketTransportFunctionNamespace;
    }

    /**
     * Get SCF WebSocket transfer function version. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`. 
     * @return ServiceWebsocketTransportFunctionQualifier SCF WebSocket transfer function version. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public String getServiceWebsocketTransportFunctionQualifier() {
        return this.ServiceWebsocketTransportFunctionQualifier;
    }

    /**
     * Set SCF WebSocket transfer function version. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     * @param ServiceWebsocketTransportFunctionQualifier SCF WebSocket transfer function version. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public void setServiceWebsocketTransportFunctionQualifier(String ServiceWebsocketTransportFunctionQualifier) {
        this.ServiceWebsocketTransportFunctionQualifier = ServiceWebsocketTransportFunctionQualifier;
    }

    /**
     * Get SCF WebSocket cleanup function namespace. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`. 
     * @return ServiceWebsocketCleanupFunctionNamespace SCF WebSocket cleanup function namespace. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public String getServiceWebsocketCleanupFunctionNamespace() {
        return this.ServiceWebsocketCleanupFunctionNamespace;
    }

    /**
     * Set SCF WebSocket cleanup function namespace. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     * @param ServiceWebsocketCleanupFunctionNamespace SCF WebSocket cleanup function namespace. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public void setServiceWebsocketCleanupFunctionNamespace(String ServiceWebsocketCleanupFunctionNamespace) {
        this.ServiceWebsocketCleanupFunctionNamespace = ServiceWebsocketCleanupFunctionNamespace;
    }

    /**
     * Get SCF WebSocket cleanup function version. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`. 
     * @return ServiceWebsocketCleanupFunctionQualifier SCF WebSocket cleanup function version. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public String getServiceWebsocketCleanupFunctionQualifier() {
        return this.ServiceWebsocketCleanupFunctionQualifier;
    }

    /**
     * Set SCF WebSocket cleanup function version. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     * @param ServiceWebsocketCleanupFunctionQualifier SCF WebSocket cleanup function version. This parameter takes effect when the frontend type is `WEBSOCKET` and the backend type is `SCF`.
     */
    public void setServiceWebsocketCleanupFunctionQualifier(String ServiceWebsocketCleanupFunctionQualifier) {
        this.ServiceWebsocketCleanupFunctionQualifier = ServiceWebsocketCleanupFunctionQualifier;
    }

    /**
     * Get Whether to enable response integration. This parameter takes effect when the backend type is `SCF`. 
     * @return ServiceScfIsIntegratedResponse Whether to enable response integration. This parameter takes effect when the backend type is `SCF`.
     */
    public Boolean getServiceScfIsIntegratedResponse() {
        return this.ServiceScfIsIntegratedResponse;
    }

    /**
     * Set Whether to enable response integration. This parameter takes effect when the backend type is `SCF`.
     * @param ServiceScfIsIntegratedResponse Whether to enable response integration. This parameter takes effect when the backend type is `SCF`.
     */
    public void setServiceScfIsIntegratedResponse(Boolean ServiceScfIsIntegratedResponse) {
        this.ServiceScfIsIntegratedResponse = ServiceScfIsIntegratedResponse;
    }

    /**
     * Get Billing after debugging starts (reserved for marketplace). 
     * @return IsDebugAfterCharge Billing after debugging starts (reserved for marketplace).
     */
    public Boolean getIsDebugAfterCharge() {
        return this.IsDebugAfterCharge;
    }

    /**
     * Set Billing after debugging starts (reserved for marketplace).
     * @param IsDebugAfterCharge Billing after debugging starts (reserved for marketplace).
     */
    public void setIsDebugAfterCharge(Boolean IsDebugAfterCharge) {
        this.IsDebugAfterCharge = IsDebugAfterCharge;
    }

    /**
     * Get Whether to delete the custom response configuration error codes. If the value is left empty or `False`, the error codes will not be deleted. If the value is `True`, all custom response configuration error codes of the API will be deleted. 
     * @return IsDeleteResponseErrorCodes Whether to delete the custom response configuration error codes. If the value is left empty or `False`, the error codes will not be deleted. If the value is `True`, all custom response configuration error codes of the API will be deleted.
     */
    public Boolean getIsDeleteResponseErrorCodes() {
        return this.IsDeleteResponseErrorCodes;
    }

    /**
     * Set Whether to delete the custom response configuration error codes. If the value is left empty or `False`, the error codes will not be deleted. If the value is `True`, all custom response configuration error codes of the API will be deleted.
     * @param IsDeleteResponseErrorCodes Whether to delete the custom response configuration error codes. If the value is left empty or `False`, the error codes will not be deleted. If the value is `True`, all custom response configuration error codes of the API will be deleted.
     */
    public void setIsDeleteResponseErrorCodes(Boolean IsDeleteResponseErrorCodes) {
        this.IsDeleteResponseErrorCodes = IsDeleteResponseErrorCodes;
    }

    /**
     * Get Return type. 
     * @return ResponseType Return type.
     */
    public String getResponseType() {
        return this.ResponseType;
    }

    /**
     * Set Return type.
     * @param ResponseType Return type.
     */
    public void setResponseType(String ResponseType) {
        this.ResponseType = ResponseType;
    }

    /**
     * Get Successful response sample of custom response configuration. 
     * @return ResponseSuccessExample Successful response sample of custom response configuration.
     */
    public String getResponseSuccessExample() {
        return this.ResponseSuccessExample;
    }

    /**
     * Set Successful response sample of custom response configuration.
     * @param ResponseSuccessExample Successful response sample of custom response configuration.
     */
    public void setResponseSuccessExample(String ResponseSuccessExample) {
        this.ResponseSuccessExample = ResponseSuccessExample;
    }

    /**
     * Get Response failure sample of custom response configuration. 
     * @return ResponseFailExample Response failure sample of custom response configuration.
     */
    public String getResponseFailExample() {
        return this.ResponseFailExample;
    }

    /**
     * Set Response failure sample of custom response configuration.
     * @param ResponseFailExample Response failure sample of custom response configuration.
     */
    public void setResponseFailExample(String ResponseFailExample) {
        this.ResponseFailExample = ResponseFailExample;
    }

    /**
     * Get API backend service configuration. 
     * @return ServiceConfig API backend service configuration.
     */
    public ServiceConfig getServiceConfig() {
        return this.ServiceConfig;
    }

    /**
     * Set API backend service configuration.
     * @param ServiceConfig API backend service configuration.
     */
    public void setServiceConfig(ServiceConfig ServiceConfig) {
        this.ServiceConfig = ServiceConfig;
    }

    /**
     * Get Unique ID of associated authorization API. This parameter takes effect only when `AuthType` is `OAUTH` and `ApiBusinessType` is `NORMAL`. It is the unique ID of the OAuth 2.0 authorization API bound to the business API. 
     * @return AuthRelationApiId Unique ID of associated authorization API. This parameter takes effect only when `AuthType` is `OAUTH` and `ApiBusinessType` is `NORMAL`. It is the unique ID of the OAuth 2.0 authorization API bound to the business API.
     */
    public String getAuthRelationApiId() {
        return this.AuthRelationApiId;
    }

    /**
     * Set Unique ID of associated authorization API. This parameter takes effect only when `AuthType` is `OAUTH` and `ApiBusinessType` is `NORMAL`. It is the unique ID of the OAuth 2.0 authorization API bound to the business API.
     * @param AuthRelationApiId Unique ID of associated authorization API. This parameter takes effect only when `AuthType` is `OAUTH` and `ApiBusinessType` is `NORMAL`. It is the unique ID of the OAuth 2.0 authorization API bound to the business API.
     */
    public void setAuthRelationApiId(String AuthRelationApiId) {
        this.AuthRelationApiId = AuthRelationApiId;
    }

    /**
     * Get API backend service parameters. 
     * @return ServiceParameters API backend service parameters.
     */
    public ServiceParameter [] getServiceParameters() {
        return this.ServiceParameters;
    }

    /**
     * Set API backend service parameters.
     * @param ServiceParameters API backend service parameters.
     */
    public void setServiceParameters(ServiceParameter [] ServiceParameters) {
        this.ServiceParameters = ServiceParameters;
    }

    /**
     * Get OAuth configuration. This parameter takes effect when `AuthType` is `OAUTH`. 
     * @return OauthConfig OAuth configuration. This parameter takes effect when `AuthType` is `OAUTH`.
     */
    public OauthConfig getOauthConfig() {
        return this.OauthConfig;
    }

    /**
     * Set OAuth configuration. This parameter takes effect when `AuthType` is `OAUTH`.
     * @param OauthConfig OAuth configuration. This parameter takes effect when `AuthType` is `OAUTH`.
     */
    public void setOauthConfig(OauthConfig OauthConfig) {
        this.OauthConfig = OauthConfig;
    }

    /**
     * Get Custom error code configuration. 
     * @return ResponseErrorCodes Custom error code configuration.
     */
    public ResponseErrorCodeReq [] getResponseErrorCodes() {
        return this.ResponseErrorCodes;
    }

    /**
     * Set Custom error code configuration.
     * @param ResponseErrorCodes Custom error code configuration.
     */
    public void setResponseErrorCodes(ResponseErrorCodeReq [] ResponseErrorCodes) {
        this.ResponseErrorCodes = ResponseErrorCodes;
    }

    /**
     * Get TSF Serverless namespace ID (in beta test). 
     * @return TargetNamespaceId TSF Serverless namespace ID (in beta test).
     */
    public String getTargetNamespaceId() {
        return this.TargetNamespaceId;
    }

    /**
     * Set TSF Serverless namespace ID (in beta test).
     * @param TargetNamespaceId TSF Serverless namespace ID (in beta test).
     */
    public void setTargetNamespaceId(String TargetNamespaceId) {
        this.TargetNamespaceId = TargetNamespaceId;
    }

    /**
     * Get User type. 
     * @return UserType User type.
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set User type.
     * @param UserType User type.
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ServiceTimeout", this.ServiceTimeout);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "RequestConfig.", this.RequestConfig);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ApiDesc", this.ApiDesc);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "EnableCORS", this.EnableCORS);
        this.setParamArrayObj(map, prefix + "ConstantParameters.", this.ConstantParameters);
        this.setParamArrayObj(map, prefix + "RequestParameters.", this.RequestParameters);
        this.setParamSimple(map, prefix + "ApiBusinessType", this.ApiBusinessType);
        this.setParamSimple(map, prefix + "ServiceMockReturnMessage", this.ServiceMockReturnMessage);
        this.setParamArrayObj(map, prefix + "MicroServices.", this.MicroServices);
        this.setParamObj(map, prefix + "ServiceTsfLoadBalanceConf.", this.ServiceTsfLoadBalanceConf);
        this.setParamObj(map, prefix + "ServiceTsfHealthCheckConf.", this.ServiceTsfHealthCheckConf);
        this.setParamArrayObj(map, prefix + "TargetServices.", this.TargetServices);
        this.setParamSimple(map, prefix + "TargetServicesLoadBalanceConf", this.TargetServicesLoadBalanceConf);
        this.setParamObj(map, prefix + "TargetServicesHealthCheckConf.", this.TargetServicesHealthCheckConf);
        this.setParamSimple(map, prefix + "ServiceScfFunctionName", this.ServiceScfFunctionName);
        this.setParamSimple(map, prefix + "ServiceWebsocketRegisterFunctionName", this.ServiceWebsocketRegisterFunctionName);
        this.setParamSimple(map, prefix + "ServiceWebsocketCleanupFunctionName", this.ServiceWebsocketCleanupFunctionName);
        this.setParamSimple(map, prefix + "ServiceWebsocketTransportFunctionName", this.ServiceWebsocketTransportFunctionName);
        this.setParamSimple(map, prefix + "ServiceScfFunctionNamespace", this.ServiceScfFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceScfFunctionQualifier", this.ServiceScfFunctionQualifier);
        this.setParamSimple(map, prefix + "ServiceWebsocketRegisterFunctionNamespace", this.ServiceWebsocketRegisterFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceWebsocketRegisterFunctionQualifier", this.ServiceWebsocketRegisterFunctionQualifier);
        this.setParamSimple(map, prefix + "ServiceWebsocketTransportFunctionNamespace", this.ServiceWebsocketTransportFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceWebsocketTransportFunctionQualifier", this.ServiceWebsocketTransportFunctionQualifier);
        this.setParamSimple(map, prefix + "ServiceWebsocketCleanupFunctionNamespace", this.ServiceWebsocketCleanupFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceWebsocketCleanupFunctionQualifier", this.ServiceWebsocketCleanupFunctionQualifier);
        this.setParamSimple(map, prefix + "ServiceScfIsIntegratedResponse", this.ServiceScfIsIntegratedResponse);
        this.setParamSimple(map, prefix + "IsDebugAfterCharge", this.IsDebugAfterCharge);
        this.setParamSimple(map, prefix + "IsDeleteResponseErrorCodes", this.IsDeleteResponseErrorCodes);
        this.setParamSimple(map, prefix + "ResponseType", this.ResponseType);
        this.setParamSimple(map, prefix + "ResponseSuccessExample", this.ResponseSuccessExample);
        this.setParamSimple(map, prefix + "ResponseFailExample", this.ResponseFailExample);
        this.setParamObj(map, prefix + "ServiceConfig.", this.ServiceConfig);
        this.setParamSimple(map, prefix + "AuthRelationApiId", this.AuthRelationApiId);
        this.setParamArrayObj(map, prefix + "ServiceParameters.", this.ServiceParameters);
        this.setParamObj(map, prefix + "OauthConfig.", this.OauthConfig);
        this.setParamArrayObj(map, prefix + "ResponseErrorCodes.", this.ResponseErrorCodes);
        this.setParamSimple(map, prefix + "TargetNamespaceId", this.TargetNamespaceId);
        this.setParamSimple(map, prefix + "UserType", this.UserType);

    }
}

