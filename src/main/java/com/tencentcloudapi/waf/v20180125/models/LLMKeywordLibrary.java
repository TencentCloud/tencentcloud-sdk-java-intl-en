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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LLMKeywordLibrary extends AbstractModel {

    /**
    * Lexicon name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Lexicon description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Lexicon type. Valid values: custom and builtin.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Keyword list.
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * Lexicon rule id.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * List of referenced rule IDs.
    */
    @SerializedName("ReferencedRules")
    @Expose
    private String [] ReferencedRules;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Lexicon category. Valid values: black (default) and white. An empty value is treated as black.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get Lexicon name. 
     * @return Name Lexicon name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Lexicon name.
     * @param Name Lexicon name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Lexicon description. 
     * @return Description Lexicon description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Lexicon description.
     * @param Description Lexicon description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Lexicon type. Valid values: custom and builtin. 
     * @return Type Lexicon type. Valid values: custom and builtin.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Lexicon type. Valid values: custom and builtin.
     * @param Type Lexicon type. Valid values: custom and builtin.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Keyword list. 
     * @return Keywords Keyword list.
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set Keyword list.
     * @param Keywords Keyword list.
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get Lexicon rule id. 
     * @return RuleId Lexicon rule id.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Lexicon rule id.
     * @param RuleId Lexicon rule id.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get List of referenced rule IDs. 
     * @return ReferencedRules List of referenced rule IDs.
     */
    public String [] getReferencedRules() {
        return this.ReferencedRules;
    }

    /**
     * Set List of referenced rule IDs.
     * @param ReferencedRules List of referenced rule IDs.
     */
    public void setReferencedRules(String [] ReferencedRules) {
        this.ReferencedRules = ReferencedRules;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Lexicon category. Valid values: black (default) and white. An empty value is treated as black. 
     * @return Category Lexicon category. Valid values: black (default) and white. An empty value is treated as black.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Lexicon category. Valid values: black (default) and white. An empty value is treated as black.
     * @param Category Lexicon category. Valid values: black (default) and white. An empty value is treated as black.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public LLMKeywordLibrary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMKeywordLibrary(LLMKeywordLibrary source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.ReferencedRules != null) {
            this.ReferencedRules = new String[source.ReferencedRules.length];
            for (int i = 0; i < source.ReferencedRules.length; i++) {
                this.ReferencedRules[i] = new String(source.ReferencedRules[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArraySimple(map, prefix + "ReferencedRules.", this.ReferencedRules);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

