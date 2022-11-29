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

public class ClientIpCountry extends AbstractModel{

    /**
    * Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Header name of ClientIpCountry. This field is valid only when `Switch=on`.
If it is left empty, the default value `EO-Client-IPCountry` will be used.
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

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
     * Get Header name of ClientIpCountry. This field is valid only when `Switch=on`.
If it is left empty, the default value `EO-Client-IPCountry` will be used. 
     * @return HeaderName Header name of ClientIpCountry. This field is valid only when `Switch=on`.
If it is left empty, the default value `EO-Client-IPCountry` will be used.
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set Header name of ClientIpCountry. This field is valid only when `Switch=on`.
If it is left empty, the default value `EO-Client-IPCountry` will be used.
     * @param HeaderName Header name of ClientIpCountry. This field is valid only when `Switch=on`.
If it is left empty, the default value `EO-Client-IPCountry` will be used.
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    public ClientIpCountry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientIpCountry(ClientIpCountry source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.HeaderName != null) {
            this.HeaderName = new String(source.HeaderName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);

    }
}

