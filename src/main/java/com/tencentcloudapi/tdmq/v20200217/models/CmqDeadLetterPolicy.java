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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CmqDeadLetterPolicy extends AbstractModel {

    /**
    * Dead letter queue.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeadLetterQueue")
    @Expose
    private String DeadLetterQueue;

    /**
    * Dead letter queue policy.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Policy")
    @Expose
    private Long Policy;

    /**
    * Maximum period in seconds before an unconsumed message expires, which is required if `Policy` is 1. Value range: 300–43200. This value should be smaller than `MsgRetentionSeconds` (maximum message retention period)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxTimeToLive")
    @Expose
    private Long MaxTimeToLive;

    /**
    * Maximum number of receipts.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxReceiveCount")
    @Expose
    private Long MaxReceiveCount;

    /**
     * Get Dead letter queue.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeadLetterQueue Dead letter queue.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDeadLetterQueue() {
        return this.DeadLetterQueue;
    }

    /**
     * Set Dead letter queue.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeadLetterQueue Dead letter queue.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeadLetterQueue(String DeadLetterQueue) {
        this.DeadLetterQueue = DeadLetterQueue;
    }

    /**
     * Get Dead letter queue policy.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Policy Dead letter queue policy.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPolicy() {
        return this.Policy;
    }

    /**
     * Set Dead letter queue policy.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Policy Dead letter queue policy.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicy(Long Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Maximum period in seconds before an unconsumed message expires, which is required if `Policy` is 1. Value range: 300–43200. This value should be smaller than `MsgRetentionSeconds` (maximum message retention period)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxTimeToLive Maximum period in seconds before an unconsumed message expires, which is required if `Policy` is 1. Value range: 300–43200. This value should be smaller than `MsgRetentionSeconds` (maximum message retention period)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxTimeToLive() {
        return this.MaxTimeToLive;
    }

    /**
     * Set Maximum period in seconds before an unconsumed message expires, which is required if `Policy` is 1. Value range: 300–43200. This value should be smaller than `MsgRetentionSeconds` (maximum message retention period)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxTimeToLive Maximum period in seconds before an unconsumed message expires, which is required if `Policy` is 1. Value range: 300–43200. This value should be smaller than `MsgRetentionSeconds` (maximum message retention period)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxTimeToLive(Long MaxTimeToLive) {
        this.MaxTimeToLive = MaxTimeToLive;
    }

    /**
     * Get Maximum number of receipts.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxReceiveCount Maximum number of receipts.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxReceiveCount() {
        return this.MaxReceiveCount;
    }

    /**
     * Set Maximum number of receipts.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxReceiveCount Maximum number of receipts.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxReceiveCount(Long MaxReceiveCount) {
        this.MaxReceiveCount = MaxReceiveCount;
    }

    public CmqDeadLetterPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CmqDeadLetterPolicy(CmqDeadLetterPolicy source) {
        if (source.DeadLetterQueue != null) {
            this.DeadLetterQueue = new String(source.DeadLetterQueue);
        }
        if (source.Policy != null) {
            this.Policy = new Long(source.Policy);
        }
        if (source.MaxTimeToLive != null) {
            this.MaxTimeToLive = new Long(source.MaxTimeToLive);
        }
        if (source.MaxReceiveCount != null) {
            this.MaxReceiveCount = new Long(source.MaxReceiveCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeadLetterQueue", this.DeadLetterQueue);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "MaxTimeToLive", this.MaxTimeToLive);
        this.setParamSimple(map, prefix + "MaxReceiveCount", this.MaxReceiveCount);

    }
}

