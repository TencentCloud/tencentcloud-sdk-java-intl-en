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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventItem extends AbstractModel {

    /**
    * Parameter name
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * The number of modification events
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * Modification event details
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EventDetail")
    @Expose
    private EventInfo [] EventDetail;

    /**
     * Get Parameter name
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ParamName Parameter name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Parameter name
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ParamName Parameter name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get The number of modification events
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return EventCount The number of modification events
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set The number of modification events
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param EventCount The number of modification events
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get Modification event details
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return EventDetail Modification event details
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public EventInfo [] getEventDetail() {
        return this.EventDetail;
    }

    /**
     * Set Modification event details
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param EventDetail Modification event details
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEventDetail(EventInfo [] EventDetail) {
        this.EventDetail = EventDetail;
    }

    public EventItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventItem(EventItem source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.EventDetail != null) {
            this.EventDetail = new EventInfo[source.EventDetail.length];
            for (int i = 0; i < source.EventDetail.length; i++) {
                this.EventDetail[i] = new EventInfo(source.EventDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamArrayObj(map, prefix + "EventDetail.", this.EventDetail);

    }
}

