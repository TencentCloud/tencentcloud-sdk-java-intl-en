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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAgentRequest extends AbstractModel {

    /**
    * <p>Application ID.</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>ID of the agent to delete</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * Collaboration mode; 0: Claw mode; 1: Multi-Agent mode
    */
    @SerializedName("CollaborationMode")
    @Expose
    private Long CollaborationMode;

    /**
     * Get <p>Application ID.</p> 
     * @return AppId <p>Application ID.</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Application ID.</p>
     * @param AppId <p>Application ID.</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>ID of the agent to delete</p> 
     * @return AgentId <p>ID of the agent to delete</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>ID of the agent to delete</p>
     * @param AgentId <p>ID of the agent to delete</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get Collaboration mode; 0: Claw mode; 1: Multi-Agent mode 
     * @return CollaborationMode Collaboration mode; 0: Claw mode; 1: Multi-Agent mode
     */
    public Long getCollaborationMode() {
        return this.CollaborationMode;
    }

    /**
     * Set Collaboration mode; 0: Claw mode; 1: Multi-Agent mode
     * @param CollaborationMode Collaboration mode; 0: Claw mode; 1: Multi-Agent mode
     */
    public void setCollaborationMode(Long CollaborationMode) {
        this.CollaborationMode = CollaborationMode;
    }

    public DeleteAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAgentRequest(DeleteAgentRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.CollaborationMode != null) {
            this.CollaborationMode = new Long(source.CollaborationMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "CollaborationMode", this.CollaborationMode);

    }
}

