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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFileRequest extends AbstractModel {

    /**
    * File ID. Its value should be the corresponding directory of the file in the COS bucket after it has been uploaded in the previous step.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

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
    * File type. The 'folder' represents a folder; if not specified, it represents a file.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Number of Rows.
    */
    @SerializedName("LineCount")
    @Expose
    private Long LineCount;

    /**
    * First few rows of file.
    */
    @SerializedName("HeadLines")
    @Expose
    private String [] HeadLines;

    /**
    * Last few rows of file.
    */
    @SerializedName("TailLines")
    @Expose
    private String [] TailLines;

    /**
    * Whether the header is in the file.
    */
    @SerializedName("HeaderInFile")
    @Expose
    private Boolean HeaderInFile;

    /**
    * Header.
    */
    @SerializedName("HeaderColumns")
    @Expose
    private String [] HeaderColumns;

    /**
    * Files in the folder.
    */
    @SerializedName("FileInfos")
    @Expose
    private FileInfo [] FileInfos;

    /**
     * Get File ID. Its value should be the corresponding directory of the file in the COS bucket after it has been uploaded in the previous step. 
     * @return FileId File ID. Its value should be the corresponding directory of the file in the COS bucket after it has been uploaded in the previous step.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set File ID. Its value should be the corresponding directory of the file in the COS bucket after it has been uploaded in the previous step.
     * @param FileId File ID. Its value should be the corresponding directory of the file in the COS bucket after it has been uploaded in the previous step.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get File type. The 'folder' represents a folder; if not specified, it represents a file. 
     * @return Type File type. The 'folder' represents a folder; if not specified, it represents a file.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set File type. The 'folder' represents a folder; if not specified, it represents a file.
     * @param Type File type. The 'folder' represents a folder; if not specified, it represents a file.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Number of Rows. 
     * @return LineCount Number of Rows.
     */
    public Long getLineCount() {
        return this.LineCount;
    }

    /**
     * Set Number of Rows.
     * @param LineCount Number of Rows.
     */
    public void setLineCount(Long LineCount) {
        this.LineCount = LineCount;
    }

    /**
     * Get First few rows of file. 
     * @return HeadLines First few rows of file.
     */
    public String [] getHeadLines() {
        return this.HeadLines;
    }

    /**
     * Set First few rows of file.
     * @param HeadLines First few rows of file.
     */
    public void setHeadLines(String [] HeadLines) {
        this.HeadLines = HeadLines;
    }

    /**
     * Get Last few rows of file. 
     * @return TailLines Last few rows of file.
     */
    public String [] getTailLines() {
        return this.TailLines;
    }

    /**
     * Set Last few rows of file.
     * @param TailLines Last few rows of file.
     */
    public void setTailLines(String [] TailLines) {
        this.TailLines = TailLines;
    }

    /**
     * Get Whether the header is in the file. 
     * @return HeaderInFile Whether the header is in the file.
     */
    public Boolean getHeaderInFile() {
        return this.HeaderInFile;
    }

    /**
     * Set Whether the header is in the file.
     * @param HeaderInFile Whether the header is in the file.
     */
    public void setHeaderInFile(Boolean HeaderInFile) {
        this.HeaderInFile = HeaderInFile;
    }

    /**
     * Get Header. 
     * @return HeaderColumns Header.
     */
    public String [] getHeaderColumns() {
        return this.HeaderColumns;
    }

    /**
     * Set Header.
     * @param HeaderColumns Header.
     */
    public void setHeaderColumns(String [] HeaderColumns) {
        this.HeaderColumns = HeaderColumns;
    }

    /**
     * Get Files in the folder. 
     * @return FileInfos Files in the folder.
     */
    public FileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set Files in the folder.
     * @param FileInfos Files in the folder.
     */
    public void setFileInfos(FileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    public CreateFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileRequest(CreateFileRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "LineCount", this.LineCount);
        this.setParamArraySimple(map, prefix + "HeadLines.", this.HeadLines);
        this.setParamArraySimple(map, prefix + "TailLines.", this.TailLines);
        this.setParamSimple(map, prefix + "HeaderInFile", this.HeaderInFile);
        this.setParamArraySimple(map, prefix + "HeaderColumns.", this.HeaderColumns);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);

    }
}

