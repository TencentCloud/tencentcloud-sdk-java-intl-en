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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CkafkaTargetParams extends AbstractModel{

    /**
    * CKafka topic to be delivered to
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Retry policy
    */
    @SerializedName("RetryPolicy")
    @Expose
    private RetryPolicy RetryPolicy;

    /**
     * Get CKafka topic to be delivered to 
     * @return TopicName CKafka topic to be delivered to
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set CKafka topic to be delivered to
     * @param TopicName CKafka topic to be delivered to
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Retry policy 
     * @return RetryPolicy Retry policy
     */
    public RetryPolicy getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * Set Retry policy
     * @param RetryPolicy Retry policy
     */
    public void setRetryPolicy(RetryPolicy RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    public CkafkaTargetParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CkafkaTargetParams(CkafkaTargetParams source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.RetryPolicy != null) {
            this.RetryPolicy = new RetryPolicy(source.RetryPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamObj(map, prefix + "RetryPolicy.", this.RetryPolicy);

    }
}

