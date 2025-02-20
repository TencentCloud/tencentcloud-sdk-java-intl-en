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

public class StatusCodeCacheParam extends AbstractModel {

    /**
    * Status code. valid values: 400, 401, 403, 404, 405, 407, 414, 500, 501, 502, 503, 504, 509, 514.
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * Cache time value in seconds. value range: 0–31536000.
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
     * Get Status code. valid values: 400, 401, 403, 404, 405, 407, 414, 500, 501, 502, 503, 504, 509, 514. 
     * @return StatusCode Status code. valid values: 400, 401, 403, 404, 405, 407, 414, 500, 501, 502, 503, 504, 509, 514.
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set Status code. valid values: 400, 401, 403, 404, 405, 407, 414, 500, 501, 502, 503, 504, 509, 514.
     * @param StatusCode Status code. valid values: 400, 401, 403, 404, 405, 407, 414, 500, 501, 502, 503, 504, 509, 514.
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get Cache time value in seconds. value range: 0–31536000. 
     * @return CacheTime Cache time value in seconds. value range: 0–31536000.
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set Cache time value in seconds. value range: 0–31536000.
     * @param CacheTime Cache time value in seconds. value range: 0–31536000.
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    public StatusCodeCacheParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatusCodeCacheParam(StatusCodeCacheParam source) {
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.CacheTime != null) {
            this.CacheTime = new Long(source.CacheTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);

    }
}

