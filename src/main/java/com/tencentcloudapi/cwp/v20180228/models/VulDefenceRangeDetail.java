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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulDefenceRangeDetail extends AbstractModel {

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Tag
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Vulnerability level. 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * CVSS score
    */
    @SerializedName("CvssScore")
    @Expose
    private Float CvssScore;

    /**
    * cve id
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * Release time
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
     * Get Vulnerability name 
     * @return VulName Vulnerability name
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name
     * @param VulName Vulnerability name
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Tag 
     * @return Label Tag
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag
     * @param Label Tag
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Vulnerability level. 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical. 
     * @return Level Vulnerability level. 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Vulnerability level. 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical.
     * @param Level Vulnerability level. 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
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
     * Get cve id 
     * @return CveId cve id
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set cve id
     * @param CveId cve id
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
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

    public VulDefenceRangeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefenceRangeDetail(VulDefenceRangeDetail source) {
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.CvssScore != null) {
            this.CvssScore = new Float(source.CvssScore);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "VulId", this.VulId);

    }
}

