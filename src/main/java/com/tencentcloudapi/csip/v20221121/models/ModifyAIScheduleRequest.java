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

public class ModifyAIScheduleRequest extends AbstractModel {

    /**
    * <p>ID of the AI scheduled task. It can be obtained through the CreateAISchedule API.</p>
    */
    @SerializedName("ScheduleId")
    @Expose
    private String ScheduleId;

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
    * <p>Maximum trigger count. 0 indicates unlimited.</p>
    */
    @SerializedName("MaxFireCount")
    @Expose
    private Long MaxFireCount;

    /**
    * <p>Start of effective time, Unix millisecond timestamp. 0 indicates immediate effect.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>Effective end time, Unix millisecond timestamp. 0 means never expires.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>Trigger list. When UpdateTriggers is true, full replacement is applied.</p>
    */
    @SerializedName("Triggers")
    @Expose
    private AiScheduleTriggerInfo [] Triggers;

    /**
    * <p>Whether to update the trigger list. Value: true (use the Triggers field for full replacement), false (does not update).</p>
    */
    @SerializedName("UpdateTriggers")
    @Expose
    private Boolean UpdateTriggers;

    /**
     * Get <p>ID of the AI scheduled task. It can be obtained through the CreateAISchedule API.</p> 
     * @return ScheduleId <p>ID of the AI scheduled task. It can be obtained through the CreateAISchedule API.</p>
     */
    public String getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set <p>ID of the AI scheduled task. It can be obtained through the CreateAISchedule API.</p>
     * @param ScheduleId <p>ID of the AI scheduled task. It can be obtained through the CreateAISchedule API.</p>
     */
    public void setScheduleId(String ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

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
     * Get <p>Start of effective time, Unix millisecond timestamp. 0 indicates immediate effect.</p> 
     * @return StartTime <p>Start of effective time, Unix millisecond timestamp. 0 indicates immediate effect.</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start of effective time, Unix millisecond timestamp. 0 indicates immediate effect.</p>
     * @param StartTime <p>Start of effective time, Unix millisecond timestamp. 0 indicates immediate effect.</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Effective end time, Unix millisecond timestamp. 0 means never expires.</p> 
     * @return EndTime <p>Effective end time, Unix millisecond timestamp. 0 means never expires.</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Effective end time, Unix millisecond timestamp. 0 means never expires.</p>
     * @param EndTime <p>Effective end time, Unix millisecond timestamp. 0 means never expires.</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Trigger list. When UpdateTriggers is true, full replacement is applied.</p> 
     * @return Triggers <p>Trigger list. When UpdateTriggers is true, full replacement is applied.</p>
     */
    public AiScheduleTriggerInfo [] getTriggers() {
        return this.Triggers;
    }

    /**
     * Set <p>Trigger list. When UpdateTriggers is true, full replacement is applied.</p>
     * @param Triggers <p>Trigger list. When UpdateTriggers is true, full replacement is applied.</p>
     */
    public void setTriggers(AiScheduleTriggerInfo [] Triggers) {
        this.Triggers = Triggers;
    }

    /**
     * Get <p>Whether to update the trigger list. Value: true (use the Triggers field for full replacement), false (does not update).</p> 
     * @return UpdateTriggers <p>Whether to update the trigger list. Value: true (use the Triggers field for full replacement), false (does not update).</p>
     */
    public Boolean getUpdateTriggers() {
        return this.UpdateTriggers;
    }

    /**
     * Set <p>Whether to update the trigger list. Value: true (use the Triggers field for full replacement), false (does not update).</p>
     * @param UpdateTriggers <p>Whether to update the trigger list. Value: true (use the Triggers field for full replacement), false (does not update).</p>
     */
    public void setUpdateTriggers(Boolean UpdateTriggers) {
        this.UpdateTriggers = UpdateTriggers;
    }

    public ModifyAIScheduleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAIScheduleRequest(ModifyAIScheduleRequest source) {
        if (source.ScheduleId != null) {
            this.ScheduleId = new String(source.ScheduleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Prompts != null) {
            this.Prompts = new String(source.Prompts);
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
        if (source.Triggers != null) {
            this.Triggers = new AiScheduleTriggerInfo[source.Triggers.length];
            for (int i = 0; i < source.Triggers.length; i++) {
                this.Triggers[i] = new AiScheduleTriggerInfo(source.Triggers[i]);
            }
        }
        if (source.UpdateTriggers != null) {
            this.UpdateTriggers = new Boolean(source.UpdateTriggers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Prompts", this.Prompts);
        this.setParamSimple(map, prefix + "MaxFireCount", this.MaxFireCount);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Triggers.", this.Triggers);
        this.setParamSimple(map, prefix + "UpdateTriggers", this.UpdateTriggers);

    }
}

