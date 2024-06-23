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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LinkOpsDto extends AbstractModel {

    /**
    * Edge ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Edge key
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LinkKey")
    @Expose
    private String LinkKey;

    /**
    * Source node of the edge
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskFrom")
    @Expose
    private String TaskFrom;

    /**
    * Target node of the edge
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskTo")
    @Expose
    private String TaskTo;

    /**
    * Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * Dependency Relationship Between Parent and Child TasksNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LinkDependencyType")
    @Expose
    private String LinkDependencyType;

    /**
    * Dependency offset between parent and child tasks
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * Type of edge
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LinkType")
    @Expose
    private String LinkType;

    /**
    * Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
     * Get Edge ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Id Edge ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Edge ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Id Edge ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Edge key
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LinkKey Edge key
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLinkKey() {
        return this.LinkKey;
    }

    /**
     * Set Edge key
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LinkKey Edge key
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLinkKey(String LinkKey) {
        this.LinkKey = LinkKey;
    }

    /**
     * Get Source node of the edge
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskFrom Source node of the edge
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskFrom() {
        return this.TaskFrom;
    }

    /**
     * Set Source node of the edge
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskFrom Source node of the edge
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskFrom(String TaskFrom) {
        this.TaskFrom = TaskFrom;
    }

    /**
     * Get Target node of the edge
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskTo Target node of the edge
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskTo() {
        return this.TaskTo;
    }

    /**
     * Set Target node of the edge
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskTo Target node of the edge
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskTo(String TaskTo) {
        this.TaskTo = TaskTo;
    }

    /**
     * Get Person in ChargeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return InCharge Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     * @param InCharge Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get Dependency Relationship Between Parent and Child TasksNote: This field may return null, indicating that no valid value can be obtained. 
     * @return LinkDependencyType Dependency Relationship Between Parent and Child TasksNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLinkDependencyType() {
        return this.LinkDependencyType;
    }

    /**
     * Set Dependency Relationship Between Parent and Child TasksNote: This field may return null, indicating that no valid value can be obtained.
     * @param LinkDependencyType Dependency Relationship Between Parent and Child TasksNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLinkDependencyType(String LinkDependencyType) {
        this.LinkDependencyType = LinkDependencyType;
    }

    /**
     * Get Dependency offset between parent and child tasks
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Offset Dependency offset between parent and child tasks
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Dependency offset between parent and child tasks
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Offset Dependency offset between parent and child tasks
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Type of edge
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LinkType Type of edge
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLinkType() {
        return this.LinkType;
    }

    /**
     * Set Type of edge
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LinkType Type of edge
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLinkType(String LinkType) {
        this.LinkType = LinkType;
    }

    /**
     * Get Workflow IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkflowId Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param WorkflowId Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    public LinkOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LinkOpsDto(LinkOpsDto source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.LinkKey != null) {
            this.LinkKey = new String(source.LinkKey);
        }
        if (source.TaskFrom != null) {
            this.TaskFrom = new String(source.TaskFrom);
        }
        if (source.TaskTo != null) {
            this.TaskTo = new String(source.TaskTo);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.LinkDependencyType != null) {
            this.LinkDependencyType = new String(source.LinkDependencyType);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.LinkType != null) {
            this.LinkType = new String(source.LinkType);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "LinkKey", this.LinkKey);
        this.setParamSimple(map, prefix + "TaskFrom", this.TaskFrom);
        this.setParamSimple(map, prefix + "TaskTo", this.TaskTo);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "LinkDependencyType", this.LinkDependencyType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "LinkType", this.LinkType);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);

    }
}

