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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimingDataItem extends AbstractModel {

    /**
    * Second-level timestamp
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get Second-level timestamp
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Timestamp Second-level timestamp
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Second-level timestamp
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Timestamp Second-level timestamp
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value Value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set Value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value Value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public TimingDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimingDataItem(TimingDataItem source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

