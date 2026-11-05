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

public class SkillShare extends AbstractModel {

    /**
    * <p>Approval ID</p>
    */
    @SerializedName("ApprovalId")
    @Expose
    private String ApprovalId;

    /**
    * <p>New skill_id associated after sharing</p>
    */
    @SerializedName("ShareSkillId")
    @Expose
    private String ShareSkillId;

    /**
    * <p>Shared version, for example 1.0.0</p>
    */
    @SerializedName("ShareVersion")
    @Expose
    private String ShareVersion;

    /**
    * <p>Shared version ID</p>
    */
    @SerializedName("ShareVersionId")
    @Expose
    private String ShareVersionId;

    /**
    * <p>Original skill_id</p>
    */
    @SerializedName("SkillId")
    @Expose
    private String SkillId;

    /**
    * <p>Shared state</p><p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | Not shared |<br>| 1 | Shared |<br>| 2 | Pending Approval |</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Business share scope</p>
    */
    @SerializedName("CorpShareConfig")
    @Expose
    private SkillCorpShareConfig CorpShareConfig;

    /**
     * Get <p>Approval ID</p> 
     * @return ApprovalId <p>Approval ID</p>
     */
    public String getApprovalId() {
        return this.ApprovalId;
    }

    /**
     * Set <p>Approval ID</p>
     * @param ApprovalId <p>Approval ID</p>
     */
    public void setApprovalId(String ApprovalId) {
        this.ApprovalId = ApprovalId;
    }

    /**
     * Get <p>New skill_id associated after sharing</p> 
     * @return ShareSkillId <p>New skill_id associated after sharing</p>
     */
    public String getShareSkillId() {
        return this.ShareSkillId;
    }

    /**
     * Set <p>New skill_id associated after sharing</p>
     * @param ShareSkillId <p>New skill_id associated after sharing</p>
     */
    public void setShareSkillId(String ShareSkillId) {
        this.ShareSkillId = ShareSkillId;
    }

    /**
     * Get <p>Shared version, for example 1.0.0</p> 
     * @return ShareVersion <p>Shared version, for example 1.0.0</p>
     */
    public String getShareVersion() {
        return this.ShareVersion;
    }

    /**
     * Set <p>Shared version, for example 1.0.0</p>
     * @param ShareVersion <p>Shared version, for example 1.0.0</p>
     */
    public void setShareVersion(String ShareVersion) {
        this.ShareVersion = ShareVersion;
    }

    /**
     * Get <p>Shared version ID</p> 
     * @return ShareVersionId <p>Shared version ID</p>
     */
    public String getShareVersionId() {
        return this.ShareVersionId;
    }

    /**
     * Set <p>Shared version ID</p>
     * @param ShareVersionId <p>Shared version ID</p>
     */
    public void setShareVersionId(String ShareVersionId) {
        this.ShareVersionId = ShareVersionId;
    }

    /**
     * Get <p>Original skill_id</p> 
     * @return SkillId <p>Original skill_id</p>
     */
    public String getSkillId() {
        return this.SkillId;
    }

    /**
     * Set <p>Original skill_id</p>
     * @param SkillId <p>Original skill_id</p>
     */
    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    /**
     * Get <p>Shared state</p><p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | Not shared |<br>| 1 | Shared |<br>| 2 | Pending Approval |</p> 
     * @return Status <p>Shared state</p><p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | Not shared |<br>| 1 | Shared |<br>| 2 | Pending Approval |</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Shared state</p><p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | Not shared |<br>| 1 | Shared |<br>| 2 | Pending Approval |</p>
     * @param Status <p>Shared state</p><p>Enumeration values:<br>| uint | Description |<br>| --- | --- |<br>| 0 | Not shared |<br>| 1 | Shared |<br>| 2 | Pending Approval |</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Business share scope</p> 
     * @return CorpShareConfig <p>Business share scope</p>
     */
    public SkillCorpShareConfig getCorpShareConfig() {
        return this.CorpShareConfig;
    }

    /**
     * Set <p>Business share scope</p>
     * @param CorpShareConfig <p>Business share scope</p>
     */
    public void setCorpShareConfig(SkillCorpShareConfig CorpShareConfig) {
        this.CorpShareConfig = CorpShareConfig;
    }

    public SkillShare() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillShare(SkillShare source) {
        if (source.ApprovalId != null) {
            this.ApprovalId = new String(source.ApprovalId);
        }
        if (source.ShareSkillId != null) {
            this.ShareSkillId = new String(source.ShareSkillId);
        }
        if (source.ShareVersion != null) {
            this.ShareVersion = new String(source.ShareVersion);
        }
        if (source.ShareVersionId != null) {
            this.ShareVersionId = new String(source.ShareVersionId);
        }
        if (source.SkillId != null) {
            this.SkillId = new String(source.SkillId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CorpShareConfig != null) {
            this.CorpShareConfig = new SkillCorpShareConfig(source.CorpShareConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApprovalId", this.ApprovalId);
        this.setParamSimple(map, prefix + "ShareSkillId", this.ShareSkillId);
        this.setParamSimple(map, prefix + "ShareVersion", this.ShareVersion);
        this.setParamSimple(map, prefix + "ShareVersionId", this.ShareVersionId);
        this.setParamSimple(map, prefix + "SkillId", this.SkillId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "CorpShareConfig.", this.CorpShareConfig);

    }
}

