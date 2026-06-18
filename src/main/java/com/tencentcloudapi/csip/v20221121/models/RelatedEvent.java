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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RelatedEvent extends AbstractModel {

    /**
    * Event ID
    */
    @SerializedName("EventID")
    @Expose
    private String EventID;

    /**
    * Event description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Number of Alarms Associated with Event
    */
    @SerializedName("RelatedCount")
    @Expose
    private Long RelatedCount;

    /**
     * Get Event ID 
     * @return EventID Event ID
     */
    public String getEventID() {
        return this.EventID;
    }

    /**
     * Set Event ID
     * @param EventID Event ID
     */
    public void setEventID(String EventID) {
        this.EventID = EventID;
    }

    /**
     * Get Event description 
     * @return Description Event description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Event description
     * @param Description Event description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Number of Alarms Associated with Event 
     * @return RelatedCount Number of Alarms Associated with Event
     */
    public Long getRelatedCount() {
        return this.RelatedCount;
    }

    /**
     * Set Number of Alarms Associated with Event
     * @param RelatedCount Number of Alarms Associated with Event
     */
    public void setRelatedCount(Long RelatedCount) {
        this.RelatedCount = RelatedCount;
    }

    public RelatedEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RelatedEvent(RelatedEvent source) {
        if (source.EventID != null) {
            this.EventID = new String(source.EventID);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RelatedCount != null) {
            this.RelatedCount = new Long(source.RelatedCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventID", this.EventID);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RelatedCount", this.RelatedCount);

    }
}

