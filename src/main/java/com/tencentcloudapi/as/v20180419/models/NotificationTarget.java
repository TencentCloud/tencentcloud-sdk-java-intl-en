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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotificationTarget extends AbstractModel{

    /**
    * Target type. Value range: `CMQ_QUEUE`, `CMQ_TOPIC`.
<li> CMQ_QUEUE: CMQ_QUEUE: CMQ queue model.</li>
<li> CMQ_TOPIC: CMQ topic model.</li>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Queue name. If `TargetType` is `CMQ_QUEUE`, this parameter is required.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Topic name. If `TargetType` is `CMQ_TOPIC`, this parameter is required.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get Target type. Value range: `CMQ_QUEUE`, `CMQ_TOPIC`.
<li> CMQ_QUEUE: CMQ_QUEUE: CMQ queue model.</li>
<li> CMQ_TOPIC: CMQ topic model.</li> 
     * @return TargetType Target type. Value range: `CMQ_QUEUE`, `CMQ_TOPIC`.
<li> CMQ_QUEUE: CMQ_QUEUE: CMQ queue model.</li>
<li> CMQ_TOPIC: CMQ topic model.</li>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Target type. Value range: `CMQ_QUEUE`, `CMQ_TOPIC`.
<li> CMQ_QUEUE: CMQ_QUEUE: CMQ queue model.</li>
<li> CMQ_TOPIC: CMQ topic model.</li>
     * @param TargetType Target type. Value range: `CMQ_QUEUE`, `CMQ_TOPIC`.
<li> CMQ_QUEUE: CMQ_QUEUE: CMQ queue model.</li>
<li> CMQ_TOPIC: CMQ topic model.</li>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Queue name. If `TargetType` is `CMQ_QUEUE`, this parameter is required. 
     * @return QueueName Queue name. If `TargetType` is `CMQ_QUEUE`, this parameter is required.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Queue name. If `TargetType` is `CMQ_QUEUE`, this parameter is required.
     * @param QueueName Queue name. If `TargetType` is `CMQ_QUEUE`, this parameter is required.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Topic name. If `TargetType` is `CMQ_TOPIC`, this parameter is required. 
     * @return TopicName Topic name. If `TargetType` is `CMQ_TOPIC`, this parameter is required.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name. If `TargetType` is `CMQ_TOPIC`, this parameter is required.
     * @param TopicName Topic name. If `TargetType` is `CMQ_TOPIC`, this parameter is required.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
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

