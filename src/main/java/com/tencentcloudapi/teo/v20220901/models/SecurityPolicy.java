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

public class SecurityPolicy extends AbstractModel {

    /**
    * Custom rules. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CustomRules")
    @Expose
    private CustomRules CustomRules;

    /**
    * Managed. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ManagedRules")
    @Expose
    private ManagedRules ManagedRules;

    /**
     * Get Custom rules. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CustomRules Custom rules. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public CustomRules getCustomRules() {
        return this.CustomRules;
    }

    /**
     * Set Custom rules. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CustomRules Custom rules. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCustomRules(CustomRules CustomRules) {
        this.CustomRules = CustomRules;
    }

    /**
     * Get Managed. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ManagedRules Managed. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ManagedRules getManagedRules() {
        return this.ManagedRules;
    }

    /**
     * Set Managed. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ManagedRules Managed. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setManagedRules(ManagedRules ManagedRules) {
        this.ManagedRules = ManagedRules;
    }

    public SecurityPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityPolicy(SecurityPolicy source) {
        if (source.CustomRules != null) {
            this.CustomRules = new CustomRules(source.CustomRules);
        }
        if (source.ManagedRules != null) {
            this.ManagedRules = new ManagedRules(source.ManagedRules);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CustomRules.", this.CustomRules);
        this.setParamObj(map, prefix + "ManagedRules.", this.ManagedRules);

    }
}

