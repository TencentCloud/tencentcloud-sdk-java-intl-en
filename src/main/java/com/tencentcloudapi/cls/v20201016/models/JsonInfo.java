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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JsonInfo extends AbstractModel{

    /**
    * Enablement flag
    */
    @SerializedName("EnableTag")
    @Expose
    private Boolean EnableTag;

    /**
    * List of metadata. Supported metadata types: __SOURCE__, __FILENAME__, __TIMESTAMP__, __HOSTNAME__.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetaFields")
    @Expose
    private String [] MetaFields;

    /**
    * JSON format for shipping. `0`: String format; `1`: Structured format.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JsonType")
    @Expose
    private Long JsonType;

    /**
     * Get Enablement flag 
     * @return EnableTag Enablement flag
     */
    public Boolean getEnableTag() {
        return this.EnableTag;
    }

    /**
     * Set Enablement flag
     * @param EnableTag Enablement flag
     */
    public void setEnableTag(Boolean EnableTag) {
        this.EnableTag = EnableTag;
    }

    /**
     * Get List of metadata. Supported metadata types: __SOURCE__, __FILENAME__, __TIMESTAMP__, __HOSTNAME__.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetaFields List of metadata. Supported metadata types: __SOURCE__, __FILENAME__, __TIMESTAMP__, __HOSTNAME__.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getMetaFields() {
        return this.MetaFields;
    }

    /**
     * Set List of metadata. Supported metadata types: __SOURCE__, __FILENAME__, __TIMESTAMP__, __HOSTNAME__.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetaFields List of metadata. Supported metadata types: __SOURCE__, __FILENAME__, __TIMESTAMP__, __HOSTNAME__.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetaFields(String [] MetaFields) {
        this.MetaFields = MetaFields;
    }

    /**
     * Get JSON format for shipping. `0`: String format; `1`: Structured format.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JsonType JSON format for shipping. `0`: String format; `1`: Structured format.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getJsonType() {
        return this.JsonType;
    }

    /**
     * Set JSON format for shipping. `0`: String format; `1`: Structured format.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JsonType JSON format for shipping. `0`: String format; `1`: Structured format.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJsonType(Long JsonType) {
        this.JsonType = JsonType;
    }

    public JsonInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JsonInfo(JsonInfo source) {
        if (source.EnableTag != null) {
            this.EnableTag = new Boolean(source.EnableTag);
        }
        if (source.MetaFields != null) {
            this.MetaFields = new String[source.MetaFields.length];
            for (int i = 0; i < source.MetaFields.length; i++) {
                this.MetaFields[i] = new String(source.MetaFields[i]);
            }
        }
        if (source.JsonType != null) {
            this.JsonType = new Long(source.JsonType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableTag", this.EnableTag);
        this.setParamArraySimple(map, prefix + "MetaFields.", this.MetaFields);
        this.setParamSimple(map, prefix + "JsonType", this.JsonType);

    }
}

