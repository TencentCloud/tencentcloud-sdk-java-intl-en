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
    * The settings of the block page that applies managed rules. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WafDropPageDetail")
    @Expose
    private DropPageDetail WafDropPageDetail;

    /**
    * The settings of the block page that applies custom rules. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get The settings of the block page that applies managed rules. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WafDropPageDetail The settings of the block page that applies managed rules. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DropPageDetail getWafDropPageDetail() {
        return this.WafDropPageDetail;
    }

    /**
     * Set The settings of the block page that applies managed rules. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WafDropPageDetail The settings of the block page that applies managed rules. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWafDropPageDetail(DropPageDetail WafDropPageDetail) {
        this.WafDropPageDetail = WafDropPageDetail;
    }

    /**
     * Get The settings of the block page that applies custom rules. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AclDropPageDetail The settings of the block page that applies custom rules. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DropPageDetail getAclDropPageDetail() {
        return this.AclDropPageDetail;
    }

    /**
     * Set The settings of the block page that applies custom rules. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AclDropPageDetail The settings of the block page that applies custom rules. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
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

