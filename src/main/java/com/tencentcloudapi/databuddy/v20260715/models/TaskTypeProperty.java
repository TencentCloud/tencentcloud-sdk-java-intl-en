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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskTypeProperty extends AbstractModel {

    /**
    * <p>Attribute key name. When used as an input parameter in TaskType, if it is not passed or is empty, this attribute item is silently ignored by the server (no error reported), equivalent to the attribute being unconfigured. For the list of valid PropertyKey, see the description in TaskType.</p>
    */
    @SerializedName("PropertyKey")
    @Expose
    private String PropertyKey;

    /**
    * <p>Attribute value.</p>
    */
    @SerializedName("PropertyValue")
    @Expose
    private String PropertyValue;

    /**
     * Get <p>Attribute key name. When used as an input parameter in TaskType, if it is not passed or is empty, this attribute item is silently ignored by the server (no error reported), equivalent to the attribute being unconfigured. For the list of valid PropertyKey, see the description in TaskType.</p> 
     * @return PropertyKey <p>Attribute key name. When used as an input parameter in TaskType, if it is not passed or is empty, this attribute item is silently ignored by the server (no error reported), equivalent to the attribute being unconfigured. For the list of valid PropertyKey, see the description in TaskType.</p>
     */
    public String getPropertyKey() {
        return this.PropertyKey;
    }

    /**
     * Set <p>Attribute key name. When used as an input parameter in TaskType, if it is not passed or is empty, this attribute item is silently ignored by the server (no error reported), equivalent to the attribute being unconfigured. For the list of valid PropertyKey, see the description in TaskType.</p>
     * @param PropertyKey <p>Attribute key name. When used as an input parameter in TaskType, if it is not passed or is empty, this attribute item is silently ignored by the server (no error reported), equivalent to the attribute being unconfigured. For the list of valid PropertyKey, see the description in TaskType.</p>
     */
    public void setPropertyKey(String PropertyKey) {
        this.PropertyKey = PropertyKey;
    }

    /**
     * Get <p>Attribute value.</p> 
     * @return PropertyValue <p>Attribute value.</p>
     */
    public String getPropertyValue() {
        return this.PropertyValue;
    }

    /**
     * Set <p>Attribute value.</p>
     * @param PropertyValue <p>Attribute value.</p>
     */
    public void setPropertyValue(String PropertyValue) {
        this.PropertyValue = PropertyValue;
    }

    public TaskTypeProperty() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskTypeProperty(TaskTypeProperty source) {
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

