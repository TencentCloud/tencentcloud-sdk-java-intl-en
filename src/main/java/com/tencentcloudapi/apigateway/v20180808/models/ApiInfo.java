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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiInfo extends AbstractModel {

    /**
    * Unique service ID of API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Service name of API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Service description of API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceDesc")
    @Expose
    private String ServiceDesc;

    /**
    * Unique API ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API description.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiDesc")
    @Expose
    private String ApiDesc;

    /**
    * Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * API name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * API type. Valid values: NORMAL (general API), TSF (microservice API).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * API frontend request type, such as HTTP, HTTPS, or HTTP and HTTPS.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * API authentication type. Valid values: SECRET (key pair authentication), NONE (no authentication), OAUTH.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * OAuth API type. Valid values: NORMAL (business API), OAUTH (authorization API).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiBusinessType")
    @Expose
    private String ApiBusinessType;

    /**
    * Unique ID of the authorization API associated with OAuth business API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthRelationApiId")
    @Expose
    private String AuthRelationApiId;

    /**
    * OAuth configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OauthConfig")
    @Expose
    private OauthConfig OauthConfig;

    /**
    * Whether to enable debugging after purchase (reserved field for the marketplace).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDebugAfterCharge")
    @Expose
    private Boolean IsDebugAfterCharge;

    /**
    * Request frontend configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestConfig")
    @Expose
    private RequestConfig RequestConfig;

    /**
    * Return type.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResponseType")
    @Expose
    private String ResponseType;

    /**
    * Sample response for successful custom response configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResponseSuccessExample")
    @Expose
    private String ResponseSuccessExample;

    /**
    * Sample response for failed custom response configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResponseFailExample")
    @Expose
    private String ResponseFailExample;

    /**
    * Custom error code configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResponseErrorCodes")
    @Expose
    private ErrorCodes [] ResponseErrorCodes;

    /**
    * Frontend request parameter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RequestParameters")
    @Expose
    private ReqParameter [] RequestParameters;

    /**
    * API backend service timeout period in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceTimeout")
    @Expose
    private Long ServiceTimeout;

    /**
    * API backend service type. Valid values: HTTP, MOCK, TSF, CLB, SCF, WEBSOCKET, TARGET (in beta test).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * API backend service configuration.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceConfig")
    @Expose
    private ServiceConfig ServiceConfig;

    /**
    * API backend service parameter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceParameters")
    @Expose
    private ServiceParameter [] ServiceParameters;

    /**
    * Constant parameter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConstantParameters")
    @Expose
    private ConstantParameter [] ConstantParameters;

    /**
    * Returned message of API backend Mock, which is required if `ServiceType` is `Mock`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceMockReturnMessage")
    @Expose
    private String ServiceMockReturnMessage;

    /**
    * SCF function name, which takes effect if the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceScfFunctionName")
    @Expose
    private String ServiceScfFunctionName;

    /**
    * SCF function namespace, which takes effect if the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceScfFunctionNamespace")
    @Expose
    private String ServiceScfFunctionNamespace;

    /**
    * SCF function version, which takes effect if the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceScfFunctionQualifier")
    @Expose
    private String ServiceScfFunctionQualifier;

    /**
    * Whether integrated response is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceScfIsIntegratedResponse")
    @Expose
    private Boolean ServiceScfIsIntegratedResponse;

    /**
    * SCF WebSocket registration function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceWebsocketRegisterFunctionName")
    @Expose
    private String ServiceWebsocketRegisterFunctionName;

    /**
    * SCF WebSocket registration function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceWebsocketRegisterFunctionNamespace")
    @Expose
    private String ServiceWebsocketRegisterFunctionNamespace;

    /**
    * SCF WebSocket transfer function version, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceWebsocketRegisterFunctionQualifier")
    @Expose
    private String ServiceWebsocketRegisterFunctionQualifier;

    /**
    * SCF WebSocket cleanup function, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceWebsocketCleanupFunctionName")
    @Expose
    private String ServiceWebsocketCleanupFunctionName;

    /**
    * SCF WebSocket cleanup function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceWebsocketCleanupFunctionNamespace")
    @Expose
    private String ServiceWebsocketCleanupFunctionNamespace;

    /**
    * SCF WebSocket cleanup function version, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceWebsocketCleanupFunctionQualifier")
    @Expose
    private String ServiceWebsocketCleanupFunctionQualifier;

    /**
    * WebSocket callback address.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InternalDomain")
    @Expose
    private String InternalDomain;

    /**
    * SCF WebSocket transfer function, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceWebsocketTransportFunctionName")
    @Expose
    private String ServiceWebsocketTransportFunctionName;

    /**
    * SCF WebSocket transfer function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceWebsocketTransportFunctionNamespace")
    @Expose
    private String ServiceWebsocketTransportFunctionNamespace;

    /**
    * SCF WebSocket transfer function version, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceWebsocketTransportFunctionQualifier")
    @Expose
    private String ServiceWebsocketTransportFunctionQualifier;

    /**
    * List of microservices bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MicroServices")
    @Expose
    private MicroService [] MicroServices;

    /**
    * Microservice details.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MicroServicesInfo")
    @Expose
    private Long [] MicroServicesInfo;

    /**
    * Load balancing configuration of microservice.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceTsfLoadBalanceConf")
    @Expose
    private TsfLoadBalanceConfResp ServiceTsfLoadBalanceConf;

    /**
    * Health check configuration of microservice.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceTsfHealthCheckConf")
    @Expose
    private HealthCheckConf ServiceTsfHealthCheckConf;

    /**
    * Whether to enable CORS.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableCORS")
    @Expose
    private Boolean EnableCORS;

    /**
    * Information of tags bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Environment information published for API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Environments")
    @Expose
    private String [] Environments;

    /**
    * Whether to enable Base64 encoding. This parameter takes effect only when the backend is SCF.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("IsBase64Encoded")
    @Expose
    private Boolean IsBase64Encoded;

    /**
    * Whether to trigger Base64 encoding by header. This parameter takes effect only when the backend is SCF.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("IsBase64Trigger")
    @Expose
    private Boolean IsBase64Trigger;

    /**
    * Header trigger rules. The number of rules cannot exceed 10.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Base64EncodedTriggerRules")
    @Expose
    private Base64EncodedTriggerRule [] Base64EncodedTriggerRules;

    /**
     * Get Unique service ID of API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceId Unique service ID of API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique service ID of API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceId Unique service ID of API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Service name of API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceName Service name of API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name of API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceName Service name of API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Service description of API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceDesc Service description of API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceDesc() {
        return this.ServiceDesc;
    }

    /**
     * Set Service description of API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceDesc Service description of API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceDesc(String ServiceDesc) {
        this.ServiceDesc = ServiceDesc;
    }

    /**
     * Get Unique API ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiId Unique API ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set Unique API ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiId Unique API ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API description.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiDesc API description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiDesc() {
        return this.ApiDesc;
    }

    /**
     * Set API description.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiDesc API description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiDesc(String ApiDesc) {
        this.ApiDesc = ApiDesc;
    }

    /**
     * Get Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedTime Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedTime Creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ModifiedTime Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ModifiedTime Last modified time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get API name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiName API name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set API name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiName API name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get API type. Valid values: NORMAL (general API), TSF (microservice API).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiType API type. Valid values: NORMAL (general API), TSF (microservice API).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set API type. Valid values: NORMAL (general API), TSF (microservice API).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiType API type. Valid values: NORMAL (general API), TSF (microservice API).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get API frontend request type, such as HTTP, HTTPS, or HTTP and HTTPS.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Protocol API frontend request type, such as HTTP, HTTPS, or HTTP and HTTPS.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set API frontend request type, such as HTTP, HTTPS, or HTTP and HTTPS.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Protocol API frontend request type, such as HTTP, HTTPS, or HTTP and HTTPS.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get API authentication type. Valid values: SECRET (key pair authentication), NONE (no authentication), OAUTH.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AuthType API authentication type. Valid values: SECRET (key pair authentication), NONE (no authentication), OAUTH.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set API authentication type. Valid values: SECRET (key pair authentication), NONE (no authentication), OAUTH.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AuthType API authentication type. Valid values: SECRET (key pair authentication), NONE (no authentication), OAUTH.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get OAuth API type. Valid values: NORMAL (business API), OAUTH (authorization API).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ApiBusinessType OAuth API type. Valid values: NORMAL (business API), OAUTH (authorization API).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getApiBusinessType() {
        return this.ApiBusinessType;
    }

    /**
     * Set OAuth API type. Valid values: NORMAL (business API), OAUTH (authorization API).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ApiBusinessType OAuth API type. Valid values: NORMAL (business API), OAUTH (authorization API).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setApiBusinessType(String ApiBusinessType) {
        this.ApiBusinessType = ApiBusinessType;
    }

    /**
     * Get Unique ID of the authorization API associated with OAuth business API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AuthRelationApiId Unique ID of the authorization API associated with OAuth business API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthRelationApiId() {
        return this.AuthRelationApiId;
    }

    /**
     * Set Unique ID of the authorization API associated with OAuth business API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AuthRelationApiId Unique ID of the authorization API associated with OAuth business API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthRelationApiId(String AuthRelationApiId) {
        this.AuthRelationApiId = AuthRelationApiId;
    }

    /**
     * Get OAuth configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OauthConfig OAuth configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OauthConfig getOauthConfig() {
        return this.OauthConfig;
    }

    /**
     * Set OAuth configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OauthConfig OAuth configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOauthConfig(OauthConfig OauthConfig) {
        this.OauthConfig = OauthConfig;
    }

    /**
     * Get Whether to enable debugging after purchase (reserved field for the marketplace).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsDebugAfterCharge Whether to enable debugging after purchase (reserved field for the marketplace).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsDebugAfterCharge() {
        return this.IsDebugAfterCharge;
    }

    /**
     * Set Whether to enable debugging after purchase (reserved field for the marketplace).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsDebugAfterCharge Whether to enable debugging after purchase (reserved field for the marketplace).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDebugAfterCharge(Boolean IsDebugAfterCharge) {
        this.IsDebugAfterCharge = IsDebugAfterCharge;
    }

    /**
     * Get Request frontend configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RequestConfig Request frontend configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public RequestConfig getRequestConfig() {
        return this.RequestConfig;
    }

    /**
     * Set Request frontend configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RequestConfig Request frontend configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRequestConfig(RequestConfig RequestConfig) {
        this.RequestConfig = RequestConfig;
    }

    /**
     * Get Return type.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ResponseType Return type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getResponseType() {
        return this.ResponseType;
    }

    /**
     * Set Return type.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ResponseType Return type.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResponseType(String ResponseType) {
        this.ResponseType = ResponseType;
    }

    /**
     * Get Sample response for successful custom response configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ResponseSuccessExample Sample response for successful custom response configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getResponseSuccessExample() {
        return this.ResponseSuccessExample;
    }

    /**
     * Set Sample response for successful custom response configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ResponseSuccessExample Sample response for successful custom response configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResponseSuccessExample(String ResponseSuccessExample) {
        this.ResponseSuccessExample = ResponseSuccessExample;
    }

    /**
     * Get Sample response for failed custom response configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ResponseFailExample Sample response for failed custom response configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getResponseFailExample() {
        return this.ResponseFailExample;
    }

    /**
     * Set Sample response for failed custom response configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ResponseFailExample Sample response for failed custom response configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResponseFailExample(String ResponseFailExample) {
        this.ResponseFailExample = ResponseFailExample;
    }

    /**
     * Get Custom error code configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ResponseErrorCodes Custom error code configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ErrorCodes [] getResponseErrorCodes() {
        return this.ResponseErrorCodes;
    }

    /**
     * Set Custom error code configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ResponseErrorCodes Custom error code configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setResponseErrorCodes(ErrorCodes [] ResponseErrorCodes) {
        this.ResponseErrorCodes = ResponseErrorCodes;
    }

    /**
     * Get Frontend request parameter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RequestParameters Frontend request parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ReqParameter [] getRequestParameters() {
        return this.RequestParameters;
    }

    /**
     * Set Frontend request parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RequestParameters Frontend request parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRequestParameters(ReqParameter [] RequestParameters) {
        this.RequestParameters = RequestParameters;
    }

    /**
     * Get API backend service timeout period in seconds.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceTimeout API backend service timeout period in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getServiceTimeout() {
        return this.ServiceTimeout;
    }

    /**
     * Set API backend service timeout period in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceTimeout API backend service timeout period in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceTimeout(Long ServiceTimeout) {
        this.ServiceTimeout = ServiceTimeout;
    }

    /**
     * Get API backend service type. Valid values: HTTP, MOCK, TSF, CLB, SCF, WEBSOCKET, TARGET (in beta test).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceType API backend service type. Valid values: HTTP, MOCK, TSF, CLB, SCF, WEBSOCKET, TARGET (in beta test).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set API backend service type. Valid values: HTTP, MOCK, TSF, CLB, SCF, WEBSOCKET, TARGET (in beta test).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceType API backend service type. Valid values: HTTP, MOCK, TSF, CLB, SCF, WEBSOCKET, TARGET (in beta test).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get API backend service configuration.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceConfig API backend service configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ServiceConfig getServiceConfig() {
        return this.ServiceConfig;
    }

    /**
     * Set API backend service configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceConfig API backend service configuration.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceConfig(ServiceConfig ServiceConfig) {
        this.ServiceConfig = ServiceConfig;
    }

    /**
     * Get API backend service parameter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceParameters API backend service parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ServiceParameter [] getServiceParameters() {
        return this.ServiceParameters;
    }

    /**
     * Set API backend service parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceParameters API backend service parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceParameters(ServiceParameter [] ServiceParameters) {
        this.ServiceParameters = ServiceParameters;
    }

    /**
     * Get Constant parameter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConstantParameters Constant parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ConstantParameter [] getConstantParameters() {
        return this.ConstantParameters;
    }

    /**
     * Set Constant parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConstantParameters Constant parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConstantParameters(ConstantParameter [] ConstantParameters) {
        this.ConstantParameters = ConstantParameters;
    }

    /**
     * Get Returned message of API backend Mock, which is required if `ServiceType` is `Mock`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceMockReturnMessage Returned message of API backend Mock, which is required if `ServiceType` is `Mock`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceMockReturnMessage() {
        return this.ServiceMockReturnMessage;
    }

    /**
     * Set Returned message of API backend Mock, which is required if `ServiceType` is `Mock`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceMockReturnMessage Returned message of API backend Mock, which is required if `ServiceType` is `Mock`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceMockReturnMessage(String ServiceMockReturnMessage) {
        this.ServiceMockReturnMessage = ServiceMockReturnMessage;
    }

    /**
     * Get SCF function name, which takes effect if the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceScfFunctionName SCF function name, which takes effect if the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceScfFunctionName() {
        return this.ServiceScfFunctionName;
    }

    /**
     * Set SCF function name, which takes effect if the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceScfFunctionName SCF function name, which takes effect if the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceScfFunctionName(String ServiceScfFunctionName) {
        this.ServiceScfFunctionName = ServiceScfFunctionName;
    }

    /**
     * Get SCF function namespace, which takes effect if the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceScfFunctionNamespace SCF function namespace, which takes effect if the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceScfFunctionNamespace() {
        return this.ServiceScfFunctionNamespace;
    }

    /**
     * Set SCF function namespace, which takes effect if the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceScfFunctionNamespace SCF function namespace, which takes effect if the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceScfFunctionNamespace(String ServiceScfFunctionNamespace) {
        this.ServiceScfFunctionNamespace = ServiceScfFunctionNamespace;
    }

    /**
     * Get SCF function version, which takes effect if the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceScfFunctionQualifier SCF function version, which takes effect if the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceScfFunctionQualifier() {
        return this.ServiceScfFunctionQualifier;
    }

    /**
     * Set SCF function version, which takes effect if the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceScfFunctionQualifier SCF function version, which takes effect if the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceScfFunctionQualifier(String ServiceScfFunctionQualifier) {
        this.ServiceScfFunctionQualifier = ServiceScfFunctionQualifier;
    }

    /**
     * Get Whether integrated response is enabled.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceScfIsIntegratedResponse Whether integrated response is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getServiceScfIsIntegratedResponse() {
        return this.ServiceScfIsIntegratedResponse;
    }

    /**
     * Set Whether integrated response is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceScfIsIntegratedResponse Whether integrated response is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceScfIsIntegratedResponse(Boolean ServiceScfIsIntegratedResponse) {
        this.ServiceScfIsIntegratedResponse = ServiceScfIsIntegratedResponse;
    }

    /**
     * Get SCF WebSocket registration function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceWebsocketRegisterFunctionName SCF WebSocket registration function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceWebsocketRegisterFunctionName() {
        return this.ServiceWebsocketRegisterFunctionName;
    }

    /**
     * Set SCF WebSocket registration function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceWebsocketRegisterFunctionName SCF WebSocket registration function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceWebsocketRegisterFunctionName(String ServiceWebsocketRegisterFunctionName) {
        this.ServiceWebsocketRegisterFunctionName = ServiceWebsocketRegisterFunctionName;
    }

    /**
     * Get SCF WebSocket registration function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceWebsocketRegisterFunctionNamespace SCF WebSocket registration function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceWebsocketRegisterFunctionNamespace() {
        return this.ServiceWebsocketRegisterFunctionNamespace;
    }

    /**
     * Set SCF WebSocket registration function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceWebsocketRegisterFunctionNamespace SCF WebSocket registration function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceWebsocketRegisterFunctionNamespace(String ServiceWebsocketRegisterFunctionNamespace) {
        this.ServiceWebsocketRegisterFunctionNamespace = ServiceWebsocketRegisterFunctionNamespace;
    }

    /**
     * Get SCF WebSocket transfer function version, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceWebsocketRegisterFunctionQualifier SCF WebSocket transfer function version, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceWebsocketRegisterFunctionQualifier() {
        return this.ServiceWebsocketRegisterFunctionQualifier;
    }

    /**
     * Set SCF WebSocket transfer function version, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceWebsocketRegisterFunctionQualifier SCF WebSocket transfer function version, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceWebsocketRegisterFunctionQualifier(String ServiceWebsocketRegisterFunctionQualifier) {
        this.ServiceWebsocketRegisterFunctionQualifier = ServiceWebsocketRegisterFunctionQualifier;
    }

    /**
     * Get SCF WebSocket cleanup function, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceWebsocketCleanupFunctionName SCF WebSocket cleanup function, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceWebsocketCleanupFunctionName() {
        return this.ServiceWebsocketCleanupFunctionName;
    }

    /**
     * Set SCF WebSocket cleanup function, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceWebsocketCleanupFunctionName SCF WebSocket cleanup function, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceWebsocketCleanupFunctionName(String ServiceWebsocketCleanupFunctionName) {
        this.ServiceWebsocketCleanupFunctionName = ServiceWebsocketCleanupFunctionName;
    }

    /**
     * Get SCF WebSocket cleanup function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceWebsocketCleanupFunctionNamespace SCF WebSocket cleanup function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceWebsocketCleanupFunctionNamespace() {
        return this.ServiceWebsocketCleanupFunctionNamespace;
    }

    /**
     * Set SCF WebSocket cleanup function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceWebsocketCleanupFunctionNamespace SCF WebSocket cleanup function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceWebsocketCleanupFunctionNamespace(String ServiceWebsocketCleanupFunctionNamespace) {
        this.ServiceWebsocketCleanupFunctionNamespace = ServiceWebsocketCleanupFunctionNamespace;
    }

    /**
     * Get SCF WebSocket cleanup function version, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceWebsocketCleanupFunctionQualifier SCF WebSocket cleanup function version, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceWebsocketCleanupFunctionQualifier() {
        return this.ServiceWebsocketCleanupFunctionQualifier;
    }

    /**
     * Set SCF WebSocket cleanup function version, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceWebsocketCleanupFunctionQualifier SCF WebSocket cleanup function version, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceWebsocketCleanupFunctionQualifier(String ServiceWebsocketCleanupFunctionQualifier) {
        this.ServiceWebsocketCleanupFunctionQualifier = ServiceWebsocketCleanupFunctionQualifier;
    }

    /**
     * Get WebSocket callback address.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InternalDomain WebSocket callback address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInternalDomain() {
        return this.InternalDomain;
    }

    /**
     * Set WebSocket callback address.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InternalDomain WebSocket callback address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInternalDomain(String InternalDomain) {
        this.InternalDomain = InternalDomain;
    }

    /**
     * Get SCF WebSocket transfer function, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceWebsocketTransportFunctionName SCF WebSocket transfer function, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceWebsocketTransportFunctionName() {
        return this.ServiceWebsocketTransportFunctionName;
    }

    /**
     * Set SCF WebSocket transfer function, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceWebsocketTransportFunctionName SCF WebSocket transfer function, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceWebsocketTransportFunctionName(String ServiceWebsocketTransportFunctionName) {
        this.ServiceWebsocketTransportFunctionName = ServiceWebsocketTransportFunctionName;
    }

    /**
     * Get SCF WebSocket transfer function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceWebsocketTransportFunctionNamespace SCF WebSocket transfer function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceWebsocketTransportFunctionNamespace() {
        return this.ServiceWebsocketTransportFunctionNamespace;
    }

    /**
     * Set SCF WebSocket transfer function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceWebsocketTransportFunctionNamespace SCF WebSocket transfer function namespace, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceWebsocketTransportFunctionNamespace(String ServiceWebsocketTransportFunctionNamespace) {
        this.ServiceWebsocketTransportFunctionNamespace = ServiceWebsocketTransportFunctionNamespace;
    }

    /**
     * Get SCF WebSocket transfer function version, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceWebsocketTransportFunctionQualifier SCF WebSocket transfer function version, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceWebsocketTransportFunctionQualifier() {
        return this.ServiceWebsocketTransportFunctionQualifier;
    }

    /**
     * Set SCF WebSocket transfer function version, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceWebsocketTransportFunctionQualifier SCF WebSocket transfer function version, which takes effect if the frontend type is `WEBSOCKET` and the backend type is `SCF`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceWebsocketTransportFunctionQualifier(String ServiceWebsocketTransportFunctionQualifier) {
        this.ServiceWebsocketTransportFunctionQualifier = ServiceWebsocketTransportFunctionQualifier;
    }

    /**
     * Get List of microservices bound to API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MicroServices List of microservices bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MicroService [] getMicroServices() {
        return this.MicroServices;
    }

    /**
     * Set List of microservices bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MicroServices List of microservices bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMicroServices(MicroService [] MicroServices) {
        this.MicroServices = MicroServices;
    }

    /**
     * Get Microservice details.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MicroServicesInfo Microservice details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getMicroServicesInfo() {
        return this.MicroServicesInfo;
    }

    /**
     * Set Microservice details.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MicroServicesInfo Microservice details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMicroServicesInfo(Long [] MicroServicesInfo) {
        this.MicroServicesInfo = MicroServicesInfo;
    }

    /**
     * Get Load balancing configuration of microservice.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceTsfLoadBalanceConf Load balancing configuration of microservice.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TsfLoadBalanceConfResp getServiceTsfLoadBalanceConf() {
        return this.ServiceTsfLoadBalanceConf;
    }

    /**
     * Set Load balancing configuration of microservice.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceTsfLoadBalanceConf Load balancing configuration of microservice.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceTsfLoadBalanceConf(TsfLoadBalanceConfResp ServiceTsfLoadBalanceConf) {
        this.ServiceTsfLoadBalanceConf = ServiceTsfLoadBalanceConf;
    }

    /**
     * Get Health check configuration of microservice.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceTsfHealthCheckConf Health check configuration of microservice.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public HealthCheckConf getServiceTsfHealthCheckConf() {
        return this.ServiceTsfHealthCheckConf;
    }

    /**
     * Set Health check configuration of microservice.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceTsfHealthCheckConf Health check configuration of microservice.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceTsfHealthCheckConf(HealthCheckConf ServiceTsfHealthCheckConf) {
        this.ServiceTsfHealthCheckConf = ServiceTsfHealthCheckConf;
    }

    /**
     * Get Whether to enable CORS.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EnableCORS Whether to enable CORS.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnableCORS() {
        return this.EnableCORS;
    }

    /**
     * Set Whether to enable CORS.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EnableCORS Whether to enable CORS.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableCORS(Boolean EnableCORS) {
        this.EnableCORS = EnableCORS;
    }

    /**
     * Get Information of tags bound to API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tags Information of tags bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Information of tags bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tags Information of tags bound to API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Environment information published for API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Environments Environment information published for API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getEnvironments() {
        return this.Environments;
    }

    /**
     * Set Environment information published for API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Environments Environment information published for API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEnvironments(String [] Environments) {
        this.Environments = Environments;
    }

    /**
     * Get Whether to enable Base64 encoding. This parameter takes effect only when the backend is SCF.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return IsBase64Encoded Whether to enable Base64 encoding. This parameter takes effect only when the backend is SCF.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getIsBase64Encoded() {
        return this.IsBase64Encoded;
    }

    /**
     * Set Whether to enable Base64 encoding. This parameter takes effect only when the backend is SCF.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param IsBase64Encoded Whether to enable Base64 encoding. This parameter takes effect only when the backend is SCF.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIsBase64Encoded(Boolean IsBase64Encoded) {
        this.IsBase64Encoded = IsBase64Encoded;
    }

    /**
     * Get Whether to trigger Base64 encoding by header. This parameter takes effect only when the backend is SCF.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return IsBase64Trigger Whether to trigger Base64 encoding by header. This parameter takes effect only when the backend is SCF.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getIsBase64Trigger() {
        return this.IsBase64Trigger;
    }

    /**
     * Set Whether to trigger Base64 encoding by header. This parameter takes effect only when the backend is SCF.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param IsBase64Trigger Whether to trigger Base64 encoding by header. This parameter takes effect only when the backend is SCF.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIsBase64Trigger(Boolean IsBase64Trigger) {
        this.IsBase64Trigger = IsBase64Trigger;
    }

    /**
     * Get Header trigger rules. The number of rules cannot exceed 10.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Base64EncodedTriggerRules Header trigger rules. The number of rules cannot exceed 10.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Base64EncodedTriggerRule [] getBase64EncodedTriggerRules() {
        return this.Base64EncodedTriggerRules;
    }

    /**
     * Set Header trigger rules. The number of rules cannot exceed 10.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Base64EncodedTriggerRules Header trigger rules. The number of rules cannot exceed 10.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBase64EncodedTriggerRules(Base64EncodedTriggerRule [] Base64EncodedTriggerRules) {
        this.Base64EncodedTriggerRules = Base64EncodedTriggerRules;
    }

    public ApiInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiInfo(ApiInfo source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceDesc != null) {
            this.ServiceDesc = new String(source.ServiceDesc);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiDesc != null) {
            this.ApiDesc = new String(source.ApiDesc);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.ApiBusinessType != null) {
            this.ApiBusinessType = new String(source.ApiBusinessType);
        }
        if (source.AuthRelationApiId != null) {
            this.AuthRelationApiId = new String(source.AuthRelationApiId);
        }
        if (source.OauthConfig != null) {
            this.OauthConfig = new OauthConfig(source.OauthConfig);
        }
        if (source.IsDebugAfterCharge != null) {
            this.IsDebugAfterCharge = new Boolean(source.IsDebugAfterCharge);
        }
        if (source.RequestConfig != null) {
            this.RequestConfig = new RequestConfig(source.RequestConfig);
        }
        if (source.ResponseType != null) {
            this.ResponseType = new String(source.ResponseType);
        }
        if (source.ResponseSuccessExample != null) {
            this.ResponseSuccessExample = new String(source.ResponseSuccessExample);
        }
        if (source.ResponseFailExample != null) {
            this.ResponseFailExample = new String(source.ResponseFailExample);
        }
        if (source.ResponseErrorCodes != null) {
            this.ResponseErrorCodes = new ErrorCodes[source.ResponseErrorCodes.length];
            for (int i = 0; i < source.ResponseErrorCodes.length; i++) {
                this.ResponseErrorCodes[i] = new ErrorCodes(source.ResponseErrorCodes[i]);
            }
        }
        if (source.RequestParameters != null) {
            this.RequestParameters = new ReqParameter[source.RequestParameters.length];
            for (int i = 0; i < source.RequestParameters.length; i++) {
                this.RequestParameters[i] = new ReqParameter(source.RequestParameters[i]);
            }
        }
        if (source.ServiceTimeout != null) {
            this.ServiceTimeout = new Long(source.ServiceTimeout);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ServiceConfig != null) {
            this.ServiceConfig = new ServiceConfig(source.ServiceConfig);
        }
        if (source.ServiceParameters != null) {
            this.ServiceParameters = new ServiceParameter[source.ServiceParameters.length];
            for (int i = 0; i < source.ServiceParameters.length; i++) {
                this.ServiceParameters[i] = new ServiceParameter(source.ServiceParameters[i]);
            }
        }
        if (source.ConstantParameters != null) {
            this.ConstantParameters = new ConstantParameter[source.ConstantParameters.length];
            for (int i = 0; i < source.ConstantParameters.length; i++) {
                this.ConstantParameters[i] = new ConstantParameter(source.ConstantParameters[i]);
            }
        }
        if (source.ServiceMockReturnMessage != null) {
            this.ServiceMockReturnMessage = new String(source.ServiceMockReturnMessage);
        }
        if (source.ServiceScfFunctionName != null) {
            this.ServiceScfFunctionName = new String(source.ServiceScfFunctionName);
        }
        if (source.ServiceScfFunctionNamespace != null) {
            this.ServiceScfFunctionNamespace = new String(source.ServiceScfFunctionNamespace);
        }
        if (source.ServiceScfFunctionQualifier != null) {
            this.ServiceScfFunctionQualifier = new String(source.ServiceScfFunctionQualifier);
        }
        if (source.ServiceScfIsIntegratedResponse != null) {
            this.ServiceScfIsIntegratedResponse = new Boolean(source.ServiceScfIsIntegratedResponse);
        }
        if (source.ServiceWebsocketRegisterFunctionName != null) {
            this.ServiceWebsocketRegisterFunctionName = new String(source.ServiceWebsocketRegisterFunctionName);
        }
        if (source.ServiceWebsocketRegisterFunctionNamespace != null) {
            this.ServiceWebsocketRegisterFunctionNamespace = new String(source.ServiceWebsocketRegisterFunctionNamespace);
        }
        if (source.ServiceWebsocketRegisterFunctionQualifier != null) {
            this.ServiceWebsocketRegisterFunctionQualifier = new String(source.ServiceWebsocketRegisterFunctionQualifier);
        }
        if (source.ServiceWebsocketCleanupFunctionName != null) {
            this.ServiceWebsocketCleanupFunctionName = new String(source.ServiceWebsocketCleanupFunctionName);
        }
        if (source.ServiceWebsocketCleanupFunctionNamespace != null) {
            this.ServiceWebsocketCleanupFunctionNamespace = new String(source.ServiceWebsocketCleanupFunctionNamespace);
        }
        if (source.ServiceWebsocketCleanupFunctionQualifier != null) {
            this.ServiceWebsocketCleanupFunctionQualifier = new String(source.ServiceWebsocketCleanupFunctionQualifier);
        }
        if (source.InternalDomain != null) {
            this.InternalDomain = new String(source.InternalDomain);
        }
        if (source.ServiceWebsocketTransportFunctionName != null) {
            this.ServiceWebsocketTransportFunctionName = new String(source.ServiceWebsocketTransportFunctionName);
        }
        if (source.ServiceWebsocketTransportFunctionNamespace != null) {
            this.ServiceWebsocketTransportFunctionNamespace = new String(source.ServiceWebsocketTransportFunctionNamespace);
        }
        if (source.ServiceWebsocketTransportFunctionQualifier != null) {
            this.ServiceWebsocketTransportFunctionQualifier = new String(source.ServiceWebsocketTransportFunctionQualifier);
        }
        if (source.MicroServices != null) {
            this.MicroServices = new MicroService[source.MicroServices.length];
            for (int i = 0; i < source.MicroServices.length; i++) {
                this.MicroServices[i] = new MicroService(source.MicroServices[i]);
            }
        }
        if (source.MicroServicesInfo != null) {
            this.MicroServicesInfo = new Long[source.MicroServicesInfo.length];
            for (int i = 0; i < source.MicroServicesInfo.length; i++) {
                this.MicroServicesInfo[i] = new Long(source.MicroServicesInfo[i]);
            }
        }
        if (source.ServiceTsfLoadBalanceConf != null) {
            this.ServiceTsfLoadBalanceConf = new TsfLoadBalanceConfResp(source.ServiceTsfLoadBalanceConf);
        }
        if (source.ServiceTsfHealthCheckConf != null) {
            this.ServiceTsfHealthCheckConf = new HealthCheckConf(source.ServiceTsfHealthCheckConf);
        }
        if (source.EnableCORS != null) {
            this.EnableCORS = new Boolean(source.EnableCORS);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Environments != null) {
            this.Environments = new String[source.Environments.length];
            for (int i = 0; i < source.Environments.length; i++) {
                this.Environments[i] = new String(source.Environments[i]);
            }
        }
        if (source.IsBase64Encoded != null) {
            this.IsBase64Encoded = new Boolean(source.IsBase64Encoded);
        }
        if (source.IsBase64Trigger != null) {
            this.IsBase64Trigger = new Boolean(source.IsBase64Trigger);
        }
        if (source.Base64EncodedTriggerRules != null) {
            this.Base64EncodedTriggerRules = new Base64EncodedTriggerRule[source.Base64EncodedTriggerRules.length];
            for (int i = 0; i < source.Base64EncodedTriggerRules.length; i++) {
                this.Base64EncodedTriggerRules[i] = new Base64EncodedTriggerRule(source.Base64EncodedTriggerRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceDesc", this.ServiceDesc);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiDesc", this.ApiDesc);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "ApiBusinessType", this.ApiBusinessType);
        this.setParamSimple(map, prefix + "AuthRelationApiId", this.AuthRelationApiId);
        this.setParamObj(map, prefix + "OauthConfig.", this.OauthConfig);
        this.setParamSimple(map, prefix + "IsDebugAfterCharge", this.IsDebugAfterCharge);
        this.setParamObj(map, prefix + "RequestConfig.", this.RequestConfig);
        this.setParamSimple(map, prefix + "ResponseType", this.ResponseType);
        this.setParamSimple(map, prefix + "ResponseSuccessExample", this.ResponseSuccessExample);
        this.setParamSimple(map, prefix + "ResponseFailExample", this.ResponseFailExample);
        this.setParamArrayObj(map, prefix + "ResponseErrorCodes.", this.ResponseErrorCodes);
        this.setParamArrayObj(map, prefix + "RequestParameters.", this.RequestParameters);
        this.setParamSimple(map, prefix + "ServiceTimeout", this.ServiceTimeout);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamObj(map, prefix + "ServiceConfig.", this.ServiceConfig);
        this.setParamArrayObj(map, prefix + "ServiceParameters.", this.ServiceParameters);
        this.setParamArrayObj(map, prefix + "ConstantParameters.", this.ConstantParameters);
        this.setParamSimple(map, prefix + "ServiceMockReturnMessage", this.ServiceMockReturnMessage);
        this.setParamSimple(map, prefix + "ServiceScfFunctionName", this.ServiceScfFunctionName);
        this.setParamSimple(map, prefix + "ServiceScfFunctionNamespace", this.ServiceScfFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceScfFunctionQualifier", this.ServiceScfFunctionQualifier);
        this.setParamSimple(map, prefix + "ServiceScfIsIntegratedResponse", this.ServiceScfIsIntegratedResponse);
        this.setParamSimple(map, prefix + "ServiceWebsocketRegisterFunctionName", this.ServiceWebsocketRegisterFunctionName);
        this.setParamSimple(map, prefix + "ServiceWebsocketRegisterFunctionNamespace", this.ServiceWebsocketRegisterFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceWebsocketRegisterFunctionQualifier", this.ServiceWebsocketRegisterFunctionQualifier);
        this.setParamSimple(map, prefix + "ServiceWebsocketCleanupFunctionName", this.ServiceWebsocketCleanupFunctionName);
        this.setParamSimple(map, prefix + "ServiceWebsocketCleanupFunctionNamespace", this.ServiceWebsocketCleanupFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceWebsocketCleanupFunctionQualifier", this.ServiceWebsocketCleanupFunctionQualifier);
        this.setParamSimple(map, prefix + "InternalDomain", this.InternalDomain);
        this.setParamSimple(map, prefix + "ServiceWebsocketTransportFunctionName", this.ServiceWebsocketTransportFunctionName);
        this.setParamSimple(map, prefix + "ServiceWebsocketTransportFunctionNamespace", this.ServiceWebsocketTransportFunctionNamespace);
        this.setParamSimple(map, prefix + "ServiceWebsocketTransportFunctionQualifier", this.ServiceWebsocketTransportFunctionQualifier);
        this.setParamArrayObj(map, prefix + "MicroServices.", this.MicroServices);
        this.setParamArraySimple(map, prefix + "MicroServicesInfo.", this.MicroServicesInfo);
        this.setParamObj(map, prefix + "ServiceTsfLoadBalanceConf.", this.ServiceTsfLoadBalanceConf);
        this.setParamObj(map, prefix + "ServiceTsfHealthCheckConf.", this.ServiceTsfHealthCheckConf);
        this.setParamSimple(map, prefix + "EnableCORS", this.EnableCORS);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "Environments.", this.Environments);
        this.setParamSimple(map, prefix + "IsBase64Encoded", this.IsBase64Encoded);
        this.setParamSimple(map, prefix + "IsBase64Trigger", this.IsBase64Trigger);
        this.setParamArrayObj(map, prefix + "Base64EncodedTriggerRules.", this.Base64EncodedTriggerRules);

    }
}

