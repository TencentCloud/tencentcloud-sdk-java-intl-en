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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityEventInfo extends AbstractModel {

    /**
    * Number of security events
    */
    @SerializedName("EventCnt")
    @Expose
    private Long EventCnt;

    /**
    * Number of affected machines
    */
    @SerializedName("UuidCnt")
    @Expose
    private Long UuidCnt;

    /**
     * Get Number of security events 
     * @return EventCnt Number of security events
     */
    public Long getEventCnt() {
        return this.EventCnt;
    }

    /**
     * Set Number of security events
     * @param EventCnt Number of security events
     */
    public void setEventCnt(Long EventCnt) {
        this.EventCnt = EventCnt;
    }

    /**
     * Get Number of affected machines 
     * @return UuidCnt Number of affected machines
     */
    public Long getUuidCnt() {
        return this.UuidCnt;
    }

    /**
     * Set Number of affected machines
     * @param UuidCnt Number of affected machines
     */
    public void setUuidCnt(Long UuidCnt) {
        this.UuidCnt = UuidCnt;
    }

    public SecurityEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityEventInfo(SecurityEventInfo source) {
        if (source.EventCnt != null) {
            this.EventCnt = new Long(source.EventCnt);
        }
        if (source.UuidCnt != null) {
            this.UuidCnt = new Long(source.UuidCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventCnt", this.EventCnt);
        this.setParamSimple(map, prefix + "UuidCnt", this.UuidCnt);

    }
}

