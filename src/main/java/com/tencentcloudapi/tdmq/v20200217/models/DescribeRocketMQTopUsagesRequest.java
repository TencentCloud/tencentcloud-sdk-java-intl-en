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

public class DescribeRocketMQTopUsagesRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Metric name. support the following:.
consumeLag. specifies the consumer group backlog count.
deadLetterCount. specifies the dead letter count.
Topic production rate.
Topic consumption rate. specifies the Topic consumption rate.
topicStorageSize. specifies the Topic storage space.
Topic API call count.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Sort quantity. The maximum value is 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Metric name. support the following:.
consumeLag. specifies the consumer group backlog count.
deadLetterCount. specifies the dead letter count.
Topic production rate.
Topic consumption rate. specifies the Topic consumption rate.
topicStorageSize. specifies the Topic storage space.
Topic API call count. 
     * @return MetricName Metric name. support the following:.
consumeLag. specifies the consumer group backlog count.
deadLetterCount. specifies the dead letter count.
Topic production rate.
Topic consumption rate. specifies the Topic consumption rate.
topicStorageSize. specifies the Topic storage space.
Topic API call count.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name. support the following:.
consumeLag. specifies the consumer group backlog count.
deadLetterCount. specifies the dead letter count.
Topic production rate.
Topic consumption rate. specifies the Topic consumption rate.
topicStorageSize. specifies the Topic storage space.
Topic API call count.
     * @param MetricName Metric name. support the following:.
consumeLag. specifies the consumer group backlog count.
deadLetterCount. specifies the dead letter count.
Topic production rate.
Topic consumption rate. specifies the Topic consumption rate.
topicStorageSize. specifies the Topic storage space.
Topic API call count.
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Sort quantity. The maximum value is 20. 
     * @return Limit Sort quantity. The maximum value is 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Sort quantity. The maximum value is 20.
     * @param Limit Sort quantity. The maximum value is 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRocketMQTopUsagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQTopUsagesRequest(DescribeRocketMQTopUsagesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

