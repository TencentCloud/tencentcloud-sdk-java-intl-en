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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageVirus extends AbstractModel {

    /**
    * Path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Risk level
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Category
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Virus name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * Tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Solution
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * File type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * File path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * MD5 checksum of the file
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * Size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * First discovery time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstScanTime")
    @Expose
    private String FirstScanTime;

    /**
    * Last scan time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
     * Get Path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Path Path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Path Path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Risk level
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskLevel Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskLevel Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Category
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Category Category
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Category
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Category Category
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Virus name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VirusName Virus name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set Virus name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VirusName Virus name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get Tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Desc Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Desc Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Solution
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Solution Solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set Solution
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Solution Solution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get File type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileType File type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileType File type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get File path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileName File path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileName File path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get MD5 checksum of the file
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileMd5 MD5 checksum of the file
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set MD5 checksum of the file
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileMd5 MD5 checksum of the file
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get Size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileSize Size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set Size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileSize Size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get First discovery time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstScanTime First discovery time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstScanTime() {
        return this.FirstScanTime;
    }

    /**
     * Set First discovery time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstScanTime First discovery time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstScanTime(String FirstScanTime) {
        this.FirstScanTime = FirstScanTime;
    }

    /**
     * Get Last scan time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LatestScanTime Last scan time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set Last scan time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LatestScanTime Last scan time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    public ImageVirus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageVirus(ImageVirus source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.FirstScanTime != null) {
            this.FirstScanTime = new String(source.FirstScanTime);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FirstScanTime", this.FirstScanTime);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);

    }
}

