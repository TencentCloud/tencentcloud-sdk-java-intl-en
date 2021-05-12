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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResponseHeader extends AbstractModel{

    /**
    * Custom response header switch. Valid values: on, off.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Custom response header rule array.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HeaderRules")
    @Expose
    private HttpHeaderPathRule [] HeaderRules;

    /**
     * Get Custom response header switch. Valid values: on, off. 
     * @return Switch Custom response header switch. Valid values: on, off.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Custom response header switch. Valid values: on, off.
     * @param Switch Custom response header switch. Valid values: on, off.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Custom response header rule array.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HeaderRules Custom response header rule array.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public HttpHeaderPathRule [] getHeaderRules() {
        return this.HeaderRules;
    }

    /**
     * Set Custom response header rule array.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HeaderRules Custom response header rule array.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHeaderRules(HttpHeaderPathRule [] HeaderRules) {
        this.HeaderRules = HeaderRules;
    }

    public ResponseHeader() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResponseHeader(ResponseHeader source) {
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

