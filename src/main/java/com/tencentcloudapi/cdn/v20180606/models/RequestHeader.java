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

public class RequestHeader extends AbstractModel {

    /**
    * Custom request header configuration switch
`on`: Enable
`off`: Disable
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Custom request header configuration rules
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("HeaderRules")
    @Expose
    private HttpHeaderPathRule [] HeaderRules;

    /**
     * Get Custom request header configuration switch
`on`: Enable
`off`: Disable 
     * @return Switch Custom request header configuration switch
`on`: Enable
`off`: Disable
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Custom request header configuration switch
`on`: Enable
`off`: Disable
     * @param Switch Custom request header configuration switch
`on`: Enable
`off`: Disable
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Custom request header configuration rules
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return HeaderRules Custom request header configuration rules
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public HttpHeaderPathRule [] getHeaderRules() {
        return this.HeaderRules;
    }

    /**
     * Set Custom request header configuration rules
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param HeaderRules Custom request header configuration rules
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHeaderRules(HttpHeaderPathRule [] HeaderRules) {
        this.HeaderRules = HeaderRules;
    }

    public RequestHeader() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestHeader(RequestHeader source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.HeaderRules != null) {
            this.HeaderRules = new HttpHeaderPathRule[source.HeaderRules.length];
            for (int i = 0; i < source.HeaderRules.length; i++) {
                this.HeaderRules[i] = new HttpHeaderPathRule(source.HeaderRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "HeaderRules.", this.HeaderRules);

    }
}

