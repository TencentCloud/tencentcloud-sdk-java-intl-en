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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionInfo extends AbstractModel {

    /**
    * <p>Session ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Agent ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>Session title</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>Status: active / archived / deleted</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>If the session is triggered by a task, carry the task ID that triggers the session.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get <p>Session ID</p> 
     * @return SessionId <p>Session ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Session ID</p>
     * @param SessionId <p>Session ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Agent ID</p> 
     * @return AgentId <p>Agent ID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Agent ID</p>
     * @param AgentId <p>Agent ID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>Session title</p> 
     * @return Title <p>Session title</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>Session title</p>
     * @param Title <p>Session title</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>Status: active / archived / deleted</p> 
     * @return Status <p>Status: active / archived / deleted</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status: active / archived / deleted</p>
     * @param Status <p>Status: active / archived / deleted</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>If the session is triggered by a task, carry the task ID that triggers the session.</p> 
     * @return TaskId <p>If the session is triggered by a task, carry the task ID that triggers the session.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>If the session is triggered by a task, carry the task ID that triggers the session.</p>
     * @param TaskId <p>If the session is triggered by a task, carry the task ID that triggers the session.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public SessionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionInfo(SessionInfo source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

