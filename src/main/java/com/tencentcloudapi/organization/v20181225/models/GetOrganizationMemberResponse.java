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
package com.tencentcloudapi.organization.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetOrganizationMemberResponse extends AbstractModel{

    /**
    * Organization member UIN
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Organization member name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Notes
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Joining time 
    */
    @SerializedName("JoinTime")
    @Expose
    private String JoinTime;

    /**
    * Organizational unit ID
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * Organizational unit name
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Parent organizational unit ID
    */
    @SerializedName("ParentNodeId")
    @Expose
    private Long ParentNodeId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Organization member UIN 
     * @return Uin Organization member UIN
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set Organization member UIN
     * @param Uin Organization member UIN
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Organization member name 
     * @return Name Organization member name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Organization member name
     * @param Name Organization member name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Notes 
     * @return Remark Notes
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Notes
     * @param Remark Notes
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Joining time  
     * @return JoinTime Joining time 
     */
    public String getJoinTime() {
        return this.JoinTime;
    }

    /**
     * Set Joining time 
     * @param JoinTime Joining time 
     */
    public void setJoinTime(String JoinTime) {
        this.JoinTime = JoinTime;
    }

    /**
     * Get Organizational unit ID 
     * @return NodeId Organizational unit ID
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Organizational unit ID
     * @param NodeId Organizational unit ID
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Organizational unit name 
     * @return NodeName Organizational unit name
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Organizational unit name
     * @param NodeName Organizational unit name
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Parent organizational unit ID 
     * @return ParentNodeId Parent organizational unit ID
     */
    public Long getParentNodeId() {
        return this.ParentNodeId;
    }

    /**
     * Set Parent organizational unit ID
     * @param ParentNodeId Parent organizational unit ID
     */
    public void setParentNodeId(Long ParentNodeId) {
        this.ParentNodeId = ParentNodeId;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "JoinTime", this.JoinTime);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "ParentNodeId", this.ParentNodeId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

