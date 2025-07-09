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
package com.tencentcloudapi.organization.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgNode extends AbstractModel {

    /**
    * Organizational unit ID
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Parent organizational unit ID
    */
    @SerializedName("ParentNodeId")
    @Expose
    private Long ParentNodeId;

    /**
    * Number of members
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

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
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get Number of members 
     * @return MemberCount Number of members
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set Number of members
     * @param MemberCount Number of members
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    public OrgNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgNode(OrgNode source) {
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParentNodeId != null) {
            this.ParentNodeId = new Long(source.ParentNodeId);
        }
        if (source.MemberCount != null) {
            this.MemberCount = new Long(source.MemberCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParentNodeId", this.ParentNodeId);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);

    }
}

