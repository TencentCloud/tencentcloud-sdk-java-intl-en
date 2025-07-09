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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParquetKeyInfo extends AbstractModel {

    /**
    * Key name
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * Supported data types: string, boolean, int32, int64, float, and double
    */
    @SerializedName("KeyType")
    @Expose
    private String KeyType;

    /**
    * Assignment information returned upon resolution failure
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("KeyNonExistingField")
    @Expose
    private String KeyNonExistingField;

    /**
     * Get Key name 
     * @return KeyName Key name
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set Key name
     * @param KeyName Key name
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get Supported data types: string, boolean, int32, int64, float, and double 
     * @return KeyType Supported data types: string, boolean, int32, int64, float, and double
     */
    public String getKeyType() {
        return this.KeyType;
    }

    /**
     * Set Supported data types: string, boolean, int32, int64, float, and double
     * @param KeyType Supported data types: string, boolean, int32, int64, float, and double
     */
    public void setKeyType(String KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get Assignment information returned upon resolution failure
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return KeyNonExistingField Assignment information returned upon resolution failure
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getKeyNonExistingField() {
        return this.KeyNonExistingField;
    }

    /**
     * Set Assignment information returned upon resolution failure
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param KeyNonExistingField Assignment information returned upon resolution failure
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setKeyNonExistingField(String KeyNonExistingField) {
        this.KeyNonExistingField = KeyNonExistingField;
    }

    public ParquetKeyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParquetKeyInfo(ParquetKeyInfo source) {
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.KeyType != null) {
            this.KeyType = new String(source.KeyType);
        }
        if (source.KeyNonExistingField != null) {
            this.KeyNonExistingField = new String(source.KeyNonExistingField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "KeyNonExistingField", this.KeyNonExistingField);

    }
}

