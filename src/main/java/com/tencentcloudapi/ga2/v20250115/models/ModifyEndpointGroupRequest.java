/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEndpointGroupRequest extends AbstractModel {

    /**
    * <p>Global acceleration instance ID.</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>Listener ID.</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>Terminal node group ID.</p>
    */
    @SerializedName("EndpointGroupId")
    @Expose
    private String EndpointGroupId;

    /**
    * <p>Terminal node configuration.</p>
    */
    @SerializedName("EndpointConfigurations")
    @Expose
    private EndpointConfigurations [] EndpointConfigurations;

    /**
    * <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Description.</p><p>Input limit: maximum length cannot exceed 100 bytes.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Whether to enable health check.</p>
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * <p>Response timeout.</p><p>Value range: [1, 100]</p><p>This parameter is required when health check is enabled.</p>
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * <p>Health check interval.</p><p>Value range: [5, 300].</p><p>This parameter is required when health check is enabled.</p>
    */
    @SerializedName("HealthCheckInterval")
    @Expose
    private Long HealthCheckInterval;

    /**
    * <p>Unhealthy threshold.</p><p>Value range: [1, 10]</p><p>This field is required when health check is enabled.</p>
    */
    @SerializedName("UnhealthyThreshold")
    @Expose
    private Long UnhealthyThreshold;

    /**
    * <p>Health threshold.</p><p>Value range: [1, 10]</p><p>This field is required when health check is enabled.</p>
    */
    @SerializedName("HealthyThreshold")
    @Expose
    private Long HealthyThreshold;

    /**
    * <p>Select the protocol.</p><p>Input parameter limits: support filling in: 'TCP', 'HTTP', 'PING', 'CUSTOM'.</p><p>1. When the listener is TCP, you can choose CUSTOM+TCP.<br>2. When the listener is UDP, you can choose PING+CUSTOM.<br>3. When the listener is HTTP or HTTPS, you can choose HTTP.</p>
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * <p>Check port.</p><p>Value range: [1, 65535]</p><p>This field is required when CheckType is CUSTOM.</p>
    */
    @SerializedName("CheckPort")
    @Expose
    private Long CheckPort;

    /**
    * <p>Check content.</p><p>Input parameter limit: Only TEXT is supported.</p><p>This field is required when CheckType is CUSTOM.</p>
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * <p>Check request.</p><p>Input parameter limit: The length range is 1-500.</p><p>This field is required when CheckType is CUSTOM.</p>
    */
    @SerializedName("CheckSendContext")
    @Expose
    private String CheckSendContext;

    /**
    * <p>Check returned results.</p><p>Input parameter limit: length range is 1-500.</p><p>When CheckType is CUSTOM, this field is required.</p>
    */
    @SerializedName("CheckRecvContext")
    @Expose
    private String CheckRecvContext;

    /**
    * <p>Check domain name.</p><p>Input parameter limit: The length range is 3-80.</p><p>This field is required when CheckType is HTTP.</p>
    */
    @SerializedName("CheckDomain")
    @Expose
    private String CheckDomain;

    /**
    * <p>Check the URL.</p><p>Input parameter limit: length range 3-80.</p><p>This field is required when CheckType is HTTP.</p>
    */
    @SerializedName("CheckPath")
    @Expose
    private String CheckPath;

    /**
    * <p>Request method.</p><p>Input parameter limit: support filling in 'GET', 'HEAD'.</p><p>This field is required when CheckType is HTTP.</p>
    */
    @SerializedName("CheckMethod")
    @Expose
    private String CheckMethod;

    /**
    * <p>Status check code.</p><p>Input parameter limits: support selecting 'http_2xx', 'http_3xx', 'http_4xx', 'http_5xx'.</p><p>This field is required when CheckType is HTTP.</p>
    */
    @SerializedName("StatusMask")
    @Expose
    private String [] StatusMask;

    /**
    * <p>Origin-pull protocol.</p><p>Input parameter limits. Supported values: 'HTTP', 'HTTPS'.</p><p>When the CLB listener protocol is HTTP, only HTTP can be configured. When it is HTTPS, HTTP or HTTPS can be configured.</p>
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * <p>Port mapping.</p><p>When the CLB listener protocol is HTTP or HTTPS, one pair can be configured. When the CLB listener protocol is UDP or TCP, up to 30 pairs can be configured.</p>
    */
    @SerializedName("PortOverrides")
    @Expose
    private PortOverride [] PortOverrides;

    /**
    * <p>HPPTS encryption algorithm kit</p><p>Input parameter limit: support selecting 'tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3'.</p><p>This parameter can be modified only when the CLB listener protocol is HTTPS.</p>
    */
    @SerializedName("CipherPolicyId")
    @Expose
    private String CipherPolicyId;

    /**
    * <p>Only the HTTPS back-to-source protocol supports selecting ['HTTP/1.1', 'HTTP/2']</p><p>Enumeration values:</p><ul><li>HTTP/1.1: version HTTP/1.1</li><li>HTTP/2: version HTTP/2</li></ul>
    */
    @SerializedName("HttpVersion")
    @Expose
    private String HttpVersion;

    /**
     * Get <p>Global acceleration instance ID.</p> 
     * @return GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>Global acceleration instance ID.</p>
     * @param GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>Listener ID.</p> 
     * @return ListenerId <p>Listener ID.</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>Listener ID.</p>
     * @param ListenerId <p>Listener ID.</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>Terminal node group ID.</p> 
     * @return EndpointGroupId <p>Terminal node group ID.</p>
     */
    public String getEndpointGroupId() {
        return this.EndpointGroupId;
    }

    /**
     * Set <p>Terminal node group ID.</p>
     * @param EndpointGroupId <p>Terminal node group ID.</p>
     */
    public void setEndpointGroupId(String EndpointGroupId) {
        this.EndpointGroupId = EndpointGroupId;
    }

    /**
     * Get <p>Terminal node configuration.</p> 
     * @return EndpointConfigurations <p>Terminal node configuration.</p>
     */
    public EndpointConfigurations [] getEndpointConfigurations() {
        return this.EndpointConfigurations;
    }

    /**
     * Set <p>Terminal node configuration.</p>
     * @param EndpointConfigurations <p>Terminal node configuration.</p>
     */
    public void setEndpointConfigurations(EndpointConfigurations [] EndpointConfigurations) {
        this.EndpointConfigurations = EndpointConfigurations;
    }

    /**
     * Get <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p> 
     * @return Name <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
     * @param Name <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Description.</p><p>Input limit: maximum length cannot exceed 100 bytes.</p> 
     * @return Description <p>Description.</p><p>Input limit: maximum length cannot exceed 100 bytes.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p><p>Input limit: maximum length cannot exceed 100 bytes.</p>
     * @param Description <p>Description.</p><p>Input limit: maximum length cannot exceed 100 bytes.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Whether to enable health check.</p> 
     * @return EnableHealthCheck <p>Whether to enable health check.</p>
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set <p>Whether to enable health check.</p>
     * @param EnableHealthCheck <p>Whether to enable health check.</p>
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get <p>Response timeout.</p><p>Value range: [1, 100]</p><p>This parameter is required when health check is enabled.</p> 
     * @return ConnectTimeout <p>Response timeout.</p><p>Value range: [1, 100]</p><p>This parameter is required when health check is enabled.</p>
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set <p>Response timeout.</p><p>Value range: [1, 100]</p><p>This parameter is required when health check is enabled.</p>
     * @param ConnectTimeout <p>Response timeout.</p><p>Value range: [1, 100]</p><p>This parameter is required when health check is enabled.</p>
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get <p>Health check interval.</p><p>Value range: [5, 300].</p><p>This parameter is required when health check is enabled.</p> 
     * @return HealthCheckInterval <p>Health check interval.</p><p>Value range: [5, 300].</p><p>This parameter is required when health check is enabled.</p>
     */
    public Long getHealthCheckInterval() {
        return this.HealthCheckInterval;
    }

    /**
     * Set <p>Health check interval.</p><p>Value range: [5, 300].</p><p>This parameter is required when health check is enabled.</p>
     * @param HealthCheckInterval <p>Health check interval.</p><p>Value range: [5, 300].</p><p>This parameter is required when health check is enabled.</p>
     */
    public void setHealthCheckInterval(Long HealthCheckInterval) {
        this.HealthCheckInterval = HealthCheckInterval;
    }

    /**
     * Get <p>Unhealthy threshold.</p><p>Value range: [1, 10]</p><p>This field is required when health check is enabled.</p> 
     * @return UnhealthyThreshold <p>Unhealthy threshold.</p><p>Value range: [1, 10]</p><p>This field is required when health check is enabled.</p>
     */
    public Long getUnhealthyThreshold() {
        return this.UnhealthyThreshold;
    }

    /**
     * Set <p>Unhealthy threshold.</p><p>Value range: [1, 10]</p><p>This field is required when health check is enabled.</p>
     * @param UnhealthyThreshold <p>Unhealthy threshold.</p><p>Value range: [1, 10]</p><p>This field is required when health check is enabled.</p>
     */
    public void setUnhealthyThreshold(Long UnhealthyThreshold) {
        this.UnhealthyThreshold = UnhealthyThreshold;
    }

    /**
     * Get <p>Health threshold.</p><p>Value range: [1, 10]</p><p>This field is required when health check is enabled.</p> 
     * @return HealthyThreshold <p>Health threshold.</p><p>Value range: [1, 10]</p><p>This field is required when health check is enabled.</p>
     */
    public Long getHealthyThreshold() {
        return this.HealthyThreshold;
    }

    /**
     * Set <p>Health threshold.</p><p>Value range: [1, 10]</p><p>This field is required when health check is enabled.</p>
     * @param HealthyThreshold <p>Health threshold.</p><p>Value range: [1, 10]</p><p>This field is required when health check is enabled.</p>
     */
    public void setHealthyThreshold(Long HealthyThreshold) {
        this.HealthyThreshold = HealthyThreshold;
    }

    /**
     * Get <p>Select the protocol.</p><p>Input parameter limits: support filling in: 'TCP', 'HTTP', 'PING', 'CUSTOM'.</p><p>1. When the listener is TCP, you can choose CUSTOM+TCP.<br>2. When the listener is UDP, you can choose PING+CUSTOM.<br>3. When the listener is HTTP or HTTPS, you can choose HTTP.</p> 
     * @return CheckType <p>Select the protocol.</p><p>Input parameter limits: support filling in: 'TCP', 'HTTP', 'PING', 'CUSTOM'.</p><p>1. When the listener is TCP, you can choose CUSTOM+TCP.<br>2. When the listener is UDP, you can choose PING+CUSTOM.<br>3. When the listener is HTTP or HTTPS, you can choose HTTP.</p>
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set <p>Select the protocol.</p><p>Input parameter limits: support filling in: 'TCP', 'HTTP', 'PING', 'CUSTOM'.</p><p>1. When the listener is TCP, you can choose CUSTOM+TCP.<br>2. When the listener is UDP, you can choose PING+CUSTOM.<br>3. When the listener is HTTP or HTTPS, you can choose HTTP.</p>
     * @param CheckType <p>Select the protocol.</p><p>Input parameter limits: support filling in: 'TCP', 'HTTP', 'PING', 'CUSTOM'.</p><p>1. When the listener is TCP, you can choose CUSTOM+TCP.<br>2. When the listener is UDP, you can choose PING+CUSTOM.<br>3. When the listener is HTTP or HTTPS, you can choose HTTP.</p>
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get <p>Check port.</p><p>Value range: [1, 65535]</p><p>This field is required when CheckType is CUSTOM.</p> 
     * @return CheckPort <p>Check port.</p><p>Value range: [1, 65535]</p><p>This field is required when CheckType is CUSTOM.</p>
     */
    public Long getCheckPort() {
        return this.CheckPort;
    }

    /**
     * Set <p>Check port.</p><p>Value range: [1, 65535]</p><p>This field is required when CheckType is CUSTOM.</p>
     * @param CheckPort <p>Check port.</p><p>Value range: [1, 65535]</p><p>This field is required when CheckType is CUSTOM.</p>
     */
    public void setCheckPort(Long CheckPort) {
        this.CheckPort = CheckPort;
    }

    /**
     * Get <p>Check content.</p><p>Input parameter limit: Only TEXT is supported.</p><p>This field is required when CheckType is CUSTOM.</p> 
     * @return ContextType <p>Check content.</p><p>Input parameter limit: Only TEXT is supported.</p><p>This field is required when CheckType is CUSTOM.</p>
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set <p>Check content.</p><p>Input parameter limit: Only TEXT is supported.</p><p>This field is required when CheckType is CUSTOM.</p>
     * @param ContextType <p>Check content.</p><p>Input parameter limit: Only TEXT is supported.</p><p>This field is required when CheckType is CUSTOM.</p>
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get <p>Check request.</p><p>Input parameter limit: The length range is 1-500.</p><p>This field is required when CheckType is CUSTOM.</p> 
     * @return CheckSendContext <p>Check request.</p><p>Input parameter limit: The length range is 1-500.</p><p>This field is required when CheckType is CUSTOM.</p>
     */
    public String getCheckSendContext() {
        return this.CheckSendContext;
    }

    /**
     * Set <p>Check request.</p><p>Input parameter limit: The length range is 1-500.</p><p>This field is required when CheckType is CUSTOM.</p>
     * @param CheckSendContext <p>Check request.</p><p>Input parameter limit: The length range is 1-500.</p><p>This field is required when CheckType is CUSTOM.</p>
     */
    public void setCheckSendContext(String CheckSendContext) {
        this.CheckSendContext = CheckSendContext;
    }

    /**
     * Get <p>Check returned results.</p><p>Input parameter limit: length range is 1-500.</p><p>When CheckType is CUSTOM, this field is required.</p> 
     * @return CheckRecvContext <p>Check returned results.</p><p>Input parameter limit: length range is 1-500.</p><p>When CheckType is CUSTOM, this field is required.</p>
     */
    public String getCheckRecvContext() {
        return this.CheckRecvContext;
    }

    /**
     * Set <p>Check returned results.</p><p>Input parameter limit: length range is 1-500.</p><p>When CheckType is CUSTOM, this field is required.</p>
     * @param CheckRecvContext <p>Check returned results.</p><p>Input parameter limit: length range is 1-500.</p><p>When CheckType is CUSTOM, this field is required.</p>
     */
    public void setCheckRecvContext(String CheckRecvContext) {
        this.CheckRecvContext = CheckRecvContext;
    }

    /**
     * Get <p>Check domain name.</p><p>Input parameter limit: The length range is 3-80.</p><p>This field is required when CheckType is HTTP.</p> 
     * @return CheckDomain <p>Check domain name.</p><p>Input parameter limit: The length range is 3-80.</p><p>This field is required when CheckType is HTTP.</p>
     */
    public String getCheckDomain() {
        return this.CheckDomain;
    }

    /**
     * Set <p>Check domain name.</p><p>Input parameter limit: The length range is 3-80.</p><p>This field is required when CheckType is HTTP.</p>
     * @param CheckDomain <p>Check domain name.</p><p>Input parameter limit: The length range is 3-80.</p><p>This field is required when CheckType is HTTP.</p>
     */
    public void setCheckDomain(String CheckDomain) {
        this.CheckDomain = CheckDomain;
    }

    /**
     * Get <p>Check the URL.</p><p>Input parameter limit: length range 3-80.</p><p>This field is required when CheckType is HTTP.</p> 
     * @return CheckPath <p>Check the URL.</p><p>Input parameter limit: length range 3-80.</p><p>This field is required when CheckType is HTTP.</p>
     */
    public String getCheckPath() {
        return this.CheckPath;
    }

    /**
     * Set <p>Check the URL.</p><p>Input parameter limit: length range 3-80.</p><p>This field is required when CheckType is HTTP.</p>
     * @param CheckPath <p>Check the URL.</p><p>Input parameter limit: length range 3-80.</p><p>This field is required when CheckType is HTTP.</p>
     */
    public void setCheckPath(String CheckPath) {
        this.CheckPath = CheckPath;
    }

    /**
     * Get <p>Request method.</p><p>Input parameter limit: support filling in 'GET', 'HEAD'.</p><p>This field is required when CheckType is HTTP.</p> 
     * @return CheckMethod <p>Request method.</p><p>Input parameter limit: support filling in 'GET', 'HEAD'.</p><p>This field is required when CheckType is HTTP.</p>
     */
    public String getCheckMethod() {
        return this.CheckMethod;
    }

    /**
     * Set <p>Request method.</p><p>Input parameter limit: support filling in 'GET', 'HEAD'.</p><p>This field is required when CheckType is HTTP.</p>
     * @param CheckMethod <p>Request method.</p><p>Input parameter limit: support filling in 'GET', 'HEAD'.</p><p>This field is required when CheckType is HTTP.</p>
     */
    public void setCheckMethod(String CheckMethod) {
        this.CheckMethod = CheckMethod;
    }

    /**
     * Get <p>Status check code.</p><p>Input parameter limits: support selecting 'http_2xx', 'http_3xx', 'http_4xx', 'http_5xx'.</p><p>This field is required when CheckType is HTTP.</p> 
     * @return StatusMask <p>Status check code.</p><p>Input parameter limits: support selecting 'http_2xx', 'http_3xx', 'http_4xx', 'http_5xx'.</p><p>This field is required when CheckType is HTTP.</p>
     */
    public String [] getStatusMask() {
        return this.StatusMask;
    }

    /**
     * Set <p>Status check code.</p><p>Input parameter limits: support selecting 'http_2xx', 'http_3xx', 'http_4xx', 'http_5xx'.</p><p>This field is required when CheckType is HTTP.</p>
     * @param StatusMask <p>Status check code.</p><p>Input parameter limits: support selecting 'http_2xx', 'http_3xx', 'http_4xx', 'http_5xx'.</p><p>This field is required when CheckType is HTTP.</p>
     */
    public void setStatusMask(String [] StatusMask) {
        this.StatusMask = StatusMask;
    }

    /**
     * Get <p>Origin-pull protocol.</p><p>Input parameter limits. Supported values: 'HTTP', 'HTTPS'.</p><p>When the CLB listener protocol is HTTP, only HTTP can be configured. When it is HTTPS, HTTP or HTTPS can be configured.</p> 
     * @return ForwardProtocol <p>Origin-pull protocol.</p><p>Input parameter limits. Supported values: 'HTTP', 'HTTPS'.</p><p>When the CLB listener protocol is HTTP, only HTTP can be configured. When it is HTTPS, HTTP or HTTPS can be configured.</p>
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set <p>Origin-pull protocol.</p><p>Input parameter limits. Supported values: 'HTTP', 'HTTPS'.</p><p>When the CLB listener protocol is HTTP, only HTTP can be configured. When it is HTTPS, HTTP or HTTPS can be configured.</p>
     * @param ForwardProtocol <p>Origin-pull protocol.</p><p>Input parameter limits. Supported values: 'HTTP', 'HTTPS'.</p><p>When the CLB listener protocol is HTTP, only HTTP can be configured. When it is HTTPS, HTTP or HTTPS can be configured.</p>
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get <p>Port mapping.</p><p>When the CLB listener protocol is HTTP or HTTPS, one pair can be configured. When the CLB listener protocol is UDP or TCP, up to 30 pairs can be configured.</p> 
     * @return PortOverrides <p>Port mapping.</p><p>When the CLB listener protocol is HTTP or HTTPS, one pair can be configured. When the CLB listener protocol is UDP or TCP, up to 30 pairs can be configured.</p>
     */
    public PortOverride [] getPortOverrides() {
        return this.PortOverrides;
    }

    /**
     * Set <p>Port mapping.</p><p>When the CLB listener protocol is HTTP or HTTPS, one pair can be configured. When the CLB listener protocol is UDP or TCP, up to 30 pairs can be configured.</p>
     * @param PortOverrides <p>Port mapping.</p><p>When the CLB listener protocol is HTTP or HTTPS, one pair can be configured. When the CLB listener protocol is UDP or TCP, up to 30 pairs can be configured.</p>
     */
    public void setPortOverrides(PortOverride [] PortOverrides) {
        this.PortOverrides = PortOverrides;
    }

    /**
     * Get <p>HPPTS encryption algorithm kit</p><p>Input parameter limit: support selecting 'tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3'.</p><p>This parameter can be modified only when the CLB listener protocol is HTTPS.</p> 
     * @return CipherPolicyId <p>HPPTS encryption algorithm kit</p><p>Input parameter limit: support selecting 'tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3'.</p><p>This parameter can be modified only when the CLB listener protocol is HTTPS.</p>
     */
    public String getCipherPolicyId() {
        return this.CipherPolicyId;
    }

    /**
     * Set <p>HPPTS encryption algorithm kit</p><p>Input parameter limit: support selecting 'tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3'.</p><p>This parameter can be modified only when the CLB listener protocol is HTTPS.</p>
     * @param CipherPolicyId <p>HPPTS encryption algorithm kit</p><p>Input parameter limit: support selecting 'tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3'.</p><p>This parameter can be modified only when the CLB listener protocol is HTTPS.</p>
     */
    public void setCipherPolicyId(String CipherPolicyId) {
        this.CipherPolicyId = CipherPolicyId;
    }

    /**
     * Get <p>Only the HTTPS back-to-source protocol supports selecting ['HTTP/1.1', 'HTTP/2']</p><p>Enumeration values:</p><ul><li>HTTP/1.1: version HTTP/1.1</li><li>HTTP/2: version HTTP/2</li></ul> 
     * @return HttpVersion <p>Only the HTTPS back-to-source protocol supports selecting ['HTTP/1.1', 'HTTP/2']</p><p>Enumeration values:</p><ul><li>HTTP/1.1: version HTTP/1.1</li><li>HTTP/2: version HTTP/2</li></ul>
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set <p>Only the HTTPS back-to-source protocol supports selecting ['HTTP/1.1', 'HTTP/2']</p><p>Enumeration values:</p><ul><li>HTTP/1.1: version HTTP/1.1</li><li>HTTP/2: version HTTP/2</li></ul>
     * @param HttpVersion <p>Only the HTTPS back-to-source protocol supports selecting ['HTTP/1.1', 'HTTP/2']</p><p>Enumeration values:</p><ul><li>HTTP/1.1: version HTTP/1.1</li><li>HTTP/2: version HTTP/2</li></ul>
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    public ModifyEndpointGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEndpointGroupRequest(ModifyEndpointGroupRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.EndpointGroupId != null) {
            this.EndpointGroupId = new String(source.EndpointGroupId);
        }
        if (source.EndpointConfigurations != null) {
            this.EndpointConfigurations = new EndpointConfigurations[source.EndpointConfigurations.length];
            for (int i = 0; i < source.EndpointConfigurations.length; i++) {
                this.EndpointConfigurations[i] = new EndpointConfigurations(source.EndpointConfigurations[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EnableHealthCheck != null) {
            this.EnableHealthCheck = new Boolean(source.EnableHealthCheck);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.HealthCheckInterval != null) {
            this.HealthCheckInterval = new Long(source.HealthCheckInterval);
        }
        if (source.UnhealthyThreshold != null) {
            this.UnhealthyThreshold = new Long(source.UnhealthyThreshold);
        }
        if (source.HealthyThreshold != null) {
            this.HealthyThreshold = new Long(source.HealthyThreshold);
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.CheckPort != null) {
            this.CheckPort = new Long(source.CheckPort);
        }
        if (source.ContextType != null) {
            this.ContextType = new String(source.ContextType);
        }
        if (source.CheckSendContext != null) {
            this.CheckSendContext = new String(source.CheckSendContext);
        }
        if (source.CheckRecvContext != null) {
            this.CheckRecvContext = new String(source.CheckRecvContext);
        }
        if (source.CheckDomain != null) {
            this.CheckDomain = new String(source.CheckDomain);
        }
        if (source.CheckPath != null) {
            this.CheckPath = new String(source.CheckPath);
        }
        if (source.CheckMethod != null) {
            this.CheckMethod = new String(source.CheckMethod);
        }
        if (source.StatusMask != null) {
            this.StatusMask = new String[source.StatusMask.length];
            for (int i = 0; i < source.StatusMask.length; i++) {
                this.StatusMask[i] = new String(source.StatusMask[i]);
            }
        }
        if (source.ForwardProtocol != null) {
            this.ForwardProtocol = new String(source.ForwardProtocol);
        }
        if (source.PortOverrides != null) {
            this.PortOverrides = new PortOverride[source.PortOverrides.length];
            for (int i = 0; i < source.PortOverrides.length; i++) {
                this.PortOverrides[i] = new PortOverride(source.PortOverrides[i]);
            }
        }
        if (source.CipherPolicyId != null) {
            this.CipherPolicyId = new String(source.CipherPolicyId);
        }
        if (source.HttpVersion != null) {
            this.HttpVersion = new String(source.HttpVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "EndpointGroupId", this.EndpointGroupId);
        this.setParamArrayObj(map, prefix + "EndpointConfigurations.", this.EndpointConfigurations);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "HealthCheckInterval", this.HealthCheckInterval);
        this.setParamSimple(map, prefix + "UnhealthyThreshold", this.UnhealthyThreshold);
        this.setParamSimple(map, prefix + "HealthyThreshold", this.HealthyThreshold);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "CheckPort", this.CheckPort);
        this.setParamSimple(map, prefix + "ContextType", this.ContextType);
        this.setParamSimple(map, prefix + "CheckSendContext", this.CheckSendContext);
        this.setParamSimple(map, prefix + "CheckRecvContext", this.CheckRecvContext);
        this.setParamSimple(map, prefix + "CheckDomain", this.CheckDomain);
        this.setParamSimple(map, prefix + "CheckPath", this.CheckPath);
        this.setParamSimple(map, prefix + "CheckMethod", this.CheckMethod);
        this.setParamArraySimple(map, prefix + "StatusMask.", this.StatusMask);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamArrayObj(map, prefix + "PortOverrides.", this.PortOverrides);
        this.setParamSimple(map, prefix + "CipherPolicyId", this.CipherPolicyId);
        this.setParamSimple(map, prefix + "HttpVersion", this.HttpVersion);

    }
}

