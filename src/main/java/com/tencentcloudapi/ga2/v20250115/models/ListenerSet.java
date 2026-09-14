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

public class ListenerSet extends AbstractModel {

    /**
    * Global acceleration instance ID.
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * Listener ID.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Listener name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Listener description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Protocol.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Port range.
    */
    @SerializedName("PortRanges")
    @Expose
    private PortRanges PortRanges;

    /**
    * Whether to enable layer-7 access to source IP mode.
    */
    @SerializedName("XForwardedForRealIp")
    @Expose
    private Boolean XForwardedForRealIp;

    /**
    * Enable session persistence.
    */
    @SerializedName("ClientAffinity")
    @Expose
    private String ClientAffinity;

    /**
    * Session persistence time.
    */
    @SerializedName("ClientAffinityTime")
    @Expose
    private Long ClientAffinityTime;

    /**
    * SSL decryption method.
    */
    @SerializedName("CertificationType")
    @Expose
    private String CertificationType;

    /**
    * Server certificate.
    */
    @SerializedName("ServerCertificates")
    @Expose
    private String [] ServerCertificates;

    /**
    * Client certificate.
    */
    @SerializedName("ClientCaCertificates")
    @Expose
    private String [] ClientCaCertificates;

    /**
    * TLS password suite package.
    */
    @SerializedName("CipherPolicyId")
    @Expose
    private String CipherPolicyId;

    /**
    * HTTP version.
    */
    @SerializedName("HttpVersion")
    @Expose
    private String HttpVersion;

    /**
    * Request timeout.
    */
    @SerializedName("RequestTimeout")
    @Expose
    private Long RequestTimeout;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Listener routing type.
    */
    @SerializedName("ListenerType")
    @Expose
    private String ListenerType;

    /**
    * Listener status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Number of terminal node groups belonging to the listener.
    */
    @SerializedName("EndpointGroupCounts")
    @Expose
    private Long EndpointGroupCounts;

    /**
    * Method for obtaining the source IP at Layer 4.
    */
    @SerializedName("GetRealIpType")
    @Expose
    private String GetRealIpType;

    /**
    * Connection timeout.
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
     * Get Global acceleration instance ID. 
     * @return GlobalAcceleratorId Global acceleration instance ID.
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set Global acceleration instance ID.
     * @param GlobalAcceleratorId Global acceleration instance ID.
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get Listener ID. 
     * @return ListenerId Listener ID.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID.
     * @param ListenerId Listener ID.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Listener name. 
     * @return Name Listener name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Listener name.
     * @param Name Listener name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Listener description. 
     * @return Description Listener description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Listener description.
     * @param Description Listener description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Protocol. 
     * @return Protocol Protocol.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol.
     * @param Protocol Protocol.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Port range. 
     * @return PortRanges Port range.
     */
    public PortRanges getPortRanges() {
        return this.PortRanges;
    }

    /**
     * Set Port range.
     * @param PortRanges Port range.
     */
    public void setPortRanges(PortRanges PortRanges) {
        this.PortRanges = PortRanges;
    }

    /**
     * Get Whether to enable layer-7 access to source IP mode. 
     * @return XForwardedForRealIp Whether to enable layer-7 access to source IP mode.
     */
    public Boolean getXForwardedForRealIp() {
        return this.XForwardedForRealIp;
    }

    /**
     * Set Whether to enable layer-7 access to source IP mode.
     * @param XForwardedForRealIp Whether to enable layer-7 access to source IP mode.
     */
    public void setXForwardedForRealIp(Boolean XForwardedForRealIp) {
        this.XForwardedForRealIp = XForwardedForRealIp;
    }

    /**
     * Get Enable session persistence. 
     * @return ClientAffinity Enable session persistence.
     */
    public String getClientAffinity() {
        return this.ClientAffinity;
    }

    /**
     * Set Enable session persistence.
     * @param ClientAffinity Enable session persistence.
     */
    public void setClientAffinity(String ClientAffinity) {
        this.ClientAffinity = ClientAffinity;
    }

    /**
     * Get Session persistence time. 
     * @return ClientAffinityTime Session persistence time.
     */
    public Long getClientAffinityTime() {
        return this.ClientAffinityTime;
    }

    /**
     * Set Session persistence time.
     * @param ClientAffinityTime Session persistence time.
     */
    public void setClientAffinityTime(Long ClientAffinityTime) {
        this.ClientAffinityTime = ClientAffinityTime;
    }

    /**
     * Get SSL decryption method. 
     * @return CertificationType SSL decryption method.
     */
    public String getCertificationType() {
        return this.CertificationType;
    }

    /**
     * Set SSL decryption method.
     * @param CertificationType SSL decryption method.
     */
    public void setCertificationType(String CertificationType) {
        this.CertificationType = CertificationType;
    }

    /**
     * Get Server certificate. 
     * @return ServerCertificates Server certificate.
     */
    public String [] getServerCertificates() {
        return this.ServerCertificates;
    }

    /**
     * Set Server certificate.
     * @param ServerCertificates Server certificate.
     */
    public void setServerCertificates(String [] ServerCertificates) {
        this.ServerCertificates = ServerCertificates;
    }

    /**
     * Get Client certificate. 
     * @return ClientCaCertificates Client certificate.
     */
    public String [] getClientCaCertificates() {
        return this.ClientCaCertificates;
    }

    /**
     * Set Client certificate.
     * @param ClientCaCertificates Client certificate.
     */
    public void setClientCaCertificates(String [] ClientCaCertificates) {
        this.ClientCaCertificates = ClientCaCertificates;
    }

    /**
     * Get TLS password suite package. 
     * @return CipherPolicyId TLS password suite package.
     */
    public String getCipherPolicyId() {
        return this.CipherPolicyId;
    }

    /**
     * Set TLS password suite package.
     * @param CipherPolicyId TLS password suite package.
     */
    public void setCipherPolicyId(String CipherPolicyId) {
        this.CipherPolicyId = CipherPolicyId;
    }

    /**
     * Get HTTP version. 
     * @return HttpVersion HTTP version.
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set HTTP version.
     * @param HttpVersion HTTP version.
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    /**
     * Get Request timeout. 
     * @return RequestTimeout Request timeout.
     */
    public Long getRequestTimeout() {
        return this.RequestTimeout;
    }

    /**
     * Set Request timeout.
     * @param RequestTimeout Request timeout.
     */
    public void setRequestTimeout(Long RequestTimeout) {
        this.RequestTimeout = RequestTimeout;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Listener routing type. 
     * @return ListenerType Listener routing type.
     */
    public String getListenerType() {
        return this.ListenerType;
    }

    /**
     * Set Listener routing type.
     * @param ListenerType Listener routing type.
     */
    public void setListenerType(String ListenerType) {
        this.ListenerType = ListenerType;
    }

    /**
     * Get Listener status. 
     * @return Status Listener status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Listener status.
     * @param Status Listener status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Number of terminal node groups belonging to the listener. 
     * @return EndpointGroupCounts Number of terminal node groups belonging to the listener.
     */
    public Long getEndpointGroupCounts() {
        return this.EndpointGroupCounts;
    }

    /**
     * Set Number of terminal node groups belonging to the listener.
     * @param EndpointGroupCounts Number of terminal node groups belonging to the listener.
     */
    public void setEndpointGroupCounts(Long EndpointGroupCounts) {
        this.EndpointGroupCounts = EndpointGroupCounts;
    }

    /**
     * Get Method for obtaining the source IP at Layer 4. 
     * @return GetRealIpType Method for obtaining the source IP at Layer 4.
     */
    public String getGetRealIpType() {
        return this.GetRealIpType;
    }

    /**
     * Set Method for obtaining the source IP at Layer 4.
     * @param GetRealIpType Method for obtaining the source IP at Layer 4.
     */
    public void setGetRealIpType(String GetRealIpType) {
        this.GetRealIpType = GetRealIpType;
    }

    /**
     * Get Connection timeout. 
     * @return IdleTimeout Connection timeout.
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set Connection timeout.
     * @param IdleTimeout Connection timeout.
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    public ListenerSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListenerSet(ListenerSet source) {
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
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.PortRanges != null) {
            this.PortRanges = new PortRanges(source.PortRanges);
        }
        if (source.XForwardedForRealIp != null) {
            this.XForwardedForRealIp = new Boolean(source.XForwardedForRealIp);
        }
        if (source.ClientAffinity != null) {
            this.ClientAffinity = new String(source.ClientAffinity);
        }
        if (source.ClientAffinityTime != null) {
            this.ClientAffinityTime = new Long(source.ClientAffinityTime);
        }
        if (source.CertificationType != null) {
            this.CertificationType = new String(source.CertificationType);
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
        if (source.CipherPolicyId != null) {
            this.CipherPolicyId = new String(source.CipherPolicyId);
        }
        if (source.HttpVersion != null) {
            this.HttpVersion = new String(source.HttpVersion);
        }
        if (source.RequestTimeout != null) {
            this.RequestTimeout = new Long(source.RequestTimeout);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ListenerType != null) {
            this.ListenerType = new String(source.ListenerType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EndpointGroupCounts != null) {
            this.EndpointGroupCounts = new Long(source.EndpointGroupCounts);
        }
        if (source.GetRealIpType != null) {
            this.GetRealIpType = new String(source.GetRealIpType);
        }
        if (source.IdleTimeout != null) {
            this.IdleTimeout = new Long(source.IdleTimeout);
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
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "PortRanges.", this.PortRanges);
        this.setParamSimple(map, prefix + "XForwardedForRealIp", this.XForwardedForRealIp);
        this.setParamSimple(map, prefix + "ClientAffinity", this.ClientAffinity);
        this.setParamSimple(map, prefix + "ClientAffinityTime", this.ClientAffinityTime);
        this.setParamSimple(map, prefix + "CertificationType", this.CertificationType);
        this.setParamArraySimple(map, prefix + "ServerCertificates.", this.ServerCertificates);
        this.setParamArraySimple(map, prefix + "ClientCaCertificates.", this.ClientCaCertificates);
        this.setParamSimple(map, prefix + "CipherPolicyId", this.CipherPolicyId);
        this.setParamSimple(map, prefix + "HttpVersion", this.HttpVersion);
        this.setParamSimple(map, prefix + "RequestTimeout", this.RequestTimeout);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ListenerType", this.ListenerType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EndpointGroupCounts", this.EndpointGroupCounts);
        this.setParamSimple(map, prefix + "GetRealIpType", this.GetRealIpType);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);

    }
}

