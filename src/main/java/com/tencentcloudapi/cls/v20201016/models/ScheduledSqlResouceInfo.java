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

public class ScheduledSqlResouceInfo extends AbstractModel {

    /**
    * Target topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Region information for the topic
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Topic type: 0 for log topic, and 1 for metric topic
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * Metric name. When BizType is 1, MetricName needs to be specified.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Metric NameWhen BizType is 1, prioritize using the MetricNames field. Multiple metrics can only be filled in the MetricNames field, while it's recommended to fill a single metric in the MetricName field.
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * Metric dimension. Not accept time type.
    */
    @SerializedName("MetricLabels")
    @Expose
    private String [] MetricLabels;

    /**
    * Metric timestamp. The default value is the left time point of the SQL query time range, but you can also specify other fields (The type is uinx time, TimeStamp, and precision millisecond) as the metric timestamp.
    */
    @SerializedName("CustomTime")
    @Expose
    private String CustomTime;

    /**
    * In addition to MetricLabels, this parameter can be used to supplement static dimensions for the metric.
Dimension names must start with a letter or underscore, followed by letters, digits, or underscores, with a length less than or equal to 1024 bytes.
    */
    @SerializedName("CustomMetricLabels")
    @Expose
    private MetricLabel [] CustomMetricLabels;

    /**
     * Get Target topic ID 
     * @return TopicId Target topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Target topic ID
     * @param TopicId Target topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Region information for the topic 
     * @return Region Region information for the topic
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region information for the topic
     * @param Region Region information for the topic
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Topic type: 0 for log topic, and 1 for metric topic 
     * @return BizType Topic type: 0 for log topic, and 1 for metric topic
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set Topic type: 0 for log topic, and 1 for metric topic
     * @param BizType Topic type: 0 for log topic, and 1 for metric topic
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get Metric name. When BizType is 1, MetricName needs to be specified. 
     * @return MetricName Metric name. When BizType is 1, MetricName needs to be specified.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name. When BizType is 1, MetricName needs to be specified.
     * @param MetricName Metric name. When BizType is 1, MetricName needs to be specified.
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Metric NameWhen BizType is 1, prioritize using the MetricNames field. Multiple metrics can only be filled in the MetricNames field, while it's recommended to fill a single metric in the MetricName field. 
     * @return MetricNames Metric NameWhen BizType is 1, prioritize using the MetricNames field. Multiple metrics can only be filled in the MetricNames field, while it's recommended to fill a single metric in the MetricName field.
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Metric NameWhen BizType is 1, prioritize using the MetricNames field. Multiple metrics can only be filled in the MetricNames field, while it's recommended to fill a single metric in the MetricName field.
     * @param MetricNames Metric NameWhen BizType is 1, prioritize using the MetricNames field. Multiple metrics can only be filled in the MetricNames field, while it's recommended to fill a single metric in the MetricName field.
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get Metric dimension. Not accept time type. 
     * @return MetricLabels Metric dimension. Not accept time type.
     */
    public String [] getMetricLabels() {
        return this.MetricLabels;
    }

    /**
     * Set Metric dimension. Not accept time type.
     * @param MetricLabels Metric dimension. Not accept time type.
     */
    public void setMetricLabels(String [] MetricLabels) {
        this.MetricLabels = MetricLabels;
    }

    /**
     * Get Metric timestamp. The default value is the left time point of the SQL query time range, but you can also specify other fields (The type is uinx time, TimeStamp, and precision millisecond) as the metric timestamp. 
     * @return CustomTime Metric timestamp. The default value is the left time point of the SQL query time range, but you can also specify other fields (The type is uinx time, TimeStamp, and precision millisecond) as the metric timestamp.
     */
    public String getCustomTime() {
        return this.CustomTime;
    }

    /**
     * Set Metric timestamp. The default value is the left time point of the SQL query time range, but you can also specify other fields (The type is uinx time, TimeStamp, and precision millisecond) as the metric timestamp.
     * @param CustomTime Metric timestamp. The default value is the left time point of the SQL query time range, but you can also specify other fields (The type is uinx time, TimeStamp, and precision millisecond) as the metric timestamp.
     */
    public void setCustomTime(String CustomTime) {
        this.CustomTime = CustomTime;
    }

    /**
     * Get In addition to MetricLabels, this parameter can be used to supplement static dimensions for the metric.
Dimension names must start with a letter or underscore, followed by letters, digits, or underscores, with a length less than or equal to 1024 bytes. 
     * @return CustomMetricLabels In addition to MetricLabels, this parameter can be used to supplement static dimensions for the metric.
Dimension names must start with a letter or underscore, followed by letters, digits, or underscores, with a length less than or equal to 1024 bytes.
     */
    public MetricLabel [] getCustomMetricLabels() {
        return this.CustomMetricLabels;
    }

    /**
     * Set In addition to MetricLabels, this parameter can be used to supplement static dimensions for the metric.
Dimension names must start with a letter or underscore, followed by letters, digits, or underscores, with a length less than or equal to 1024 bytes.
     * @param CustomMetricLabels In addition to MetricLabels, this parameter can be used to supplement static dimensions for the metric.
Dimension names must start with a letter or underscore, followed by letters, digits, or underscores, with a length less than or equal to 1024 bytes.
     */
    public void setCustomMetricLabels(MetricLabel [] CustomMetricLabels) {
        this.CustomMetricLabels = CustomMetricLabels;
    }

    public ScheduledSqlResouceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduledSqlResouceInfo(ScheduledSqlResouceInfo source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.BizType != null) {
            this.BizType = new Long(source.BizType);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.MetricLabels != null) {
            this.MetricLabels = new String[source.MetricLabels.length];
            for (int i = 0; i < source.MetricLabels.length; i++) {
                this.MetricLabels[i] = new String(source.MetricLabels[i]);
            }
        }
        if (source.CustomTime != null) {
            this.CustomTime = new String(source.CustomTime);
        }
        if (source.CustomMetricLabels != null) {
            this.CustomMetricLabels = new MetricLabel[source.CustomMetricLabels.length];
            for (int i = 0; i < source.CustomMetricLabels.length; i++) {
                this.CustomMetricLabels[i] = new MetricLabel(source.CustomMetricLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamArraySimple(map, prefix + "MetricLabels.", this.MetricLabels);
        this.setParamSimple(map, prefix + "CustomTime", this.CustomTime);
        this.setParamArrayObj(map, prefix + "CustomMetricLabels.", this.CustomMetricLabels);

    }
}

