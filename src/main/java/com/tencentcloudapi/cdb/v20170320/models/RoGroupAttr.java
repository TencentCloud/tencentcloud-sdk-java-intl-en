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

public class RoGroupAttr extends AbstractModel {

    /**
    * RO group name.
    */
    @SerializedName("RoGroupName")
    @Expose
    private String RoGroupName;

    /**
    * Maximum delay threshold for the RO instance. Unit: seconds, minimum value is 1. Range: [1,10000], integer.
Note: The RO group must have enabled the instance latency removal policy for this value to be valid.
    */
    @SerializedName("RoMaxDelayTime")
    @Expose
    private Long RoMaxDelayTime;

    /**
    * Whether to enable instance removal. Valid values: 1 (enabled), 0 (not enabled). Please note that if instance removal is enabled, the delay threshold parameter (`RoMaxDelayTime`) must be set.
    */
    @SerializedName("RoOfflineDelay")
    @Expose
    private Long RoOfflineDelay;

    /**
    * Minimum reserved instances. Can be set to any value ≤ the number of instances in the RO group. Default value: 1.
Note: If the set value is larger than the RO instance count, do not remove. If set to 0, all instances with delay above the limit will be excluded.
    */
    @SerializedName("MinRoInGroup")
    @Expose
    private Long MinRoInGroup;

    /**
    * Weighting mode. Supported values include `system` (automatically assigned by the system) and `custom` (defined by user). Please note that if the `custom` mode is selected, the RO instance weight configuration parameter (RoWeightValues) must be set.
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * Delayed replication time. Unit: second, range: 1 - 259200 seconds, not required to enable delayed replication for the instance.
    */
    @SerializedName("ReplicationDelayTime")
    @Expose
    private Long ReplicationDelayTime;

    /**
     * Get RO group name. 
     * @return RoGroupName RO group name.
     */
    public String getRoGroupName() {
        return this.RoGroupName;
    }

    /**
     * Set RO group name.
     * @param RoGroupName RO group name.
     */
    public void setRoGroupName(String RoGroupName) {
        this.RoGroupName = RoGroupName;
    }

    /**
     * Get Maximum delay threshold for the RO instance. Unit: seconds, minimum value is 1. Range: [1,10000], integer.
Note: The RO group must have enabled the instance latency removal policy for this value to be valid. 
     * @return RoMaxDelayTime Maximum delay threshold for the RO instance. Unit: seconds, minimum value is 1. Range: [1,10000], integer.
Note: The RO group must have enabled the instance latency removal policy for this value to be valid.
     */
    public Long getRoMaxDelayTime() {
        return this.RoMaxDelayTime;
    }

    /**
     * Set Maximum delay threshold for the RO instance. Unit: seconds, minimum value is 1. Range: [1,10000], integer.
Note: The RO group must have enabled the instance latency removal policy for this value to be valid.
     * @param RoMaxDelayTime Maximum delay threshold for the RO instance. Unit: seconds, minimum value is 1. Range: [1,10000], integer.
Note: The RO group must have enabled the instance latency removal policy for this value to be valid.
     */
    public void setRoMaxDelayTime(Long RoMaxDelayTime) {
        this.RoMaxDelayTime = RoMaxDelayTime;
    }

    /**
     * Get Whether to enable instance removal. Valid values: 1 (enabled), 0 (not enabled). Please note that if instance removal is enabled, the delay threshold parameter (`RoMaxDelayTime`) must be set. 
     * @return RoOfflineDelay Whether to enable instance removal. Valid values: 1 (enabled), 0 (not enabled). Please note that if instance removal is enabled, the delay threshold parameter (`RoMaxDelayTime`) must be set.
     */
    public Long getRoOfflineDelay() {
        return this.RoOfflineDelay;
    }

    /**
     * Set Whether to enable instance removal. Valid values: 1 (enabled), 0 (not enabled). Please note that if instance removal is enabled, the delay threshold parameter (`RoMaxDelayTime`) must be set.
     * @param RoOfflineDelay Whether to enable instance removal. Valid values: 1 (enabled), 0 (not enabled). Please note that if instance removal is enabled, the delay threshold parameter (`RoMaxDelayTime`) must be set.
     */
    public void setRoOfflineDelay(Long RoOfflineDelay) {
        this.RoOfflineDelay = RoOfflineDelay;
    }

    /**
     * Get Minimum reserved instances. Can be set to any value ≤ the number of instances in the RO group. Default value: 1.
Note: If the set value is larger than the RO instance count, do not remove. If set to 0, all instances with delay above the limit will be excluded. 
     * @return MinRoInGroup Minimum reserved instances. Can be set to any value ≤ the number of instances in the RO group. Default value: 1.
Note: If the set value is larger than the RO instance count, do not remove. If set to 0, all instances with delay above the limit will be excluded.
     */
    public Long getMinRoInGroup() {
        return this.MinRoInGroup;
    }

    /**
     * Set Minimum reserved instances. Can be set to any value ≤ the number of instances in the RO group. Default value: 1.
Note: If the set value is larger than the RO instance count, do not remove. If set to 0, all instances with delay above the limit will be excluded.
     * @param MinRoInGroup Minimum reserved instances. Can be set to any value ≤ the number of instances in the RO group. Default value: 1.
Note: If the set value is larger than the RO instance count, do not remove. If set to 0, all instances with delay above the limit will be excluded.
     */
    public void setMinRoInGroup(Long MinRoInGroup) {
        this.MinRoInGroup = MinRoInGroup;
    }

    /**
     * Get Weighting mode. Supported values include `system` (automatically assigned by the system) and `custom` (defined by user). Please note that if the `custom` mode is selected, the RO instance weight configuration parameter (RoWeightValues) must be set. 
     * @return WeightMode Weighting mode. Supported values include `system` (automatically assigned by the system) and `custom` (defined by user). Please note that if the `custom` mode is selected, the RO instance weight configuration parameter (RoWeightValues) must be set.
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set Weighting mode. Supported values include `system` (automatically assigned by the system) and `custom` (defined by user). Please note that if the `custom` mode is selected, the RO instance weight configuration parameter (RoWeightValues) must be set.
     * @param WeightMode Weighting mode. Supported values include `system` (automatically assigned by the system) and `custom` (defined by user). Please note that if the `custom` mode is selected, the RO instance weight configuration parameter (RoWeightValues) must be set.
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get Delayed replication time. Unit: second, range: 1 - 259200 seconds, not required to enable delayed replication for the instance. 
     * @return ReplicationDelayTime Delayed replication time. Unit: second, range: 1 - 259200 seconds, not required to enable delayed replication for the instance.
     */
    public Long getReplicationDelayTime() {
        return this.ReplicationDelayTime;
    }

    /**
     * Set Delayed replication time. Unit: second, range: 1 - 259200 seconds, not required to enable delayed replication for the instance.
     * @param ReplicationDelayTime Delayed replication time. Unit: second, range: 1 - 259200 seconds, not required to enable delayed replication for the instance.
     */
    public void setReplicationDelayTime(Long ReplicationDelayTime) {
        this.ReplicationDelayTime = ReplicationDelayTime;
    }

    public RoGroupAttr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoGroupAttr(RoGroupAttr source) {
        if (source.RoGroupName != null) {
            this.RoGroupName = new String(source.RoGroupName);
        }
        if (source.RoMaxDelayTime != null) {
            this.RoMaxDelayTime = new Long(source.RoMaxDelayTime);
        }
        if (source.RoOfflineDelay != null) {
            this.RoOfflineDelay = new Long(source.RoOfflineDelay);
        }
        if (source.MinRoInGroup != null) {
            this.MinRoInGroup = new Long(source.MinRoInGroup);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.ReplicationDelayTime != null) {
            this.ReplicationDelayTime = new Long(source.ReplicationDelayTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoGroupName", this.RoGroupName);
        this.setParamSimple(map, prefix + "RoMaxDelayTime", this.RoMaxDelayTime);
        this.setParamSimple(map, prefix + "RoOfflineDelay", this.RoOfflineDelay);
        this.setParamSimple(map, prefix + "MinRoInGroup", this.MinRoInGroup);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "ReplicationDelayTime", this.ReplicationDelayTime);

    }
}

