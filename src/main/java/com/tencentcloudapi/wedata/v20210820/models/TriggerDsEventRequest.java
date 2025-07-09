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

public class TriggerDsEventRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Event Instance Information
    */
    @SerializedName("EventCaseList")
    @Expose
    private EventCaseDTO [] EventCaseList;

    /**
    * Event Instance Information (Continuous Time)
    */
    @SerializedName("EventBatchCaseList")
    @Expose
    private EventBatchCaseDTO [] EventBatchCaseList;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Event Instance Information 
     * @return EventCaseList Event Instance Information
     */
    public EventCaseDTO [] getEventCaseList() {
        return this.EventCaseList;
    }

    /**
     * Set Event Instance Information
     * @param EventCaseList Event Instance Information
     */
    public void setEventCaseList(EventCaseDTO [] EventCaseList) {
        this.EventCaseList = EventCaseList;
    }

    /**
     * Get Event Instance Information (Continuous Time) 
     * @return EventBatchCaseList Event Instance Information (Continuous Time)
     */
    public EventBatchCaseDTO [] getEventBatchCaseList() {
        return this.EventBatchCaseList;
    }

    /**
     * Set Event Instance Information (Continuous Time)
     * @param EventBatchCaseList Event Instance Information (Continuous Time)
     */
    public void setEventBatchCaseList(EventBatchCaseDTO [] EventBatchCaseList) {
        this.EventBatchCaseList = EventBatchCaseList;
    }

    public TriggerDsEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerDsEventRequest(TriggerDsEventRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.EventCaseList != null) {
            this.EventCaseList = new EventCaseDTO[source.EventCaseList.length];
            for (int i = 0; i < source.EventCaseList.length; i++) {
                this.EventCaseList[i] = new EventCaseDTO(source.EventCaseList[i]);
            }
        }
        if (source.EventBatchCaseList != null) {
            this.EventBatchCaseList = new EventBatchCaseDTO[source.EventBatchCaseList.length];
            for (int i = 0; i < source.EventBatchCaseList.length; i++) {
                this.EventBatchCaseList[i] = new EventBatchCaseDTO(source.EventBatchCaseList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "EventCaseList.", this.EventCaseList);
        this.setParamArrayObj(map, prefix + "EventBatchCaseList.", this.EventBatchCaseList);

    }
}

