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

public class ScdnAclGroup extends AbstractModel{

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Specific configurations
    */
    @SerializedName("Configure")
    @Expose
    private ScdnAclRule [] Configure;

    /**
    * Rule action, which is generally `refuse`.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * Whether the rule is effective. Valid values: `active` and `inactive`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Rule name 
     * @return RuleName Rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
     * @param RuleName Rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Specific configurations 
     * @return Configure Specific configurations
     */
    public ScdnAclRule [] getConfigure() {
        return this.Configure;
    }

    /**
     * Set Specific configurations
     * @param Configure Specific configurations
     */
    public void setConfigure(ScdnAclRule [] Configure) {
        this.Configure = Configure;
    }

    /**
     * Get Rule action, which is generally `refuse`. 
     * @return Result Rule action, which is generally `refuse`.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set Rule action, which is generally `refuse`.
     * @param Result Rule action, which is generally `refuse`.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get Whether the rule is effective. Valid values: `active` and `inactive`. 
     * @return Status Whether the rule is effective. Valid values: `active` and `inactive`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the rule is effective. Valid values: `active` and `inactive`.
     * @param Status Whether the rule is effective. Valid values: `active` and `inactive`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ScdnAclGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnAclGroup(ScdnAclGroup source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Configure != null) {
            this.Configure = new ScdnAclRule[source.Configure.length];
            for (int i = 0; i < source.Configure.length; i++) {
                this.Configure[i] = new ScdnAclRule(source.Configure[i]);
            }
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "Configure.", this.Configure);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

