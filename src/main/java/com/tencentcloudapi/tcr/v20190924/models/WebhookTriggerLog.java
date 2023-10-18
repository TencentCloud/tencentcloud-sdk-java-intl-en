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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebhookTriggerLog extends AbstractModel {

    /**
    * Log ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Trigger ID
    */
    @SerializedName("TriggerId")
    @Expose
    private Long TriggerId;

    /**
    * Event type
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Notification type
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * Details
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * Creation time
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Log ID 
     * @return Id Log ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Log ID
     * @param Id Log ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Trigger ID 
     * @return TriggerId Trigger ID
     */
    public Long getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set Trigger ID
     * @param TriggerId Trigger ID
     */
    public void setTriggerId(Long TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get Event type 
     * @return EventType Event type
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type
     * @param EventType Event type
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Notification type 
     * @return NotifyType Notification type
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set Notification type
     * @param NotifyType Notification type
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get Details 
     * @return Detail Details
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set Details
     * @param Detail Details
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Creation time 
     * @return CreationTime Creation time
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Creation time
     * @param CreationTime Creation time
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public WebhookTriggerLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebhookTriggerLog(WebhookTriggerLog source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TriggerId != null) {
            this.TriggerId = new Long(source.TriggerId);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

