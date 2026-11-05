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

public class CustomRules extends AbstractModel {

    /**
    * Definition list of custom rules.<br>When using ModifySecurityPolicy to modify Web protection configuration: <br> - If the Rules parameter is not specified, or the parameter length of Rules is zero: clear ALL custom rule configurations.<br> - If the CustomRules parameter value is not specified in the SecurityPolicy parameter: keep the existing custom rule configuration and do not modify it.
    */
    @SerializedName("Rules")
    @Expose
    private CustomRule [] Rules;

    /**
     * Get Definition list of custom rules.<br>When using ModifySecurityPolicy to modify Web protection configuration: <br> - If the Rules parameter is not specified, or the parameter length of Rules is zero: clear ALL custom rule configurations.<br> - If the CustomRules parameter value is not specified in the SecurityPolicy parameter: keep the existing custom rule configuration and do not modify it. 
     * @return Rules Definition list of custom rules.<br>When using ModifySecurityPolicy to modify Web protection configuration: <br> - If the Rules parameter is not specified, or the parameter length of Rules is zero: clear ALL custom rule configurations.<br> - If the CustomRules parameter value is not specified in the SecurityPolicy parameter: keep the existing custom rule configuration and do not modify it.
     */
    public CustomRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Definition list of custom rules.<br>When using ModifySecurityPolicy to modify Web protection configuration: <br> - If the Rules parameter is not specified, or the parameter length of Rules is zero: clear ALL custom rule configurations.<br> - If the CustomRules parameter value is not specified in the SecurityPolicy parameter: keep the existing custom rule configuration and do not modify it.
     * @param Rules Definition list of custom rules.<br>When using ModifySecurityPolicy to modify Web protection configuration: <br> - If the Rules parameter is not specified, or the parameter length of Rules is zero: clear ALL custom rule configurations.<br> - If the CustomRules parameter value is not specified in the SecurityPolicy parameter: keep the existing custom rule configuration and do not modify it.
     */
    public void setRules(CustomRule [] Rules) {
        this.Rules = Rules;
    }

    public CustomRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomRules(CustomRules source) {
        if (source.Rules != null) {
            this.Rules = new CustomRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new CustomRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

