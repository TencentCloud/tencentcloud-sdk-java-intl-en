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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoteWriteInfo extends AbstractModel {

    /**
    * Task ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Log topic ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * RemoteWrite task name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Network type.
Valid values: 1: private network
2: Public network
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * VPC id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Task running status
1: Running
2: Suspend
3: Failure
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Target service name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * Destination address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RemoteWriteURL")
    @Expose
    private String RemoteWriteURL;

    /**
    * Authentication type
Valid values: 0: no authentication; 1: basic_auth; 2: token.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * Authentication information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthInfo")
    @Expose
    private RemoteWriteAuthInfo AuthInfo;

    /**
    * Logset
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Task status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Backend service type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VirtualGatewayType")
    @Expose
    private Long VirtualGatewayType;

    /**
     * Get Task ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Log topic ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicId Log topic ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicId Log topic ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get RemoteWrite task name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name RemoteWrite task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set RemoteWrite task name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name RemoteWrite task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Network type.
Valid values: 1: private network
2: Public network
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NetType Network type.
Valid values: 1: private network
2: Public network
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type.
Valid values: 1: private network
2: Public network
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NetType Network type.
Valid values: 1: private network
2: Public network
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get VPC id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId VPC id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId VPC id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Task running status
1: Running
2: Suspend
3: Failure
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Task running status
1: Running
2: Suspend
3: Failure
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task running status
1: Running
2: Suspend
3: Failure
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Task running status
1: Running
2: Suspend
3: Failure
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Target service name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Target Target service name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Target service name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Target Target service name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get Destination address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RemoteWriteURL Destination address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemoteWriteURL() {
        return this.RemoteWriteURL;
    }

    /**
     * Set Destination address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RemoteWriteURL Destination address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemoteWriteURL(String RemoteWriteURL) {
        this.RemoteWriteURL = RemoteWriteURL;
    }

    /**
     * Get Authentication type
Valid values: 0: no authentication; 1: basic_auth; 2: token.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthType Authentication type
Valid values: 0: no authentication; 1: basic_auth; 2: token.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set Authentication type
Valid values: 0: no authentication; 1: basic_auth; 2: token.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthType Authentication type
Valid values: 0: no authentication; 1: basic_auth; 2: token.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get Authentication information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthInfo Authentication information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RemoteWriteAuthInfo getAuthInfo() {
        return this.AuthInfo;
    }

    /**
     * Set Authentication information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthInfo Authentication information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthInfo(RemoteWriteAuthInfo AuthInfo) {
        this.AuthInfo = AuthInfo;
    }

    /**
     * Get Logset
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogsetId Logset
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogsetId Logset
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Task status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enable Task status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Task status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enable Task status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Backend service type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VirtualGatewayType Backend service type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVirtualGatewayType() {
        return this.VirtualGatewayType;
    }

    /**
     * Set Backend service type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VirtualGatewayType Backend service type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVirtualGatewayType(Long VirtualGatewayType) {
        this.VirtualGatewayType = VirtualGatewayType;
    }

    public RemoteWriteInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoteWriteInfo(RemoteWriteInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.RemoteWriteURL != null) {
            this.RemoteWriteURL = new String(source.RemoteWriteURL);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.AuthInfo != null) {
            this.AuthInfo = new RemoteWriteAuthInfo(source.AuthInfo);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.VirtualGatewayType != null) {
            this.VirtualGatewayType = new Long(source.VirtualGatewayType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "RemoteWriteURL", this.RemoteWriteURL);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamObj(map, prefix + "AuthInfo.", this.AuthInfo);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "VirtualGatewayType", this.VirtualGatewayType);

    }
}

