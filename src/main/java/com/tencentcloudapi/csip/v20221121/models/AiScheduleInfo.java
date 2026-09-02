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

public class AiScheduleInfo extends AbstractModel {

    /**
    * <p>ID of the AI scheduled task.</p>
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
    * <p>Status. Parameter Value: 1 (enabled), 2 (disabled).</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Trigger</p>
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
    * <p>Trigger count.</p>
    */
    @SerializedName("CurrentFireCount")
    @Expose
    private Long CurrentFireCount;

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
    * <p>Creation time, Unix millisecond timestamp.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>Update time, Unix millisecond timestamp.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>Identity information</p>
    */
    @SerializedName("Identity")
    @Expose
    private AIScheduleUserIdentity Identity;

    /**
     * Get <p>ID of the AI scheduled task.</p> 
     * @return ScheduleId <p>ID of the AI scheduled task.</p>
     */
    public String getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set <p>ID of the AI scheduled task.</p>
     * @param ScheduleId <p>ID of the AI scheduled task.</p>
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
     * Get <p>Status. Parameter Value: 1 (enabled), 2 (disabled).</p> 
     * @return Status <p>Status. Parameter Value: 1 (enabled), 2 (disabled).</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status. Parameter Value: 1 (enabled), 2 (disabled).</p>
     * @param Status <p>Status. Parameter Value: 1 (enabled), 2 (disabled).</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Trigger</p> 
     * @return Triggers <p>Trigger</p>
     */
    public AiScheduleTriggerInfo [] getTriggers() {
        return this.Triggers;
    }

    /**
     * Set <p>Trigger</p>
     * @param Triggers <p>Trigger</p>
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
     * Get <p>Trigger count.</p> 
     * @return CurrentFireCount <p>Trigger count.</p>
     */
    public Long getCurrentFireCount() {
        return this.CurrentFireCount;
    }

    /**
     * Set <p>Trigger count.</p>
     * @param CurrentFireCount <p>Trigger count.</p>
     */
    public void setCurrentFireCount(Long CurrentFireCount) {
        this.CurrentFireCount = CurrentFireCount;
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

    /**
     * Get <p>Creation time, Unix millisecond timestamp.</p> 
     * @return CreateTime <p>Creation time, Unix millisecond timestamp.</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time, Unix millisecond timestamp.</p>
     * @param CreateTime <p>Creation time, Unix millisecond timestamp.</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time, Unix millisecond timestamp.</p> 
     * @return UpdateTime <p>Update time, Unix millisecond timestamp.</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time, Unix millisecond timestamp.</p>
     * @param UpdateTime <p>Update time, Unix millisecond timestamp.</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Identity information</p> 
     * @return Identity <p>Identity information</p>
     */
    public AIScheduleUserIdentity getIdentity() {
        return this.Identity;
    }

    /**
     * Set <p>Identity information</p>
     * @param Identity <p>Identity information</p>
     */
    public void setIdentity(AIScheduleUserIdentity Identity) {
        this.Identity = Identity;
    }

    public AiScheduleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiScheduleInfo(AiScheduleInfo source) {
        if (source.ScheduleId != null) {
            this.ScheduleId = new String(source.ScheduleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Prompts != null) {
            this.Prompts = new String(source.Prompts);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        if (source.CurrentFireCount != null) {
            this.CurrentFireCount = new Long(source.CurrentFireCount);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Identity != null) {
            this.Identity = new AIScheduleUserIdentity(source.Identity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Prompts", this.Prompts);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Triggers.", this.Triggers);
        this.setParamSimple(map, prefix + "MaxFireCount", this.MaxFireCount);
        this.setParamSimple(map, prefix + "CurrentFireCount", this.CurrentFireCount);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "Identity.", this.Identity);

    }
}

