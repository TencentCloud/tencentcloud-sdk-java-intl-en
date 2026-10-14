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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConversationWorkflowArtifact extends AbstractModel {

    /**
    * 
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
     * Get  
     * @return AppId 
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 
     * @param AppId 
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return SpaceId 
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 
     * @param SpaceId 
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get  
     * @return WorkflowId 
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 
     * @param WorkflowId 
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    public ConversationWorkflowArtifact() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationWorkflowArtifact(ConversationWorkflowArtifact source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);

    }
}

