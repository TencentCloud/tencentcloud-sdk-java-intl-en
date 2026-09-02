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

public class DescribeAIAgentSkillListRequest extends AbstractModel {

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Agent name.
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Container ID
    */
    @SerializedName("ContainerID")
    @Expose
    private String ContainerID;

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Agent name. 
     * @return AgentName Agent name.
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set Agent name.
     * @param AgentName Agent name.
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get Instance ID. 
     * @return InstanceID Instance ID.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID.
     * @param InstanceID Instance ID.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Container ID 
     * @return ContainerID Container ID
     */
    public String getContainerID() {
        return this.ContainerID;
    }

    /**
     * Set Container ID
     * @param ContainerID Container ID
     */
    public void setContainerID(String ContainerID) {
        this.ContainerID = ContainerID;
    }

    public DescribeAIAgentSkillListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIAgentSkillListRequest(DescribeAIAgentSkillListRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.ContainerID != null) {
            this.ContainerID = new String(source.ContainerID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "ContainerID", this.ContainerID);

    }
}

