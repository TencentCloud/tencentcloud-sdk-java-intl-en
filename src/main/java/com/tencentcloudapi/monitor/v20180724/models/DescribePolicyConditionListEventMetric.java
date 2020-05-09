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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConditionListEventMetric extends AbstractModel{

    /**
    * Event ID.
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Event name.
    */
    @SerializedName("EventShowName")
    @Expose
    private String EventShowName;

    /**
    * Whether to recover.
    */
    @SerializedName("NeedRecovered")
    @Expose
    private Boolean NeedRecovered;

    /**
    * Event type, which is a reserved field. At present, it is fixed to 2.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get Event ID. 
     * @return EventId Event ID.
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID.
     * @param EventId Event ID.
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Event name. 
     * @return EventShowName Event name.
     */
    public String getEventShowName() {
        return this.EventShowName;
    }

    /**
     * Set Event name.
     * @param EventShowName Event name.
     */
    public void setEventShowName(String EventShowName) {
        this.EventShowName = EventShowName;
    }

    /**
     * Get Whether to recover. 
     * @return NeedRecovered Whether to recover.
     */
    public Boolean getNeedRecovered() {
        return this.NeedRecovered;
    }

    /**
     * Set Whether to recover.
     * @param NeedRecovered Whether to recover.
     */
    public void setNeedRecovered(Boolean NeedRecovered) {
        this.NeedRecovered = NeedRecovered;
    }

    /**
     * Get Event type, which is a reserved field. At present, it is fixed to 2. 
     * @return Type Event type, which is a reserved field. At present, it is fixed to 2.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Event type, which is a reserved field. At present, it is fixed to 2.
     * @param Type Event type, which is a reserved field. At present, it is fixed to 2.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "EventShowName", this.EventShowName);
        this.setParamSimple(map, prefix + "NeedRecovered", this.NeedRecovered);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

