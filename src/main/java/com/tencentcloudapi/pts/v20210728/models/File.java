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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class File extends AbstractModel {

    /**
    * File ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * File type. 1 represents parameter file, 2 represents protocol file, 3 represents request file.
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
    * Filename.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * File size.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * File type. The 'folder' represents a folder; if not specified, it represents a normal file.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Update time.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Number of file lines.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("LineCount")
    @Expose
    private Long LineCount;

    /**
    * First few rows of file.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("HeadLines")
    @Expose
    private String [] HeadLines;

    /**
    * Last few rows of file.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("TailLines")
    @Expose
    private String [] TailLines;

    /**
    * Whether the header is in the file.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("HeaderInFile")
    @Expose
    private Boolean HeaderInFile;

    /**
    * Parameter name.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("HeaderColumns")
    @Expose
    private String [] HeaderColumns;

    /**
    * Files in the folder.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("FileInfos")
    @Expose
    private FileInfo [] FileInfos;

    /**
    * Associated scenario.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ScenarioSet")
    @Expose
    private Scenario [] ScenarioSet;

    /**
    * File status.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Create time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Project ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Deprecated.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * Uin.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Sub account uin.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * App ID of user account.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
     * Get File ID. 
     * @return FileId File ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set File ID.
     * @param FileId File ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get File type. 1 represents parameter file, 2 represents protocol file, 3 represents request file. 
     * @return Kind File type. 1 represents parameter file, 2 represents protocol file, 3 represents request file.
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set File type. 1 represents parameter file, 2 represents protocol file, 3 represents request file.
     * @param Kind File type. 1 represents parameter file, 2 represents protocol file, 3 represents request file.
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    /**
     * Get Filename. 
     * @return Name Filename.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filename.
     * @param Name Filename.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get File size. 
     * @return Size File size.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set File size.
     * @param Size File size.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get File type. The 'folder' represents a folder; if not specified, it represents a normal file. 
     * @return Type File type. The 'folder' represents a folder; if not specified, it represents a normal file.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set File type. The 'folder' represents a folder; if not specified, it represents a normal file.
     * @param Type File type. The 'folder' represents a folder; if not specified, it represents a normal file.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Update time. 
     * @return UpdatedAt Update time.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time.
     * @param UpdatedAt Update time.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Number of file lines.

Note: This field may return null, indicating that no valid value is found. 
     * @return LineCount Number of file lines.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getLineCount() {
        return this.LineCount;
    }

    /**
     * Set Number of file lines.

Note: This field may return null, indicating that no valid value is found.
     * @param LineCount Number of file lines.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setLineCount(Long LineCount) {
        this.LineCount = LineCount;
    }

    /**
     * Get First few rows of file.

Note: This field may return null, indicating that no valid value is found. 
     * @return HeadLines First few rows of file.

Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getHeadLines() {
        return this.HeadLines;
    }

    /**
     * Set First few rows of file.

Note: This field may return null, indicating that no valid value is found.
     * @param HeadLines First few rows of file.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setHeadLines(String [] HeadLines) {
        this.HeadLines = HeadLines;
    }

    /**
     * Get Last few rows of file.

Note: This field may return null, indicating that no valid value is found. 
     * @return TailLines Last few rows of file.

Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getTailLines() {
        return this.TailLines;
    }

    /**
     * Set Last few rows of file.

Note: This field may return null, indicating that no valid value is found.
     * @param TailLines Last few rows of file.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setTailLines(String [] TailLines) {
        this.TailLines = TailLines;
    }

    /**
     * Get Whether the header is in the file.

Note: This field may return null, indicating that no valid value is found. 
     * @return HeaderInFile Whether the header is in the file.

Note: This field may return null, indicating that no valid value is found.
     */
    public Boolean getHeaderInFile() {
        return this.HeaderInFile;
    }

    /**
     * Set Whether the header is in the file.

Note: This field may return null, indicating that no valid value is found.
     * @param HeaderInFile Whether the header is in the file.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setHeaderInFile(Boolean HeaderInFile) {
        this.HeaderInFile = HeaderInFile;
    }

    /**
     * Get Parameter name.

Note: This field may return null, indicating that no valid value is found. 
     * @return HeaderColumns Parameter name.

Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getHeaderColumns() {
        return this.HeaderColumns;
    }

    /**
     * Set Parameter name.

Note: This field may return null, indicating that no valid value is found.
     * @param HeaderColumns Parameter name.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setHeaderColumns(String [] HeaderColumns) {
        this.HeaderColumns = HeaderColumns;
    }

    /**
     * Get Files in the folder.

Note: This field may return null, indicating that no valid value is found. 
     * @return FileInfos Files in the folder.

Note: This field may return null, indicating that no valid value is found.
     */
    public FileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set Files in the folder.

Note: This field may return null, indicating that no valid value is found.
     * @param FileInfos Files in the folder.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setFileInfos(FileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get Associated scenario.

Note: This field may return null, indicating that no valid value is found. 
     * @return ScenarioSet Associated scenario.

Note: This field may return null, indicating that no valid value is found.
     */
    public Scenario [] getScenarioSet() {
        return this.ScenarioSet;
    }

    /**
     * Set Associated scenario.

Note: This field may return null, indicating that no valid value is found.
     * @param ScenarioSet Associated scenario.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setScenarioSet(Scenario [] ScenarioSet) {
        this.ScenarioSet = ScenarioSet;
    }

    /**
     * Get File status.

Note: This field may return null, indicating that no valid value is found. 
     * @return Status File status.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set File status.

Note: This field may return null, indicating that no valid value is found.
     * @param Status File status.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Create time.

Note: This field may return null, indicating that no valid value is found. 
     * @return CreatedAt Create time.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Create time.

Note: This field may return null, indicating that no valid value is found.
     * @param CreatedAt Create time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Project ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return ProjectId Project ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.

Note: This field may return null, indicating that no valid value is found.
     * @param ProjectId Project ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Deprecated.

Note: This field may return null, indicating that no valid value is found. 
     * @return AppID Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set Deprecated.

Note: This field may return null, indicating that no valid value is found.
     * @param AppID Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get Uin.

Note: This field may return null, indicating that no valid value is found. 
     * @return Uin Uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Uin.

Note: This field may return null, indicating that no valid value is found.
     * @param Uin Uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub account uin.

Note: This field may return null, indicating that no valid value is found. 
     * @return SubAccountUin Sub account uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set Sub account uin.

Note: This field may return null, indicating that no valid value is found.
     * @param SubAccountUin Sub account uin.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get App ID of user account.

Note: This field may return null, indicating that no valid value is found. 
     * @return AppId App ID of user account.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set App ID of user account.

Note: This field may return null, indicating that no valid value is found.
     * @param AppId App ID of user account.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    public File() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public File(File source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.LineCount != null) {
            this.LineCount = new Long(source.LineCount);
        }
        if (source.HeadLines != null) {
            this.HeadLines = new String[source.HeadLines.length];
            for (int i = 0; i < source.HeadLines.length; i++) {
                this.HeadLines[i] = new String(source.HeadLines[i]);
            }
        }
        if (source.TailLines != null) {
            this.TailLines = new String[source.TailLines.length];
            for (int i = 0; i < source.TailLines.length; i++) {
                this.TailLines[i] = new String(source.TailLines[i]);
            }
        }
        if (source.HeaderInFile != null) {
            this.HeaderInFile = new Boolean(source.HeaderInFile);
        }
        if (source.HeaderColumns != null) {
            this.HeaderColumns = new String[source.HeaderColumns.length];
            for (int i = 0; i < source.HeaderColumns.length; i++) {
                this.HeaderColumns[i] = new String(source.HeaderColumns[i]);
            }
        }
        if (source.FileInfos != null) {
            this.FileInfos = new FileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new FileInfo(source.FileInfos[i]);
            }
        }
        if (source.ScenarioSet != null) {
            this.ScenarioSet = new Scenario[source.ScenarioSet.length];
            for (int i = 0; i < source.ScenarioSet.length; i++) {
                this.ScenarioSet[i] = new Scenario(source.ScenarioSet[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "LineCount", this.LineCount);
        this.setParamArraySimple(map, prefix + "HeadLines.", this.HeadLines);
        this.setParamArraySimple(map, prefix + "TailLines.", this.TailLines);
        this.setParamSimple(map, prefix + "HeaderInFile", this.HeaderInFile);
        this.setParamArraySimple(map, prefix + "HeaderColumns.", this.HeaderColumns);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArrayObj(map, prefix + "ScenarioSet.", this.ScenarioSet);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

