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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReadOnlyInstanceWeightPair extends AbstractModel {

    /**
    * 
    */
    @SerializedName("ReadOnlyInstanceId")
    @Expose
    private String ReadOnlyInstanceId;

    /**
    * 
    */
    @SerializedName("ReadOnlyWeight")
    @Expose
    private Long ReadOnlyWeight;

    /**
     * Get  
     * @return ReadOnlyInstanceId 
     */
    public String getReadOnlyInstanceId() {
        return this.ReadOnlyInstanceId;
    }

    /**
     * Set 
     * @param ReadOnlyInstanceId 
     */
    public void setReadOnlyInstanceId(String ReadOnlyInstanceId) {
        this.ReadOnlyInstanceId = ReadOnlyInstanceId;
    }

    /**
     * Get  
     * @return ReadOnlyWeight 
     */
    public Long getReadOnlyWeight() {
        return this.ReadOnlyWeight;
    }

    /**
     * Set 
     * @param ReadOnlyWeight 
     */
    public void setReadOnlyWeight(Long ReadOnlyWeight) {
        this.ReadOnlyWeight = ReadOnlyWeight;
    }

    public ReadOnlyInstanceWeightPair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReadOnlyInstanceWeightPair(ReadOnlyInstanceWeightPair source) {
        if (source.ReadOnlyInstanceId != null) {
            this.ReadOnlyInstanceId = new String(source.ReadOnlyInstanceId);
        }
        if (source.ReadOnlyWeight != null) {
            this.ReadOnlyWeight = new Long(source.ReadOnlyWeight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReadOnlyInstanceId", this.ReadOnlyInstanceId);
        this.setParamSimple(map, prefix + "ReadOnlyWeight", this.ReadOnlyWeight);

    }
}

