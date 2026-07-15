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

public class ModifyRemoteWriteTaskRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Log topic id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Task status.
0: disabled, 1: enabled.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * RemoteWrite task name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Valid values: 1: private network; 2: public network.
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * VPC id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Target service name.
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * Destination address
    */
    @SerializedName("RemoteWriteURL")
    @Expose
    private String RemoteWriteURL;

    /**
    * Valid values: 0: no authentication; 1: basic_auth; 2: token.	
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * Authentication information
    */
    @SerializedName("AuthInfo")
    @Expose
    private RemoteWriteAuthInfo AuthInfo;

    /**
    * Backend service type
-1 No
0 CVM
1025 CLB
    */
    @SerializedName("VirtualGatewayType")
    @Expose
    private Long VirtualGatewayType;

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
     * Get Log topic id 
     * @return TopicId Log topic id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic id
     * @param TopicId Log topic id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Task status.
0: disabled, 1: enabled. 
     * @return Enable Task status.
0: disabled, 1: enabled.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Task status.
0: disabled, 1: enabled.
     * @param Enable Task status.
0: disabled, 1: enabled.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get RemoteWrite task name. 
     * @return Name RemoteWrite task name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set RemoteWrite task name.
     * @param Name RemoteWrite task name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Valid values: 1: private network; 2: public network. 
     * @return NetType Valid values: 1: private network; 2: public network.
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set Valid values: 1: private network; 2: public network.
     * @param NetType Valid values: 1: private network; 2: public network.
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get VPC id 
     * @return VpcId VPC id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC id
     * @param VpcId VPC id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Target service name. 
     * @return Target Target service name.
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set Target service name.
     * @param Target Target service name.
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get Destination address 
     * @return RemoteWriteURL Destination address
     */
    public String getRemoteWriteURL() {
        return this.RemoteWriteURL;
    }

    /**
     * Set Destination address
     * @param RemoteWriteURL Destination address
     */
    public void setRemoteWriteURL(String RemoteWriteURL) {
        this.RemoteWriteURL = RemoteWriteURL;
    }

    /**
     * Get Valid values: 0: no authentication; 1: basic_auth; 2: token.	 
     * @return AuthType Valid values: 0: no authentication; 1: basic_auth; 2: token.	
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set Valid values: 0: no authentication; 1: basic_auth; 2: token.	
     * @param AuthType Valid values: 0: no authentication; 1: basic_auth; 2: token.	
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get Authentication information 
     * @return AuthInfo Authentication information
     */
    public RemoteWriteAuthInfo getAuthInfo() {
        return this.AuthInfo;
    }

    /**
     * Set Authentication information
     * @param AuthInfo Authentication information
     */
    public void setAuthInfo(RemoteWriteAuthInfo AuthInfo) {
        this.AuthInfo = AuthInfo;
    }

    /**
     * Get Backend service type
-1 No
0 CVM
1025 CLB 
     * @return VirtualGatewayType Backend service type
-1 No
0 CVM
1025 CLB
     */
    public Long getVirtualGatewayType() {
        return this.VirtualGatewayType;
    }

    /**
     * Set Backend service type
-1 No
0 CVM
1025 CLB
     * @param VirtualGatewayType Backend service type
-1 No
0 CVM
1025 CLB
     */
    public void setVirtualGatewayType(Long VirtualGatewayType) {
        this.VirtualGatewayType = VirtualGatewayType;
    }

    public ModifyRemoteWriteTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRemoteWriteTaskRequest(ModifyRemoteWriteTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
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
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "RemoteWriteURL", this.RemoteWriteURL);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamObj(map, prefix + "AuthInfo.", this.AuthInfo);
        this.setParamSimple(map, prefix + "VirtualGatewayType", this.VirtualGatewayType);

    }
}

