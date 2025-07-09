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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartTaskInfo extends AbstractModel {

    /**
    * Batch task type, for example, START, TIMESTAMP, RESTORE, RESUME, etc.\nNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * Task Id list\nNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * Batch task configuration, currently only used for real-time integration based on time point startup. For time point startup, a RecordField configuration with name=timestamp, value=specific timestamp needs to be set\nNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Config")
    @Expose
    private RecordField [] Config;

    /**
    * Operation TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Batch task type, for example, START, TIMESTAMP, RESTORE, RESUME, etc.\nNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Event Batch task type, for example, START, TIMESTAMP, RESTORE, RESUME, etc.\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set Batch task type, for example, START, TIMESTAMP, RESTORE, RESUME, etc.\nNote: This field may return null, indicating that no valid value can be obtained.
     * @param Event Batch task type, for example, START, TIMESTAMP, RESTORE, RESUME, etc.\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get Task Id list\nNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskIds Task Id list\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set Task Id list\nNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskIds Task Id list\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get Batch task configuration, currently only used for real-time integration based on time point startup. For time point startup, a RecordField configuration with name=timestamp, value=specific timestamp needs to be set\nNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Config Batch task configuration, currently only used for real-time integration based on time point startup. For time point startup, a RecordField configuration with name=timestamp, value=specific timestamp needs to be set\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public RecordField [] getConfig() {
        return this.Config;
    }

    /**
     * Set Batch task configuration, currently only used for real-time integration based on time point startup. For time point startup, a RecordField configuration with name=timestamp, value=specific timestamp needs to be set\nNote: This field may return null, indicating that no valid value can be obtained.
     * @param Config Batch task configuration, currently only used for real-time integration based on time point startup. For time point startup, a RecordField configuration with name=timestamp, value=specific timestamp needs to be set\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setConfig(RecordField [] Config) {
        this.Config = Config;
    }

    /**
     * Get Operation TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Description Operation TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Operation TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param Description Operation TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public StartTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartTaskInfo(StartTaskInfo source) {
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.Config != null) {
            this.Config = new RecordField[source.Config.length];
            for (int i = 0; i < source.Config.length; i++) {
                this.Config[i] = new RecordField(source.Config[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamArrayObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

