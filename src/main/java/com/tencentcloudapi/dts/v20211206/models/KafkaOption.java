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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KafkaOption extends AbstractModel {

    /**
    * <p>Data type delivered to kafka, such as Avro, Json, canal-pb, canal-Json, debezium</p>
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * <p>Synchronize topic policies, for example, Single (Deliver to a single topic), Multi (Custom topic name)</p>
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * <p>topic used to store ddl</p>
    */
    @SerializedName("DDLTopicName")
    @Expose
    private String DDLTopicName;

    /**
    * <p>Description of single topic and custom topic</p>
    */
    @SerializedName("TopicRules")
    @Expose
    private TopicRule [] TopicRules;

    /**
    * <p>Additional information, for specific data types, additional parameters can be set. For example, for Canal-compatible feature support: "canalOfficialFormat":"on" means to enable the Canal-compatible feature, not included by default. For large message skipping feature support: "skipLargeMessage":"on" means to enable skipping large messages, not included by default; when enabled, "maxMessageSizeMB" must be simultaneously set to a positive integer string from 1 to 100, representing the max message size threshold (MB), messages exceeding this size will be skipped, not included by default.</p>
    */
    @SerializedName("DataOption")
    @Expose
    private KeyValuePairOption [] DataOption;

    /**
     * Get <p>Data type delivered to kafka, such as Avro, Json, canal-pb, canal-Json, debezium</p> 
     * @return DataType <p>Data type delivered to kafka, such as Avro, Json, canal-pb, canal-Json, debezium</p>
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set <p>Data type delivered to kafka, such as Avro, Json, canal-pb, canal-Json, debezium</p>
     * @param DataType <p>Data type delivered to kafka, such as Avro, Json, canal-pb, canal-Json, debezium</p>
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Get <p>Synchronize topic policies, for example, Single (Deliver to a single topic), Multi (Custom topic name)</p> 
     * @return TopicType <p>Synchronize topic policies, for example, Single (Deliver to a single topic), Multi (Custom topic name)</p>
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set <p>Synchronize topic policies, for example, Single (Deliver to a single topic), Multi (Custom topic name)</p>
     * @param TopicType <p>Synchronize topic policies, for example, Single (Deliver to a single topic), Multi (Custom topic name)</p>
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get <p>topic used to store ddl</p> 
     * @return DDLTopicName <p>topic used to store ddl</p>
     */
    public String getDDLTopicName() {
        return this.DDLTopicName;
    }

    /**
     * Set <p>topic used to store ddl</p>
     * @param DDLTopicName <p>topic used to store ddl</p>
     */
    public void setDDLTopicName(String DDLTopicName) {
        this.DDLTopicName = DDLTopicName;
    }

    /**
     * Get <p>Description of single topic and custom topic</p> 
     * @return TopicRules <p>Description of single topic and custom topic</p>
     */
    public TopicRule [] getTopicRules() {
        return this.TopicRules;
    }

    /**
     * Set <p>Description of single topic and custom topic</p>
     * @param TopicRules <p>Description of single topic and custom topic</p>
     */
    public void setTopicRules(TopicRule [] TopicRules) {
        this.TopicRules = TopicRules;
    }

    /**
     * Get <p>Additional information, for specific data types, additional parameters can be set. For example, for Canal-compatible feature support: "canalOfficialFormat":"on" means to enable the Canal-compatible feature, not included by default. For large message skipping feature support: "skipLargeMessage":"on" means to enable skipping large messages, not included by default; when enabled, "maxMessageSizeMB" must be simultaneously set to a positive integer string from 1 to 100, representing the max message size threshold (MB), messages exceeding this size will be skipped, not included by default.</p> 
     * @return DataOption <p>Additional information, for specific data types, additional parameters can be set. For example, for Canal-compatible feature support: "canalOfficialFormat":"on" means to enable the Canal-compatible feature, not included by default. For large message skipping feature support: "skipLargeMessage":"on" means to enable skipping large messages, not included by default; when enabled, "maxMessageSizeMB" must be simultaneously set to a positive integer string from 1 to 100, representing the max message size threshold (MB), messages exceeding this size will be skipped, not included by default.</p>
     */
    public KeyValuePairOption [] getDataOption() {
        return this.DataOption;
    }

    /**
     * Set <p>Additional information, for specific data types, additional parameters can be set. For example, for Canal-compatible feature support: "canalOfficialFormat":"on" means to enable the Canal-compatible feature, not included by default. For large message skipping feature support: "skipLargeMessage":"on" means to enable skipping large messages, not included by default; when enabled, "maxMessageSizeMB" must be simultaneously set to a positive integer string from 1 to 100, representing the max message size threshold (MB), messages exceeding this size will be skipped, not included by default.</p>
     * @param DataOption <p>Additional information, for specific data types, additional parameters can be set. For example, for Canal-compatible feature support: "canalOfficialFormat":"on" means to enable the Canal-compatible feature, not included by default. For large message skipping feature support: "skipLargeMessage":"on" means to enable skipping large messages, not included by default; when enabled, "maxMessageSizeMB" must be simultaneously set to a positive integer string from 1 to 100, representing the max message size threshold (MB), messages exceeding this size will be skipped, not included by default.</p>
     */
    public void setDataOption(KeyValuePairOption [] DataOption) {
        this.DataOption = DataOption;
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
        if (source.DataOption != null) {
            this.DataOption = new KeyValuePairOption[source.DataOption.length];
            for (int i = 0; i < source.DataOption.length; i++) {
                this.DataOption[i] = new KeyValuePairOption(source.DataOption[i]);
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
        this.setParamArrayObj(map, prefix + "DataOption.", this.DataOption);

    }
}

