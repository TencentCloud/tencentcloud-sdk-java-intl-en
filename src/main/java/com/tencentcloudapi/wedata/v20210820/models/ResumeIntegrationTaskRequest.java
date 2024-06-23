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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResumeIntegrationTaskRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Event type (START, STOP, SUSPEND, RESUME, COMMIT, TIMESTAMP)
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * Additional parameters
    */
    @SerializedName("ExtConfig")
    @Expose
    private RecordField [] ExtConfig;

    /**
    * Describe the type of front-end operation
    */
    @SerializedName("EventDesc")
    @Expose
    private String EventDesc;

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Event type (START, STOP, SUSPEND, RESUME, COMMIT, TIMESTAMP) 
     * @return Event Event type (START, STOP, SUSPEND, RESUME, COMMIT, TIMESTAMP)
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set Event type (START, STOP, SUSPEND, RESUME, COMMIT, TIMESTAMP)
     * @param Event Event type (START, STOP, SUSPEND, RESUME, COMMIT, TIMESTAMP)
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get Additional parameters 
     * @return ExtConfig Additional parameters
     */
    public RecordField [] getExtConfig() {
        return this.ExtConfig;
    }

    /**
     * Set Additional parameters
     * @param ExtConfig Additional parameters
     */
    public void setExtConfig(RecordField [] ExtConfig) {
        this.ExtConfig = ExtConfig;
    }

    /**
     * Get Describe the type of front-end operation 
     * @return EventDesc Describe the type of front-end operation
     */
    public String getEventDesc() {
        return this.EventDesc;
    }

    /**
     * Set Describe the type of front-end operation
     * @param EventDesc Describe the type of front-end operation
     */
    public void setEventDesc(String EventDesc) {
        this.EventDesc = EventDesc;
    }

    public ResumeIntegrationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResumeIntegrationTaskRequest(ResumeIntegrationTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.ExtConfig != null) {
            this.ExtConfig = new RecordField[source.ExtConfig.length];
            for (int i = 0; i < source.ExtConfig.length; i++) {
                this.ExtConfig[i] = new RecordField(source.ExtConfig[i]);
            }
        }
        if (source.EventDesc != null) {
            this.EventDesc = new String(source.EventDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamArrayObj(map, prefix + "ExtConfig.", this.ExtConfig);
        this.setParamSimple(map, prefix + "EventDesc", this.EventDesc);

    }
}

