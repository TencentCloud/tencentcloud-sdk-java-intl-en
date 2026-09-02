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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RaspLicenseList extends AbstractModel {

    /**
    * <p>Unique machine ID</p>
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Public IP Address</p>
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * <p>Private IP address.</p>
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * <p>Cloud tag information</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * <p>Protection edition information</p><ul><li>CriticalProtection Prioritized Protection package</li><li>Pro Container security-Pro Edition</li><li>Ultimate CWP-Flagship Edition</li></ul>
    */
    @SerializedName("ProtectionVersion")
    @Expose
    private String [] ProtectionVersion;

    /**
    * <p>Protection setting</p><ul><li>0 No configuration</li><li>1 Configured</li></ul>
    */
    @SerializedName("ConfigurationSetting")
    @Expose
    private Long ConfigurationSetting;

    /**
    * <p>Master switch</p><ul><li>0 Not enabled</li><li>1 Enabled</li></ul>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>Vulnerability defense switch</p><ul><li>0 Not enabled</li><li>1 Enable</li></ul>
    */
    @SerializedName("VulDefEnable")
    @Expose
    private Long VulDefEnable;

    /**
    * <p>Vulnerability defense mode</p><ul><li>0: standard</li><li>1: major event protection</li></ul>
    */
    @SerializedName("VulDefMode")
    @Expose
    private Long VulDefMode;

    /**
    * <p>Vulnerability defense action</p><ul><li>0: Detection only</li><li>1: Detection and prevention</li></ul>
    */
    @SerializedName("VulDefAction")
    @Expose
    private Long VulDefAction;

    /**
    * <p>Java Webshell Defense switch</p><ul><li>0 Not enabled</li><li>1 Enable</li></ul>
    */
    @SerializedName("MemShellDefEnable")
    @Expose
    private Long MemShellDefEnable;

    /**
    * <p>More protection</p><ul><li>0: Do not inject into processes that will restart </li><li>1: Inject into processes that will restart</li></ul>
    */
    @SerializedName("SafeInject")
    @Expose
    private Long SafeInject;

    /**
    * <p>Performance threshold configuration switch</p><ul><li>0 Not enabled</li><li>1 Enabled</li></ul>
    */
    @SerializedName("PerformanceLimit")
    @Expose
    private Long PerformanceLimit;

    /**
    * <p>CPU threshold. Value range: 1–99.</p>
    */
    @SerializedName("PerformanceLimitCpu")
    @Expose
    private Long PerformanceLimitCpu;

    /**
    * <p>Memory threshold. Value range: 1–99</p>
    */
    @SerializedName("PerformanceLimitMem")
    @Expose
    private Long PerformanceLimitMem;

    /**
    * <p>Remaining memory threshold</p>
    */
    @SerializedName("PerformanceLimitMemAmount")
    @Expose
    private Long PerformanceLimitMemAmount;

    /**
    * <p>Plug-in status</p><ul><li>0 Used normally</li><li>1 Anomaly exists</li><li>2 Inactive</li></ul>
    */
    @SerializedName("RaspException")
    @Expose
    private Long RaspException;

    /**
    * <p>Latest update time.</p>
    */
    @SerializedName("LatestUpdateTime")
    @Expose
    private String LatestUpdateTime;

    /**
    * <p>Cluster ID, available only for container assets</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Cluster name, only available for container assets</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Order information</p>
    */
    @SerializedName("OrderDetail")
    @Expose
    private OrderDetail OrderDetail;

    /**
    * <p>Whether unbinding is allowed. false: not allowed; true: permission</p>
    */
    @SerializedName("IsUnBind")
    @Expose
    private Boolean IsUnBind;

    /**
    * <p>uuid: unique ID of a machine. It has a value only when AssetType is CWP.</p>
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * <p>No injection/failure reason</p><p>Default value: empty</p><p>Values are available only if injection fails</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get <p>Unique machine ID</p> 
     * @return QUUID <p>Unique machine ID</p>
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set <p>Unique machine ID</p>
     * @param QUUID <p>Unique machine ID</p>
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Public IP Address</p> 
     * @return PublicIP <p>Public IP Address</p>
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set <p>Public IP Address</p>
     * @param PublicIP <p>Public IP Address</p>
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get <p>Private IP address.</p> 
     * @return PrivateIP <p>Private IP address.</p>
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set <p>Private IP address.</p>
     * @param PrivateIP <p>Private IP address.</p>
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get <p>Cloud tag information</p> 
     * @return Tags <p>Cloud tag information</p>
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Cloud tag information</p>
     * @param Tags <p>Cloud tag information</p>
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Protection edition information</p><ul><li>CriticalProtection Prioritized Protection package</li><li>Pro Container security-Pro Edition</li><li>Ultimate CWP-Flagship Edition</li></ul> 
     * @return ProtectionVersion <p>Protection edition information</p><ul><li>CriticalProtection Prioritized Protection package</li><li>Pro Container security-Pro Edition</li><li>Ultimate CWP-Flagship Edition</li></ul>
     */
    public String [] getProtectionVersion() {
        return this.ProtectionVersion;
    }

    /**
     * Set <p>Protection edition information</p><ul><li>CriticalProtection Prioritized Protection package</li><li>Pro Container security-Pro Edition</li><li>Ultimate CWP-Flagship Edition</li></ul>
     * @param ProtectionVersion <p>Protection edition information</p><ul><li>CriticalProtection Prioritized Protection package</li><li>Pro Container security-Pro Edition</li><li>Ultimate CWP-Flagship Edition</li></ul>
     */
    public void setProtectionVersion(String [] ProtectionVersion) {
        this.ProtectionVersion = ProtectionVersion;
    }

    /**
     * Get <p>Protection setting</p><ul><li>0 No configuration</li><li>1 Configured</li></ul> 
     * @return ConfigurationSetting <p>Protection setting</p><ul><li>0 No configuration</li><li>1 Configured</li></ul>
     */
    public Long getConfigurationSetting() {
        return this.ConfigurationSetting;
    }

    /**
     * Set <p>Protection setting</p><ul><li>0 No configuration</li><li>1 Configured</li></ul>
     * @param ConfigurationSetting <p>Protection setting</p><ul><li>0 No configuration</li><li>1 Configured</li></ul>
     */
    public void setConfigurationSetting(Long ConfigurationSetting) {
        this.ConfigurationSetting = ConfigurationSetting;
    }

    /**
     * Get <p>Master switch</p><ul><li>0 Not enabled</li><li>1 Enabled</li></ul> 
     * @return Enable <p>Master switch</p><ul><li>0 Not enabled</li><li>1 Enabled</li></ul>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Master switch</p><ul><li>0 Not enabled</li><li>1 Enabled</li></ul>
     * @param Enable <p>Master switch</p><ul><li>0 Not enabled</li><li>1 Enabled</li></ul>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>Vulnerability defense switch</p><ul><li>0 Not enabled</li><li>1 Enable</li></ul> 
     * @return VulDefEnable <p>Vulnerability defense switch</p><ul><li>0 Not enabled</li><li>1 Enable</li></ul>
     */
    public Long getVulDefEnable() {
        return this.VulDefEnable;
    }

    /**
     * Set <p>Vulnerability defense switch</p><ul><li>0 Not enabled</li><li>1 Enable</li></ul>
     * @param VulDefEnable <p>Vulnerability defense switch</p><ul><li>0 Not enabled</li><li>1 Enable</li></ul>
     */
    public void setVulDefEnable(Long VulDefEnable) {
        this.VulDefEnable = VulDefEnable;
    }

    /**
     * Get <p>Vulnerability defense mode</p><ul><li>0: standard</li><li>1: major event protection</li></ul> 
     * @return VulDefMode <p>Vulnerability defense mode</p><ul><li>0: standard</li><li>1: major event protection</li></ul>
     */
    public Long getVulDefMode() {
        return this.VulDefMode;
    }

    /**
     * Set <p>Vulnerability defense mode</p><ul><li>0: standard</li><li>1: major event protection</li></ul>
     * @param VulDefMode <p>Vulnerability defense mode</p><ul><li>0: standard</li><li>1: major event protection</li></ul>
     */
    public void setVulDefMode(Long VulDefMode) {
        this.VulDefMode = VulDefMode;
    }

    /**
     * Get <p>Vulnerability defense action</p><ul><li>0: Detection only</li><li>1: Detection and prevention</li></ul> 
     * @return VulDefAction <p>Vulnerability defense action</p><ul><li>0: Detection only</li><li>1: Detection and prevention</li></ul>
     */
    public Long getVulDefAction() {
        return this.VulDefAction;
    }

    /**
     * Set <p>Vulnerability defense action</p><ul><li>0: Detection only</li><li>1: Detection and prevention</li></ul>
     * @param VulDefAction <p>Vulnerability defense action</p><ul><li>0: Detection only</li><li>1: Detection and prevention</li></ul>
     */
    public void setVulDefAction(Long VulDefAction) {
        this.VulDefAction = VulDefAction;
    }

    /**
     * Get <p>Java Webshell Defense switch</p><ul><li>0 Not enabled</li><li>1 Enable</li></ul> 
     * @return MemShellDefEnable <p>Java Webshell Defense switch</p><ul><li>0 Not enabled</li><li>1 Enable</li></ul>
     */
    public Long getMemShellDefEnable() {
        return this.MemShellDefEnable;
    }

    /**
     * Set <p>Java Webshell Defense switch</p><ul><li>0 Not enabled</li><li>1 Enable</li></ul>
     * @param MemShellDefEnable <p>Java Webshell Defense switch</p><ul><li>0 Not enabled</li><li>1 Enable</li></ul>
     */
    public void setMemShellDefEnable(Long MemShellDefEnable) {
        this.MemShellDefEnable = MemShellDefEnable;
    }

    /**
     * Get <p>More protection</p><ul><li>0: Do not inject into processes that will restart </li><li>1: Inject into processes that will restart</li></ul> 
     * @return SafeInject <p>More protection</p><ul><li>0: Do not inject into processes that will restart </li><li>1: Inject into processes that will restart</li></ul>
     */
    public Long getSafeInject() {
        return this.SafeInject;
    }

    /**
     * Set <p>More protection</p><ul><li>0: Do not inject into processes that will restart </li><li>1: Inject into processes that will restart</li></ul>
     * @param SafeInject <p>More protection</p><ul><li>0: Do not inject into processes that will restart </li><li>1: Inject into processes that will restart</li></ul>
     */
    public void setSafeInject(Long SafeInject) {
        this.SafeInject = SafeInject;
    }

    /**
     * Get <p>Performance threshold configuration switch</p><ul><li>0 Not enabled</li><li>1 Enabled</li></ul> 
     * @return PerformanceLimit <p>Performance threshold configuration switch</p><ul><li>0 Not enabled</li><li>1 Enabled</li></ul>
     */
    public Long getPerformanceLimit() {
        return this.PerformanceLimit;
    }

    /**
     * Set <p>Performance threshold configuration switch</p><ul><li>0 Not enabled</li><li>1 Enabled</li></ul>
     * @param PerformanceLimit <p>Performance threshold configuration switch</p><ul><li>0 Not enabled</li><li>1 Enabled</li></ul>
     */
    public void setPerformanceLimit(Long PerformanceLimit) {
        this.PerformanceLimit = PerformanceLimit;
    }

    /**
     * Get <p>CPU threshold. Value range: 1–99.</p> 
     * @return PerformanceLimitCpu <p>CPU threshold. Value range: 1–99.</p>
     */
    public Long getPerformanceLimitCpu() {
        return this.PerformanceLimitCpu;
    }

    /**
     * Set <p>CPU threshold. Value range: 1–99.</p>
     * @param PerformanceLimitCpu <p>CPU threshold. Value range: 1–99.</p>
     */
    public void setPerformanceLimitCpu(Long PerformanceLimitCpu) {
        this.PerformanceLimitCpu = PerformanceLimitCpu;
    }

    /**
     * Get <p>Memory threshold. Value range: 1–99</p> 
     * @return PerformanceLimitMem <p>Memory threshold. Value range: 1–99</p>
     */
    public Long getPerformanceLimitMem() {
        return this.PerformanceLimitMem;
    }

    /**
     * Set <p>Memory threshold. Value range: 1–99</p>
     * @param PerformanceLimitMem <p>Memory threshold. Value range: 1–99</p>
     */
    public void setPerformanceLimitMem(Long PerformanceLimitMem) {
        this.PerformanceLimitMem = PerformanceLimitMem;
    }

    /**
     * Get <p>Remaining memory threshold</p> 
     * @return PerformanceLimitMemAmount <p>Remaining memory threshold</p>
     */
    public Long getPerformanceLimitMemAmount() {
        return this.PerformanceLimitMemAmount;
    }

    /**
     * Set <p>Remaining memory threshold</p>
     * @param PerformanceLimitMemAmount <p>Remaining memory threshold</p>
     */
    public void setPerformanceLimitMemAmount(Long PerformanceLimitMemAmount) {
        this.PerformanceLimitMemAmount = PerformanceLimitMemAmount;
    }

    /**
     * Get <p>Plug-in status</p><ul><li>0 Used normally</li><li>1 Anomaly exists</li><li>2 Inactive</li></ul> 
     * @return RaspException <p>Plug-in status</p><ul><li>0 Used normally</li><li>1 Anomaly exists</li><li>2 Inactive</li></ul>
     */
    public Long getRaspException() {
        return this.RaspException;
    }

    /**
     * Set <p>Plug-in status</p><ul><li>0 Used normally</li><li>1 Anomaly exists</li><li>2 Inactive</li></ul>
     * @param RaspException <p>Plug-in status</p><ul><li>0 Used normally</li><li>1 Anomaly exists</li><li>2 Inactive</li></ul>
     */
    public void setRaspException(Long RaspException) {
        this.RaspException = RaspException;
    }

    /**
     * Get <p>Latest update time.</p> 
     * @return LatestUpdateTime <p>Latest update time.</p>
     */
    public String getLatestUpdateTime() {
        return this.LatestUpdateTime;
    }

    /**
     * Set <p>Latest update time.</p>
     * @param LatestUpdateTime <p>Latest update time.</p>
     */
    public void setLatestUpdateTime(String LatestUpdateTime) {
        this.LatestUpdateTime = LatestUpdateTime;
    }

    /**
     * Get <p>Cluster ID, available only for container assets</p> 
     * @return ClusterName <p>Cluster ID, available only for container assets</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster ID, available only for container assets</p>
     * @param ClusterName <p>Cluster ID, available only for container assets</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Cluster name, only available for container assets</p> 
     * @return ClusterId <p>Cluster name, only available for container assets</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster name, only available for container assets</p>
     * @param ClusterId <p>Cluster name, only available for container assets</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Order information</p> 
     * @return OrderDetail <p>Order information</p>
     */
    public OrderDetail getOrderDetail() {
        return this.OrderDetail;
    }

    /**
     * Set <p>Order information</p>
     * @param OrderDetail <p>Order information</p>
     */
    public void setOrderDetail(OrderDetail OrderDetail) {
        this.OrderDetail = OrderDetail;
    }

    /**
     * Get <p>Whether unbinding is allowed. false: not allowed; true: permission</p> 
     * @return IsUnBind <p>Whether unbinding is allowed. false: not allowed; true: permission</p>
     */
    public Boolean getIsUnBind() {
        return this.IsUnBind;
    }

    /**
     * Set <p>Whether unbinding is allowed. false: not allowed; true: permission</p>
     * @param IsUnBind <p>Whether unbinding is allowed. false: not allowed; true: permission</p>
     */
    public void setIsUnBind(Boolean IsUnBind) {
        this.IsUnBind = IsUnBind;
    }

    /**
     * Get <p>uuid: unique ID of a machine. It has a value only when AssetType is CWP.</p> 
     * @return UUID <p>uuid: unique ID of a machine. It has a value only when AssetType is CWP.</p>
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set <p>uuid: unique ID of a machine. It has a value only when AssetType is CWP.</p>
     * @param UUID <p>uuid: unique ID of a machine. It has a value only when AssetType is CWP.</p>
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get <p>No injection/failure reason</p><p>Default value: empty</p><p>Values are available only if injection fails</p> 
     * @return Reason <p>No injection/failure reason</p><p>Default value: empty</p><p>Values are available only if injection fails</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>No injection/failure reason</p><p>Default value: empty</p><p>Values are available only if injection fails</p>
     * @param Reason <p>No injection/failure reason</p><p>Default value: empty</p><p>Values are available only if injection fails</p>
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

