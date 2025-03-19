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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatusCodeCacheParameters extends AbstractModel {

    /**
    * Status code cache ttl.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("StatusCodeCacheParams")
    @Expose
    private StatusCodeCacheParam [] StatusCodeCacheParams;

    /**
     * Get Status code cache ttl.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return StatusCodeCacheParams Status code cache ttl.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public StatusCodeCacheParam [] getStatusCodeCacheParams() {
        return this.StatusCodeCacheParams;
    }

    /**
     * Set Status code cache ttl.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param StatusCodeCacheParams Status code cache ttl.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setStatusCodeCacheParams(StatusCodeCacheParam [] StatusCodeCacheParams) {
        this.StatusCodeCacheParams = StatusCodeCacheParams;
    }

    public StatusCodeCacheParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatusCodeCacheParameters(StatusCodeCacheParameters source) {
        if (source.StatusCodeCacheParams != null) {
            this.StatusCodeCacheParams = new StatusCodeCacheParam[source.StatusCodeCacheParams.length];
            for (int i = 0; i < source.StatusCodeCacheParams.length; i++) {
                this.StatusCodeCacheParams[i] = new StatusCodeCacheParam(source.StatusCodeCacheParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "StatusCodeCacheParams.", this.StatusCodeCacheParams);

    }
}

