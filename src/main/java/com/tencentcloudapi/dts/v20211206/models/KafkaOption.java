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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaOption extends AbstractModel {

    /**
    * Data type delivered to Kafka, such as Avro, Json, canal-pb, canal-json
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * Topic sync policy, such as `Single` (deliver all data to a single topic), `Multi` (deliver data to multiple custom topics).
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * Topic for DDL storage
    */
    @SerializedName("DDLTopicName")
    @Expose
    private String DDLTopicName;

    /**
    * Topic description
    */
    @SerializedName("TopicRules")
    @Expose
    private TopicRule [] TopicRules;

    /**
     * Get Data type delivered to Kafka, such as Avro, Json, canal-pb, canal-json 
     * @return DataType Data type delivered to Kafka, such as Avro, Json, canal-pb, canal-json
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set Data type delivered to Kafka, such as Avro, Json, canal-pb, canal-json
     * @param DataType Data type delivered to Kafka, such as Avro, Json, canal-pb, canal-json
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Get Topic sync policy, such as `Single` (deliver all data to a single topic), `Multi` (deliver data to multiple custom topics). 
     * @return TopicType Topic sync policy, such as `Single` (deliver all data to a single topic), `Multi` (deliver data to multiple custom topics).
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set Topic sync policy, such as `Single` (deliver all data to a single topic), `Multi` (deliver data to multiple custom topics).
     * @param TopicType Topic sync policy, such as `Single` (deliver all data to a single topic), `Multi` (deliver data to multiple custom topics).
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get Topic for DDL storage 
     * @return DDLTopicName Topic for DDL storage
     */
    public String getDDLTopicName() {
        return this.DDLTopicName;
    }

    /**
     * Set Topic for DDL storage
     * @param DDLTopicName Topic for DDL storage
     */
    public void setDDLTopicName(String DDLTopicName) {
        this.DDLTopicName = DDLTopicName;
    }

    /**
     * Get Topic description 
     * @return TopicRules Topic description
     */
    public TopicRule [] getTopicRules() {
        return this.TopicRules;
    }

    /**
     * Set Topic description
     * @param TopicRules Topic description
     */
    public void setTopicRules(TopicRule [] TopicRules) {
        this.TopicRules = TopicRules;
    }

    public KafkaOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KafkaOption(KafkaOption source) {
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
        if (source.TopicType != null) {
            this.TopicType = new String(source.TopicType);
        }
        if (source.DDLTopicName != null) {
            this.DDLTopicName = new String(source.DDLTopicName);
        }
        if (source.TopicRules != null) {
            this.TopicRules = new TopicRule[source.TopicRules.length];
            for (int i = 0; i < source.TopicRules.length; i++) {
                this.TopicRules[i] = new TopicRule(source.TopicRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "DDLTopicName", this.DDLTopicName);
        this.setParamArrayObj(map, prefix + "TopicRules.", this.TopicRules);

    }
}

