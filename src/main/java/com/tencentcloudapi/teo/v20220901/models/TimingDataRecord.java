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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimingDataRecord extends AbstractModel {

    /**
    * The query dimension value.
    */
    @SerializedName("TypeKey")
    @Expose
    private String TypeKey;

    /**
    * Detailed time series data
    */
    @SerializedName("TypeValue")
    @Expose
    private TimingTypeValue [] TypeValue;

    /**
     * Get The query dimension value. 
     * @return TypeKey The query dimension value.
     */
    public String getTypeKey() {
        return this.TypeKey;
    }

    /**
     * Set The query dimension value.
     * @param TypeKey The query dimension value.
     */
    public void setTypeKey(String TypeKey) {
        this.TypeKey = TypeKey;
    }

    /**
     * Get Detailed time series data 
     * @return TypeValue Detailed time series data
     */
    public TimingTypeValue [] getTypeValue() {
        return this.TypeValue;
    }

    /**
     * Set Detailed time series data
     * @param TypeValue Detailed time series data
     */
    public void setTypeValue(TimingTypeValue [] TypeValue) {
        this.TypeValue = TypeValue;
    }

    public TimingDataRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimingDataRecord(TimingDataRecord source) {
        if (source.TypeKey != null) {
            this.TypeKey = new String(source.TypeKey);
        }
        if (source.TypeValue != null) {
            this.TypeValue = new TimingTypeValue[source.TypeValue.length];
            for (int i = 0; i < source.TypeValue.length; i++) {
                this.TypeValue[i] = new TimingTypeValue(source.TypeValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeKey", this.TypeKey);
        this.setParamArrayObj(map, prefix + "TypeValue.", this.TypeValue);

    }
}

