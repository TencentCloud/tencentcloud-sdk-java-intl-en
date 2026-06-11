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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RaspLicenseList extends AbstractModel {

    /**
    * Machine unique ID
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Public IP address
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * Private IP address
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * Cloud Tag Information
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * Version information
-Prioritized Protection package
-Container Security - Pro Edition
-CWP - Flagship Edition
    */
    @SerializedName("ProtectionVersion")
    @Expose
    private String [] ProtectionVersion;

    /**
    * Protection setting
-0 unconfigured
-Configured
    */
    @SerializedName("ConfigurationSetting")
    @Expose
    private Long ConfigurationSetting;

    /**
    * Master switch
-0 Not enabled
- 1: enabled.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Vulnerability defense switch
-0 Not enabled
- 1: enabled.
    */
    @SerializedName("VulDefEnable")
    @Expose
    private Long VulDefEnable;

    /**
    * Vulnerability defense mode
-0 Standard
-1. Major Event Support
    */
    @SerializedName("VulDefMode")
    @Expose
    private Long VulDefMode;

    /**
    * Vulnerability defense action
-0 Detect only
-Detect + defend
    */
    @SerializedName("VulDefAction")
    @Expose
    private Long VulDefAction;

    /**
    * Java Webshell Defense switch
-0 Not enabled
- 1: enabled.
    */
    @SerializedName("MemShellDefEnable")
    @Expose
    private Long MemShellDefEnable;

    /**
    * More protection
-0 Do not inject processes that will restart 
-Inject a process that will restart
    */
    @SerializedName("SafeInject")
    @Expose
    private Long SafeInject;

    /**
    * Performance threshold configuration switch
-0 Not enabled
- 1: enabled.
    */
    @SerializedName("PerformanceLimit")
    @Expose
    private Long PerformanceLimit;

    /**
    * CPU threshold, Value 1-99
    */
    @SerializedName("PerformanceLimitCpu")
    @Expose
    private Long PerformanceLimitCpu;

    /**
    * Memory threshold, value 1-99
    */
    @SerializedName("PerformanceLimitMem")
    @Expose
    private Long PerformanceLimitMem;

    /**
    * Memory remaining threshold
    */
    @SerializedName("PerformanceLimitMemAmount")
    @Expose
    private Long PerformanceLimitMemAmount;

    /**
    * Plug-in status
-0 Use normally
-1: Existence of anomalies
-2 inactive
    */
    @SerializedName("RaspException")
    @Expose
    private Long RaspException;

    /**
    * Latest update time
    */
    @SerializedName("LatestUpdateTime")
    @Expose
    private String LatestUpdateTime;

    /**
    * Cluster ID, only valid for container assets
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster name, only container assets have values
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Order information
    */
    @SerializedName("OrderDetail")
    @Expose
    private OrderDetail OrderDetail;

    /**
    * Whether unbinding is allowed: false - not allowed, true - allowed.
    */
    @SerializedName("IsUnBind")
    @Expose
    private Boolean IsUnBind;

    /**
    * uuid. Unique ID of the machine. Only valid when AssetType = CWP.
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * No injection/Failure reason of injection
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get Machine unique ID 
     * @return QUUID Machine unique ID
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set Machine unique ID
     * @param QUUID Machine unique ID
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Public IP address 
     * @return PublicIP Public IP address
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set Public IP address
     * @param PublicIP Public IP address
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get Private IP address 
     * @return PrivateIP Private IP address
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set Private IP address
     * @param PrivateIP Private IP address
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get Cloud Tag Information 
     * @return Tags Cloud Tag Information
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Cloud Tag Information
     * @param Tags Cloud Tag Information
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Version information
-Prioritized Protection package
-Container Security - Pro Edition
-CWP - Flagship Edition 
     * @return ProtectionVersion Version information
-Prioritized Protection package
-Container Security - Pro Edition
-CWP - Flagship Edition
     */
    public String [] getProtectionVersion() {
        return this.ProtectionVersion;
    }

    /**
     * Set Version information
-Prioritized Protection package
-Container Security - Pro Edition
-CWP - Flagship Edition
     * @param ProtectionVersion Version information
-Prioritized Protection package
-Container Security - Pro Edition
-CWP - Flagship Edition
     */
    public void setProtectionVersion(String [] ProtectionVersion) {
        this.ProtectionVersion = ProtectionVersion;
    }

    /**
     * Get Protection setting
-0 unconfigured
-Configured 
     * @return ConfigurationSetting Protection setting
-0 unconfigured
-Configured
     */
    public Long getConfigurationSetting() {
        return this.ConfigurationSetting;
    }

    /**
     * Set Protection setting
-0 unconfigured
-Configured
     * @param ConfigurationSetting Protection setting
-0 unconfigured
-Configured
     */
    public void setConfigurationSetting(Long ConfigurationSetting) {
        this.ConfigurationSetting = ConfigurationSetting;
    }

    /**
     * Get Master switch
-0 Not enabled
- 1: enabled. 
     * @return Enable Master switch
-0 Not enabled
- 1: enabled.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Master switch
-0 Not enabled
- 1: enabled.
     * @param Enable Master switch
-0 Not enabled
- 1: enabled.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Vulnerability defense switch
-0 Not enabled
- 1: enabled. 
     * @return VulDefEnable Vulnerability defense switch
-0 Not enabled
- 1: enabled.
     */
    public Long getVulDefEnable() {
        return this.VulDefEnable;
    }

    /**
     * Set Vulnerability defense switch
-0 Not enabled
- 1: enabled.
     * @param VulDefEnable Vulnerability defense switch
-0 Not enabled
- 1: enabled.
     */
    public void setVulDefEnable(Long VulDefEnable) {
        this.VulDefEnable = VulDefEnable;
    }

    /**
     * Get Vulnerability defense mode
-0 Standard
-1. Major Event Support 
     * @return VulDefMode Vulnerability defense mode
-0 Standard
-1. Major Event Support
     */
    public Long getVulDefMode() {
        return this.VulDefMode;
    }

    /**
     * Set Vulnerability defense mode
-0 Standard
-1. Major Event Support
     * @param VulDefMode Vulnerability defense mode
-0 Standard
-1. Major Event Support
     */
    public void setVulDefMode(Long VulDefMode) {
        this.VulDefMode = VulDefMode;
    }

    /**
     * Get Vulnerability defense action
-0 Detect only
-Detect + defend 
     * @return VulDefAction Vulnerability defense action
-0 Detect only
-Detect + defend
     */
    public Long getVulDefAction() {
        return this.VulDefAction;
    }

    /**
     * Set Vulnerability defense action
-0 Detect only
-Detect + defend
     * @param VulDefAction Vulnerability defense action
-0 Detect only
-Detect + defend
     */
    public void setVulDefAction(Long VulDefAction) {
        this.VulDefAction = VulDefAction;
    }

    /**
     * Get Java Webshell Defense switch
-0 Not enabled
- 1: enabled. 
     * @return MemShellDefEnable Java Webshell Defense switch
-0 Not enabled
- 1: enabled.
     */
    public Long getMemShellDefEnable() {
        return this.MemShellDefEnable;
    }

    /**
     * Set Java Webshell Defense switch
-0 Not enabled
- 1: enabled.
     * @param MemShellDefEnable Java Webshell Defense switch
-0 Not enabled
- 1: enabled.
     */
    public void setMemShellDefEnable(Long MemShellDefEnable) {
        this.MemShellDefEnable = MemShellDefEnable;
    }

    /**
     * Get More protection
-0 Do not inject processes that will restart 
-Inject a process that will restart 
     * @return SafeInject More protection
-0 Do not inject processes that will restart 
-Inject a process that will restart
     */
    public Long getSafeInject() {
        return this.SafeInject;
    }

    /**
     * Set More protection
-0 Do not inject processes that will restart 
-Inject a process that will restart
     * @param SafeInject More protection
-0 Do not inject processes that will restart 
-Inject a process that will restart
     */
    public void setSafeInject(Long SafeInject) {
        this.SafeInject = SafeInject;
    }

    /**
     * Get Performance threshold configuration switch
-0 Not enabled
- 1: enabled. 
     * @return PerformanceLimit Performance threshold configuration switch
-0 Not enabled
- 1: enabled.
     */
    public Long getPerformanceLimit() {
        return this.PerformanceLimit;
    }

    /**
     * Set Performance threshold configuration switch
-0 Not enabled
- 1: enabled.
     * @param PerformanceLimit Performance threshold configuration switch
-0 Not enabled
- 1: enabled.
     */
    public void setPerformanceLimit(Long PerformanceLimit) {
        this.PerformanceLimit = PerformanceLimit;
    }

    /**
     * Get CPU threshold, Value 1-99 
     * @return PerformanceLimitCpu CPU threshold, Value 1-99
     */
    public Long getPerformanceLimitCpu() {
        return this.PerformanceLimitCpu;
    }

    /**
     * Set CPU threshold, Value 1-99
     * @param PerformanceLimitCpu CPU threshold, Value 1-99
     */
    public void setPerformanceLimitCpu(Long PerformanceLimitCpu) {
        this.PerformanceLimitCpu = PerformanceLimitCpu;
    }

    /**
     * Get Memory threshold, value 1-99 
     * @return PerformanceLimitMem Memory threshold, value 1-99
     */
    public Long getPerformanceLimitMem() {
        return this.PerformanceLimitMem;
    }

    /**
     * Set Memory threshold, value 1-99
     * @param PerformanceLimitMem Memory threshold, value 1-99
     */
    public void setPerformanceLimitMem(Long PerformanceLimitMem) {
        this.PerformanceLimitMem = PerformanceLimitMem;
    }

    /**
     * Get Memory remaining threshold 
     * @return PerformanceLimitMemAmount Memory remaining threshold
     */
    public Long getPerformanceLimitMemAmount() {
        return this.PerformanceLimitMemAmount;
    }

    /**
     * Set Memory remaining threshold
     * @param PerformanceLimitMemAmount Memory remaining threshold
     */
    public void setPerformanceLimitMemAmount(Long PerformanceLimitMemAmount) {
        this.PerformanceLimitMemAmount = PerformanceLimitMemAmount;
    }

    /**
     * Get Plug-in status
-0 Use normally
-1: Existence of anomalies
-2 inactive 
     * @return RaspException Plug-in status
-0 Use normally
-1: Existence of anomalies
-2 inactive
     */
    public Long getRaspException() {
        return this.RaspException;
    }

    /**
     * Set Plug-in status
-0 Use normally
-1: Existence of anomalies
-2 inactive
     * @param RaspException Plug-in status
-0 Use normally
-1: Existence of anomalies
-2 inactive
     */
    public void setRaspException(Long RaspException) {
        this.RaspException = RaspException;
    }

    /**
     * Get Latest update time 
     * @return LatestUpdateTime Latest update time
     */
    public String getLatestUpdateTime() {
        return this.LatestUpdateTime;
    }

    /**
     * Set Latest update time
     * @param LatestUpdateTime Latest update time
     */
    public void setLatestUpdateTime(String LatestUpdateTime) {
        this.LatestUpdateTime = LatestUpdateTime;
    }

    /**
     * Get Cluster ID, only valid for container assets 
     * @return ClusterName Cluster ID, only valid for container assets
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster ID, only valid for container assets
     * @param ClusterName Cluster ID, only valid for container assets
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Cluster name, only container assets have values 
     * @return ClusterId Cluster name, only container assets have values
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster name, only container assets have values
     * @param ClusterId Cluster name, only container assets have values
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Order information 
     * @return OrderDetail Order information
     */
    public OrderDetail getOrderDetail() {
        return this.OrderDetail;
    }

    /**
     * Set Order information
     * @param OrderDetail Order information
     */
    public void setOrderDetail(OrderDetail OrderDetail) {
        this.OrderDetail = OrderDetail;
    }

    /**
     * Get Whether unbinding is allowed: false - not allowed, true - allowed. 
     * @return IsUnBind Whether unbinding is allowed: false - not allowed, true - allowed.
     */
    public Boolean getIsUnBind() {
        return this.IsUnBind;
    }

    /**
     * Set Whether unbinding is allowed: false - not allowed, true - allowed.
     * @param IsUnBind Whether unbinding is allowed: false - not allowed, true - allowed.
     */
    public void setIsUnBind(Boolean IsUnBind) {
        this.IsUnBind = IsUnBind;
    }

    /**
     * Get uuid. Unique ID of the machine. Only valid when AssetType = CWP. 
     * @return UUID uuid. Unique ID of the machine. Only valid when AssetType = CWP.
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set uuid. Unique ID of the machine. Only valid when AssetType = CWP.
     * @param UUID uuid. Unique ID of the machine. Only valid when AssetType = CWP.
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get No injection/Failure reason of injection 
     * @return Reason No injection/Failure reason of injection
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set No injection/Failure reason of injection
     * @param Reason No injection/Failure reason of injection
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public RaspLicenseList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspLicenseList(RaspLicenseList source) {
        if (source.QUUID != null) {
            this.QUUID = new String(source.QUUID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.PrivateIP != null) {
            this.PrivateIP = new String(source.PrivateIP);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.ProtectionVersion != null) {
            this.ProtectionVersion = new String[source.ProtectionVersion.length];
            for (int i = 0; i < source.ProtectionVersion.length; i++) {
                this.ProtectionVersion[i] = new String(source.ProtectionVersion[i]);
            }
        }
        if (source.ConfigurationSetting != null) {
            this.ConfigurationSetting = new Long(source.ConfigurationSetting);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.VulDefEnable != null) {
            this.VulDefEnable = new Long(source.VulDefEnable);
        }
        if (source.VulDefMode != null) {
            this.VulDefMode = new Long(source.VulDefMode);
        }
        if (source.VulDefAction != null) {
            this.VulDefAction = new Long(source.VulDefAction);
        }
        if (source.MemShellDefEnable != null) {
            this.MemShellDefEnable = new Long(source.MemShellDefEnable);
        }
        if (source.SafeInject != null) {
            this.SafeInject = new Long(source.SafeInject);
        }
        if (source.PerformanceLimit != null) {
            this.PerformanceLimit = new Long(source.PerformanceLimit);
        }
        if (source.PerformanceLimitCpu != null) {
            this.PerformanceLimitCpu = new Long(source.PerformanceLimitCpu);
        }
        if (source.PerformanceLimitMem != null) {
            this.PerformanceLimitMem = new Long(source.PerformanceLimitMem);
        }
        if (source.PerformanceLimitMemAmount != null) {
            this.PerformanceLimitMemAmount = new Long(source.PerformanceLimitMemAmount);
        }
        if (source.RaspException != null) {
            this.RaspException = new Long(source.RaspException);
        }
        if (source.LatestUpdateTime != null) {
            this.LatestUpdateTime = new String(source.LatestUpdateTime);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.OrderDetail != null) {
            this.OrderDetail = new OrderDetail(source.OrderDetail);
        }
        if (source.IsUnBind != null) {
            this.IsUnBind = new Boolean(source.IsUnBind);
        }
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QUUID", this.QUUID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "PrivateIP", this.PrivateIP);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "ProtectionVersion.", this.ProtectionVersion);
        this.setParamSimple(map, prefix + "ConfigurationSetting", this.ConfigurationSetting);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "VulDefEnable", this.VulDefEnable);
        this.setParamSimple(map, prefix + "VulDefMode", this.VulDefMode);
        this.setParamSimple(map, prefix + "VulDefAction", this.VulDefAction);
        this.setParamSimple(map, prefix + "MemShellDefEnable", this.MemShellDefEnable);
        this.setParamSimple(map, prefix + "SafeInject", this.SafeInject);
        this.setParamSimple(map, prefix + "PerformanceLimit", this.PerformanceLimit);
        this.setParamSimple(map, prefix + "PerformanceLimitCpu", this.PerformanceLimitCpu);
        this.setParamSimple(map, prefix + "PerformanceLimitMem", this.PerformanceLimitMem);
        this.setParamSimple(map, prefix + "PerformanceLimitMemAmount", this.PerformanceLimitMemAmount);
        this.setParamSimple(map, prefix + "RaspException", this.RaspException);
        this.setParamSimple(map, prefix + "LatestUpdateTime", this.LatestUpdateTime);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "OrderDetail.", this.OrderDetail);
        this.setParamSimple(map, prefix + "IsUnBind", this.IsUnBind);
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

