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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEmrOverviewMetricsRequest extends AbstractModel {

    /**
    * End time
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
    * Metric name. NODE.CPU: average CPU utilization and core count of the node; NODE.CPU.SLHBASE: average CPU utilization and core count of the Serverless instance; HDFS.NN.CAPACITY: storage utilization and total amount.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Granularity, for example, 30s-max, 1m-max, and 1h-max.
    */
    @SerializedName("Downsample")
    @Expose
    private String Downsample;

    /**
    * Start time, not required for pie charts
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * Aggregation method, for future use
    */
    @SerializedName("Aggregator")
    @Expose
    private String Aggregator;

    /**
    * Specific type of metrics to be queried, for example, "{"type":"CapacityTotal|CapacityRemaining"}".
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
     * Get End time 
     * @return End End time
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set End time
     * @param End End time
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    /**
     * Get Metric name. NODE.CPU: average CPU utilization and core count of the node; NODE.CPU.SLHBASE: average CPU utilization and core count of the Serverless instance; HDFS.NN.CAPACITY: storage utilization and total amount. 
     * @return Metric Metric name. NODE.CPU: average CPU utilization and core count of the node; NODE.CPU.SLHBASE: average CPU utilization and core count of the Serverless instance; HDFS.NN.CAPACITY: storage utilization and total amount.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Metric name. NODE.CPU: average CPU utilization and core count of the node; NODE.CPU.SLHBASE: average CPU utilization and core count of the Serverless instance; HDFS.NN.CAPACITY: storage utilization and total amount.
     * @param Metric Metric name. NODE.CPU: average CPU utilization and core count of the node; NODE.CPU.SLHBASE: average CPU utilization and core count of the Serverless instance; HDFS.NN.CAPACITY: storage utilization and total amount.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Cluster ID. 
     * @return InstanceId Cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID.
     * @param InstanceId Cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Granularity, for example, 30s-max, 1m-max, and 1h-max. 
     * @return Downsample Granularity, for example, 30s-max, 1m-max, and 1h-max.
     */
    public String getDownsample() {
        return this.Downsample;
    }

    /**
     * Set Granularity, for example, 30s-max, 1m-max, and 1h-max.
     * @param Downsample Granularity, for example, 30s-max, 1m-max, and 1h-max.
     */
    public void setDownsample(String Downsample) {
        this.Downsample = Downsample;
    }

    /**
     * Get Start time, not required for pie charts 
     * @return Start Start time, not required for pie charts
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set Start time, not required for pie charts
     * @param Start Start time, not required for pie charts
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get Aggregation method, for future use 
     * @return Aggregator Aggregation method, for future use
     */
    public String getAggregator() {
        return this.Aggregator;
    }

    /**
     * Set Aggregation method, for future use
     * @param Aggregator Aggregation method, for future use
     */
    public void setAggregator(String Aggregator) {
        this.Aggregator = Aggregator;
    }

    /**
     * Get Specific type of metrics to be queried, for example, "{"type":"CapacityTotal|CapacityRemaining"}". 
     * @return Tags Specific type of metrics to be queried, for example, "{"type":"CapacityTotal|CapacityRemaining"}".
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set Specific type of metrics to be queried, for example, "{"type":"CapacityTotal|CapacityRemaining"}".
     * @param Tags Specific type of metrics to be queried, for example, "{"type":"CapacityTotal|CapacityRemaining"}".
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    public DescribeEmrOverviewMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEmrOverviewMetricsRequest(DescribeEmrOverviewMetricsRequest source) {
        if (source.End != null) {
            this.End = new Long(source.End);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Downsample != null) {
            this.Downsample = new String(source.Downsample);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.Aggregator != null) {
            this.Aggregator = new String(source.Aggregator);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Downsample", this.Downsample);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "Aggregator", this.Aggregator);
        this.setParamSimple(map, prefix + "Tags", this.Tags);

    }
}

