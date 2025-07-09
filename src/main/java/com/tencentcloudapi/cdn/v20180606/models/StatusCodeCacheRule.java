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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatusCodeCacheRule extends AbstractModel {

    /**
    * HTTP status code
Supports 403 and 404 status codes
    */
    @SerializedName("StatusCode")
    @Expose
    private String StatusCode;

    /**
    * Status code cache expiration time (in seconds)
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
     * Get HTTP status code
Supports 403 and 404 status codes 
     * @return StatusCode HTTP status code
Supports 403 and 404 status codes
     */
    public String getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set HTTP status code
Supports 403 and 404 status codes
     * @param StatusCode HTTP status code
Supports 403 and 404 status codes
     */
    public void setStatusCode(String StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get Status code cache expiration time (in seconds) 
     * @return CacheTime Status code cache expiration time (in seconds)
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set Status code cache expiration time (in seconds)
     * @param CacheTime Status code cache expiration time (in seconds)
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    public StatusCodeCacheRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatusCodeCacheRule(StatusCodeCacheRule source) {
        if (source.StatusCode != null) {
            this.StatusCode = new String(source.StatusCode);
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

