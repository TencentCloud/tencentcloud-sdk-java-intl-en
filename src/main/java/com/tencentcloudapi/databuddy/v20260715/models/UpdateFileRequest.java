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

public class UpdateFileRequest extends AbstractModel {

    /**
    * <p>Workspace ID. Source: WorkspaceId returned by the ListWorkspaces API</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>File ID. Source: FileId returned by the CreateFile / ListFiles / GetFile APIs</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>File operation configuration. If not passed, the configuration will not be updated.</p>
    */
    @SerializedName("FileConfig")
    @Expose
    private FileConfig FileConfig;

    /**
    * <p>File type. Parameter Value: FILE (regular file/script), NOTEBOOK_FILE (Notebook), SQL_FILE (SQL file). Corresponds to common/domain/entity.proto EntityType</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>Bound BundleId. Source: BundleId returned by the ListBundles API</p>
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
    * <p>File content. If not passed, the content will not be updated.</p>
    */
    @SerializedName("Storage")
    @Expose
    private FileStorage Storage;

    /**
    * <p>Target file name. When it is not empty and different from the current file name, perform the rename action. Length not exceeding SCRIPT_NAME_MAX_LENGTH. It must not begin or end with . or .., and spaces, double dots, control characters, and Linux reserved names are forbidden (see docs/linux_filename_rules.md). Validate the suffix legitimacy together with ExtensionType.</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>Target parent directory path. If not empty, execute the move action. For the root directory, pass /; it can simultaneously appear with FileName, with the semantics of "move + rename". It should be consistent with ParentFolderPath of CreateFile.</p>
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * <p>FileType of the target parent directory. Value: FOLDER, GIT_FOLDER. Used only when ParentFolderPath is not empty; by default, it is handled based on the actual type of the parsed parent directory</p>
    */
    @SerializedName("TargetFileType")
    @Expose
    private String TargetFileType;

    /**
    * <p>Action type (optional, default value: 1, mandatory verification in future versions). Value: 1 = UPDATE_CONTENT (only refresh FileConfig / Storage / Bundle*, forbid passing FileName / ParentFolderPath / TargetFileType); 2 = RENAME (rename only, must pass FileName, forbid passing ParentFolderPath / FileConfig / Storage / Bundle*); 3 = MOVE (move only, must pass ParentFolderPath, forbid passing FileName / FileConfig / Storage / Bundle*). A ParamIllegal error will be returned if parameter mutual exclusion verification fails</p>
    */
    @SerializedName("UpdateAction")
    @Expose
    private Long UpdateAction;

    /**
     * Get <p>Workspace ID. Source: WorkspaceId returned by the ListWorkspaces API</p> 
     * @return WorkspaceId <p>Workspace ID. Source: WorkspaceId returned by the ListWorkspaces API</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace ID. Source: WorkspaceId returned by the ListWorkspaces API</p>
     * @param WorkspaceId <p>Workspace ID. Source: WorkspaceId returned by the ListWorkspaces API</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>File ID. Source: FileId returned by the CreateFile / ListFiles / GetFile APIs</p> 
     * @return FileId <p>File ID. Source: FileId returned by the CreateFile / ListFiles / GetFile APIs</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>File ID. Source: FileId returned by the CreateFile / ListFiles / GetFile APIs</p>
     * @param FileId <p>File ID. Source: FileId returned by the CreateFile / ListFiles / GetFile APIs</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>File operation configuration. If not passed, the configuration will not be updated.</p> 
     * @return FileConfig <p>File operation configuration. If not passed, the configuration will not be updated.</p>
     */
    public FileConfig getFileConfig() {
        return this.FileConfig;
    }

    /**
     * Set <p>File operation configuration. If not passed, the configuration will not be updated.</p>
     * @param FileConfig <p>File operation configuration. If not passed, the configuration will not be updated.</p>
     */
    public void setFileConfig(FileConfig FileConfig) {
        this.FileConfig = FileConfig;
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
     * Get <p>Bound BundleId. Source: BundleId returned by the ListBundles API</p> 
     * @return BundleId <p>Bound BundleId. Source: BundleId returned by the ListBundles API</p>
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>Bound BundleId. Source: BundleId returned by the ListBundles API</p>
     * @param BundleId <p>Bound BundleId. Source: BundleId returned by the ListBundles API</p>
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
     * Get <p>File content. If not passed, the content will not be updated.</p> 
     * @return Storage <p>File content. If not passed, the content will not be updated.</p>
     */
    public FileStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>File content. If not passed, the content will not be updated.</p>
     * @param Storage <p>File content. If not passed, the content will not be updated.</p>
     */
    public void setStorage(FileStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>Target file name. When it is not empty and different from the current file name, perform the rename action. Length not exceeding SCRIPT_NAME_MAX_LENGTH. It must not begin or end with . or .., and spaces, double dots, control characters, and Linux reserved names are forbidden (see docs/linux_filename_rules.md). Validate the suffix legitimacy together with ExtensionType.</p> 
     * @return FileName <p>Target file name. When it is not empty and different from the current file name, perform the rename action. Length not exceeding SCRIPT_NAME_MAX_LENGTH. It must not begin or end with . or .., and spaces, double dots, control characters, and Linux reserved names are forbidden (see docs/linux_filename_rules.md). Validate the suffix legitimacy together with ExtensionType.</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>Target file name. When it is not empty and different from the current file name, perform the rename action. Length not exceeding SCRIPT_NAME_MAX_LENGTH. It must not begin or end with . or .., and spaces, double dots, control characters, and Linux reserved names are forbidden (see docs/linux_filename_rules.md). Validate the suffix legitimacy together with ExtensionType.</p>
     * @param FileName <p>Target file name. When it is not empty and different from the current file name, perform the rename action. Length not exceeding SCRIPT_NAME_MAX_LENGTH. It must not begin or end with . or .., and spaces, double dots, control characters, and Linux reserved names are forbidden (see docs/linux_filename_rules.md). Validate the suffix legitimacy together with ExtensionType.</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>Target parent directory path. If not empty, execute the move action. For the root directory, pass /; it can simultaneously appear with FileName, with the semantics of "move + rename". It should be consistent with ParentFolderPath of CreateFile.</p> 
     * @return ParentFolderPath <p>Target parent directory path. If not empty, execute the move action. For the root directory, pass /; it can simultaneously appear with FileName, with the semantics of "move + rename". It should be consistent with ParentFolderPath of CreateFile.</p>
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set <p>Target parent directory path. If not empty, execute the move action. For the root directory, pass /; it can simultaneously appear with FileName, with the semantics of "move + rename". It should be consistent with ParentFolderPath of CreateFile.</p>
     * @param ParentFolderPath <p>Target parent directory path. If not empty, execute the move action. For the root directory, pass /; it can simultaneously appear with FileName, with the semantics of "move + rename". It should be consistent with ParentFolderPath of CreateFile.</p>
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get <p>FileType of the target parent directory. Value: FOLDER, GIT_FOLDER. Used only when ParentFolderPath is not empty; by default, it is handled based on the actual type of the parsed parent directory</p> 
     * @return TargetFileType <p>FileType of the target parent directory. Value: FOLDER, GIT_FOLDER. Used only when ParentFolderPath is not empty; by default, it is handled based on the actual type of the parsed parent directory</p>
     */
    public String getTargetFileType() {
        return this.TargetFileType;
    }

    /**
     * Set <p>FileType of the target parent directory. Value: FOLDER, GIT_FOLDER. Used only when ParentFolderPath is not empty; by default, it is handled based on the actual type of the parsed parent directory</p>
     * @param TargetFileType <p>FileType of the target parent directory. Value: FOLDER, GIT_FOLDER. Used only when ParentFolderPath is not empty; by default, it is handled based on the actual type of the parsed parent directory</p>
     */
    public void setTargetFileType(String TargetFileType) {
        this.TargetFileType = TargetFileType;
    }

    /**
     * Get <p>Action type (optional, default value: 1, mandatory verification in future versions). Value: 1 = UPDATE_CONTENT (only refresh FileConfig / Storage / Bundle*, forbid passing FileName / ParentFolderPath / TargetFileType); 2 = RENAME (rename only, must pass FileName, forbid passing ParentFolderPath / FileConfig / Storage / Bundle*); 3 = MOVE (move only, must pass ParentFolderPath, forbid passing FileName / FileConfig / Storage / Bundle*). A ParamIllegal error will be returned if parameter mutual exclusion verification fails</p> 
     * @return UpdateAction <p>Action type (optional, default value: 1, mandatory verification in future versions). Value: 1 = UPDATE_CONTENT (only refresh FileConfig / Storage / Bundle*, forbid passing FileName / ParentFolderPath / TargetFileType); 2 = RENAME (rename only, must pass FileName, forbid passing ParentFolderPath / FileConfig / Storage / Bundle*); 3 = MOVE (move only, must pass ParentFolderPath, forbid passing FileName / FileConfig / Storage / Bundle*). A ParamIllegal error will be returned if parameter mutual exclusion verification fails</p>
     */
    public Long getUpdateAction() {
        return this.UpdateAction;
    }

    /**
     * Set <p>Action type (optional, default value: 1, mandatory verification in future versions). Value: 1 = UPDATE_CONTENT (only refresh FileConfig / Storage / Bundle*, forbid passing FileName / ParentFolderPath / TargetFileType); 2 = RENAME (rename only, must pass FileName, forbid passing ParentFolderPath / FileConfig / Storage / Bundle*); 3 = MOVE (move only, must pass ParentFolderPath, forbid passing FileName / FileConfig / Storage / Bundle*). A ParamIllegal error will be returned if parameter mutual exclusion verification fails</p>
     * @param UpdateAction <p>Action type (optional, default value: 1, mandatory verification in future versions). Value: 1 = UPDATE_CONTENT (only refresh FileConfig / Storage / Bundle*, forbid passing FileName / ParentFolderPath / TargetFileType); 2 = RENAME (rename only, must pass FileName, forbid passing ParentFolderPath / FileConfig / Storage / Bundle*); 3 = MOVE (move only, must pass ParentFolderPath, forbid passing FileName / FileConfig / Storage / Bundle*). A ParamIllegal error will be returned if parameter mutual exclusion verification fails</p>
     */
    public void setUpdateAction(Long UpdateAction) {
        this.UpdateAction = UpdateAction;
    }

    public UpdateFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFileRequest(UpdateFileRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileConfig != null) {
            this.FileConfig = new FileConfig(source.FileConfig);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
        if (source.Storage != null) {
            this.Storage = new FileStorage(source.Storage);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.TargetFileType != null) {
            this.TargetFileType = new String(source.TargetFileType);
        }
        if (source.UpdateAction != null) {
            this.UpdateAction = new Long(source.UpdateAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "FileConfig.", this.FileConfig);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "TargetFileType", this.TargetFileType);
        this.setParamSimple(map, prefix + "UpdateAction", this.UpdateAction);

    }
}

