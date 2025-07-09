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

public class EventBatchCaseDTO extends AbstractModel {

    /**
    * Event Instance ID
    */
    @SerializedName("CaseId")
    @Expose
    private String CaseId;

    /**
    * Event
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Event Trigger Start Time
    */
    @SerializedName("StartDimension")
    @Expose
    private String StartDimension;

    /**
    * Creation Time
    */
    @SerializedName("CreationTs")
    @Expose
    private String CreationTs;

    /**
    * Consumer ID
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Event Trigger End Time
    */
    @SerializedName("EndDimension")
    @Expose
    private String EndDimension;

    /**
    * Event Cycle
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
     * Get Event Instance ID 
     * @return CaseId Event Instance ID
     */
    public String getCaseId() {
        return this.CaseId;
    }

    /**
     * Set Event Instance ID
     * @param CaseId Event Instance ID
     */
    public void setCaseId(String CaseId) {
        this.CaseId = CaseId;
    }

    /**
     * Get Event 
     * @return Name Event
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Event
     * @param Name Event
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Event Trigger Start Time 
     * @return StartDimension Event Trigger Start Time
     */
    public String getStartDimension() {
        return this.StartDimension;
    }

    /**
     * Set Event Trigger Start Time
     * @param StartDimension Event Trigger Start Time
     */
    public void setStartDimension(String StartDimension) {
        this.StartDimension = StartDimension;
    }

    /**
     * Get Creation Time 
     * @return CreationTs Creation Time
     */
    public String getCreationTs() {
        return this.CreationTs;
    }

    /**
     * Set Creation Time
     * @param CreationTs Creation Time
     */
    public void setCreationTs(String CreationTs) {
        this.CreationTs = CreationTs;
    }

    /**
     * Get Consumer ID 
     * @return ConsumerId Consumer ID
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set Consumer ID
     * @param ConsumerId Consumer ID
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Event Trigger End Time 
     * @return EndDimension Event Trigger End Time
     */
    public String getEndDimension() {
        return this.EndDimension;
    }

    /**
     * Set Event Trigger End Time
     * @param EndDimension Event Trigger End Time
     */
    public void setEndDimension(String EndDimension) {
        this.EndDimension = EndDimension;
    }

    /**
     * Get Event Cycle 
     * @return EventSubType Event Cycle
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set Event Cycle
     * @param EventSubType Event Cycle
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    public EventBatchCaseDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventBatchCaseDTO(EventBatchCaseDTO source) {
        if (source.CaseId != null) {
            this.CaseId = new String(source.CaseId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartDimension != null) {
            this.StartDimension = new String(source.StartDimension);
        }
        if (source.CreationTs != null) {
            this.CreationTs = new String(source.CreationTs);
        }
        if (source.ConsumerId != null) {
            this.ConsumerId = new String(source.ConsumerId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EndDimension != null) {
            this.EndDimension = new String(source.EndDimension);
        }
        if (source.EventSubType != null) {
            this.EventSubType = new String(source.EventSubType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaseId", this.CaseId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartDimension", this.StartDimension);
        this.setParamSimple(map, prefix + "CreationTs", this.CreationTs);
        this.setParamSimple(map, prefix + "ConsumerId", this.ConsumerId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EndDimension", this.EndDimension);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);

    }
}

