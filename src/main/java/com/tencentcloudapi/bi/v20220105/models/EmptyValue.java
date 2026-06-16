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

public class EmptyValue extends AbstractModel {

    /**
    * Empty value display style type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Display style type for null values corresponds to specific display string
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Custom")
    @Expose
    private String Custom;

    /**
     * Get Empty value display style type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Empty value display style type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Empty value display style type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Empty value display style type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Display style type for null values corresponds to specific display string
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Custom Display style type for null values corresponds to specific display string
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCustom() {
        return this.Custom;
    }

    /**
     * Set Display style type for null values corresponds to specific display string
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Custom Display style type for null values corresponds to specific display string
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCustom(String Custom) {
        this.Custom = Custom;
    }

    public EmptyValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmptyValue(EmptyValue source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Custom != null) {
            this.Custom = new String(source.Custom);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Custom", this.Custom);

    }
}

