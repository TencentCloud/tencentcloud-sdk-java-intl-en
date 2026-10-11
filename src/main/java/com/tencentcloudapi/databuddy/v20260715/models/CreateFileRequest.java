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

public class CreateFileRequest extends AbstractModel {

    /**
    * <p>Workspace ID. Source: WorkspaceId returned by the ListWorkspaces API</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>File name with suffix, up to 255 bytes. It cannot begin or end with . or .., and cannot contain spaces or control characters.</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>Parent folder path, starting with / and not ending with /. Pass / for the root directory. Source: Path returned by the ListFiles API</p>
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * <p>File type. Parameter Value: FILE (regular file/script), NOTEBOOK_FILE (Notebook), SQL_FILE (SQL file). Corresponds to common/domain/entity.proto EntityType</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>File operation configuration.</p>
    */
    @SerializedName("FileConfig")
    @Expose
    private FileConfig FileConfig;

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
    * <p>Initial file content. If not passed, default content will be generated based on FileType.</p>
    */
    @SerializedName("Storage")
    @Expose
    private FileStorage Storage;

    /**
    * Whether to asynchronously decompress and create ZIP files in Storage. false by default. When true, the async job is fully managed by Workspace throughout its lifecycle, and the response only returns job information through AsyncOperation (FileId is empty). Job progress querying is implemented by the basic platform WS interface and is not defined in this agreement.
    */
    @SerializedName("ExtractArchive")
    @Expose
    private Boolean ExtractArchive;

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
     * Get <p>File name with suffix, up to 255 bytes. It cannot begin or end with . or .., and cannot contain spaces or control characters.</p> 
     * @return FileName <p>File name with suffix, up to 255 bytes. It cannot begin or end with . or .., and cannot contain spaces or control characters.</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>File name with suffix, up to 255 bytes. It cannot begin or end with . or .., and cannot contain spaces or control characters.</p>
     * @param FileName <p>File name with suffix, up to 255 bytes. It cannot begin or end with . or .., and cannot contain spaces or control characters.</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>Parent folder path, starting with / and not ending with /. Pass / for the root directory. Source: Path returned by the ListFiles API</p> 
     * @return ParentFolderPath <p>Parent folder path, starting with / and not ending with /. Pass / for the root directory. Source: Path returned by the ListFiles API</p>
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set <p>Parent folder path, starting with / and not ending with /. Pass / for the root directory. Source: Path returned by the ListFiles API</p>
     * @param ParentFolderPath <p>Parent folder path, starting with / and not ending with /. Pass / for the root directory. Source: Path returned by the ListFiles API</p>
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
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
     * Get <p>Initial file content. If not passed, default content will be generated based on FileType.</p> 
     * @return Storage <p>Initial file content. If not passed, default content will be generated based on FileType.</p>
     */
    public FileStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>Initial file content. If not passed, default content will be generated based on FileType.</p>
     * @param Storage <p>Initial file content. If not passed, default content will be generated based on FileType.</p>
     */
    public void setStorage(FileStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Whether to asynchronously decompress and create ZIP files in Storage. false by default. When true, the async job is fully managed by Workspace throughout its lifecycle, and the response only returns job information through AsyncOperation (FileId is empty). Job progress querying is implemented by the basic platform WS interface and is not defined in this agreement. 
     * @return ExtractArchive Whether to asynchronously decompress and create ZIP files in Storage. false by default. When true, the async job is fully managed by Workspace throughout its lifecycle, and the response only returns job information through AsyncOperation (FileId is empty). Job progress querying is implemented by the basic platform WS interface and is not defined in this agreement.
     */
    public Boolean getExtractArchive() {
        return this.ExtractArchive;
    }

    /**
     * Set Whether to asynchronously decompress and create ZIP files in Storage. false by default. When true, the async job is fully managed by Workspace throughout its lifecycle, and the response only returns job information through AsyncOperation (FileId is empty). Job progress querying is implemented by the basic platform WS interface and is not defined in this agreement.
     * @param ExtractArchive Whether to asynchronously decompress and create ZIP files in Storage. false by default. When true, the async job is fully managed by Workspace throughout its lifecycle, and the response only returns job information through AsyncOperation (FileId is empty). Job progress querying is implemented by the basic platform WS interface and is not defined in this agreement.
     */
    public void setExtractArchive(Boolean ExtractArchive) {
        this.ExtractArchive = ExtractArchive;
    }

    public CreateFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileRequest(CreateFileRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
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
        if (source.Storage != null) {
            this.Storage = new FileStorage(source.Storage);
        }
        if (source.ExtractArchive != null) {
            this.ExtractArchive = new Boolean(source.ExtractArchive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamObj(map, prefix + "FileConfig.", this.FileConfig);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamSimple(map, prefix + "ExtractArchive", this.ExtractArchive);

    }
}

