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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckPolicy extends AbstractModel {

    /**
    * Health check policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * List of health check policy rules
    */
    @SerializedName("Rules")
    @Expose
    private HealthCheckPolicyRule [] Rules;

    /**
     * Get Health check policy name 
     * @return Name Health check policy name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Health check policy name
     * @param Name Health check policy name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get List of health check policy rules 
     * @return Rules List of health check policy rules
     */
    public HealthCheckPolicyRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set List of health check policy rules
     * @param Rules List of health check policy rules
     */
    public void setRules(HealthCheckPolicyRule [] Rules) {
        this.Rules = Rules;
    }

    public HealthCheckPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckPolicy(HealthCheckPolicy source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rules != null) {
            this.Rules = new HealthCheckPolicyRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new HealthCheckPolicyRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

