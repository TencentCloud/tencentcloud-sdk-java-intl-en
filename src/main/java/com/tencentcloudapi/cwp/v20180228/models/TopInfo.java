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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopInfo extends AbstractModel {

    /**
    * Top statistical data, such as IP, and vulnerability name
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Top statistical count
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Top statistical data, such as IP, and vulnerability name 
     * @return Value Top statistical data, such as IP, and vulnerability name
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Top statistical data, such as IP, and vulnerability name
     * @param Value Top statistical data, such as IP, and vulnerability name
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Top statistical count 
     * @return Count Top statistical count
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Top statistical count
     * @param Count Top statistical count
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public TopInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopInfo(TopInfo source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

