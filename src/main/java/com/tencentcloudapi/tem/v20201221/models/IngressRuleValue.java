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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IngressRuleValue extends AbstractModel {

    /**
    * Overall rule configuration
    */
    @SerializedName("Paths")
    @Expose
    private IngressRulePath [] Paths;

    /**
     * Get Overall rule configuration 
     * @return Paths Overall rule configuration
     */
    public IngressRulePath [] getPaths() {
        return this.Paths;
    }

    /**
     * Set Overall rule configuration
     * @param Paths Overall rule configuration
     */
    public void setPaths(IngressRulePath [] Paths) {
        this.Paths = Paths;
    }

    public IngressRuleValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IngressRuleValue(IngressRuleValue source) {
        if (source.Paths != null) {
            this.Paths = new IngressRulePath[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new IngressRulePath(source.Paths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Paths.", this.Paths);

    }
}

