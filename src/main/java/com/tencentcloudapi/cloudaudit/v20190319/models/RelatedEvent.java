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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RelatedEvent extends AbstractModel{

    /**
    * Event name
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Operation time
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * ID of the operator account
    */
    @SerializedName("OperateUin")
    @Expose
    private Long OperateUin;

    /**
    * CloudAudit event ID
    */
    @SerializedName("EventReqId")
    @Expose
    private String EventReqId;

    /**
     * Get Event name 
     * @return EventName Event name
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Event name
     * @param EventName Event name
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Operation time 
     * @return EventTime Operation time
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set Operation time
     * @param EventTime Operation time
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get ID of the operator account 
     * @return OperateUin ID of the operator account
     */
    public Long getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set ID of the operator account
     * @param OperateUin ID of the operator account
     */
    public void setOperateUin(Long OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get CloudAudit event ID 
     * @return EventReqId CloudAudit event ID
     */
    public String getEventReqId() {
        return this.EventReqId;
    }

    /**
     * Set CloudAudit event ID
     * @param EventReqId CloudAudit event ID
     */
    public void setEventReqId(String EventReqId) {
        this.EventReqId = EventReqId;
    }

    public RelatedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RelatedEvent(RelatedEvent source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new Long(source.OperateUin);
        }
        if (source.EventReqId != null) {
            this.EventReqId = new String(source.EventReqId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "EventReqId", this.EventReqId);

    }
}

