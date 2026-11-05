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

public class CreateSkillShareRequest extends AbstractModel {

    /**
    * <p>Required. Application remarks (pop-up "Application Remarks")</p>
    */
    @SerializedName("ApplyRemark")
    @Expose
    private String ApplyRemark;

    /**
    * <p>Required. Original skill_id</p>
    */
    @SerializedName("SkillId")
    @Expose
    private String SkillId;

    /**
    * <p>Space ID, required</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>Required. id of the shared version (must exceed the shared version)</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>Shared configuration</p>
    */
    @SerializedName("CorpShareConfig")
    @Expose
    private SkillCorpShareConfig CorpShareConfig;

    /**
     * Get <p>Required. Application remarks (pop-up "Application Remarks")</p> 
     * @return ApplyRemark <p>Required. Application remarks (pop-up "Application Remarks")</p>
     */
    public String getApplyRemark() {
        return this.ApplyRemark;
    }

    /**
     * Set <p>Required. Application remarks (pop-up "Application Remarks")</p>
     * @param ApplyRemark <p>Required. Application remarks (pop-up "Application Remarks")</p>
     */
    public void setApplyRemark(String ApplyRemark) {
        this.ApplyRemark = ApplyRemark;
    }

    /**
     * Get <p>Required. Original skill_id</p> 
     * @return SkillId <p>Required. Original skill_id</p>
     */
    public String getSkillId() {
        return this.SkillId;
    }

    /**
     * Set <p>Required. Original skill_id</p>
     * @param SkillId <p>Required. Original skill_id</p>
     */
    public void setSkillId(String SkillId) {
        this.SkillId = SkillId;
    }

    /**
     * Get <p>Space ID, required</p> 
     * @return SpaceId <p>Space ID, required</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Space ID, required</p>
     * @param SpaceId <p>Space ID, required</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>Required. id of the shared version (must exceed the shared version)</p> 
     * @return VersionId <p>Required. id of the shared version (must exceed the shared version)</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>Required. id of the shared version (must exceed the shared version)</p>
     * @param VersionId <p>Required. id of the shared version (must exceed the shared version)</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>Shared configuration</p> 
     * @return CorpShareConfig <p>Shared configuration</p>
     */
    public SkillCorpShareConfig getCorpShareConfig() {
        return this.CorpShareConfig;
    }

    /**
     * Set <p>Shared configuration</p>
     * @param CorpShareConfig <p>Shared configuration</p>
     */
    public void setCorpShareConfig(SkillCorpShareConfig CorpShareConfig) {
        this.CorpShareConfig = CorpShareConfig;
    }

    public CreateSkillShareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSkillShareRequest(CreateSkillShareRequest source) {
        if (source.ApplyRemark != null) {
            this.ApplyRemark = new String(source.ApplyRemark);
        }
        if (source.SkillId != null) {
            this.SkillId = new String(source.SkillId);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.CorpShareConfig != null) {
            this.CorpShareConfig = new SkillCorpShareConfig(source.CorpShareConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplyRemark", this.ApplyRemark);
        this.setParamSimple(map, prefix + "SkillId", this.SkillId);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamObj(map, prefix + "CorpShareConfig.", this.CorpShareConfig);

    }
}

