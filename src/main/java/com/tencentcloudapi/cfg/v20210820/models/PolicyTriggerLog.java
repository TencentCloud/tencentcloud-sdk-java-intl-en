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

public class PolicyTriggerLog extends AbstractModel {

    /**
    * Experiment ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Type. 0: trigger; 1: recovery.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * Content
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Triggering time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatTime")
    @Expose
    private String CreatTime;

    /**
     * Get Experiment ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Experiment ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Experiment ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Experiment ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Type. 0: trigger; 1: recovery.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TriggerType Type. 0: trigger; 1: recovery.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Type. 0: trigger; 1: recovery.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TriggerType Type. 0: trigger; 1: recovery.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Content
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Content Content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Content
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Content Content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Triggering time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatTime Triggering time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatTime() {
        return this.CreatTime;
    }

    /**
     * Set Triggering time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatTime Triggering time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatTime(String CreatTime) {
        this.CreatTime = CreatTime;
    }

    public PolicyTriggerLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyTriggerLog(PolicyTriggerLog source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.CreatTime != null) {
            this.CreatTime = new String(source.CreatTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "CreatTime", this.CreatTime);

    }
}

