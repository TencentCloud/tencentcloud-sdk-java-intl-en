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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventCaseConsumeLogOptDto extends AbstractModel {

    /**
    * Consumer ID\nNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ConsumeLogId")
    @Expose
    private String ConsumeLogId;

    /**
    * Event Case ID\nNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EventCaseId")
    @Expose
    private String EventCaseId;

    /**
    * Consumer ID\nNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * Consumption Timestamp\nNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreationTimestamp")
    @Expose
    private String CreationTimestamp;

    /**
    * Task DetailsNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ConsumerDetail")
    @Expose
    private TaskOpsDto ConsumerDetail;

    /**
     * Get Consumer ID\nNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ConsumeLogId Consumer ID\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getConsumeLogId() {
        return this.ConsumeLogId;
    }

    /**
     * Set Consumer ID\nNote: This field may return null, indicating that no valid value can be obtained.
     * @param ConsumeLogId Consumer ID\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setConsumeLogId(String ConsumeLogId) {
        this.ConsumeLogId = ConsumeLogId;
    }

    /**
     * Get Event Case ID\nNote: This field may return null, indicating that no valid value can be obtained. 
     * @return EventCaseId Event Case ID\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEventCaseId() {
        return this.EventCaseId;
    }

    /**
     * Set Event Case ID\nNote: This field may return null, indicating that no valid value can be obtained.
     * @param EventCaseId Event Case ID\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEventCaseId(String EventCaseId) {
        this.EventCaseId = EventCaseId;
    }

    /**
     * Get Consumer ID\nNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ConsumerId Consumer ID\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set Consumer ID\nNote: This field may return null, indicating that no valid value can be obtained.
     * @param ConsumerId Consumer ID\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
    }

    /**
     * Get Consumption Timestamp\nNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreationTimestamp Consumption Timestamp\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    /**
     * Set Consumption Timestamp\nNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreationTimestamp Consumption Timestamp\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreationTimestamp(String CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
    }

    /**
     * Get Task DetailsNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ConsumerDetail Task DetailsNote: This field may return null, indicating that no valid value can be obtained.
     */
    public TaskOpsDto getConsumerDetail() {
        return this.ConsumerDetail;
    }

    /**
     * Set Task DetailsNote: This field may return null, indicating that no valid value can be obtained.
     * @param ConsumerDetail Task DetailsNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setConsumerDetail(TaskOpsDto ConsumerDetail) {
        this.ConsumerDetail = ConsumerDetail;
    }

    public EventCaseConsumeLogOptDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventCaseConsumeLogOptDto(EventCaseConsumeLogOptDto source) {
        if (source.ConsumeLogId != null) {
            this.ConsumeLogId = new String(source.ConsumeLogId);
        }
        if (source.EventCaseId != null) {
            this.EventCaseId = new String(source.EventCaseId);
        }
        if (source.ConsumerId != null) {
            this.ConsumerId = new String(source.ConsumerId);
        }
        if (source.CreationTimestamp != null) {
            this.CreationTimestamp = new String(source.CreationTimestamp);
        }
        if (source.ConsumerDetail != null) {
            this.ConsumerDetail = new TaskOpsDto(source.ConsumerDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumeLogId", this.ConsumeLogId);
        this.setParamSimple(map, prefix + "EventCaseId", this.EventCaseId);
        this.setParamSimple(map, prefix + "ConsumerId", this.ConsumerId);
        this.setParamSimple(map, prefix + "CreationTimestamp", this.CreationTimestamp);
        this.setParamObj(map, prefix + "ConsumerDetail.", this.ConsumerDetail);

    }
}

