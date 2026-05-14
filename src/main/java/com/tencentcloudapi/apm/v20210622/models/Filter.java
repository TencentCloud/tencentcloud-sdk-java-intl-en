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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * <p>Filter method (=, !=, in)</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Filter dimension name</p><p>For details, see the actual interface field description</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>Filter value. Use comma-separated multiple values for in filtering method.</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get <p>Filter method (=, !=, in)</p> 
     * @return Type <p>Filter method (=, !=, in)</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Filter method (=, !=, in)</p>
     * @param Type <p>Filter method (=, !=, in)</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Filter dimension name</p><p>For details, see the actual interface field description</p> 
     * @return Key <p>Filter dimension name</p><p>For details, see the actual interface field description</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>Filter dimension name</p><p>For details, see the actual interface field description</p>
     * @param Key <p>Filter dimension name</p><p>For details, see the actual interface field description</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>Filter value. Use comma-separated multiple values for in filtering method.</p> 
     * @return Value <p>Filter value. Use comma-separated multiple values for in filtering method.</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>Filter value. Use comma-separated multiple values for in filtering method.</p>
     * @param Value <p>Filter value. Use comma-separated multiple values for in filtering method.</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

