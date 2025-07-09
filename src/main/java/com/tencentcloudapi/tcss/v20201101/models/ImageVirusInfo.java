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

public class ImageVirusInfo extends AbstractModel {

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
    private Long RiskLevel;

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
    * Fix suggestion
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * Size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

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
    * MD5 checksum of the file
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * Filename
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Check platform
`1`: Tencent Cloud Security Engine.
`2`: tav.
`3`: binaryAi.
`4`: Unusual behavior.
`5`: Threat intelligence.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckPlatform")
    @Expose
    private String [] CheckPlatform;

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
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskLevel Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
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
     * Get Fix suggestion
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Solution Fix suggestion
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set Fix suggestion
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Solution Fix suggestion
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get Size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Size Size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Size Size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSize(Long Size) {
        this.Size = Size;
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

    /**
     * Get MD5 checksum of the file
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Md5 MD5 checksum of the file
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set MD5 checksum of the file
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Md5 MD5 checksum of the file
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get Filename
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileName Filename
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileName Filename
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Check platform
`1`: Tencent Cloud Security Engine.
`2`: tav.
`3`: binaryAi.
`4`: Unusual behavior.
`5`: Threat intelligence.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckPlatform Check platform
`1`: Tencent Cloud Security Engine.
`2`: tav.
`3`: binaryAi.
`4`: Unusual behavior.
`5`: Threat intelligence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getCheckPlatform() {
        return this.CheckPlatform;
    }

    /**
     * Set Check platform
`1`: Tencent Cloud Security Engine.
`2`: tav.
`3`: binaryAi.
`4`: Unusual behavior.
`5`: Threat intelligence.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckPlatform Check platform
`1`: Tencent Cloud Security Engine.
`2`: tav.
`3`: binaryAi.
`4`: Unusual behavior.
`5`: Threat intelligence.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckPlatform(String [] CheckPlatform) {
        this.CheckPlatform = CheckPlatform;
    }

    public ImageVirusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageVirusInfo(ImageVirusInfo source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
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
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.FirstScanTime != null) {
            this.FirstScanTime = new String(source.FirstScanTime);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.CheckPlatform != null) {
            this.CheckPlatform = new String[source.CheckPlatform.length];
            for (int i = 0; i < source.CheckPlatform.length; i++) {
                this.CheckPlatform[i] = new String(source.CheckPlatform[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "FirstScanTime", this.FirstScanTime);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamArraySimple(map, prefix + "CheckPlatform.", this.CheckPlatform);

    }
}

