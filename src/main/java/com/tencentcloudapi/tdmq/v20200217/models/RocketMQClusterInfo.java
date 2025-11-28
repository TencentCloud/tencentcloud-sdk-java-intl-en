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

public class RocketMQClusterInfo extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Region information
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Creation time in milliseconds
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Cluster remarks
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Public network access address
    */
    @SerializedName("PublicEndPoint")
    @Expose
    private String PublicEndPoint;

    /**
    * VPC access address
    */
    @SerializedName("VpcEndPoint")
    @Expose
    private String VpcEndPoint;

    /**
    * Whether the namespace access point is supported.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportNamespaceEndpoint")
    @Expose
    private Boolean SupportNamespaceEndpoint;

    /**
    * VPC Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vpcs")
    @Expose
    private VpcConfig [] Vpcs;

    /**
    * Whether it is an exclusive instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * TDMQ for RocketMQ cluster type flag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RocketMQFlag")
    @Expose
    private Boolean RocketMQFlag;

    /**
    * Billing status (`1`: Normal; `2`: Service suspended; `3`: Terminated)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Service suspension time in milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolateTime")
    @Expose
    private Long IsolateTime;

    /**
    * HTTP-based public network access address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpPublicEndpoint")
    @Expose
    private String HttpPublicEndpoint;

    /**
    * HTTP-based VPC access address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpVpcEndpoint")
    @Expose
    private String HttpVpcEndpoint;

    /**
    * Internal TCP access address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InternalEndpoint")
    @Expose
    private String InternalEndpoint;

    /**
    * Internal HTTP access address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpInternalEndpoint")
    @Expose
    private String HttpInternalEndpoint;

    /**
    * Whether to enable ACL authentication. For Exclusive Edition instances, ACL authentication can be disabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AclEnabled")
    @Expose
    private Boolean AclEnabled;

    /**
    * Public network CLB instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicClbId")
    @Expose
    private String PublicClbId;

    /**
    * vip
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Specifies the VPC it belongs to.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Whether migration is supported.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportMigration")
    @Expose
    private Boolean SupportMigration;

    /**
    * Instance status:
0: Creating
1: Normal
2: Isolating
3: Destroyed
4: Abnormal
5: Deliver failed
6: Changing the configuration
7: Configuration change failed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * Indicates the AZ to which the cluster belongs.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * The AZ where the cluster nodes are located. If the cluster is a cross-AZ cluster, it includes multiple AZs where the cluster nodes are located.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * Whether it is frozen.
    */
    @SerializedName("IsFrozen")
    @Expose
    private Boolean IsFrozen;

    /**
    * Whether to enable automatic topic creation.
    */
    @SerializedName("AutoCreateTopicEnabled")
    @Expose
    private Boolean AutoCreateTopicEnabled;

    /**
    * Whether to enable the admin feature of the cluster.
    */
    @SerializedName("AdminFeatureEnabled")
    @Expose
    private Boolean AdminFeatureEnabled;

    /**
    * Admin AK
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdminAccessKey")
    @Expose
    private String AdminAccessKey;

    /**
    * Admin SK
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdminSecretKey")
    @Expose
    private String AdminSecretKey;

    /**
    * Whether to enable deletion protection
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster name 
     * @return ClusterName Cluster name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
     * @param ClusterName Cluster name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Region information 
     * @return Region Region information
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region information
     * @param Region Region information
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Creation time in milliseconds 
     * @return CreateTime Creation time in milliseconds
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in milliseconds
     * @param CreateTime Creation time in milliseconds
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Cluster remarks
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Remark Cluster remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Cluster remarks
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Remark Cluster remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Public network access address 
     * @return PublicEndPoint Public network access address
     */
    public String getPublicEndPoint() {
        return this.PublicEndPoint;
    }

    /**
     * Set Public network access address
     * @param PublicEndPoint Public network access address
     */
    public void setPublicEndPoint(String PublicEndPoint) {
        this.PublicEndPoint = PublicEndPoint;
    }

    /**
     * Get VPC access address 
     * @return VpcEndPoint VPC access address
     */
    public String getVpcEndPoint() {
        return this.VpcEndPoint;
    }

    /**
     * Set VPC access address
     * @param VpcEndPoint VPC access address
     */
    public void setVpcEndPoint(String VpcEndPoint) {
        this.VpcEndPoint = VpcEndPoint;
    }

    /**
     * Get Whether the namespace access point is supported.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SupportNamespaceEndpoint Whether the namespace access point is supported.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getSupportNamespaceEndpoint() {
        return this.SupportNamespaceEndpoint;
    }

    /**
     * Set Whether the namespace access point is supported.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SupportNamespaceEndpoint Whether the namespace access point is supported.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSupportNamespaceEndpoint(Boolean SupportNamespaceEndpoint) {
        this.SupportNamespaceEndpoint = SupportNamespaceEndpoint;
    }

    /**
     * Get VPC Information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vpcs VPC Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VpcConfig [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set VPC Information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vpcs VPC Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcs(VpcConfig [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get Whether it is an exclusive instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsVip Whether it is an exclusive instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set Whether it is an exclusive instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsVip Whether it is an exclusive instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get TDMQ for RocketMQ cluster type flag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RocketMQFlag TDMQ for RocketMQ cluster type flag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getRocketMQFlag() {
        return this.RocketMQFlag;
    }

    /**
     * Set TDMQ for RocketMQ cluster type flag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RocketMQFlag TDMQ for RocketMQ cluster type flag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRocketMQFlag(Boolean RocketMQFlag) {
        this.RocketMQFlag = RocketMQFlag;
    }

    /**
     * Get Billing status (`1`: Normal; `2`: Service suspended; `3`: Terminated)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Billing status (`1`: Normal; `2`: Service suspended; `3`: Terminated)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Billing status (`1`: Normal; `2`: Service suspended; `3`: Terminated)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Billing status (`1`: Normal; `2`: Service suspended; `3`: Terminated)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Service suspension time in milliseconds
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsolateTime Service suspension time in milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set Service suspension time in milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsolateTime Service suspension time in milliseconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolateTime(Long IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get HTTP-based public network access address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpPublicEndpoint HTTP-based public network access address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpPublicEndpoint() {
        return this.HttpPublicEndpoint;
    }

    /**
     * Set HTTP-based public network access address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpPublicEndpoint HTTP-based public network access address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpPublicEndpoint(String HttpPublicEndpoint) {
        this.HttpPublicEndpoint = HttpPublicEndpoint;
    }

    /**
     * Get HTTP-based VPC access address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpVpcEndpoint HTTP-based VPC access address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpVpcEndpoint() {
        return this.HttpVpcEndpoint;
    }

    /**
     * Set HTTP-based VPC access address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpVpcEndpoint HTTP-based VPC access address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpVpcEndpoint(String HttpVpcEndpoint) {
        this.HttpVpcEndpoint = HttpVpcEndpoint;
    }

    /**
     * Get Internal TCP access address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InternalEndpoint Internal TCP access address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInternalEndpoint() {
        return this.InternalEndpoint;
    }

    /**
     * Set Internal TCP access address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InternalEndpoint Internal TCP access address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInternalEndpoint(String InternalEndpoint) {
        this.InternalEndpoint = InternalEndpoint;
    }

    /**
     * Get Internal HTTP access address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpInternalEndpoint Internal HTTP access address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpInternalEndpoint() {
        return this.HttpInternalEndpoint;
    }

    /**
     * Set Internal HTTP access address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpInternalEndpoint Internal HTTP access address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpInternalEndpoint(String HttpInternalEndpoint) {
        this.HttpInternalEndpoint = HttpInternalEndpoint;
    }

    /**
     * Get Whether to enable ACL authentication. For Exclusive Edition instances, ACL authentication can be disabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AclEnabled Whether to enable ACL authentication. For Exclusive Edition instances, ACL authentication can be disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAclEnabled() {
        return this.AclEnabled;
    }

    /**
     * Set Whether to enable ACL authentication. For Exclusive Edition instances, ACL authentication can be disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AclEnabled Whether to enable ACL authentication. For Exclusive Edition instances, ACL authentication can be disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAclEnabled(Boolean AclEnabled) {
        this.AclEnabled = AclEnabled;
    }

    /**
     * Get Public network CLB instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicClbId Public network CLB instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicClbId() {
        return this.PublicClbId;
    }

    /**
     * Set Public network CLB instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicClbId Public network CLB instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicClbId(String PublicClbId) {
        this.PublicClbId = PublicClbId;
    }

    /**
     * Get vip
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vip vip
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set vip
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vip vip
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Specifies the VPC it belongs to.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId Specifies the VPC it belongs to.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Specifies the VPC it belongs to.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId Specifies the VPC it belongs to.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Whether migration is supported.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportMigration Whether migration is supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSupportMigration() {
        return this.SupportMigration;
    }

    /**
     * Set Whether migration is supported.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportMigration Whether migration is supported.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportMigration(Boolean SupportMigration) {
        this.SupportMigration = SupportMigration;
    }

    /**
     * Get Instance status:
0: Creating
1: Normal
2: Isolating
3: Destroyed
4: Abnormal
5: Deliver failed
6: Changing the configuration
7: Configuration change failed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceStatus Instance status:
0: Creating
1: Normal
2: Isolating
3: Destroyed
4: Abnormal
5: Deliver failed
6: Changing the configuration
7: Configuration change failed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance status:
0: Creating
1: Normal
2: Isolating
3: Destroyed
4: Abnormal
5: Deliver failed
6: Changing the configuration
7: Configuration change failed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceStatus Instance status:
0: Creating
1: Normal
2: Isolating
3: Destroyed
4: Abnormal
5: Deliver failed
6: Changing the configuration
7: Configuration change failed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Indicates the AZ to which the cluster belongs.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneId Indicates the AZ to which the cluster belongs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Indicates the AZ to which the cluster belongs.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneId Indicates the AZ to which the cluster belongs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The AZ where the cluster nodes are located. If the cluster is a cross-AZ cluster, it includes multiple AZs where the cluster nodes are located.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneIds The AZ where the cluster nodes are located. If the cluster is a cross-AZ cluster, it includes multiple AZs where the cluster nodes are located.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set The AZ where the cluster nodes are located. If the cluster is a cross-AZ cluster, it includes multiple AZs where the cluster nodes are located.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneIds The AZ where the cluster nodes are located. If the cluster is a cross-AZ cluster, it includes multiple AZs where the cluster nodes are located.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Whether it is frozen. 
     * @return IsFrozen Whether it is frozen.
     */
    public Boolean getIsFrozen() {
        return this.IsFrozen;
    }

    /**
     * Set Whether it is frozen.
     * @param IsFrozen Whether it is frozen.
     */
    public void setIsFrozen(Boolean IsFrozen) {
        this.IsFrozen = IsFrozen;
    }

    /**
     * Get Whether to enable automatic topic creation. 
     * @return AutoCreateTopicEnabled Whether to enable automatic topic creation.
     */
    public Boolean getAutoCreateTopicEnabled() {
        return this.AutoCreateTopicEnabled;
    }

    /**
     * Set Whether to enable automatic topic creation.
     * @param AutoCreateTopicEnabled Whether to enable automatic topic creation.
     */
    public void setAutoCreateTopicEnabled(Boolean AutoCreateTopicEnabled) {
        this.AutoCreateTopicEnabled = AutoCreateTopicEnabled;
    }

    /**
     * Get Whether to enable the admin feature of the cluster. 
     * @return AdminFeatureEnabled Whether to enable the admin feature of the cluster.
     */
    public Boolean getAdminFeatureEnabled() {
        return this.AdminFeatureEnabled;
    }

    /**
     * Set Whether to enable the admin feature of the cluster.
     * @param AdminFeatureEnabled Whether to enable the admin feature of the cluster.
     */
    public void setAdminFeatureEnabled(Boolean AdminFeatureEnabled) {
        this.AdminFeatureEnabled = AdminFeatureEnabled;
    }

    /**
     * Get Admin AK
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AdminAccessKey Admin AK
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAdminAccessKey() {
        return this.AdminAccessKey;
    }

    /**
     * Set Admin AK
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AdminAccessKey Admin AK
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAdminAccessKey(String AdminAccessKey) {
        this.AdminAccessKey = AdminAccessKey;
    }

    /**
     * Get Admin SK
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AdminSecretKey Admin SK
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAdminSecretKey() {
        return this.AdminSecretKey;
    }

    /**
     * Set Admin SK
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AdminSecretKey Admin SK
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAdminSecretKey(String AdminSecretKey) {
        this.AdminSecretKey = AdminSecretKey;
    }

    /**
     * Get Whether to enable deletion protection 
     * @return EnableDeletionProtection Whether to enable deletion protection
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set Whether to enable deletion protection
     * @param EnableDeletionProtection Whether to enable deletion protection
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    public RocketMQClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQClusterInfo(RocketMQClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PublicEndPoint != null) {
            this.PublicEndPoint = new String(source.PublicEndPoint);
        }
        if (source.VpcEndPoint != null) {
            this.VpcEndPoint = new String(source.VpcEndPoint);
        }
        if (source.SupportNamespaceEndpoint != null) {
            this.SupportNamespaceEndpoint = new Boolean(source.SupportNamespaceEndpoint);
        }
        if (source.Vpcs != null) {
            this.Vpcs = new VpcConfig[source.Vpcs.length];
            for (int i = 0; i < source.Vpcs.length; i++) {
                this.Vpcs[i] = new VpcConfig(source.Vpcs[i]);
            }
        }
        if (source.IsVip != null) {
            this.IsVip = new Boolean(source.IsVip);
        }
        if (source.RocketMQFlag != null) {
            this.RocketMQFlag = new Boolean(source.RocketMQFlag);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new Long(source.IsolateTime);
        }
        if (source.HttpPublicEndpoint != null) {
            this.HttpPublicEndpoint = new String(source.HttpPublicEndpoint);
        }
        if (source.HttpVpcEndpoint != null) {
            this.HttpVpcEndpoint = new String(source.HttpVpcEndpoint);
        }
        if (source.InternalEndpoint != null) {
            this.InternalEndpoint = new String(source.InternalEndpoint);
        }
        if (source.HttpInternalEndpoint != null) {
            this.HttpInternalEndpoint = new String(source.HttpInternalEndpoint);
        }
        if (source.AclEnabled != null) {
            this.AclEnabled = new Boolean(source.AclEnabled);
        }
        if (source.PublicClbId != null) {
            this.PublicClbId = new String(source.PublicClbId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SupportMigration != null) {
            this.SupportMigration = new Boolean(source.SupportMigration);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.IsFrozen != null) {
            this.IsFrozen = new Boolean(source.IsFrozen);
        }
        if (source.AutoCreateTopicEnabled != null) {
            this.AutoCreateTopicEnabled = new Boolean(source.AutoCreateTopicEnabled);
        }
        if (source.AdminFeatureEnabled != null) {
            this.AdminFeatureEnabled = new Boolean(source.AdminFeatureEnabled);
        }
        if (source.AdminAccessKey != null) {
            this.AdminAccessKey = new String(source.AdminAccessKey);
        }
        if (source.AdminSecretKey != null) {
            this.AdminSecretKey = new String(source.AdminSecretKey);
        }
        if (source.EnableDeletionProtection != null) {
            this.EnableDeletionProtection = new Boolean(source.EnableDeletionProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PublicEndPoint", this.PublicEndPoint);
        this.setParamSimple(map, prefix + "VpcEndPoint", this.VpcEndPoint);
        this.setParamSimple(map, prefix + "SupportNamespaceEndpoint", this.SupportNamespaceEndpoint);
        this.setParamArrayObj(map, prefix + "Vpcs.", this.Vpcs);
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "RocketMQFlag", this.RocketMQFlag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "HttpPublicEndpoint", this.HttpPublicEndpoint);
        this.setParamSimple(map, prefix + "HttpVpcEndpoint", this.HttpVpcEndpoint);
        this.setParamSimple(map, prefix + "InternalEndpoint", this.InternalEndpoint);
        this.setParamSimple(map, prefix + "HttpInternalEndpoint", this.HttpInternalEndpoint);
        this.setParamSimple(map, prefix + "AclEnabled", this.AclEnabled);
        this.setParamSimple(map, prefix + "PublicClbId", this.PublicClbId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SupportMigration", this.SupportMigration);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "IsFrozen", this.IsFrozen);
        this.setParamSimple(map, prefix + "AutoCreateTopicEnabled", this.AutoCreateTopicEnabled);
        this.setParamSimple(map, prefix + "AdminFeatureEnabled", this.AdminFeatureEnabled);
        this.setParamSimple(map, prefix + "AdminAccessKey", this.AdminAccessKey);
        this.setParamSimple(map, prefix + "AdminSecretKey", this.AdminSecretKey);
        this.setParamSimple(map, prefix + "EnableDeletionProtection", this.EnableDeletionProtection);

    }
}

