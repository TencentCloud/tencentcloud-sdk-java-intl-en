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

public class CreateRecordingRuleYamlTaskRequest extends AbstractModel {

    /**
    * <p>Source metric topic id</p><p>For reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/614/56454?from_cn_redirect=1">DescribeTopics</a></li><li><a href="https://console.cloud.tencent.com/cls/metric">metric topic</a></li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Target metric topic id, which can be the same as TopicId.</p>
    */
    @SerializedName("DstTopicId")
    @Expose
    private String DstTopicId;

    /**
    * <p>Task status. Valid values: 1: enabled; 2: disabled.</p>
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * <p>Execution start time, Unix timestamp.</p><p>Unit: ms.</p>
    */
    @SerializedName("ProcessStartTime")
    @Expose
    private Long ProcessStartTime;

    /**
    * <p>Scheduling period (minutes). Supported range (0,1440] minutes.</p><p>Measurement unit: minutes</p><p>Can also use interval: duration in YAML to set execution interval individually for each group.</p>
    */
    @SerializedName("ProcessPeriod")
    @Expose
    private Long ProcessPeriod;

    /**
    * <p>Execution delay. Set it to 30 seconds to avoid inaccuracy in pre-aggregation task calculation results due to latency in metric reporting.</p><p>Unit: seconds</p>
    */
    @SerializedName("ProcessDelay")
    @Expose
    private Long ProcessDelay;

    /**
    * <p>yaml configuration name</p>
    */
    @SerializedName("YamlConfigName")
    @Expose
    private String YamlConfigName;

    /**
    * <p>yaml configuration content</p><p>Compatible with Prometheus Recording Rules configuration files. Please note the line breaks and indent in the string during API calls.</p>
    */
    @SerializedName("YamlContent")
    @Expose
    private String YamlContent;

    /**
    * <p>Whether to enable the delivery service log. 1: Disabled, 2: Enabled.</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
     * Get <p>Source metric topic id</p><p>For reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/614/56454?from_cn_redirect=1">DescribeTopics</a></li><li><a href="https://console.cloud.tencent.com/cls/metric">metric topic</a></li></ul> 
     * @return TopicId <p>Source metric topic id</p><p>For reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/614/56454?from_cn_redirect=1">DescribeTopics</a></li><li><a href="https://console.cloud.tencent.com/cls/metric">metric topic</a></li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Source metric topic id</p><p>For reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/614/56454?from_cn_redirect=1">DescribeTopics</a></li><li><a href="https://console.cloud.tencent.com/cls/metric">metric topic</a></li></ul>
     * @param TopicId <p>Source metric topic id</p><p>For reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/614/56454?from_cn_redirect=1">DescribeTopics</a></li><li><a href="https://console.cloud.tencent.com/cls/metric">metric topic</a></li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Target metric topic id, which can be the same as TopicId.</p> 
     * @return DstTopicId <p>Target metric topic id, which can be the same as TopicId.</p>
     */
    public String getDstTopicId() {
        return this.DstTopicId;
    }

    /**
     * Set <p>Target metric topic id, which can be the same as TopicId.</p>
     * @param DstTopicId <p>Target metric topic id, which can be the same as TopicId.</p>
     */
    public void setDstTopicId(String DstTopicId) {
        this.DstTopicId = DstTopicId;
    }

    /**
     * Get <p>Task status. Valid values: 1: enabled; 2: disabled.</p> 
     * @return EnableFlag <p>Task status. Valid values: 1: enabled; 2: disabled.</p>
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set <p>Task status. Valid values: 1: enabled; 2: disabled.</p>
     * @param EnableFlag <p>Task status. Valid values: 1: enabled; 2: disabled.</p>
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get <p>Execution start time, Unix timestamp.</p><p>Unit: ms.</p> 
     * @return ProcessStartTime <p>Execution start time, Unix timestamp.</p><p>Unit: ms.</p>
     */
    public Long getProcessStartTime() {
        return this.ProcessStartTime;
    }

    /**
     * Set <p>Execution start time, Unix timestamp.</p><p>Unit: ms.</p>
     * @param ProcessStartTime <p>Execution start time, Unix timestamp.</p><p>Unit: ms.</p>
     */
    public void setProcessStartTime(Long ProcessStartTime) {
        this.ProcessStartTime = ProcessStartTime;
    }

    /**
     * Get <p>Scheduling period (minutes). Supported range (0,1440] minutes.</p><p>Measurement unit: minutes</p><p>Can also use interval: duration in YAML to set execution interval individually for each group.</p> 
     * @return ProcessPeriod <p>Scheduling period (minutes). Supported range (0,1440] minutes.</p><p>Measurement unit: minutes</p><p>Can also use interval: duration in YAML to set execution interval individually for each group.</p>
     */
    public Long getProcessPeriod() {
        return this.ProcessPeriod;
    }

    /**
     * Set <p>Scheduling period (minutes). Supported range (0,1440] minutes.</p><p>Measurement unit: minutes</p><p>Can also use interval: duration in YAML to set execution interval individually for each group.</p>
     * @param ProcessPeriod <p>Scheduling period (minutes). Supported range (0,1440] minutes.</p><p>Measurement unit: minutes</p><p>Can also use interval: duration in YAML to set execution interval individually for each group.</p>
     */
    public void setProcessPeriod(Long ProcessPeriod) {
        this.ProcessPeriod = ProcessPeriod;
    }

    /**
     * Get <p>Execution delay. Set it to 30 seconds to avoid inaccuracy in pre-aggregation task calculation results due to latency in metric reporting.</p><p>Unit: seconds</p> 
     * @return ProcessDelay <p>Execution delay. Set it to 30 seconds to avoid inaccuracy in pre-aggregation task calculation results due to latency in metric reporting.</p><p>Unit: seconds</p>
     */
    public Long getProcessDelay() {
        return this.ProcessDelay;
    }

    /**
     * Set <p>Execution delay. Set it to 30 seconds to avoid inaccuracy in pre-aggregation task calculation results due to latency in metric reporting.</p><p>Unit: seconds</p>
     * @param ProcessDelay <p>Execution delay. Set it to 30 seconds to avoid inaccuracy in pre-aggregation task calculation results due to latency in metric reporting.</p><p>Unit: seconds</p>
     */
    public void setProcessDelay(Long ProcessDelay) {
        this.ProcessDelay = ProcessDelay;
    }

    /**
     * Get <p>yaml configuration name</p> 
     * @return YamlConfigName <p>yaml configuration name</p>
     */
    public String getYamlConfigName() {
        return this.YamlConfigName;
    }

    /**
     * Set <p>yaml configuration name</p>
     * @param YamlConfigName <p>yaml configuration name</p>
     */
    public void setYamlConfigName(String YamlConfigName) {
        this.YamlConfigName = YamlConfigName;
    }

    /**
     * Get <p>yaml configuration content</p><p>Compatible with Prometheus Recording Rules configuration files. Please note the line breaks and indent in the string during API calls.</p> 
     * @return YamlContent <p>yaml configuration content</p><p>Compatible with Prometheus Recording Rules configuration files. Please note the line breaks and indent in the string during API calls.</p>
     */
    public String getYamlContent() {
        return this.YamlContent;
    }

    /**
     * Set <p>yaml configuration content</p><p>Compatible with Prometheus Recording Rules configuration files. Please note the line breaks and indent in the string during API calls.</p>
     * @param YamlContent <p>yaml configuration content</p><p>Compatible with Prometheus Recording Rules configuration files. Please note the line breaks and indent in the string during API calls.</p>
     */
    public void setYamlContent(String YamlContent) {
        this.YamlContent = YamlContent;
    }

    /**
     * Get <p>Whether to enable the delivery service log. 1: Disabled, 2: Enabled.</p> 
     * @return HasServicesLog <p>Whether to enable the delivery service log. 1: Disabled, 2: Enabled.</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>Whether to enable the delivery service log. 1: Disabled, 2: Enabled.</p>
     * @param HasServicesLog <p>Whether to enable the delivery service log. 1: Disabled, 2: Enabled.</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    public CreateRecordingRuleYamlTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRecordingRuleYamlTaskRequest(CreateRecordingRuleYamlTaskRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.DstTopicId != null) {
            this.DstTopicId = new String(source.DstTopicId);
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.ProcessStartTime != null) {
            this.ProcessStartTime = new Long(source.ProcessStartTime);
        }
        if (source.ProcessPeriod != null) {
            this.ProcessPeriod = new Long(source.ProcessPeriod);
        }
        if (source.ProcessDelay != null) {
            this.ProcessDelay = new Long(source.ProcessDelay);
        }
        if (source.YamlConfigName != null) {
            this.YamlConfigName = new String(source.YamlConfigName);
        }
        if (source.YamlContent != null) {
            this.YamlContent = new String(source.YamlContent);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "DstTopicId", this.DstTopicId);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamSimple(map, prefix + "ProcessStartTime", this.ProcessStartTime);
        this.setParamSimple(map, prefix + "ProcessPeriod", this.ProcessPeriod);
        this.setParamSimple(map, prefix + "ProcessDelay", this.ProcessDelay);
        this.setParamSimple(map, prefix + "YamlConfigName", this.YamlConfigName);
        this.setParamSimple(map, prefix + "YamlContent", this.YamlContent);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);

    }
}

