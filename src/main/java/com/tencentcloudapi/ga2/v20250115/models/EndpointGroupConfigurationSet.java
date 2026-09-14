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

public class EndpointGroupConfigurationSet extends AbstractModel {

    /**
    * <p>Global acceleration instance ID.</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>Listener instance ID.</p>
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
    * <p>Name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Region.</p>
    */
    @SerializedName("EndpointGroupRegion")
    @Expose
    private String EndpointGroupRegion;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Endpoint information.</p>
    */
    @SerializedName("EndpointConfigurations")
    @Expose
    private EndpointConfigurations [] EndpointConfigurations;

    /**
    * <p>Whether to enable health check.</p>
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * <p>Response timeout.</p>
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * <p>Health check interval.</p>
    */
    @SerializedName("HealthCheckInterval")
    @Expose
    private Long HealthCheckInterval;

    /**
    * <p>Unhealthy threshold.</p>
    */
    @SerializedName("UnhealthyThreshold")
    @Expose
    private Long UnhealthyThreshold;

    /**
    * <p>Health threshold.</p>
    */
    @SerializedName("HealthyThreshold")
    @Expose
    private Long HealthyThreshold;

    /**
    * <p>Select the protocol.</p>
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * <p>Check port.</p>
    */
    @SerializedName("CheckPort")
    @Expose
    private Long CheckPort;

    /**
    * <p>Check content.</p>
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * <p>Check request.</p>
    */
    @SerializedName("CheckSendContext")
    @Expose
    private String CheckSendContext;

    /**
    * <p>Check returned results.</p>
    */
    @SerializedName("CheckRecvContext")
    @Expose
    private String CheckRecvContext;

    /**
    * <p>Check domain name.</p>
    */
    @SerializedName("CheckDomain")
    @Expose
    private String CheckDomain;

    /**
    * <p>Check the URL.</p>
    */
    @SerializedName("CheckPath")
    @Expose
    private String CheckPath;

    /**
    * <p>Request method.</p>
    */
    @SerializedName("CheckMethod")
    @Expose
    private String CheckMethod;

    /**
    * <p>Status check code.</p>
    */
    @SerializedName("StatusMask")
    @Expose
    private String [] StatusMask;

    /**
    * <p>Terminal node group type.</p>
    */
    @SerializedName("EndpointGroupType")
    @Expose
    private String EndpointGroupType;

    /**
    * <p>Origin-pull protocol.</p>
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * <p>Port mapping info.</p>
    */
    @SerializedName("PortOverrides")
    @Expose
    private PortOverride [] PortOverrides;

    /**
    * <p>Whether the custom endpoint group is bound to a Layer 7 forwarding rule.</p>
    */
    @SerializedName("VirtualExistForwardingRuleFlag")
    @Expose
    private Boolean VirtualExistForwardingRuleFlag;

    /**
    * <p>Public IP address of the egress terminal node group.</p>
    */
    @SerializedName("OriginPublicIps")
    @Expose
    private String [] OriginPublicIps;

    /**
    * <p>Operator type. China Mobile (CMCC), China Unicom (CUCC), China Telecom (CTCC).</p>
    */
    @SerializedName("IspType")
    @Expose
    private String IspType;

    /**
    * <p>HPPTS encryption algorithm kit</p>
    */
    @SerializedName("CipherPolicyId")
    @Expose
    private String CipherPolicyId;

    /**
    * <p>Only the HTTPS back-to-source protocol supports selecting ['HTTP/1.1', 'HTTP/2']</p><p>Enumeration values:</p><ul><li>HTTP/1.1: Version HTTP/1.1</li><li>HTTP/2: Version HTTP/2</li></ul>
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
     * Get <p>Listener instance ID.</p> 
     * @return ListenerId <p>Listener instance ID.</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>Listener instance ID.</p>
     * @param ListenerId <p>Listener instance ID.</p>
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
     * Get <p>Name.</p> 
     * @return Name <p>Name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Name.</p>
     * @param Name <p>Name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Region.</p> 
     * @return EndpointGroupRegion <p>Region.</p>
     */
    public String getEndpointGroupRegion() {
        return this.EndpointGroupRegion;
    }

    /**
     * Set <p>Region.</p>
     * @param EndpointGroupRegion <p>Region.</p>
     */
    public void setEndpointGroupRegion(String EndpointGroupRegion) {
        this.EndpointGroupRegion = EndpointGroupRegion;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Endpoint information.</p> 
     * @return EndpointConfigurations <p>Endpoint information.</p>
     */
    public EndpointConfigurations [] getEndpointConfigurations() {
        return this.EndpointConfigurations;
    }

    /**
     * Set <p>Endpoint information.</p>
     * @param EndpointConfigurations <p>Endpoint information.</p>
     */
    public void setEndpointConfigurations(EndpointConfigurations [] EndpointConfigurations) {
        this.EndpointConfigurations = EndpointConfigurations;
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
     * Get <p>Response timeout.</p> 
     * @return ConnectTimeout <p>Response timeout.</p>
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set <p>Response timeout.</p>
     * @param ConnectTimeout <p>Response timeout.</p>
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get <p>Health check interval.</p> 
     * @return HealthCheckInterval <p>Health check interval.</p>
     */
    public Long getHealthCheckInterval() {
        return this.HealthCheckInterval;
    }

    /**
     * Set <p>Health check interval.</p>
     * @param HealthCheckInterval <p>Health check interval.</p>
     */
    public void setHealthCheckInterval(Long HealthCheckInterval) {
        this.HealthCheckInterval = HealthCheckInterval;
    }

    /**
     * Get <p>Unhealthy threshold.</p> 
     * @return UnhealthyThreshold <p>Unhealthy threshold.</p>
     */
    public Long getUnhealthyThreshold() {
        return this.UnhealthyThreshold;
    }

    /**
     * Set <p>Unhealthy threshold.</p>
     * @param UnhealthyThreshold <p>Unhealthy threshold.</p>
     */
    public void setUnhealthyThreshold(Long UnhealthyThreshold) {
        this.UnhealthyThreshold = UnhealthyThreshold;
    }

    /**
     * Get <p>Health threshold.</p> 
     * @return HealthyThreshold <p>Health threshold.</p>
     */
    public Long getHealthyThreshold() {
        return this.HealthyThreshold;
    }

    /**
     * Set <p>Health threshold.</p>
     * @param HealthyThreshold <p>Health threshold.</p>
     */
    public void setHealthyThreshold(Long HealthyThreshold) {
        this.HealthyThreshold = HealthyThreshold;
    }

    /**
     * Get <p>Select the protocol.</p> 
     * @return CheckType <p>Select the protocol.</p>
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set <p>Select the protocol.</p>
     * @param CheckType <p>Select the protocol.</p>
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get <p>Check port.</p> 
     * @return CheckPort <p>Check port.</p>
     */
    public Long getCheckPort() {
        return this.CheckPort;
    }

    /**
     * Set <p>Check port.</p>
     * @param CheckPort <p>Check port.</p>
     */
    public void setCheckPort(Long CheckPort) {
        this.CheckPort = CheckPort;
    }

    /**
     * Get <p>Check content.</p> 
     * @return ContextType <p>Check content.</p>
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set <p>Check content.</p>
     * @param ContextType <p>Check content.</p>
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get <p>Check request.</p> 
     * @return CheckSendContext <p>Check request.</p>
     */
    public String getCheckSendContext() {
        return this.CheckSendContext;
    }

    /**
     * Set <p>Check request.</p>
     * @param CheckSendContext <p>Check request.</p>
     */
    public void setCheckSendContext(String CheckSendContext) {
        this.CheckSendContext = CheckSendContext;
    }

    /**
     * Get <p>Check returned results.</p> 
     * @return CheckRecvContext <p>Check returned results.</p>
     */
    public String getCheckRecvContext() {
        return this.CheckRecvContext;
    }

    /**
     * Set <p>Check returned results.</p>
     * @param CheckRecvContext <p>Check returned results.</p>
     */
    public void setCheckRecvContext(String CheckRecvContext) {
        this.CheckRecvContext = CheckRecvContext;
    }

    /**
     * Get <p>Check domain name.</p> 
     * @return CheckDomain <p>Check domain name.</p>
     */
    public String getCheckDomain() {
        return this.CheckDomain;
    }

    /**
     * Set <p>Check domain name.</p>
     * @param CheckDomain <p>Check domain name.</p>
     */
    public void setCheckDomain(String CheckDomain) {
        this.CheckDomain = CheckDomain;
    }

    /**
     * Get <p>Check the URL.</p> 
     * @return CheckPath <p>Check the URL.</p>
     */
    public String getCheckPath() {
        return this.CheckPath;
    }

    /**
     * Set <p>Check the URL.</p>
     * @param CheckPath <p>Check the URL.</p>
     */
    public void setCheckPath(String CheckPath) {
        this.CheckPath = CheckPath;
    }

    /**
     * Get <p>Request method.</p> 
     * @return CheckMethod <p>Request method.</p>
     */
    public String getCheckMethod() {
        return this.CheckMethod;
    }

    /**
     * Set <p>Request method.</p>
     * @param CheckMethod <p>Request method.</p>
     */
    public void setCheckMethod(String CheckMethod) {
        this.CheckMethod = CheckMethod;
    }

    /**
     * Get <p>Status check code.</p> 
     * @return StatusMask <p>Status check code.</p>
     */
    public String [] getStatusMask() {
        return this.StatusMask;
    }

    /**
     * Set <p>Status check code.</p>
     * @param StatusMask <p>Status check code.</p>
     */
    public void setStatusMask(String [] StatusMask) {
        this.StatusMask = StatusMask;
    }

    /**
     * Get <p>Terminal node group type.</p> 
     * @return EndpointGroupType <p>Terminal node group type.</p>
     */
    public String getEndpointGroupType() {
        return this.EndpointGroupType;
    }

    /**
     * Set <p>Terminal node group type.</p>
     * @param EndpointGroupType <p>Terminal node group type.</p>
     */
    public void setEndpointGroupType(String EndpointGroupType) {
        this.EndpointGroupType = EndpointGroupType;
    }

    /**
     * Get <p>Origin-pull protocol.</p> 
     * @return ForwardProtocol <p>Origin-pull protocol.</p>
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set <p>Origin-pull protocol.</p>
     * @param ForwardProtocol <p>Origin-pull protocol.</p>
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get <p>Port mapping info.</p> 
     * @return PortOverrides <p>Port mapping info.</p>
     */
    public PortOverride [] getPortOverrides() {
        return this.PortOverrides;
    }

    /**
     * Set <p>Port mapping info.</p>
     * @param PortOverrides <p>Port mapping info.</p>
     */
    public void setPortOverrides(PortOverride [] PortOverrides) {
        this.PortOverrides = PortOverrides;
    }

    /**
     * Get <p>Whether the custom endpoint group is bound to a Layer 7 forwarding rule.</p> 
     * @return VirtualExistForwardingRuleFlag <p>Whether the custom endpoint group is bound to a Layer 7 forwarding rule.</p>
     */
    public Boolean getVirtualExistForwardingRuleFlag() {
        return this.VirtualExistForwardingRuleFlag;
    }

    /**
     * Set <p>Whether the custom endpoint group is bound to a Layer 7 forwarding rule.</p>
     * @param VirtualExistForwardingRuleFlag <p>Whether the custom endpoint group is bound to a Layer 7 forwarding rule.</p>
     */
    public void setVirtualExistForwardingRuleFlag(Boolean VirtualExistForwardingRuleFlag) {
        this.VirtualExistForwardingRuleFlag = VirtualExistForwardingRuleFlag;
    }

    /**
     * Get <p>Public IP address of the egress terminal node group.</p> 
     * @return OriginPublicIps <p>Public IP address of the egress terminal node group.</p>
     */
    public String [] getOriginPublicIps() {
        return this.OriginPublicIps;
    }

    /**
     * Set <p>Public IP address of the egress terminal node group.</p>
     * @param OriginPublicIps <p>Public IP address of the egress terminal node group.</p>
     */
    public void setOriginPublicIps(String [] OriginPublicIps) {
        this.OriginPublicIps = OriginPublicIps;
    }

    /**
     * Get <p>Operator type. China Mobile (CMCC), China Unicom (CUCC), China Telecom (CTCC).</p> 
     * @return IspType <p>Operator type. China Mobile (CMCC), China Unicom (CUCC), China Telecom (CTCC).</p>
     */
    public String getIspType() {
        return this.IspType;
    }

    /**
     * Set <p>Operator type. China Mobile (CMCC), China Unicom (CUCC), China Telecom (CTCC).</p>
     * @param IspType <p>Operator type. China Mobile (CMCC), China Unicom (CUCC), China Telecom (CTCC).</p>
     */
    public void setIspType(String IspType) {
        this.IspType = IspType;
    }

    /**
     * Get <p>HPPTS encryption algorithm kit</p> 
     * @return CipherPolicyId <p>HPPTS encryption algorithm kit</p>
     */
    public String getCipherPolicyId() {
        return this.CipherPolicyId;
    }

    /**
     * Set <p>HPPTS encryption algorithm kit</p>
     * @param CipherPolicyId <p>HPPTS encryption algorithm kit</p>
     */
    public void setCipherPolicyId(String CipherPolicyId) {
        this.CipherPolicyId = CipherPolicyId;
    }

    /**
     * Get <p>Only the HTTPS back-to-source protocol supports selecting ['HTTP/1.1', 'HTTP/2']</p><p>Enumeration values:</p><ul><li>HTTP/1.1: Version HTTP/1.1</li><li>HTTP/2: Version HTTP/2</li></ul> 
     * @return HttpVersion <p>Only the HTTPS back-to-source protocol supports selecting ['HTTP/1.1', 'HTTP/2']</p><p>Enumeration values:</p><ul><li>HTTP/1.1: Version HTTP/1.1</li><li>HTTP/2: Version HTTP/2</li></ul>
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set <p>Only the HTTPS back-to-source protocol supports selecting ['HTTP/1.1', 'HTTP/2']</p><p>Enumeration values:</p><ul><li>HTTP/1.1: Version HTTP/1.1</li><li>HTTP/2: Version HTTP/2</li></ul>
     * @param HttpVersion <p>Only the HTTPS back-to-source protocol supports selecting ['HTTP/1.1', 'HTTP/2']</p><p>Enumeration values:</p><ul><li>HTTP/1.1: Version HTTP/1.1</li><li>HTTP/2: Version HTTP/2</li></ul>
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    public EndpointGroupConfigurationSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndpointGroupConfigurationSet(EndpointGroupConfigurationSet source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.EndpointGroupId != null) {
            this.EndpointGroupId = new String(source.EndpointGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EndpointGroupRegion != null) {
            this.EndpointGroupRegion = new String(source.EndpointGroupRegion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EndpointConfigurations != null) {
            this.EndpointConfigurations = new EndpointConfigurations[source.EndpointConfigurations.length];
            for (int i = 0; i < source.EndpointConfigurations.length; i++) {
                this.EndpointConfigurations[i] = new EndpointConfigurations(source.EndpointConfigurations[i]);
            }
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
        if (source.EndpointGroupType != null) {
            this.EndpointGroupType = new String(source.EndpointGroupType);
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
        if (source.VirtualExistForwardingRuleFlag != null) {
            this.VirtualExistForwardingRuleFlag = new Boolean(source.VirtualExistForwardingRuleFlag);
        }
        if (source.OriginPublicIps != null) {
            this.OriginPublicIps = new String[source.OriginPublicIps.length];
            for (int i = 0; i < source.OriginPublicIps.length; i++) {
                this.OriginPublicIps[i] = new String(source.OriginPublicIps[i]);
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
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "EndpointGroupId", this.EndpointGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EndpointGroupRegion", this.EndpointGroupRegion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "EndpointConfigurations.", this.EndpointConfigurations);
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
        this.setParamSimple(map, prefix + "EndpointGroupType", this.EndpointGroupType);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamArrayObj(map, prefix + "PortOverrides.", this.PortOverrides);
        this.setParamSimple(map, prefix + "VirtualExistForwardingRuleFlag", this.VirtualExistForwardingRuleFlag);
        this.setParamArraySimple(map, prefix + "OriginPublicIps.", this.OriginPublicIps);
        this.setParamSimple(map, prefix + "IspType", this.IspType);
        this.setParamSimple(map, prefix + "CipherPolicyId", this.CipherPolicyId);
        this.setParamSimple(map, prefix + "HttpVersion", this.HttpVersion);

    }
}

