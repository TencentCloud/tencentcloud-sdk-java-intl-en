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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Referer extends AbstractModel {

    /**
    * Referrer blocklist/allowlist configuration switch. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * referer blocklist/allowlist rule configuration
    */
    @SerializedName("RefererRules")
    @Expose
    private RefererRule [] RefererRules;

    /**
     * Get Referrer blocklist/allowlist configuration switch. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li> 
     * @return Switch Referrer blocklist/allowlist configuration switch. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Referrer blocklist/allowlist configuration switch. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     * @param Switch Referrer blocklist/allowlist configuration switch. Value:
<li>`on`: Enable;</li>
<li>`off`: Cache.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get referer blocklist/allowlist rule configuration 
     * @return RefererRules referer blocklist/allowlist rule configuration
     */
    public RefererRule [] getRefererRules() {
        return this.RefererRules;
    }

    /**
     * Set referer blocklist/allowlist rule configuration
     * @param RefererRules referer blocklist/allowlist rule configuration
     */
    public void setRefererRules(RefererRule [] RefererRules) {
        this.RefererRules = RefererRules;
    }

    public Referer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Referer(Referer source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.RefererRules != null) {
            this.RefererRules = new RefererRule[source.RefererRules.length];
            for (int i = 0; i < source.RefererRules.length; i++) {
                this.RefererRules[i] = new RefererRule(source.RefererRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "RefererRules.", this.RefererRules);

    }
}

