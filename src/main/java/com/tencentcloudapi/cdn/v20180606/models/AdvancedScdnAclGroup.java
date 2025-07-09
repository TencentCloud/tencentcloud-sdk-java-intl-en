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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedScdnAclGroup extends AbstractModel {

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
    private AdvancedScdnAclRule [] Configure;

    /**
    * Action. Valid values: `intercept` and `redirect`.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * Whether the rule is activated. Valid values: `active` and `inactive`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error page configuration
    */
    @SerializedName("ErrorPage")
    @Expose
    private ScdnErrorPage ErrorPage;

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
    public AdvancedScdnAclRule [] getConfigure() {
        return this.Configure;
    }

    /**
     * Set Specific configurations
     * @param Configure Specific configurations
     */
    public void setConfigure(AdvancedScdnAclRule [] Configure) {
        this.Configure = Configure;
    }

    /**
     * Get Action. Valid values: `intercept` and `redirect`. 
     * @return Result Action. Valid values: `intercept` and `redirect`.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set Action. Valid values: `intercept` and `redirect`.
     * @param Result Action. Valid values: `intercept` and `redirect`.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get Whether the rule is activated. Valid values: `active` and `inactive`. 
     * @return Status Whether the rule is activated. Valid values: `active` and `inactive`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the rule is activated. Valid values: `active` and `inactive`.
     * @param Status Whether the rule is activated. Valid values: `active` and `inactive`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error page configuration 
     * @return ErrorPage Error page configuration
     */
    public ScdnErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set Error page configuration
     * @param ErrorPage Error page configuration
     */
    public void setErrorPage(ScdnErrorPage ErrorPage) {
        this.ErrorPage = ErrorPage;
    }

    public AdvancedScdnAclGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedScdnAclGroup(AdvancedScdnAclGroup source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Configure != null) {
            this.Configure = new AdvancedScdnAclRule[source.Configure.length];
            for (int i = 0; i < source.Configure.length; i++) {
                this.Configure[i] = new AdvancedScdnAclRule(source.Configure[i]);
            }
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorPage != null) {
            this.ErrorPage = new ScdnErrorPage(source.ErrorPage);
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
        this.setParamObj(map, prefix + "ErrorPage.", this.ErrorPage);

    }
}

