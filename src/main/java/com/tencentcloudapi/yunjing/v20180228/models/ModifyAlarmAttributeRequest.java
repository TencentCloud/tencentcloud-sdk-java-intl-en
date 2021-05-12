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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmAttributeRequest extends AbstractModel{

    /**
    * Alarm item.
<li>Offline: CWP is offline</li>
<li>Malware: trojan event</li>
<li>NonlocalLogin: unusual login location discovered</li>
<li>CrackSuccess: brute force attack succeeded</li>
    */
    @SerializedName("Attribute")
    @Expose
    private String Attribute;

    /**
    * Alarm item attributes.
<li>CLOSE: disabled</li>
<li>OPEN: enabled</li>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Alarm item.
<li>Offline: CWP is offline</li>
<li>Malware: trojan event</li>
<li>NonlocalLogin: unusual login location discovered</li>
<li>CrackSuccess: brute force attack succeeded</li> 
     * @return Attribute Alarm item.
<li>Offline: CWP is offline</li>
<li>Malware: trojan event</li>
<li>NonlocalLogin: unusual login location discovered</li>
<li>CrackSuccess: brute force attack succeeded</li>
     */
    public String getAttribute() {
        return this.Attribute;
    }

    /**
     * Set Alarm item.
<li>Offline: CWP is offline</li>
<li>Malware: trojan event</li>
<li>NonlocalLogin: unusual login location discovered</li>
<li>CrackSuccess: brute force attack succeeded</li>
     * @param Attribute Alarm item.
<li>Offline: CWP is offline</li>
<li>Malware: trojan event</li>
<li>NonlocalLogin: unusual login location discovered</li>
<li>CrackSuccess: brute force attack succeeded</li>
     */
    public void setAttribute(String Attribute) {
        this.Attribute = Attribute;
    }

    /**
     * Get Alarm item attributes.
<li>CLOSE: disabled</li>
<li>OPEN: enabled</li> 
     * @return Value Alarm item attributes.
<li>CLOSE: disabled</li>
<li>OPEN: enabled</li>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Alarm item attributes.
<li>CLOSE: disabled</li>
<li>OPEN: enabled</li>
     * @param Value Alarm item attributes.
<li>CLOSE: disabled</li>
<li>OPEN: enabled</li>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public ModifyAlarmAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmAttributeRequest(ModifyAlarmAttributeRequest source) {
        if (source.Attribute != null) {
            this.Attribute = new String(source.Attribute);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Attribute", this.Attribute);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

