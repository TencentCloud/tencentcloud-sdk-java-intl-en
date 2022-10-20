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

public class DDoSAllowBlock extends AbstractModel{

    /**
    * Array of objects in the blocklist/allowlist configuration.
    */
    @SerializedName("DDoSAllowBlockRules")
    @Expose
    private DDoSAllowBlockRule [] DDoSAllowBlockRules;

    /**
    * Whether to clear the blocklist/allowlist. Values:
<li>`off`: Disable.</li>
<li>`on`: Enable. In this case, UserAllowBlockIp needs to be specified.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get Array of objects in the blocklist/allowlist configuration. 
     * @return DDoSAllowBlockRules Array of objects in the blocklist/allowlist configuration.
     */
    public DDoSAllowBlockRule [] getDDoSAllowBlockRules() {
        return this.DDoSAllowBlockRules;
    }

    /**
     * Set Array of objects in the blocklist/allowlist configuration.
     * @param DDoSAllowBlockRules Array of objects in the blocklist/allowlist configuration.
     */
    public void setDDoSAllowBlockRules(DDoSAllowBlockRule [] DDoSAllowBlockRules) {
        this.DDoSAllowBlockRules = DDoSAllowBlockRules;
    }

    /**
     * Get Whether to clear the blocklist/allowlist. Values:
<li>`off`: Disable.</li>
<li>`on`: Enable. In this case, UserAllowBlockIp needs to be specified.</li> 
     * @return Switch Whether to clear the blocklist/allowlist. Values:
<li>`off`: Disable.</li>
<li>`on`: Enable. In this case, UserAllowBlockIp needs to be specified.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to clear the blocklist/allowlist. Values:
<li>`off`: Disable.</li>
<li>`on`: Enable. In this case, UserAllowBlockIp needs to be specified.</li>
     * @param Switch Whether to clear the blocklist/allowlist. Values:
<li>`off`: Disable.</li>
<li>`on`: Enable. In this case, UserAllowBlockIp needs to be specified.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public DDoSAllowBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAllowBlock(DDoSAllowBlock source) {
        if (source.DDoSAllowBlockRules != null) {
            this.DDoSAllowBlockRules = new DDoSAllowBlockRule[source.DDoSAllowBlockRules.length];
            for (int i = 0; i < source.DDoSAllowBlockRules.length; i++) {
                this.DDoSAllowBlockRules[i] = new DDoSAllowBlockRule(source.DDoSAllowBlockRules[i]);
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
        this.setParamArrayObj(map, prefix + "DDoSAllowBlockRules.", this.DDoSAllowBlockRules);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

