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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQVipInstance extends AbstractModel {

    /**
    * <p>Instance ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Instance version</p>
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
    * <p>Instance status. 0 indicates creating in progress, 1 indicates normal, 2 indicates isolated, 3 indicates terminated, 4 - abnormal, 5 - delivery failed</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Node count</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>Instance configuration specification name</p>
    */
    @SerializedName("ConfigDisplay")
    @Expose
    private String ConfigDisplay;

    /**
    * <p>Peak TPS</p>
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * <p>Peak bandwidth in Mbps</p>
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * <p>Storage capacity in GB</p>
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * <p>Instance expiration time. The value is 0 for pay-as-you-go instances, in milliseconds. unix timestamp.</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>Auto-renewal flag. 0 means default state (not set by the user, i.e., initial state is manual renewal), 1 means auto-renew, 2 means explicitly no auto-renew (set by the user)</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>1 indicates prepaid mode, 0 indicates postpaid</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Remark information</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Node specification of the cluster with corresponding flag:<br>2C8G: rabbit-vip-profession-2c8g<br>4C16G: rabbit-vip-profession-4c16g<br>8C32G: rabbit-vip-profession-8c32g<br>16C32G: rabbit-vip-basic-4<br>16C64G: rabbit-vip-profession-16c64g<br>2C4G: rabbit-vip-basic-5<br>4C8G: rabbit-vip-basic-1<br>8C16G (sold out): rabbit-vip-basic-2<br>Defaults to 4C8G: rabbit-vip-basic-1 if not specified</p>
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * <p>Cluster exception information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExceptionInformation")
    @Expose
    private String ExceptionInformation;

    /**
    * <p>Instance status. 0 indicates creating in progress, 1 indicates normal, 2 indicates isolated, 3 indicates terminated, 4 - abnormal, 5 - delivery failed<br>To separate from the billing area, enable an additional status bit for display.</p>
    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
    * <p>public network access point</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicAccessEndpoint")
    @Expose
    private String PublicAccessEndpoint;

    /**
    * <p>VPC access point list</p>
    */
    @SerializedName("Vpcs")
    @Expose
    private VpcEndpointInfo [] Vpcs;

    /**
    * <p>Creation time in milliseconds. unix timestamp</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>Instance type</p><p>Enumeration value:</p><ul><li>0: Managed version instance</li></ul>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>Isolation time in milliseconds. unix timestamp</p>
    */
    @SerializedName("IsolatedTime")
    @Expose
    private Long IsolatedTime;

    /**
    * <p>Whether deletion protection is enabled</p>
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

    /**
    * <p>Tag list</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>public data stream Stream access point</p>
    */
    @SerializedName("PublicStreamAccessEndpoint")
    @Expose
    private String PublicStreamAccessEndpoint;

    /**
     * Get <p>Instance ID</p> 
     * @return InstanceId <p>Instance ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID</p>
     * @param InstanceId <p>Instance ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance name</p> 
     * @return InstanceName <p>Instance name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name</p>
     * @param InstanceName <p>Instance name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Instance version</p> 
     * @return InstanceVersion <p>Instance version</p>
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set <p>Instance version</p>
     * @param InstanceVersion <p>Instance version</p>
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get <p>Instance status. 0 indicates creating in progress, 1 indicates normal, 2 indicates isolated, 3 indicates terminated, 4 - abnormal, 5 - delivery failed</p> 
     * @return Status <p>Instance status. 0 indicates creating in progress, 1 indicates normal, 2 indicates isolated, 3 indicates terminated, 4 - abnormal, 5 - delivery failed</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Instance status. 0 indicates creating in progress, 1 indicates normal, 2 indicates isolated, 3 indicates terminated, 4 - abnormal, 5 - delivery failed</p>
     * @param Status <p>Instance status. 0 indicates creating in progress, 1 indicates normal, 2 indicates isolated, 3 indicates terminated, 4 - abnormal, 5 - delivery failed</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Node count</p> 
     * @return NodeCount <p>Node count</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>Node count</p>
     * @param NodeCount <p>Node count</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get <p>Instance configuration specification name</p> 
     * @return ConfigDisplay <p>Instance configuration specification name</p>
     */
    public String getConfigDisplay() {
        return this.ConfigDisplay;
    }

    /**
     * Set <p>Instance configuration specification name</p>
     * @param ConfigDisplay <p>Instance configuration specification name</p>
     */
    public void setConfigDisplay(String ConfigDisplay) {
        this.ConfigDisplay = ConfigDisplay;
    }

    /**
     * Get <p>Peak TPS</p> 
     * @return MaxTps <p>Peak TPS</p>
     */
    public Long getMaxTps() {
        return this.MaxTps;
    }

    /**
     * Set <p>Peak TPS</p>
     * @param MaxTps <p>Peak TPS</p>
     */
    public void setMaxTps(Long MaxTps) {
        this.MaxTps = MaxTps;
    }

    /**
     * Get <p>Peak bandwidth in Mbps</p> 
     * @return MaxBandWidth <p>Peak bandwidth in Mbps</p>
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set <p>Peak bandwidth in Mbps</p>
     * @param MaxBandWidth <p>Peak bandwidth in Mbps</p>
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get <p>Storage capacity in GB</p> 
     * @return MaxStorage <p>Storage capacity in GB</p>
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set <p>Storage capacity in GB</p>
     * @param MaxStorage <p>Storage capacity in GB</p>
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get <p>Instance expiration time. The value is 0 for pay-as-you-go instances, in milliseconds. unix timestamp.</p> 
     * @return ExpireTime <p>Instance expiration time. The value is 0 for pay-as-you-go instances, in milliseconds. unix timestamp.</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Instance expiration time. The value is 0 for pay-as-you-go instances, in milliseconds. unix timestamp.</p>
     * @param ExpireTime <p>Instance expiration time. The value is 0 for pay-as-you-go instances, in milliseconds. unix timestamp.</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Auto-renewal flag. 0 means default state (not set by the user, i.e., initial state is manual renewal), 1 means auto-renew, 2 means explicitly no auto-renew (set by the user)</p> 
     * @return AutoRenewFlag <p>Auto-renewal flag. 0 means default state (not set by the user, i.e., initial state is manual renewal), 1 means auto-renew, 2 means explicitly no auto-renew (set by the user)</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>Auto-renewal flag. 0 means default state (not set by the user, i.e., initial state is manual renewal), 1 means auto-renew, 2 means explicitly no auto-renew (set by the user)</p>
     * @param AutoRenewFlag <p>Auto-renewal flag. 0 means default state (not set by the user, i.e., initial state is manual renewal), 1 means auto-renew, 2 means explicitly no auto-renew (set by the user)</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>1 indicates prepaid mode, 0 indicates postpaid</p> 
     * @return PayMode <p>1 indicates prepaid mode, 0 indicates postpaid</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>1 indicates prepaid mode, 0 indicates postpaid</p>
     * @param PayMode <p>1 indicates prepaid mode, 0 indicates postpaid</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Remark information</p> 
     * @return Remark <p>Remark information</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remark information</p>
     * @param Remark <p>Remark information</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Node specification of the cluster with corresponding flag:<br>2C8G: rabbit-vip-profession-2c8g<br>4C16G: rabbit-vip-profession-4c16g<br>8C32G: rabbit-vip-profession-8c32g<br>16C32G: rabbit-vip-basic-4<br>16C64G: rabbit-vip-profession-16c64g<br>2C4G: rabbit-vip-basic-5<br>4C8G: rabbit-vip-basic-1<br>8C16G (sold out): rabbit-vip-basic-2<br>Defaults to 4C8G: rabbit-vip-basic-1 if not specified</p> 
     * @return SpecName <p>Node specification of the cluster with corresponding flag:<br>2C8G: rabbit-vip-profession-2c8g<br>4C16G: rabbit-vip-profession-4c16g<br>8C32G: rabbit-vip-profession-8c32g<br>16C32G: rabbit-vip-basic-4<br>16C64G: rabbit-vip-profession-16c64g<br>2C4G: rabbit-vip-basic-5<br>4C8G: rabbit-vip-basic-1<br>8C16G (sold out): rabbit-vip-basic-2<br>Defaults to 4C8G: rabbit-vip-basic-1 if not specified</p>
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set <p>Node specification of the cluster with corresponding flag:<br>2C8G: rabbit-vip-profession-2c8g<br>4C16G: rabbit-vip-profession-4c16g<br>8C32G: rabbit-vip-profession-8c32g<br>16C32G: rabbit-vip-basic-4<br>16C64G: rabbit-vip-profession-16c64g<br>2C4G: rabbit-vip-basic-5<br>4C8G: rabbit-vip-basic-1<br>8C16G (sold out): rabbit-vip-basic-2<br>Defaults to 4C8G: rabbit-vip-basic-1 if not specified</p>
     * @param SpecName <p>Node specification of the cluster with corresponding flag:<br>2C8G: rabbit-vip-profession-2c8g<br>4C16G: rabbit-vip-profession-4c16g<br>8C32G: rabbit-vip-profession-8c32g<br>16C32G: rabbit-vip-basic-4<br>16C64G: rabbit-vip-profession-16c64g<br>2C4G: rabbit-vip-basic-5<br>4C8G: rabbit-vip-basic-1<br>8C16G (sold out): rabbit-vip-basic-2<br>Defaults to 4C8G: rabbit-vip-basic-1 if not specified</p>
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get <p>Cluster exception information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExceptionInformation <p>Cluster exception information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExceptionInformation() {
        return this.ExceptionInformation;
    }

    /**
     * Set <p>Cluster exception information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExceptionInformation <p>Cluster exception information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExceptionInformation(String ExceptionInformation) {
        this.ExceptionInformation = ExceptionInformation;
    }

    /**
     * Get <p>Instance status. 0 indicates creating in progress, 1 indicates normal, 2 indicates isolated, 3 indicates terminated, 4 - abnormal, 5 - delivery failed<br>To separate from the billing area, enable an additional status bit for display.</p> 
     * @return ClusterStatus <p>Instance status. 0 indicates creating in progress, 1 indicates normal, 2 indicates isolated, 3 indicates terminated, 4 - abnormal, 5 - delivery failed<br>To separate from the billing area, enable an additional status bit for display.</p>
     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set <p>Instance status. 0 indicates creating in progress, 1 indicates normal, 2 indicates isolated, 3 indicates terminated, 4 - abnormal, 5 - delivery failed<br>To separate from the billing area, enable an additional status bit for display.</p>
     * @param ClusterStatus <p>Instance status. 0 indicates creating in progress, 1 indicates normal, 2 indicates isolated, 3 indicates terminated, 4 - abnormal, 5 - delivery failed<br>To separate from the billing area, enable an additional status bit for display.</p>
     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get <p>public network access point</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicAccessEndpoint <p>public network access point</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicAccessEndpoint() {
        return this.PublicAccessEndpoint;
    }

    /**
     * Set <p>public network access point</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicAccessEndpoint <p>public network access point</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicAccessEndpoint(String PublicAccessEndpoint) {
        this.PublicAccessEndpoint = PublicAccessEndpoint;
    }

    /**
     * Get <p>VPC access point list</p> 
     * @return Vpcs <p>VPC access point list</p>
     */
    public VpcEndpointInfo [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set <p>VPC access point list</p>
     * @param Vpcs <p>VPC access point list</p>
     */
    public void setVpcs(VpcEndpointInfo [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get <p>Creation time in milliseconds. unix timestamp</p> 
     * @return CreateTime <p>Creation time in milliseconds. unix timestamp</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time in milliseconds. unix timestamp</p>
     * @param CreateTime <p>Creation time in milliseconds. unix timestamp</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Instance type</p><p>Enumeration value:</p><ul><li>0: Managed version instance</li></ul> 
     * @return InstanceType <p>Instance type</p><p>Enumeration value:</p><ul><li>0: Managed version instance</li></ul>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance type</p><p>Enumeration value:</p><ul><li>0: Managed version instance</li></ul>
     * @param InstanceType <p>Instance type</p><p>Enumeration value:</p><ul><li>0: Managed version instance</li></ul>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Isolation time in milliseconds. unix timestamp</p> 
     * @return IsolatedTime <p>Isolation time in milliseconds. unix timestamp</p>
     */
    public Long getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set <p>Isolation time in milliseconds. unix timestamp</p>
     * @param IsolatedTime <p>Isolation time in milliseconds. unix timestamp</p>
     */
    public void setIsolatedTime(Long IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get <p>Whether deletion protection is enabled</p> 
     * @return EnableDeletionProtection <p>Whether deletion protection is enabled</p>
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set <p>Whether deletion protection is enabled</p>
     * @param EnableDeletionProtection <p>Whether deletion protection is enabled</p>
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    /**
     * Get <p>Tag list</p> 
     * @return Tags <p>Tag list</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag list</p>
     * @param Tags <p>Tag list</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>public data stream Stream access point</p> 
     * @return PublicStreamAccessEndpoint <p>public data stream Stream access point</p>
     */
    public String getPublicStreamAccessEndpoint() {
        return this.PublicStreamAccessEndpoint;
    }

    /**
     * Set <p>public data stream Stream access point</p>
     * @param PublicStreamAccessEndpoint <p>public data stream Stream access point</p>
     */
    public void setPublicStreamAccessEndpoint(String PublicStreamAccessEndpoint) {
        this.PublicStreamAccessEndpoint = PublicStreamAccessEndpoint;
    }

    public RabbitMQVipInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQVipInstance(RabbitMQVipInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.ConfigDisplay != null) {
            this.ConfigDisplay = new String(source.ConfigDisplay);
        }
        if (source.MaxTps != null) {
            this.MaxTps = new Long(source.MaxTps);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.ExceptionInformation != null) {
            this.ExceptionInformation = new String(source.ExceptionInformation);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new Long(source.ClusterStatus);
        }
        if (source.PublicAccessEndpoint != null) {
            this.PublicAccessEndpoint = new String(source.PublicAccessEndpoint);
        }
        if (source.Vpcs != null) {
            this.Vpcs = new VpcEndpointInfo[source.Vpcs.length];
            for (int i = 0; i < source.Vpcs.length; i++) {
                this.Vpcs[i] = new VpcEndpointInfo(source.Vpcs[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new Long(source.IsolatedTime);
        }
        if (source.EnableDeletionProtection != null) {
            this.EnableDeletionProtection = new Boolean(source.EnableDeletionProtection);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.PublicStreamAccessEndpoint != null) {
            this.PublicStreamAccessEndpoint = new String(source.PublicStreamAccessEndpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "ConfigDisplay", this.ConfigDisplay);
        this.setParamSimple(map, prefix + "MaxTps", this.MaxTps);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "ExceptionInformation", this.ExceptionInformation);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "PublicAccessEndpoint", this.PublicAccessEndpoint);
        this.setParamArrayObj(map, prefix + "Vpcs.", this.Vpcs);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "EnableDeletionProtection", this.EnableDeletionProtection);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PublicStreamAccessEndpoint", this.PublicStreamAccessEndpoint);

    }
}

