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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrmInfo extends AbstractModel{

    /**
    * The encryption type.
<li>`simpleaes`: AES-128 encryption.</li>
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The AES-128 encryption details.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("SimpleAesDrm")
    @Expose
    private SimpleAesDrm SimpleAesDrm;

    /**
     * Get The encryption type.
<li>`simpleaes`: AES-128 encryption.</li>
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Type The encryption type.
<li>`simpleaes`: AES-128 encryption.</li>
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The encryption type.
<li>`simpleaes`: AES-128 encryption.</li>
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Type The encryption type.
<li>`simpleaes`: AES-128 encryption.</li>
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The AES-128 encryption details.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return SimpleAesDrm The AES-128 encryption details.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public SimpleAesDrm getSimpleAesDrm() {
        return this.SimpleAesDrm;
    }

    /**
     * Set The AES-128 encryption details.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param SimpleAesDrm The AES-128 encryption details.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setSimpleAesDrm(SimpleAesDrm SimpleAesDrm) {
        this.SimpleAesDrm = SimpleAesDrm;
    }

    public DrmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrmInfo(DrmInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SimpleAesDrm != null) {
            this.SimpleAesDrm = new SimpleAesDrm(source.SimpleAesDrm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "SimpleAesDrm.", this.SimpleAesDrm);

    }
}

