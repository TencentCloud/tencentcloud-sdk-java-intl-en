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

public class RocketMQClusterRecentStats extends AbstractModel {

    /**
    * Number of topics
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * Number of produced messages
    */
    @SerializedName("ProducedMsgNum")
    @Expose
    private Long ProducedMsgNum;

    /**
    * Number of consumed messages
    */
    @SerializedName("ConsumedMsgNum")
    @Expose
    private Long ConsumedMsgNum;

    /**
    * Number of retained messages
    */
    @SerializedName("AccumulativeMsgNum")
    @Expose
    private Long AccumulativeMsgNum;

    /**
     * Get Number of topics 
     * @return TopicNum Number of topics
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set Number of topics
     * @param TopicNum Number of topics
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get Number of produced messages 
     * @return ProducedMsgNum Number of produced messages
     */
    public Long getProducedMsgNum() {
        return this.ProducedMsgNum;
    }

    /**
     * Set Number of produced messages
     * @param ProducedMsgNum Number of produced messages
     */
    public void setProducedMsgNum(Long ProducedMsgNum) {
        this.ProducedMsgNum = ProducedMsgNum;
    }

    /**
     * Get Number of consumed messages 
     * @return ConsumedMsgNum Number of consumed messages
     */
    public Long getConsumedMsgNum() {
        return this.ConsumedMsgNum;
    }

    /**
     * Set Number of consumed messages
     * @param ConsumedMsgNum Number of consumed messages
     */
    public void setConsumedMsgNum(Long ConsumedMsgNum) {
        this.ConsumedMsgNum = ConsumedMsgNum;
    }

    /**
     * Get Number of retained messages 
     * @return AccumulativeMsgNum Number of retained messages
     */
    public Long getAccumulativeMsgNum() {
        return this.AccumulativeMsgNum;
    }

    /**
     * Set Number of retained messages
     * @param AccumulativeMsgNum Number of retained messages
     */
    public void setAccumulativeMsgNum(Long AccumulativeMsgNum) {
        this.AccumulativeMsgNum = AccumulativeMsgNum;
    }

    public RocketMQClusterRecentStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQClusterRecentStats(RocketMQClusterRecentStats source) {
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.ProducedMsgNum != null) {
            this.ProducedMsgNum = new Long(source.ProducedMsgNum);
        }
        if (source.ConsumedMsgNum != null) {
            this.ConsumedMsgNum = new Long(source.ConsumedMsgNum);
        }
        if (source.AccumulativeMsgNum != null) {
            this.AccumulativeMsgNum = new Long(source.AccumulativeMsgNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "ProducedMsgNum", this.ProducedMsgNum);
        this.setParamSimple(map, prefix + "ConsumedMsgNum", this.ConsumedMsgNum);
        this.setParamSimple(map, prefix + "AccumulativeMsgNum", this.AccumulativeMsgNum);

    }
}

