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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeadLetterPolicy extends AbstractModel {

    /**
    * DeadLetterQueueName
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeadLetterQueueName")
    @Expose
    private String DeadLetterQueueName;

    /**
    * DeadLetterQueue
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeadLetterQueue")
    @Expose
    private String DeadLetterQueue;

    /**
    * Policy
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Policy")
    @Expose
    private Long Policy;

    /**
    * MaxTimeToLive
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxTimeToLive")
    @Expose
    private Long MaxTimeToLive;

    /**
    * MaxReceiveCount
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxReceiveCount")
    @Expose
    private Long MaxReceiveCount;

    /**
     * Get DeadLetterQueueName
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeadLetterQueueName DeadLetterQueueName
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDeadLetterQueueName() {
        return this.DeadLetterQueueName;
    }

    /**
     * Set DeadLetterQueueName
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeadLetterQueueName DeadLetterQueueName
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeadLetterQueueName(String DeadLetterQueueName) {
        this.DeadLetterQueueName = DeadLetterQueueName;
    }

    /**
     * Get DeadLetterQueue
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeadLetterQueue DeadLetterQueue
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDeadLetterQueue() {
        return this.DeadLetterQueue;
    }

    /**
     * Set DeadLetterQueue
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeadLetterQueue DeadLetterQueue
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeadLetterQueue(String DeadLetterQueue) {
        this.DeadLetterQueue = DeadLetterQueue;
    }

    /**
     * Get Policy
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Policy Policy
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPolicy() {
        return this.Policy;
    }

    /**
     * Set Policy
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Policy Policy
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicy(Long Policy) {
        this.Policy = Policy;
    }

    /**
     * Get MaxTimeToLive
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxTimeToLive MaxTimeToLive
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxTimeToLive() {
        return this.MaxTimeToLive;
    }

    /**
     * Set MaxTimeToLive
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxTimeToLive MaxTimeToLive
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxTimeToLive(Long MaxTimeToLive) {
        this.MaxTimeToLive = MaxTimeToLive;
    }

    /**
     * Get MaxReceiveCount
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxReceiveCount MaxReceiveCount
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxReceiveCount() {
        return this.MaxReceiveCount;
    }

    /**
     * Set MaxReceiveCount
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxReceiveCount MaxReceiveCount
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxReceiveCount(Long MaxReceiveCount) {
        this.MaxReceiveCount = MaxReceiveCount;
    }

    public DeadLetterPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeadLetterPolicy(DeadLetterPolicy source) {
        if (source.DeadLetterQueueName != null) {
            this.DeadLetterQueueName = new String(source.DeadLetterQueueName);
        }
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
        this.setParamSimple(map, prefix + "DeadLetterQueueName", this.DeadLetterQueueName);
        this.setParamSimple(map, prefix + "DeadLetterQueue", this.DeadLetterQueue);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "MaxTimeToLive", this.MaxTimeToLive);
        this.setParamSimple(map, prefix + "MaxReceiveCount", this.MaxReceiveCount);

    }
}

