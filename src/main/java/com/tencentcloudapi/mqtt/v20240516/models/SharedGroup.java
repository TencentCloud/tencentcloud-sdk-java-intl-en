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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SharedGroup extends AbstractModel {

    /**
    * Tencent Cloud MQTT instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Shared subscription group name
    */
    @SerializedName("SharedName")
    @Expose
    private String SharedName;

    /**
    * Shared group load balancing strategy 1.RANDOM 2.HASH_PARTITION
    */
    @SerializedName("LbStrategy")
    @Expose
    private Long LbStrategy;

    /**
    * Takes effect under the HASH_PARTITION policy. It indicates the delay time when a Client disconnects or a new Client comes online to join the subscription group for consumption.
Range: 0–600 seconds
    */
    @SerializedName("ExpiryInterval")
    @Expose
    private Long ExpiryInterval;

    /**
    * Remark, length not exceeding 128 characters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * createTime, millisecond-level timestamp.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Last update time, millisecond-level timestamp.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Tencent Cloud MQTT instance ID 
     * @return InstanceId Tencent Cloud MQTT instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Tencent Cloud MQTT instance ID
     * @param InstanceId Tencent Cloud MQTT instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Shared subscription group name 
     * @return SharedName Shared subscription group name
     */
    public String getSharedName() {
        return this.SharedName;
    }

    /**
     * Set Shared subscription group name
     * @param SharedName Shared subscription group name
     */
    public void setSharedName(String SharedName) {
        this.SharedName = SharedName;
    }

    /**
     * Get Shared group load balancing strategy 1.RANDOM 2.HASH_PARTITION 
     * @return LbStrategy Shared group load balancing strategy 1.RANDOM 2.HASH_PARTITION
     */
    public Long getLbStrategy() {
        return this.LbStrategy;
    }

    /**
     * Set Shared group load balancing strategy 1.RANDOM 2.HASH_PARTITION
     * @param LbStrategy Shared group load balancing strategy 1.RANDOM 2.HASH_PARTITION
     */
    public void setLbStrategy(Long LbStrategy) {
        this.LbStrategy = LbStrategy;
    }

    /**
     * Get Takes effect under the HASH_PARTITION policy. It indicates the delay time when a Client disconnects or a new Client comes online to join the subscription group for consumption.
Range: 0–600 seconds 
     * @return ExpiryInterval Takes effect under the HASH_PARTITION policy. It indicates the delay time when a Client disconnects or a new Client comes online to join the subscription group for consumption.
Range: 0–600 seconds
     */
    public Long getExpiryInterval() {
        return this.ExpiryInterval;
    }

    /**
     * Set Takes effect under the HASH_PARTITION policy. It indicates the delay time when a Client disconnects or a new Client comes online to join the subscription group for consumption.
Range: 0–600 seconds
     * @param ExpiryInterval Takes effect under the HASH_PARTITION policy. It indicates the delay time when a Client disconnects or a new Client comes online to join the subscription group for consumption.
Range: 0–600 seconds
     */
    public void setExpiryInterval(Long ExpiryInterval) {
        this.ExpiryInterval = ExpiryInterval;
    }

    /**
     * Get Remark, length not exceeding 128 characters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remark, length not exceeding 128 characters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remark, length not exceeding 128 characters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Remark, length not exceeding 128 characters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get createTime, millisecond-level timestamp. 
     * @return CreateTime createTime, millisecond-level timestamp.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set createTime, millisecond-level timestamp.
     * @param CreateTime createTime, millisecond-level timestamp.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last update time, millisecond-level timestamp. 
     * @return UpdateTime Last update time, millisecond-level timestamp.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last update time, millisecond-level timestamp.
     * @param UpdateTime Last update time, millisecond-level timestamp.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SharedGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SharedGroup(SharedGroup source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SharedName != null) {
            this.SharedName = new String(source.SharedName);
        }
        if (source.LbStrategy != null) {
            this.LbStrategy = new Long(source.LbStrategy);
        }
        if (source.ExpiryInterval != null) {
            this.ExpiryInterval = new Long(source.ExpiryInterval);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SharedName", this.SharedName);
        this.setParamSimple(map, prefix + "LbStrategy", this.LbStrategy);
        this.setParamSimple(map, prefix + "ExpiryInterval", this.ExpiryInterval);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

