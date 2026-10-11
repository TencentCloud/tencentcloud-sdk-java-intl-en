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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkspaceInfo extends AbstractModel {

    /**
    * Workspace ID
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * Workspace name
    */
    @SerializedName("WorkspaceName")
    @Expose
    private String WorkspaceName;

    /**
    * Workspace description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Workspace region (for example, ap-guangzhou)
    */
    @SerializedName("WorkspaceRegion")
    @Expose
    private String WorkspaceRegion;

    /**
    * Workspace status: 0=unspecified, 1=creating, 2=creation failed, 3=operating normally, 4=deleted.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Failure reason (valid when Status=2, indicating creation failure)
    */
    @SerializedName("ErrorReason")
    @Expose
    private String ErrorReason;

    /**
    * Creator information
    */
    @SerializedName("Creator")
    @Expose
    private StandardUserInfo Creator;

    /**
    * Creation time. Millisecond timestamp
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last update time. Timestamp in milliseconds
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Whether the current user has access permission for the workspace
    */
    @SerializedName("HasAccess")
    @Expose
    private Boolean HasAccess;

    /**
     * Get Workspace ID 
     * @return WorkspaceId Workspace ID
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set Workspace ID
     * @param WorkspaceId Workspace ID
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get Workspace name 
     * @return WorkspaceName Workspace name
     */
    public String getWorkspaceName() {
        return this.WorkspaceName;
    }

    /**
     * Set Workspace name
     * @param WorkspaceName Workspace name
     */
    public void setWorkspaceName(String WorkspaceName) {
        this.WorkspaceName = WorkspaceName;
    }

    /**
     * Get Workspace description 
     * @return Description Workspace description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Workspace description
     * @param Description Workspace description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Workspace region (for example, ap-guangzhou) 
     * @return WorkspaceRegion Workspace region (for example, ap-guangzhou)
     */
    public String getWorkspaceRegion() {
        return this.WorkspaceRegion;
    }

    /**
     * Set Workspace region (for example, ap-guangzhou)
     * @param WorkspaceRegion Workspace region (for example, ap-guangzhou)
     */
    public void setWorkspaceRegion(String WorkspaceRegion) {
        this.WorkspaceRegion = WorkspaceRegion;
    }

    /**
     * Get Workspace status: 0=unspecified, 1=creating, 2=creation failed, 3=operating normally, 4=deleted. 
     * @return Status Workspace status: 0=unspecified, 1=creating, 2=creation failed, 3=operating normally, 4=deleted.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Workspace status: 0=unspecified, 1=creating, 2=creation failed, 3=operating normally, 4=deleted.
     * @param Status Workspace status: 0=unspecified, 1=creating, 2=creation failed, 3=operating normally, 4=deleted.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Failure reason (valid when Status=2, indicating creation failure) 
     * @return ErrorReason Failure reason (valid when Status=2, indicating creation failure)
     */
    public String getErrorReason() {
        return this.ErrorReason;
    }

    /**
     * Set Failure reason (valid when Status=2, indicating creation failure)
     * @param ErrorReason Failure reason (valid when Status=2, indicating creation failure)
     */
    public void setErrorReason(String ErrorReason) {
        this.ErrorReason = ErrorReason;
    }

    /**
     * Get Creator information 
     * @return Creator Creator information
     */
    public StandardUserInfo getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator information
     * @param Creator Creator information
     */
    public void setCreator(StandardUserInfo Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Creation time. Millisecond timestamp 
     * @return CreateTime Creation time. Millisecond timestamp
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time. Millisecond timestamp
     * @param CreateTime Creation time. Millisecond timestamp
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last update time. Timestamp in milliseconds 
     * @return UpdateTime Last update time. Timestamp in milliseconds
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last update time. Timestamp in milliseconds
     * @param UpdateTime Last update time. Timestamp in milliseconds
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Whether the current user has access permission for the workspace 
     * @return HasAccess Whether the current user has access permission for the workspace
     */
    public Boolean getHasAccess() {
        return this.HasAccess;
    }

    /**
     * Set Whether the current user has access permission for the workspace
     * @param HasAccess Whether the current user has access permission for the workspace
     */
    public void setHasAccess(Boolean HasAccess) {
        this.HasAccess = HasAccess;
    }

    public WorkspaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkspaceInfo(WorkspaceInfo source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkspaceName != null) {
            this.WorkspaceName = new String(source.WorkspaceName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.WorkspaceRegion != null) {
            this.WorkspaceRegion = new String(source.WorkspaceRegion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrorReason != null) {
            this.ErrorReason = new String(source.ErrorReason);
        }
        if (source.Creator != null) {
            this.Creator = new StandardUserInfo(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.HasAccess != null) {
            this.HasAccess = new Boolean(source.HasAccess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkspaceName", this.WorkspaceName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "WorkspaceRegion", this.WorkspaceRegion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorReason", this.ErrorReason);
        this.setParamObj(map, prefix + "Creator.", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "HasAccess", this.HasAccess);

    }
}

