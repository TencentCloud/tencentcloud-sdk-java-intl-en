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

public class ShareCname extends AbstractModel {

    /**
    * Whether to enable Shared CNAME. Values:
`on`: Enable. When enabled, it uses a shared CNAME.
`off`: Disable. When disabled, it uses a default CNAME.

    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Shared CNAME to be configured
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
     * Get Whether to enable Shared CNAME. Values:
`on`: Enable. When enabled, it uses a shared CNAME.
`off`: Disable. When disabled, it uses a default CNAME.
 
     * @return Switch Whether to enable Shared CNAME. Values:
`on`: Enable. When enabled, it uses a shared CNAME.
`off`: Disable. When disabled, it uses a default CNAME.

     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable Shared CNAME. Values:
`on`: Enable. When enabled, it uses a shared CNAME.
`off`: Disable. When disabled, it uses a default CNAME.

     * @param Switch Whether to enable Shared CNAME. Values:
`on`: Enable. When enabled, it uses a shared CNAME.
`off`: Disable. When disabled, it uses a default CNAME.

     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Shared CNAME to be configured
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Cname Shared CNAME to be configured
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set Shared CNAME to be configured
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Cname Shared CNAME to be configured
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public ShareCname() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareCname(ShareCname source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Cname", this.Cname);

    }
}

