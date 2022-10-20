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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSAcl extends AbstractModel{

    /**
    * Array of port filtering rules.
    */
    @SerializedName("DDoSAclRules")
    @Expose
    private DDoSAclRule [] DDoSAclRules;

    /**
    * Whether to clear port filtering rules. Values:
<li>`off`: Clear port filtering rules.</li>
<li>`on`: Configure port filtering rules. In this case, DDoSAclRules needs to be specified.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get Array of port filtering rules. 
     * @return DDoSAclRules Array of port filtering rules.
     */
    public DDoSAclRule [] getDDoSAclRules() {
        return this.DDoSAclRules;
    }

    /**
     * Set Array of port filtering rules.
     * @param DDoSAclRules Array of port filtering rules.
     */
    public void setDDoSAclRules(DDoSAclRule [] DDoSAclRules) {
        this.DDoSAclRules = DDoSAclRules;
    }

    /**
     * Get Whether to clear port filtering rules. Values:
<li>`off`: Clear port filtering rules.</li>
<li>`on`: Configure port filtering rules. In this case, DDoSAclRules needs to be specified.</li> 
     * @return Switch Whether to clear port filtering rules. Values:
<li>`off`: Clear port filtering rules.</li>
<li>`on`: Configure port filtering rules. In this case, DDoSAclRules needs to be specified.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to clear port filtering rules. Values:
<li>`off`: Clear port filtering rules.</li>
<li>`on`: Configure port filtering rules. In this case, DDoSAclRules needs to be specified.</li>
     * @param Switch Whether to clear port filtering rules. Values:
<li>`off`: Clear port filtering rules.</li>
<li>`on`: Configure port filtering rules. In this case, DDoSAclRules needs to be specified.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public DDoSAcl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAcl(DDoSAcl source) {
        if (source.DDoSAclRules != null) {
            this.DDoSAclRules = new DDoSAclRule[source.DDoSAclRules.length];
            for (int i = 0; i < source.DDoSAclRules.length; i++) {
                this.DDoSAclRules[i] = new DDoSAclRule(source.DDoSAclRules[i]);
            }
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DDoSAclRules.", this.DDoSAclRules);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

