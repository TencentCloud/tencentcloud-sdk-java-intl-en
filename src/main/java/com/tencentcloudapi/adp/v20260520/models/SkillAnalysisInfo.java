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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillAnalysisInfo extends AbstractModel {

    /**
    * Safety detection status

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | To be checked |
| 1 | detecting |
| 2 | Available |
| 3 | Unavailable |
| 4 | Detection failed |
    */
    @SerializedName("AnalysisStatus")
    @Expose
    private Long AnalysisStatus;

    /**
    * Risk description
    */
    @SerializedName("RiskDescription")
    @Expose
    private String RiskDescription;

    /**
    * Risk level

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | risk-free |
| 1 | Low risk |
| 2 | Medium-risk |
| 3 | High-risk |
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * Security report redirection url
    */
    @SerializedName("SecurityReportUrl")
    @Expose
    private String SecurityReportUrl;

    /**
     * Get Safety detection status

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | To be checked |
| 1 | detecting |
| 2 | Available |
| 3 | Unavailable |
| 4 | Detection failed | 
     * @return AnalysisStatus Safety detection status

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | To be checked |
| 1 | detecting |
| 2 | Available |
| 3 | Unavailable |
| 4 | Detection failed |
     */
    public Long getAnalysisStatus() {
        return this.AnalysisStatus;
    }

    /**
     * Set Safety detection status

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | To be checked |
| 1 | detecting |
| 2 | Available |
| 3 | Unavailable |
| 4 | Detection failed |
     * @param AnalysisStatus Safety detection status

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | To be checked |
| 1 | detecting |
| 2 | Available |
| 3 | Unavailable |
| 4 | Detection failed |
     */
    public void setAnalysisStatus(Long AnalysisStatus) {
        this.AnalysisStatus = AnalysisStatus;
    }

    /**
     * Get Risk description 
     * @return RiskDescription Risk description
     */
    public String getRiskDescription() {
        return this.RiskDescription;
    }

    /**
     * Set Risk description
     * @param RiskDescription Risk description
     */
    public void setRiskDescription(String RiskDescription) {
        this.RiskDescription = RiskDescription;
    }

    /**
     * Get Risk level

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | risk-free |
| 1 | Low risk |
| 2 | Medium-risk |
| 3 | High-risk | 
     * @return RiskLevel Risk level

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | risk-free |
| 1 | Low risk |
| 2 | Medium-risk |
| 3 | High-risk |
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | risk-free |
| 1 | Low risk |
| 2 | Medium-risk |
| 3 | High-risk |
     * @param RiskLevel Risk level

Enumeration values:
| uint | Description |
| --- | --- |
| 0 | risk-free |
| 1 | Low risk |
| 2 | Medium-risk |
| 3 | High-risk |
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Security report redirection url 
     * @return SecurityReportUrl Security report redirection url
     */
    public String getSecurityReportUrl() {
        return this.SecurityReportUrl;
    }

    /**
     * Set Security report redirection url
     * @param SecurityReportUrl Security report redirection url
     */
    public void setSecurityReportUrl(String SecurityReportUrl) {
        this.SecurityReportUrl = SecurityReportUrl;
    }

    public SkillAnalysisInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillAnalysisInfo(SkillAnalysisInfo source) {
        if (source.AnalysisStatus != null) {
            this.AnalysisStatus = new Long(source.AnalysisStatus);
        }
        if (source.RiskDescription != null) {
            this.RiskDescription = new String(source.RiskDescription);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.SecurityReportUrl != null) {
            this.SecurityReportUrl = new String(source.SecurityReportUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AnalysisStatus", this.AnalysisStatus);
        this.setParamSimple(map, prefix + "RiskDescription", this.RiskDescription);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "SecurityReportUrl", this.SecurityReportUrl);

    }
}

