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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayStrategyBindingGroupInfo extends AbstractModel {

    /**
    * gateway group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Node configuration
    */
    @SerializedName("NodeConfig")
    @Expose
    private CloudNativeAPIGatewayNodeConfig NodeConfig;

    /**
    * Binding time
    */
    @SerializedName("BindTime")
    @Expose
    private String BindTime;

    /**
    * gateway group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Binding status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get gateway group ID 
     * @return GroupId gateway group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set gateway group ID
     * @param GroupId gateway group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Node configuration 
     * @return NodeConfig Node configuration
     */
    public CloudNativeAPIGatewayNodeConfig getNodeConfig() {
        return this.NodeConfig;
    }

    /**
     * Set Node configuration
     * @param NodeConfig Node configuration
     */
    public void setNodeConfig(CloudNativeAPIGatewayNodeConfig NodeConfig) {
        this.NodeConfig = NodeConfig;
    }

    /**
     * Get Binding time 
     * @return BindTime Binding time
     */
    public String getBindTime() {
        return this.BindTime;
    }

    /**
     * Set Binding time
     * @param BindTime Binding time
     */
    public void setBindTime(String BindTime) {
        this.BindTime = BindTime;
    }

    /**
     * Get gateway group name 
     * @return GroupName gateway group name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set gateway group name
     * @param GroupName gateway group name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Binding status 
     * @return Status Binding status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Binding status
     * @param Status Binding status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CloudNativeAPIGatewayStrategyBindingGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayStrategyBindingGroupInfo(CloudNativeAPIGatewayStrategyBindingGroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.NodeConfig != null) {
            this.NodeConfig = new CloudNativeAPIGatewayNodeConfig(source.NodeConfig);
        }
        if (source.BindTime != null) {
            this.BindTime = new String(source.BindTime);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "NodeConfig.", this.NodeConfig);
        this.setParamSimple(map, prefix + "BindTime", this.BindTime);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

