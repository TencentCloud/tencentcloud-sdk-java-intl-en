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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateListenerRequest extends AbstractModel {

    /**
    * <p>Default forwarding rule action list. Currently, a listener supports adding only 1 default forwarding rule action.</p>
    */
    @SerializedName("DefaultActions")
    @Expose
    private DefaultAction [] DefaultActions;

    /**
    * <p>Port used by the load balancing instance frontend. Value: 1-65535.</p>
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * <p>Listening protocol. Parameter Value: HTTP, HTTPS, or QUIC.</p>
    */
    @SerializedName("ListenerProtocol")
    @Expose
    private String ListenerProtocol;

    /**
    * <p>Cloud Load Balancer instance ID. The format is alb- followed by 8 alphanumeric characters.</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>List of CA certificate IDs configured for the listener. Currently, a listener supports adding only 1 CA certificate.<br>This parameter is required when the CaEnabled parameter value is true.</p>
    */
    @SerializedName("CaCertificateIds")
    @Expose
    private String [] CaCertificateIds;

    /**
    * <p>Whether mutual authentication is enabled.<br>Value:<br>true: enabled.<br>false (default value): not enabled.</p>
    */
    @SerializedName("CaEnabled")
    @Expose
    private Boolean CaEnabled;

    /**
    * <p>List of server certificate IDs.</p>
    */
    @SerializedName("CertificateIds")
    @Expose
    private String [] CertificateIds;

    /**
    * <p>Client token, used to ensure the idempotency of requests.  </p><p>Generate a parameter value from your client to ensure the uniqueness of the value for different requests. ClientToken supports only ASCII characters.</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>Whether Gzip compression is enabled. Value: true (default): yes. false: no</p>
    */
    @SerializedName("GzipEnabled")
    @Expose
    private Boolean GzipEnabled;

    /**
    * <p>Whether HTTP/2 is enabled. Default value: false for HTTP and true for HTTPS. Only the HTTPS protocol supports this parameter.</p>
    */
    @SerializedName("Http2Enabled")
    @Expose
    private Boolean Http2Enabled;

    /**
    * <p>Connection idle timeout, in seconds.<br>Value range: 1–600.<br>Default value: 15.<br>If no access request is received within the timeout period, load balancing will disconnect the current connection and create a new connection when the next request arrives.</p>
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
    * <p>Custom listener name, containing 1–255 characters. It must contain Chinese and harmless string characters, and can contain Chinese, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>Connection request timeout period. Unit: second. Value: 1–600. Default value: 60. If the real server does not return a response within the timeout period, load balancing will abandon waiting and return an HTTP 504 error code to the client.</p>
    */
    @SerializedName("RequestTimeout")
    @Expose
    private Long RequestTimeout;

    /**
    * <p>Security policy ID, format: tls- followed by 8 alphanumeric characters.</p>
    */
    @SerializedName("SecurityPolicyId")
    @Expose
    private String SecurityPolicyId;

    /**
    * <p>Tag list. Supports up to 20.</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>X-Forwarded-For configuration</p>
    */
    @SerializedName("XForwardedForConfig")
    @Expose
    private XForwardedForConfig XForwardedForConfig;

    /**
     * Get <p>Default forwarding rule action list. Currently, a listener supports adding only 1 default forwarding rule action.</p> 
     * @return DefaultActions <p>Default forwarding rule action list. Currently, a listener supports adding only 1 default forwarding rule action.</p>
     */
    public DefaultAction [] getDefaultActions() {
        return this.DefaultActions;
    }

    /**
     * Set <p>Default forwarding rule action list. Currently, a listener supports adding only 1 default forwarding rule action.</p>
     * @param DefaultActions <p>Default forwarding rule action list. Currently, a listener supports adding only 1 default forwarding rule action.</p>
     */
    public void setDefaultActions(DefaultAction [] DefaultActions) {
        this.DefaultActions = DefaultActions;
    }

    /**
     * Get <p>Port used by the load balancing instance frontend. Value: 1-65535.</p> 
     * @return ListenerPort <p>Port used by the load balancing instance frontend. Value: 1-65535.</p>
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set <p>Port used by the load balancing instance frontend. Value: 1-65535.</p>
     * @param ListenerPort <p>Port used by the load balancing instance frontend. Value: 1-65535.</p>
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get <p>Listening protocol. Parameter Value: HTTP, HTTPS, or QUIC.</p> 
     * @return ListenerProtocol <p>Listening protocol. Parameter Value: HTTP, HTTPS, or QUIC.</p>
     */
    public String getListenerProtocol() {
        return this.ListenerProtocol;
    }

    /**
     * Set <p>Listening protocol. Parameter Value: HTTP, HTTPS, or QUIC.</p>
     * @param ListenerProtocol <p>Listening protocol. Parameter Value: HTTP, HTTPS, or QUIC.</p>
     */
    public void setListenerProtocol(String ListenerProtocol) {
        this.ListenerProtocol = ListenerProtocol;
    }

    /**
     * Get <p>Cloud Load Balancer instance ID. The format is alb- followed by 8 alphanumeric characters.</p> 
     * @return LoadBalancerId <p>Cloud Load Balancer instance ID. The format is alb- followed by 8 alphanumeric characters.</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>Cloud Load Balancer instance ID. The format is alb- followed by 8 alphanumeric characters.</p>
     * @param LoadBalancerId <p>Cloud Load Balancer instance ID. The format is alb- followed by 8 alphanumeric characters.</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>List of CA certificate IDs configured for the listener. Currently, a listener supports adding only 1 CA certificate.<br>This parameter is required when the CaEnabled parameter value is true.</p> 
     * @return CaCertificateIds <p>List of CA certificate IDs configured for the listener. Currently, a listener supports adding only 1 CA certificate.<br>This parameter is required when the CaEnabled parameter value is true.</p>
     */
    public String [] getCaCertificateIds() {
        return this.CaCertificateIds;
    }

    /**
     * Set <p>List of CA certificate IDs configured for the listener. Currently, a listener supports adding only 1 CA certificate.<br>This parameter is required when the CaEnabled parameter value is true.</p>
     * @param CaCertificateIds <p>List of CA certificate IDs configured for the listener. Currently, a listener supports adding only 1 CA certificate.<br>This parameter is required when the CaEnabled parameter value is true.</p>
     */
    public void setCaCertificateIds(String [] CaCertificateIds) {
        this.CaCertificateIds = CaCertificateIds;
    }

    /**
     * Get <p>Whether mutual authentication is enabled.<br>Value:<br>true: enabled.<br>false (default value): not enabled.</p> 
     * @return CaEnabled <p>Whether mutual authentication is enabled.<br>Value:<br>true: enabled.<br>false (default value): not enabled.</p>
     */
    public Boolean getCaEnabled() {
        return this.CaEnabled;
    }

    /**
     * Set <p>Whether mutual authentication is enabled.<br>Value:<br>true: enabled.<br>false (default value): not enabled.</p>
     * @param CaEnabled <p>Whether mutual authentication is enabled.<br>Value:<br>true: enabled.<br>false (default value): not enabled.</p>
     */
    public void setCaEnabled(Boolean CaEnabled) {
        this.CaEnabled = CaEnabled;
    }

    /**
     * Get <p>List of server certificate IDs.</p> 
     * @return CertificateIds <p>List of server certificate IDs.</p>
     */
    public String [] getCertificateIds() {
        return this.CertificateIds;
    }

    /**
     * Set <p>List of server certificate IDs.</p>
     * @param CertificateIds <p>List of server certificate IDs.</p>
     */
    public void setCertificateIds(String [] CertificateIds) {
        this.CertificateIds = CertificateIds;
    }

    /**
     * Get <p>Client token, used to ensure the idempotency of requests.  </p><p>Generate a parameter value from your client to ensure the uniqueness of the value for different requests. ClientToken supports only ASCII characters.</p> 
     * @return ClientToken <p>Client token, used to ensure the idempotency of requests.  </p><p>Generate a parameter value from your client to ensure the uniqueness of the value for different requests. ClientToken supports only ASCII characters.</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>Client token, used to ensure the idempotency of requests.  </p><p>Generate a parameter value from your client to ensure the uniqueness of the value for different requests. ClientToken supports only ASCII characters.</p>
     * @param ClientToken <p>Client token, used to ensure the idempotency of requests.  </p><p>Generate a parameter value from your client to ensure the uniqueness of the value for different requests. ClientToken supports only ASCII characters.</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>Whether Gzip compression is enabled. Value: true (default): yes. false: no</p> 
     * @return GzipEnabled <p>Whether Gzip compression is enabled. Value: true (default): yes. false: no</p>
     */
    public Boolean getGzipEnabled() {
        return this.GzipEnabled;
    }

    /**
     * Set <p>Whether Gzip compression is enabled. Value: true (default): yes. false: no</p>
     * @param GzipEnabled <p>Whether Gzip compression is enabled. Value: true (default): yes. false: no</p>
     */
    public void setGzipEnabled(Boolean GzipEnabled) {
        this.GzipEnabled = GzipEnabled;
    }

    /**
     * Get <p>Whether HTTP/2 is enabled. Default value: false for HTTP and true for HTTPS. Only the HTTPS protocol supports this parameter.</p> 
     * @return Http2Enabled <p>Whether HTTP/2 is enabled. Default value: false for HTTP and true for HTTPS. Only the HTTPS protocol supports this parameter.</p>
     */
    public Boolean getHttp2Enabled() {
        return this.Http2Enabled;
    }

    /**
     * Set <p>Whether HTTP/2 is enabled. Default value: false for HTTP and true for HTTPS. Only the HTTPS protocol supports this parameter.</p>
     * @param Http2Enabled <p>Whether HTTP/2 is enabled. Default value: false for HTTP and true for HTTPS. Only the HTTPS protocol supports this parameter.</p>
     */
    public void setHttp2Enabled(Boolean Http2Enabled) {
        this.Http2Enabled = Http2Enabled;
    }

    /**
     * Get <p>Connection idle timeout, in seconds.<br>Value range: 1–600.<br>Default value: 15.<br>If no access request is received within the timeout period, load balancing will disconnect the current connection and create a new connection when the next request arrives.</p> 
     * @return IdleTimeout <p>Connection idle timeout, in seconds.<br>Value range: 1–600.<br>Default value: 15.<br>If no access request is received within the timeout period, load balancing will disconnect the current connection and create a new connection when the next request arrives.</p>
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set <p>Connection idle timeout, in seconds.<br>Value range: 1–600.<br>Default value: 15.<br>If no access request is received within the timeout period, load balancing will disconnect the current connection and create a new connection when the next request arrives.</p>
     * @param IdleTimeout <p>Connection idle timeout, in seconds.<br>Value range: 1–600.<br>Default value: 15.<br>If no access request is received within the timeout period, load balancing will disconnect the current connection and create a new connection when the next request arrives.</p>
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    /**
     * Get <p>Custom listener name, containing 1–255 characters. It must contain Chinese and harmless string characters, and can contain Chinese, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).</p> 
     * @return ListenerName <p>Custom listener name, containing 1–255 characters. It must contain Chinese and harmless string characters, and can contain Chinese, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).</p>
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set <p>Custom listener name, containing 1–255 characters. It must contain Chinese and harmless string characters, and can contain Chinese, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).</p>
     * @param ListenerName <p>Custom listener name, containing 1–255 characters. It must contain Chinese and harmless string characters, and can contain Chinese, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).</p>
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get <p>Connection request timeout period. Unit: second. Value: 1–600. Default value: 60. If the real server does not return a response within the timeout period, load balancing will abandon waiting and return an HTTP 504 error code to the client.</p> 
     * @return RequestTimeout <p>Connection request timeout period. Unit: second. Value: 1–600. Default value: 60. If the real server does not return a response within the timeout period, load balancing will abandon waiting and return an HTTP 504 error code to the client.</p>
     */
    public Long getRequestTimeout() {
        return this.RequestTimeout;
    }

    /**
     * Set <p>Connection request timeout period. Unit: second. Value: 1–600. Default value: 60. If the real server does not return a response within the timeout period, load balancing will abandon waiting and return an HTTP 504 error code to the client.</p>
     * @param RequestTimeout <p>Connection request timeout period. Unit: second. Value: 1–600. Default value: 60. If the real server does not return a response within the timeout period, load balancing will abandon waiting and return an HTTP 504 error code to the client.</p>
     */
    public void setRequestTimeout(Long RequestTimeout) {
        this.RequestTimeout = RequestTimeout;
    }

    /**
     * Get <p>Security policy ID, format: tls- followed by 8 alphanumeric characters.</p> 
     * @return SecurityPolicyId <p>Security policy ID, format: tls- followed by 8 alphanumeric characters.</p>
     */
    public String getSecurityPolicyId() {
        return this.SecurityPolicyId;
    }

    /**
     * Set <p>Security policy ID, format: tls- followed by 8 alphanumeric characters.</p>
     * @param SecurityPolicyId <p>Security policy ID, format: tls- followed by 8 alphanumeric characters.</p>
     */
    public void setSecurityPolicyId(String SecurityPolicyId) {
        this.SecurityPolicyId = SecurityPolicyId;
    }

    /**
     * Get <p>Tag list. Supports up to 20.</p> 
     * @return Tags <p>Tag list. Supports up to 20.</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag list. Supports up to 20.</p>
     * @param Tags <p>Tag list. Supports up to 20.</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>X-Forwarded-For configuration</p> 
     * @return XForwardedForConfig <p>X-Forwarded-For configuration</p>
     */
    public XForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    /**
     * Set <p>X-Forwarded-For configuration</p>
     * @param XForwardedForConfig <p>X-Forwarded-For configuration</p>
     */
    public void setXForwardedForConfig(XForwardedForConfig XForwardedForConfig) {
        this.XForwardedForConfig = XForwardedForConfig;
    }

    public CreateListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateListenerRequest(CreateListenerRequest source) {
        if (source.DefaultActions != null) {
            this.DefaultActions = new DefaultAction[source.DefaultActions.length];
            for (int i = 0; i < source.DefaultActions.length; i++) {
                this.DefaultActions[i] = new DefaultAction(source.DefaultActions[i]);
            }
        }
        if (source.ListenerPort != null) {
            this.ListenerPort = new Long(source.ListenerPort);
        }
        if (source.ListenerProtocol != null) {
            this.ListenerProtocol = new String(source.ListenerProtocol);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.CaCertificateIds != null) {
            this.CaCertificateIds = new String[source.CaCertificateIds.length];
            for (int i = 0; i < source.CaCertificateIds.length; i++) {
                this.CaCertificateIds[i] = new String(source.CaCertificateIds[i]);
            }
        }
        if (source.CaEnabled != null) {
            this.CaEnabled = new Boolean(source.CaEnabled);
        }
        if (source.CertificateIds != null) {
            this.CertificateIds = new String[source.CertificateIds.length];
            for (int i = 0; i < source.CertificateIds.length; i++) {
                this.CertificateIds[i] = new String(source.CertificateIds[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.GzipEnabled != null) {
            this.GzipEnabled = new Boolean(source.GzipEnabled);
        }
        if (source.Http2Enabled != null) {
            this.Http2Enabled = new Boolean(source.Http2Enabled);
        }
        if (source.IdleTimeout != null) {
            this.IdleTimeout = new Long(source.IdleTimeout);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.RequestTimeout != null) {
            this.RequestTimeout = new Long(source.RequestTimeout);
        }
        if (source.SecurityPolicyId != null) {
            this.SecurityPolicyId = new String(source.SecurityPolicyId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.XForwardedForConfig != null) {
            this.XForwardedForConfig = new XForwardedForConfig(source.XForwardedForConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DefaultActions.", this.DefaultActions);
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);
        this.setParamSimple(map, prefix + "ListenerProtocol", this.ListenerProtocol);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "CaCertificateIds.", this.CaCertificateIds);
        this.setParamSimple(map, prefix + "CaEnabled", this.CaEnabled);
        this.setParamArraySimple(map, prefix + "CertificateIds.", this.CertificateIds);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "GzipEnabled", this.GzipEnabled);
        this.setParamSimple(map, prefix + "Http2Enabled", this.Http2Enabled);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "RequestTimeout", this.RequestTimeout);
        this.setParamSimple(map, prefix + "SecurityPolicyId", this.SecurityPolicyId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "XForwardedForConfig.", this.XForwardedForConfig);

    }
}

