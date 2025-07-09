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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChangeRuleEventsIgnoreStatusRequest extends AbstractModel {

    /**
    * Ignore status: 0: unignore; 1: ignore
    */
    @SerializedName("IgnoreStatus")
    @Expose
    private Long IgnoreStatus;

    /**
    * Detection item ID array
    */
    @SerializedName("RuleIdList")
    @Expose
    private Long [] RuleIdList;

    /**
    * Event ID array
    */
    @SerializedName("EventIdList")
    @Expose
    private Long [] EventIdList;

    /**
     * Get Ignore status: 0: unignore; 1: ignore 
     * @return IgnoreStatus Ignore status: 0: unignore; 1: ignore
     */
    public Long getIgnoreStatus() {
        return this.IgnoreStatus;
    }

    /**
     * Set Ignore status: 0: unignore; 1: ignore
     * @param IgnoreStatus Ignore status: 0: unignore; 1: ignore
     */
    public void setIgnoreStatus(Long IgnoreStatus) {
        this.IgnoreStatus = IgnoreStatus;
    }

    /**
     * Get Detection item ID array 
     * @return RuleIdList Detection item ID array
     */
    public Long [] getRuleIdList() {
        return this.RuleIdList;
    }

    /**
     * Set Detection item ID array
     * @param RuleIdList Detection item ID array
     */
    public void setRuleIdList(Long [] RuleIdList) {
        this.RuleIdList = RuleIdList;
    }

    /**
     * Get Event ID array 
     * @return EventIdList Event ID array
     */
    public Long [] getEventIdList() {
        return this.EventIdList;
    }

    /**
     * Set Event ID array
     * @param EventIdList Event ID array
     */
    public void setEventIdList(Long [] EventIdList) {
        this.EventIdList = EventIdList;
    }

    public ChangeRuleEventsIgnoreStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangeRuleEventsIgnoreStatusRequest(ChangeRuleEventsIgnoreStatusRequest source) {
        if (source.IgnoreStatus != null) {
            this.IgnoreStatus = new Long(source.IgnoreStatus);
        }
        if (source.RuleIdList != null) {
            this.RuleIdList = new Long[source.RuleIdList.length];
            for (int i = 0; i < source.RuleIdList.length; i++) {
                this.RuleIdList[i] = new Long(source.RuleIdList[i]);
            }
        }
        if (source.EventIdList != null) {
            this.EventIdList = new Long[source.EventIdList.length];
            for (int i = 0; i < source.EventIdList.length; i++) {
                this.EventIdList[i] = new Long(source.EventIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IgnoreStatus", this.IgnoreStatus);
        this.setParamArraySimple(map, prefix + "RuleIdList.", this.RuleIdList);
        this.setParamArraySimple(map, prefix + "EventIdList.", this.EventIdList);

    }
}

