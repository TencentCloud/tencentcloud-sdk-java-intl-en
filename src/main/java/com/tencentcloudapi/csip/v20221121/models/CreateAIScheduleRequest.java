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

public class CreateAIScheduleRequest extends AbstractModel {

    /**
    * <p>Task name. Maximum 128 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Execute the prompt content. Maximum 2048 characters.</p>
    */
    @SerializedName("Prompts")
    @Expose
    private String Prompts;

    /**
    * <p>Trigger list. Multiple triggers have an "or" relationship, and any one of them triggers the action.</p>
    */
    @SerializedName("Triggers")
    @Expose
    private AiScheduleTriggerInfo [] Triggers;

    /**
    * <p>Maximum trigger count. 0 indicates unlimited.</p>
    */
    @SerializedName("MaxFireCount")
    @Expose
    private Long MaxFireCount;

    /**
    * <p>Start of effective time, Unix millisecond timestamp. 0 means effective immediately.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>Expiration time, Unix millisecond timestamp. 0 means never expires.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get <p>Task name. Maximum 128 characters.</p> 
     * @return Name <p>Task name. Maximum 128 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Task name. Maximum 128 characters.</p>
     * @param Name <p>Task name. Maximum 128 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Execute the prompt content. Maximum 2048 characters.</p> 
     * @return Prompts <p>Execute the prompt content. Maximum 2048 characters.</p>
     */
    public String getPrompts() {
        return this.Prompts;
    }

    /**
     * Set <p>Execute the prompt content. Maximum 2048 characters.</p>
     * @param Prompts <p>Execute the prompt content. Maximum 2048 characters.</p>
     */
    public void setPrompts(String Prompts) {
        this.Prompts = Prompts;
    }

    /**
     * Get <p>Trigger list. Multiple triggers have an "or" relationship, and any one of them triggers the action.</p> 
     * @return Triggers <p>Trigger list. Multiple triggers have an "or" relationship, and any one of them triggers the action.</p>
     */
    public AiScheduleTriggerInfo [] getTriggers() {
        return this.Triggers;
    }

    /**
     * Set <p>Trigger list. Multiple triggers have an "or" relationship, and any one of them triggers the action.</p>
     * @param Triggers <p>Trigger list. Multiple triggers have an "or" relationship, and any one of them triggers the action.</p>
     */
    public void setTriggers(AiScheduleTriggerInfo [] Triggers) {
        this.Triggers = Triggers;
    }

    /**
     * Get <p>Maximum trigger count. 0 indicates unlimited.</p> 
     * @return MaxFireCount <p>Maximum trigger count. 0 indicates unlimited.</p>
     */
    public Long getMaxFireCount() {
        return this.MaxFireCount;
    }

    /**
     * Set <p>Maximum trigger count. 0 indicates unlimited.</p>
     * @param MaxFireCount <p>Maximum trigger count. 0 indicates unlimited.</p>
     */
    public void setMaxFireCount(Long MaxFireCount) {
        this.MaxFireCount = MaxFireCount;
    }

    /**
     * Get <p>Start of effective time, Unix millisecond timestamp. 0 means effective immediately.</p> 
     * @return StartTime <p>Start of effective time, Unix millisecond timestamp. 0 means effective immediately.</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start of effective time, Unix millisecond timestamp. 0 means effective immediately.</p>
     * @param StartTime <p>Start of effective time, Unix millisecond timestamp. 0 means effective immediately.</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Expiration time, Unix millisecond timestamp. 0 means never expires.</p> 
     * @return EndTime <p>Expiration time, Unix millisecond timestamp. 0 means never expires.</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Expiration time, Unix millisecond timestamp. 0 means never expires.</p>
     * @param EndTime <p>Expiration time, Unix millisecond timestamp. 0 means never expires.</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public CreateAIScheduleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAIScheduleRequest(CreateAIScheduleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Prompts != null) {
            this.Prompts = new String(source.Prompts);
        }
        if (source.Triggers != null) {
            this.Triggers = new AiScheduleTriggerInfo[source.Triggers.length];
            for (int i = 0; i < source.Triggers.length; i++) {
                this.Triggers[i] = new AiScheduleTriggerInfo(source.Triggers[i]);
            }
        }
        if (source.MaxFireCount != null) {
            this.MaxFireCount = new Long(source.MaxFireCount);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Prompts", this.Prompts);
        this.setParamArrayObj(map, prefix + "Triggers.", this.Triggers);
        this.setParamSimple(map, prefix + "MaxFireCount", this.MaxFireCount);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

