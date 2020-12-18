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

public class ScdnConfig extends AbstractModel{

    /**
    * Valid values: `on` and `off`.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Custom CC attack defense rule
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Rules")
    @Expose
    private ScdnCCRules [] Rules;

    /**
     * Get Valid values: `on` and `off`. 
     * @return Switch Valid values: `on` and `off`.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Valid values: `on` and `off`.
     * @param Switch Valid values: `on` and `off`.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Custom CC attack defense rule
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Rules Custom CC attack defense rule
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ScdnCCRules [] getRules() {
        return this.Rules;
    }

    /**
     * Set Custom CC attack defense rule
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Rules Custom CC attack defense rule
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRules(ScdnCCRules [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

