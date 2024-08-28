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

public class CreateBanWhiteListRequest extends AbstractModel {

    /**
    * Block rules
    */
    @SerializedName("Rules")
    @Expose
    private BanWhiteList Rules;

    /**
    * Event list ID, which is passed when the event list is allowlisted. After it is successfully allowlisted, the events in the list will be marked as whitelisted.
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
     * Get Block rules 
     * @return Rules Block rules
     */
    public BanWhiteList getRules() {
        return this.Rules;
    }

    /**
     * Set Block rules
     * @param Rules Block rules
     */
    public void setRules(BanWhiteList Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Event list ID, which is passed when the event list is allowlisted. After it is successfully allowlisted, the events in the list will be marked as whitelisted. 
     * @return EventId Event list ID, which is passed when the event list is allowlisted. After it is successfully allowlisted, the events in the list will be marked as whitelisted.
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event list ID, which is passed when the event list is allowlisted. After it is successfully allowlisted, the events in the list will be marked as whitelisted.
     * @param EventId Event list ID, which is passed when the event list is allowlisted. After it is successfully allowlisted, the events in the list will be marked as whitelisted.
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    public CreateBanWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBanWhiteListRequest(CreateBanWhiteListRequest source) {
        if (source.Rules != null) {
            this.Rules = new BanWhiteList(source.Rules);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

