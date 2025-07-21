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

public class RateLimitingRules extends AbstractModel {

    /**
    * Definition list of precise rate limiting. when using ModifySecurityPolicy to modify the Web protection configuration: <br> <li> if the Rules parameter is not specified or its length is zero: clear all precision rate limiting configurations.</li> <li> if the RateLimitingRules parameter value is unspecified in the SecurityPolicy parameter: retain the existing custom rule configuration without modification.</li>.
    */
    @SerializedName("Rules")
    @Expose
    private RateLimitingRule [] Rules;

    /**
     * Get Definition list of precise rate limiting. when using ModifySecurityPolicy to modify the Web protection configuration: <br> <li> if the Rules parameter is not specified or its length is zero: clear all precision rate limiting configurations.</li> <li> if the RateLimitingRules parameter value is unspecified in the SecurityPolicy parameter: retain the existing custom rule configuration without modification.</li>. 
     * @return Rules Definition list of precise rate limiting. when using ModifySecurityPolicy to modify the Web protection configuration: <br> <li> if the Rules parameter is not specified or its length is zero: clear all precision rate limiting configurations.</li> <li> if the RateLimitingRules parameter value is unspecified in the SecurityPolicy parameter: retain the existing custom rule configuration without modification.</li>.
     */
    public RateLimitingRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Definition list of precise rate limiting. when using ModifySecurityPolicy to modify the Web protection configuration: <br> <li> if the Rules parameter is not specified or its length is zero: clear all precision rate limiting configurations.</li> <li> if the RateLimitingRules parameter value is unspecified in the SecurityPolicy parameter: retain the existing custom rule configuration without modification.</li>.
     * @param Rules Definition list of precise rate limiting. when using ModifySecurityPolicy to modify the Web protection configuration: <br> <li> if the Rules parameter is not specified or its length is zero: clear all precision rate limiting configurations.</li> <li> if the RateLimitingRules parameter value is unspecified in the SecurityPolicy parameter: retain the existing custom rule configuration without modification.</li>.
     */
    public void setRules(RateLimitingRule [] Rules) {
        this.Rules = Rules;
    }

    public RateLimitingRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitingRules(RateLimitingRules source) {
        if (source.Rules != null) {
            this.Rules = new RateLimitingRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RateLimitingRule(source.Rules[i]);
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

