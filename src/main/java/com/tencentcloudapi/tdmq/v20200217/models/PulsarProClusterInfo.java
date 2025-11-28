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

public class PulsarProClusterInfo extends AbstractModel {

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
    * Description
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Cluster status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Cluster version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Node distribution
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeDistribution")
    @Expose
    private InstanceNodeDistribution [] NodeDistribution;

    /**
    * Max storage capacity in MB
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * Whether the route can be modified
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CanEditRoute")
    @Expose
    private Boolean CanEditRoute;

    /**
    * Specifies different billing specifications for pro edition and small-scale professional edition: PULSAR.P1 fixed storage and PULSAR.P2 elastic storage.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BillingLabelVersion")
    @Expose
    private String BillingLabelVersion;

    /**
    * Instance expiration timestamp, accurate to the millisecond level.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * Whether to enable automatic topic creation.
true indicates enabled. false indicates disabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoCreateTopicStatus")
    @Expose
    private Boolean AutoCreateTopicStatus;

    /**
    * Specifies the default number of partitions for automatic topic creation. valid values: 0 if not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultPartitionNumber")
    @Expose
    private Long DefaultPartitionNumber;

    /**
    * User-Defined tenant alias. if there is no, reuse the professional cluster ID.

    */
    @SerializedName("Tenant")
    @Expose
    private String Tenant;

    /**
    * Deletion protection switch flag.
    */
    @SerializedName("DeleteProtection")
    @Expose
    private Long DeleteProtection;

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
     * Get Description 
     * @return Remark Description
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Description
     * @param Remark Description
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Cluster status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated). 
     * @return Status Cluster status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated).
     * @param Status Cluster status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Cluster version 
     * @return Version Cluster version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Cluster version
     * @param Version Cluster version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Node distribution
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeDistribution Node distribution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceNodeDistribution [] getNodeDistribution() {
        return this.NodeDistribution;
    }

    /**
     * Set Node distribution
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeDistribution Node distribution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeDistribution(InstanceNodeDistribution [] NodeDistribution) {
        this.NodeDistribution = NodeDistribution;
    }

    /**
     * Get Max storage capacity in MB 
     * @return MaxStorage Max storage capacity in MB
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set Max storage capacity in MB
     * @param MaxStorage Max storage capacity in MB
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get Whether the route can be modified
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CanEditRoute Whether the route can be modified
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getCanEditRoute() {
        return this.CanEditRoute;
    }

    /**
     * Set Whether the route can be modified
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CanEditRoute Whether the route can be modified
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCanEditRoute(Boolean CanEditRoute) {
        this.CanEditRoute = CanEditRoute;
    }

    /**
     * Get Specifies different billing specifications for pro edition and small-scale professional edition: PULSAR.P1 fixed storage and PULSAR.P2 elastic storage.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BillingLabelVersion Specifies different billing specifications for pro edition and small-scale professional edition: PULSAR.P1 fixed storage and PULSAR.P2 elastic storage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBillingLabelVersion() {
        return this.BillingLabelVersion;
    }

    /**
     * Set Specifies different billing specifications for pro edition and small-scale professional edition: PULSAR.P1 fixed storage and PULSAR.P2 elastic storage.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BillingLabelVersion Specifies different billing specifications for pro edition and small-scale professional edition: PULSAR.P1 fixed storage and PULSAR.P2 elastic storage.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBillingLabelVersion(String BillingLabelVersion) {
        this.BillingLabelVersion = BillingLabelVersion;
    }

    /**
     * Get Instance expiration timestamp, accurate to the millisecond level.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Instance expiration timestamp, accurate to the millisecond level.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Instance expiration timestamp, accurate to the millisecond level.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Instance expiration timestamp, accurate to the millisecond level.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Whether to enable automatic topic creation.
true indicates enabled. false indicates disabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoCreateTopicStatus Whether to enable automatic topic creation.
true indicates enabled. false indicates disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAutoCreateTopicStatus() {
        return this.AutoCreateTopicStatus;
    }

    /**
     * Set Whether to enable automatic topic creation.
true indicates enabled. false indicates disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoCreateTopicStatus Whether to enable automatic topic creation.
true indicates enabled. false indicates disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoCreateTopicStatus(Boolean AutoCreateTopicStatus) {
        this.AutoCreateTopicStatus = AutoCreateTopicStatus;
    }

    /**
     * Get Specifies the default number of partitions for automatic topic creation. valid values: 0 if not enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultPartitionNumber Specifies the default number of partitions for automatic topic creation. valid values: 0 if not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefaultPartitionNumber() {
        return this.DefaultPartitionNumber;
    }

    /**
     * Set Specifies the default number of partitions for automatic topic creation. valid values: 0 if not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultPartitionNumber Specifies the default number of partitions for automatic topic creation. valid values: 0 if not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultPartitionNumber(Long DefaultPartitionNumber) {
        this.DefaultPartitionNumber = DefaultPartitionNumber;
    }

    /**
     * Get User-Defined tenant alias. if there is no, reuse the professional cluster ID.
 
     * @return Tenant User-Defined tenant alias. if there is no, reuse the professional cluster ID.

     */
    public String getTenant() {
        return this.Tenant;
    }

    /**
     * Set User-Defined tenant alias. if there is no, reuse the professional cluster ID.

     * @param Tenant User-Defined tenant alias. if there is no, reuse the professional cluster ID.

     */
    public void setTenant(String Tenant) {
        this.Tenant = Tenant;
    }

    /**
     * Get Deletion protection switch flag. 
     * @return DeleteProtection Deletion protection switch flag.
     */
    public Long getDeleteProtection() {
        return this.DeleteProtection;
    }

    /**
     * Set Deletion protection switch flag.
     * @param DeleteProtection Deletion protection switch flag.
     */
    public void setDeleteProtection(Long DeleteProtection) {
        this.DeleteProtection = DeleteProtection;
    }

    public PulsarProClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PulsarProClusterInfo(PulsarProClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.NodeDistribution != null) {
            this.NodeDistribution = new InstanceNodeDistribution[source.NodeDistribution.length];
            for (int i = 0; i < source.NodeDistribution.length; i++) {
                this.NodeDistribution[i] = new InstanceNodeDistribution(source.NodeDistribution[i]);
            }
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.CanEditRoute != null) {
            this.CanEditRoute = new Boolean(source.CanEditRoute);
        }
        if (source.BillingLabelVersion != null) {
            this.BillingLabelVersion = new String(source.BillingLabelVersion);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.AutoCreateTopicStatus != null) {
            this.AutoCreateTopicStatus = new Boolean(source.AutoCreateTopicStatus);
        }
        if (source.DefaultPartitionNumber != null) {
            this.DefaultPartitionNumber = new Long(source.DefaultPartitionNumber);
        }
        if (source.Tenant != null) {
            this.Tenant = new String(source.Tenant);
        }
        if (source.DeleteProtection != null) {
            this.DeleteProtection = new Long(source.DeleteProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "NodeDistribution.", this.NodeDistribution);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "CanEditRoute", this.CanEditRoute);
        this.setParamSimple(map, prefix + "BillingLabelVersion", this.BillingLabelVersion);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoCreateTopicStatus", this.AutoCreateTopicStatus);
        this.setParamSimple(map, prefix + "DefaultPartitionNumber", this.DefaultPartitionNumber);
        this.setParamSimple(map, prefix + "Tenant", this.Tenant);
        this.setParamSimple(map, prefix + "DeleteProtection", this.DeleteProtection);

    }
}

