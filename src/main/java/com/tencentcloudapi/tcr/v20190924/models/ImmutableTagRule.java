/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImmutableTagRule extends AbstractModel{

    /**
    * Repository matching rule
    */
    @SerializedName("RepositoryPattern")
    @Expose
    private String RepositoryPattern;

    /**
    * Tag matching rule
    */
    @SerializedName("TagPattern")
    @Expose
    private String TagPattern;

    /**
    * repoMatches or repoExcludes
    */
    @SerializedName("RepositoryDecoration")
    @Expose
    private String RepositoryDecoration;

    /**
    * matches or excludes
    */
    @SerializedName("TagDecoration")
    @Expose
    private String TagDecoration;

    /**
    * Disabling rule
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Namespace
    */
    @SerializedName("NsName")
    @Expose
    private String NsName;

    /**
     * Get Repository matching rule 
     * @return RepositoryPattern Repository matching rule
     */
    public String getRepositoryPattern() {
        return this.RepositoryPattern;
    }

    /**
     * Set Repository matching rule
     * @param RepositoryPattern Repository matching rule
     */
    public void setRepositoryPattern(String RepositoryPattern) {
        this.RepositoryPattern = RepositoryPattern;
    }

    /**
     * Get Tag matching rule 
     * @return TagPattern Tag matching rule
     */
    public String getTagPattern() {
        return this.TagPattern;
    }

    /**
     * Set Tag matching rule
     * @param TagPattern Tag matching rule
     */
    public void setTagPattern(String TagPattern) {
        this.TagPattern = TagPattern;
    }

    /**
     * Get repoMatches or repoExcludes 
     * @return RepositoryDecoration repoMatches or repoExcludes
     */
    public String getRepositoryDecoration() {
        return this.RepositoryDecoration;
    }

    /**
     * Set repoMatches or repoExcludes
     * @param RepositoryDecoration repoMatches or repoExcludes
     */
    public void setRepositoryDecoration(String RepositoryDecoration) {
        this.RepositoryDecoration = RepositoryDecoration;
    }

    /**
     * Get matches or excludes 
     * @return TagDecoration matches or excludes
     */
    public String getTagDecoration() {
        return this.TagDecoration;
    }

    /**
     * Set matches or excludes
     * @param TagDecoration matches or excludes
     */
    public void setTagDecoration(String TagDecoration) {
        this.TagDecoration = TagDecoration;
    }

    /**
     * Get Disabling rule 
     * @return Disabled Disabling rule
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set Disabling rule
     * @param Disabled Disabling rule
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Namespace 
     * @return NsName Namespace
     */
    public String getNsName() {
        return this.NsName;
    }

    /**
     * Set Namespace
     * @param NsName Namespace
     */
    public void setNsName(String NsName) {
        this.NsName = NsName;
    }

    public ImmutableTagRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImmutableTagRule(ImmutableTagRule source) {
        if (source.RepositoryPattern != null) {
            this.RepositoryPattern = new String(source.RepositoryPattern);
        }
        if (source.TagPattern != null) {
            this.TagPattern = new String(source.TagPattern);
        }
        if (source.RepositoryDecoration != null) {
            this.RepositoryDecoration = new String(source.RepositoryDecoration);
        }
        if (source.TagDecoration != null) {
            this.TagDecoration = new String(source.TagDecoration);
        }
        if (source.Disabled != null) {
            this.Disabled = new Boolean(source.Disabled);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.NsName != null) {
            this.NsName = new String(source.NsName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepositoryPattern", this.RepositoryPattern);
        this.setParamSimple(map, prefix + "TagPattern", this.TagPattern);
        this.setParamSimple(map, prefix + "RepositoryDecoration", this.RepositoryDecoration);
        this.setParamSimple(map, prefix + "TagDecoration", this.TagDecoration);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "NsName", this.NsName);

    }
}

