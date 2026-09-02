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

public class ModifyDspmIdentifyComplianceRuleLevelInfoRequest extends AbstractModel {

    /**
    * <p>Identification template ID</p>
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * <p>Data item id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>Level item id</p>
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Operation source: empty/dspm=database risk monitoring entry, cos=object storage risk monitoring entry</p>
    */
    @SerializedName("OperationSource")
    @Expose
    private String OperationSource;

    /**
     * Get <p>Identification template ID</p> 
     * @return ComplianceId <p>Identification template ID</p>
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set <p>Identification template ID</p>
     * @param ComplianceId <p>Identification template ID</p>
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get <p>Data item id</p> 
     * @return RuleId <p>Data item id</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Data item id</p>
     * @param RuleId <p>Data item id</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>Level item id</p> 
     * @return LevelId <p>Level item id</p>
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set <p>Level item id</p>
     * @param LevelId <p>Level item id</p>
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Operation source: empty/dspm=database risk monitoring entry, cos=object storage risk monitoring entry</p> 
     * @return OperationSource <p>Operation source: empty/dspm=database risk monitoring entry, cos=object storage risk monitoring entry</p>
     */
    public String getOperationSource() {
        return this.OperationSource;
    }

    /**
     * Set <p>Operation source: empty/dspm=database risk monitoring entry, cos=object storage risk monitoring entry</p>
     * @param OperationSource <p>Operation source: empty/dspm=database risk monitoring entry, cos=object storage risk monitoring entry</p>
     */
    public void setOperationSource(String OperationSource) {
        this.OperationSource = OperationSource;
    }

    public ModifyDspmIdentifyComplianceRuleLevelInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmIdentifyComplianceRuleLevelInfoRequest(ModifyDspmIdentifyComplianceRuleLevelInfoRequest source) {
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.OperationSource != null) {
            this.OperationSource = new String(source.OperationSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "OperationSource", this.OperationSource);

    }
}

