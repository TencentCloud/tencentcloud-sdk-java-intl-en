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

public class DeleteFolderRequest extends AbstractModel {

    /**
    * <p>Workspace id</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Folder to be deleted</p>
    */
    @SerializedName("Folder")
    @Expose
    private FolderLocator Folder;

    /**
    * <p>Soft deletion or hard delete from the recycle bin</p><p>Enumeration values:</p><ul><li>false: Soft delete to the recycle bin</li><li>true: Hard delete from the recycle bin</li></ul>
    */
    @SerializedName("ForceDelete")
    @Expose
    private Boolean ForceDelete;

    /**
     * Get <p>Workspace id</p> 
     * @return WorkspaceId <p>Workspace id</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace id</p>
     * @param WorkspaceId <p>Workspace id</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>Folder to be deleted</p> 
     * @return Folder <p>Folder to be deleted</p>
     */
    public FolderLocator getFolder() {
        return this.Folder;
    }

    /**
     * Set <p>Folder to be deleted</p>
     * @param Folder <p>Folder to be deleted</p>
     */
    public void setFolder(FolderLocator Folder) {
        this.Folder = Folder;
    }

    /**
     * Get <p>Soft deletion or hard delete from the recycle bin</p><p>Enumeration values:</p><ul><li>false: Soft delete to the recycle bin</li><li>true: Hard delete from the recycle bin</li></ul> 
     * @return ForceDelete <p>Soft deletion or hard delete from the recycle bin</p><p>Enumeration values:</p><ul><li>false: Soft delete to the recycle bin</li><li>true: Hard delete from the recycle bin</li></ul>
     */
    public Boolean getForceDelete() {
        return this.ForceDelete;
    }

    /**
     * Set <p>Soft deletion or hard delete from the recycle bin</p><p>Enumeration values:</p><ul><li>false: Soft delete to the recycle bin</li><li>true: Hard delete from the recycle bin</li></ul>
     * @param ForceDelete <p>Soft deletion or hard delete from the recycle bin</p><p>Enumeration values:</p><ul><li>false: Soft delete to the recycle bin</li><li>true: Hard delete from the recycle bin</li></ul>
     */
    public void setForceDelete(Boolean ForceDelete) {
        this.ForceDelete = ForceDelete;
    }

    public DeleteFolderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteFolderRequest(DeleteFolderRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.Folder != null) {
            this.Folder = new FolderLocator(source.Folder);
        }
        if (source.ForceDelete != null) {
            this.ForceDelete = new Boolean(source.ForceDelete);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamObj(map, prefix + "Folder.", this.Folder);
        this.setParamSimple(map, prefix + "ForceDelete", this.ForceDelete);

    }
}

