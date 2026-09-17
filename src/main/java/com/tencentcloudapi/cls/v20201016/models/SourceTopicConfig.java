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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceTopicConfig extends AbstractModel {

    /**
    * <p>Log topic filtering method.</p><p>Enumeration values:</p><ul><li>1: Static selection</li></ul>
    */
    @SerializedName("TopicFilterType")
    @Expose
    private Long TopicFilterType;

    /**
    * <p>Source logset id</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>Source log topic list</p><p>Required when TopicFilterType=1</p>
    */
    @SerializedName("Topics")
    @Expose
    private SourceTopicInfo [] Topics;

    /**
     * Get <p>Log topic filtering method.</p><p>Enumeration values:</p><ul><li>1: Static selection</li></ul> 
     * @return TopicFilterType <p>Log topic filtering method.</p><p>Enumeration values:</p><ul><li>1: Static selection</li></ul>
     */
    public Long getTopicFilterType() {
        return this.TopicFilterType;
    }

    /**
     * Set <p>Log topic filtering method.</p><p>Enumeration values:</p><ul><li>1: Static selection</li></ul>
     * @param TopicFilterType <p>Log topic filtering method.</p><p>Enumeration values:</p><ul><li>1: Static selection</li></ul>
     */
    public void setTopicFilterType(Long TopicFilterType) {
        this.TopicFilterType = TopicFilterType;
    }

    /**
     * Get <p>Source logset id</p> 
     * @return LogsetId <p>Source logset id</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>Source logset id</p>
     * @param LogsetId <p>Source logset id</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>Source log topic list</p><p>Required when TopicFilterType=1</p> 
     * @return Topics <p>Source log topic list</p><p>Required when TopicFilterType=1</p>
     */
    public SourceTopicInfo [] getTopics() {
        return this.Topics;
    }

    /**
     * Set <p>Source log topic list</p><p>Required when TopicFilterType=1</p>
     * @param Topics <p>Source log topic list</p><p>Required when TopicFilterType=1</p>
     */
    public void setTopics(SourceTopicInfo [] Topics) {
        this.Topics = Topics;
    }

    public SourceTopicConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceTopicConfig(SourceTopicConfig source) {
        if (source.TopicFilterType != null) {
            this.TopicFilterType = new Long(source.TopicFilterType);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Topics != null) {
            this.Topics = new SourceTopicInfo[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new SourceTopicInfo(source.Topics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicFilterType", this.TopicFilterType);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);

    }
}

