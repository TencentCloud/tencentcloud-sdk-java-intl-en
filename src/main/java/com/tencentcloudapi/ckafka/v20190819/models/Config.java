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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Config extends AbstractModel {

    /**
    * Message retention period in milliseconds.
    */
    @SerializedName("Retention")
    @Expose
    private Long Retention;

    /**
    * Minimum number of sync replications
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinInsyncReplicas")
    @Expose
    private Long MinInsyncReplicas;

    /**
    * Log cleanup mode. Default value: delete.
delete: logs will be deleted by save time; compact: logs will be compressed by key; compact, delete: logs will be compressed by key and deleted by save time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CleanUpPolicy")
    @Expose
    private String CleanUpPolicy;

    /**
    * Duration of Segment shard scrolling in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SegmentMs")
    @Expose
    private Long SegmentMs;

    /**
    * 0: false, 1: true.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * Segment specifies the number of bytes for sharding scroll. unit: bytes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SegmentBytes")
    @Expose
    private Long SegmentBytes;

    /**
    * Maximum message byte size. unit: bytes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxMessageBytes")
    @Expose
    private Long MaxMessageBytes;

    /**
    * Specifies the message retention file size in Bytes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RetentionBytes")
    @Expose
    private Long RetentionBytes;

    /**
    * The time type for message saving. CreateTime means the time when the producer created this message. LogAppendTime means the time when the broker received the message.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogMsgTimestampType")
    @Expose
    private String LogMsgTimestampType;

    /**
     * Get Message retention period in milliseconds. 
     * @return Retention Message retention period in milliseconds.
     */
    public Long getRetention() {
        return this.Retention;
    }

    /**
     * Set Message retention period in milliseconds.
     * @param Retention Message retention period in milliseconds.
     */
    public void setRetention(Long Retention) {
        this.Retention = Retention;
    }

    /**
     * Get Minimum number of sync replications
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MinInsyncReplicas Minimum number of sync replications
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinInsyncReplicas() {
        return this.MinInsyncReplicas;
    }

    /**
     * Set Minimum number of sync replications
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MinInsyncReplicas Minimum number of sync replications
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMinInsyncReplicas(Long MinInsyncReplicas) {
        this.MinInsyncReplicas = MinInsyncReplicas;
    }

    /**
     * Get Log cleanup mode. Default value: delete.
delete: logs will be deleted by save time; compact: logs will be compressed by key; compact, delete: logs will be compressed by key and deleted by save time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CleanUpPolicy Log cleanup mode. Default value: delete.
delete: logs will be deleted by save time; compact: logs will be compressed by key; compact, delete: logs will be compressed by key and deleted by save time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCleanUpPolicy() {
        return this.CleanUpPolicy;
    }

    /**
     * Set Log cleanup mode. Default value: delete.
delete: logs will be deleted by save time; compact: logs will be compressed by key; compact, delete: logs will be compressed by key and deleted by save time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CleanUpPolicy Log cleanup mode. Default value: delete.
delete: logs will be deleted by save time; compact: logs will be compressed by key; compact, delete: logs will be compressed by key and deleted by save time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCleanUpPolicy(String CleanUpPolicy) {
        this.CleanUpPolicy = CleanUpPolicy;
    }

    /**
     * Get Duration of Segment shard scrolling in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SegmentMs Duration of Segment shard scrolling in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSegmentMs() {
        return this.SegmentMs;
    }

    /**
     * Set Duration of Segment shard scrolling in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SegmentMs Duration of Segment shard scrolling in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSegmentMs(Long SegmentMs) {
        this.SegmentMs = SegmentMs;
    }

    /**
     * Get 0: false, 1: true.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UncleanLeaderElectionEnable 0: false, 1: true.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set 0: false, 1: true.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UncleanLeaderElectionEnable 0: false, 1: true.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get Segment specifies the number of bytes for sharding scroll. unit: bytes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SegmentBytes Segment specifies the number of bytes for sharding scroll. unit: bytes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSegmentBytes() {
        return this.SegmentBytes;
    }

    /**
     * Set Segment specifies the number of bytes for sharding scroll. unit: bytes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SegmentBytes Segment specifies the number of bytes for sharding scroll. unit: bytes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSegmentBytes(Long SegmentBytes) {
        this.SegmentBytes = SegmentBytes;
    }

    /**
     * Get Maximum message byte size. unit: bytes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxMessageBytes Maximum message byte size. unit: bytes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxMessageBytes() {
        return this.MaxMessageBytes;
    }

    /**
     * Set Maximum message byte size. unit: bytes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxMessageBytes Maximum message byte size. unit: bytes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxMessageBytes(Long MaxMessageBytes) {
        this.MaxMessageBytes = MaxMessageBytes;
    }

    /**
     * Get Specifies the message retention file size in Bytes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RetentionBytes Specifies the message retention file size in Bytes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRetentionBytes() {
        return this.RetentionBytes;
    }

    /**
     * Set Specifies the message retention file size in Bytes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RetentionBytes Specifies the message retention file size in Bytes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRetentionBytes(Long RetentionBytes) {
        this.RetentionBytes = RetentionBytes;
    }

    /**
     * Get The time type for message saving. CreateTime means the time when the producer created this message. LogAppendTime means the time when the broker received the message.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogMsgTimestampType The time type for message saving. CreateTime means the time when the producer created this message. LogAppendTime means the time when the broker received the message.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogMsgTimestampType() {
        return this.LogMsgTimestampType;
    }

    /**
     * Set The time type for message saving. CreateTime means the time when the producer created this message. LogAppendTime means the time when the broker received the message.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogMsgTimestampType The time type for message saving. CreateTime means the time when the producer created this message. LogAppendTime means the time when the broker received the message.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogMsgTimestampType(String LogMsgTimestampType) {
        this.LogMsgTimestampType = LogMsgTimestampType;
    }

    public Config() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Config(Config source) {
        if (source.Retention != null) {
            this.Retention = new Long(source.Retention);
        }
        if (source.MinInsyncReplicas != null) {
            this.MinInsyncReplicas = new Long(source.MinInsyncReplicas);
        }
        if (source.CleanUpPolicy != null) {
            this.CleanUpPolicy = new String(source.CleanUpPolicy);
        }
        if (source.SegmentMs != null) {
            this.SegmentMs = new Long(source.SegmentMs);
        }
        if (source.UncleanLeaderElectionEnable != null) {
            this.UncleanLeaderElectionEnable = new Long(source.UncleanLeaderElectionEnable);
        }
        if (source.SegmentBytes != null) {
            this.SegmentBytes = new Long(source.SegmentBytes);
        }
        if (source.MaxMessageBytes != null) {
            this.MaxMessageBytes = new Long(source.MaxMessageBytes);
        }
        if (source.RetentionBytes != null) {
            this.RetentionBytes = new Long(source.RetentionBytes);
        }
        if (source.LogMsgTimestampType != null) {
            this.LogMsgTimestampType = new String(source.LogMsgTimestampType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Retention", this.Retention);
        this.setParamSimple(map, prefix + "MinInsyncReplicas", this.MinInsyncReplicas);
        this.setParamSimple(map, prefix + "CleanUpPolicy", this.CleanUpPolicy);
        this.setParamSimple(map, prefix + "SegmentMs", this.SegmentMs);
        this.setParamSimple(map, prefix + "UncleanLeaderElectionEnable", this.UncleanLeaderElectionEnable);
        this.setParamSimple(map, prefix + "SegmentBytes", this.SegmentBytes);
        this.setParamSimple(map, prefix + "MaxMessageBytes", this.MaxMessageBytes);
        this.setParamSimple(map, prefix + "RetentionBytes", this.RetentionBytes);
        this.setParamSimple(map, prefix + "LogMsgTimestampType", this.LogMsgTimestampType);

    }
}

