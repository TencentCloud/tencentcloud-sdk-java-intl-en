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

public class ExceptionRules extends AbstractModel {

    /**
    * Definition list of exception Rules. when using ModifySecurityPolicy to modify Web protection configuration: <li>if the Rules parameter is not specified or the parameter length is zero: clear all exception rule configurations.</li><li>if the ExceptionRules parameter value is not specified in SecurityPolicy: keep existing exception rule configurations without modification.</li>.
    */
    @SerializedName("Rules")
    @Expose
    private ExceptionRule [] Rules;

    /**
     * Get Definition list of exception Rules. when using ModifySecurityPolicy to modify Web protection configuration: <li>if the Rules parameter is not specified or the parameter length is zero: clear all exception rule configurations.</li><li>if the ExceptionRules parameter value is not specified in SecurityPolicy: keep existing exception rule configurations without modification.</li>. 
     * @return Rules Definition list of exception Rules. when using ModifySecurityPolicy to modify Web protection configuration: <li>if the Rules parameter is not specified or the parameter length is zero: clear all exception rule configurations.</li><li>if the ExceptionRules parameter value is not specified in SecurityPolicy: keep existing exception rule configurations without modification.</li>.
     */
    public ExceptionRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Definition list of exception Rules. when using ModifySecurityPolicy to modify Web protection configuration: <li>if the Rules parameter is not specified or the parameter length is zero: clear all exception rule configurations.</li><li>if the ExceptionRules parameter value is not specified in SecurityPolicy: keep existing exception rule configurations without modification.</li>.
     * @param Rules Definition list of exception Rules. when using ModifySecurityPolicy to modify Web protection configuration: <li>if the Rules parameter is not specified or the parameter length is zero: clear all exception rule configurations.</li><li>if the ExceptionRules parameter value is not specified in SecurityPolicy: keep existing exception rule configurations without modification.</li>.
     */
    public void setRules(ExceptionRule [] Rules) {
        this.Rules = Rules;
    }

    public ExceptionRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExceptionRules(ExceptionRules source) {
        if (source.Rules != null) {
            this.Rules = new ExceptionRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new ExceptionRule(source.Rules[i]);
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

