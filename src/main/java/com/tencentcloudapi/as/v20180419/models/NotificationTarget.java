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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotificationTarget extends AbstractModel {

    /**
    * Target type. Valid values: `CMQ_QUEUE`, `CMQ_TOPIC`, `TDMQ_CMQ_QUEUE` and `TDMQ_CMQ_TOPIC`.
<li> CMQ_QUEUE: Tencent Cloud message queue - queue model.</li>
<li> CMQ_TOPIC: Tencent Cloud message queue - topic model.</li>
<li> TDMQ_CMQ_QUEUE: Tencent Cloud TDMQ message queue - queue model.</li>
<li> TDMQ_CMQ_TOPIC: Tencent Cloud TDMQ message queue - topic model.</li>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Queue name. This parameter is required when `TargetType` is `CMQ_QUEUE` or `TDMQ_CMQ_QUEUE`.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Topic name. This parameter is required when `TargetType` is `CMQ_TOPIC` or `TDMQ_CMQ_TOPIC`.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get Target type. Valid values: `CMQ_QUEUE`, `CMQ_TOPIC`, `TDMQ_CMQ_QUEUE` and `TDMQ_CMQ_TOPIC`.
<li> CMQ_QUEUE: Tencent Cloud message queue - queue model.</li>
<li> CMQ_TOPIC: Tencent Cloud message queue - topic model.</li>
<li> TDMQ_CMQ_QUEUE: Tencent Cloud TDMQ message queue - queue model.</li>
<li> TDMQ_CMQ_TOPIC: Tencent Cloud TDMQ message queue - topic model.</li> 
     * @return TargetType Target type. Valid values: `CMQ_QUEUE`, `CMQ_TOPIC`, `TDMQ_CMQ_QUEUE` and `TDMQ_CMQ_TOPIC`.
<li> CMQ_QUEUE: Tencent Cloud message queue - queue model.</li>
<li> CMQ_TOPIC: Tencent Cloud message queue - topic model.</li>
<li> TDMQ_CMQ_QUEUE: Tencent Cloud TDMQ message queue - queue model.</li>
<li> TDMQ_CMQ_TOPIC: Tencent Cloud TDMQ message queue - topic model.</li>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Target type. Valid values: `CMQ_QUEUE`, `CMQ_TOPIC`, `TDMQ_CMQ_QUEUE` and `TDMQ_CMQ_TOPIC`.
<li> CMQ_QUEUE: Tencent Cloud message queue - queue model.</li>
<li> CMQ_TOPIC: Tencent Cloud message queue - topic model.</li>
<li> TDMQ_CMQ_QUEUE: Tencent Cloud TDMQ message queue - queue model.</li>
<li> TDMQ_CMQ_TOPIC: Tencent Cloud TDMQ message queue - topic model.</li>
     * @param TargetType Target type. Valid values: `CMQ_QUEUE`, `CMQ_TOPIC`, `TDMQ_CMQ_QUEUE` and `TDMQ_CMQ_TOPIC`.
<li> CMQ_QUEUE: Tencent Cloud message queue - queue model.</li>
<li> CMQ_TOPIC: Tencent Cloud message queue - topic model.</li>
<li> TDMQ_CMQ_QUEUE: Tencent Cloud TDMQ message queue - queue model.</li>
<li> TDMQ_CMQ_TOPIC: Tencent Cloud TDMQ message queue - topic model.</li>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Queue name. This parameter is required when `TargetType` is `CMQ_QUEUE` or `TDMQ_CMQ_QUEUE`. 
     * @return QueueName Queue name. This parameter is required when `TargetType` is `CMQ_QUEUE` or `TDMQ_CMQ_QUEUE`.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Queue name. This parameter is required when `TargetType` is `CMQ_QUEUE` or `TDMQ_CMQ_QUEUE`.
     * @param QueueName Queue name. This parameter is required when `TargetType` is `CMQ_QUEUE` or `TDMQ_CMQ_QUEUE`.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Topic name. This parameter is required when `TargetType` is `CMQ_TOPIC` or `TDMQ_CMQ_TOPIC`. 
     * @return TopicName Topic name. This parameter is required when `TargetType` is `CMQ_TOPIC` or `TDMQ_CMQ_TOPIC`.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name. This parameter is required when `TargetType` is `CMQ_TOPIC` or `TDMQ_CMQ_TOPIC`.
     * @param TopicName Topic name. This parameter is required when `TargetType` is `CMQ_TOPIC` or `TDMQ_CMQ_TOPIC`.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public NotificationTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotificationTarget(NotificationTarget source) {
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

