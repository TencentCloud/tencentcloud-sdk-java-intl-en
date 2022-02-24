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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Pair extends AbstractModel{

    /**
    * Key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * `default``: Custom. `reserved`: System variable. `referenced`: Referenced configuration item.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Configuration name
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
     * Get Key 
     * @return Key Key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key
     * @param Key Key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Value 
     * @return Value Value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value
     * @param Value Value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get `default``: Custom. `reserved`: System variable. `referenced`: Referenced configuration item.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return Type `default``: Custom. `reserved`: System variable. `referenced`: Referenced configuration item.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set `default``: Custom. `reserved`: System variable. `referenced`: Referenced configuration item.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param Type `default``: Custom. `reserved`: System variable. `referenced`: Referenced configuration item.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Configuration name
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return Config Configuration name
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set Configuration name
Note: This field may return `null`, indicating that no valid value can be found.
     * @param Config Configuration name
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    public Pair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Pair(Pair source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Config", this.Config);

    }
}

