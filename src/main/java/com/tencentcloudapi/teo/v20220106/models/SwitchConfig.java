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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchConfig extends AbstractModel{

    /**
    * Switch that controls all web security configuration: basic web protection, custom rules, and rate limiting
    */
    @SerializedName("WebSwitch")
    @Expose
    private String WebSwitch;

    /**
     * Get Switch that controls all web security configuration: basic web protection, custom rules, and rate limiting 
     * @return WebSwitch Switch that controls all web security configuration: basic web protection, custom rules, and rate limiting
     */
    public String getWebSwitch() {
        return this.WebSwitch;
    }

    /**
     * Set Switch that controls all web security configuration: basic web protection, custom rules, and rate limiting
     * @param WebSwitch Switch that controls all web security configuration: basic web protection, custom rules, and rate limiting
     */
    public void setWebSwitch(String WebSwitch) {
        this.WebSwitch = WebSwitch;
    }

    public SwitchConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchConfig(SwitchConfig source) {
        if (source.WebSwitch != null) {
            this.WebSwitch = new String(source.WebSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WebSwitch", this.WebSwitch);

    }
}

