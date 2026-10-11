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

public class FileInfo extends AbstractModel {

    /**
    * <p>Root account AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Workspace ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>File ID</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>File name, including suffix</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>File type. Parameter Value: FILE (regular file/script), NOTEBOOK_FILE (Notebook), SQL_FILE (SQL file). Corresponds to common/domain/entity.proto EntityType</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>Full path of the file in the workspace, starting with /, for example /etl/daily/demo.ipynb</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>File operation configuration.</p>
    */
    @SerializedName("FileConfig")
    @Expose
    private FileConfig FileConfig;

    /**
    * <p>Bound BundleId</p>
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * <p>Bound BundleInfo, JSON string</p>
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
    * <p>File status. active=normal, deleted=deleted</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>File owner userName</p>
    */
    @SerializedName("OwnerUserName")
    @Expose
    private String OwnerUserName;

    /**
    * <p>Creator sub-account Uin.</p>
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * <p>Last updated by sub-account Uin</p>
    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
    * <p>Creation time, millisecond-level timestamp</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Latest update time, millisecond-level timestamp</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>File storage information. Content is returned only when the request IncludeContent=true</p>
    */
    @SerializedName("Storage")
    @Expose
    private FileStorage Storage;

    /**
    * <p>Permission point list of the current caller for the file</p>
    */
    @SerializedName("Permissions")
    @Expose
    private String Permissions;

    /**
    * <p>Whether it is released</p>
    */
    @SerializedName("ReleaseStatus")
    @Expose
    private Boolean ReleaseStatus;

    /**
    * <p>Resource mode. 1=distributed, 2=single-node</p>
    */
    @SerializedName("ResourceMode")
    @Expose
    private Long ResourceMode;

    /**
    * <p>Pass through Workspace job information during async file preview job creation; leave this field unset for ordinary sync creation or other APIs that reuse this return structure</p>
    */
    @SerializedName("AsyncOperation")
    @Expose
    private AsyncOperation AsyncOperation;

    /**
    * <p>Script version ID.</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
     * Get <p>Root account AppId</p> 
     * @return AppId <p>Root account AppId</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Root account AppId</p>
     * @param AppId <p>Root account AppId</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Workspace ID</p> 
     * @return WorkspaceId <p>Workspace ID</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace ID</p>
     * @param WorkspaceId <p>Workspace ID</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>File ID</p> 
     * @return FileId <p>File ID</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>File ID</p>
     * @param FileId <p>File ID</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>File name, including suffix</p> 
     * @return FileName <p>File name, including suffix</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>File name, including suffix</p>
     * @param FileName <p>File name, including suffix</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>File type. Parameter Value: FILE (regular file/script), NOTEBOOK_FILE (Notebook), SQL_FILE (SQL file). Corresponds to common/domain/entity.proto EntityType</p> 
     * @return FileType <p>File type. Parameter Value: FILE (regular file/script), NOTEBOOK_FILE (Notebook), SQL_FILE (SQL file). Corresponds to common/domain/entity.proto EntityType</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>File type. Parameter Value: FILE (regular file/script), NOTEBOOK_FILE (Notebook), SQL_FILE (SQL file). Corresponds to common/domain/entity.proto EntityType</p>
     * @param FileType <p>File type. Parameter Value: FILE (regular file/script), NOTEBOOK_FILE (Notebook), SQL_FILE (SQL file). Corresponds to common/domain/entity.proto EntityType</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>Full path of the file in the workspace, starting with /, for example /etl/daily/demo.ipynb</p> 
     * @return Path <p>Full path of the file in the workspace, starting with /, for example /etl/daily/demo.ipynb</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Full path of the file in the workspace, starting with /, for example /etl/daily/demo.ipynb</p>
     * @param Path <p>Full path of the file in the workspace, starting with /, for example /etl/daily/demo.ipynb</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>File operation configuration.</p> 
     * @return FileConfig <p>File operation configuration.</p>
     */
    public FileConfig getFileConfig() {
        return this.FileConfig;
    }

    /**
     * Set <p>File operation configuration.</p>
     * @param FileConfig <p>File operation configuration.</p>
     */
    public void setFileConfig(FileConfig FileConfig) {
        this.FileConfig = FileConfig;
    }

    /**
     * Get <p>Bound BundleId</p> 
     * @return BundleId <p>Bound BundleId</p>
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>Bound BundleId</p>
     * @param BundleId <p>Bound BundleId</p>
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get <p>Bound BundleInfo, JSON string</p> 
     * @return BundleInfo <p>Bound BundleInfo, JSON string</p>
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set <p>Bound BundleInfo, JSON string</p>
     * @param BundleInfo <p>Bound BundleInfo, JSON string</p>
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    /**
     * Get <p>File status. active=normal, deleted=deleted</p> 
     * @return Status <p>File status. active=normal, deleted=deleted</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>File status. active=normal, deleted=deleted</p>
     * @param Status <p>File status. active=normal, deleted=deleted</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>File owner userName</p> 
     * @return OwnerUserName <p>File owner userName</p>
     */
    public String getOwnerUserName() {
        return this.OwnerUserName;
    }

    /**
     * Set <p>File owner userName</p>
     * @param OwnerUserName <p>File owner userName</p>
     */
    public void setOwnerUserName(String OwnerUserName) {
        this.OwnerUserName = OwnerUserName;
    }

    /**
     * Get <p>Creator sub-account Uin.</p> 
     * @return CreateUserUin <p>Creator sub-account Uin.</p>
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set <p>Creator sub-account Uin.</p>
     * @param CreateUserUin <p>Creator sub-account Uin.</p>
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get <p>Last updated by sub-account Uin</p> 
     * @return UpdateUserUin <p>Last updated by sub-account Uin</p>
     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set <p>Last updated by sub-account Uin</p>
     * @param UpdateUserUin <p>Last updated by sub-account Uin</p>
     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
    }

    /**
     * Get <p>Creation time, millisecond-level timestamp</p> 
     * @return CreateTime <p>Creation time, millisecond-level timestamp</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time, millisecond-level timestamp</p>
     * @param CreateTime <p>Creation time, millisecond-level timestamp</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Latest update time, millisecond-level timestamp</p> 
     * @return UpdateTime <p>Latest update time, millisecond-level timestamp</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Latest update time, millisecond-level timestamp</p>
     * @param UpdateTime <p>Latest update time, millisecond-level timestamp</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>File storage information. Content is returned only when the request IncludeContent=true</p> 
     * @return Storage <p>File storage information. Content is returned only when the request IncludeContent=true</p>
     */
    public FileStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>File storage information. Content is returned only when the request IncludeContent=true</p>
     * @param Storage <p>File storage information. Content is returned only when the request IncludeContent=true</p>
     */
    public void setStorage(FileStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>Permission point list of the current caller for the file</p> 
     * @return Permissions <p>Permission point list of the current caller for the file</p>
     */
    public String getPermissions() {
        return this.Permissions;
    }

    /**
     * Set <p>Permission point list of the current caller for the file</p>
     * @param Permissions <p>Permission point list of the current caller for the file</p>
     */
    public void setPermissions(String Permissions) {
        this.Permissions = Permissions;
    }

    /**
     * Get <p>Whether it is released</p> 
     * @return ReleaseStatus <p>Whether it is released</p>
     */
    public Boolean getReleaseStatus() {
        return this.ReleaseStatus;
    }

    /**
     * Set <p>Whether it is released</p>
     * @param ReleaseStatus <p>Whether it is released</p>
     */
    public void setReleaseStatus(Boolean ReleaseStatus) {
        this.ReleaseStatus = ReleaseStatus;
    }

    /**
     * Get <p>Resource mode. 1=distributed, 2=single-node</p> 
     * @return ResourceMode <p>Resource mode. 1=distributed, 2=single-node</p>
     */
    public Long getResourceMode() {
        return this.ResourceMode;
    }

    /**
     * Set <p>Resource mode. 1=distributed, 2=single-node</p>
     * @param ResourceMode <p>Resource mode. 1=distributed, 2=single-node</p>
     */
    public void setResourceMode(Long ResourceMode) {
        this.ResourceMode = ResourceMode;
    }

    /**
     * Get <p>Pass through Workspace job information during async file preview job creation; leave this field unset for ordinary sync creation or other APIs that reuse this return structure</p> 
     * @return AsyncOperation <p>Pass through Workspace job information during async file preview job creation; leave this field unset for ordinary sync creation or other APIs that reuse this return structure</p>
     */
    public AsyncOperation getAsyncOperation() {
        return this.AsyncOperation;
    }

    /**
     * Set <p>Pass through Workspace job information during async file preview job creation; leave this field unset for ordinary sync creation or other APIs that reuse this return structure</p>
     * @param AsyncOperation <p>Pass through Workspace job information during async file preview job creation; leave this field unset for ordinary sync creation or other APIs that reuse this return structure</p>
     */
    public void setAsyncOperation(AsyncOperation AsyncOperation) {
        this.AsyncOperation = AsyncOperation;
    }

    /**
     * Get <p>Script version ID.</p> 
     * @return VersionId <p>Script version ID.</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>Script version ID.</p>
     * @param VersionId <p>Script version ID.</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    public FileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileInfo(FileInfo source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.FileConfig != null) {
            this.FileConfig = new FileConfig(source.FileConfig);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OwnerUserName != null) {
            this.OwnerUserName = new String(source.OwnerUserName);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.UpdateUserUin != null) {
            this.UpdateUserUin = new String(source.UpdateUserUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Storage != null) {
            this.Storage = new FileStorage(source.Storage);
        }
        if (source.Permissions != null) {
            this.Permissions = new String(source.Permissions);
        }
        if (source.ReleaseStatus != null) {
            this.ReleaseStatus = new Boolean(source.ReleaseStatus);
        }
        if (source.ResourceMode != null) {
            this.ResourceMode = new Long(source.ResourceMode);
        }
        if (source.AsyncOperation != null) {
            this.AsyncOperation = new AsyncOperation(source.AsyncOperation);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "FileConfig.", this.FileConfig);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OwnerUserName", this.OwnerUserName);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamSimple(map, prefix + "Permissions", this.Permissions);
        this.setParamSimple(map, prefix + "ReleaseStatus", this.ReleaseStatus);
        this.setParamSimple(map, prefix + "ResourceMode", this.ResourceMode);
        this.setParamObj(map, prefix + "AsyncOperation.", this.AsyncOperation);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);

    }
}

