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

public class SubscribeKafkaConfig extends AbstractModel {

    /**
    * Number of Kafka partitions. Valid values: 1, 4, 8.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NumberOfPartitions")
    @Expose
    private Long NumberOfPartitions;

    /**
    * Partition rules. This field is required when NumberOfPartitions > 1.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DistributeRules")
    @Expose
    private DistributeRule [] DistributeRules;

    /**
    * Default partitioning policy. If NumberOfPartitions > 1, this field is required. Data that does not meet the regex in DistributeRules will be partitioned according to the default partitioning policy.Valid values for non-mongo products: table (partitioned by table name); pk (partitioned by table name + primary key). Valid values for mongo: collection (partitioned by collection name). This field is used in conjunction with DistributeRules. If this field is configured, it is considered as configuring a DistributeRules.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultRuleType")
    @Expose
    private String DefaultRuleType;

    /**
     * Get Number of Kafka partitions. Valid values: 1, 4, 8.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NumberOfPartitions Number of Kafka partitions. Valid values: 1, 4, 8.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNumberOfPartitions() {
        return this.NumberOfPartitions;
    }

    /**
     * Set Number of Kafka partitions. Valid values: 1, 4, 8.Note: This field may return null, indicating that no valid values can be obtained.
     * @param NumberOfPartitions Number of Kafka partitions. Valid values: 1, 4, 8.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNumberOfPartitions(Long NumberOfPartitions) {
        this.NumberOfPartitions = NumberOfPartitions;
    }

    /**
     * Get Partition rules. This field is required when NumberOfPartitions > 1.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DistributeRules Partition rules. This field is required when NumberOfPartitions > 1.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DistributeRule [] getDistributeRules() {
        return this.DistributeRules;
    }

    /**
     * Set Partition rules. This field is required when NumberOfPartitions > 1.Note: This field may return null, indicating that no valid values can be obtained.
     * @param DistributeRules Partition rules. This field is required when NumberOfPartitions > 1.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDistributeRules(DistributeRule [] DistributeRules) {
        this.DistributeRules = DistributeRules;
    }

    /**
     * Get Default partitioning policy. If NumberOfPartitions > 1, this field is required. Data that does not meet the regex in DistributeRules will be partitioned according to the default partitioning policy.Valid values for non-mongo products: table (partitioned by table name); pk (partitioned by table name + primary key). Valid values for mongo: collection (partitioned by collection name). This field is used in conjunction with DistributeRules. If this field is configured, it is considered as configuring a DistributeRules.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultRuleType Default partitioning policy. If NumberOfPartitions > 1, this field is required. Data that does not meet the regex in DistributeRules will be partitioned according to the default partitioning policy.Valid values for non-mongo products: table (partitioned by table name); pk (partitioned by table name + primary key). Valid values for mongo: collection (partitioned by collection name). This field is used in conjunction with DistributeRules. If this field is configured, it is considered as configuring a DistributeRules.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDefaultRuleType() {
        return this.DefaultRuleType;
    }

    /**
     * Set Default partitioning policy. If NumberOfPartitions > 1, this field is required. Data that does not meet the regex in DistributeRules will be partitioned according to the default partitioning policy.Valid values for non-mongo products: table (partitioned by table name); pk (partitioned by table name + primary key). Valid values for mongo: collection (partitioned by collection name). This field is used in conjunction with DistributeRules. If this field is configured, it is considered as configuring a DistributeRules.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultRuleType Default partitioning policy. If NumberOfPartitions > 1, this field is required. Data that does not meet the regex in DistributeRules will be partitioned according to the default partitioning policy.Valid values for non-mongo products: table (partitioned by table name); pk (partitioned by table name + primary key). Valid values for mongo: collection (partitioned by collection name). This field is used in conjunction with DistributeRules. If this field is configured, it is considered as configuring a DistributeRules.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultRuleType(String DefaultRuleType) {
        this.DefaultRuleType = DefaultRuleType;
    }

    public SubscribeKafkaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeKafkaConfig(SubscribeKafkaConfig source) {
        if (source.NumberOfPartitions != null) {
            this.NumberOfPartitions = new Long(source.NumberOfPartitions);
        }
        if (source.DistributeRules != null) {
            this.DistributeRules = new DistributeRule[source.DistributeRules.length];
            for (int i = 0; i < source.DistributeRules.length; i++) {
                this.DistributeRules[i] = new DistributeRule(source.DistributeRules[i]);
            }
        }
        if (source.DefaultRuleType != null) {
            this.DefaultRuleType = new String(source.DefaultRuleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NumberOfPartitions", this.NumberOfPartitions);
        this.setParamArrayObj(map, prefix + "DistributeRules.", this.DistributeRules);
        this.setParamSimple(map, prefix + "DefaultRuleType", this.DefaultRuleType);

    }
}

