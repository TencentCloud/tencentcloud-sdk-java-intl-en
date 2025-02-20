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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleEngineSubRule extends AbstractModel {

    /**
    * Sub-Rule branch.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Branches")
    @Expose
    private RuleBranch [] Branches;

    /**
    * Rule comments.
    */
    @SerializedName("Description")
    @Expose
    private String [] Description;

    /**
     * Get Sub-Rule branch.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return Branches Sub-Rule branch.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public RuleBranch [] getBranches() {
        return this.Branches;
    }

    /**
     * Set Sub-Rule branch.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param Branches Sub-Rule branch.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setBranches(RuleBranch [] Branches) {
        this.Branches = Branches;
    }

    /**
     * Get Rule comments. 
     * @return Description Rule comments.
     */
    public String [] getDescription() {
        return this.Description;
    }

    /**
     * Set Rule comments.
     * @param Description Rule comments.
     */
    public void setDescription(String [] Description) {
        this.Description = Description;
    }

    public RuleEngineSubRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleEngineSubRule(RuleEngineSubRule source) {
        if (source.Branches != null) {
            this.Branches = new RuleBranch[source.Branches.length];
            for (int i = 0; i < source.Branches.length; i++) {
                this.Branches[i] = new RuleBranch(source.Branches[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String[source.Description.length];
            for (int i = 0; i < source.Description.length; i++) {
                this.Description[i] = new String(source.Description[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Branches.", this.Branches);
        this.setParamArraySimple(map, prefix + "Description.", this.Description);

    }
}

