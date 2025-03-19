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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfo extends AbstractModel {

    /**
    * Consumer group account
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * Consumer group name
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * Consumer group descriptionNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Consumer group offset. This field is for compatibility with the previous single partition scenario, where the value is the offset of the last partition. For the offset of each partition, please refer to the StateOfPartition field.
    */
    @SerializedName("ConsumerGroupOffset")
    @Expose
    private Long ConsumerGroupOffset;

    /**
    * The amount of data that has not been consumed by the consumer group. This field is for compatibility with the previous single partition scenario, where the value is the amount of unconsumed data in the last partition. For the amount of unconsumed data in each partition, refer to the StateOfPartition field.
    */
    @SerializedName("ConsumerGroupLag")
    @Expose
    private Long ConsumerGroupLag;

    /**
    * Consumption delay (in seconds)
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * Consumption status of each partition
    */
    @SerializedName("StateOfPartition")
    @Expose
    private MonitorInfo [] StateOfPartition;

    /**
    * Consumer group creation time, the format is: YYYY-MM-DD hh:mm:ss.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Consumer group update time, the format is: YYYY-MM-DD hh:mm:ss.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Consumer group states, including Dead, Empty, Stable, etc. Only Dead and Empty states can perform reset operations.
    */
    @SerializedName("ConsumerGroupState")
    @Expose
    private String ConsumerGroupState;

    /**
    * The partition is being consumed by each consumer.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PartitionAssignment")
    @Expose
    private PartitionAssignment [] PartitionAssignment;

    /**
     * Get Consumer group account 
     * @return Account Consumer group account
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set Consumer group account
     * @param Account Consumer group account
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get Consumer group name 
     * @return ConsumerGroupName Consumer group name
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set Consumer group name
     * @param ConsumerGroupName Consumer group name
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get Consumer group descriptionNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Consumer group descriptionNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Consumer group descriptionNote: This field may return null, indicating that no valid values can be obtained.
     * @param Description Consumer group descriptionNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Consumer group offset. This field is for compatibility with the previous single partition scenario, where the value is the offset of the last partition. For the offset of each partition, please refer to the StateOfPartition field. 
     * @return ConsumerGroupOffset Consumer group offset. This field is for compatibility with the previous single partition scenario, where the value is the offset of the last partition. For the offset of each partition, please refer to the StateOfPartition field.
     */
    public Long getConsumerGroupOffset() {
        return this.ConsumerGroupOffset;
    }

    /**
     * Set Consumer group offset. This field is for compatibility with the previous single partition scenario, where the value is the offset of the last partition. For the offset of each partition, please refer to the StateOfPartition field.
     * @param ConsumerGroupOffset Consumer group offset. This field is for compatibility with the previous single partition scenario, where the value is the offset of the last partition. For the offset of each partition, please refer to the StateOfPartition field.
     */
    public void setConsumerGroupOffset(Long ConsumerGroupOffset) {
        this.ConsumerGroupOffset = ConsumerGroupOffset;
    }

    /**
     * Get The amount of data that has not been consumed by the consumer group. This field is for compatibility with the previous single partition scenario, where the value is the amount of unconsumed data in the last partition. For the amount of unconsumed data in each partition, refer to the StateOfPartition field. 
     * @return ConsumerGroupLag The amount of data that has not been consumed by the consumer group. This field is for compatibility with the previous single partition scenario, where the value is the amount of unconsumed data in the last partition. For the amount of unconsumed data in each partition, refer to the StateOfPartition field.
     */
    public Long getConsumerGroupLag() {
        return this.ConsumerGroupLag;
    }

    /**
     * Set The amount of data that has not been consumed by the consumer group. This field is for compatibility with the previous single partition scenario, where the value is the amount of unconsumed data in the last partition. For the amount of unconsumed data in each partition, refer to the StateOfPartition field.
     * @param ConsumerGroupLag The amount of data that has not been consumed by the consumer group. This field is for compatibility with the previous single partition scenario, where the value is the amount of unconsumed data in the last partition. For the amount of unconsumed data in each partition, refer to the StateOfPartition field.
     */
    public void setConsumerGroupLag(Long ConsumerGroupLag) {
        this.ConsumerGroupLag = ConsumerGroupLag;
    }

    /**
     * Get Consumption delay (in seconds) 
     * @return Latency Consumption delay (in seconds)
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set Consumption delay (in seconds)
     * @param Latency Consumption delay (in seconds)
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get Consumption status of each partition 
     * @return StateOfPartition Consumption status of each partition
     */
    public MonitorInfo [] getStateOfPartition() {
        return this.StateOfPartition;
    }

    /**
     * Set Consumption status of each partition
     * @param StateOfPartition Consumption status of each partition
     */
    public void setStateOfPartition(MonitorInfo [] StateOfPartition) {
        this.StateOfPartition = StateOfPartition;
    }

    /**
     * Get Consumer group creation time, the format is: YYYY-MM-DD hh:mm:ss. 
     * @return CreatedAt Consumer group creation time, the format is: YYYY-MM-DD hh:mm:ss.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Consumer group creation time, the format is: YYYY-MM-DD hh:mm:ss.
     * @param CreatedAt Consumer group creation time, the format is: YYYY-MM-DD hh:mm:ss.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Consumer group update time, the format is: YYYY-MM-DD hh:mm:ss. 
     * @return UpdatedAt Consumer group update time, the format is: YYYY-MM-DD hh:mm:ss.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Consumer group update time, the format is: YYYY-MM-DD hh:mm:ss.
     * @param UpdatedAt Consumer group update time, the format is: YYYY-MM-DD hh:mm:ss.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Consumer group states, including Dead, Empty, Stable, etc. Only Dead and Empty states can perform reset operations. 
     * @return ConsumerGroupState Consumer group states, including Dead, Empty, Stable, etc. Only Dead and Empty states can perform reset operations.
     */
    public String getConsumerGroupState() {
        return this.ConsumerGroupState;
    }

    /**
     * Set Consumer group states, including Dead, Empty, Stable, etc. Only Dead and Empty states can perform reset operations.
     * @param ConsumerGroupState Consumer group states, including Dead, Empty, Stable, etc. Only Dead and Empty states can perform reset operations.
     */
    public void setConsumerGroupState(String ConsumerGroupState) {
        this.ConsumerGroupState = ConsumerGroupState;
    }

    /**
     * Get The partition is being consumed by each consumer.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PartitionAssignment The partition is being consumed by each consumer.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PartitionAssignment [] getPartitionAssignment() {
        return this.PartitionAssignment;
    }

    /**
     * Set The partition is being consumed by each consumer.Note: This field may return null, indicating that no valid values can be obtained.
     * @param PartitionAssignment The partition is being consumed by each consumer.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitionAssignment(PartitionAssignment [] PartitionAssignment) {
        this.PartitionAssignment = PartitionAssignment;
    }

    public GroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfo(GroupInfo source) {
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.ConsumerGroupName != null) {
            this.ConsumerGroupName = new String(source.ConsumerGroupName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConsumerGroupOffset != null) {
            this.ConsumerGroupOffset = new Long(source.ConsumerGroupOffset);
        }
        if (source.ConsumerGroupLag != null) {
            this.ConsumerGroupLag = new Long(source.ConsumerGroupLag);
        }
        if (source.Latency != null) {
            this.Latency = new Long(source.Latency);
        }
        if (source.StateOfPartition != null) {
            this.StateOfPartition = new MonitorInfo[source.StateOfPartition.length];
            for (int i = 0; i < source.StateOfPartition.length; i++) {
                this.StateOfPartition[i] = new MonitorInfo(source.StateOfPartition[i]);
            }
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.ConsumerGroupState != null) {
            this.ConsumerGroupState = new String(source.ConsumerGroupState);
        }
        if (source.PartitionAssignment != null) {
            this.PartitionAssignment = new PartitionAssignment[source.PartitionAssignment.length];
            for (int i = 0; i < source.PartitionAssignment.length; i++) {
                this.PartitionAssignment[i] = new PartitionAssignment(source.PartitionAssignment[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "ConsumerGroupName", this.ConsumerGroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ConsumerGroupOffset", this.ConsumerGroupOffset);
        this.setParamSimple(map, prefix + "ConsumerGroupLag", this.ConsumerGroupLag);
        this.setParamSimple(map, prefix + "Latency", this.Latency);
        this.setParamArrayObj(map, prefix + "StateOfPartition.", this.StateOfPartition);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "ConsumerGroupState", this.ConsumerGroupState);
        this.setParamArrayObj(map, prefix + "PartitionAssignment.", this.PartitionAssignment);

    }
}

