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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FieldConfig extends AbstractModel {

    /**
    * Field key
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FieldKey")
    @Expose
    private String FieldKey;

    /**
    * Field valueNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FieldValue")
    @Expose
    private String FieldValue;

    /**
    * Field Value Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FieldDataType")
    @Expose
    private String FieldDataType;

    /**
     * Get Field key
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FieldKey Field key
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFieldKey() {
        return this.FieldKey;
    }

    /**
     * Set Field key
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FieldKey Field key
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFieldKey(String FieldKey) {
        this.FieldKey = FieldKey;
    }

    /**
     * Get Field valueNote: This field may return null, indicating that no valid value can be obtained. 
     * @return FieldValue Field valueNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFieldValue() {
        return this.FieldValue;
    }

    /**
     * Set Field valueNote: This field may return null, indicating that no valid value can be obtained.
     * @param FieldValue Field valueNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFieldValue(String FieldValue) {
        this.FieldValue = FieldValue;
    }

    /**
     * Get Field Value Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FieldDataType Field Value Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFieldDataType() {
        return this.FieldDataType;
    }

    /**
     * Set Field Value Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FieldDataType Field Value Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFieldDataType(String FieldDataType) {
        this.FieldDataType = FieldDataType;
    }

    public FieldConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FieldConfig(FieldConfig source) {
        if (source.FieldKey != null) {
            this.FieldKey = new String(source.FieldKey);
        }
        if (source.FieldValue != null) {
            this.FieldValue = new String(source.FieldValue);
        }
        if (source.FieldDataType != null) {
            this.FieldDataType = new String(source.FieldDataType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldKey", this.FieldKey);
        this.setParamSimple(map, prefix + "FieldValue", this.FieldValue);
        this.setParamSimple(map, prefix + "FieldDataType", this.FieldDataType);

    }
}

