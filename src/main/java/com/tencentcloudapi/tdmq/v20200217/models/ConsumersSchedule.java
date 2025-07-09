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

public class ConsumersSchedule extends AbstractModel {

    /**
    * ID of the current partition.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Partitions")
    @Expose
    private Long Partitions;

    /**
    * The number of messages.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NumberOfEntries")
    @Expose
    private Long NumberOfEntries;

    /**
    * The number of heaped messages.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgBacklog")
    @Expose
    private Long MsgBacklog;

    /**
    * The total number of messages delivered by the consumer per second.
    */
    @SerializedName("MsgRateOut")
    @Expose
    private String MsgRateOut;

    /**
    * The size (in bytes) of messages consumed by the consumer per second.
    */
    @SerializedName("MsgThroughputOut")
    @Expose
    private String MsgThroughputOut;

    /**
    * Percentage of messages discarded due to timeout.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgRateExpired")
    @Expose
    private String MsgRateExpired;

    /**
     * Get ID of the current partition.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Partitions ID of the current partition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPartitions() {
        return this.Partitions;
    }

    /**
     * Set ID of the current partition.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Partitions ID of the current partition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitions(Long Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get The number of messages.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NumberOfEntries The number of messages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNumberOfEntries() {
        return this.NumberOfEntries;
    }

    /**
     * Set The number of messages.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NumberOfEntries The number of messages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNumberOfEntries(Long NumberOfEntries) {
        this.NumberOfEntries = NumberOfEntries;
    }

    /**
     * Get The number of heaped messages.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MsgBacklog The number of heaped messages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMsgBacklog() {
        return this.MsgBacklog;
    }

    /**
     * Set The number of heaped messages.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MsgBacklog The number of heaped messages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgBacklog(Long MsgBacklog) {
        this.MsgBacklog = MsgBacklog;
    }

    /**
     * Get The total number of messages delivered by the consumer per second. 
     * @return MsgRateOut The total number of messages delivered by the consumer per second.
     */
    public String getMsgRateOut() {
        return this.MsgRateOut;
    }

    /**
     * Set The total number of messages delivered by the consumer per second.
     * @param MsgRateOut The total number of messages delivered by the consumer per second.
     */
    public void setMsgRateOut(String MsgRateOut) {
        this.MsgRateOut = MsgRateOut;
    }

    /**
     * Get The size (in bytes) of messages consumed by the consumer per second. 
     * @return MsgThroughputOut The size (in bytes) of messages consumed by the consumer per second.
     */
    public String getMsgThroughputOut() {
        return this.MsgThroughputOut;
    }

    /**
     * Set The size (in bytes) of messages consumed by the consumer per second.
     * @param MsgThroughputOut The size (in bytes) of messages consumed by the consumer per second.
     */
    public void setMsgThroughputOut(String MsgThroughputOut) {
        this.MsgThroughputOut = MsgThroughputOut;
    }

    /**
     * Get Percentage of messages discarded due to timeout.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MsgRateExpired Percentage of messages discarded due to timeout.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgRateExpired() {
        return this.MsgRateExpired;
    }

    /**
     * Set Percentage of messages discarded due to timeout.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MsgRateExpired Percentage of messages discarded due to timeout.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgRateExpired(String MsgRateExpired) {
        this.MsgRateExpired = MsgRateExpired;
    }

    public ConsumersSchedule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumersSchedule(ConsumersSchedule source) {
        if (source.Partitions != null) {
            this.Partitions = new Long(source.Partitions);
        }
        if (source.NumberOfEntries != null) {
            this.NumberOfEntries = new Long(source.NumberOfEntries);
        }
        if (source.MsgBacklog != null) {
            this.MsgBacklog = new Long(source.MsgBacklog);
        }
        if (source.MsgRateOut != null) {
            this.MsgRateOut = new String(source.MsgRateOut);
        }
        if (source.MsgThroughputOut != null) {
            this.MsgThroughputOut = new String(source.MsgThroughputOut);
        }
        if (source.MsgRateExpired != null) {
            this.MsgRateExpired = new String(source.MsgRateExpired);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "NumberOfEntries", this.NumberOfEntries);
        this.setParamSimple(map, prefix + "MsgBacklog", this.MsgBacklog);
        this.setParamSimple(map, prefix + "MsgRateOut", this.MsgRateOut);
        this.setParamSimple(map, prefix + "MsgThroughputOut", this.MsgThroughputOut);
        this.setParamSimple(map, prefix + "MsgRateExpired", this.MsgRateExpired);

    }
}

