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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulBriefInfo extends AbstractModel {

    /**
    * Vulnerability ID (vul_vuls.id)
    */
    @SerializedName("VulID")
    @Expose
    private Long VulID;

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * CVE No.
Parameter format: e.g. CVE-2018-5377
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * List of VPR risk tags
    */
    @SerializedName("Label")
    @Expose
    private VPRLabel [] Label;

    /**
    * CVSS score
Valid values: [0.0, 10.0]
    */
    @SerializedName("CvssScore")
    @Expose
    private Float CvssScore;

    /**
    * Threat level
Enumeration value:
INVALID: invalid
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL: Critical
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Vulnerability disclosure time
Parameter format: YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
     * Get Vulnerability ID (vul_vuls.id) 
     * @return VulID Vulnerability ID (vul_vuls.id)
     */
    public Long getVulID() {
        return this.VulID;
    }

    /**
     * Set Vulnerability ID (vul_vuls.id)
     * @param VulID Vulnerability ID (vul_vuls.id)
     */
    public void setVulID(Long VulID) {
        this.VulID = VulID;
    }

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
     * Get CVE No.
Parameter format: e.g. CVE-2018-5377 
     * @return CVEID CVE No.
Parameter format: e.g. CVE-2018-5377
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set CVE No.
Parameter format: e.g. CVE-2018-5377
     * @param CVEID CVE No.
Parameter format: e.g. CVE-2018-5377
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    /**
     * Get List of VPR risk tags 
     * @return Label List of VPR risk tags
     */
    public VPRLabel [] getLabel() {
        return this.Label;
    }

    /**
     * Set List of VPR risk tags
     * @param Label List of VPR risk tags
     */
    public void setLabel(VPRLabel [] Label) {
        this.Label = Label;
    }

    /**
     * Get CVSS score
Valid values: [0.0, 10.0] 
     * @return CvssScore CVSS score
Valid values: [0.0, 10.0]
     */
    public Float getCvssScore() {
        return this.CvssScore;
    }

    /**
     * Set CVSS score
Valid values: [0.0, 10.0]
     * @param CvssScore CVSS score
Valid values: [0.0, 10.0]
     */
    public void setCvssScore(Float CvssScore) {
        this.CvssScore = CvssScore;
    }

    /**
     * Get Threat level
Enumeration value:
INVALID: invalid
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL: Critical 
     * @return Level Threat level
Enumeration value:
INVALID: invalid
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL: Critical
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Threat level
Enumeration value:
INVALID: invalid
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL: Critical
     * @param Level Threat level
Enumeration value:
INVALID: invalid
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL: Critical
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Vulnerability disclosure time
Parameter format: YYYY-MM-DD HH:mm:ss 
     * @return PublishTime Vulnerability disclosure time
Parameter format: YYYY-MM-DD HH:mm:ss
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set Vulnerability disclosure time
Parameter format: YYYY-MM-DD HH:mm:ss
     * @param PublishTime Vulnerability disclosure time
Parameter format: YYYY-MM-DD HH:mm:ss
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    public VulBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulBriefInfo(VulBriefInfo source) {
        if (source.VulID != null) {
            this.VulID = new Long(source.VulID);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.Label != null) {
            this.Label = new VPRLabel[source.Label.length];
            for (int i = 0; i < source.Label.length; i++) {
                this.Label[i] = new VPRLabel(source.Label[i]);
            }
        }
        if (source.CvssScore != null) {
            this.CvssScore = new Float(source.CvssScore);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulID", this.VulID);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamArrayObj(map, prefix + "Label.", this.Label);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);

    }
}

