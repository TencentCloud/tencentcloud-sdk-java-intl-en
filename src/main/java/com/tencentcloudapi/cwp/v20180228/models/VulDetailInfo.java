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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulDetailInfo extends AbstractModel {

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Vulnerability level
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Vulnerability name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * CVE ID
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities; 0: emergency vulnerabilities
    */
    @SerializedName("VulCategory")
    @Expose
    private Long VulCategory;

    /**
    * Vulnerability description
    */
    @SerializedName("Descript")
    @Expose
    private String Descript;

    /**
    * Fixing suggestion
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * Reference link
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * CVSS score
    */
    @SerializedName("CvssScore")
    @Expose
    private Float CvssScore;

    /**
    * CVSS details
    */
    @SerializedName("Cvss")
    @Expose
    private String Cvss;

    /**
    * Release time
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
     * Get Vulnerability ID 
     * @return VulId Vulnerability ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID
     * @param VulId Vulnerability ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Vulnerability level 
     * @return Level Vulnerability level
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Vulnerability level
     * @param Level Vulnerability level
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Vulnerability name 
     * @return Name Vulnerability name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Vulnerability name
     * @param Name Vulnerability name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get CVE ID 
     * @return CveId CVE ID
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set CVE ID
     * @param CveId CVE ID
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities; 0: emergency vulnerabilities 
     * @return VulCategory 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities; 0: emergency vulnerabilities
     */
    public Long getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities; 0: emergency vulnerabilities
     * @param VulCategory 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities; 0: emergency vulnerabilities
     */
    public void setVulCategory(Long VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get Vulnerability description 
     * @return Descript Vulnerability description
     */
    public String getDescript() {
        return this.Descript;
    }

    /**
     * Set Vulnerability description
     * @param Descript Vulnerability description
     */
    public void setDescript(String Descript) {
        this.Descript = Descript;
    }

    /**
     * Get Fixing suggestion 
     * @return Fix Fixing suggestion
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set Fixing suggestion
     * @param Fix Fixing suggestion
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get Reference link 
     * @return Reference Reference link
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set Reference link
     * @param Reference Reference link
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get CVSS score 
     * @return CvssScore CVSS score
     */
    public Float getCvssScore() {
        return this.CvssScore;
    }

    /**
     * Set CVSS score
     * @param CvssScore CVSS score
     */
    public void setCvssScore(Float CvssScore) {
        this.CvssScore = CvssScore;
    }

    /**
     * Get CVSS details 
     * @return Cvss CVSS details
     */
    public String getCvss() {
        return this.Cvss;
    }

    /**
     * Set CVSS details
     * @param Cvss CVSS details
     */
    public void setCvss(String Cvss) {
        this.Cvss = Cvss;
    }

    /**
     * Get Release time 
     * @return PublishTime Release time
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set Release time
     * @param PublishTime Release time
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    public VulDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDetailInfo(VulDetailInfo source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new Long(source.VulCategory);
        }
        if (source.Descript != null) {
            this.Descript = new String(source.Descript);
        }
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.Reference != null) {
            this.Reference = new String(source.Reference);
        }
        if (source.CvssScore != null) {
            this.CvssScore = new Float(source.CvssScore);
        }
        if (source.Cvss != null) {
            this.Cvss = new String(source.Cvss);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);
        this.setParamSimple(map, prefix + "Descript", this.Descript);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamSimple(map, prefix + "Cvss", this.Cvss);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);

    }
}

