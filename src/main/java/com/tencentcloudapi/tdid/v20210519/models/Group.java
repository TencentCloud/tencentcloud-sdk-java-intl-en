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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Group extends AbstractModel{

    /**
    * The group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * The number of nodes.
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * The number of nodes of the organization.
    */
    @SerializedName("NodeCountOfAgency")
    @Expose
    private Long NodeCountOfAgency;

    /**
    * The description of the group.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Whether you are the owner of the consortium or not.
    */
    @SerializedName("RoleType")
    @Expose
    private Long RoleType;

    /**
    * The chain ID.
    */
    @SerializedName("ChainId")
    @Expose
    private String ChainId;

    /**
     * Get The group ID. 
     * @return GroupId The group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The group ID.
     * @param GroupId The group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get The number of nodes. 
     * @return NodeCount The number of nodes.
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set The number of nodes.
     * @param NodeCount The number of nodes.
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get The number of nodes of the organization. 
     * @return NodeCountOfAgency The number of nodes of the organization.
     */
    public Long getNodeCountOfAgency() {
        return this.NodeCountOfAgency;
    }

    /**
     * Set The number of nodes of the organization.
     * @param NodeCountOfAgency The number of nodes of the organization.
     */
    public void setNodeCountOfAgency(Long NodeCountOfAgency) {
        this.NodeCountOfAgency = NodeCountOfAgency;
    }

    /**
     * Get The description of the group. 
     * @return Description The description of the group.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The description of the group.
     * @param Description The description of the group.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Whether you are the owner of the consortium or not. 
     * @return RoleType Whether you are the owner of the consortium or not.
     */
    public Long getRoleType() {
        return this.RoleType;
    }

    /**
     * Set Whether you are the owner of the consortium or not.
     * @param RoleType Whether you are the owner of the consortium or not.
     */
    public void setRoleType(Long RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get The chain ID. 
     * @return ChainId The chain ID.
     */
    public String getChainId() {
        return this.ChainId;
    }

    /**
     * Set The chain ID.
     * @param ChainId The chain ID.
     */
    public void setChainId(String ChainId) {
        this.ChainId = ChainId;
    }

    public Group() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Group(Group source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.NodeCountOfAgency != null) {
            this.NodeCountOfAgency = new Long(source.NodeCountOfAgency);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RoleType != null) {
            this.RoleType = new Long(source.RoleType);
        }
        if (source.ChainId != null) {
            this.ChainId = new String(source.ChainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "NodeCountOfAgency", this.NodeCountOfAgency);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "ChainId", this.ChainId);

    }
}

