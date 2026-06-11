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

public class RelateVulInfo extends AbstractModel {

    /**
    * CVEid
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * Vulnerability name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Vulnerability tag
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Vulnerability level
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * CVSS score
    */
    @SerializedName("CVSS")
    @Expose
    private Float CVSS;

    /**
    * Vulnerability disclosure time
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * Vulnerability ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get CVEid 
     * @return CveId CVEid
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set CVEid
     * @param CveId CVEid
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
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
     * Get Vulnerability tag 
     * @return Label Vulnerability tag
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Vulnerability tag
     * @param Label Vulnerability tag
     */
    public void setLabel(String Label) {
        this.Label = Label;
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
     * Get CVSS score 
     * @return CVSS CVSS score
     */
    public Float getCVSS() {
        return this.CVSS;
    }

    /**
     * Set CVSS score
     * @param CVSS CVSS score
     */
    public void setCVSS(Float CVSS) {
        this.CVSS = CVSS;
    }

    /**
     * Get Vulnerability disclosure time 
     * @return PublishTime Vulnerability disclosure time
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set Vulnerability disclosure time
     * @param PublishTime Vulnerability disclosure time
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get Vulnerability ID 
     * @return Id Vulnerability ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Vulnerability ID
     * @param Id Vulnerability ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public RelateVulInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RelateVulInfo(RelateVulInfo source) {
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.CVSS != null) {
            this.CVSS = new Float(source.CVSS);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "CVSS", this.CVSS);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

