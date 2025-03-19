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

public class TestData extends AbstractModel {

    /**
    * File name of the test dataset.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether the dataset is sharded.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Split")
    @Expose
    private Boolean Split;

    /**
    * Whether the first row is parameter name.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("HeaderInFile")
    @Expose
    private Boolean HeaderInFile;

    /**
    * Array of parameter name.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("HeaderColumns")
    @Expose
    private String [] HeaderColumns;

    /**
    * Number of file lines.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("LineCount")
    @Expose
    private Long LineCount;

    /**
    * Update time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * File size.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * First few rows of dataset.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("HeadLines")
    @Expose
    private String [] HeadLines;

    /**
    * Last few rows of dataset.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("TailLines")
    @Expose
    private String [] TailLines;

    /**
    * File type.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * File ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get File name of the test dataset.

Note: This field may return null, indicating that no valid value is found. 
     * @return Name File name of the test dataset.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set File name of the test dataset.

Note: This field may return null, indicating that no valid value is found.
     * @param Name File name of the test dataset.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether the dataset is sharded.

Note: This field may return null, indicating that no valid value is found. 
     * @return Split Whether the dataset is sharded.

Note: This field may return null, indicating that no valid value is found.
     */
    public Boolean getSplit() {
        return this.Split;
    }

    /**
     * Set Whether the dataset is sharded.

Note: This field may return null, indicating that no valid value is found.
     * @param Split Whether the dataset is sharded.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setSplit(Boolean Split) {
        this.Split = Split;
    }

    /**
     * Get Whether the first row is parameter name.

Note: This field may return null, indicating that no valid value is found. 
     * @return HeaderInFile Whether the first row is parameter name.

Note: This field may return null, indicating that no valid value is found.
     */
    public Boolean getHeaderInFile() {
        return this.HeaderInFile;
    }

    /**
     * Set Whether the first row is parameter name.

Note: This field may return null, indicating that no valid value is found.
     * @param HeaderInFile Whether the first row is parameter name.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setHeaderInFile(Boolean HeaderInFile) {
        this.HeaderInFile = HeaderInFile;
    }

    /**
     * Get Array of parameter name.

Note: This field may return null, indicating that no valid value is found. 
     * @return HeaderColumns Array of parameter name.

Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getHeaderColumns() {
        return this.HeaderColumns;
    }

    /**
     * Set Array of parameter name.

Note: This field may return null, indicating that no valid value is found.
     * @param HeaderColumns Array of parameter name.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setHeaderColumns(String [] HeaderColumns) {
        this.HeaderColumns = HeaderColumns;
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
     * Get Update time.

Note: This field may return null, indicating that no valid value is found. 
     * @return UpdatedAt Update time.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time.

Note: This field may return null, indicating that no valid value is found.
     * @param UpdatedAt Update time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get File size.

Note: This field may return null, indicating that no valid value is found. 
     * @return Size File size.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set File size.

Note: This field may return null, indicating that no valid value is found.
     * @param Size File size.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get First few rows of dataset.

Note: This field may return null, indicating that no valid value is found. 
     * @return HeadLines First few rows of dataset.

Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getHeadLines() {
        return this.HeadLines;
    }

    /**
     * Set First few rows of dataset.

Note: This field may return null, indicating that no valid value is found.
     * @param HeadLines First few rows of dataset.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setHeadLines(String [] HeadLines) {
        this.HeadLines = HeadLines;
    }

    /**
     * Get Last few rows of dataset.

Note: This field may return null, indicating that no valid value is found. 
     * @return TailLines Last few rows of dataset.

Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getTailLines() {
        return this.TailLines;
    }

    /**
     * Set Last few rows of dataset.

Note: This field may return null, indicating that no valid value is found.
     * @param TailLines Last few rows of dataset.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setTailLines(String [] TailLines) {
        this.TailLines = TailLines;
    }

    /**
     * Get File type.

Note: This field may return null, indicating that no valid value is found. 
     * @return Type File type.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set File type.

Note: This field may return null, indicating that no valid value is found.
     * @param Type File type.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get File ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return FileId File ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set File ID.

Note: This field may return null, indicating that no valid value is found.
     * @param FileId File ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public TestData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TestData(TestData source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Split != null) {
            this.Split = new Boolean(source.Split);
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
        if (source.LineCount != null) {
            this.LineCount = new Long(source.LineCount);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
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
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Split", this.Split);
        this.setParamSimple(map, prefix + "HeaderInFile", this.HeaderInFile);
        this.setParamArraySimple(map, prefix + "HeaderColumns.", this.HeaderColumns);
        this.setParamSimple(map, prefix + "LineCount", this.LineCount);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamArraySimple(map, prefix + "HeadLines.", this.HeadLines);
        this.setParamArraySimple(map, prefix + "TailLines.", this.TailLines);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

