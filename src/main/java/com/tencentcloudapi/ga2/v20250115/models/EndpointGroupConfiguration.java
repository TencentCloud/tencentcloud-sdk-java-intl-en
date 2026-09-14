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

public class EndpointGroupConfiguration extends AbstractModel {

    /**
    * <p>Terminal node group name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Region of the terminal node group.</p>
    */
    @SerializedName("EndpointGroupRegion")
    @Expose
    private String EndpointGroupRegion;

    /**
    * <p>Terminal node configuration.</p>
    */
    @SerializedName("EndpointConfigurations")
    @Expose
    private EndpointConfigurations [] EndpointConfigurations;

    /**
    * <p>Check protocol. Supports configuration of 'TCP', 'HTTP', 'PING', and 'CUSTOM'.</p><p>Enumeration values:</p><ul><li>TCP: When the CLB listener protocol where the terminal node group resides is TCP, choose TCP as the check protocol.</li><li>HTTP: When the CLB listener protocol where the terminal node group resides is HTTP or HTTPS, choose HTTP as the check protocol.</li><li>PING: When the CLB listener protocol where the terminal node group resides is UDP, choose PING as the check protocol.</li><li>CUSTOM: When the CLB listener protocol where the terminal node group resides is UDP or TCP, choose CUSTOM as the check protocol.</li></ul><p>This field is required when health check is enabled.</p>
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * <p>Description.</p><p>Default value: empty by default, representing no configuration description.</p><p>Maximum length: 100 bytes.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Check port.</p><p>Input limit: range 1-65535.</p><p>This field is required when CheckType is CUSTOM.</p>
    */
    @SerializedName("CheckPort")
    @Expose
    private String CheckPort;

    /**
    * <p>Check content. Supports configuration 'TEXT'.</p><p>Enumeration values:</p><ul><li>TEXT: Text content.</li></ul><p>This field is required when CheckType is CUSTOM.</p>
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * <p>Check request.</p><p>Input parameter limit: The byte length must be within 1-500.</p><p>This field is required when CheckType is CUSTOM.</p>
    */
    @SerializedName("CheckSendContext")
    @Expose
    private String CheckSendContext;

    /**
    * <p>Check returned results.</p><p>Input parameter limit: The byte length must be within 1-500.</p><p>When CheckType is CUSTOM, this field is required.</p>
    */
    @SerializedName("CheckRecvContext")
    @Expose
    private String CheckRecvContext;

    /**
    * <p>Whether to enable health check.</p><p>Default value: False</p>
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * <p>Response timeout.</p><p>Value range: [1, 100]</p><p>Default value: 2</p><p>This field is required when health check is enabled.</p>
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * <p>Health check interval.</p><p>Value range: [5, 300].</p><p>Default value: 30.</p><p>This field is required when health check is enabled.</p>
    */
    @SerializedName("HealthCheckInterval")
    @Expose
    private Long HealthCheckInterval;

    /**
    * <p>Unhealthy threshold.</p><p>Value range: [1, 10]</p><p>Default value: 3</p><p>This field is required when health check is enabled.</p>
    */
    @SerializedName("UnhealthyThreshold")
    @Expose
    private Long UnhealthyThreshold;

    /**
    * <p>Health threshold.</p><p>Value range: [1, 10]</p><p>Default value: 3</p><p>This field is required when health check is enabled.</p>
    */
    @SerializedName("HealthyThreshold")
    @Expose
    private Long HealthyThreshold;

    /**
    * <p>Origin-pull protocol. HTTP and HTTPS can be configured.</p><p>Enumeration values:</p><ul><li>HTTP: HTTP origin-pull. HTTP can be configured when the listener protocol where the terminal node group resides is HTTP or HTTPS.</li><li>HTTPS: HTTPS origin-pull. HTTPS can be configured when the listener protocol where the terminal node group resides is HTTPS.</li></ul><p>This field is required when the listener protocol where the terminal node group resides is HTTP or HTTPS.</p>
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * <p>Check domain name.</p><p>Input parameter limit: The byte length range is 3-80.</p><p>This field is required when CheckType is HTTP.</p>
    */
    @SerializedName("CheckDomain")
    @Expose
    private String CheckDomain;

    /**
    * <p>Check the URL.</p><p>Parameter format: must match the regular expression: ^[a-zA-Z0-9_.\-\/]{1,80}$</p><p>This field is required when CheckType is HTTP.</p>
    */
    @SerializedName("CheckPath")
    @Expose
    private String CheckPath;

    /**
    * <p>Request method. Supports configuration of 'GET' and 'HEAD'.</p><p>Enumeration values:</p><ul><li>GET: The request method is GET.</li><li>HEAD: The request method is HEAD.</li></ul><p>When CheckType is HTTP, this field is required.</p>
    */
    @SerializedName("CheckMethod")
    @Expose
    private String CheckMethod;

    /**
    * <p>Status check code. Supports configuring 'http_2xx', 'http_3xx', 'http_4xx', 'http_5xx'.</p><p>Enumeration values:</p><ul><li>http_2xx: HTTP codes beginning with 2.</li><li>http_3xx: HTTP codes beginning with 3.</li><li>http_4xx: HTTP codes beginning with 4.</li><li>http_5xx: HTTP codes beginning with 5.</li></ul><p>This field is required when CheckType is HTTP.</p>
    */
    @SerializedName("StatusMask")
    @Expose
    private String [] StatusMask;

    /**
    * <p>Port mapping.</p><p>Input limits: Layer 7 supports 1 port mapping, and Layer 4 supports up to 30 port mappings.</p>
    */
    @SerializedName("PortOverrides")
    @Expose
    private PortOverride [] PortOverrides;

    /**
    * <p>Operator type. Supports configuration 'CMCC', 'CTCC', 'CUCC'.</p><p>Enumeration values:</p><ul><li>CMCC: China Mobile</li><li>CUCC: China Unicom</li><li>CTCC: China Telecom</li></ul><p>This field is required when the terminal node group region is a triple-network region.</p>
    */
    @SerializedName("IspType")
    @Expose
    private String IspType;

    /**
    * <p>HPPTS encryption algorithm suite; supports configuration 'tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3';</p><p>Enumeration values:</p><ul><li>tls_policy_1.0-2: encryption algorithm suite.</li><li>tls_policy_1.1-2: encryption algorithm suite.</li><li>tls_policy_1.2: encryption algorithm suite.</li><li>tls_policy_1.2_strict: encryption algorithm suite.</li><li>tls_policy_1.2_strict-1.3: encryption algorithm suite.</li></ul><p>This field is required when the origin-pull protocol is HTTPS.</p>
    */
    @SerializedName("CipherPolicyId")
    @Expose
    private String CipherPolicyId;

    /**
    * <p>Origin-pull protocol. Supports configuration of 'HTTP/1.1' and 'HTTP/2'.</p><p>Enumeration values:</p><ul><li>HTTP/1.1: version HTTP/1.1</li><li>HTTP/2: version HTTP/2</li></ul><p>This field is required when the origin-pull protocol is HTTPS.</p>
    */
    @SerializedName("HttpVersion")
    @Expose
    private String HttpVersion;

    /**
     * Get <p>Terminal node group name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p> 
     * @return Name <p>Terminal node group name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Terminal node group name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
     * @param Name <p>Terminal node group name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Region of the terminal node group.</p> 
     * @return EndpointGroupRegion <p>Region of the terminal node group.</p>
     */
    public String getEndpointGroupRegion() {
        return this.EndpointGroupRegion;
    }

    /**
     * Set <p>Region of the terminal node group.</p>
     * @param EndpointGroupRegion <p>Region of the terminal node group.</p>
     */
    public void setEndpointGroupRegion(String EndpointGroupRegion) {
        this.EndpointGroupRegion = EndpointGroupRegion;
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
     * Get <p>Check protocol. Supports configuration of 'TCP', 'HTTP', 'PING', and 'CUSTOM'.</p><p>Enumeration values:</p><ul><li>TCP: When the CLB listener protocol where the terminal node group resides is TCP, choose TCP as the check protocol.</li><li>HTTP: When the CLB listener protocol where the terminal node group resides is HTTP or HTTPS, choose HTTP as the check protocol.</li><li>PING: When the CLB listener protocol where the terminal node group resides is UDP, choose PING as the check protocol.</li><li>CUSTOM: When the CLB listener protocol where the terminal node group resides is UDP or TCP, choose CUSTOM as the check protocol.</li></ul><p>This field is required when health check is enabled.</p> 
     * @return CheckType <p>Check protocol. Supports configuration of 'TCP', 'HTTP', 'PING', and 'CUSTOM'.</p><p>Enumeration values:</p><ul><li>TCP: When the CLB listener protocol where the terminal node group resides is TCP, choose TCP as the check protocol.</li><li>HTTP: When the CLB listener protocol where the terminal node group resides is HTTP or HTTPS, choose HTTP as the check protocol.</li><li>PING: When the CLB listener protocol where the terminal node group resides is UDP, choose PING as the check protocol.</li><li>CUSTOM: When the CLB listener protocol where the terminal node group resides is UDP or TCP, choose CUSTOM as the check protocol.</li></ul><p>This field is required when health check is enabled.</p>
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set <p>Check protocol. Supports configuration of 'TCP', 'HTTP', 'PING', and 'CUSTOM'.</p><p>Enumeration values:</p><ul><li>TCP: When the CLB listener protocol where the terminal node group resides is TCP, choose TCP as the check protocol.</li><li>HTTP: When the CLB listener protocol where the terminal node group resides is HTTP or HTTPS, choose HTTP as the check protocol.</li><li>PING: When the CLB listener protocol where the terminal node group resides is UDP, choose PING as the check protocol.</li><li>CUSTOM: When the CLB listener protocol where the terminal node group resides is UDP or TCP, choose CUSTOM as the check protocol.</li></ul><p>This field is required when health check is enabled.</p>
     * @param CheckType <p>Check protocol. Supports configuration of 'TCP', 'HTTP', 'PING', and 'CUSTOM'.</p><p>Enumeration values:</p><ul><li>TCP: When the CLB listener protocol where the terminal node group resides is TCP, choose TCP as the check protocol.</li><li>HTTP: When the CLB listener protocol where the terminal node group resides is HTTP or HTTPS, choose HTTP as the check protocol.</li><li>PING: When the CLB listener protocol where the terminal node group resides is UDP, choose PING as the check protocol.</li><li>CUSTOM: When the CLB listener protocol where the terminal node group resides is UDP or TCP, choose CUSTOM as the check protocol.</li></ul><p>This field is required when health check is enabled.</p>
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get <p>Description.</p><p>Default value: empty by default, representing no configuration description.</p><p>Maximum length: 100 bytes.</p> 
     * @return Description <p>Description.</p><p>Default value: empty by default, representing no configuration description.</p><p>Maximum length: 100 bytes.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p><p>Default value: empty by default, representing no configuration description.</p><p>Maximum length: 100 bytes.</p>
     * @param Description <p>Description.</p><p>Default value: empty by default, representing no configuration description.</p><p>Maximum length: 100 bytes.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Check port.</p><p>Input limit: range 1-65535.</p><p>This field is required when CheckType is CUSTOM.</p> 
     * @return CheckPort <p>Check port.</p><p>Input limit: range 1-65535.</p><p>This field is required when CheckType is CUSTOM.</p>
     */
    public String getCheckPort() {
        return this.CheckPort;
    }

    /**
     * Set <p>Check port.</p><p>Input limit: range 1-65535.</p><p>This field is required when CheckType is CUSTOM.</p>
     * @param CheckPort <p>Check port.</p><p>Input limit: range 1-65535.</p><p>This field is required when CheckType is CUSTOM.</p>
     */
    public void setCheckPort(String CheckPort) {
        this.CheckPort = CheckPort;
    }

    /**
     * Get <p>Check content. Supports configuration 'TEXT'.</p><p>Enumeration values:</p><ul><li>TEXT: Text content.</li></ul><p>This field is required when CheckType is CUSTOM.</p> 
     * @return ContextType <p>Check content. Supports configuration 'TEXT'.</p><p>Enumeration values:</p><ul><li>TEXT: Text content.</li></ul><p>This field is required when CheckType is CUSTOM.</p>
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set <p>Check content. Supports configuration 'TEXT'.</p><p>Enumeration values:</p><ul><li>TEXT: Text content.</li></ul><p>This field is required when CheckType is CUSTOM.</p>
     * @param ContextType <p>Check content. Supports configuration 'TEXT'.</p><p>Enumeration values:</p><ul><li>TEXT: Text content.</li></ul><p>This field is required when CheckType is CUSTOM.</p>
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get <p>Check request.</p><p>Input parameter limit: The byte length must be within 1-500.</p><p>This field is required when CheckType is CUSTOM.</p> 
     * @return CheckSendContext <p>Check request.</p><p>Input parameter limit: The byte length must be within 1-500.</p><p>This field is required when CheckType is CUSTOM.</p>
     */
    public String getCheckSendContext() {
        return this.CheckSendContext;
    }

    /**
     * Set <p>Check request.</p><p>Input parameter limit: The byte length must be within 1-500.</p><p>This field is required when CheckType is CUSTOM.</p>
     * @param CheckSendContext <p>Check request.</p><p>Input parameter limit: The byte length must be within 1-500.</p><p>This field is required when CheckType is CUSTOM.</p>
     */
    public void setCheckSendContext(String CheckSendContext) {
        this.CheckSendContext = CheckSendContext;
    }

    /**
     * Get <p>Check returned results.</p><p>Input parameter limit: The byte length must be within 1-500.</p><p>When CheckType is CUSTOM, this field is required.</p> 
     * @return CheckRecvContext <p>Check returned results.</p><p>Input parameter limit: The byte length must be within 1-500.</p><p>When CheckType is CUSTOM, this field is required.</p>
     */
    public String getCheckRecvContext() {
        return this.CheckRecvContext;
    }

    /**
     * Set <p>Check returned results.</p><p>Input parameter limit: The byte length must be within 1-500.</p><p>When CheckType is CUSTOM, this field is required.</p>
     * @param CheckRecvContext <p>Check returned results.</p><p>Input parameter limit: The byte length must be within 1-500.</p><p>When CheckType is CUSTOM, this field is required.</p>
     */
    public void setCheckRecvContext(String CheckRecvContext) {
        this.CheckRecvContext = CheckRecvContext;
    }

    /**
     * Get <p>Whether to enable health check.</p><p>Default value: False</p> 
     * @return EnableHealthCheck <p>Whether to enable health check.</p><p>Default value: False</p>
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set <p>Whether to enable health check.</p><p>Default value: False</p>
     * @param EnableHealthCheck <p>Whether to enable health check.</p><p>Default value: False</p>
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get <p>Response timeout.</p><p>Value range: [1, 100]</p><p>Default value: 2</p><p>This field is required when health check is enabled.</p> 
     * @return ConnectTimeout <p>Response timeout.</p><p>Value range: [1, 100]</p><p>Default value: 2</p><p>This field is required when health check is enabled.</p>
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set <p>Response timeout.</p><p>Value range: [1, 100]</p><p>Default value: 2</p><p>This field is required when health check is enabled.</p>
     * @param ConnectTimeout <p>Response timeout.</p><p>Value range: [1, 100]</p><p>Default value: 2</p><p>This field is required when health check is enabled.</p>
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get <p>Health check interval.</p><p>Value range: [5, 300].</p><p>Default value: 30.</p><p>This field is required when health check is enabled.</p> 
     * @return HealthCheckInterval <p>Health check interval.</p><p>Value range: [5, 300].</p><p>Default value: 30.</p><p>This field is required when health check is enabled.</p>
     */
    public Long getHealthCheckInterval() {
        return this.HealthCheckInterval;
    }

    /**
     * Set <p>Health check interval.</p><p>Value range: [5, 300].</p><p>Default value: 30.</p><p>This field is required when health check is enabled.</p>
     * @param HealthCheckInterval <p>Health check interval.</p><p>Value range: [5, 300].</p><p>Default value: 30.</p><p>This field is required when health check is enabled.</p>
     */
    public void setHealthCheckInterval(Long HealthCheckInterval) {
        this.HealthCheckInterval = HealthCheckInterval;
    }

    /**
     * Get <p>Unhealthy threshold.</p><p>Value range: [1, 10]</p><p>Default value: 3</p><p>This field is required when health check is enabled.</p> 
     * @return UnhealthyThreshold <p>Unhealthy threshold.</p><p>Value range: [1, 10]</p><p>Default value: 3</p><p>This field is required when health check is enabled.</p>
     */
    public Long getUnhealthyThreshold() {
        return this.UnhealthyThreshold;
    }

    /**
     * Set <p>Unhealthy threshold.</p><p>Value range: [1, 10]</p><p>Default value: 3</p><p>This field is required when health check is enabled.</p>
     * @param UnhealthyThreshold <p>Unhealthy threshold.</p><p>Value range: [1, 10]</p><p>Default value: 3</p><p>This field is required when health check is enabled.</p>
     */
    public void setUnhealthyThreshold(Long UnhealthyThreshold) {
        this.UnhealthyThreshold = UnhealthyThreshold;
    }

    /**
     * Get <p>Health threshold.</p><p>Value range: [1, 10]</p><p>Default value: 3</p><p>This field is required when health check is enabled.</p> 
     * @return HealthyThreshold <p>Health threshold.</p><p>Value range: [1, 10]</p><p>Default value: 3</p><p>This field is required when health check is enabled.</p>
     */
    public Long getHealthyThreshold() {
        return this.HealthyThreshold;
    }

    /**
     * Set <p>Health threshold.</p><p>Value range: [1, 10]</p><p>Default value: 3</p><p>This field is required when health check is enabled.</p>
     * @param HealthyThreshold <p>Health threshold.</p><p>Value range: [1, 10]</p><p>Default value: 3</p><p>This field is required when health check is enabled.</p>
     */
    public void setHealthyThreshold(Long HealthyThreshold) {
        this.HealthyThreshold = HealthyThreshold;
    }

    /**
     * Get <p>Origin-pull protocol. HTTP and HTTPS can be configured.</p><p>Enumeration values:</p><ul><li>HTTP: HTTP origin-pull. HTTP can be configured when the listener protocol where the terminal node group resides is HTTP or HTTPS.</li><li>HTTPS: HTTPS origin-pull. HTTPS can be configured when the listener protocol where the terminal node group resides is HTTPS.</li></ul><p>This field is required when the listener protocol where the terminal node group resides is HTTP or HTTPS.</p> 
     * @return ForwardProtocol <p>Origin-pull protocol. HTTP and HTTPS can be configured.</p><p>Enumeration values:</p><ul><li>HTTP: HTTP origin-pull. HTTP can be configured when the listener protocol where the terminal node group resides is HTTP or HTTPS.</li><li>HTTPS: HTTPS origin-pull. HTTPS can be configured when the listener protocol where the terminal node group resides is HTTPS.</li></ul><p>This field is required when the listener protocol where the terminal node group resides is HTTP or HTTPS.</p>
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set <p>Origin-pull protocol. HTTP and HTTPS can be configured.</p><p>Enumeration values:</p><ul><li>HTTP: HTTP origin-pull. HTTP can be configured when the listener protocol where the terminal node group resides is HTTP or HTTPS.</li><li>HTTPS: HTTPS origin-pull. HTTPS can be configured when the listener protocol where the terminal node group resides is HTTPS.</li></ul><p>This field is required when the listener protocol where the terminal node group resides is HTTP or HTTPS.</p>
     * @param ForwardProtocol <p>Origin-pull protocol. HTTP and HTTPS can be configured.</p><p>Enumeration values:</p><ul><li>HTTP: HTTP origin-pull. HTTP can be configured when the listener protocol where the terminal node group resides is HTTP or HTTPS.</li><li>HTTPS: HTTPS origin-pull. HTTPS can be configured when the listener protocol where the terminal node group resides is HTTPS.</li></ul><p>This field is required when the listener protocol where the terminal node group resides is HTTP or HTTPS.</p>
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get <p>Check domain name.</p><p>Input parameter limit: The byte length range is 3-80.</p><p>This field is required when CheckType is HTTP.</p> 
     * @return CheckDomain <p>Check domain name.</p><p>Input parameter limit: The byte length range is 3-80.</p><p>This field is required when CheckType is HTTP.</p>
     */
    public String getCheckDomain() {
        return this.CheckDomain;
    }

    /**
     * Set <p>Check domain name.</p><p>Input parameter limit: The byte length range is 3-80.</p><p>This field is required when CheckType is HTTP.</p>
     * @param CheckDomain <p>Check domain name.</p><p>Input parameter limit: The byte length range is 3-80.</p><p>This field is required when CheckType is HTTP.</p>
     */
    public void setCheckDomain(String CheckDomain) {
        this.CheckDomain = CheckDomain;
    }

    /**
     * Get <p>Check the URL.</p><p>Parameter format: must match the regular expression: ^[a-zA-Z0-9_.\-\/]{1,80}$</p><p>This field is required when CheckType is HTTP.</p> 
     * @return CheckPath <p>Check the URL.</p><p>Parameter format: must match the regular expression: ^[a-zA-Z0-9_.\-\/]{1,80}$</p><p>This field is required when CheckType is HTTP.</p>
     */
    public String getCheckPath() {
        return this.CheckPath;
    }

    /**
     * Set <p>Check the URL.</p><p>Parameter format: must match the regular expression: ^[a-zA-Z0-9_.\-\/]{1,80}$</p><p>This field is required when CheckType is HTTP.</p>
     * @param CheckPath <p>Check the URL.</p><p>Parameter format: must match the regular expression: ^[a-zA-Z0-9_.\-\/]{1,80}$</p><p>This field is required when CheckType is HTTP.</p>
     */
    public void setCheckPath(String CheckPath) {
        this.CheckPath = CheckPath;
    }

    /**
     * Get <p>Request method. Supports configuration of 'GET' and 'HEAD'.</p><p>Enumeration values:</p><ul><li>GET: The request method is GET.</li><li>HEAD: The request method is HEAD.</li></ul><p>When CheckType is HTTP, this field is required.</p> 
     * @return CheckMethod <p>Request method. Supports configuration of 'GET' and 'HEAD'.</p><p>Enumeration values:</p><ul><li>GET: The request method is GET.</li><li>HEAD: The request method is HEAD.</li></ul><p>When CheckType is HTTP, this field is required.</p>
     */
    public String getCheckMethod() {
        return this.CheckMethod;
    }

    /**
     * Set <p>Request method. Supports configuration of 'GET' and 'HEAD'.</p><p>Enumeration values:</p><ul><li>GET: The request method is GET.</li><li>HEAD: The request method is HEAD.</li></ul><p>When CheckType is HTTP, this field is required.</p>
     * @param CheckMethod <p>Request method. Supports configuration of 'GET' and 'HEAD'.</p><p>Enumeration values:</p><ul><li>GET: The request method is GET.</li><li>HEAD: The request method is HEAD.</li></ul><p>When CheckType is HTTP, this field is required.</p>
     */
    public void setCheckMethod(String CheckMethod) {
        this.CheckMethod = CheckMethod;
    }

    /**
     * Get <p>Status check code. Supports configuring 'http_2xx', 'http_3xx', 'http_4xx', 'http_5xx'.</p><p>Enumeration values:</p><ul><li>http_2xx: HTTP codes beginning with 2.</li><li>http_3xx: HTTP codes beginning with 3.</li><li>http_4xx: HTTP codes beginning with 4.</li><li>http_5xx: HTTP codes beginning with 5.</li></ul><p>This field is required when CheckType is HTTP.</p> 
     * @return StatusMask <p>Status check code. Supports configuring 'http_2xx', 'http_3xx', 'http_4xx', 'http_5xx'.</p><p>Enumeration values:</p><ul><li>http_2xx: HTTP codes beginning with 2.</li><li>http_3xx: HTTP codes beginning with 3.</li><li>http_4xx: HTTP codes beginning with 4.</li><li>http_5xx: HTTP codes beginning with 5.</li></ul><p>This field is required when CheckType is HTTP.</p>
     */
    public String [] getStatusMask() {
        return this.StatusMask;
    }

    /**
     * Set <p>Status check code. Supports configuring 'http_2xx', 'http_3xx', 'http_4xx', 'http_5xx'.</p><p>Enumeration values:</p><ul><li>http_2xx: HTTP codes beginning with 2.</li><li>http_3xx: HTTP codes beginning with 3.</li><li>http_4xx: HTTP codes beginning with 4.</li><li>http_5xx: HTTP codes beginning with 5.</li></ul><p>This field is required when CheckType is HTTP.</p>
     * @param StatusMask <p>Status check code. Supports configuring 'http_2xx', 'http_3xx', 'http_4xx', 'http_5xx'.</p><p>Enumeration values:</p><ul><li>http_2xx: HTTP codes beginning with 2.</li><li>http_3xx: HTTP codes beginning with 3.</li><li>http_4xx: HTTP codes beginning with 4.</li><li>http_5xx: HTTP codes beginning with 5.</li></ul><p>This field is required when CheckType is HTTP.</p>
     */
    public void setStatusMask(String [] StatusMask) {
        this.StatusMask = StatusMask;
    }

    /**
     * Get <p>Port mapping.</p><p>Input limits: Layer 7 supports 1 port mapping, and Layer 4 supports up to 30 port mappings.</p> 
     * @return PortOverrides <p>Port mapping.</p><p>Input limits: Layer 7 supports 1 port mapping, and Layer 4 supports up to 30 port mappings.</p>
     */
    public PortOverride [] getPortOverrides() {
        return this.PortOverrides;
    }

    /**
     * Set <p>Port mapping.</p><p>Input limits: Layer 7 supports 1 port mapping, and Layer 4 supports up to 30 port mappings.</p>
     * @param PortOverrides <p>Port mapping.</p><p>Input limits: Layer 7 supports 1 port mapping, and Layer 4 supports up to 30 port mappings.</p>
     */
    public void setPortOverrides(PortOverride [] PortOverrides) {
        this.PortOverrides = PortOverrides;
    }

    /**
     * Get <p>Operator type. Supports configuration 'CMCC', 'CTCC', 'CUCC'.</p><p>Enumeration values:</p><ul><li>CMCC: China Mobile</li><li>CUCC: China Unicom</li><li>CTCC: China Telecom</li></ul><p>This field is required when the terminal node group region is a triple-network region.</p> 
     * @return IspType <p>Operator type. Supports configuration 'CMCC', 'CTCC', 'CUCC'.</p><p>Enumeration values:</p><ul><li>CMCC: China Mobile</li><li>CUCC: China Unicom</li><li>CTCC: China Telecom</li></ul><p>This field is required when the terminal node group region is a triple-network region.</p>
     */
    public String getIspType() {
        return this.IspType;
    }

    /**
     * Set <p>Operator type. Supports configuration 'CMCC', 'CTCC', 'CUCC'.</p><p>Enumeration values:</p><ul><li>CMCC: China Mobile</li><li>CUCC: China Unicom</li><li>CTCC: China Telecom</li></ul><p>This field is required when the terminal node group region is a triple-network region.</p>
     * @param IspType <p>Operator type. Supports configuration 'CMCC', 'CTCC', 'CUCC'.</p><p>Enumeration values:</p><ul><li>CMCC: China Mobile</li><li>CUCC: China Unicom</li><li>CTCC: China Telecom</li></ul><p>This field is required when the terminal node group region is a triple-network region.</p>
     */
    public void setIspType(String IspType) {
        this.IspType = IspType;
    }

    /**
     * Get <p>HPPTS encryption algorithm suite; supports configuration 'tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3';</p><p>Enumeration values:</p><ul><li>tls_policy_1.0-2: encryption algorithm suite.</li><li>tls_policy_1.1-2: encryption algorithm suite.</li><li>tls_policy_1.2: encryption algorithm suite.</li><li>tls_policy_1.2_strict: encryption algorithm suite.</li><li>tls_policy_1.2_strict-1.3: encryption algorithm suite.</li></ul><p>This field is required when the origin-pull protocol is HTTPS.</p> 
     * @return CipherPolicyId <p>HPPTS encryption algorithm suite; supports configuration 'tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3';</p><p>Enumeration values:</p><ul><li>tls_policy_1.0-2: encryption algorithm suite.</li><li>tls_policy_1.1-2: encryption algorithm suite.</li><li>tls_policy_1.2: encryption algorithm suite.</li><li>tls_policy_1.2_strict: encryption algorithm suite.</li><li>tls_policy_1.2_strict-1.3: encryption algorithm suite.</li></ul><p>This field is required when the origin-pull protocol is HTTPS.</p>
     */
    public String getCipherPolicyId() {
        return this.CipherPolicyId;
    }

    /**
     * Set <p>HPPTS encryption algorithm suite; supports configuration 'tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3';</p><p>Enumeration values:</p><ul><li>tls_policy_1.0-2: encryption algorithm suite.</li><li>tls_policy_1.1-2: encryption algorithm suite.</li><li>tls_policy_1.2: encryption algorithm suite.</li><li>tls_policy_1.2_strict: encryption algorithm suite.</li><li>tls_policy_1.2_strict-1.3: encryption algorithm suite.</li></ul><p>This field is required when the origin-pull protocol is HTTPS.</p>
     * @param CipherPolicyId <p>HPPTS encryption algorithm suite; supports configuration 'tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3';</p><p>Enumeration values:</p><ul><li>tls_policy_1.0-2: encryption algorithm suite.</li><li>tls_policy_1.1-2: encryption algorithm suite.</li><li>tls_policy_1.2: encryption algorithm suite.</li><li>tls_policy_1.2_strict: encryption algorithm suite.</li><li>tls_policy_1.2_strict-1.3: encryption algorithm suite.</li></ul><p>This field is required when the origin-pull protocol is HTTPS.</p>
     */
    public void setCipherPolicyId(String CipherPolicyId) {
        this.CipherPolicyId = CipherPolicyId;
    }

    /**
     * Get <p>Origin-pull protocol. Supports configuration of 'HTTP/1.1' and 'HTTP/2'.</p><p>Enumeration values:</p><ul><li>HTTP/1.1: version HTTP/1.1</li><li>HTTP/2: version HTTP/2</li></ul><p>This field is required when the origin-pull protocol is HTTPS.</p> 
     * @return HttpVersion <p>Origin-pull protocol. Supports configuration of 'HTTP/1.1' and 'HTTP/2'.</p><p>Enumeration values:</p><ul><li>HTTP/1.1: version HTTP/1.1</li><li>HTTP/2: version HTTP/2</li></ul><p>This field is required when the origin-pull protocol is HTTPS.</p>
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set <p>Origin-pull protocol. Supports configuration of 'HTTP/1.1' and 'HTTP/2'.</p><p>Enumeration values:</p><ul><li>HTTP/1.1: version HTTP/1.1</li><li>HTTP/2: version HTTP/2</li></ul><p>This field is required when the origin-pull protocol is HTTPS.</p>
     * @param HttpVersion <p>Origin-pull protocol. Supports configuration of 'HTTP/1.1' and 'HTTP/2'.</p><p>Enumeration values:</p><ul><li>HTTP/1.1: version HTTP/1.1</li><li>HTTP/2: version HTTP/2</li></ul><p>This field is required when the origin-pull protocol is HTTPS.</p>
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    public EndpointGroupConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndpointGroupConfiguration(EndpointGroupConfiguration source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EndpointGroupRegion != null) {
            this.EndpointGroupRegion = new String(source.EndpointGroupRegion);
        }
        if (source.EndpointConfigurations != null) {
            this.EndpointConfigurations = new EndpointConfigurations[source.EndpointConfigurations.length];
            for (int i = 0; i < source.EndpointConfigurations.length; i++) {
                this.EndpointConfigurations[i] = new EndpointConfigurations(source.EndpointConfigurations[i]);
            }
        }
        if (source.CheckType != null) {
            this.CheckType = new String(source.CheckType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CheckPort != null) {
            this.CheckPort = new String(source.CheckPort);
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
        if (source.ForwardProtocol != null) {
            this.ForwardProtocol = new String(source.ForwardProtocol);
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
        if (source.PortOverrides != null) {
            this.PortOverrides = new PortOverride[source.PortOverrides.length];
            for (int i = 0; i < source.PortOverrides.length; i++) {
                this.PortOverrides[i] = new PortOverride(source.PortOverrides[i]);
            }
        }
        if (source.IspType != null) {
            this.IspType = new String(source.IspType);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EndpointGroupRegion", this.EndpointGroupRegion);
        this.setParamArrayObj(map, prefix + "EndpointConfigurations.", this.EndpointConfigurations);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CheckPort", this.CheckPort);
        this.setParamSimple(map, prefix + "ContextType", this.ContextType);
        this.setParamSimple(map, prefix + "CheckSendContext", this.CheckSendContext);
        this.setParamSimple(map, prefix + "CheckRecvContext", this.CheckRecvContext);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "HealthCheckInterval", this.HealthCheckInterval);
        this.setParamSimple(map, prefix + "UnhealthyThreshold", this.UnhealthyThreshold);
        this.setParamSimple(map, prefix + "HealthyThreshold", this.HealthyThreshold);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "CheckDomain", this.CheckDomain);
        this.setParamSimple(map, prefix + "CheckPath", this.CheckPath);
        this.setParamSimple(map, prefix + "CheckMethod", this.CheckMethod);
        this.setParamArraySimple(map, prefix + "StatusMask.", this.StatusMask);
        this.setParamArrayObj(map, prefix + "PortOverrides.", this.PortOverrides);
        this.setParamSimple(map, prefix + "IspType", this.IspType);
        this.setParamSimple(map, prefix + "CipherPolicyId", this.CipherPolicyId);
        this.setParamSimple(map, prefix + "HttpVersion", this.HttpVersion);

    }
}

