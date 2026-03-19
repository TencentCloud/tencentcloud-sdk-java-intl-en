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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoGroup extends AbstractModel {

    /**
    * <p>Read-only group mode. Available values are: alone-automatic allocation by the system; allinone-create a read-only group; join-use an existing read-only group.</p>
    */
    @SerializedName("RoGroupMode")
    @Expose
    private String RoGroupMode;

    /**
    * <p>Read-only group ID.<br>Note: If the data structure is used during instance purchase, this item is required only when the read-only group mode is set to join.</p>
    */
    @SerializedName("RoGroupId")
    @Expose
    private String RoGroupId;

    /**
    * <p>Read-only group name.</p>
    */
    @SerializedName("RoGroupName")
    @Expose
    private String RoGroupName;

    /**
    * <p>Whether to enable the feature to isolate an instance that exceeds the latency threshold. After enabling this feature, if the delay between a read-only instance and the primary instance exceeds the delay threshold, the read-only instance will be isolated. Available values: 1-enable; 0-disable.</p>
    */
    @SerializedName("RoOfflineDelay")
    @Expose
    private Long RoOfflineDelay;

    /**
    * <p>Delay threshold, in seconds. Value range: 1–10000. The value is an integer.</p>
    */
    @SerializedName("RoMaxDelayTime")
    @Expose
    private Long RoMaxDelayTime;

    /**
    * <p>Minimum number of instances to retain. If the number of read-only instances purchased is less than the set number, removal will not occur.</p>
    */
    @SerializedName("MinRoInGroup")
    @Expose
    private Long MinRoInGroup;

    /**
    * <p>Read-write weight allocation mode. Available values: system-automatic allocation by the system; custom-customization.</p>
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * <p>This field is deprecated and meaningless. To view the weight of a read-only instance, check the Weight value in the RoInstances field.</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>Details of read-only instances in the read-only group.</p>
    */
    @SerializedName("RoInstances")
    @Expose
    private RoInstanceInfo [] RoInstances;

    /**
    * <p>Private IP address of the read-only group.</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>Private network port number of the read-only group.</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>VPC ID.</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>Subnet ID.</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>Region of the read-only group.</p>
    */
    @SerializedName("RoGroupRegion")
    @Expose
    private String RoGroupRegion;

    /**
    * <p>AZ of the read-only group.</p>
    */
    @SerializedName("RoGroupZone")
    @Expose
    private String RoGroupZone;

    /**
    * <p>Replication delay time, in seconds. Value range: 1–259200. The value is an integer.</p>
    */
    @SerializedName("DelayReplicationTime")
    @Expose
    private Long DelayReplicationTime;

    /**
     * Get <p>Read-only group mode. Available values are: alone-automatic allocation by the system; allinone-create a read-only group; join-use an existing read-only group.</p> 
     * @return RoGroupMode <p>Read-only group mode. Available values are: alone-automatic allocation by the system; allinone-create a read-only group; join-use an existing read-only group.</p>
     */
    public String getRoGroupMode() {
        return this.RoGroupMode;
    }

    /**
     * Set <p>Read-only group mode. Available values are: alone-automatic allocation by the system; allinone-create a read-only group; join-use an existing read-only group.</p>
     * @param RoGroupMode <p>Read-only group mode. Available values are: alone-automatic allocation by the system; allinone-create a read-only group; join-use an existing read-only group.</p>
     */
    public void setRoGroupMode(String RoGroupMode) {
        this.RoGroupMode = RoGroupMode;
    }

    /**
     * Get <p>Read-only group ID.<br>Note: If the data structure is used during instance purchase, this item is required only when the read-only group mode is set to join.</p> 
     * @return RoGroupId <p>Read-only group ID.<br>Note: If the data structure is used during instance purchase, this item is required only when the read-only group mode is set to join.</p>
     */
    public String getRoGroupId() {
        return this.RoGroupId;
    }

    /**
     * Set <p>Read-only group ID.<br>Note: If the data structure is used during instance purchase, this item is required only when the read-only group mode is set to join.</p>
     * @param RoGroupId <p>Read-only group ID.<br>Note: If the data structure is used during instance purchase, this item is required only when the read-only group mode is set to join.</p>
     */
    public void setRoGroupId(String RoGroupId) {
        this.RoGroupId = RoGroupId;
    }

    /**
     * Get <p>Read-only group name.</p> 
     * @return RoGroupName <p>Read-only group name.</p>
     */
    public String getRoGroupName() {
        return this.RoGroupName;
    }

    /**
     * Set <p>Read-only group name.</p>
     * @param RoGroupName <p>Read-only group name.</p>
     */
    public void setRoGroupName(String RoGroupName) {
        this.RoGroupName = RoGroupName;
    }

    /**
     * Get <p>Whether to enable the feature to isolate an instance that exceeds the latency threshold. After enabling this feature, if the delay between a read-only instance and the primary instance exceeds the delay threshold, the read-only instance will be isolated. Available values: 1-enable; 0-disable.</p> 
     * @return RoOfflineDelay <p>Whether to enable the feature to isolate an instance that exceeds the latency threshold. After enabling this feature, if the delay between a read-only instance and the primary instance exceeds the delay threshold, the read-only instance will be isolated. Available values: 1-enable; 0-disable.</p>
     */
    public Long getRoOfflineDelay() {
        return this.RoOfflineDelay;
    }

    /**
     * Set <p>Whether to enable the feature to isolate an instance that exceeds the latency threshold. After enabling this feature, if the delay between a read-only instance and the primary instance exceeds the delay threshold, the read-only instance will be isolated. Available values: 1-enable; 0-disable.</p>
     * @param RoOfflineDelay <p>Whether to enable the feature to isolate an instance that exceeds the latency threshold. After enabling this feature, if the delay between a read-only instance and the primary instance exceeds the delay threshold, the read-only instance will be isolated. Available values: 1-enable; 0-disable.</p>
     */
    public void setRoOfflineDelay(Long RoOfflineDelay) {
        this.RoOfflineDelay = RoOfflineDelay;
    }

    /**
     * Get <p>Delay threshold, in seconds. Value range: 1–10000. The value is an integer.</p> 
     * @return RoMaxDelayTime <p>Delay threshold, in seconds. Value range: 1–10000. The value is an integer.</p>
     */
    public Long getRoMaxDelayTime() {
        return this.RoMaxDelayTime;
    }

    /**
     * Set <p>Delay threshold, in seconds. Value range: 1–10000. The value is an integer.</p>
     * @param RoMaxDelayTime <p>Delay threshold, in seconds. Value range: 1–10000. The value is an integer.</p>
     */
    public void setRoMaxDelayTime(Long RoMaxDelayTime) {
        this.RoMaxDelayTime = RoMaxDelayTime;
    }

    /**
     * Get <p>Minimum number of instances to retain. If the number of read-only instances purchased is less than the set number, removal will not occur.</p> 
     * @return MinRoInGroup <p>Minimum number of instances to retain. If the number of read-only instances purchased is less than the set number, removal will not occur.</p>
     */
    public Long getMinRoInGroup() {
        return this.MinRoInGroup;
    }

    /**
     * Set <p>Minimum number of instances to retain. If the number of read-only instances purchased is less than the set number, removal will not occur.</p>
     * @param MinRoInGroup <p>Minimum number of instances to retain. If the number of read-only instances purchased is less than the set number, removal will not occur.</p>
     */
    public void setMinRoInGroup(Long MinRoInGroup) {
        this.MinRoInGroup = MinRoInGroup;
    }

    /**
     * Get <p>Read-write weight allocation mode. Available values: system-automatic allocation by the system; custom-customization.</p> 
     * @return WeightMode <p>Read-write weight allocation mode. Available values: system-automatic allocation by the system; custom-customization.</p>
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set <p>Read-write weight allocation mode. Available values: system-automatic allocation by the system; custom-customization.</p>
     * @param WeightMode <p>Read-write weight allocation mode. Available values: system-automatic allocation by the system; custom-customization.</p>
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get <p>This field is deprecated and meaningless. To view the weight of a read-only instance, check the Weight value in the RoInstances field.</p> 
     * @return Weight <p>This field is deprecated and meaningless. To view the weight of a read-only instance, check the Weight value in the RoInstances field.</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>This field is deprecated and meaningless. To view the weight of a read-only instance, check the Weight value in the RoInstances field.</p>
     * @param Weight <p>This field is deprecated and meaningless. To view the weight of a read-only instance, check the Weight value in the RoInstances field.</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>Details of read-only instances in the read-only group.</p> 
     * @return RoInstances <p>Details of read-only instances in the read-only group.</p>
     */
    public RoInstanceInfo [] getRoInstances() {
        return this.RoInstances;
    }

    /**
     * Set <p>Details of read-only instances in the read-only group.</p>
     * @param RoInstances <p>Details of read-only instances in the read-only group.</p>
     */
    public void setRoInstances(RoInstanceInfo [] RoInstances) {
        this.RoInstances = RoInstances;
    }

    /**
     * Get <p>Private IP address of the read-only group.</p> 
     * @return Vip <p>Private IP address of the read-only group.</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>Private IP address of the read-only group.</p>
     * @param Vip <p>Private IP address of the read-only group.</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>Private network port number of the read-only group.</p> 
     * @return Vport <p>Private network port number of the read-only group.</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>Private network port number of the read-only group.</p>
     * @param Vport <p>Private network port number of the read-only group.</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>VPC ID.</p> 
     * @return UniqVpcId <p>VPC ID.</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>VPC ID.</p>
     * @param UniqVpcId <p>VPC ID.</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>Subnet ID.</p> 
     * @return UniqSubnetId <p>Subnet ID.</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>Subnet ID.</p>
     * @param UniqSubnetId <p>Subnet ID.</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>Region of the read-only group.</p> 
     * @return RoGroupRegion <p>Region of the read-only group.</p>
     */
    public String getRoGroupRegion() {
        return this.RoGroupRegion;
    }

    /**
     * Set <p>Region of the read-only group.</p>
     * @param RoGroupRegion <p>Region of the read-only group.</p>
     */
    public void setRoGroupRegion(String RoGroupRegion) {
        this.RoGroupRegion = RoGroupRegion;
    }

    /**
     * Get <p>AZ of the read-only group.</p> 
     * @return RoGroupZone <p>AZ of the read-only group.</p>
     */
    public String getRoGroupZone() {
        return this.RoGroupZone;
    }

    /**
     * Set <p>AZ of the read-only group.</p>
     * @param RoGroupZone <p>AZ of the read-only group.</p>
     */
    public void setRoGroupZone(String RoGroupZone) {
        this.RoGroupZone = RoGroupZone;
    }

    /**
     * Get <p>Replication delay time, in seconds. Value range: 1–259200. The value is an integer.</p> 
     * @return DelayReplicationTime <p>Replication delay time, in seconds. Value range: 1–259200. The value is an integer.</p>
     */
    public Long getDelayReplicationTime() {
        return this.DelayReplicationTime;
    }

    /**
     * Set <p>Replication delay time, in seconds. Value range: 1–259200. The value is an integer.</p>
     * @param DelayReplicationTime <p>Replication delay time, in seconds. Value range: 1–259200. The value is an integer.</p>
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

