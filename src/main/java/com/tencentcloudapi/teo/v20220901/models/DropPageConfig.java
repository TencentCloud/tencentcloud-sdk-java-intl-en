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

public class DropPageConfig extends AbstractModel {

    /**
    * Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Intercept page configuration for Waf(managed rules) module. if null, historical configuration is used by default.
    */
    @SerializedName("WafDropPageDetail")
    @Expose
    private DropPageDetail WafDropPageDetail;

    /**
    * Interception page configuration for custom pages. if null, use the last set configuration by default.
    */
    @SerializedName("AclDropPageDetail")
    @Expose
    private DropPageDetail AclDropPageDetail;

    /**
     * Get Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return Switch Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param Switch Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Intercept page configuration for Waf(managed rules) module. if null, historical configuration is used by default. 
     * @return WafDropPageDetail Intercept page configuration for Waf(managed rules) module. if null, historical configuration is used by default.
     */
    public DropPageDetail getWafDropPageDetail() {
        return this.WafDropPageDetail;
    }

    /**
     * Set Intercept page configuration for Waf(managed rules) module. if null, historical configuration is used by default.
     * @param WafDropPageDetail Intercept page configuration for Waf(managed rules) module. if null, historical configuration is used by default.
     */
    public void setWafDropPageDetail(DropPageDetail WafDropPageDetail) {
        this.WafDropPageDetail = WafDropPageDetail;
    }

    /**
     * Get Interception page configuration for custom pages. if null, use the last set configuration by default. 
     * @return AclDropPageDetail Interception page configuration for custom pages. if null, use the last set configuration by default.
     */
    public DropPageDetail getAclDropPageDetail() {
        return this.AclDropPageDetail;
    }

    /**
     * Set Interception page configuration for custom pages. if null, use the last set configuration by default.
     * @param AclDropPageDetail Interception page configuration for custom pages. if null, use the last set configuration by default.
     */
    public void setAclDropPageDetail(DropPageDetail AclDropPageDetail) {
        this.AclDropPageDetail = AclDropPageDetail;
    }

    public DropPageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DropPageConfig(DropPageConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.WafDropPageDetail != null) {
            this.WafDropPageDetail = new DropPageDetail(source.WafDropPageDetail);
        }
        if (source.AclDropPageDetail != null) {
            this.AclDropPageDetail = new DropPageDetail(source.AclDropPageDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "WafDropPageDetail.", this.WafDropPageDetail);
        this.setParamObj(map, prefix + "AclDropPageDetail.", this.AclDropPageDetail);

    }
}

