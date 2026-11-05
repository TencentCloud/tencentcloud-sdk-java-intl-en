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

public class AgentReleasePreview extends AbstractModel {

    /**
    * <p>AgentID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>Agent Name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Update time, unix timestamp in seconds (s)</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Status, status value: 1: Add new, 2: Modify, 3: Delete</p>
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * <p>Action description.</p>
    */
    @SerializedName("ActionDescription")
    @Expose
    private String ActionDescription;

    /**
    * <p>Publish a message</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>Release detail</p>
    */
    @SerializedName("ReleaseList")
    @Expose
    private AgentRelease [] ReleaseList;

    /**
     * Get <p>AgentID</p> 
     * @return AgentId <p>AgentID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>AgentID</p>
     * @param AgentId <p>AgentID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>Agent Name</p> 
     * @return Name <p>Agent Name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Agent Name</p>
     * @param Name <p>Agent Name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Update time, unix timestamp in seconds (s)</p> 
     * @return UpdateTime <p>Update time, unix timestamp in seconds (s)</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time, unix timestamp in seconds (s)</p>
     * @param UpdateTime <p>Update time, unix timestamp in seconds (s)</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Status, status value: 1: Add new, 2: Modify, 3: Delete</p> 
     * @return Action <p>Status, status value: 1: Add new, 2: Modify, 3: Delete</p>
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set <p>Status, status value: 1: Add new, 2: Modify, 3: Delete</p>
     * @param Action <p>Status, status value: 1: Add new, 2: Modify, 3: Delete</p>
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get <p>Action description.</p> 
     * @return ActionDescription <p>Action description.</p>
     */
    public String getActionDescription() {
        return this.ActionDescription;
    }

    /**
     * Set <p>Action description.</p>
     * @param ActionDescription <p>Action description.</p>
     */
    public void setActionDescription(String ActionDescription) {
        this.ActionDescription = ActionDescription;
    }

    /**
     * Get <p>Publish a message</p> 
     * @return Message <p>Publish a message</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>Publish a message</p>
     * @param Message <p>Publish a message</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>Release detail</p> 
     * @return ReleaseList <p>Release detail</p>
     */
    public AgentRelease [] getReleaseList() {
        return this.ReleaseList;
    }

    /**
     * Set <p>Release detail</p>
     * @param ReleaseList <p>Release detail</p>
     */
    public void setReleaseList(AgentRelease [] ReleaseList) {
        this.ReleaseList = ReleaseList;
    }

    public AgentReleasePreview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentReleasePreview(AgentReleasePreview source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.ActionDescription != null) {
            this.ActionDescription = new String(source.ActionDescription);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ReleaseList != null) {
            this.ReleaseList = new AgentRelease[source.ReleaseList.length];
            for (int i = 0; i < source.ReleaseList.length; i++) {
                this.ReleaseList[i] = new AgentRelease(source.ReleaseList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ActionDescription", this.ActionDescription);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "ReleaseList.", this.ReleaseList);

    }
}

