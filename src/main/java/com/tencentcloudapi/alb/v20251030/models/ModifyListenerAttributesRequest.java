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

public class ModifyListenerAttributesRequest extends AbstractModel {

    /**
    * Listener ID, format: lst- followed by 8 alphanumeric characters.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CA certificate ID list for the listener configuration. Currently only support adding 1 CA certificate.
    */
    @SerializedName("CaCertificateIds")
    @Expose
    private String [] CaCertificateIds;

    /**
    * Whether mutual authentication is enabled.
Valid values:
true: enabled.
false (default value): not enabled.
    */
    @SerializedName("CaEnabled")
    @Expose
    private Boolean CaEnabled;

    /**
    * List of server certificate IDs.
    */
    @SerializedName("CertificateIds")
    @Expose
    private String [] CertificateIds;

    /**
    * Client Token, used for ensuring request idempotency.  

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * List of default forward rule actions. Currently, a listener supports adding only 1 default forward rule action.
    */
    @SerializedName("DefaultActions")
    @Expose
    private DefaultAction [] DefaultActions;

    /**
    * Whether to enable Gzip compression.
    */
    @SerializedName("GzipEnabled")
    @Expose
    private Boolean GzipEnabled;

    /**
    * Whether to enable HTTP/2. Only HTTPS protocol supports this parameter.
    */
    @SerializedName("Http2Enabled")
    @Expose
    private Boolean Http2Enabled;

    /**
    * Specify the idle timeout for a connection. Unit: seconds.
Valid values: 1-600.
Default value: 15.
If no access request is received within the set time, load balancing will temporarily disconnect the current connection and reestablish a new connection when the next request arrives.
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
    * Custom listener name, 1–255 characters in length. It must contain Chinese and harmless string characters, and can contain Chinese, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * Specify the request timeout. Unit: seconds.
Value: 1-600.
Default value: 60.
If the real server does not respond within the timeout period, load balancing will abandon waiting and return an HTTP 504 error code to the client.
    */
    @SerializedName("RequestTimeout")
    @Expose
    private Long RequestTimeout;

    /**
    * Security policy ID in the format of tls- followed by 8 alphanumeric characters.
    */
    @SerializedName("SecurityPolicyId")
    @Expose
    private String SecurityPolicyId;

    /**
    * XForwardedFor configuration.
    */
    @SerializedName("XForwardedForConfig")
    @Expose
    private XForwardedForConfig XForwardedForConfig;

    /**
     * Get Listener ID, format: lst- followed by 8 alphanumeric characters. 
     * @return ListenerId Listener ID, format: lst- followed by 8 alphanumeric characters.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID, format: lst- followed by 8 alphanumeric characters.
     * @param ListenerId Listener ID, format: lst- followed by 8 alphanumeric characters.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters. 
     * @return LoadBalancerId Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     * @param LoadBalancerId Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CA certificate ID list for the listener configuration. Currently only support adding 1 CA certificate. 
     * @return CaCertificateIds CA certificate ID list for the listener configuration. Currently only support adding 1 CA certificate.
     */
    public String [] getCaCertificateIds() {
        return this.CaCertificateIds;
    }

    /**
     * Set CA certificate ID list for the listener configuration. Currently only support adding 1 CA certificate.
     * @param CaCertificateIds CA certificate ID list for the listener configuration. Currently only support adding 1 CA certificate.
     */
    public void setCaCertificateIds(String [] CaCertificateIds) {
        this.CaCertificateIds = CaCertificateIds;
    }

    /**
     * Get Whether mutual authentication is enabled.
Valid values:
true: enabled.
false (default value): not enabled. 
     * @return CaEnabled Whether mutual authentication is enabled.
Valid values:
true: enabled.
false (default value): not enabled.
     */
    public Boolean getCaEnabled() {
        return this.CaEnabled;
    }

    /**
     * Set Whether mutual authentication is enabled.
Valid values:
true: enabled.
false (default value): not enabled.
     * @param CaEnabled Whether mutual authentication is enabled.
Valid values:
true: enabled.
false (default value): not enabled.
     */
    public void setCaEnabled(Boolean CaEnabled) {
        this.CaEnabled = CaEnabled;
    }

    /**
     * Get List of server certificate IDs. 
     * @return CertificateIds List of server certificate IDs.
     */
    public String [] getCertificateIds() {
        return this.CertificateIds;
    }

    /**
     * Set List of server certificate IDs.
     * @param CertificateIds List of server certificate IDs.
     */
    public void setCertificateIds(String [] CertificateIds) {
        this.CertificateIds = CertificateIds;
    }

    /**
     * Get Client Token, used for ensuring request idempotency.  

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters. 
     * @return ClientToken Client Token, used for ensuring request idempotency.  

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set Client Token, used for ensuring request idempotency.  

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.
     * @param ClientToken Client Token, used for ensuring request idempotency.  

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get List of default forward rule actions. Currently, a listener supports adding only 1 default forward rule action. 
     * @return DefaultActions List of default forward rule actions. Currently, a listener supports adding only 1 default forward rule action.
     */
    public DefaultAction [] getDefaultActions() {
        return this.DefaultActions;
    }

    /**
     * Set List of default forward rule actions. Currently, a listener supports adding only 1 default forward rule action.
     * @param DefaultActions List of default forward rule actions. Currently, a listener supports adding only 1 default forward rule action.
     */
    public void setDefaultActions(DefaultAction [] DefaultActions) {
        this.DefaultActions = DefaultActions;
    }

    /**
     * Get Whether to enable Gzip compression. 
     * @return GzipEnabled Whether to enable Gzip compression.
     */
    public Boolean getGzipEnabled() {
        return this.GzipEnabled;
    }

    /**
     * Set Whether to enable Gzip compression.
     * @param GzipEnabled Whether to enable Gzip compression.
     */
    public void setGzipEnabled(Boolean GzipEnabled) {
        this.GzipEnabled = GzipEnabled;
    }

    /**
     * Get Whether to enable HTTP/2. Only HTTPS protocol supports this parameter. 
     * @return Http2Enabled Whether to enable HTTP/2. Only HTTPS protocol supports this parameter.
     */
    public Boolean getHttp2Enabled() {
        return this.Http2Enabled;
    }

    /**
     * Set Whether to enable HTTP/2. Only HTTPS protocol supports this parameter.
     * @param Http2Enabled Whether to enable HTTP/2. Only HTTPS protocol supports this parameter.
     */
    public void setHttp2Enabled(Boolean Http2Enabled) {
        this.Http2Enabled = Http2Enabled;
    }

    /**
     * Get Specify the idle timeout for a connection. Unit: seconds.
Valid values: 1-600.
Default value: 15.
If no access request is received within the set time, load balancing will temporarily disconnect the current connection and reestablish a new connection when the next request arrives. 
     * @return IdleTimeout Specify the idle timeout for a connection. Unit: seconds.
Valid values: 1-600.
Default value: 15.
If no access request is received within the set time, load balancing will temporarily disconnect the current connection and reestablish a new connection when the next request arrives.
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set Specify the idle timeout for a connection. Unit: seconds.
Valid values: 1-600.
Default value: 15.
If no access request is received within the set time, load balancing will temporarily disconnect the current connection and reestablish a new connection when the next request arrives.
     * @param IdleTimeout Specify the idle timeout for a connection. Unit: seconds.
Valid values: 1-600.
Default value: 15.
If no access request is received within the set time, load balancing will temporarily disconnect the current connection and reestablish a new connection when the next request arrives.
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    /**
     * Get Custom listener name, 1–255 characters in length. It must contain Chinese and harmless string characters, and can contain Chinese, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_). 
     * @return ListenerName Custom listener name, 1–255 characters in length. It must contain Chinese and harmless string characters, and can contain Chinese, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set Custom listener name, 1–255 characters in length. It must contain Chinese and harmless string characters, and can contain Chinese, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
     * @param ListenerName Custom listener name, 1–255 characters in length. It must contain Chinese and harmless string characters, and can contain Chinese, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get Specify the request timeout. Unit: seconds.
Value: 1-600.
Default value: 60.
If the real server does not respond within the timeout period, load balancing will abandon waiting and return an HTTP 504 error code to the client. 
     * @return RequestTimeout Specify the request timeout. Unit: seconds.
Value: 1-600.
Default value: 60.
If the real server does not respond within the timeout period, load balancing will abandon waiting and return an HTTP 504 error code to the client.
     */
    public Long getRequestTimeout() {
        return this.RequestTimeout;
    }

    /**
     * Set Specify the request timeout. Unit: seconds.
Value: 1-600.
Default value: 60.
If the real server does not respond within the timeout period, load balancing will abandon waiting and return an HTTP 504 error code to the client.
     * @param RequestTimeout Specify the request timeout. Unit: seconds.
Value: 1-600.
Default value: 60.
If the real server does not respond within the timeout period, load balancing will abandon waiting and return an HTTP 504 error code to the client.
     */
    public void setRequestTimeout(Long RequestTimeout) {
        this.RequestTimeout = RequestTimeout;
    }

    /**
     * Get Security policy ID in the format of tls- followed by 8 alphanumeric characters. 
     * @return SecurityPolicyId Security policy ID in the format of tls- followed by 8 alphanumeric characters.
     */
    public String getSecurityPolicyId() {
        return this.SecurityPolicyId;
    }

    /**
     * Set Security policy ID in the format of tls- followed by 8 alphanumeric characters.
     * @param SecurityPolicyId Security policy ID in the format of tls- followed by 8 alphanumeric characters.
     */
    public void setSecurityPolicyId(String SecurityPolicyId) {
        this.SecurityPolicyId = SecurityPolicyId;
    }

    /**
     * Get XForwardedFor configuration. 
     * @return XForwardedForConfig XForwardedFor configuration.
     */
    public XForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    /**
     * Set XForwardedFor configuration.
     * @param XForwardedForConfig XForwardedFor configuration.
     */
    public void setXForwardedForConfig(XForwardedForConfig XForwardedForConfig) {
        this.XForwardedForConfig = XForwardedForConfig;
    }

    public ModifyListenerAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyListenerAttributesRequest(ModifyListenerAttributesRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
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
        if (source.DefaultActions != null) {
            this.DefaultActions = new DefaultAction[source.DefaultActions.length];
            for (int i = 0; i < source.DefaultActions.length; i++) {
                this.DefaultActions[i] = new DefaultAction(source.DefaultActions[i]);
            }
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
        if (source.XForwardedForConfig != null) {
            this.XForwardedForConfig = new XForwardedForConfig(source.XForwardedForConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "CaCertificateIds.", this.CaCertificateIds);
        this.setParamSimple(map, prefix + "CaEnabled", this.CaEnabled);
        this.setParamArraySimple(map, prefix + "CertificateIds.", this.CertificateIds);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamArrayObj(map, prefix + "DefaultActions.", this.DefaultActions);
        this.setParamSimple(map, prefix + "GzipEnabled", this.GzipEnabled);
        this.setParamSimple(map, prefix + "Http2Enabled", this.Http2Enabled);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "RequestTimeout", this.RequestTimeout);
        this.setParamSimple(map, prefix + "SecurityPolicyId", this.SecurityPolicyId);
        this.setParamObj(map, prefix + "XForwardedForConfig.", this.XForwardedForConfig);

    }
}

