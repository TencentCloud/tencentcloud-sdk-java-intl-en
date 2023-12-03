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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginAuthentication extends AbstractModel {

    /**
    * Whether to enable advanced origin-pull authentication. Values:
`on`: Enable
`off`: Disable

Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Authentication type configuration A
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TypeA")
    @Expose
    private OriginAuthenticationTypeA TypeA;

    /**
     * Get Whether to enable advanced origin-pull authentication. Values:
`on`: Enable
`off`: Disable

Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Switch Whether to enable advanced origin-pull authentication. Values:
`on`: Enable
`off`: Disable

Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable advanced origin-pull authentication. Values:
`on`: Enable
`off`: Disable

Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Switch Whether to enable advanced origin-pull authentication. Values:
`on`: Enable
`off`: Disable

Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Authentication type configuration A
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TypeA Authentication type configuration A
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public OriginAuthenticationTypeA getTypeA() {
        return this.TypeA;
    }

    /**
     * Set Authentication type configuration A
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TypeA Authentication type configuration A
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTypeA(OriginAuthenticationTypeA TypeA) {
        this.TypeA = TypeA;
    }

    public OriginAuthentication() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginAuthentication(OriginAuthentication source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.TypeA != null) {
            this.TypeA = new OriginAuthenticationTypeA(source.TypeA);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "TypeA.", this.TypeA);

    }
}

