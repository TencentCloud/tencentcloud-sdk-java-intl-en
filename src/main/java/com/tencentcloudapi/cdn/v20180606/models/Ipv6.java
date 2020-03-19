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

public class Ipv6 extends AbstractModel{

    /**
    * Whether to enable the IPv6 feature for a domain name. Values include `on` or `off`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get Whether to enable the IPv6 feature for a domain name. Values include `on` or `off`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Switch Whether to enable the IPv6 feature for a domain name. Values include `on` or `off`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable the IPv6 feature for a domain name. Values include `on` or `off`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Switch Whether to enable the IPv6 feature for a domain name. Values include `on` or `off`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

