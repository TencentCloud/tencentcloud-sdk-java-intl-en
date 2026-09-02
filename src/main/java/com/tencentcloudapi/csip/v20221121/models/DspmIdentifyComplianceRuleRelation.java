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

public class DspmIdentifyComplianceRuleRelation extends AbstractModel {

    /**
    * <p>Data item ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>Data item name.</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Level ID</p>
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * <p>Level name</p>
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * <p>Level</p><p>Unit: score</p>
    */
    @SerializedName("LevelScore")
    @Expose
    private Long LevelScore;

    /**
    * <p>Structured rule status</p><p>Enumeration values:</p><ul><li>0: Unconfigured</li><li>1: Configured</li></ul>
    */
    @SerializedName("StructuredStatus")
    @Expose
    private Long StructuredStatus;

    /**
    * <p>Unstructured rule status</p><p>Enumeration values:</p><ul><li>0: no configuration</li><li>1: configured</li></ul>
    */
    @SerializedName("UnStructuredStatus")
    @Expose
    private Long UnStructuredStatus;

    /**
    * <p>Data item status</p><p>Enumeration values:</p><ul><li>0: Not enabled</li><li>1: Enabled</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>Data item ID</p> 
     * @return RuleId <p>Data item ID</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Data item ID</p>
     * @param RuleId <p>Data item ID</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>Data item name.</p> 
     * @return RuleName <p>Data item name.</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>Data item name.</p>
     * @param RuleName <p>Data item name.</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>Level ID</p> 
     * @return LevelId <p>Level ID</p>
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set <p>Level ID</p>
     * @param LevelId <p>Level ID</p>
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get <p>Level name</p> 
     * @return LevelName <p>Level name</p>
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set <p>Level name</p>
     * @param LevelName <p>Level name</p>
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    /**
     * Get <p>Level</p><p>Unit: score</p> 
     * @return LevelScore <p>Level</p><p>Unit: score</p>
     */
    public Long getLevelScore() {
        return this.LevelScore;
    }

    /**
     * Set <p>Level</p><p>Unit: score</p>
     * @param LevelScore <p>Level</p><p>Unit: score</p>
     */
    public void setLevelScore(Long LevelScore) {
        this.LevelScore = LevelScore;
    }

    /**
     * Get <p>Structured rule status</p><p>Enumeration values:</p><ul><li>0: Unconfigured</li><li>1: Configured</li></ul> 
     * @return StructuredStatus <p>Structured rule status</p><p>Enumeration values:</p><ul><li>0: Unconfigured</li><li>1: Configured</li></ul>
     */
    public Long getStructuredStatus() {
        return this.StructuredStatus;
    }

    /**
     * Set <p>Structured rule status</p><p>Enumeration values:</p><ul><li>0: Unconfigured</li><li>1: Configured</li></ul>
     * @param StructuredStatus <p>Structured rule status</p><p>Enumeration values:</p><ul><li>0: Unconfigured</li><li>1: Configured</li></ul>
     */
    public void setStructuredStatus(Long StructuredStatus) {
        this.StructuredStatus = StructuredStatus;
    }

    /**
     * Get <p>Unstructured rule status</p><p>Enumeration values:</p><ul><li>0: no configuration</li><li>1: configured</li></ul> 
     * @return UnStructuredStatus <p>Unstructured rule status</p><p>Enumeration values:</p><ul><li>0: no configuration</li><li>1: configured</li></ul>
     */
    public Long getUnStructuredStatus() {
        return this.UnStructuredStatus;
    }

    /**
     * Set <p>Unstructured rule status</p><p>Enumeration values:</p><ul><li>0: no configuration</li><li>1: configured</li></ul>
     * @param UnStructuredStatus <p>Unstructured rule status</p><p>Enumeration values:</p><ul><li>0: no configuration</li><li>1: configured</li></ul>
     */
    public void setUnStructuredStatus(Long UnStructuredStatus) {
        this.UnStructuredStatus = UnStructuredStatus;
    }

    /**
     * Get <p>Data item status</p><p>Enumeration values:</p><ul><li>0: Not enabled</li><li>1: Enabled</li></ul> 
     * @return Status <p>Data item status</p><p>Enumeration values:</p><ul><li>0: Not enabled</li><li>1: Enabled</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Data item status</p><p>Enumeration values:</p><ul><li>0: Not enabled</li><li>1: Enabled</li></ul>
     * @param Status <p>Data item status</p><p>Enumeration values:</p><ul><li>0: Not enabled</li><li>1: Enabled</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public DspmIdentifyComplianceRuleRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyComplianceRuleRelation(DspmIdentifyComplianceRuleRelation source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
        if (source.LevelScore != null) {
            this.LevelScore = new Long(source.LevelScore);
        }
        if (source.StructuredStatus != null) {
            this.StructuredStatus = new Long(source.StructuredStatus);
        }
        if (source.UnStructuredStatus != null) {
            this.UnStructuredStatus = new Long(source.UnStructuredStatus);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);
        this.setParamSimple(map, prefix + "LevelScore", this.LevelScore);
        this.setParamSimple(map, prefix + "StructuredStatus", this.StructuredStatus);
        this.setParamSimple(map, prefix + "UnStructuredStatus", this.UnStructuredStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

