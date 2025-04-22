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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigParams extends AbstractModel {

    /**
    * Name.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParameterName")
    @Expose
    private String ParameterName;

    /**
    * Value.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParameterValue")
    @Expose
    private String ParameterValue;

    /**
    * Value before modification.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParameterOldValue")
    @Expose
    private String ParameterOldValue;

    /**
     * Get Name.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParameterName Name.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParameterName() {
        return this.ParameterName;
    }

    /**
     * Set Name.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParameterName Name.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParameterName(String ParameterName) {
        this.ParameterName = ParameterName;
    }

    /**
     * Get Value.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParameterValue Value.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParameterValue() {
        return this.ParameterValue;
    }

    /**
     * Set Value.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParameterValue Value.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParameterValue(String ParameterValue) {
        this.ParameterValue = ParameterValue;
    }

    /**
     * Get Value before modification.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParameterOldValue Value before modification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParameterOldValue() {
        return this.ParameterOldValue;
    }

    /**
     * Set Value before modification.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParameterOldValue Value before modification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParameterOldValue(String ParameterOldValue) {
        this.ParameterOldValue = ParameterOldValue;
    }

    public ConfigParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigParams(ConfigParams source) {
        if (source.ParameterName != null) {
            this.ParameterName = new String(source.ParameterName);
        }
        if (source.ParameterValue != null) {
            this.ParameterValue = new String(source.ParameterValue);
        }
        if (source.ParameterOldValue != null) {
            this.ParameterOldValue = new String(source.ParameterOldValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParameterName", this.ParameterName);
        this.setParamSimple(map, prefix + "ParameterValue", this.ParameterValue);
        this.setParamSimple(map, prefix + "ParameterOldValue", this.ParameterOldValue);

    }
}

