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

public class GetFileRequest extends AbstractModel {

    /**
    * <p>Workspace ID. Source: WorkspaceId returned by the ListWorkspaces API.</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>File ID. Source: FileId returned by the CreateFile / ListFiles API. Choose either this or FilePath</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>File type. Value: FILE (regular file/script), NOTEBOOK_FILE (Notebook), SQL_FILE (SQL file). Corresponds to common/domain/entity.proto EntityType</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>Whether to return file content. If true, Storage.Content returns base64 content. false by default</p>
    */
    @SerializedName("IncludeContent")
    @Expose
    private Boolean IncludeContent;

    /**
    * <p>File version ID. Source: VersionId returned by the ListFileVersions API. If not specified, the latest version is read.</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>Full path of the file, beginning with /, for example /etl/daily/demo.ipynb. Either this or FileId</p>
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
     * Get <p>Workspace ID. Source: WorkspaceId returned by the ListWorkspaces API.</p> 
     * @return WorkspaceId <p>Workspace ID. Source: WorkspaceId returned by the ListWorkspaces API.</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace ID. Source: WorkspaceId returned by the ListWorkspaces API.</p>
     * @param WorkspaceId <p>Workspace ID. Source: WorkspaceId returned by the ListWorkspaces API.</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>File ID. Source: FileId returned by the CreateFile / ListFiles API. Choose either this or FilePath</p> 
     * @return FileId <p>File ID. Source: FileId returned by the CreateFile / ListFiles API. Choose either this or FilePath</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>File ID. Source: FileId returned by the CreateFile / ListFiles API. Choose either this or FilePath</p>
     * @param FileId <p>File ID. Source: FileId returned by the CreateFile / ListFiles API. Choose either this or FilePath</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>File type. Value: FILE (regular file/script), NOTEBOOK_FILE (Notebook), SQL_FILE (SQL file). Corresponds to common/domain/entity.proto EntityType</p> 
     * @return FileType <p>File type. Value: FILE (regular file/script), NOTEBOOK_FILE (Notebook), SQL_FILE (SQL file). Corresponds to common/domain/entity.proto EntityType</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>File type. Value: FILE (regular file/script), NOTEBOOK_FILE (Notebook), SQL_FILE (SQL file). Corresponds to common/domain/entity.proto EntityType</p>
     * @param FileType <p>File type. Value: FILE (regular file/script), NOTEBOOK_FILE (Notebook), SQL_FILE (SQL file). Corresponds to common/domain/entity.proto EntityType</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>Whether to return file content. If true, Storage.Content returns base64 content. false by default</p> 
     * @return IncludeContent <p>Whether to return file content. If true, Storage.Content returns base64 content. false by default</p>
     */
    public Boolean getIncludeContent() {
        return this.IncludeContent;
    }

    /**
     * Set <p>Whether to return file content. If true, Storage.Content returns base64 content. false by default</p>
     * @param IncludeContent <p>Whether to return file content. If true, Storage.Content returns base64 content. false by default</p>
     */
    public void setIncludeContent(Boolean IncludeContent) {
        this.IncludeContent = IncludeContent;
    }

    /**
     * Get <p>File version ID. Source: VersionId returned by the ListFileVersions API. If not specified, the latest version is read.</p> 
     * @return VersionId <p>File version ID. Source: VersionId returned by the ListFileVersions API. If not specified, the latest version is read.</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>File version ID. Source: VersionId returned by the ListFileVersions API. If not specified, the latest version is read.</p>
     * @param VersionId <p>File version ID. Source: VersionId returned by the ListFileVersions API. If not specified, the latest version is read.</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>Full path of the file, beginning with /, for example /etl/daily/demo.ipynb. Either this or FileId</p> 
     * @return FilePath <p>Full path of the file, beginning with /, for example /etl/daily/demo.ipynb. Either this or FileId</p>
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set <p>Full path of the file, beginning with /, for example /etl/daily/demo.ipynb. Either this or FileId</p>
     * @param FilePath <p>Full path of the file, beginning with /, for example /etl/daily/demo.ipynb. Either this or FileId</p>
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    public GetFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFileRequest(GetFileRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.IncludeContent != null) {
            this.IncludeContent = new Boolean(source.IncludeContent);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "IncludeContent", this.IncludeContent);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);

    }
}

