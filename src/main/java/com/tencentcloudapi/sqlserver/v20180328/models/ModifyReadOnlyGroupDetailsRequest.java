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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyReadOnlyGroupDetailsRequest extends AbstractModel {

    /**
    * Primary instance ID, in the format of mssql-3l3fgqn7.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Read-only group ID.
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * Read-only group name. The modification is not performed if this parameter is left unspecified.
    */
    @SerializedName("ReadOnlyGroupName")
    @Expose
    private String ReadOnlyGroupName;

    /**
    * Whether to enable the delayed read-only instance removal feature. 0 - disabled; 1 - enabled. The modification is not performed if this parameter is left unspecified.
    */
    @SerializedName("IsOfflineDelay")
    @Expose
    private Long IsOfflineDelay;

    /**
    * Timeout threshold used after the delayed read-only instance removal feature is enabled. The modification is not performed if this parameter is left unspecified.
    */
    @SerializedName("ReadOnlyMaxDelayTime")
    @Expose
    private Long ReadOnlyMaxDelayTime;

    /**
    * Minimum number of retained read-only replicas in the read-only group, after the delayed read-only instance removal feature is enabled. The modification is not performed if this parameter is left unspecified.
    */
    @SerializedName("MinReadOnlyInGroup")
    @Expose
    private Long MinReadOnlyInGroup;

    /**
    * Collection of read-only group instance weight modification. The modification is not performed if this parameter is left unspecified.
    */
    @SerializedName("WeightPairs")
    @Expose
    private ReadOnlyInstanceWeightPair [] WeightPairs;

    /**
    * 0 - user-defined weight (adjust according to WeightPairs); 1 - automatically assigned weight by the system (invalid WeightPairs). The default value is 0.
    */
    @SerializedName("AutoWeight")
    @Expose
    private Long AutoWeight;

    /**
    * 0 - not rebalance the load; 1 - rebalance the load. The default value is 0.
    */
    @SerializedName("BalanceWeight")
    @Expose
    private Long BalanceWeight;

    /**
     * Get Primary instance ID, in the format of mssql-3l3fgqn7. 
     * @return InstanceId Primary instance ID, in the format of mssql-3l3fgqn7.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Primary instance ID, in the format of mssql-3l3fgqn7.
     * @param InstanceId Primary instance ID, in the format of mssql-3l3fgqn7.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Read-only group ID. 
     * @return ReadOnlyGroupId Read-only group ID.
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set Read-only group ID.
     * @param ReadOnlyGroupId Read-only group ID.
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get Read-only group name. The modification is not performed if this parameter is left unspecified. 
     * @return ReadOnlyGroupName Read-only group name. The modification is not performed if this parameter is left unspecified.
     */
    public String getReadOnlyGroupName() {
        return this.ReadOnlyGroupName;
    }

    /**
     * Set Read-only group name. The modification is not performed if this parameter is left unspecified.
     * @param ReadOnlyGroupName Read-only group name. The modification is not performed if this parameter is left unspecified.
     */
    public void setReadOnlyGroupName(String ReadOnlyGroupName) {
        this.ReadOnlyGroupName = ReadOnlyGroupName;
    }

    /**
     * Get Whether to enable the delayed read-only instance removal feature. 0 - disabled; 1 - enabled. The modification is not performed if this parameter is left unspecified. 
     * @return IsOfflineDelay Whether to enable the delayed read-only instance removal feature. 0 - disabled; 1 - enabled. The modification is not performed if this parameter is left unspecified.
     */
    public Long getIsOfflineDelay() {
        return this.IsOfflineDelay;
    }

    /**
     * Set Whether to enable the delayed read-only instance removal feature. 0 - disabled; 1 - enabled. The modification is not performed if this parameter is left unspecified.
     * @param IsOfflineDelay Whether to enable the delayed read-only instance removal feature. 0 - disabled; 1 - enabled. The modification is not performed if this parameter is left unspecified.
     */
    public void setIsOfflineDelay(Long IsOfflineDelay) {
        this.IsOfflineDelay = IsOfflineDelay;
    }

    /**
     * Get Timeout threshold used after the delayed read-only instance removal feature is enabled. The modification is not performed if this parameter is left unspecified. 
     * @return ReadOnlyMaxDelayTime Timeout threshold used after the delayed read-only instance removal feature is enabled. The modification is not performed if this parameter is left unspecified.
     */
    public Long getReadOnlyMaxDelayTime() {
        return this.ReadOnlyMaxDelayTime;
    }

    /**
     * Set Timeout threshold used after the delayed read-only instance removal feature is enabled. The modification is not performed if this parameter is left unspecified.
     * @param ReadOnlyMaxDelayTime Timeout threshold used after the delayed read-only instance removal feature is enabled. The modification is not performed if this parameter is left unspecified.
     */
    public void setReadOnlyMaxDelayTime(Long ReadOnlyMaxDelayTime) {
        this.ReadOnlyMaxDelayTime = ReadOnlyMaxDelayTime;
    }

    /**
     * Get Minimum number of retained read-only replicas in the read-only group, after the delayed read-only instance removal feature is enabled. The modification is not performed if this parameter is left unspecified. 
     * @return MinReadOnlyInGroup Minimum number of retained read-only replicas in the read-only group, after the delayed read-only instance removal feature is enabled. The modification is not performed if this parameter is left unspecified.
     */
    public Long getMinReadOnlyInGroup() {
        return this.MinReadOnlyInGroup;
    }

    /**
     * Set Minimum number of retained read-only replicas in the read-only group, after the delayed read-only instance removal feature is enabled. The modification is not performed if this parameter is left unspecified.
     * @param MinReadOnlyInGroup Minimum number of retained read-only replicas in the read-only group, after the delayed read-only instance removal feature is enabled. The modification is not performed if this parameter is left unspecified.
     */
    public void setMinReadOnlyInGroup(Long MinReadOnlyInGroup) {
        this.MinReadOnlyInGroup = MinReadOnlyInGroup;
    }

    /**
     * Get Collection of read-only group instance weight modification. The modification is not performed if this parameter is left unspecified. 
     * @return WeightPairs Collection of read-only group instance weight modification. The modification is not performed if this parameter is left unspecified.
     */
    public ReadOnlyInstanceWeightPair [] getWeightPairs() {
        return this.WeightPairs;
    }

    /**
     * Set Collection of read-only group instance weight modification. The modification is not performed if this parameter is left unspecified.
     * @param WeightPairs Collection of read-only group instance weight modification. The modification is not performed if this parameter is left unspecified.
     */
    public void setWeightPairs(ReadOnlyInstanceWeightPair [] WeightPairs) {
        this.WeightPairs = WeightPairs;
    }

    /**
     * Get 0 - user-defined weight (adjust according to WeightPairs); 1 - automatically assigned weight by the system (invalid WeightPairs). The default value is 0. 
     * @return AutoWeight 0 - user-defined weight (adjust according to WeightPairs); 1 - automatically assigned weight by the system (invalid WeightPairs). The default value is 0.
     */
    public Long getAutoWeight() {
        return this.AutoWeight;
    }

    /**
     * Set 0 - user-defined weight (adjust according to WeightPairs); 1 - automatically assigned weight by the system (invalid WeightPairs). The default value is 0.
     * @param AutoWeight 0 - user-defined weight (adjust according to WeightPairs); 1 - automatically assigned weight by the system (invalid WeightPairs). The default value is 0.
     */
    public void setAutoWeight(Long AutoWeight) {
        this.AutoWeight = AutoWeight;
    }

    /**
     * Get 0 - not rebalance the load; 1 - rebalance the load. The default value is 0. 
     * @return BalanceWeight 0 - not rebalance the load; 1 - rebalance the load. The default value is 0.
     */
    public Long getBalanceWeight() {
        return this.BalanceWeight;
    }

    /**
     * Set 0 - not rebalance the load; 1 - rebalance the load. The default value is 0.
     * @param BalanceWeight 0 - not rebalance the load; 1 - rebalance the load. The default value is 0.
     */
    public void setBalanceWeight(Long BalanceWeight) {
        this.BalanceWeight = BalanceWeight;
    }

    public ModifyReadOnlyGroupDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyReadOnlyGroupDetailsRequest(ModifyReadOnlyGroupDetailsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.ReadOnlyGroupName != null) {
            this.ReadOnlyGroupName = new String(source.ReadOnlyGroupName);
        }
        if (source.IsOfflineDelay != null) {
            this.IsOfflineDelay = new Long(source.IsOfflineDelay);
        }
        if (source.ReadOnlyMaxDelayTime != null) {
            this.ReadOnlyMaxDelayTime = new Long(source.ReadOnlyMaxDelayTime);
        }
        if (source.MinReadOnlyInGroup != null) {
            this.MinReadOnlyInGroup = new Long(source.MinReadOnlyInGroup);
        }
        if (source.WeightPairs != null) {
            this.WeightPairs = new ReadOnlyInstanceWeightPair[source.WeightPairs.length];
            for (int i = 0; i < source.WeightPairs.length; i++) {
                this.WeightPairs[i] = new ReadOnlyInstanceWeightPair(source.WeightPairs[i]);
            }
        }
        if (source.AutoWeight != null) {
            this.AutoWeight = new Long(source.AutoWeight);
        }
        if (source.BalanceWeight != null) {
            this.BalanceWeight = new Long(source.BalanceWeight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupName", this.ReadOnlyGroupName);
        this.setParamSimple(map, prefix + "IsOfflineDelay", this.IsOfflineDelay);
        this.setParamSimple(map, prefix + "ReadOnlyMaxDelayTime", this.ReadOnlyMaxDelayTime);
        this.setParamSimple(map, prefix + "MinReadOnlyInGroup", this.MinReadOnlyInGroup);
        this.setParamArrayObj(map, prefix + "WeightPairs.", this.WeightPairs);
        this.setParamSimple(map, prefix + "AutoWeight", this.AutoWeight);
        this.setParamSimple(map, prefix + "BalanceWeight", this.BalanceWeight);

    }
}

