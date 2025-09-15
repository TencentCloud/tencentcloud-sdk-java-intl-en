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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowParam extends AbstractModel {

    /**
    * Process parameter key.
TraceId: Query by TraceId.
FlowId: Query by FlowId.
    */
    @SerializedName("FKey")
    @Expose
    private String FKey;

    /**
    * Parameter value
    */
    @SerializedName("FValue")
    @Expose
    private String FValue;

    /**
     * Get Process parameter key.
TraceId: Query by TraceId.
FlowId: Query by FlowId. 
     * @return FKey Process parameter key.
TraceId: Query by TraceId.
FlowId: Query by FlowId.
     */
    public String getFKey() {
        return this.FKey;
    }

    /**
     * Set Process parameter key.
TraceId: Query by TraceId.
FlowId: Query by FlowId.
     * @param FKey Process parameter key.
TraceId: Query by TraceId.
FlowId: Query by FlowId.
     */
    public void setFKey(String FKey) {
        this.FKey = FKey;
    }

    /**
     * Get Parameter value 
     * @return FValue Parameter value
     */
    public String getFValue() {
        return this.FValue;
    }

    /**
     * Set Parameter value
     * @param FValue Parameter value
     */
    public void setFValue(String FValue) {
        this.FValue = FValue;
    }

    public FlowParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowParam(FlowParam source) {
        if (source.FKey != null) {
            this.FKey = new String(source.FKey);
        }
        if (source.FValue != null) {
            this.FValue = new String(source.FValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FKey", this.FKey);
        this.setParamSimple(map, prefix + "FValue", this.FValue);

    }
}

