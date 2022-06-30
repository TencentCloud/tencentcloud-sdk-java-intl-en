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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQGroup extends AbstractModel{

    /**
    * Consumer group name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Number of online consumers
    */
    @SerializedName("ConsumerNum")
    @Expose
    private Long ConsumerNum;

    /**
    * Consumption TPS
    */
    @SerializedName("TPS")
    @Expose
    private Long TPS;

    /**
    * Total number of retained messages
    */
    @SerializedName("TotalAccumulative")
    @Expose
    private Long TotalAccumulative;

    /**
    * 0: cluster consumption mode; 1: broadcast consumption mode; -1: unknown
    */
    @SerializedName("ConsumptionMode")
    @Expose
    private Long ConsumptionMode;

    /**
    * Whether to allow consumption
    */
    @SerializedName("ReadEnabled")
    @Expose
    private Boolean ReadEnabled;

    /**
    * Number of partitions in the retry letter topic
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RetryPartitionNum")
    @Expose
    private Long RetryPartitionNum;

    /**
    * Creation time in milliseconds
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Modification time in milliseconds
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Client protocol
    */
    @SerializedName("ClientProtocol")
    @Expose
    private String ClientProtocol;

    /**
    * Remarks
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Consumer type. Enumerated values: ACTIVELY, PASSIVELY
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerType")
    @Expose
    private String ConsumerType;

    /**
    * Whether to enable broadcast consumption
    */
    @SerializedName("BroadcastEnabled")
    @Expose
    private Boolean BroadcastEnabled;

    /**
     * Get Consumer group name 
     * @return Name Consumer group name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Consumer group name
     * @param Name Consumer group name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Number of online consumers 
     * @return ConsumerNum Number of online consumers
     */
    public Long getConsumerNum() {
        return this.ConsumerNum;
    }

    /**
     * Set Number of online consumers
     * @param ConsumerNum Number of online consumers
     */
    public void setConsumerNum(Long ConsumerNum) {
        this.ConsumerNum = ConsumerNum;
    }

    /**
     * Get Consumption TPS 
     * @return TPS Consumption TPS
     */
    public Long getTPS() {
        return this.TPS;
    }

    /**
     * Set Consumption TPS
     * @param TPS Consumption TPS
     */
    public void setTPS(Long TPS) {
        this.TPS = TPS;
    }

    /**
     * Get Total number of retained messages 
     * @return TotalAccumulative Total number of retained messages
     */
    public Long getTotalAccumulative() {
        return this.TotalAccumulative;
    }

    /**
     * Set Total number of retained messages
     * @param TotalAccumulative Total number of retained messages
     */
    public void setTotalAccumulative(Long TotalAccumulative) {
        this.TotalAccumulative = TotalAccumulative;
    }

    /**
     * Get 0: cluster consumption mode; 1: broadcast consumption mode; -1: unknown 
     * @return ConsumptionMode 0: cluster consumption mode; 1: broadcast consumption mode; -1: unknown
     */
    public Long getConsumptionMode() {
        return this.ConsumptionMode;
    }

    /**
     * Set 0: cluster consumption mode; 1: broadcast consumption mode; -1: unknown
     * @param ConsumptionMode 0: cluster consumption mode; 1: broadcast consumption mode; -1: unknown
     */
    public void setConsumptionMode(Long ConsumptionMode) {
        this.ConsumptionMode = ConsumptionMode;
    }

    /**
     * Get Whether to allow consumption 
     * @return ReadEnabled Whether to allow consumption
     */
    public Boolean getReadEnabled() {
        return this.ReadEnabled;
    }

    /**
     * Set Whether to allow consumption
     * @param ReadEnabled Whether to allow consumption
     */
    public void setReadEnabled(Boolean ReadEnabled) {
        this.ReadEnabled = ReadEnabled;
    }

    /**
     * Get Number of partitions in the retry letter topic
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RetryPartitionNum Number of partitions in the retry letter topic
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRetryPartitionNum() {
        return this.RetryPartitionNum;
    }

    /**
     * Set Number of partitions in the retry letter topic
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RetryPartitionNum Number of partitions in the retry letter topic
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRetryPartitionNum(Long RetryPartitionNum) {
        this.RetryPartitionNum = RetryPartitionNum;
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
     * Get Modification time in milliseconds 
     * @return UpdateTime Modification time in milliseconds
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Modification time in milliseconds
     * @param UpdateTime Modification time in milliseconds
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Client protocol 
     * @return ClientProtocol Client protocol
     */
    public String getClientProtocol() {
        return this.ClientProtocol;
    }

    /**
     * Set Client protocol
     * @param ClientProtocol Client protocol
     */
    public void setClientProtocol(String ClientProtocol) {
        this.ClientProtocol = ClientProtocol;
    }

    /**
     * Get Remarks
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Consumer type. Enumerated values: ACTIVELY, PASSIVELY
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerType Consumer type. Enumerated values: ACTIVELY, PASSIVELY
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getConsumerType() {
        return this.ConsumerType;
    }

    /**
     * Set Consumer type. Enumerated values: ACTIVELY, PASSIVELY
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConsumerType Consumer type. Enumerated values: ACTIVELY, PASSIVELY
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerType(String ConsumerType) {
        this.ConsumerType = ConsumerType;
    }

    /**
     * Get Whether to enable broadcast consumption 
     * @return BroadcastEnabled Whether to enable broadcast consumption
     */
    public Boolean getBroadcastEnabled() {
        return this.BroadcastEnabled;
    }

    /**
     * Set Whether to enable broadcast consumption
     * @param BroadcastEnabled Whether to enable broadcast consumption
     */
    public void setBroadcastEnabled(Boolean BroadcastEnabled) {
        this.BroadcastEnabled = BroadcastEnabled;
    }

    public RocketMQGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQGroup(RocketMQGroup source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ConsumerNum != null) {
            this.ConsumerNum = new Long(source.ConsumerNum);
        }
        if (source.TPS != null) {
            this.TPS = new Long(source.TPS);
        }
        if (source.TotalAccumulative != null) {
            this.TotalAccumulative = new Long(source.TotalAccumulative);
        }
        if (source.ConsumptionMode != null) {
            this.ConsumptionMode = new Long(source.ConsumptionMode);
        }
        if (source.ReadEnabled != null) {
            this.ReadEnabled = new Boolean(source.ReadEnabled);
        }
        if (source.RetryPartitionNum != null) {
            this.RetryPartitionNum = new Long(source.RetryPartitionNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.ClientProtocol != null) {
            this.ClientProtocol = new String(source.ClientProtocol);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ConsumerType != null) {
            this.ConsumerType = new String(source.ConsumerType);
        }
        if (source.BroadcastEnabled != null) {
            this.BroadcastEnabled = new Boolean(source.BroadcastEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ConsumerNum", this.ConsumerNum);
        this.setParamSimple(map, prefix + "TPS", this.TPS);
        this.setParamSimple(map, prefix + "TotalAccumulative", this.TotalAccumulative);
        this.setParamSimple(map, prefix + "ConsumptionMode", this.ConsumptionMode);
        this.setParamSimple(map, prefix + "ReadEnabled", this.ReadEnabled);
        this.setParamSimple(map, prefix + "RetryPartitionNum", this.RetryPartitionNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ClientProtocol", this.ClientProtocol);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConsumerType", this.ConsumerType);
        this.setParamSimple(map, prefix + "BroadcastEnabled", this.BroadcastEnabled);

    }
}

