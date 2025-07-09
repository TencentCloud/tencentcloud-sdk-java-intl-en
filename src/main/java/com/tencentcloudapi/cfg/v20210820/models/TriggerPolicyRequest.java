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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerPolicyRequest extends AbstractModel {

    /**
    * Chaos engineering experiment ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Triggering content
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Triggering type. 0: trigger; 1: recovery.
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
     * Get Chaos engineering experiment ID 
     * @return TaskId Chaos engineering experiment ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Chaos engineering experiment ID
     * @param TaskId Chaos engineering experiment ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Triggering content 
     * @return Content Triggering content
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Triggering content
     * @param Content Triggering content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Triggering type. 0: trigger; 1: recovery. 
     * @return TriggerType Triggering type. 0: trigger; 1: recovery.
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Triggering type. 0: trigger; 1: recovery.
     * @param TriggerType Triggering type. 0: trigger; 1: recovery.
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    public TriggerPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerPolicyRequest(TriggerPolicyRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);

    }
}

