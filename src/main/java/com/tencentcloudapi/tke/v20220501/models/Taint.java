/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Taint extends AbstractModel {

    /**
    * Key of Taint
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Value of Taint
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Effect of Taint
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
     * Get Key of Taint 
     * @return Key Key of Taint
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key of Taint
     * @param Key Key of Taint
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Value of Taint 
     * @return Value Value of Taint
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value of Taint
     * @param Value Value of Taint
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Effect of Taint 
     * @return Effect Effect of Taint
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set Effect of Taint
     * @param Effect Effect of Taint
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    public Taint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Taint(Taint source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Effect != null) {
            this.Effect = new String(source.Effect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Effect", this.Effect);

    }
}

