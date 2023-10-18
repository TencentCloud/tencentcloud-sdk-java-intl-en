/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoGroup extends AbstractModel {

    /**
    * Read-only group mode. Valid values: `alone` (the system assigns a read-only group automatically), `allinone` (a new read-only group will be created), `join` (an existing read-only group will be used).
    */
    @SerializedName("RoGroupMode")
    @Expose
    private String RoGroupMode;

    /**
    * Read-only group ID.
    */
    @SerializedName("RoGroupId")
    @Expose
    private String RoGroupId;

    /**
    * Read-only group name.
    */
    @SerializedName("RoGroupName")
    @Expose
    private String RoGroupName;

    /**
    * Whether to enable the function of isolating an instance that exceeds the latency threshold. If it is enabled, when the latency between the read-only instance and the primary instance exceeds the latency threshold, the read-only instance will be isolated. Valid values: 1 (enabled), 0 (not enabled)
    */
    @SerializedName("RoOfflineDelay")
    @Expose
    private Long RoOfflineDelay;

    /**
    * Latency threshold
    */
    @SerializedName("RoMaxDelayTime")
    @Expose
    private Long RoMaxDelayTime;

    /**
    * Minimum number of instances to be retained. If the number of the purchased read-only instances is smaller than the set value, they will not be removed.
    */
    @SerializedName("MinRoInGroup")
    @Expose
    private Long MinRoInGroup;

    /**
    * Read/write weight distribution mode. Valid values: `system` (weights are assigned by the system automatically), `custom` (weights are customized)
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * This field has been disused. To view the weight of a read-only instance, check the `Weight` value in the `RoInstances` field.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Details of read-only instances in read-only group
    */
    @SerializedName("RoInstances")
    @Expose
    private RoInstanceInfo [] RoInstances;

    /**
    * Private IP of read-only group.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Private network port number of read-only group.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Subnet ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Read-only group region.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoGroupRegion")
    @Expose
    private String RoGroupRegion;

    /**
    * Read-only group AZ.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoGroupZone")
    @Expose
    private String RoGroupZone;

    /**
    * Replication delay.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DelayReplicationTime")
    @Expose
    private Long DelayReplicationTime;

    /**
     * Get Read-only group mode. Valid values: `alone` (the system assigns a read-only group automatically), `allinone` (a new read-only group will be created), `join` (an existing read-only group will be used). 
     * @return RoGroupMode Read-only group mode. Valid values: `alone` (the system assigns a read-only group automatically), `allinone` (a new read-only group will be created), `join` (an existing read-only group will be used).
     */
    public String getRoGroupMode() {
        return this.RoGroupMode;
    }

    /**
     * Set Read-only group mode. Valid values: `alone` (the system assigns a read-only group automatically), `allinone` (a new read-only group will be created), `join` (an existing read-only group will be used).
     * @param RoGroupMode Read-only group mode. Valid values: `alone` (the system assigns a read-only group automatically), `allinone` (a new read-only group will be created), `join` (an existing read-only group will be used).
     */
    public void setRoGroupMode(String RoGroupMode) {
        this.RoGroupMode = RoGroupMode;
    }

    /**
     * Get Read-only group ID. 
     * @return RoGroupId Read-only group ID.
     */
    public String getRoGroupId() {
        return this.RoGroupId;
    }

    /**
     * Set Read-only group ID.
     * @param RoGroupId Read-only group ID.
     */
    public void setRoGroupId(String RoGroupId) {
        this.RoGroupId = RoGroupId;
    }

    /**
     * Get Read-only group name. 
     * @return RoGroupName Read-only group name.
     */
    public String getRoGroupName() {
        return this.RoGroupName;
    }

    /**
     * Set Read-only group name.
     * @param RoGroupName Read-only group name.
     */
    public void setRoGroupName(String RoGroupName) {
        this.RoGroupName = RoGroupName;
    }

    /**
     * Get Whether to enable the function of isolating an instance that exceeds the latency threshold. If it is enabled, when the latency between the read-only instance and the primary instance exceeds the latency threshold, the read-only instance will be isolated. Valid values: 1 (enabled), 0 (not enabled) 
     * @return RoOfflineDelay Whether to enable the function of isolating an instance that exceeds the latency threshold. If it is enabled, when the latency between the read-only instance and the primary instance exceeds the latency threshold, the read-only instance will be isolated. Valid values: 1 (enabled), 0 (not enabled)
     */
    public Long getRoOfflineDelay() {
        return this.RoOfflineDelay;
    }

    /**
     * Set Whether to enable the function of isolating an instance that exceeds the latency threshold. If it is enabled, when the latency between the read-only instance and the primary instance exceeds the latency threshold, the read-only instance will be isolated. Valid values: 1 (enabled), 0 (not enabled)
     * @param RoOfflineDelay Whether to enable the function of isolating an instance that exceeds the latency threshold. If it is enabled, when the latency between the read-only instance and the primary instance exceeds the latency threshold, the read-only instance will be isolated. Valid values: 1 (enabled), 0 (not enabled)
     */
    public void setRoOfflineDelay(Long RoOfflineDelay) {
        this.RoOfflineDelay = RoOfflineDelay;
    }

    /**
     * Get Latency threshold 
     * @return RoMaxDelayTime Latency threshold
     */
    public Long getRoMaxDelayTime() {
        return this.RoMaxDelayTime;
    }

    /**
     * Set Latency threshold
     * @param RoMaxDelayTime Latency threshold
     */
    public void setRoMaxDelayTime(Long RoMaxDelayTime) {
        this.RoMaxDelayTime = RoMaxDelayTime;
    }

    /**
     * Get Minimum number of instances to be retained. If the number of the purchased read-only instances is smaller than the set value, they will not be removed. 
     * @return MinRoInGroup Minimum number of instances to be retained. If the number of the purchased read-only instances is smaller than the set value, they will not be removed.
     */
    public Long getMinRoInGroup() {
        return this.MinRoInGroup;
    }

    /**
     * Set Minimum number of instances to be retained. If the number of the purchased read-only instances is smaller than the set value, they will not be removed.
     * @param MinRoInGroup Minimum number of instances to be retained. If the number of the purchased read-only instances is smaller than the set value, they will not be removed.
     */
    public void setMinRoInGroup(Long MinRoInGroup) {
        this.MinRoInGroup = MinRoInGroup;
    }

    /**
     * Get Read/write weight distribution mode. Valid values: `system` (weights are assigned by the system automatically), `custom` (weights are customized) 
     * @return WeightMode Read/write weight distribution mode. Valid values: `system` (weights are assigned by the system automatically), `custom` (weights are customized)
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set Read/write weight distribution mode. Valid values: `system` (weights are assigned by the system automatically), `custom` (weights are customized)
     * @param WeightMode Read/write weight distribution mode. Valid values: `system` (weights are assigned by the system automatically), `custom` (weights are customized)
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get This field has been disused. To view the weight of a read-only instance, check the `Weight` value in the `RoInstances` field. 
     * @return Weight This field has been disused. To view the weight of a read-only instance, check the `Weight` value in the `RoInstances` field.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set This field has been disused. To view the weight of a read-only instance, check the `Weight` value in the `RoInstances` field.
     * @param Weight This field has been disused. To view the weight of a read-only instance, check the `Weight` value in the `RoInstances` field.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Details of read-only instances in read-only group 
     * @return RoInstances Details of read-only instances in read-only group
     */
    public RoInstanceInfo [] getRoInstances() {
        return this.RoInstances;
    }

    /**
     * Set Details of read-only instances in read-only group
     * @param RoInstances Details of read-only instances in read-only group
     */
    public void setRoInstances(RoInstanceInfo [] RoInstances) {
        this.RoInstances = RoInstances;
    }

    /**
     * Get Private IP of read-only group. 
     * @return Vip Private IP of read-only group.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Private IP of read-only group.
     * @param Vip Private IP of read-only group.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Private network port number of read-only group. 
     * @return Vport Private network port number of read-only group.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Private network port number of read-only group.
     * @param Vport Private network port number of read-only group.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get VPC ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UniqVpcId VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UniqVpcId VPC ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Subnet ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UniqSubnetId Subnet ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Subnet ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UniqSubnetId Subnet ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Read-only group region.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RoGroupRegion Read-only group region.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRoGroupRegion() {
        return this.RoGroupRegion;
    }

    /**
     * Set Read-only group region.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RoGroupRegion Read-only group region.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRoGroupRegion(String RoGroupRegion) {
        this.RoGroupRegion = RoGroupRegion;
    }

    /**
     * Get Read-only group AZ.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RoGroupZone Read-only group AZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRoGroupZone() {
        return this.RoGroupZone;
    }

    /**
     * Set Read-only group AZ.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RoGroupZone Read-only group AZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRoGroupZone(String RoGroupZone) {
        this.RoGroupZone = RoGroupZone;
    }

    /**
     * Get Replication delay.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return DelayReplicationTime Replication delay.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getDelayReplicationTime() {
        return this.DelayReplicationTime;
    }

    /**
     * Set Replication delay.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param DelayReplicationTime Replication delay.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDelayReplicationTime(Long DelayReplicationTime) {
        this.DelayReplicationTime = DelayReplicationTime;
    }

    public RoGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoGroup(RoGroup source) {
        if (source.RoGroupMode != null) {
            this.RoGroupMode = new String(source.RoGroupMode);
        }
        if (source.RoGroupId != null) {
            this.RoGroupId = new String(source.RoGroupId);
        }
        if (source.RoGroupName != null) {
            this.RoGroupName = new String(source.RoGroupName);
        }
        if (source.RoOfflineDelay != null) {
            this.RoOfflineDelay = new Long(source.RoOfflineDelay);
        }
        if (source.RoMaxDelayTime != null) {
            this.RoMaxDelayTime = new Long(source.RoMaxDelayTime);
        }
        if (source.MinRoInGroup != null) {
            this.MinRoInGroup = new Long(source.MinRoInGroup);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.RoInstances != null) {
            this.RoInstances = new RoInstanceInfo[source.RoInstances.length];
            for (int i = 0; i < source.RoInstances.length; i++) {
                this.RoInstances[i] = new RoInstanceInfo(source.RoInstances[i]);
            }
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.RoGroupRegion != null) {
            this.RoGroupRegion = new String(source.RoGroupRegion);
        }
        if (source.RoGroupZone != null) {
            this.RoGroupZone = new String(source.RoGroupZone);
        }
        if (source.DelayReplicationTime != null) {
            this.DelayReplicationTime = new Long(source.DelayReplicationTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoGroupMode", this.RoGroupMode);
        this.setParamSimple(map, prefix + "RoGroupId", this.RoGroupId);
        this.setParamSimple(map, prefix + "RoGroupName", this.RoGroupName);
        this.setParamSimple(map, prefix + "RoOfflineDelay", this.RoOfflineDelay);
        this.setParamSimple(map, prefix + "RoMaxDelayTime", this.RoMaxDelayTime);
        this.setParamSimple(map, prefix + "MinRoInGroup", this.MinRoInGroup);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamArrayObj(map, prefix + "RoInstances.", this.RoInstances);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "RoGroupRegion", this.RoGroupRegion);
        this.setParamSimple(map, prefix + "RoGroupZone", this.RoGroupZone);
        this.setParamSimple(map, prefix + "DelayReplicationTime", this.DelayReplicationTime);

    }
}

