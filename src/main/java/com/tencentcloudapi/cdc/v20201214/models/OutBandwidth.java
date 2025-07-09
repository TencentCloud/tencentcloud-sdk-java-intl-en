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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutBandwidth extends AbstractModel {

    /**
    * Timestamp 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("Timestamps")
    @Expose
    private Float [] Timestamps;

    /**
    * Time-specific value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
    */
    @SerializedName("Values")
    @Expose
    private Float [] Values;

    /**
     * Get Timestamp 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return Timestamps Timestamp 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Float [] getTimestamps() {
        return this.Timestamps;
    }

    /**
     * Set Timestamp 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param Timestamps Timestamp 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setTimestamps(Float [] Timestamps) {
        this.Timestamps = Timestamps;
    }

    /**
     * Get Time-specific value 
Note: The returned value of this field may be null, indicating that no valid value is obtained. 
     * @return Values Time-specific value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public Float [] getValues() {
        return this.Values;
    }

    /**
     * Set Time-specific value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     * @param Values Time-specific value 
Note: The returned value of this field may be null, indicating that no valid value is obtained.
     */
    public void setValues(Float [] Values) {
        this.Values = Values;
    }

    public OutBandwidth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutBandwidth(OutBandwidth source) {
        if (source.Timestamps != null) {
            this.Timestamps = new Float[source.Timestamps.length];
            for (int i = 0; i < source.Timestamps.length; i++) {
                this.Timestamps[i] = new Float(source.Timestamps[i]);
            }
        }
        if (source.Values != null) {
            this.Values = new Float[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new Float(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Timestamps.", this.Timestamps);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

