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

public class CancelIgnoreVulRequest extends AbstractModel {

    /**
    * Vulnerability event ID string (multiple entries are separated by comma)
    */
    @SerializedName("EventIds")
    @Expose
    private String EventIds;

    /**
     * Get Vulnerability event ID string (multiple entries are separated by comma) 
     * @return EventIds Vulnerability event ID string (multiple entries are separated by comma)
     */
    public String getEventIds() {
        return this.EventIds;
    }

    /**
     * Set Vulnerability event ID string (multiple entries are separated by comma)
     * @param EventIds Vulnerability event ID string (multiple entries are separated by comma)
     */
    public void setEventIds(String EventIds) {
        this.EventIds = EventIds;
    }

    public CancelIgnoreVulRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CancelIgnoreVulRequest(CancelIgnoreVulRequest source) {
        if (source.EventIds != null) {
            this.EventIds = new String(source.EventIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventIds", this.EventIds);

    }
}
