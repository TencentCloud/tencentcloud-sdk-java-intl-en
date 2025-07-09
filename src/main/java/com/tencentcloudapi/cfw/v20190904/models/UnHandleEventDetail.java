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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnHandleEventDetail extends AbstractModel {

    /**
    * Security event name
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Number of unhandled events
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get Security event name 
     * @return EventName Security event name
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Security event name
     * @param EventName Security event name
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Number of unhandled events 
     * @return Total Number of unhandled events
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Number of unhandled events
     * @param Total Number of unhandled events
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public UnHandleEventDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnHandleEventDetail(UnHandleEventDetail source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

