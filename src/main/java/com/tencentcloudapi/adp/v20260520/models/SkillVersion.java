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

public class SkillVersion extends AbstractModel {

    /**
    * <p>Detection information</p>
    */
    @SerializedName("AnalysisInfo")
    @Expose
    private SkillAnalysisInfo AnalysisInfo;

    /**
    * <p>Current effective version number.</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>Current effective version ID</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>Skill version RELEASE process status:</p><pre><code>  - 0 INITIALIZED      initialization (initial version state)  - 1 AUDITING         under review (f_analysis_status ∈ {PENDING, RUNNING})  - 2 PENDING_RELEASE  awaiting RELEASE (low/medium-risk, waiting for user confirmation to publish)  - 3 RELEASED         RELEASED  - 4 UNRELEASED       not RELEASED (HIGH / UNAVAILABLE / FAILED / user give up, including the semantics of historical "not approved")Decoupled from SkillAnalysisStatus: the former is the RELEASE lifecycle from the user perspective, while the latter is the security detection stage.</code></pre>
    */
    @SerializedName("VersionStatus")
    @Expose
    private Long VersionStatus;

    /**
    * <p>md5 information of the Skill package</p>
    */
    @SerializedName("SkillMd5")
    @Expose
    private String SkillMd5;

    /**
    * <p>Version package address</p>
    */
    @SerializedName("SkillUrl")
    @Expose
    private String SkillUrl;

    /**
    * <p>Version creation time (Unix seconds).</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>skill md document</p>
    */
    @SerializedName("SkillMarkdownUrl")
    @Expose
    private String SkillMarkdownUrl;

    /**
    * <p>Version change description</p>
    */
    @SerializedName("UpdateDesc")
    @Expose
    private String UpdateDesc;

    /**
    * <p>Change user.</p>
    */
    @SerializedName("Updater")
    @Expose
    private String Updater;

    /**
     * Get <p>Detection information</p> 
     * @return AnalysisInfo <p>Detection information</p>
     */
    public SkillAnalysisInfo getAnalysisInfo() {
        return this.AnalysisInfo;
    }

    /**
     * Set <p>Detection information</p>
     * @param AnalysisInfo <p>Detection information</p>
     */
    public void setAnalysisInfo(SkillAnalysisInfo AnalysisInfo) {
        this.AnalysisInfo = AnalysisInfo;
    }

    /**
     * Get <p>Current effective version number.</p> 
     * @return Version <p>Current effective version number.</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>Current effective version number.</p>
     * @param Version <p>Current effective version number.</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>Current effective version ID</p> 
     * @return VersionId <p>Current effective version ID</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>Current effective version ID</p>
     * @param VersionId <p>Current effective version ID</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>Skill version RELEASE process status:</p><pre><code>  - 0 INITIALIZED      initialization (initial version state)  - 1 AUDITING         under review (f_analysis_status ∈ {PENDING, RUNNING})  - 2 PENDING_RELEASE  awaiting RELEASE (low/medium-risk, waiting for user confirmation to publish)  - 3 RELEASED         RELEASED  - 4 UNRELEASED       not RELEASED (HIGH / UNAVAILABLE / FAILED / user give up, including the semantics of historical "not approved")Decoupled from SkillAnalysisStatus: the former is the RELEASE lifecycle from the user perspective, while the latter is the security detection stage.</code></pre> 
     * @return VersionStatus <p>Skill version RELEASE process status:</p><pre><code>  - 0 INITIALIZED      initialization (initial version state)  - 1 AUDITING         under review (f_analysis_status ∈ {PENDING, RUNNING})  - 2 PENDING_RELEASE  awaiting RELEASE (low/medium-risk, waiting for user confirmation to publish)  - 3 RELEASED         RELEASED  - 4 UNRELEASED       not RELEASED (HIGH / UNAVAILABLE / FAILED / user give up, including the semantics of historical "not approved")Decoupled from SkillAnalysisStatus: the former is the RELEASE lifecycle from the user perspective, while the latter is the security detection stage.</code></pre>
     */
    public Long getVersionStatus() {
        return this.VersionStatus;
    }

    /**
     * Set <p>Skill version RELEASE process status:</p><pre><code>  - 0 INITIALIZED      initialization (initial version state)  - 1 AUDITING         under review (f_analysis_status ∈ {PENDING, RUNNING})  - 2 PENDING_RELEASE  awaiting RELEASE (low/medium-risk, waiting for user confirmation to publish)  - 3 RELEASED         RELEASED  - 4 UNRELEASED       not RELEASED (HIGH / UNAVAILABLE / FAILED / user give up, including the semantics of historical "not approved")Decoupled from SkillAnalysisStatus: the former is the RELEASE lifecycle from the user perspective, while the latter is the security detection stage.</code></pre>
     * @param VersionStatus <p>Skill version RELEASE process status:</p><pre><code>  - 0 INITIALIZED      initialization (initial version state)  - 1 AUDITING         under review (f_analysis_status ∈ {PENDING, RUNNING})  - 2 PENDING_RELEASE  awaiting RELEASE (low/medium-risk, waiting for user confirmation to publish)  - 3 RELEASED         RELEASED  - 4 UNRELEASED       not RELEASED (HIGH / UNAVAILABLE / FAILED / user give up, including the semantics of historical "not approved")Decoupled from SkillAnalysisStatus: the former is the RELEASE lifecycle from the user perspective, while the latter is the security detection stage.</code></pre>
     */
    public void setVersionStatus(Long VersionStatus) {
        this.VersionStatus = VersionStatus;
    }

    /**
     * Get <p>md5 information of the Skill package</p> 
     * @return SkillMd5 <p>md5 information of the Skill package</p>
     */
    public String getSkillMd5() {
        return this.SkillMd5;
    }

    /**
     * Set <p>md5 information of the Skill package</p>
     * @param SkillMd5 <p>md5 information of the Skill package</p>
     */
    public void setSkillMd5(String SkillMd5) {
        this.SkillMd5 = SkillMd5;
    }

    /**
     * Get <p>Version package address</p> 
     * @return SkillUrl <p>Version package address</p>
     */
    public String getSkillUrl() {
        return this.SkillUrl;
    }

    /**
     * Set <p>Version package address</p>
     * @param SkillUrl <p>Version package address</p>
     */
    public void setSkillUrl(String SkillUrl) {
        this.SkillUrl = SkillUrl;
    }

    /**
     * Get <p>Version creation time (Unix seconds).</p> 
     * @return CreateTime <p>Version creation time (Unix seconds).</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Version creation time (Unix seconds).</p>
     * @param CreateTime <p>Version creation time (Unix seconds).</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>skill md document</p> 
     * @return SkillMarkdownUrl <p>skill md document</p>
     */
    public String getSkillMarkdownUrl() {
        return this.SkillMarkdownUrl;
    }

    /**
     * Set <p>skill md document</p>
     * @param SkillMarkdownUrl <p>skill md document</p>
     */
    public void setSkillMarkdownUrl(String SkillMarkdownUrl) {
        this.SkillMarkdownUrl = SkillMarkdownUrl;
    }

    /**
     * Get <p>Version change description</p> 
     * @return UpdateDesc <p>Version change description</p>
     */
    public String getUpdateDesc() {
        return this.UpdateDesc;
    }

    /**
     * Set <p>Version change description</p>
     * @param UpdateDesc <p>Version change description</p>
     */
    public void setUpdateDesc(String UpdateDesc) {
        this.UpdateDesc = UpdateDesc;
    }

    /**
     * Get <p>Change user.</p> 
     * @return Updater <p>Change user.</p>
     */
    public String getUpdater() {
        return this.Updater;
    }

    /**
     * Set <p>Change user.</p>
     * @param Updater <p>Change user.</p>
     */
    public void setUpdater(String Updater) {
        this.Updater = Updater;
    }

    public SkillVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillVersion(SkillVersion source) {
        if (source.AnalysisInfo != null) {
            this.AnalysisInfo = new SkillAnalysisInfo(source.AnalysisInfo);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.VersionStatus != null) {
            this.VersionStatus = new Long(source.VersionStatus);
        }
        if (source.SkillMd5 != null) {
            this.SkillMd5 = new String(source.SkillMd5);
        }
        if (source.SkillUrl != null) {
            this.SkillUrl = new String(source.SkillUrl);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SkillMarkdownUrl != null) {
            this.SkillMarkdownUrl = new String(source.SkillMarkdownUrl);
        }
        if (source.UpdateDesc != null) {
            this.UpdateDesc = new String(source.UpdateDesc);
        }
        if (source.Updater != null) {
            this.Updater = new String(source.Updater);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AnalysisInfo.", this.AnalysisInfo);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "VersionStatus", this.VersionStatus);
        this.setParamSimple(map, prefix + "SkillMd5", this.SkillMd5);
        this.setParamSimple(map, prefix + "SkillUrl", this.SkillUrl);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SkillMarkdownUrl", this.SkillMarkdownUrl);
        this.setParamSimple(map, prefix + "UpdateDesc", this.UpdateDesc);
        this.setParamSimple(map, prefix + "Updater", this.Updater);

    }
}

