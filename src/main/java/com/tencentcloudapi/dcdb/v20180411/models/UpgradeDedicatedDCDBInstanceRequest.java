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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDedicatedDCDBInstanceRequest extends AbstractModel{

    /**
    * Upgrade type. Valid values: `ADD` (add a shard), `SPLIT` (split a shard), and `EXPAND` (Vertically expand a shard).
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * Instance ID, such as dcdbt-mlfjm74h.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * A parameter for adding shards when `UpgradeType` is `ADD`.
    */
    @SerializedName("AddShardConfig")
    @Expose
    private AddShardConfig AddShardConfig;

    /**
    * A parameter for vertically expand a shard when `UpgradeType` is `EXPAND`.
    */
    @SerializedName("ExpandShardConfig")
    @Expose
    private ExpandShardConfig ExpandShardConfig;

    /**
    * A parameter for splitting a shard when `UpgradeType` is `SPLIT`.
    */
    @SerializedName("SplitShardConfig")
    @Expose
    private SplitShardConfig SplitShardConfig;

    /**
    * Whether to automatically retry u200donce when missing the switch time window. Valid values: `0` (No), `1` (Yes).
    */
    @SerializedName("SwitchAutoRetry")
    @Expose
    private Long SwitchAutoRetry;

    /**
    * Switch u200dstart u200dtime
    */
    @SerializedName("SwitchStartTime")
    @Expose
    private String SwitchStartTime;

    /**
    * Switch end time
    */
    @SerializedName("SwitchEndTime")
    @Expose
    private String SwitchEndTime;

    /**
     * Get Upgrade type. Valid values: `ADD` (add a shard), `SPLIT` (split a shard), and `EXPAND` (Vertically expand a shard). 
     * @return UpgradeType Upgrade type. Valid values: `ADD` (add a shard), `SPLIT` (split a shard), and `EXPAND` (Vertically expand a shard).
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set Upgrade type. Valid values: `ADD` (add a shard), `SPLIT` (split a shard), and `EXPAND` (Vertically expand a shard).
     * @param UpgradeType Upgrade type. Valid values: `ADD` (add a shard), `SPLIT` (split a shard), and `EXPAND` (Vertically expand a shard).
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get Instance ID, such as dcdbt-mlfjm74h. 
     * @return InstanceId Instance ID, such as dcdbt-mlfjm74h.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as dcdbt-mlfjm74h.
     * @param InstanceId Instance ID, such as dcdbt-mlfjm74h.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get A parameter for adding shards when `UpgradeType` is `ADD`. 
     * @return AddShardConfig A parameter for adding shards when `UpgradeType` is `ADD`.
     */
    public AddShardConfig getAddShardConfig() {
        return this.AddShardConfig;
    }

    /**
     * Set A parameter for adding shards when `UpgradeType` is `ADD`.
     * @param AddShardConfig A parameter for adding shards when `UpgradeType` is `ADD`.
     */
    public void setAddShardConfig(AddShardConfig AddShardConfig) {
        this.AddShardConfig = AddShardConfig;
    }

    /**
     * Get A parameter for vertically expand a shard when `UpgradeType` is `EXPAND`. 
     * @return ExpandShardConfig A parameter for vertically expand a shard when `UpgradeType` is `EXPAND`.
     */
    public ExpandShardConfig getExpandShardConfig() {
        return this.ExpandShardConfig;
    }

    /**
     * Set A parameter for vertically expand a shard when `UpgradeType` is `EXPAND`.
     * @param ExpandShardConfig A parameter for vertically expand a shard when `UpgradeType` is `EXPAND`.
     */
    public void setExpandShardConfig(ExpandShardConfig ExpandShardConfig) {
        this.ExpandShardConfig = ExpandShardConfig;
    }

    /**
     * Get A parameter for splitting a shard when `UpgradeType` is `SPLIT`. 
     * @return SplitShardConfig A parameter for splitting a shard when `UpgradeType` is `SPLIT`.
     */
    public SplitShardConfig getSplitShardConfig() {
        return this.SplitShardConfig;
    }

    /**
     * Set A parameter for splitting a shard when `UpgradeType` is `SPLIT`.
     * @param SplitShardConfig A parameter for splitting a shard when `UpgradeType` is `SPLIT`.
     */
    public void setSplitShardConfig(SplitShardConfig SplitShardConfig) {
        this.SplitShardConfig = SplitShardConfig;
    }

    /**
     * Get Whether to automatically retry u200donce when missing the switch time window. Valid values: `0` (No), `1` (Yes). 
     * @return SwitchAutoRetry Whether to automatically retry u200donce when missing the switch time window. Valid values: `0` (No), `1` (Yes).
     */
    public Long getSwitchAutoRetry() {
        return this.SwitchAutoRetry;
    }

    /**
     * Set Whether to automatically retry u200donce when missing the switch time window. Valid values: `0` (No), `1` (Yes).
     * @param SwitchAutoRetry Whether to automatically retry u200donce when missing the switch time window. Valid values: `0` (No), `1` (Yes).
     */
    public void setSwitchAutoRetry(Long SwitchAutoRetry) {
        this.SwitchAutoRetry = SwitchAutoRetry;
    }

    /**
     * Get Switch u200dstart u200dtime 
     * @return SwitchStartTime Switch u200dstart u200dtime
     */
    public String getSwitchStartTime() {
        return this.SwitchStartTime;
    }

    /**
     * Set Switch u200dstart u200dtime
     * @param SwitchStartTime Switch u200dstart u200dtime
     */
    public void setSwitchStartTime(String SwitchStartTime) {
        this.SwitchStartTime = SwitchStartTime;
    }

    /**
     * Get Switch end time 
     * @return SwitchEndTime Switch end time
     */
    public String getSwitchEndTime() {
        return this.SwitchEndTime;
    }

    /**
     * Set Switch end time
     * @param SwitchEndTime Switch end time
     */
    public void setSwitchEndTime(String SwitchEndTime) {
        this.SwitchEndTime = SwitchEndTime;
    }

    public UpgradeDedicatedDCDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDedicatedDCDBInstanceRequest(UpgradeDedicatedDCDBInstanceRequest source) {
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AddShardConfig != null) {
            this.AddShardConfig = new AddShardConfig(source.AddShardConfig);
        }
        if (source.ExpandShardConfig != null) {
            this.ExpandShardConfig = new ExpandShardConfig(source.ExpandShardConfig);
        }
        if (source.SplitShardConfig != null) {
            this.SplitShardConfig = new SplitShardConfig(source.SplitShardConfig);
        }
        if (source.SwitchAutoRetry != null) {
            this.SwitchAutoRetry = new Long(source.SwitchAutoRetry);
        }
        if (source.SwitchStartTime != null) {
            this.SwitchStartTime = new String(source.SwitchStartTime);
        }
        if (source.SwitchEndTime != null) {
            this.SwitchEndTime = new String(source.SwitchEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "AddShardConfig.", this.AddShardConfig);
        this.setParamObj(map, prefix + "ExpandShardConfig.", this.ExpandShardConfig);
        this.setParamObj(map, prefix + "SplitShardConfig.", this.SplitShardConfig);
        this.setParamSimple(map, prefix + "SwitchAutoRetry", this.SwitchAutoRetry);
        this.setParamSimple(map, prefix + "SwitchStartTime", this.SwitchStartTime);
        this.setParamSimple(map, prefix + "SwitchEndTime", this.SwitchEndTime);

    }
}

