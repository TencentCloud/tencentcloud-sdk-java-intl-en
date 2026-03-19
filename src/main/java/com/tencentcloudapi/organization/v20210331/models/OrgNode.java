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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrgNode extends AbstractModel {

    /**
    * Organization node ID.
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
    * Parent Node ID
    */
    @SerializedName("ParentNodeId")
    @Expose
    private Long ParentNodeId;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update date
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Member tag list.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Organization node ID. 
     * @return NodeId Organization node ID.
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Organization node ID.
     * @param NodeId Organization node ID.
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
     * Get Parent Node ID 
     * @return ParentNodeId Parent Node ID
     */
    public Long getParentNodeId() {
        return this.ParentNodeId;
    }

    /**
     * Set Parent Node ID
     * @param ParentNodeId Parent Node ID
     */
    public void setParentNodeId(Long ParentNodeId) {
        this.ParentNodeId = ParentNodeId;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update date 
     * @return UpdateTime Update date
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update date
     * @param UpdateTime Update date
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Member tag list. 
     * @return Tags Member tag list.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Member tag list.
     * @param Tags Member tag list.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
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
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParentNodeId", this.ParentNodeId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

