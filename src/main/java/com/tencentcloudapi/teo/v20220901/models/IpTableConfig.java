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

public class IpTableConfig extends AbstractModel {

    /**
    * Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The settings of the basic access control rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpTableRules")
    @Expose
    private IpTableRule [] IpTableRules;

    /**
     * Get Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Switch Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Switch Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The settings of the basic access control rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IpTableRules The settings of the basic access control rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public IpTableRule [] getIpTableRules() {
        return this.IpTableRules;
    }

    /**
     * Set The settings of the basic access control rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IpTableRules The settings of the basic access control rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpTableRules(IpTableRule [] IpTableRules) {
        this.IpTableRules = IpTableRules;
    }

    public IpTableConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpTableConfig(IpTableConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.IpTableRules != null) {
            this.IpTableRules = new IpTableRule[source.IpTableRules.length];
            for (int i = 0; i < source.IpTableRules.length; i++) {
                this.IpTableRules[i] = new IpTableRule(source.IpTableRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "IpTableRules.", this.IpTableRules);

    }
}

