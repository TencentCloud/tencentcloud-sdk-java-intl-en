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
    * Path.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Risk level
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * category
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Virus name
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Solution
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * File type
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * File path
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File md5
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * Size
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * First detection time
    */
    @SerializedName("FirstScanTime")
    @Expose
    private String FirstScanTime;

    /**
    * Last scan time
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
     * Get Path. 
     * @return Path Path.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path.
     * @param Path Path.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Risk level 
     * @return RiskLevel Risk level
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level
     * @param RiskLevel Risk level
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get category 
     * @return Category category
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set category
     * @param Category category
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Virus name 
     * @return VirusName Virus name
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set Virus name
     * @param VirusName Virus name
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get Tag. 
     * @return Tags Tag.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
     * @param Tags Tag.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Description 
     * @return Desc Description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description
     * @param Desc Description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Solution 
     * @return Solution Solution
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set Solution
     * @param Solution Solution
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get File type 
     * @return FileType File type
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type
     * @param FileType File type
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get File path 
     * @return FileName File path
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File path
     * @param FileName File path
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File md5 
     * @return FileMd5 File md5
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set File md5
     * @param FileMd5 File md5
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get Size 
     * @return FileSize Size
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set Size
     * @param FileSize Size
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get First detection time 
     * @return FirstScanTime First detection time
     */
    public String getFirstScanTime() {
        return this.FirstScanTime;
    }

    /**
     * Set First detection time
     * @param FirstScanTime First detection time
     */
    public void setFirstScanTime(String FirstScanTime) {
        this.FirstScanTime = FirstScanTime;
    }

    /**
     * Get Last scan time 
     * @return LatestScanTime Last scan time
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set Last scan time
     * @param LatestScanTime Last scan time
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

