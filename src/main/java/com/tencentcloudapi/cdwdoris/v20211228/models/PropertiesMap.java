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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PropertiesMap extends AbstractModel {

    /**
    * key
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PropertyKey")
    @Expose
    private String PropertyKey;

    /**
    * value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PropertyValue")
    @Expose
    private String PropertyValue;

    /**
     * Get key
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PropertyKey key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPropertyKey() {
        return this.PropertyKey;
    }

    /**
     * Set key
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PropertyKey key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPropertyKey(String PropertyKey) {
        this.PropertyKey = PropertyKey;
    }

    /**
     * Get value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PropertyValue value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPropertyValue() {
        return this.PropertyValue;
    }

    /**
     * Set value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PropertyValue value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPropertyValue(String PropertyValue) {
        this.PropertyValue = PropertyValue;
    }

    public PropertiesMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PropertiesMap(PropertiesMap source) {
        if (source.PropertyKey != null) {
            this.PropertyKey = new String(source.PropertyKey);
        }
        if (source.PropertyValue != null) {
            this.PropertyValue = new String(source.PropertyValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PropertyKey", this.PropertyKey);
        this.setParamSimple(map, prefix + "PropertyValue", this.PropertyValue);

    }
}

