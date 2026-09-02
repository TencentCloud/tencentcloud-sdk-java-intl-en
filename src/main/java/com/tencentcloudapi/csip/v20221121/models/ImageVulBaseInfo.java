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

public class ImageVulBaseInfo extends AbstractModel {

    /**
    * <p>Affected component information</p>
    */
    @SerializedName("AffectedComponents")
    @Expose
    private VulAffectedComponent [] AffectedComponents;

    /**
    * <p>Vulnerability name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Vulnerability CVEID</p>
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * <p>Vulnerability category</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>Vulnerability release time</p>
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * <p>Vulnerability detection method</p>
    */
    @SerializedName("CheckMethod")
    @Expose
    private String CheckMethod;

    /**
    * <p>Whether the defense is supported</p><p>Enumeration value:</p><ul><li>ENABLED: support defense</li><li>NOT_ENABLED: defense not supported</li></ul>
    */
    @SerializedName("DefendStatus")
    @Expose
    private String DefendStatus;

    /**
    * <p>Whether repair is supported</p>
    */
    @SerializedName("SupportFix")
    @Expose
    private Boolean SupportFix;

    /**
    * <p>CVSS score</p>
    */
    @SerializedName("CvssScore")
    @Expose
    private String CvssScore;

    /**
    * <p>Vulnerability severity description</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Vulnerability description</p>
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * <p>Severity level</p>
    */
    @SerializedName("CVSSLevel")
    @Expose
    private String CVSSLevel;

    /**
    * <p>Primary impact type</p>
    */
    @SerializedName("VulAffect")
    @Expose
    private String VulAffect;

    /**
    * <p>Existence of exploitation in the wild</p>
    */
    @SerializedName("KVERecord")
    @Expose
    private Boolean KVERecord;

    /**
    * <p>EPSS probability score</p>
    */
    @SerializedName("EPSSScore")
    @Expose
    private Float EPSSScore;

    /**
    * <p>Impacted manufacturer</p>
    */
    @SerializedName("AffectVendor")
    @Expose
    private String AffectVendor;

    /**
    * <p>Impact on the target product</p>
    */
    @SerializedName("AffectProduct")
    @Expose
    private String AffectProduct;

    /**
    * <p>Vulnerability principle</p>
    */
    @SerializedName("Mechanism")
    @Expose
    private String Mechanism;

    /**
    * <p>Prerequisites for an attack</p>
    */
    @SerializedName("Precondition")
    @Expose
    private String Precondition;

    /**
    * <p>Vulnerability remediation suggestions</p>
    */
    @SerializedName("FixSolution")
    @Expose
    private String FixSolution;

    /**
    * <p>Vulnerability-related link</p>
    */
    @SerializedName("RefLink")
    @Expose
    private String RefLink;

    /**
    * <p>Vulnerability tag</p>
    */
    @SerializedName("Label")
    @Expose
    private String [] Label;

    /**
    * <p>Vulnerability Id</p>
    */
    @SerializedName("PocId")
    @Expose
    private String PocId;

    /**
     * Get <p>Affected component information</p> 
     * @return AffectedComponents <p>Affected component information</p>
     */
    public VulAffectedComponent [] getAffectedComponents() {
        return this.AffectedComponents;
    }

    /**
     * Set <p>Affected component information</p>
     * @param AffectedComponents <p>Affected component information</p>
     */
    public void setAffectedComponents(VulAffectedComponent [] AffectedComponents) {
        this.AffectedComponents = AffectedComponents;
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
     * Get <p>Vulnerability CVEID</p> 
     * @return CVEID <p>Vulnerability CVEID</p>
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set <p>Vulnerability CVEID</p>
     * @param CVEID <p>Vulnerability CVEID</p>
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    /**
     * Get <p>Vulnerability category</p> 
     * @return Category <p>Vulnerability category</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>Vulnerability category</p>
     * @param Category <p>Vulnerability category</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>Vulnerability release time</p> 
     * @return PublishTime <p>Vulnerability release time</p>
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set <p>Vulnerability release time</p>
     * @param PublishTime <p>Vulnerability release time</p>
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get <p>Vulnerability detection method</p> 
     * @return CheckMethod <p>Vulnerability detection method</p>
     */
    public String getCheckMethod() {
        return this.CheckMethod;
    }

    /**
     * Set <p>Vulnerability detection method</p>
     * @param CheckMethod <p>Vulnerability detection method</p>
     */
    public void setCheckMethod(String CheckMethod) {
        this.CheckMethod = CheckMethod;
    }

    /**
     * Get <p>Whether the defense is supported</p><p>Enumeration value:</p><ul><li>ENABLED: support defense</li><li>NOT_ENABLED: defense not supported</li></ul> 
     * @return DefendStatus <p>Whether the defense is supported</p><p>Enumeration value:</p><ul><li>ENABLED: support defense</li><li>NOT_ENABLED: defense not supported</li></ul>
     */
    public String getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set <p>Whether the defense is supported</p><p>Enumeration value:</p><ul><li>ENABLED: support defense</li><li>NOT_ENABLED: defense not supported</li></ul>
     * @param DefendStatus <p>Whether the defense is supported</p><p>Enumeration value:</p><ul><li>ENABLED: support defense</li><li>NOT_ENABLED: defense not supported</li></ul>
     */
    public void setDefendStatus(String DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    /**
     * Get <p>Whether repair is supported</p> 
     * @return SupportFix <p>Whether repair is supported</p>
     */
    public Boolean getSupportFix() {
        return this.SupportFix;
    }

    /**
     * Set <p>Whether repair is supported</p>
     * @param SupportFix <p>Whether repair is supported</p>
     */
    public void setSupportFix(Boolean SupportFix) {
        this.SupportFix = SupportFix;
    }

    /**
     * Get <p>CVSS score</p> 
     * @return CvssScore <p>CVSS score</p>
     */
    public String getCvssScore() {
        return this.CvssScore;
    }

    /**
     * Set <p>CVSS score</p>
     * @param CvssScore <p>CVSS score</p>
     */
    public void setCvssScore(String CvssScore) {
        this.CvssScore = CvssScore;
    }

    /**
     * Get <p>Vulnerability severity description</p> 
     * @return Remark <p>Vulnerability severity description</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Vulnerability severity description</p>
     * @param Remark <p>Vulnerability severity description</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Vulnerability description</p> 
     * @return Summary <p>Vulnerability description</p>
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>Vulnerability description</p>
     * @param Summary <p>Vulnerability description</p>
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get <p>Severity level</p> 
     * @return CVSSLevel <p>Severity level</p>
     */
    public String getCVSSLevel() {
        return this.CVSSLevel;
    }

    /**
     * Set <p>Severity level</p>
     * @param CVSSLevel <p>Severity level</p>
     */
    public void setCVSSLevel(String CVSSLevel) {
        this.CVSSLevel = CVSSLevel;
    }

    /**
     * Get <p>Primary impact type</p> 
     * @return VulAffect <p>Primary impact type</p>
     */
    public String getVulAffect() {
        return this.VulAffect;
    }

    /**
     * Set <p>Primary impact type</p>
     * @param VulAffect <p>Primary impact type</p>
     */
    public void setVulAffect(String VulAffect) {
        this.VulAffect = VulAffect;
    }

    /**
     * Get <p>Existence of exploitation in the wild</p> 
     * @return KVERecord <p>Existence of exploitation in the wild</p>
     */
    public Boolean getKVERecord() {
        return this.KVERecord;
    }

    /**
     * Set <p>Existence of exploitation in the wild</p>
     * @param KVERecord <p>Existence of exploitation in the wild</p>
     */
    public void setKVERecord(Boolean KVERecord) {
        this.KVERecord = KVERecord;
    }

    /**
     * Get <p>EPSS probability score</p> 
     * @return EPSSScore <p>EPSS probability score</p>
     */
    public Float getEPSSScore() {
        return this.EPSSScore;
    }

    /**
     * Set <p>EPSS probability score</p>
     * @param EPSSScore <p>EPSS probability score</p>
     */
    public void setEPSSScore(Float EPSSScore) {
        this.EPSSScore = EPSSScore;
    }

    /**
     * Get <p>Impacted manufacturer</p> 
     * @return AffectVendor <p>Impacted manufacturer</p>
     */
    public String getAffectVendor() {
        return this.AffectVendor;
    }

    /**
     * Set <p>Impacted manufacturer</p>
     * @param AffectVendor <p>Impacted manufacturer</p>
     */
    public void setAffectVendor(String AffectVendor) {
        this.AffectVendor = AffectVendor;
    }

    /**
     * Get <p>Impact on the target product</p> 
     * @return AffectProduct <p>Impact on the target product</p>
     */
    public String getAffectProduct() {
        return this.AffectProduct;
    }

    /**
     * Set <p>Impact on the target product</p>
     * @param AffectProduct <p>Impact on the target product</p>
     */
    public void setAffectProduct(String AffectProduct) {
        this.AffectProduct = AffectProduct;
    }

    /**
     * Get <p>Vulnerability principle</p> 
     * @return Mechanism <p>Vulnerability principle</p>
     */
    public String getMechanism() {
        return this.Mechanism;
    }

    /**
     * Set <p>Vulnerability principle</p>
     * @param Mechanism <p>Vulnerability principle</p>
     */
    public void setMechanism(String Mechanism) {
        this.Mechanism = Mechanism;
    }

    /**
     * Get <p>Prerequisites for an attack</p> 
     * @return Precondition <p>Prerequisites for an attack</p>
     */
    public String getPrecondition() {
        return this.Precondition;
    }

    /**
     * Set <p>Prerequisites for an attack</p>
     * @param Precondition <p>Prerequisites for an attack</p>
     */
    public void setPrecondition(String Precondition) {
        this.Precondition = Precondition;
    }

    /**
     * Get <p>Vulnerability remediation suggestions</p> 
     * @return FixSolution <p>Vulnerability remediation suggestions</p>
     */
    public String getFixSolution() {
        return this.FixSolution;
    }

    /**
     * Set <p>Vulnerability remediation suggestions</p>
     * @param FixSolution <p>Vulnerability remediation suggestions</p>
     */
    public void setFixSolution(String FixSolution) {
        this.FixSolution = FixSolution;
    }

    /**
     * Get <p>Vulnerability-related link</p> 
     * @return RefLink <p>Vulnerability-related link</p>
     */
    public String getRefLink() {
        return this.RefLink;
    }

    /**
     * Set <p>Vulnerability-related link</p>
     * @param RefLink <p>Vulnerability-related link</p>
     */
    public void setRefLink(String RefLink) {
        this.RefLink = RefLink;
    }

    /**
     * Get <p>Vulnerability tag</p> 
     * @return Label <p>Vulnerability tag</p>
     */
    public String [] getLabel() {
        return this.Label;
    }

    /**
     * Set <p>Vulnerability tag</p>
     * @param Label <p>Vulnerability tag</p>
     */
    public void setLabel(String [] Label) {
        this.Label = Label;
    }

    /**
     * Get <p>Vulnerability Id</p> 
     * @return PocId <p>Vulnerability Id</p>
     */
    public String getPocId() {
        return this.PocId;
    }

    /**
     * Set <p>Vulnerability Id</p>
     * @param PocId <p>Vulnerability Id</p>
     */
    public void setPocId(String PocId) {
        this.PocId = PocId;
    }

    public ImageVulBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageVulBaseInfo(ImageVulBaseInfo source) {
        if (source.AffectedComponents != null) {
            this.AffectedComponents = new VulAffectedComponent[source.AffectedComponents.length];
            for (int i = 0; i < source.AffectedComponents.length; i++) {
                this.AffectedComponents[i] = new VulAffectedComponent(source.AffectedComponents[i]);
            }
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
        if (source.CvssScore != null) {
            this.CvssScore = new String(source.CvssScore);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.CVSSLevel != null) {
            this.CVSSLevel = new String(source.CVSSLevel);
        }
        if (source.VulAffect != null) {
            this.VulAffect = new String(source.VulAffect);
        }
        if (source.KVERecord != null) {
            this.KVERecord = new Boolean(source.KVERecord);
        }
        if (source.EPSSScore != null) {
            this.EPSSScore = new Float(source.EPSSScore);
        }
        if (source.AffectVendor != null) {
            this.AffectVendor = new String(source.AffectVendor);
        }
        if (source.AffectProduct != null) {
            this.AffectProduct = new String(source.AffectProduct);
        }
        if (source.Mechanism != null) {
            this.Mechanism = new String(source.Mechanism);
        }
        if (source.Precondition != null) {
            this.Precondition = new String(source.Precondition);
        }
        if (source.FixSolution != null) {
            this.FixSolution = new String(source.FixSolution);
        }
        if (source.RefLink != null) {
            this.RefLink = new String(source.RefLink);
        }
        if (source.Label != null) {
            this.Label = new String[source.Label.length];
            for (int i = 0; i < source.Label.length; i++) {
                this.Label[i] = new String(source.Label[i]);
            }
        }
        if (source.PocId != null) {
            this.PocId = new String(source.PocId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AffectedComponents.", this.AffectedComponents);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "CheckMethod", this.CheckMethod);
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);
        this.setParamSimple(map, prefix + "SupportFix", this.SupportFix);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "CVSSLevel", this.CVSSLevel);
        this.setParamSimple(map, prefix + "VulAffect", this.VulAffect);
        this.setParamSimple(map, prefix + "KVERecord", this.KVERecord);
        this.setParamSimple(map, prefix + "EPSSScore", this.EPSSScore);
        this.setParamSimple(map, prefix + "AffectVendor", this.AffectVendor);
        this.setParamSimple(map, prefix + "AffectProduct", this.AffectProduct);
        this.setParamSimple(map, prefix + "Mechanism", this.Mechanism);
        this.setParamSimple(map, prefix + "Precondition", this.Precondition);
        this.setParamSimple(map, prefix + "FixSolution", this.FixSolution);
        this.setParamSimple(map, prefix + "RefLink", this.RefLink);
        this.setParamArraySimple(map, prefix + "Label.", this.Label);
        this.setParamSimple(map, prefix + "PocId", this.PocId);

    }
}

