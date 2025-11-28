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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicConsumeStats extends AbstractModel {

    /**
    * Topic name
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Topic type. valid values are as follows:.

-UNSPECIFIED: unspecified.
-NORMAL: standard message.
-FIFO: specifies sequential messaging.
-DELAY: specifies the delayed message.
-Specifies the TRANSACTION message.
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * Number of topic queues per node
    */
    @SerializedName("QueueNum")
    @Expose
    private Long QueueNum;

    /**
    * Consumption heap
    */
    @SerializedName("ConsumerLag")
    @Expose
    private Long ConsumerLag;

    /**
    * Subscription rule. `*` indicates subscription to all topics.
    */
    @SerializedName("SubString")
    @Expose
    private String SubString;

    /**
    * Last consumption progress update time. **It is a Unix timestamp (ms).**
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private Long LastUpdateTime;

    /**
     * Get Topic name 
     * @return Topic Topic name
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic name
     * @param Topic Topic name
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Topic type. valid values are as follows:.

-UNSPECIFIED: unspecified.
-NORMAL: standard message.
-FIFO: specifies sequential messaging.
-DELAY: specifies the delayed message.
-Specifies the TRANSACTION message. 
     * @return TopicType Topic type. valid values are as follows:.

-UNSPECIFIED: unspecified.
-NORMAL: standard message.
-FIFO: specifies sequential messaging.
-DELAY: specifies the delayed message.
-Specifies the TRANSACTION message.
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set Topic type. valid values are as follows:.

-UNSPECIFIED: unspecified.
-NORMAL: standard message.
-FIFO: specifies sequential messaging.
-DELAY: specifies the delayed message.
-Specifies the TRANSACTION message.
     * @param TopicType Topic type. valid values are as follows:.

-UNSPECIFIED: unspecified.
-NORMAL: standard message.
-FIFO: specifies sequential messaging.
-DELAY: specifies the delayed message.
-Specifies the TRANSACTION message.
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get Number of topic queues per node 
     * @return QueueNum Number of topic queues per node
     */
    public Long getQueueNum() {
        return this.QueueNum;
    }

    /**
     * Set Number of topic queues per node
     * @param QueueNum Number of topic queues per node
     */
    public void setQueueNum(Long QueueNum) {
        this.QueueNum = QueueNum;
    }

    /**
     * Get Consumption heap 
     * @return ConsumerLag Consumption heap
     */
    public Long getConsumerLag() {
        return this.ConsumerLag;
    }

    /**
     * Set Consumption heap
     * @param ConsumerLag Consumption heap
     */
    public void setConsumerLag(Long ConsumerLag) {
        this.ConsumerLag = ConsumerLag;
    }

    /**
     * Get Subscription rule. `*` indicates subscription to all topics. 
     * @return SubString Subscription rule. `*` indicates subscription to all topics.
     */
    public String getSubString() {
        return this.SubString;
    }

    /**
     * Set Subscription rule. `*` indicates subscription to all topics.
     * @param SubString Subscription rule. `*` indicates subscription to all topics.
     */
    public void setSubString(String SubString) {
        this.SubString = SubString;
    }

    /**
     * Get Last consumption progress update time. **It is a Unix timestamp (ms).** 
     * @return LastUpdateTime Last consumption progress update time. **It is a Unix timestamp (ms).**
     */
    public Long getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set Last consumption progress update time. **It is a Unix timestamp (ms).**
     * @param LastUpdateTime Last consumption progress update time. **It is a Unix timestamp (ms).**
     */
    public void setLastUpdateTime(Long LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    public TopicConsumeStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicConsumeStats(TopicConsumeStats source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.TopicType != null) {
            this.TopicType = new String(source.TopicType);
        }
        if (source.QueueNum != null) {
            this.QueueNum = new Long(source.QueueNum);
        }
        if (source.ConsumerLag != null) {
            this.ConsumerLag = new Long(source.ConsumerLag);
        }
        if (source.SubString != null) {
            this.SubString = new String(source.SubString);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new Long(source.LastUpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "QueueNum", this.QueueNum);
        this.setParamSimple(map, prefix + "ConsumerLag", this.ConsumerLag);
        this.setParamSimple(map, prefix + "SubString", this.SubString);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);

    }
}

