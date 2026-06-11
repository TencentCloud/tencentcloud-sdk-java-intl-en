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
    private Long RiskLevel;

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
    * Remediation Suggestions
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * Size
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

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
    * File md5
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * File name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Detection platform
1: Cloud Killing Engine
2: tav
3: binaryAi
4: Abnormal behavior
5: Threat Intelligence
    */
    @SerializedName("CheckPlatform")
    @Expose
    private String [] CheckPlatform;

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
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level
     * @param RiskLevel Risk level
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
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
     * Get Remediation Suggestions 
     * @return Solution Remediation Suggestions
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set Remediation Suggestions
     * @param Solution Remediation Suggestions
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get Size 
     * @return Size Size
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Size
     * @param Size Size
     */
    public void setSize(Long Size) {
        this.Size = Size;
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

    /**
     * Get File md5 
     * @return Md5 File md5
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set File md5
     * @param Md5 File md5
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get File name 
     * @return FileName File name
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File name
     * @param FileName File name
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Detection platform
1: Cloud Killing Engine
2: tav
3: binaryAi
4: Abnormal behavior
5: Threat Intelligence 
     * @return CheckPlatform Detection platform
1: Cloud Killing Engine
2: tav
3: binaryAi
4: Abnormal behavior
5: Threat Intelligence
     */
    public String [] getCheckPlatform() {
        return this.CheckPlatform;
    }

    /**
     * Set Detection platform
1: Cloud Killing Engine
2: tav
3: binaryAi
4: Abnormal behavior
5: Threat Intelligence
     * @param CheckPlatform Detection platform
1: Cloud Killing Engine
2: tav
3: binaryAi
4: Abnormal behavior
5: Threat Intelligence
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

