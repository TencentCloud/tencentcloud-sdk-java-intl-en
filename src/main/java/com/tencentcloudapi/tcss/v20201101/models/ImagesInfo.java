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

public class ImagesInfo extends AbstractModel {

    /**
    * Image ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Image size
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Number of hosts (includes regular nodes and super nodes).
    */
    @SerializedName("HostCnt")
    @Expose
    private Long HostCnt;

    /**
    * Number of super nodes.
    */
    @SerializedName("SuperNodeCnt")
    @Expose
    private Long SuperNodeCnt;

    /**
    * Number of containers
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * Scan time
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * Number of vulnerabilities
    */
    @SerializedName("VulCnt")
    @Expose
    private Long VulCnt;

    /**
    * Number of viruses
    */
    @SerializedName("VirusCnt")
    @Expose
    private Long VirusCnt;

    /**
    * Number of sensitive data items
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * Whether it is a trusted image
    */
    @SerializedName("IsTrustImage")
    @Expose
    private Boolean IsTrustImage;

    /**
    * Image system
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * Image scan error in the agent
    */
    @SerializedName("AgentError")
    @Expose
    private String AgentError;

    /**
    * Image scan error on the backend
    */
    @SerializedName("ScanError")
    @Expose
    private String ScanError;

    /**
    * Scanning status
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * Trojan scan error message
    */
    @SerializedName("ScanVirusError")
    @Expose
    private String ScanVirusError;

    /**
    * Vulnerability scan error message
    */
    @SerializedName("ScanVulError")
    @Expose
    private String ScanVulError;

    /**
    * Risk scan error message
    */
    @SerializedName("ScanRiskError")
    @Expose
    private String ScanRiskError;

    /**
    * Whether the image is of high priority. Valid values: `0` (no); others (yes).
    */
    @SerializedName("IsSuggest")
    @Expose
    private Long IsSuggest;

    /**
    * Whether it is licensed. Valid values: `1` (yes); `0` (no).
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
    * Number of components
    */
    @SerializedName("ComponentCnt")
    @Expose
    private Long ComponentCnt;

    /**
    * 
    */
    @SerializedName("CriticalLevelVulCnt")
    @Expose
    private Long CriticalLevelVulCnt;

    /**
    * 
    */
    @SerializedName("HighLevelVulCnt")
    @Expose
    private Long HighLevelVulCnt;

    /**
    * 
    */
    @SerializedName("MediumLevelVulCnt")
    @Expose
    private Long MediumLevelVulCnt;

    /**
    * 
    */
    @SerializedName("LowLevelVulCnt")
    @Expose
    private Long LowLevelVulCnt;

    /**
    * 
    */
    @SerializedName("IsLatestImage")
    @Expose
    private Boolean IsLatestImage;

    /**
    * 
    */
    @SerializedName("RecommendedFix")
    @Expose
    private Boolean RecommendedFix;

    /**
    * Solution
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * Reason

    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get Image ID 
     * @return ImageID Image ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set Image ID
     * @param ImageID Image ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get Image name 
     * @return ImageName Image name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
     * @param ImageName Image name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Image size 
     * @return Size Image size
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Image size
     * @param Size Image size
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Number of hosts (includes regular nodes and super nodes). 
     * @return HostCnt Number of hosts (includes regular nodes and super nodes).
     */
    public Long getHostCnt() {
        return this.HostCnt;
    }

    /**
     * Set Number of hosts (includes regular nodes and super nodes).
     * @param HostCnt Number of hosts (includes regular nodes and super nodes).
     */
    public void setHostCnt(Long HostCnt) {
        this.HostCnt = HostCnt;
    }

    /**
     * Get Number of super nodes. 
     * @return SuperNodeCnt Number of super nodes.
     */
    public Long getSuperNodeCnt() {
        return this.SuperNodeCnt;
    }

    /**
     * Set Number of super nodes.
     * @param SuperNodeCnt Number of super nodes.
     */
    public void setSuperNodeCnt(Long SuperNodeCnt) {
        this.SuperNodeCnt = SuperNodeCnt;
    }

    /**
     * Get Number of containers 
     * @return ContainerCnt Number of containers
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set Number of containers
     * @param ContainerCnt Number of containers
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get Scan time 
     * @return ScanTime Scan time
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set Scan time
     * @param ScanTime Scan time
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get Number of vulnerabilities 
     * @return VulCnt Number of vulnerabilities
     */
    public Long getVulCnt() {
        return this.VulCnt;
    }

    /**
     * Set Number of vulnerabilities
     * @param VulCnt Number of vulnerabilities
     */
    public void setVulCnt(Long VulCnt) {
        this.VulCnt = VulCnt;
    }

    /**
     * Get Number of viruses 
     * @return VirusCnt Number of viruses
     */
    public Long getVirusCnt() {
        return this.VirusCnt;
    }

    /**
     * Set Number of viruses
     * @param VirusCnt Number of viruses
     */
    public void setVirusCnt(Long VirusCnt) {
        this.VirusCnt = VirusCnt;
    }

    /**
     * Get Number of sensitive data items 
     * @return RiskCnt Number of sensitive data items
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set Number of sensitive data items
     * @param RiskCnt Number of sensitive data items
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get Whether it is a trusted image 
     * @return IsTrustImage Whether it is a trusted image
     */
    public Boolean getIsTrustImage() {
        return this.IsTrustImage;
    }

    /**
     * Set Whether it is a trusted image
     * @param IsTrustImage Whether it is a trusted image
     */
    public void setIsTrustImage(Boolean IsTrustImage) {
        this.IsTrustImage = IsTrustImage;
    }

    /**
     * Get Image system 
     * @return OsName Image system
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set Image system
     * @param OsName Image system
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get Image scan error in the agent 
     * @return AgentError Image scan error in the agent
     */
    public String getAgentError() {
        return this.AgentError;
    }

    /**
     * Set Image scan error in the agent
     * @param AgentError Image scan error in the agent
     */
    public void setAgentError(String AgentError) {
        this.AgentError = AgentError;
    }

    /**
     * Get Image scan error on the backend 
     * @return ScanError Image scan error on the backend
     */
    public String getScanError() {
        return this.ScanError;
    }

    /**
     * Set Image scan error on the backend
     * @param ScanError Image scan error on the backend
     */
    public void setScanError(String ScanError) {
        this.ScanError = ScanError;
    }

    /**
     * Get Scanning status 
     * @return ScanStatus Scanning status
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set Scanning status
     * @param ScanStatus Scanning status
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get Trojan scan error message 
     * @return ScanVirusError Trojan scan error message
     */
    public String getScanVirusError() {
        return this.ScanVirusError;
    }

    /**
     * Set Trojan scan error message
     * @param ScanVirusError Trojan scan error message
     */
    public void setScanVirusError(String ScanVirusError) {
        this.ScanVirusError = ScanVirusError;
    }

    /**
     * Get Vulnerability scan error message 
     * @return ScanVulError Vulnerability scan error message
     */
    public String getScanVulError() {
        return this.ScanVulError;
    }

    /**
     * Set Vulnerability scan error message
     * @param ScanVulError Vulnerability scan error message
     */
    public void setScanVulError(String ScanVulError) {
        this.ScanVulError = ScanVulError;
    }

    /**
     * Get Risk scan error message 
     * @return ScanRiskError Risk scan error message
     */
    public String getScanRiskError() {
        return this.ScanRiskError;
    }

    /**
     * Set Risk scan error message
     * @param ScanRiskError Risk scan error message
     */
    public void setScanRiskError(String ScanRiskError) {
        this.ScanRiskError = ScanRiskError;
    }

    /**
     * Get Whether the image is of high priority. Valid values: `0` (no); others (yes). 
     * @return IsSuggest Whether the image is of high priority. Valid values: `0` (no); others (yes).
     */
    public Long getIsSuggest() {
        return this.IsSuggest;
    }

    /**
     * Set Whether the image is of high priority. Valid values: `0` (no); others (yes).
     * @param IsSuggest Whether the image is of high priority. Valid values: `0` (no); others (yes).
     */
    public void setIsSuggest(Long IsSuggest) {
        this.IsSuggest = IsSuggest;
    }

    /**
     * Get Whether it is licensed. Valid values: `1` (yes); `0` (no). 
     * @return IsAuthorized Whether it is licensed. Valid values: `1` (yes); `0` (no).
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set Whether it is licensed. Valid values: `1` (yes); `0` (no).
     * @param IsAuthorized Whether it is licensed. Valid values: `1` (yes); `0` (no).
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    /**
     * Get Number of components 
     * @return ComponentCnt Number of components
     */
    public Long getComponentCnt() {
        return this.ComponentCnt;
    }

    /**
     * Set Number of components
     * @param ComponentCnt Number of components
     */
    public void setComponentCnt(Long ComponentCnt) {
        this.ComponentCnt = ComponentCnt;
    }

    /**
     * Get  
     * @return CriticalLevelVulCnt 
     */
    public Long getCriticalLevelVulCnt() {
        return this.CriticalLevelVulCnt;
    }

    /**
     * Set 
     * @param CriticalLevelVulCnt 
     */
    public void setCriticalLevelVulCnt(Long CriticalLevelVulCnt) {
        this.CriticalLevelVulCnt = CriticalLevelVulCnt;
    }

    /**
     * Get  
     * @return HighLevelVulCnt 
     */
    public Long getHighLevelVulCnt() {
        return this.HighLevelVulCnt;
    }

    /**
     * Set 
     * @param HighLevelVulCnt 
     */
    public void setHighLevelVulCnt(Long HighLevelVulCnt) {
        this.HighLevelVulCnt = HighLevelVulCnt;
    }

    /**
     * Get  
     * @return MediumLevelVulCnt 
     */
    public Long getMediumLevelVulCnt() {
        return this.MediumLevelVulCnt;
    }

    /**
     * Set 
     * @param MediumLevelVulCnt 
     */
    public void setMediumLevelVulCnt(Long MediumLevelVulCnt) {
        this.MediumLevelVulCnt = MediumLevelVulCnt;
    }

    /**
     * Get  
     * @return LowLevelVulCnt 
     */
    public Long getLowLevelVulCnt() {
        return this.LowLevelVulCnt;
    }

    /**
     * Set 
     * @param LowLevelVulCnt 
     */
    public void setLowLevelVulCnt(Long LowLevelVulCnt) {
        this.LowLevelVulCnt = LowLevelVulCnt;
    }

    /**
     * Get  
     * @return IsLatestImage 
     */
    public Boolean getIsLatestImage() {
        return this.IsLatestImage;
    }

    /**
     * Set 
     * @param IsLatestImage 
     */
    public void setIsLatestImage(Boolean IsLatestImage) {
        this.IsLatestImage = IsLatestImage;
    }

    /**
     * Get  
     * @return RecommendedFix 
     */
    public Boolean getRecommendedFix() {
        return this.RecommendedFix;
    }

    /**
     * Set 
     * @param RecommendedFix 
     */
    public void setRecommendedFix(Boolean RecommendedFix) {
        this.RecommendedFix = RecommendedFix;
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
     * Get Reason
 
     * @return Reason Reason

     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason

     * @param Reason Reason

     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public ImagesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImagesInfo(ImagesInfo source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.HostCnt != null) {
            this.HostCnt = new Long(source.HostCnt);
        }
        if (source.SuperNodeCnt != null) {
            this.SuperNodeCnt = new Long(source.SuperNodeCnt);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.VulCnt != null) {
            this.VulCnt = new Long(source.VulCnt);
        }
        if (source.VirusCnt != null) {
            this.VirusCnt = new Long(source.VirusCnt);
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new Long(source.RiskCnt);
        }
        if (source.IsTrustImage != null) {
            this.IsTrustImage = new Boolean(source.IsTrustImage);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.AgentError != null) {
            this.AgentError = new String(source.AgentError);
        }
        if (source.ScanError != null) {
            this.ScanError = new String(source.ScanError);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
        }
        if (source.ScanVirusError != null) {
            this.ScanVirusError = new String(source.ScanVirusError);
        }
        if (source.ScanVulError != null) {
            this.ScanVulError = new String(source.ScanVulError);
        }
        if (source.ScanRiskError != null) {
            this.ScanRiskError = new String(source.ScanRiskError);
        }
        if (source.IsSuggest != null) {
            this.IsSuggest = new Long(source.IsSuggest);
        }
        if (source.IsAuthorized != null) {
            this.IsAuthorized = new Long(source.IsAuthorized);
        }
        if (source.ComponentCnt != null) {
            this.ComponentCnt = new Long(source.ComponentCnt);
        }
        if (source.CriticalLevelVulCnt != null) {
            this.CriticalLevelVulCnt = new Long(source.CriticalLevelVulCnt);
        }
        if (source.HighLevelVulCnt != null) {
            this.HighLevelVulCnt = new Long(source.HighLevelVulCnt);
        }
        if (source.MediumLevelVulCnt != null) {
            this.MediumLevelVulCnt = new Long(source.MediumLevelVulCnt);
        }
        if (source.LowLevelVulCnt != null) {
            this.LowLevelVulCnt = new Long(source.LowLevelVulCnt);
        }
        if (source.IsLatestImage != null) {
            this.IsLatestImage = new Boolean(source.IsLatestImage);
        }
        if (source.RecommendedFix != null) {
            this.RecommendedFix = new Boolean(source.RecommendedFix);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "HostCnt", this.HostCnt);
        this.setParamSimple(map, prefix + "SuperNodeCnt", this.SuperNodeCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "VulCnt", this.VulCnt);
        this.setParamSimple(map, prefix + "VirusCnt", this.VirusCnt);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "IsTrustImage", this.IsTrustImage);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "AgentError", this.AgentError);
        this.setParamSimple(map, prefix + "ScanError", this.ScanError);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "ScanVirusError", this.ScanVirusError);
        this.setParamSimple(map, prefix + "ScanVulError", this.ScanVulError);
        this.setParamSimple(map, prefix + "ScanRiskError", this.ScanRiskError);
        this.setParamSimple(map, prefix + "IsSuggest", this.IsSuggest);
        this.setParamSimple(map, prefix + "IsAuthorized", this.IsAuthorized);
        this.setParamSimple(map, prefix + "ComponentCnt", this.ComponentCnt);
        this.setParamSimple(map, prefix + "CriticalLevelVulCnt", this.CriticalLevelVulCnt);
        this.setParamSimple(map, prefix + "HighLevelVulCnt", this.HighLevelVulCnt);
        this.setParamSimple(map, prefix + "MediumLevelVulCnt", this.MediumLevelVulCnt);
        this.setParamSimple(map, prefix + "LowLevelVulCnt", this.LowLevelVulCnt);
        this.setParamSimple(map, prefix + "IsLatestImage", this.IsLatestImage);
        this.setParamSimple(map, prefix + "RecommendedFix", this.RecommendedFix);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

