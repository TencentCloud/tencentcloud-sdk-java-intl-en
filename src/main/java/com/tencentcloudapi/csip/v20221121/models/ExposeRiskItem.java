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

public class ExposeRiskItem extends AbstractModel {

    /**
    * Rule type
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Risk level
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * Rule name
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
     * Get Rule type 
     * @return RuleType Rule type
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type
     * @param RuleType Rule type
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Risk level 
     * @return Severity Risk level
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set Risk level
     * @param Severity Risk level
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get Rule name 
     * @return Title Rule name
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Rule name
     * @param Title Rule name
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public ExposeRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExposeRiskItem(ExposeRiskItem source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "Title", this.Title);

    }
}

