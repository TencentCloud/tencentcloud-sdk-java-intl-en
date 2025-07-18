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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyValueInfo extends AbstractModel {

    /**
    * Whether case-sensitive
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Boolean CaseSensitive;

    /**
    * Information about the key-value pair to be indexed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyValues")
    @Expose
    private KeyValueArrayInfo [] KeyValues;

    /**
     * Get Whether case-sensitive 
     * @return CaseSensitive Whether case-sensitive
     */
    public Boolean getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set Whether case-sensitive
     * @param CaseSensitive Whether case-sensitive
     */
    public void setCaseSensitive(Boolean CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get Information about the key-value pair to be indexed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KeyValues Information about the key-value pair to be indexed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KeyValueArrayInfo [] getKeyValues() {
        return this.KeyValues;
    }

    /**
     * Set Information about the key-value pair to be indexed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KeyValues Information about the key-value pair to be indexed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyValues(KeyValueArrayInfo [] KeyValues) {
        this.KeyValues = KeyValues;
    }

    public KeyValueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyValueInfo(KeyValueInfo source) {
        if (source.CaseSensitive != null) {
            this.CaseSensitive = new Boolean(source.CaseSensitive);
        }
        if (source.KeyValues != null) {
            this.KeyValues = new KeyValueArrayInfo[source.KeyValues.length];
            for (int i = 0; i < source.KeyValues.length; i++) {
                this.KeyValues[i] = new KeyValueArrayInfo(source.KeyValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaseSensitive", this.CaseSensitive);
        this.setParamArrayObj(map, prefix + "KeyValues.", this.KeyValues);

    }
}

