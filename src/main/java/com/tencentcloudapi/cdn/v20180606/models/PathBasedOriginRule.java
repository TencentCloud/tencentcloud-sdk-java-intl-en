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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PathBasedOriginRule extends AbstractModel{

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
    @SerializedName("Origin")
    @Expose
    private String [] Origin;

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
     * @return Origin 
     */
    public String [] getOrigin() {
        return this.Origin;
    }

    /**
     * Set 
     * @param Origin 
     */
    public void setOrigin(String [] Origin) {
        this.Origin = Origin;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamArraySimple(map, prefix + "Origin.", this.Origin);

    }
}

