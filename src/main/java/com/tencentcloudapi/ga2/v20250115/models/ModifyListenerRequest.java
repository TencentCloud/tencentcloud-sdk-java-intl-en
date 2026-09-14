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

public class ModifyListenerRequest extends AbstractModel {

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
    * <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Description. Maximum length cannot exceed 100 bytes.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Connection idle wait time.</p><p>1. For HTTP/HTTPS listener, the supported range is 1-60. 2. For TCP listener, the supported range is 10-900. 3. For UDP listener, the supported range is 10-20.</p>
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
    * <p>Whether to enable session persistence.</p><p>Enumeration values:</p><ul><li>Open: on.</li><li>Close: off.</li></ul><p>TCP/UDP listeners support modification of this parameter.</p>
    */
    @SerializedName("ClientAffinity")
    @Expose
    private String ClientAffinity;

    /**
    * <p>Session persistence duration.</p><p>Value range: [60, 3600]</p>
    */
    @SerializedName("ClientAffinityTime")
    @Expose
    private Long ClientAffinityTime;

    /**
    * <p>Request timeout.</p><p>Value range: [1, 180]</p><p>This parameter can be modified only for HTTPS listeners.</p>
    */
    @SerializedName("RequestTimeout")
    @Expose
    private Long RequestTimeout;

    /**
    * <p>Whether to enable the layer 7 method of obtaining the client IP.</p><p>This parameter modification is supported only for HTTPS/HTTP listeners.</p>
    */
    @SerializedName("XForwardedForRealIp")
    @Expose
    private Boolean XForwardedForRealIp;

    /**
    * <p>Parsing method.</p><p>Enumeration values:</p><ul><li>UNIDIRECTIONAL: two-way.</li><li>MUTUAL: one-way.</li></ul><p>Only HTTPS/HTTP listeners support modifying this parameter.</p>
    */
    @SerializedName("CertificationType")
    @Expose
    private String CertificationType;

    /**
    * <p>Encryption algorithm kit.</p><p>Input limits: support selecting tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3'.</p><p>Only HTTPS listeners support modifying this parameter.</p>
    */
    @SerializedName("CipherPolicyId")
    @Expose
    private String CipherPolicyId;

    /**
    * <p>Server certificate.</p><p>Input limit: currently only support importing one cert; to use multiple certs, use the cert api CreateListenerAdditionalCert to add other certs.</p><p>Only HTTPS listeners support modification of this parameter.</p>
    */
    @SerializedName("ServerCertificates")
    @Expose
    private String [] ServerCertificates;

    /**
    * <p>Client certificate.</p><p>Input limitations: 1. Currently only support importing one certificate; to use multiple certificates, use the certificate api CreateListenerAdditionalCert to add other certificates. 2. The certificate must be a CA certificate.</p><p>Only HTTPS listeners support modification of this parameter, and mutual authentication must be enabled.</p>
    */
    @SerializedName("ClientCaCertificates")
    @Expose
    private String [] ClientCaCertificates;

    /**
    * <p>Method of obtaining the source IP.</p><p>Input parameter limits: support selecting 'ProxyProtocol', 'Close', 'ProxyProtocolV2', 'TOA'.</p><p>Only TCP listeners support modification of this parameter.</p>
    */
    @SerializedName("GetRealIpType")
    @Expose
    private String GetRealIpType;

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
     * Get <p>Description. Maximum length cannot exceed 100 bytes.</p> 
     * @return Description <p>Description. Maximum length cannot exceed 100 bytes.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description. Maximum length cannot exceed 100 bytes.</p>
     * @param Description <p>Description. Maximum length cannot exceed 100 bytes.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Connection idle wait time.</p><p>1. For HTTP/HTTPS listener, the supported range is 1-60. 2. For TCP listener, the supported range is 10-900. 3. For UDP listener, the supported range is 10-20.</p> 
     * @return IdleTimeout <p>Connection idle wait time.</p><p>1. For HTTP/HTTPS listener, the supported range is 1-60. 2. For TCP listener, the supported range is 10-900. 3. For UDP listener, the supported range is 10-20.</p>
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set <p>Connection idle wait time.</p><p>1. For HTTP/HTTPS listener, the supported range is 1-60. 2. For TCP listener, the supported range is 10-900. 3. For UDP listener, the supported range is 10-20.</p>
     * @param IdleTimeout <p>Connection idle wait time.</p><p>1. For HTTP/HTTPS listener, the supported range is 1-60. 2. For TCP listener, the supported range is 10-900. 3. For UDP listener, the supported range is 10-20.</p>
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    /**
     * Get <p>Whether to enable session persistence.</p><p>Enumeration values:</p><ul><li>Open: on.</li><li>Close: off.</li></ul><p>TCP/UDP listeners support modification of this parameter.</p> 
     * @return ClientAffinity <p>Whether to enable session persistence.</p><p>Enumeration values:</p><ul><li>Open: on.</li><li>Close: off.</li></ul><p>TCP/UDP listeners support modification of this parameter.</p>
     */
    public String getClientAffinity() {
        return this.ClientAffinity;
    }

    /**
     * Set <p>Whether to enable session persistence.</p><p>Enumeration values:</p><ul><li>Open: on.</li><li>Close: off.</li></ul><p>TCP/UDP listeners support modification of this parameter.</p>
     * @param ClientAffinity <p>Whether to enable session persistence.</p><p>Enumeration values:</p><ul><li>Open: on.</li><li>Close: off.</li></ul><p>TCP/UDP listeners support modification of this parameter.</p>
     */
    public void setClientAffinity(String ClientAffinity) {
        this.ClientAffinity = ClientAffinity;
    }

    /**
     * Get <p>Session persistence duration.</p><p>Value range: [60, 3600]</p> 
     * @return ClientAffinityTime <p>Session persistence duration.</p><p>Value range: [60, 3600]</p>
     */
    public Long getClientAffinityTime() {
        return this.ClientAffinityTime;
    }

    /**
     * Set <p>Session persistence duration.</p><p>Value range: [60, 3600]</p>
     * @param ClientAffinityTime <p>Session persistence duration.</p><p>Value range: [60, 3600]</p>
     */
    public void setClientAffinityTime(Long ClientAffinityTime) {
        this.ClientAffinityTime = ClientAffinityTime;
    }

    /**
     * Get <p>Request timeout.</p><p>Value range: [1, 180]</p><p>This parameter can be modified only for HTTPS listeners.</p> 
     * @return RequestTimeout <p>Request timeout.</p><p>Value range: [1, 180]</p><p>This parameter can be modified only for HTTPS listeners.</p>
     */
    public Long getRequestTimeout() {
        return this.RequestTimeout;
    }

    /**
     * Set <p>Request timeout.</p><p>Value range: [1, 180]</p><p>This parameter can be modified only for HTTPS listeners.</p>
     * @param RequestTimeout <p>Request timeout.</p><p>Value range: [1, 180]</p><p>This parameter can be modified only for HTTPS listeners.</p>
     */
    public void setRequestTimeout(Long RequestTimeout) {
        this.RequestTimeout = RequestTimeout;
    }

    /**
     * Get <p>Whether to enable the layer 7 method of obtaining the client IP.</p><p>This parameter modification is supported only for HTTPS/HTTP listeners.</p> 
     * @return XForwardedForRealIp <p>Whether to enable the layer 7 method of obtaining the client IP.</p><p>This parameter modification is supported only for HTTPS/HTTP listeners.</p>
     */
    public Boolean getXForwardedForRealIp() {
        return this.XForwardedForRealIp;
    }

    /**
     * Set <p>Whether to enable the layer 7 method of obtaining the client IP.</p><p>This parameter modification is supported only for HTTPS/HTTP listeners.</p>
     * @param XForwardedForRealIp <p>Whether to enable the layer 7 method of obtaining the client IP.</p><p>This parameter modification is supported only for HTTPS/HTTP listeners.</p>
     */
    public void setXForwardedForRealIp(Boolean XForwardedForRealIp) {
        this.XForwardedForRealIp = XForwardedForRealIp;
    }

    /**
     * Get <p>Parsing method.</p><p>Enumeration values:</p><ul><li>UNIDIRECTIONAL: two-way.</li><li>MUTUAL: one-way.</li></ul><p>Only HTTPS/HTTP listeners support modifying this parameter.</p> 
     * @return CertificationType <p>Parsing method.</p><p>Enumeration values:</p><ul><li>UNIDIRECTIONAL: two-way.</li><li>MUTUAL: one-way.</li></ul><p>Only HTTPS/HTTP listeners support modifying this parameter.</p>
     */
    public String getCertificationType() {
        return this.CertificationType;
    }

    /**
     * Set <p>Parsing method.</p><p>Enumeration values:</p><ul><li>UNIDIRECTIONAL: two-way.</li><li>MUTUAL: one-way.</li></ul><p>Only HTTPS/HTTP listeners support modifying this parameter.</p>
     * @param CertificationType <p>Parsing method.</p><p>Enumeration values:</p><ul><li>UNIDIRECTIONAL: two-way.</li><li>MUTUAL: one-way.</li></ul><p>Only HTTPS/HTTP listeners support modifying this parameter.</p>
     */
    public void setCertificationType(String CertificationType) {
        this.CertificationType = CertificationType;
    }

    /**
     * Get <p>Encryption algorithm kit.</p><p>Input limits: support selecting tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3'.</p><p>Only HTTPS listeners support modifying this parameter.</p> 
     * @return CipherPolicyId <p>Encryption algorithm kit.</p><p>Input limits: support selecting tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3'.</p><p>Only HTTPS listeners support modifying this parameter.</p>
     */
    public String getCipherPolicyId() {
        return this.CipherPolicyId;
    }

    /**
     * Set <p>Encryption algorithm kit.</p><p>Input limits: support selecting tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3'.</p><p>Only HTTPS listeners support modifying this parameter.</p>
     * @param CipherPolicyId <p>Encryption algorithm kit.</p><p>Input limits: support selecting tls_policy_1.0-2', 'tls_policy_1.1-2', 'tls_policy_1.2', 'tls_policy_1.2_strict', 'tls_policy_1.2_strict-1.3'.</p><p>Only HTTPS listeners support modifying this parameter.</p>
     */
    public void setCipherPolicyId(String CipherPolicyId) {
        this.CipherPolicyId = CipherPolicyId;
    }

    /**
     * Get <p>Server certificate.</p><p>Input limit: currently only support importing one cert; to use multiple certs, use the cert api CreateListenerAdditionalCert to add other certs.</p><p>Only HTTPS listeners support modification of this parameter.</p> 
     * @return ServerCertificates <p>Server certificate.</p><p>Input limit: currently only support importing one cert; to use multiple certs, use the cert api CreateListenerAdditionalCert to add other certs.</p><p>Only HTTPS listeners support modification of this parameter.</p>
     */
    public String [] getServerCertificates() {
        return this.ServerCertificates;
    }

    /**
     * Set <p>Server certificate.</p><p>Input limit: currently only support importing one cert; to use multiple certs, use the cert api CreateListenerAdditionalCert to add other certs.</p><p>Only HTTPS listeners support modification of this parameter.</p>
     * @param ServerCertificates <p>Server certificate.</p><p>Input limit: currently only support importing one cert; to use multiple certs, use the cert api CreateListenerAdditionalCert to add other certs.</p><p>Only HTTPS listeners support modification of this parameter.</p>
     */
    public void setServerCertificates(String [] ServerCertificates) {
        this.ServerCertificates = ServerCertificates;
    }

    /**
     * Get <p>Client certificate.</p><p>Input limitations: 1. Currently only support importing one certificate; to use multiple certificates, use the certificate api CreateListenerAdditionalCert to add other certificates. 2. The certificate must be a CA certificate.</p><p>Only HTTPS listeners support modification of this parameter, and mutual authentication must be enabled.</p> 
     * @return ClientCaCertificates <p>Client certificate.</p><p>Input limitations: 1. Currently only support importing one certificate; to use multiple certificates, use the certificate api CreateListenerAdditionalCert to add other certificates. 2. The certificate must be a CA certificate.</p><p>Only HTTPS listeners support modification of this parameter, and mutual authentication must be enabled.</p>
     */
    public String [] getClientCaCertificates() {
        return this.ClientCaCertificates;
    }

    /**
     * Set <p>Client certificate.</p><p>Input limitations: 1. Currently only support importing one certificate; to use multiple certificates, use the certificate api CreateListenerAdditionalCert to add other certificates. 2. The certificate must be a CA certificate.</p><p>Only HTTPS listeners support modification of this parameter, and mutual authentication must be enabled.</p>
     * @param ClientCaCertificates <p>Client certificate.</p><p>Input limitations: 1. Currently only support importing one certificate; to use multiple certificates, use the certificate api CreateListenerAdditionalCert to add other certificates. 2. The certificate must be a CA certificate.</p><p>Only HTTPS listeners support modification of this parameter, and mutual authentication must be enabled.</p>
     */
    public void setClientCaCertificates(String [] ClientCaCertificates) {
        this.ClientCaCertificates = ClientCaCertificates;
    }

    /**
     * Get <p>Method of obtaining the source IP.</p><p>Input parameter limits: support selecting 'ProxyProtocol', 'Close', 'ProxyProtocolV2', 'TOA'.</p><p>Only TCP listeners support modification of this parameter.</p> 
     * @return GetRealIpType <p>Method of obtaining the source IP.</p><p>Input parameter limits: support selecting 'ProxyProtocol', 'Close', 'ProxyProtocolV2', 'TOA'.</p><p>Only TCP listeners support modification of this parameter.</p>
     */
    public String getGetRealIpType() {
        return this.GetRealIpType;
    }

    /**
     * Set <p>Method of obtaining the source IP.</p><p>Input parameter limits: support selecting 'ProxyProtocol', 'Close', 'ProxyProtocolV2', 'TOA'.</p><p>Only TCP listeners support modification of this parameter.</p>
     * @param GetRealIpType <p>Method of obtaining the source IP.</p><p>Input parameter limits: support selecting 'ProxyProtocol', 'Close', 'ProxyProtocolV2', 'TOA'.</p><p>Only TCP listeners support modification of this parameter.</p>
     */
    public void setGetRealIpType(String GetRealIpType) {
        this.GetRealIpType = GetRealIpType;
    }

    public ModifyListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyListenerRequest(ModifyListenerRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IdleTimeout != null) {
            this.IdleTimeout = new Long(source.IdleTimeout);
        }
        if (source.ClientAffinity != null) {
            this.ClientAffinity = new String(source.ClientAffinity);
        }
        if (source.ClientAffinityTime != null) {
            this.ClientAffinityTime = new Long(source.ClientAffinityTime);
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
        if (source.GetRealIpType != null) {
            this.GetRealIpType = new String(source.GetRealIpType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);
        this.setParamSimple(map, prefix + "ClientAffinity", this.ClientAffinity);
        this.setParamSimple(map, prefix + "ClientAffinityTime", this.ClientAffinityTime);
        this.setParamSimple(map, prefix + "RequestTimeout", this.RequestTimeout);
        this.setParamSimple(map, prefix + "XForwardedForRealIp", this.XForwardedForRealIp);
        this.setParamSimple(map, prefix + "CertificationType", this.CertificationType);
        this.setParamSimple(map, prefix + "CipherPolicyId", this.CipherPolicyId);
        this.setParamArraySimple(map, prefix + "ServerCertificates.", this.ServerCertificates);
        this.setParamArraySimple(map, prefix + "ClientCaCertificates.", this.ClientCaCertificates);
        this.setParamSimple(map, prefix + "GetRealIpType", this.GetRealIpType);

    }
}

