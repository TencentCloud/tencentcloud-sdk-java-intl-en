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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTargetRequest extends AbstractModel {

    /**
    * Event bus ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * Target type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Target description
    */
    @SerializedName("TargetDescription")
    @Expose
    private TargetDescription TargetDescription;

    /**
    * Event rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get Event bus ID 
     * @return EventBusId Event bus ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set Event bus ID
     * @param EventBusId Event bus ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get Target type 
     * @return Type Target type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Target type
     * @param Type Target type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Target description 
     * @return TargetDescription Target description
     */
    public TargetDescription getTargetDescription() {
        return this.TargetDescription;
    }

    /**
     * Set Target description
     * @param TargetDescription Target description
     */
    public void setTargetDescription(TargetDescription TargetDescription) {
        this.TargetDescription = TargetDescription;
    }

    /**
     * Get Event rule ID 
     * @return RuleId Event rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Event rule ID
     * @param RuleId Event rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public CreateTargetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTargetRequest(CreateTargetRequest source) {
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TargetDescription != null) {
            this.TargetDescription = new TargetDescription(source.TargetDescription);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "TargetDescription.", this.TargetDescription);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

