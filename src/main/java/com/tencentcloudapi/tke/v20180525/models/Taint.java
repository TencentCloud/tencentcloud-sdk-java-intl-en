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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Taint extends AbstractModel {

    /**
    * Key of the taint
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Value of the taint
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Effect of the taint
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
     * Get Key of the taint 
     * @return Key Key of the taint
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key of the taint
     * @param Key Key of the taint
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Value of the taint 
     * @return Value Value of the taint
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value of the taint
     * @param Value Value of the taint
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Effect of the taint 
     * @return Effect Effect of the taint
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set Effect of the taint
     * @param Effect Effect of the taint
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

