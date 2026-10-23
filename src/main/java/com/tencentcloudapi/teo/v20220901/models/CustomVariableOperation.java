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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomVariableOperation extends AbstractModel {

    /**
    * <p>Sub-rule branch. This list currently only supports filling in one rule; additional entries are invalid.</p>
    */
    @SerializedName("Branches")
    @Expose
    private CustomVariableOperationRuleBranch [] Branches;

    /**
    * <p>Rule note. Multiple notes can be filled.</p>
    */
    @SerializedName("Description")
    @Expose
    private String [] Description;

    /**
     * Get <p>Sub-rule branch. This list currently only supports filling in one rule; additional entries are invalid.</p> 
     * @return Branches <p>Sub-rule branch. This list currently only supports filling in one rule; additional entries are invalid.</p>
     */
    public CustomVariableOperationRuleBranch [] getBranches() {
        return this.Branches;
    }

    /**
     * Set <p>Sub-rule branch. This list currently only supports filling in one rule; additional entries are invalid.</p>
     * @param Branches <p>Sub-rule branch. This list currently only supports filling in one rule; additional entries are invalid.</p>
     */
    public void setBranches(CustomVariableOperationRuleBranch [] Branches) {
        this.Branches = Branches;
    }

    /**
     * Get <p>Rule note. Multiple notes can be filled.</p> 
     * @return Description <p>Rule note. Multiple notes can be filled.</p>
     */
    public String [] getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Rule note. Multiple notes can be filled.</p>
     * @param Description <p>Rule note. Multiple notes can be filled.</p>
     */
    public void setDescription(String [] Description) {
        this.Description = Description;
    }

    public CustomVariableOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomVariableOperation(CustomVariableOperation source) {
        if (source.Branches != null) {
            this.Branches = new CustomVariableOperationRuleBranch[source.Branches.length];
            for (int i = 0; i < source.Branches.length; i++) {
                this.Branches[i] = new CustomVariableOperationRuleBranch(source.Branches[i]);
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

