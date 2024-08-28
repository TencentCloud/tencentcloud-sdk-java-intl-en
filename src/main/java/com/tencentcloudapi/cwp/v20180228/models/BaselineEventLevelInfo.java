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

public class BaselineEventLevelInfo extends AbstractModel {

    /**
    * Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventLevel")
    @Expose
    private Long EventLevel;

    /**
    * Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
     * Get Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventLevel Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEventLevel() {
        return this.EventLevel;
    }

    /**
     * Set Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventLevel Hazard level: 1-Low-risk; 2-Medium-risk; 3-High-risk; 4-Critical
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventLevel(Long EventLevel) {
        this.EventLevel = EventLevel;
    }

    /**
     * Get Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventCount Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventCount Number of vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    public BaselineEventLevelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineEventLevelInfo(BaselineEventLevelInfo source) {
        if (source.EventLevel != null) {
            this.EventLevel = new Long(source.EventLevel);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventLevel", this.EventLevel);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);

    }
}

