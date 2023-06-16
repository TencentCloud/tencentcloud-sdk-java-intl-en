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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RefererRule extends AbstractModel{

    /**
    * 
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * 
    */
    @SerializedName("RefererType")
    @Expose
    private String RefererType;

    /**
    * 
    */
    @SerializedName("Referers")
    @Expose
    private String [] Referers;

    /**
    * 
    */
    @SerializedName("AllowEmpty")
    @Expose
    private Boolean AllowEmpty;

    /**
     * Get  
     * @return RuleType 
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 
     * @param RuleType 
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get  
     * @return RulePaths 
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set 
     * @param RulePaths 
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get  
     * @return RefererType 
     */
    public String getRefererType() {
        return this.RefererType;
    }

    /**
     * Set 
     * @param RefererType 
     */
    public void setRefererType(String RefererType) {
        this.RefererType = RefererType;
    }

    /**
     * Get  
     * @return Referers 
     */
    public String [] getReferers() {
        return this.Referers;
    }

    /**
     * Set 
     * @param Referers 
     */
    public void setReferers(String [] Referers) {
        this.Referers = Referers;
    }

    /**
     * Get  
     * @return AllowEmpty 
     */
    public Boolean getAllowEmpty() {
        return this.AllowEmpty;
    }

    /**
     * Set 
     * @param AllowEmpty 
     */
    public void setAllowEmpty(Boolean AllowEmpty) {
        this.AllowEmpty = AllowEmpty;
    }

    public RefererRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefererRule(RefererRule source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
        if (source.RefererType != null) {
            this.RefererType = new String(source.RefererType);
        }
        if (source.Referers != null) {
            this.Referers = new String[source.Referers.length];
            for (int i = 0; i < source.Referers.length; i++) {
                this.Referers[i] = new String(source.Referers[i]);
            }
        }
        if (source.AllowEmpty != null) {
            this.AllowEmpty = new Boolean(source.AllowEmpty);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamSimple(map, prefix + "RefererType", this.RefererType);
        this.setParamArraySimple(map, prefix + "Referers.", this.Referers);
        this.setParamSimple(map, prefix + "AllowEmpty", this.AllowEmpty);

    }
}

