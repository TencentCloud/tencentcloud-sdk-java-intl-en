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

public class ModifyRecordingRuleYamlTaskRequest extends AbstractModel {

    /**
    * <p>Yaml configuration id</p>
    */
    @SerializedName("YamlID")
    @Expose
    private String YamlID;

    /**
    * <p>Source metric topic id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Target metric topic id</p>
    */
    @SerializedName("DstTopicId")
    @Expose
    private String DstTopicId;

    /**
    * <p>Task status: 1: Enabled; 2: Disabled</p>
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * <p>Schedule start time, Unix timestamp in milliseconds</p>
    */
    @SerializedName("ProcessStartTime")
    @Expose
    private Long ProcessStartTime;

    /**
    * <p>Scheduling period (minutes). Supported range (0,1440] minutes.</p>
    */
    @SerializedName("ProcessPeriod")
    @Expose
    private Long ProcessPeriod;

    /**
    * <p>Execution Delay (Seconds)</p>
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
    * <p>yaml configuration content</p>
    */
    @SerializedName("YamlContent")
    @Expose
    private String YamlContent;

    /**
    * <p>Whether to enable service log shipping. Valid values: 1: disable; 2: enable.</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
     * Get <p>Yaml configuration id</p> 
     * @return YamlID <p>Yaml configuration id</p>
     */
    public String getYamlID() {
        return this.YamlID;
    }

    /**
     * Set <p>Yaml configuration id</p>
     * @param YamlID <p>Yaml configuration id</p>
     */
    public void setYamlID(String YamlID) {
        this.YamlID = YamlID;
    }

    /**
     * Get <p>Source metric topic id</p> 
     * @return TopicId <p>Source metric topic id</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Source metric topic id</p>
     * @param TopicId <p>Source metric topic id</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Target metric topic id</p> 
     * @return DstTopicId <p>Target metric topic id</p>
     */
    public String getDstTopicId() {
        return this.DstTopicId;
    }

    /**
     * Set <p>Target metric topic id</p>
     * @param DstTopicId <p>Target metric topic id</p>
     */
    public void setDstTopicId(String DstTopicId) {
        this.DstTopicId = DstTopicId;
    }

    /**
     * Get <p>Task status: 1: Enabled; 2: Disabled</p> 
     * @return EnableFlag <p>Task status: 1: Enabled; 2: Disabled</p>
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set <p>Task status: 1: Enabled; 2: Disabled</p>
     * @param EnableFlag <p>Task status: 1: Enabled; 2: Disabled</p>
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get <p>Schedule start time, Unix timestamp in milliseconds</p> 
     * @return ProcessStartTime <p>Schedule start time, Unix timestamp in milliseconds</p>
     */
    public Long getProcessStartTime() {
        return this.ProcessStartTime;
    }

    /**
     * Set <p>Schedule start time, Unix timestamp in milliseconds</p>
     * @param ProcessStartTime <p>Schedule start time, Unix timestamp in milliseconds</p>
     */
    public void setProcessStartTime(Long ProcessStartTime) {
        this.ProcessStartTime = ProcessStartTime;
    }

    /**
     * Get <p>Scheduling period (minutes). Supported range (0,1440] minutes.</p> 
     * @return ProcessPeriod <p>Scheduling period (minutes). Supported range (0,1440] minutes.</p>
     */
    public Long getProcessPeriod() {
        return this.ProcessPeriod;
    }

    /**
     * Set <p>Scheduling period (minutes). Supported range (0,1440] minutes.</p>
     * @param ProcessPeriod <p>Scheduling period (minutes). Supported range (0,1440] minutes.</p>
     */
    public void setProcessPeriod(Long ProcessPeriod) {
        this.ProcessPeriod = ProcessPeriod;
    }

    /**
     * Get <p>Execution Delay (Seconds)</p> 
     * @return ProcessDelay <p>Execution Delay (Seconds)</p>
     */
    public Long getProcessDelay() {
        return this.ProcessDelay;
    }

    /**
     * Set <p>Execution Delay (Seconds)</p>
     * @param ProcessDelay <p>Execution Delay (Seconds)</p>
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
     * Get <p>yaml configuration content</p> 
     * @return YamlContent <p>yaml configuration content</p>
     */
    public String getYamlContent() {
        return this.YamlContent;
    }

    /**
     * Set <p>yaml configuration content</p>
     * @param YamlContent <p>yaml configuration content</p>
     */
    public void setYamlContent(String YamlContent) {
        this.YamlContent = YamlContent;
    }

    /**
     * Get <p>Whether to enable service log shipping. Valid values: 1: disable; 2: enable.</p> 
     * @return HasServicesLog <p>Whether to enable service log shipping. Valid values: 1: disable; 2: enable.</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>Whether to enable service log shipping. Valid values: 1: disable; 2: enable.</p>
     * @param HasServicesLog <p>Whether to enable service log shipping. Valid values: 1: disable; 2: enable.</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    public ModifyRecordingRuleYamlTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRecordingRuleYamlTaskRequest(ModifyRecordingRuleYamlTaskRequest source) {
        if (source.YamlID != null) {
            this.YamlID = new String(source.YamlID);
        }
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
        this.setParamSimple(map, prefix + "YamlID", this.YamlID);
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

