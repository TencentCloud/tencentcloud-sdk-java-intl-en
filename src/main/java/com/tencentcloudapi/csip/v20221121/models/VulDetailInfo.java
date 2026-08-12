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

public class VulDetailInfo extends AbstractModel {

    /**
    * <p>Vulnerability ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Vulnerability name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>CveID</p>
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * Vulnerability category
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows systems patch
WEB_CMS: Web-CMS vulnerabilities
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Vulnerability disclosure time
Parameter format: YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * <p>Detection mode</p><p>Enumeration value:</p><ul><li>VersionCompare: Version comparison</li><li>POC: POC detection</li></ul>
    */
    @SerializedName("CheckMethod")
    @Expose
    private String CheckMethod;

    /**
    * Vulnerability defense status
Enumeration values:
ENABLED: On
NOT_SUPPORTED: Not supported
NOT_ENABLED: not enabled
    */
    @SerializedName("DefendStatus")
    @Expose
    private String DefendStatus;

    /**
    * Whether one-click repair is supported
Enumeration values:
true: Support
false: Not supported
    */
    @SerializedName("SupportFix")
    @Expose
    private Boolean SupportFix;

    /**
    * VPR rating information (including rating result, description, and phased score)
    */
    @SerializedName("VRPRatingInfo")
    @Expose
    private VPRRatingInfo VRPRatingInfo;

    /**
    * CVSS score
Valid values: [0.0, 10.0]
    */
    @SerializedName("CvssScore")
    @Expose
    private Float CvssScore;

    /**
    * VPR risk tag list (such as exploitation in the wild, EXP available, POC available, public network exposure, no restart required)
    */
    @SerializedName("Label")
    @Expose
    private VPRLabel [] Label;

    /**
    * Vulnerability remark
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Vulnerability overview
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * Number of hosts with vulnerability protection enabled
    */
    @SerializedName("DefendHostCount")
    @Expose
    private Long DefendHostCount;

    /**
    * Number of hosts with vulnerability defense disabled
    */
    @SerializedName("NotDefendHostCount")
    @Expose
    private Long NotDefendHostCount;

    /**
    * Last scan time
Parameter format: YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * CVSS severity level
Enumeration values:
INVALID: Invalid
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL
    */
    @SerializedName("CVSSLevel")
    @Expose
    private String CVSSLevel;

    /**
    * Description list of affected software (each item such as openssl < 1.1.1k)
    */
    @SerializedName("VulAffect")
    @Expose
    private String [] VulAffect;

    /**
    * Whether included in the KVE (Known Vulnerability Exploitation) library
Enumeration values:
true: Recorded
false: Not recorded
    */
    @SerializedName("KVERecord")
    @Expose
    private Boolean KVERecord;

    /**
    * KVE collection time
Parameter format: YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("KVERecordTime")
    @Expose
    private String KVERecordTime;

    /**
    * EPSS score (vulnerability type probability prediction)
Valid values: [0.0, 1.0]
    */
    @SerializedName("EPSSScore")
    @Expose
    private Float EPSSScore;

    /**
    * Affected vendor list
    */
    @SerializedName("AffectVendor")
    @Expose
    private String [] AffectVendor;

    /**
    * List of affected products
    */
    @SerializedName("AffectProduct")
    @Expose
    private String [] AffectProduct;

    /**
    * Vulnerability type mechanism description
    */
    @SerializedName("Mechanism")
    @Expose
    private String Mechanism;

    /**
    * Pre-deployment instructions for vulnerability type
    */
    @SerializedName("Precondition")
    @Expose
    private String Precondition;

    /**
    * Latest vulnerability spread trend data list (by date)
    */
    @SerializedName("LatestTrend")
    @Expose
    private VulSpreadTrend [] LatestTrend;

    /**
    * <p>Solution</p>
    */
    @SerializedName("FixSolution")
    @Expose
    private String FixSolution;

    /**
    * <p>Reference link</p>
    */
    @SerializedName("RefLink")
    @Expose
    private String RefLink;

    /**
    * <p>Vulnerability severity description</p>
    */
    @SerializedName("HarmDescription")
    @Expose
    private String HarmDescription;

    /**
    * <p>Vulnerability Impact product</p>
    */
    @SerializedName("AffectVendorProduct")
    @Expose
    private VulVendorProduct [] AffectVendorProduct;

    /**
     * Get <p>Vulnerability ID</p> 
     * @return ID <p>Vulnerability ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Vulnerability ID</p>
     * @param ID <p>Vulnerability ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Vulnerability name</p> 
     * @return Name <p>Vulnerability name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Vulnerability name</p>
     * @param Name <p>Vulnerability name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>CveID</p> 
     * @return CVEID <p>CveID</p>
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set <p>CveID</p>
     * @param CVEID <p>CveID</p>
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    /**
     * Get Vulnerability category
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows systems patch
WEB_CMS: Web-CMS vulnerabilities
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability 
     * @return Category Vulnerability category
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows systems patch
WEB_CMS: Web-CMS vulnerabilities
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Vulnerability category
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows systems patch
WEB_CMS: Web-CMS vulnerabilities
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
     * @param Category Vulnerability category
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows systems patch
WEB_CMS: Web-CMS vulnerabilities
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
     */
    public void setCategory(String Category) {
        this.Category = Category;
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

    /**
     * Get <p>Detection mode</p><p>Enumeration value:</p><ul><li>VersionCompare: Version comparison</li><li>POC: POC detection</li></ul> 
     * @return CheckMethod <p>Detection mode</p><p>Enumeration value:</p><ul><li>VersionCompare: Version comparison</li><li>POC: POC detection</li></ul>
     */
    public String getCheckMethod() {
        return this.CheckMethod;
    }

    /**
     * Set <p>Detection mode</p><p>Enumeration value:</p><ul><li>VersionCompare: Version comparison</li><li>POC: POC detection</li></ul>
     * @param CheckMethod <p>Detection mode</p><p>Enumeration value:</p><ul><li>VersionCompare: Version comparison</li><li>POC: POC detection</li></ul>
     */
    public void setCheckMethod(String CheckMethod) {
        this.CheckMethod = CheckMethod;
    }

    /**
     * Get Vulnerability defense status
Enumeration values:
ENABLED: On
NOT_SUPPORTED: Not supported
NOT_ENABLED: not enabled 
     * @return DefendStatus Vulnerability defense status
Enumeration values:
ENABLED: On
NOT_SUPPORTED: Not supported
NOT_ENABLED: not enabled
     */
    public String getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set Vulnerability defense status
Enumeration values:
ENABLED: On
NOT_SUPPORTED: Not supported
NOT_ENABLED: not enabled
     * @param DefendStatus Vulnerability defense status
Enumeration values:
ENABLED: On
NOT_SUPPORTED: Not supported
NOT_ENABLED: not enabled
     */
    public void setDefendStatus(String DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    /**
     * Get Whether one-click repair is supported
Enumeration values:
true: Support
false: Not supported 
     * @return SupportFix Whether one-click repair is supported
Enumeration values:
true: Support
false: Not supported
     */
    public Boolean getSupportFix() {
        return this.SupportFix;
    }

    /**
     * Set Whether one-click repair is supported
Enumeration values:
true: Support
false: Not supported
     * @param SupportFix Whether one-click repair is supported
Enumeration values:
true: Support
false: Not supported
     */
    public void setSupportFix(Boolean SupportFix) {
        this.SupportFix = SupportFix;
    }

    /**
     * Get VPR rating information (including rating result, description, and phased score) 
     * @return VRPRatingInfo VPR rating information (including rating result, description, and phased score)
     */
    public VPRRatingInfo getVRPRatingInfo() {
        return this.VRPRatingInfo;
    }

    /**
     * Set VPR rating information (including rating result, description, and phased score)
     * @param VRPRatingInfo VPR rating information (including rating result, description, and phased score)
     */
    public void setVRPRatingInfo(VPRRatingInfo VRPRatingInfo) {
        this.VRPRatingInfo = VRPRatingInfo;
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
     * Get VPR risk tag list (such as exploitation in the wild, EXP available, POC available, public network exposure, no restart required) 
     * @return Label VPR risk tag list (such as exploitation in the wild, EXP available, POC available, public network exposure, no restart required)
     */
    public VPRLabel [] getLabel() {
        return this.Label;
    }

    /**
     * Set VPR risk tag list (such as exploitation in the wild, EXP available, POC available, public network exposure, no restart required)
     * @param Label VPR risk tag list (such as exploitation in the wild, EXP available, POC available, public network exposure, no restart required)
     */
    public void setLabel(VPRLabel [] Label) {
        this.Label = Label;
    }

    /**
     * Get Vulnerability remark 
     * @return Remark Vulnerability remark
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Vulnerability remark
     * @param Remark Vulnerability remark
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Vulnerability overview 
     * @return Summary Vulnerability overview
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set Vulnerability overview
     * @param Summary Vulnerability overview
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get Number of hosts with vulnerability protection enabled 
     * @return DefendHostCount Number of hosts with vulnerability protection enabled
     */
    public Long getDefendHostCount() {
        return this.DefendHostCount;
    }

    /**
     * Set Number of hosts with vulnerability protection enabled
     * @param DefendHostCount Number of hosts with vulnerability protection enabled
     */
    public void setDefendHostCount(Long DefendHostCount) {
        this.DefendHostCount = DefendHostCount;
    }

    /**
     * Get Number of hosts with vulnerability defense disabled 
     * @return NotDefendHostCount Number of hosts with vulnerability defense disabled
     */
    public Long getNotDefendHostCount() {
        return this.NotDefendHostCount;
    }

    /**
     * Set Number of hosts with vulnerability defense disabled
     * @param NotDefendHostCount Number of hosts with vulnerability defense disabled
     */
    public void setNotDefendHostCount(Long NotDefendHostCount) {
        this.NotDefendHostCount = NotDefendHostCount;
    }

    /**
     * Get Last scan time
Parameter format: YYYY-MM-DD HH:mm:ss 
     * @return LatestScanTime Last scan time
Parameter format: YYYY-MM-DD HH:mm:ss
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set Last scan time
Parameter format: YYYY-MM-DD HH:mm:ss
     * @param LatestScanTime Last scan time
Parameter format: YYYY-MM-DD HH:mm:ss
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get CVSS severity level
Enumeration values:
INVALID: Invalid
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL 
     * @return CVSSLevel CVSS severity level
Enumeration values:
INVALID: Invalid
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL
     */
    public String getCVSSLevel() {
        return this.CVSSLevel;
    }

    /**
     * Set CVSS severity level
Enumeration values:
INVALID: Invalid
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL
     * @param CVSSLevel CVSS severity level
Enumeration values:
INVALID: Invalid
INFO: Notification
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL
     */
    public void setCVSSLevel(String CVSSLevel) {
        this.CVSSLevel = CVSSLevel;
    }

    /**
     * Get Description list of affected software (each item such as openssl < 1.1.1k) 
     * @return VulAffect Description list of affected software (each item such as openssl < 1.1.1k)
     */
    public String [] getVulAffect() {
        return this.VulAffect;
    }

    /**
     * Set Description list of affected software (each item such as openssl < 1.1.1k)
     * @param VulAffect Description list of affected software (each item such as openssl < 1.1.1k)
     */
    public void setVulAffect(String [] VulAffect) {
        this.VulAffect = VulAffect;
    }

    /**
     * Get Whether included in the KVE (Known Vulnerability Exploitation) library
Enumeration values:
true: Recorded
false: Not recorded 
     * @return KVERecord Whether included in the KVE (Known Vulnerability Exploitation) library
Enumeration values:
true: Recorded
false: Not recorded
     */
    public Boolean getKVERecord() {
        return this.KVERecord;
    }

    /**
     * Set Whether included in the KVE (Known Vulnerability Exploitation) library
Enumeration values:
true: Recorded
false: Not recorded
     * @param KVERecord Whether included in the KVE (Known Vulnerability Exploitation) library
Enumeration values:
true: Recorded
false: Not recorded
     */
    public void setKVERecord(Boolean KVERecord) {
        this.KVERecord = KVERecord;
    }

    /**
     * Get KVE collection time
Parameter format: YYYY-MM-DD HH:mm:ss 
     * @return KVERecordTime KVE collection time
Parameter format: YYYY-MM-DD HH:mm:ss
     */
    public String getKVERecordTime() {
        return this.KVERecordTime;
    }

    /**
     * Set KVE collection time
Parameter format: YYYY-MM-DD HH:mm:ss
     * @param KVERecordTime KVE collection time
Parameter format: YYYY-MM-DD HH:mm:ss
     */
    public void setKVERecordTime(String KVERecordTime) {
        this.KVERecordTime = KVERecordTime;
    }

    /**
     * Get EPSS score (vulnerability type probability prediction)
Valid values: [0.0, 1.0] 
     * @return EPSSScore EPSS score (vulnerability type probability prediction)
Valid values: [0.0, 1.0]
     */
    public Float getEPSSScore() {
        return this.EPSSScore;
    }

    /**
     * Set EPSS score (vulnerability type probability prediction)
Valid values: [0.0, 1.0]
     * @param EPSSScore EPSS score (vulnerability type probability prediction)
Valid values: [0.0, 1.0]
     */
    public void setEPSSScore(Float EPSSScore) {
        this.EPSSScore = EPSSScore;
    }

    /**
     * Get Affected vendor list 
     * @return AffectVendor Affected vendor list
     */
    public String [] getAffectVendor() {
        return this.AffectVendor;
    }

    /**
     * Set Affected vendor list
     * @param AffectVendor Affected vendor list
     */
    public void setAffectVendor(String [] AffectVendor) {
        this.AffectVendor = AffectVendor;
    }

    /**
     * Get List of affected products 
     * @return AffectProduct List of affected products
     */
    public String [] getAffectProduct() {
        return this.AffectProduct;
    }

    /**
     * Set List of affected products
     * @param AffectProduct List of affected products
     */
    public void setAffectProduct(String [] AffectProduct) {
        this.AffectProduct = AffectProduct;
    }

    /**
     * Get Vulnerability type mechanism description 
     * @return Mechanism Vulnerability type mechanism description
     */
    public String getMechanism() {
        return this.Mechanism;
    }

    /**
     * Set Vulnerability type mechanism description
     * @param Mechanism Vulnerability type mechanism description
     */
    public void setMechanism(String Mechanism) {
        this.Mechanism = Mechanism;
    }

    /**
     * Get Pre-deployment instructions for vulnerability type 
     * @return Precondition Pre-deployment instructions for vulnerability type
     */
    public String getPrecondition() {
        return this.Precondition;
    }

    /**
     * Set Pre-deployment instructions for vulnerability type
     * @param Precondition Pre-deployment instructions for vulnerability type
     */
    public void setPrecondition(String Precondition) {
        this.Precondition = Precondition;
    }

    /**
     * Get Latest vulnerability spread trend data list (by date) 
     * @return LatestTrend Latest vulnerability spread trend data list (by date)
     */
    public VulSpreadTrend [] getLatestTrend() {
        return this.LatestTrend;
    }

    /**
     * Set Latest vulnerability spread trend data list (by date)
     * @param LatestTrend Latest vulnerability spread trend data list (by date)
     */
    public void setLatestTrend(VulSpreadTrend [] LatestTrend) {
        this.LatestTrend = LatestTrend;
    }

    /**
     * Get <p>Solution</p> 
     * @return FixSolution <p>Solution</p>
     */
    public String getFixSolution() {
        return this.FixSolution;
    }

    /**
     * Set <p>Solution</p>
     * @param FixSolution <p>Solution</p>
     */
    public void setFixSolution(String FixSolution) {
        this.FixSolution = FixSolution;
    }

    /**
     * Get <p>Reference link</p> 
     * @return RefLink <p>Reference link</p>
     */
    public String getRefLink() {
        return this.RefLink;
    }

    /**
     * Set <p>Reference link</p>
     * @param RefLink <p>Reference link</p>
     */
    public void setRefLink(String RefLink) {
        this.RefLink = RefLink;
    }

    /**
     * Get <p>Vulnerability severity description</p> 
     * @return HarmDescription <p>Vulnerability severity description</p>
     */
    public String getHarmDescription() {
        return this.HarmDescription;
    }

    /**
     * Set <p>Vulnerability severity description</p>
     * @param HarmDescription <p>Vulnerability severity description</p>
     */
    public void setHarmDescription(String HarmDescription) {
        this.HarmDescription = HarmDescription;
    }

    /**
     * Get <p>Vulnerability Impact product</p> 
     * @return AffectVendorProduct <p>Vulnerability Impact product</p>
     */
    public VulVendorProduct [] getAffectVendorProduct() {
        return this.AffectVendorProduct;
    }

    /**
     * Set <p>Vulnerability Impact product</p>
     * @param AffectVendorProduct <p>Vulnerability Impact product</p>
     */
    public void setAffectVendorProduct(VulVendorProduct [] AffectVendorProduct) {
        this.AffectVendorProduct = AffectVendorProduct;
    }

    public VulDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDetailInfo(VulDetailInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.CheckMethod != null) {
            this.CheckMethod = new String(source.CheckMethod);
        }
        if (source.DefendStatus != null) {
            this.DefendStatus = new String(source.DefendStatus);
        }
        if (source.SupportFix != null) {
            this.SupportFix = new Boolean(source.SupportFix);
        }
        if (source.VRPRatingInfo != null) {
            this.VRPRatingInfo = new VPRRatingInfo(source.VRPRatingInfo);
        }
        if (source.CvssScore != null) {
            this.CvssScore = new Float(source.CvssScore);
        }
        if (source.Label != null) {
            this.Label = new VPRLabel[source.Label.length];
            for (int i = 0; i < source.Label.length; i++) {
                this.Label[i] = new VPRLabel(source.Label[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.DefendHostCount != null) {
            this.DefendHostCount = new Long(source.DefendHostCount);
        }
        if (source.NotDefendHostCount != null) {
            this.NotDefendHostCount = new Long(source.NotDefendHostCount);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.CVSSLevel != null) {
            this.CVSSLevel = new String(source.CVSSLevel);
        }
        if (source.VulAffect != null) {
            this.VulAffect = new String[source.VulAffect.length];
            for (int i = 0; i < source.VulAffect.length; i++) {
                this.VulAffect[i] = new String(source.VulAffect[i]);
            }
        }
        if (source.KVERecord != null) {
            this.KVERecord = new Boolean(source.KVERecord);
        }
        if (source.KVERecordTime != null) {
            this.KVERecordTime = new String(source.KVERecordTime);
        }
        if (source.EPSSScore != null) {
            this.EPSSScore = new Float(source.EPSSScore);
        }
        if (source.AffectVendor != null) {
            this.AffectVendor = new String[source.AffectVendor.length];
            for (int i = 0; i < source.AffectVendor.length; i++) {
                this.AffectVendor[i] = new String(source.AffectVendor[i]);
            }
        }
        if (source.AffectProduct != null) {
            this.AffectProduct = new String[source.AffectProduct.length];
            for (int i = 0; i < source.AffectProduct.length; i++) {
                this.AffectProduct[i] = new String(source.AffectProduct[i]);
            }
        }
        if (source.Mechanism != null) {
            this.Mechanism = new String(source.Mechanism);
        }
        if (source.Precondition != null) {
            this.Precondition = new String(source.Precondition);
        }
        if (source.LatestTrend != null) {
            this.LatestTrend = new VulSpreadTrend[source.LatestTrend.length];
            for (int i = 0; i < source.LatestTrend.length; i++) {
                this.LatestTrend[i] = new VulSpreadTrend(source.LatestTrend[i]);
            }
        }
        if (source.FixSolution != null) {
            this.FixSolution = new String(source.FixSolution);
        }
        if (source.RefLink != null) {
            this.RefLink = new String(source.RefLink);
        }
        if (source.HarmDescription != null) {
            this.HarmDescription = new String(source.HarmDescription);
        }
        if (source.AffectVendorProduct != null) {
            this.AffectVendorProduct = new VulVendorProduct[source.AffectVendorProduct.length];
            for (int i = 0; i < source.AffectVendorProduct.length; i++) {
                this.AffectVendorProduct[i] = new VulVendorProduct(source.AffectVendorProduct[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "CheckMethod", this.CheckMethod);
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);
        this.setParamSimple(map, prefix + "SupportFix", this.SupportFix);
        this.setParamObj(map, prefix + "VRPRatingInfo.", this.VRPRatingInfo);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamArrayObj(map, prefix + "Label.", this.Label);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "DefendHostCount", this.DefendHostCount);
        this.setParamSimple(map, prefix + "NotDefendHostCount", this.NotDefendHostCount);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "CVSSLevel", this.CVSSLevel);
        this.setParamArraySimple(map, prefix + "VulAffect.", this.VulAffect);
        this.setParamSimple(map, prefix + "KVERecord", this.KVERecord);
        this.setParamSimple(map, prefix + "KVERecordTime", this.KVERecordTime);
        this.setParamSimple(map, prefix + "EPSSScore", this.EPSSScore);
        this.setParamArraySimple(map, prefix + "AffectVendor.", this.AffectVendor);
        this.setParamArraySimple(map, prefix + "AffectProduct.", this.AffectProduct);
        this.setParamSimple(map, prefix + "Mechanism", this.Mechanism);
        this.setParamSimple(map, prefix + "Precondition", this.Precondition);
        this.setParamArrayObj(map, prefix + "LatestTrend.", this.LatestTrend);
        this.setParamSimple(map, prefix + "FixSolution", this.FixSolution);
        this.setParamSimple(map, prefix + "RefLink", this.RefLink);
        this.setParamSimple(map, prefix + "HarmDescription", this.HarmDescription);
        this.setParamArrayObj(map, prefix + "AffectVendorProduct.", this.AffectVendorProduct);

    }
}

