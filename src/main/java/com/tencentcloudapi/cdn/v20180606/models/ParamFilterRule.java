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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamFilterRule extends AbstractModel {

    /**
    * Parameter name.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Numeric array. value range: less than 10.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * http status code (only supports 403).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReturnCode")
    @Expose
    private String ReturnCode;

    /**
     * Get Parameter name.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Key Parameter name.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Parameter name.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Key Parameter name.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Numeric array. value range: less than 10.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Values Numeric array. value range: less than 10.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Numeric array. value range: less than 10.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Values Numeric array. value range: less than 10.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get http status code (only supports 403).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReturnCode http status code (only supports 403).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set http status code (only supports 403).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReturnCode http status code (only supports 403).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    public ParamFilterRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamFilterRule(ParamFilterRule source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new String(source.ReturnCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);

    }
}

