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

public class CmqDeadLetterPolicy extends AbstractModel {

    /**
    * Dead letter queue.
    */
    @SerializedName("DeadLetterQueue")
    @Expose
    private String DeadLetterQueue;

    /**
    * Dead letter queue policy. 0: maximum number of receipt. 1: maximum unconsumed time.
    */
    @SerializedName("Policy")
    @Expose
    private Long Policy;

    /**
    * Maximum unconsumed expiration time. Required if policy is 1. Range: 300-43,200 seconds, must be less than the maximum message retention time MsgRetentionSeconds.
    */
    @SerializedName("MaxTimeToLive")
    @Expose
    private Long MaxTimeToLive;

    /**
    * Maximum number of receipt. required when Policy is 0. value range: 1 to 1000.
    */
    @SerializedName("MaxReceiveCount")
    @Expose
    private Long MaxReceiveCount;

    /**
     * Get Dead letter queue. 
     * @return DeadLetterQueue Dead letter queue.
     */
    public String getDeadLetterQueue() {
        return this.DeadLetterQueue;
    }

    /**
     * Set Dead letter queue.
     * @param DeadLetterQueue Dead letter queue.
     */
    public void setDeadLetterQueue(String DeadLetterQueue) {
        this.DeadLetterQueue = DeadLetterQueue;
    }

    /**
     * Get Dead letter queue policy. 0: maximum number of receipt. 1: maximum unconsumed time. 
     * @return Policy Dead letter queue policy. 0: maximum number of receipt. 1: maximum unconsumed time.
     */
    public Long getPolicy() {
        return this.Policy;
    }

    /**
     * Set Dead letter queue policy. 0: maximum number of receipt. 1: maximum unconsumed time.
     * @param Policy Dead letter queue policy. 0: maximum number of receipt. 1: maximum unconsumed time.
     */
    public void setPolicy(Long Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Maximum unconsumed expiration time. Required if policy is 1. Range: 300-43,200 seconds, must be less than the maximum message retention time MsgRetentionSeconds. 
     * @return MaxTimeToLive Maximum unconsumed expiration time. Required if policy is 1. Range: 300-43,200 seconds, must be less than the maximum message retention time MsgRetentionSeconds.
     */
    public Long getMaxTimeToLive() {
        return this.MaxTimeToLive;
    }

    /**
     * Set Maximum unconsumed expiration time. Required if policy is 1. Range: 300-43,200 seconds, must be less than the maximum message retention time MsgRetentionSeconds.
     * @param MaxTimeToLive Maximum unconsumed expiration time. Required if policy is 1. Range: 300-43,200 seconds, must be less than the maximum message retention time MsgRetentionSeconds.
     */
    public void setMaxTimeToLive(Long MaxTimeToLive) {
        this.MaxTimeToLive = MaxTimeToLive;
    }

    /**
     * Get Maximum number of receipt. required when Policy is 0. value range: 1 to 1000. 
     * @return MaxReceiveCount Maximum number of receipt. required when Policy is 0. value range: 1 to 1000.
     */
    public Long getMaxReceiveCount() {
        return this.MaxReceiveCount;
    }

    /**
     * Set Maximum number of receipt. required when Policy is 0. value range: 1 to 1000.
     * @param MaxReceiveCount Maximum number of receipt. required when Policy is 0. value range: 1 to 1000.
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

