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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmptyValueConfig extends AbstractModel {

    /**
    * Numeric value field null style configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Number")
    @Expose
    private EmptyValue Number;

    /**
    * Style configuration for empty string fields
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("String")
    @Expose
    private EmptyValue String;

    /**
     * Get Numeric value field null style configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Number Numeric value field null style configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EmptyValue getNumber() {
        return this.Number;
    }

    /**
     * Set Numeric value field null style configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Number Numeric value field null style configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNumber(EmptyValue Number) {
        this.Number = Number;
    }

    /**
     * Get Style configuration for empty string fields
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return String Style configuration for empty string fields
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EmptyValue getString() {
        return this.String;
    }

    /**
     * Set Style configuration for empty string fields
Note: This field may return null, indicating that no valid values can be obtained.
     * @param String Style configuration for empty string fields
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setString(EmptyValue String) {
        this.String = String;
    }

    public EmptyValueConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmptyValueConfig(EmptyValueConfig source) {
        if (source.Number != null) {
            this.Number = new EmptyValue(source.Number);
        }
        if (source.String != null) {
            this.String = new EmptyValue(source.String);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Number.", this.Number);
        this.setParamObj(map, prefix + "String.", this.String);

    }
}

