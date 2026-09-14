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

public class CreateListenerRequest extends AbstractModel {

    /**
    * <p>Global acceleration instance ID.</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Port range.</p>
    */
    @SerializedName("PortRanges")
    @Expose
    private PortRanges PortRanges;

    /**
    * <p>Description. Maximum length cannot exceed 100 characters.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Listening type, defaults to smart routing.</p><p>Enumeration values:</p><ul><li>Standard: Smart routing.</li></ul>
    */
    @SerializedName("ListenerType")
    @Expose
    private String ListenerType;

    /**
    * <p>Protocol. Default value: TCP. Supports configuration of 'TCP', 'UDP', 'HTTP', and 'HTTPS'.</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>Connection idle wait time.</p><p>1. For HTTP/HTTPS listener, the default value is 15, with a supported range of 1-60.<br>2. For TCP listener, the default value is 900, with a supported range of 10-900.<br>3. For UDP listener, the default value is 20, with a supported range of 10-20.</p>
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
    * <p>Layer-4 source IP retrieval mode. Supports 'TOA', 'ProxyProtocol', and 'ProxyProtocolV2'.</p><p>This parameter can be filled in only when the Layer-4 source IP retrieval mode is enabled.</p>
    */
    @SerializedName("GetRealIpType")
    @Expose
    private String GetRealIpType;

    /**
    * <p>Whether to enable session persistence. Supports configuration of 'Open' and 'Close'.</p><p>Enumeration values:</p><ul><li>Open: enable.</li><li>Close: disable.</li></ul><p>Only supported for layer-4 listeners. For layer-7 listeners, modification is not supported.</p>
    */
    @SerializedName("ClientAffinity")
    @Expose
    private String ClientAffinity;

    /**
    * <p>Request timeout.</p><p>Value range: [1, 180]</p><p>Default value: 60</p><p>This parameter is configurable only for HTTPS listeners.</p>
    */
    @SerializedName("RequestTimeout")
    @Expose
    private Long RequestTimeout;

    /**
    * <p>Whether to enable layer-7 source IP retrieval mode.</p>
    */
    @SerializedName("XForwardedForRealIp")
    @Expose
    private Boolean XForwardedForRealIp;

    /**
    * <p>Parsing method.</p><p>Enumeration values:</p><ul><li>UNIDIRECTIONAL: two-way.</li><li>U: one-way.</li></ul><p>For an HTTPS listener, this field is required.</p>
    */
    @SerializedName("CertificationType")
    @Expose
    private String CertificationType;

    /**
    * <p>Encryption algorithm kit. Supports configuration of 'tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3'.</p>
    */
    @SerializedName("CipherPolicyId")
    @Expose
    private String CipherPolicyId;

    /**
    * <p>Server certificate.</p><p>Input limit: currently only support importing one cert; to use multiple certs, use the cert api CreateListenerAdditionalCert to add other certs.</p><p>This field is required for HTTPS listeners.</p>
    */
    @SerializedName("ServerCertificates")
    @Expose
    private String [] ServerCertificates;

    /**
    * <p>Client certificate.</p><p>Input limit: 1. Currently only support importing one cert. To use multiple certs, use the cert api CreateListenerAdditionalCert to add other certs. 2. The cert must be a CA certificate.</p><p>This field is required when HTTPS listener and mutual authentication are enabled.</p>
    */
    @SerializedName("ClientCaCertificates")
    @Expose
    private String [] ClientCaCertificates;

    /**
    * <p>HTTPS listener supports version selection</p><p>Enumeration values:</p><ul><li>HTTP/1.1: HTTP/1.1</li><li>HTTP/2: HTTP/2</li></ul>
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
     * Get <p>Port range.</p> 
     * @return PortRanges <p>Port range.</p>
     */
    public PortRanges getPortRanges() {
        return this.PortRanges;
    }

    /**
     * Set <p>Port range.</p>
     * @param PortRanges <p>Port range.</p>
     */
    public void setPortRanges(PortRanges PortRanges) {
        this.PortRanges = PortRanges;
    }

    /**
     * Get <p>Description. Maximum length cannot exceed 100 characters.</p> 
     * @return Description <p>Description. Maximum length cannot exceed 100 characters.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description. Maximum length cannot exceed 100 characters.</p>
     * @param Description <p>Description. Maximum length cannot exceed 100 characters.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Listening type, defaults to smart routing.</p><p>Enumeration values:</p><ul><li>Standard: Smart routing.</li></ul> 
     * @return ListenerType <p>Listening type, defaults to smart routing.</p><p>Enumeration values:</p><ul><li>Standard: Smart routing.</li></ul>
     */
    public String getListenerType() {
        return this.ListenerType;
    }

    /**
     * Set <p>Listening type, defaults to smart routing.</p><p>Enumeration values:</p><ul><li>Standard: Smart routing.</li></ul>
     * @param ListenerType <p>Listening type, defaults to smart routing.</p><p>Enumeration values:</p><ul><li>Standard: Smart routing.</li></ul>
     */
    public void setListenerType(String ListenerType) {
        this.ListenerType = ListenerType;
    }

    /**
     * Get <p>Protocol. Default value: TCP. Supports configuration of 'TCP', 'UDP', 'HTTP', and 'HTTPS'.</p> 
     * @return Protocol <p>Protocol. Default value: TCP. Supports configuration of 'TCP', 'UDP', 'HTTP', and 'HTTPS'.</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>Protocol. Default value: TCP. Supports configuration of 'TCP', 'UDP', 'HTTP', and 'HTTPS'.</p>
     * @param Protocol <p>Protocol. Default value: TCP. Supports configuration of 'TCP', 'UDP', 'HTTP', and 'HTTPS'.</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>Connection idle wait time.</p><p>1. For HTTP/HTTPS listener, the default value is 15, with a supported range of 1-60.<br>2. For TCP listener, the default value is 900, with a supported range of 10-900.<br>3. For UDP listener, the default value is 20, with a supported range of 10-20.</p> 
     * @return IdleTimeout <p>Connection idle wait time.</p><p>1. For HTTP/HTTPS listener, the default value is 15, with a supported range of 1-60.<br>2. For TCP listener, the default value is 900, with a supported range of 10-900.<br>3. For UDP listener, the default value is 20, with a supported range of 10-20.</p>
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set <p>Connection idle wait time.</p><p>1. For HTTP/HTTPS listener, the default value is 15, with a supported range of 1-60.<br>2. For TCP listener, the default value is 900, with a supported range of 10-900.<br>3. For UDP listener, the default value is 20, with a supported range of 10-20.</p>
     * @param IdleTimeout <p>Connection idle wait time.</p><p>1. For HTTP/HTTPS listener, the default value is 15, with a supported range of 1-60.<br>2. For TCP listener, the default value is 900, with a supported range of 10-900.<br>3. For UDP listener, the default value is 20, with a supported range of 10-20.</p>
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    /**
     * Get <p>Layer-4 source IP retrieval mode. Supports 'TOA', 'ProxyProtocol', and 'ProxyProtocolV2'.</p><p>This parameter can be filled in only when the Layer-4 source IP retrieval mode is enabled.</p> 
     * @return GetRealIpType <p>Layer-4 source IP retrieval mode. Supports 'TOA', 'ProxyProtocol', and 'ProxyProtocolV2'.</p><p>This parameter can be filled in only when the Layer-4 source IP retrieval mode is enabled.</p>
     */
    public String getGetRealIpType() {
        return this.GetRealIpType;
    }

    /**
     * Set <p>Layer-4 source IP retrieval mode. Supports 'TOA', 'ProxyProtocol', and 'ProxyProtocolV2'.</p><p>This parameter can be filled in only when the Layer-4 source IP retrieval mode is enabled.</p>
     * @param GetRealIpType <p>Layer-4 source IP retrieval mode. Supports 'TOA', 'ProxyProtocol', and 'ProxyProtocolV2'.</p><p>This parameter can be filled in only when the Layer-4 source IP retrieval mode is enabled.</p>
     */
    public void setGetRealIpType(String GetRealIpType) {
        this.GetRealIpType = GetRealIpType;
    }

    /**
     * Get <p>Whether to enable session persistence. Supports configuration of 'Open' and 'Close'.</p><p>Enumeration values:</p><ul><li>Open: enable.</li><li>Close: disable.</li></ul><p>Only supported for layer-4 listeners. For layer-7 listeners, modification is not supported.</p> 
     * @return ClientAffinity <p>Whether to enable session persistence. Supports configuration of 'Open' and 'Close'.</p><p>Enumeration values:</p><ul><li>Open: enable.</li><li>Close: disable.</li></ul><p>Only supported for layer-4 listeners. For layer-7 listeners, modification is not supported.</p>
     */
    public String getClientAffinity() {
        return this.ClientAffinity;
    }

    /**
     * Set <p>Whether to enable session persistence. Supports configuration of 'Open' and 'Close'.</p><p>Enumeration values:</p><ul><li>Open: enable.</li><li>Close: disable.</li></ul><p>Only supported for layer-4 listeners. For layer-7 listeners, modification is not supported.</p>
     * @param ClientAffinity <p>Whether to enable session persistence. Supports configuration of 'Open' and 'Close'.</p><p>Enumeration values:</p><ul><li>Open: enable.</li><li>Close: disable.</li></ul><p>Only supported for layer-4 listeners. For layer-7 listeners, modification is not supported.</p>
     */
    public void setClientAffinity(String ClientAffinity) {
        this.ClientAffinity = ClientAffinity;
    }

    /**
     * Get <p>Request timeout.</p><p>Value range: [1, 180]</p><p>Default value: 60</p><p>This parameter is configurable only for HTTPS listeners.</p> 
     * @return RequestTimeout <p>Request timeout.</p><p>Value range: [1, 180]</p><p>Default value: 60</p><p>This parameter is configurable only for HTTPS listeners.</p>
     */
    public Long getRequestTimeout() {
        return this.RequestTimeout;
    }

    /**
     * Set <p>Request timeout.</p><p>Value range: [1, 180]</p><p>Default value: 60</p><p>This parameter is configurable only for HTTPS listeners.</p>
     * @param RequestTimeout <p>Request timeout.</p><p>Value range: [1, 180]</p><p>Default value: 60</p><p>This parameter is configurable only for HTTPS listeners.</p>
     */
    public void setRequestTimeout(Long RequestTimeout) {
        this.RequestTimeout = RequestTimeout;
    }

    /**
     * Get <p>Whether to enable layer-7 source IP retrieval mode.</p> 
     * @return XForwardedForRealIp <p>Whether to enable layer-7 source IP retrieval mode.</p>
     */
    public Boolean getXForwardedForRealIp() {
        return this.XForwardedForRealIp;
    }

    /**
     * Set <p>Whether to enable layer-7 source IP retrieval mode.</p>
     * @param XForwardedForRealIp <p>Whether to enable layer-7 source IP retrieval mode.</p>
     */
    public void setXForwardedForRealIp(Boolean XForwardedForRealIp) {
        this.XForwardedForRealIp = XForwardedForRealIp;
    }

    /**
     * Get <p>Parsing method.</p><p>Enumeration values:</p><ul><li>UNIDIRECTIONAL: two-way.</li><li>U: one-way.</li></ul><p>For an HTTPS listener, this field is required.</p> 
     * @return CertificationType <p>Parsing method.</p><p>Enumeration values:</p><ul><li>UNIDIRECTIONAL: two-way.</li><li>U: one-way.</li></ul><p>For an HTTPS listener, this field is required.</p>
     */
    public String getCertificationType() {
        return this.CertificationType;
    }

    /**
     * Set <p>Parsing method.</p><p>Enumeration values:</p><ul><li>UNIDIRECTIONAL: two-way.</li><li>U: one-way.</li></ul><p>For an HTTPS listener, this field is required.</p>
     * @param CertificationType <p>Parsing method.</p><p>Enumeration values:</p><ul><li>UNIDIRECTIONAL: two-way.</li><li>U: one-way.</li></ul><p>For an HTTPS listener, this field is required.</p>
     */
    public void setCertificationType(String CertificationType) {
        this.CertificationType = CertificationType;
    }

    /**
     * Get <p>Encryption algorithm kit. Supports configuration of 'tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3'.</p> 
     * @return CipherPolicyId <p>Encryption algorithm kit. Supports configuration of 'tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3'.</p>
     */
    public String getCipherPolicyId() {
        return this.CipherPolicyId;
    }

    /**
     * Set <p>Encryption algorithm kit. Supports configuration of 'tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3'.</p>
     * @param CipherPolicyId <p>Encryption algorithm kit. Supports configuration of 'tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3'.</p>
     */
    public void setCipherPolicyId(String CipherPolicyId) {
        this.CipherPolicyId = CipherPolicyId;
    }

    /**
     * Get <p>Server certificate.</p><p>Input limit: currently only support importing one cert; to use multiple certs, use the cert api CreateListenerAdditionalCert to add other certs.</p><p>This field is required for HTTPS listeners.</p> 
     * @return ServerCertificates <p>Server certificate.</p><p>Input limit: currently only support importing one cert; to use multiple certs, use the cert api CreateListenerAdditionalCert to add other certs.</p><p>This field is required for HTTPS listeners.</p>
     */
    public String [] getServerCertificates() {
        return this.ServerCertificates;
    }

    /**
     * Set <p>Server certificate.</p><p>Input limit: currently only support importing one cert; to use multiple certs, use the cert api CreateListenerAdditionalCert to add other certs.</p><p>This field is required for HTTPS listeners.</p>
     * @param ServerCertificates <p>Server certificate.</p><p>Input limit: currently only support importing one cert; to use multiple certs, use the cert api CreateListenerAdditionalCert to add other certs.</p><p>This field is required for HTTPS listeners.</p>
     */
    public void setServerCertificates(String [] ServerCertificates) {
        this.ServerCertificates = ServerCertificates;
    }

    /**
     * Get <p>Client certificate.</p><p>Input limit: 1. Currently only support importing one cert. To use multiple certs, use the cert api CreateListenerAdditionalCert to add other certs. 2. The cert must be a CA certificate.</p><p>This field is required when HTTPS listener and mutual authentication are enabled.</p> 
     * @return ClientCaCertificates <p>Client certificate.</p><p>Input limit: 1. Currently only support importing one cert. To use multiple certs, use the cert api CreateListenerAdditionalCert to add other certs. 2. The cert must be a CA certificate.</p><p>This field is required when HTTPS listener and mutual authentication are enabled.</p>
     */
    public String [] getClientCaCertificates() {
        return this.ClientCaCertificates;
    }

    /**
     * Set <p>Client certificate.</p><p>Input limit: 1. Currently only support importing one cert. To use multiple certs, use the cert api CreateListenerAdditionalCert to add other certs. 2. The cert must be a CA certificate.</p><p>This field is required when HTTPS listener and mutual authentication are enabled.</p>
     * @param ClientCaCertificates <p>Client certificate.</p><p>Input limit: 1. Currently only support importing one cert. To use multiple certs, use the cert api CreateListenerAdditionalCert to add other certs. 2. The cert must be a CA certificate.</p><p>This field is required when HTTPS listener and mutual authentication are enabled.</p>
     */
    public void setClientCaCertificates(String [] ClientCaCertificates) {
        this.ClientCaCertificates = ClientCaCertificates;
    }

    /**
     * Get <p>HTTPS listener supports version selection</p><p>Enumeration values:</p><ul><li>HTTP/1.1: HTTP/1.1</li><li>HTTP/2: HTTP/2</li></ul> 
     * @return HttpVersion <p>HTTPS listener supports version selection</p><p>Enumeration values:</p><ul><li>HTTP/1.1: HTTP/1.1</li><li>HTTP/2: HTTP/2</li></ul>
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set <p>HTTPS listener supports version selection</p><p>Enumeration values:</p><ul><li>HTTP/1.1: HTTP/1.1</li><li>HTTP/2: HTTP/2</li></ul>
     * @param HttpVersion <p>HTTPS listener supports version selection</p><p>Enumeration values:</p><ul><li>HTTP/1.1: HTTP/1.1</li><li>HTTP/2: HTTP/2</li></ul>
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    public CreateListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateListenerRequest(CreateListenerRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PortRanges != null) {
            this.PortRanges = new PortRanges(source.PortRanges);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ListenerType != null) {
            this.ListenerType = new String(source.ListenerType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.IdleTimeout != null) {
            this.IdleTimeout = new Long(source.IdleTimeout);
        }
        if (source.GetRealIpType != null) {
            this.GetRealIpType = new String(source.GetRealIpType);
        }
        if (source.ClientAffinity != null) {
            this.ClientAffinity = new String(source.ClientAffinity);
        }
        if (source.RequestTimeout != null) {
            this.RequestTimeout = new Long(source.RequestTimeout);
        }
        if (source.XForwardedForRealIp != null) {
            this.XForwardedForRealIp = new Boolean(source.XForwardedForRealIp);
        }
        if (source.CertificationType != null) {
            this.CertificationType = new String(source.CertificationType);
        }
        if (source.CipherPolicyId != null) {
            this.CipherPolicyId = new String(source.CipherPolicyId);
        }
        if (source.ServerCertificates != null) {
            this.ServerCertificates = new String[source.ServerCertificates.length];
            for (int i = 0; i < source.ServerCertificates.length; i++) {
                this.ServerCertificates[i] = new String(source.ServerCertificates[i]);
            }
        }
        if (source.ClientCaCertificates != null) {
            this.ClientCaCertificates = new String[source.ClientCaCertificates.length];
            for (int i = 0; i < source.ClientCaCertificates.length; i++) {
                this.ClientCaCertificates[i] = new String(source.ClientCaCertificates[i]);
            }
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "PortRanges.", this.PortRanges);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ListenerType", this.ListenerType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);
        this.setParamSimple(map, prefix + "GetRealIpType", this.GetRealIpType);
        this.setParamSimple(map, prefix + "ClientAffinity", this.ClientAffinity);
        this.setParamSimple(map, prefix + "RequestTimeout", this.RequestTimeout);
        this.setParamSimple(map, prefix + "XForwardedForRealIp", this.XForwardedForRealIp);
        this.setParamSimple(map, prefix + "CertificationType", this.CertificationType);
        this.setParamSimple(map, prefix + "CipherPolicyId", this.CipherPolicyId);
        this.setParamArraySimple(map, prefix + "ServerCertificates.", this.ServerCertificates);
        this.setParamArraySimple(map, prefix + "ClientCaCertificates.", this.ClientCaCertificates);
        this.setParamSimple(map, prefix + "HttpVersion", this.HttpVersion);

    }
}

