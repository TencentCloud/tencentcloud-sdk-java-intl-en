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

public class DspmIdentifyRuleDetail extends AbstractModel {

    /**
    * <p>Data item id</p>
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
    * <p>Sensitivity level id</p>
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * <p>Sensitivity level name</p>
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * <p>Sensitivity</p>
    */
    @SerializedName("LevelScore")
    @Expose
    private Long LevelScore;

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
     * Get <p>Sensitivity level id</p> 
     * @return LevelId <p>Sensitivity level id</p>
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set <p>Sensitivity level id</p>
     * @param LevelId <p>Sensitivity level id</p>
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get <p>Sensitivity level name</p> 
     * @return LevelName <p>Sensitivity level name</p>
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set <p>Sensitivity level name</p>
     * @param LevelName <p>Sensitivity level name</p>
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    /**
     * Get <p>Sensitivity</p> 
     * @return LevelScore <p>Sensitivity</p>
     */
    public Long getLevelScore() {
        return this.LevelScore;
    }

    /**
     * Set <p>Sensitivity</p>
     * @param LevelScore <p>Sensitivity</p>
     */
    public void setLevelScore(Long LevelScore) {
        this.LevelScore = LevelScore;
    }

    public DspmIdentifyRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyRuleDetail(DspmIdentifyRuleDetail source) {
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

    }
}

