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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGroupOffsetsRequest extends AbstractModel {

    /**
    * Kafka instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Kafka consumer group
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * Offset resetting policy. Meanings of the input parameters: 0: equivalent to the `shift-by` parameter, which indicates to shift the offset forward or backward by the value of the `shift`. 1: equivalent to `by-duration`, `to-datetime`, `to-earliest`, or `to-latest`, which indicates to move the offset to the specified timestamp. 2: equivalent to `to-offset`, which indicates to move the offset to the specified offset position
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * Indicates the topics to be reset. If this parameter is left empty, all topics will be reset
    */
    @SerializedName("Topics")
    @Expose
    private String [] Topics;

    /**
    * When `strategy` is 0, this field is required. If it is above zero, the offset will be shifted backward by the value of the `shift`. If it is below zero, the offset will be shifted forward by the value of the `shift`. After a correct reset, the new offset should be (old_offset + shift). Note that if the new offset is smaller than the `earliest` parameter of the partition, it will be set to `earliest`, and if it is greater than the `latest` parameter of the partition, it will be set to `latest`
    */
    @SerializedName("Shift")
    @Expose
    private Long Shift;

    /**
    * Unit: ms. When `strategy` is 1, this field is required, where -2 indicates to reset the offset to the initial position, -1 indicates to reset to the latest position (equivalent to emptying), and other values represent the specified time, i.e., the offset of the topic at the specified time will be obtained and then reset. Note that if there is no message at the specified time, the last offset will be obtained
    */
    @SerializedName("ShiftTimestamp")
    @Expose
    private Long ShiftTimestamp;

    /**
    * Position of the offset that needs to be reset. When `strategy` is 2, this field is required
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * List of partitions that need to be reset. If the topics parameter is not specified, reset partitions in the corresponding partition list of all topics. If the topics parameter is specified, reset partitions of the corresponding partition list of the specified topic list.
    */
    @SerializedName("Partitions")
    @Expose
    private Long [] Partitions;

    /**
     * Get Kafka instance ID 
     * @return InstanceId Kafka instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Kafka instance ID
     * @param InstanceId Kafka instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Kafka consumer group 
     * @return Group Kafka consumer group
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set Kafka consumer group
     * @param Group Kafka consumer group
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get Offset resetting policy. Meanings of the input parameters: 0: equivalent to the `shift-by` parameter, which indicates to shift the offset forward or backward by the value of the `shift`. 1: equivalent to `by-duration`, `to-datetime`, `to-earliest`, or `to-latest`, which indicates to move the offset to the specified timestamp. 2: equivalent to `to-offset`, which indicates to move the offset to the specified offset position 
     * @return Strategy Offset resetting policy. Meanings of the input parameters: 0: equivalent to the `shift-by` parameter, which indicates to shift the offset forward or backward by the value of the `shift`. 1: equivalent to `by-duration`, `to-datetime`, `to-earliest`, or `to-latest`, which indicates to move the offset to the specified timestamp. 2: equivalent to `to-offset`, which indicates to move the offset to the specified offset position
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Offset resetting policy. Meanings of the input parameters: 0: equivalent to the `shift-by` parameter, which indicates to shift the offset forward or backward by the value of the `shift`. 1: equivalent to `by-duration`, `to-datetime`, `to-earliest`, or `to-latest`, which indicates to move the offset to the specified timestamp. 2: equivalent to `to-offset`, which indicates to move the offset to the specified offset position
     * @param Strategy Offset resetting policy. Meanings of the input parameters: 0: equivalent to the `shift-by` parameter, which indicates to shift the offset forward or backward by the value of the `shift`. 1: equivalent to `by-duration`, `to-datetime`, `to-earliest`, or `to-latest`, which indicates to move the offset to the specified timestamp. 2: equivalent to `to-offset`, which indicates to move the offset to the specified offset position
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get Indicates the topics to be reset. If this parameter is left empty, all topics will be reset 
     * @return Topics Indicates the topics to be reset. If this parameter is left empty, all topics will be reset
     */
    public String [] getTopics() {
        return this.Topics;
    }

    /**
     * Set Indicates the topics to be reset. If this parameter is left empty, all topics will be reset
     * @param Topics Indicates the topics to be reset. If this parameter is left empty, all topics will be reset
     */
    public void setTopics(String [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get When `strategy` is 0, this field is required. If it is above zero, the offset will be shifted backward by the value of the `shift`. If it is below zero, the offset will be shifted forward by the value of the `shift`. After a correct reset, the new offset should be (old_offset + shift). Note that if the new offset is smaller than the `earliest` parameter of the partition, it will be set to `earliest`, and if it is greater than the `latest` parameter of the partition, it will be set to `latest` 
     * @return Shift When `strategy` is 0, this field is required. If it is above zero, the offset will be shifted backward by the value of the `shift`. If it is below zero, the offset will be shifted forward by the value of the `shift`. After a correct reset, the new offset should be (old_offset + shift). Note that if the new offset is smaller than the `earliest` parameter of the partition, it will be set to `earliest`, and if it is greater than the `latest` parameter of the partition, it will be set to `latest`
     */
    public Long getShift() {
        return this.Shift;
    }

    /**
     * Set When `strategy` is 0, this field is required. If it is above zero, the offset will be shifted backward by the value of the `shift`. If it is below zero, the offset will be shifted forward by the value of the `shift`. After a correct reset, the new offset should be (old_offset + shift). Note that if the new offset is smaller than the `earliest` parameter of the partition, it will be set to `earliest`, and if it is greater than the `latest` parameter of the partition, it will be set to `latest`
     * @param Shift When `strategy` is 0, this field is required. If it is above zero, the offset will be shifted backward by the value of the `shift`. If it is below zero, the offset will be shifted forward by the value of the `shift`. After a correct reset, the new offset should be (old_offset + shift). Note that if the new offset is smaller than the `earliest` parameter of the partition, it will be set to `earliest`, and if it is greater than the `latest` parameter of the partition, it will be set to `latest`
     */
    public void setShift(Long Shift) {
        this.Shift = Shift;
    }

    /**
     * Get Unit: ms. When `strategy` is 1, this field is required, where -2 indicates to reset the offset to the initial position, -1 indicates to reset to the latest position (equivalent to emptying), and other values represent the specified time, i.e., the offset of the topic at the specified time will be obtained and then reset. Note that if there is no message at the specified time, the last offset will be obtained 
     * @return ShiftTimestamp Unit: ms. When `strategy` is 1, this field is required, where -2 indicates to reset the offset to the initial position, -1 indicates to reset to the latest position (equivalent to emptying), and other values represent the specified time, i.e., the offset of the topic at the specified time will be obtained and then reset. Note that if there is no message at the specified time, the last offset will be obtained
     */
    public Long getShiftTimestamp() {
        return this.ShiftTimestamp;
    }

    /**
     * Set Unit: ms. When `strategy` is 1, this field is required, where -2 indicates to reset the offset to the initial position, -1 indicates to reset to the latest position (equivalent to emptying), and other values represent the specified time, i.e., the offset of the topic at the specified time will be obtained and then reset. Note that if there is no message at the specified time, the last offset will be obtained
     * @param ShiftTimestamp Unit: ms. When `strategy` is 1, this field is required, where -2 indicates to reset the offset to the initial position, -1 indicates to reset to the latest position (equivalent to emptying), and other values represent the specified time, i.e., the offset of the topic at the specified time will be obtained and then reset. Note that if there is no message at the specified time, the last offset will be obtained
     */
    public void setShiftTimestamp(Long ShiftTimestamp) {
        this.ShiftTimestamp = ShiftTimestamp;
    }

    /**
     * Get Position of the offset that needs to be reset. When `strategy` is 2, this field is required 
     * @return Offset Position of the offset that needs to be reset. When `strategy` is 2, this field is required
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Position of the offset that needs to be reset. When `strategy` is 2, this field is required
     * @param Offset Position of the offset that needs to be reset. When `strategy` is 2, this field is required
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get List of partitions that need to be reset. If the topics parameter is not specified, reset partitions in the corresponding partition list of all topics. If the topics parameter is specified, reset partitions of the corresponding partition list of the specified topic list. 
     * @return Partitions List of partitions that need to be reset. If the topics parameter is not specified, reset partitions in the corresponding partition list of all topics. If the topics parameter is specified, reset partitions of the corresponding partition list of the specified topic list.
     */
    public Long [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set List of partitions that need to be reset. If the topics parameter is not specified, reset partitions in the corresponding partition list of all topics. If the topics parameter is specified, reset partitions of the corresponding partition list of the specified topic list.
     * @param Partitions List of partitions that need to be reset. If the topics parameter is not specified, reset partitions in the corresponding partition list of all topics. If the topics parameter is specified, reset partitions of the corresponding partition list of the specified topic list.
     */
    public void setPartitions(Long [] Partitions) {
        this.Partitions = Partitions;
    }

    public ModifyGroupOffsetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGroupOffsetsRequest(ModifyGroupOffsetsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.Topics != null) {
            this.Topics = new String[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new String(source.Topics[i]);
            }
        }
        if (source.Shift != null) {
            this.Shift = new Long(source.Shift);
        }
        if (source.ShiftTimestamp != null) {
            this.ShiftTimestamp = new Long(source.ShiftTimestamp);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Partitions != null) {
            this.Partitions = new Long[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new Long(source.Partitions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamArraySimple(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "Shift", this.Shift);
        this.setParamSimple(map, prefix + "ShiftTimestamp", this.ShiftTimestamp);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "Partitions.", this.Partitions);

    }
}

