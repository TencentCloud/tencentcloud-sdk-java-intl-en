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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Config extends AbstractModel{

    /**
    * Message retention period
Note: this field may return null, indicating that no valid values can be obtained.
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
    * Segment rolling duration
Note: this field may return null, indicating that no valid values can be obtained.
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
    * Number of bytes for segment rolling
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SegmentBytes")
    @Expose
    private Long SegmentBytes;

    /**
    * Maximum number of message bytes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxMessageBytes")
    @Expose
    private Long MaxMessageBytes;

    /**
    * Message retention file size.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RetentionBytes")
    @Expose
    private Long RetentionBytes;

    /**
     * Get Message retention period
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Retention Message retention period
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRetention() {
        return this.Retention;
    }

    /**
     * Set Message retention period
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Retention Message retention period
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Segment rolling duration
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SegmentMs Segment rolling duration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSegmentMs() {
        return this.SegmentMs;
    }

    /**
     * Set Segment rolling duration
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SegmentMs Segment rolling duration
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Number of bytes for segment rolling
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SegmentBytes Number of bytes for segment rolling
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSegmentBytes() {
        return this.SegmentBytes;
    }

    /**
     * Set Number of bytes for segment rolling
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SegmentBytes Number of bytes for segment rolling
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSegmentBytes(Long SegmentBytes) {
        this.SegmentBytes = SegmentBytes;
    }

    /**
     * Get Maximum number of message bytes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxMessageBytes Maximum number of message bytes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxMessageBytes() {
        return this.MaxMessageBytes;
    }

    /**
     * Set Maximum number of message bytes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxMessageBytes Maximum number of message bytes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxMessageBytes(Long MaxMessageBytes) {
        this.MaxMessageBytes = MaxMessageBytes;
    }

    /**
     * Get Message retention file size.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RetentionBytes Message retention file size.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getRetentionBytes() {
        return this.RetentionBytes;
    }

    /**
     * Set Message retention file size.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RetentionBytes Message retention file size.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRetentionBytes(Long RetentionBytes) {
        this.RetentionBytes = RetentionBytes;
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

    }
}

