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

public class TopicStats extends AbstractModel {

    /**
    * Broker node.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BrokerName")
    @Expose
    private String BrokerName;

    /**
    * Queue number.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QueueId")
    @Expose
    private Long QueueId;

    /**
    * Minimum offset.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinOffset")
    @Expose
    private Long MinOffset;

    /**
    * Specifies the maximum offset.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxOffset")
    @Expose
    private Long MaxOffset;

    /**
    * Message count.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageCount")
    @Expose
    private Long MessageCount;

    /**
    * Last message write time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastUpdateTimestamp")
    @Expose
    private Long LastUpdateTimestamp;

    /**
     * Get Broker node.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BrokerName Broker node.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBrokerName() {
        return this.BrokerName;
    }

    /**
     * Set Broker node.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BrokerName Broker node.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBrokerName(String BrokerName) {
        this.BrokerName = BrokerName;
    }

    /**
     * Get Queue number.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QueueId Queue number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getQueueId() {
        return this.QueueId;
    }

    /**
     * Set Queue number.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QueueId Queue number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQueueId(Long QueueId) {
        this.QueueId = QueueId;
    }

    /**
     * Get Minimum offset.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MinOffset Minimum offset.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinOffset() {
        return this.MinOffset;
    }

    /**
     * Set Minimum offset.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MinOffset Minimum offset.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinOffset(Long MinOffset) {
        this.MinOffset = MinOffset;
    }

    /**
     * Get Specifies the maximum offset.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxOffset Specifies the maximum offset.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxOffset() {
        return this.MaxOffset;
    }

    /**
     * Set Specifies the maximum offset.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxOffset Specifies the maximum offset.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxOffset(Long MaxOffset) {
        this.MaxOffset = MaxOffset;
    }

    /**
     * Get Message count.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MessageCount Message count.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMessageCount() {
        return this.MessageCount;
    }

    /**
     * Set Message count.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MessageCount Message count.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessageCount(Long MessageCount) {
        this.MessageCount = MessageCount;
    }

    /**
     * Get Last message write time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastUpdateTimestamp Last message write time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastUpdateTimestamp() {
        return this.LastUpdateTimestamp;
    }

    /**
     * Set Last message write time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastUpdateTimestamp Last message write time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastUpdateTimestamp(Long LastUpdateTimestamp) {
        this.LastUpdateTimestamp = LastUpdateTimestamp;
    }

    public TopicStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicStats(TopicStats source) {
        if (source.BrokerName != null) {
            this.BrokerName = new String(source.BrokerName);
        }
        if (source.QueueId != null) {
            this.QueueId = new Long(source.QueueId);
        }
        if (source.MinOffset != null) {
            this.MinOffset = new Long(source.MinOffset);
        }
        if (source.MaxOffset != null) {
            this.MaxOffset = new Long(source.MaxOffset);
        }
        if (source.MessageCount != null) {
            this.MessageCount = new Long(source.MessageCount);
        }
        if (source.LastUpdateTimestamp != null) {
            this.LastUpdateTimestamp = new Long(source.LastUpdateTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BrokerName", this.BrokerName);
        this.setParamSimple(map, prefix + "QueueId", this.QueueId);
        this.setParamSimple(map, prefix + "MinOffset", this.MinOffset);
        this.setParamSimple(map, prefix + "MaxOffset", this.MaxOffset);
        this.setParamSimple(map, prefix + "MessageCount", this.MessageCount);
        this.setParamSimple(map, prefix + "LastUpdateTimestamp", this.LastUpdateTimestamp);

    }
}

