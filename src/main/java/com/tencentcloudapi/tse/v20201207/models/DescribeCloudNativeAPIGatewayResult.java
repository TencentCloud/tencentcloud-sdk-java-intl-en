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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudNativeAPIGatewayResult extends AbstractModel {

    /**
    * Cloud Native API Gateway ID.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Cloud native API gateway status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Cloud native API gateway name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Cloud native API gateway type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Instance version:
- 2.4.1
- 2.5.1
    */
    @SerializedName("GatewayVersion")
    @Expose
    private String GatewayVersion;

    /**
    * Cloud native API gateway node information.
    */
    @SerializedName("NodeConfig")
    @Expose
    private CloudNativeAPIGatewayNodeConfig NodeConfig;

    /**
    * Cloud native API gateway vpc configuration.
    */
    @SerializedName("VpcConfig")
    @Expose
    private CloudNativeAPIGatewayVpcConfig VpcConfig;

    /**
    * Cloud native API gateway description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time of the cloud native API gateway.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Tag information of the instance
    */
    @SerializedName("Tags")
    @Expose
    private InstanceTagInfo [] Tags;

    /**
    * Is cls log enabled?
    */
    @SerializedName("EnableCls")
    @Expose
    private Boolean EnableCls;

    /**
    * Payment mode. 0 indicates postpaid, and 1 indicates prepaid.
    */
    @SerializedName("TradeType")
    @Expose
    private Long TradeType;

    /**
    * Instance version. Currently supported: development edition, standard version, and professional version [TRIAL, STANDARD, PROFESSIONAL].
    */
    @SerializedName("FeatureVersion")
    @Expose
    private String FeatureVersion;

    /**
    * Public network outbound traffic bandwidth, [1,2048]Mbps
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Auto-renewal flag. 0 means the default state (not set by the user, that is, the initial state).
1 means auto-renew, 2 means no automatic renewal (set by the user). If the business has no renewal concept or no need for auto-renewal, set it to 0.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Expiry time, used when prepaid
    */
    @SerializedName("CurDeadline")
    @Expose
    private String CurDeadline;

    /**
    * Isolation time. Used when an instance is isolated.
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * Is client public network enabled?
    */
    @SerializedName("EnableInternet")
    @Expose
    private Boolean EnableInternet;

    /**
    * Actual regional information of the instance
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
    * Ingress class name
    */
    @SerializedName("IngressClassName")
    @Expose
    private String IngressClassName;

    /**
    * Public network billing method. Selectable values: BANDWIDTH | TRAFFIC, representing billing by bandwidth and by traffic.
    */
    @SerializedName("InternetPayMode")
    @Expose
    private String InternetPayMode;

    /**
    * Cloud Native API Gateway minor version number
    */
    @SerializedName("GatewayMinorVersion")
    @Expose
    private String GatewayMinorVersion;

    /**
    * Ports monitored by the instance
    */
    @SerializedName("InstancePort")
    @Expose
    private InstancePort InstancePort;

    /**
    * Public network CLB default type
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * Public IP address list
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * Whether to enable deletion protection
    */
    @SerializedName("DeleteProtect")
    @Expose
    private Boolean DeleteProtect;

    /**
    * Version number that can be upgraded
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AvailableVersions")
    @Expose
    private String [] AvailableVersions;

    /**
    * Version list for gateway upgrade
    */
    @SerializedName("AvailableUpgradeVersions")
    @Expose
    private String [] AvailableUpgradeVersions;

    /**
    * Whether to prompt for upgrade
    */
    @SerializedName("AvailableUpgrade")
    @Expose
    private Boolean AvailableUpgrade;

    /**
    * Rollback version
    */
    @SerializedName("AvailableRollbackVersion")
    @Expose
    private String AvailableRollbackVersion;

    /**
     * Get Cloud Native API Gateway ID. 
     * @return GatewayId Cloud Native API Gateway ID.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Cloud Native API Gateway ID.
     * @param GatewayId Cloud Native API Gateway ID.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Cloud native API gateway status. 
     * @return Status Cloud native API gateway status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Cloud native API gateway status.
     * @param Status Cloud native API gateway status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Cloud native API gateway name. 
     * @return Name Cloud native API gateway name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Cloud native API gateway name.
     * @param Name Cloud native API gateway name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Cloud native API gateway type. 
     * @return Type Cloud native API gateway type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Cloud native API gateway type.
     * @param Type Cloud native API gateway type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Instance version:
- 2.4.1
- 2.5.1 
     * @return GatewayVersion Instance version:
- 2.4.1
- 2.5.1
     */
    public String getGatewayVersion() {
        return this.GatewayVersion;
    }

    /**
     * Set Instance version:
- 2.4.1
- 2.5.1
     * @param GatewayVersion Instance version:
- 2.4.1
- 2.5.1
     */
    public void setGatewayVersion(String GatewayVersion) {
        this.GatewayVersion = GatewayVersion;
    }

    /**
     * Get Cloud native API gateway node information. 
     * @return NodeConfig Cloud native API gateway node information.
     */
    public CloudNativeAPIGatewayNodeConfig getNodeConfig() {
        return this.NodeConfig;
    }

    /**
     * Set Cloud native API gateway node information.
     * @param NodeConfig Cloud native API gateway node information.
     */
    public void setNodeConfig(CloudNativeAPIGatewayNodeConfig NodeConfig) {
        this.NodeConfig = NodeConfig;
    }

    /**
     * Get Cloud native API gateway vpc configuration. 
     * @return VpcConfig Cloud native API gateway vpc configuration.
     */
    public CloudNativeAPIGatewayVpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set Cloud native API gateway vpc configuration.
     * @param VpcConfig Cloud native API gateway vpc configuration.
     */
    public void setVpcConfig(CloudNativeAPIGatewayVpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get Cloud native API gateway description. 
     * @return Description Cloud native API gateway description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Cloud native API gateway description.
     * @param Description Cloud native API gateway description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creation time of the cloud native API gateway. 
     * @return CreateTime Creation time of the cloud native API gateway.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the cloud native API gateway.
     * @param CreateTime Creation time of the cloud native API gateway.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Tag information of the instance 
     * @return Tags Tag information of the instance
     */
    public InstanceTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information of the instance
     * @param Tags Tag information of the instance
     */
    public void setTags(InstanceTagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Is cls log enabled? 
     * @return EnableCls Is cls log enabled?
     */
    public Boolean getEnableCls() {
        return this.EnableCls;
    }

    /**
     * Set Is cls log enabled?
     * @param EnableCls Is cls log enabled?
     */
    public void setEnableCls(Boolean EnableCls) {
        this.EnableCls = EnableCls;
    }

    /**
     * Get Payment mode. 0 indicates postpaid, and 1 indicates prepaid. 
     * @return TradeType Payment mode. 0 indicates postpaid, and 1 indicates prepaid.
     */
    public Long getTradeType() {
        return this.TradeType;
    }

    /**
     * Set Payment mode. 0 indicates postpaid, and 1 indicates prepaid.
     * @param TradeType Payment mode. 0 indicates postpaid, and 1 indicates prepaid.
     */
    public void setTradeType(Long TradeType) {
        this.TradeType = TradeType;
    }

    /**
     * Get Instance version. Currently supported: development edition, standard version, and professional version [TRIAL, STANDARD, PROFESSIONAL]. 
     * @return FeatureVersion Instance version. Currently supported: development edition, standard version, and professional version [TRIAL, STANDARD, PROFESSIONAL].
     */
    public String getFeatureVersion() {
        return this.FeatureVersion;
    }

    /**
     * Set Instance version. Currently supported: development edition, standard version, and professional version [TRIAL, STANDARD, PROFESSIONAL].
     * @param FeatureVersion Instance version. Currently supported: development edition, standard version, and professional version [TRIAL, STANDARD, PROFESSIONAL].
     */
    public void setFeatureVersion(String FeatureVersion) {
        this.FeatureVersion = FeatureVersion;
    }

    /**
     * Get Public network outbound traffic bandwidth, [1,2048]Mbps 
     * @return InternetMaxBandwidthOut Public network outbound traffic bandwidth, [1,2048]Mbps
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Public network outbound traffic bandwidth, [1,2048]Mbps
     * @param InternetMaxBandwidthOut Public network outbound traffic bandwidth, [1,2048]Mbps
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Auto-renewal flag. 0 means the default state (not set by the user, that is, the initial state).
1 means auto-renew, 2 means no automatic renewal (set by the user). If the business has no renewal concept or no need for auto-renewal, set it to 0. 
     * @return AutoRenewFlag Auto-renewal flag. 0 means the default state (not set by the user, that is, the initial state).
1 means auto-renew, 2 means no automatic renewal (set by the user). If the business has no renewal concept or no need for auto-renewal, set it to 0.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. 0 means the default state (not set by the user, that is, the initial state).
1 means auto-renew, 2 means no automatic renewal (set by the user). If the business has no renewal concept or no need for auto-renewal, set it to 0.
     * @param AutoRenewFlag Auto-renewal flag. 0 means the default state (not set by the user, that is, the initial state).
1 means auto-renew, 2 means no automatic renewal (set by the user). If the business has no renewal concept or no need for auto-renewal, set it to 0.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Expiry time, used when prepaid 
     * @return CurDeadline Expiry time, used when prepaid
     */
    public String getCurDeadline() {
        return this.CurDeadline;
    }

    /**
     * Set Expiry time, used when prepaid
     * @param CurDeadline Expiry time, used when prepaid
     */
    public void setCurDeadline(String CurDeadline) {
        this.CurDeadline = CurDeadline;
    }

    /**
     * Get Isolation time. Used when an instance is isolated. 
     * @return IsolateTime Isolation time. Used when an instance is isolated.
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set Isolation time. Used when an instance is isolated.
     * @param IsolateTime Isolation time. Used when an instance is isolated.
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get Is client public network enabled? 
     * @return EnableInternet Is client public network enabled?
     */
    public Boolean getEnableInternet() {
        return this.EnableInternet;
    }

    /**
     * Set Is client public network enabled?
     * @param EnableInternet Is client public network enabled?
     */
    public void setEnableInternet(Boolean EnableInternet) {
        this.EnableInternet = EnableInternet;
    }

    /**
     * Get Actual regional information of the instance 
     * @return EngineRegion Actual regional information of the instance
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set Actual regional information of the instance
     * @param EngineRegion Actual regional information of the instance
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    /**
     * Get Ingress class name 
     * @return IngressClassName Ingress class name
     */
    public String getIngressClassName() {
        return this.IngressClassName;
    }

    /**
     * Set Ingress class name
     * @param IngressClassName Ingress class name
     */
    public void setIngressClassName(String IngressClassName) {
        this.IngressClassName = IngressClassName;
    }

    /**
     * Get Public network billing method. Selectable values: BANDWIDTH | TRAFFIC, representing billing by bandwidth and by traffic. 
     * @return InternetPayMode Public network billing method. Selectable values: BANDWIDTH | TRAFFIC, representing billing by bandwidth and by traffic.
     */
    public String getInternetPayMode() {
        return this.InternetPayMode;
    }

    /**
     * Set Public network billing method. Selectable values: BANDWIDTH | TRAFFIC, representing billing by bandwidth and by traffic.
     * @param InternetPayMode Public network billing method. Selectable values: BANDWIDTH | TRAFFIC, representing billing by bandwidth and by traffic.
     */
    public void setInternetPayMode(String InternetPayMode) {
        this.InternetPayMode = InternetPayMode;
    }

    /**
     * Get Cloud Native API Gateway minor version number 
     * @return GatewayMinorVersion Cloud Native API Gateway minor version number
     */
    public String getGatewayMinorVersion() {
        return this.GatewayMinorVersion;
    }

    /**
     * Set Cloud Native API Gateway minor version number
     * @param GatewayMinorVersion Cloud Native API Gateway minor version number
     */
    public void setGatewayMinorVersion(String GatewayMinorVersion) {
        this.GatewayMinorVersion = GatewayMinorVersion;
    }

    /**
     * Get Ports monitored by the instance 
     * @return InstancePort Ports monitored by the instance
     */
    public InstancePort getInstancePort() {
        return this.InstancePort;
    }

    /**
     * Set Ports monitored by the instance
     * @param InstancePort Ports monitored by the instance
     */
    public void setInstancePort(InstancePort InstancePort) {
        this.InstancePort = InstancePort;
    }

    /**
     * Get Public network CLB default type 
     * @return LoadBalancerType Public network CLB default type
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set Public network CLB default type
     * @param LoadBalancerType Public network CLB default type
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get Public IP address list 
     * @return PublicIpAddresses Public IP address list
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set Public IP address list
     * @param PublicIpAddresses Public IP address list
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get Whether to enable deletion protection 
     * @return DeleteProtect Whether to enable deletion protection
     */
    public Boolean getDeleteProtect() {
        return this.DeleteProtect;
    }

    /**
     * Set Whether to enable deletion protection
     * @param DeleteProtect Whether to enable deletion protection
     */
    public void setDeleteProtect(Boolean DeleteProtect) {
        this.DeleteProtect = DeleteProtect;
    }

    /**
     * Get Version number that can be upgraded
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AvailableVersions Version number that can be upgraded
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAvailableVersions() {
        return this.AvailableVersions;
    }

    /**
     * Set Version number that can be upgraded
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AvailableVersions Version number that can be upgraded
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAvailableVersions(String [] AvailableVersions) {
        this.AvailableVersions = AvailableVersions;
    }

    /**
     * Get Version list for gateway upgrade 
     * @return AvailableUpgradeVersions Version list for gateway upgrade
     */
    public String [] getAvailableUpgradeVersions() {
        return this.AvailableUpgradeVersions;
    }

    /**
     * Set Version list for gateway upgrade
     * @param AvailableUpgradeVersions Version list for gateway upgrade
     */
    public void setAvailableUpgradeVersions(String [] AvailableUpgradeVersions) {
        this.AvailableUpgradeVersions = AvailableUpgradeVersions;
    }

    /**
     * Get Whether to prompt for upgrade 
     * @return AvailableUpgrade Whether to prompt for upgrade
     */
    public Boolean getAvailableUpgrade() {
        return this.AvailableUpgrade;
    }

    /**
     * Set Whether to prompt for upgrade
     * @param AvailableUpgrade Whether to prompt for upgrade
     */
    public void setAvailableUpgrade(Boolean AvailableUpgrade) {
        this.AvailableUpgrade = AvailableUpgrade;
    }

    /**
     * Get Rollback version 
     * @return AvailableRollbackVersion Rollback version
     */
    public String getAvailableRollbackVersion() {
        return this.AvailableRollbackVersion;
    }

    /**
     * Set Rollback version
     * @param AvailableRollbackVersion Rollback version
     */
    public void setAvailableRollbackVersion(String AvailableRollbackVersion) {
        this.AvailableRollbackVersion = AvailableRollbackVersion;
    }

    public DescribeCloudNativeAPIGatewayResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayResult(DescribeCloudNativeAPIGatewayResult source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.GatewayVersion != null) {
            this.GatewayVersion = new String(source.GatewayVersion);
        }
        if (source.NodeConfig != null) {
            this.NodeConfig = new CloudNativeAPIGatewayNodeConfig(source.NodeConfig);
        }
        if (source.VpcConfig != null) {
            this.VpcConfig = new CloudNativeAPIGatewayVpcConfig(source.VpcConfig);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Tags != null) {
            this.Tags = new InstanceTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new InstanceTagInfo(source.Tags[i]);
            }
        }
        if (source.EnableCls != null) {
            this.EnableCls = new Boolean(source.EnableCls);
        }
        if (source.TradeType != null) {
            this.TradeType = new Long(source.TradeType);
        }
        if (source.FeatureVersion != null) {
            this.FeatureVersion = new String(source.FeatureVersion);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.CurDeadline != null) {
            this.CurDeadline = new String(source.CurDeadline);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.EnableInternet != null) {
            this.EnableInternet = new Boolean(source.EnableInternet);
        }
        if (source.EngineRegion != null) {
            this.EngineRegion = new String(source.EngineRegion);
        }
        if (source.IngressClassName != null) {
            this.IngressClassName = new String(source.IngressClassName);
        }
        if (source.InternetPayMode != null) {
            this.InternetPayMode = new String(source.InternetPayMode);
        }
        if (source.GatewayMinorVersion != null) {
            this.GatewayMinorVersion = new String(source.GatewayMinorVersion);
        }
        if (source.InstancePort != null) {
            this.InstancePort = new InstancePort(source.InstancePort);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.DeleteProtect != null) {
            this.DeleteProtect = new Boolean(source.DeleteProtect);
        }
        if (source.AvailableVersions != null) {
            this.AvailableVersions = new String[source.AvailableVersions.length];
            for (int i = 0; i < source.AvailableVersions.length; i++) {
                this.AvailableVersions[i] = new String(source.AvailableVersions[i]);
            }
        }
        if (source.AvailableUpgradeVersions != null) {
            this.AvailableUpgradeVersions = new String[source.AvailableUpgradeVersions.length];
            for (int i = 0; i < source.AvailableUpgradeVersions.length; i++) {
                this.AvailableUpgradeVersions[i] = new String(source.AvailableUpgradeVersions[i]);
            }
        }
        if (source.AvailableUpgrade != null) {
            this.AvailableUpgrade = new Boolean(source.AvailableUpgrade);
        }
        if (source.AvailableRollbackVersion != null) {
            this.AvailableRollbackVersion = new String(source.AvailableRollbackVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "GatewayVersion", this.GatewayVersion);
        this.setParamObj(map, prefix + "NodeConfig.", this.NodeConfig);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "EnableCls", this.EnableCls);
        this.setParamSimple(map, prefix + "TradeType", this.TradeType);
        this.setParamSimple(map, prefix + "FeatureVersion", this.FeatureVersion);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "CurDeadline", this.CurDeadline);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "EnableInternet", this.EnableInternet);
        this.setParamSimple(map, prefix + "EngineRegion", this.EngineRegion);
        this.setParamSimple(map, prefix + "IngressClassName", this.IngressClassName);
        this.setParamSimple(map, prefix + "InternetPayMode", this.InternetPayMode);
        this.setParamSimple(map, prefix + "GatewayMinorVersion", this.GatewayMinorVersion);
        this.setParamObj(map, prefix + "InstancePort.", this.InstancePort);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "DeleteProtect", this.DeleteProtect);
        this.setParamArraySimple(map, prefix + "AvailableVersions.", this.AvailableVersions);
        this.setParamArraySimple(map, prefix + "AvailableUpgradeVersions.", this.AvailableUpgradeVersions);
        this.setParamSimple(map, prefix + "AvailableUpgrade", this.AvailableUpgrade);
        this.setParamSimple(map, prefix + "AvailableRollbackVersion", this.AvailableRollbackVersion);

    }
}

