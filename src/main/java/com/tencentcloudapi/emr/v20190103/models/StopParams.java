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

public class StopParams extends AbstractModel {

    /**
    * Security mode: safe.
Default mode: default.
    */
    @SerializedName("StopPolicy")
    @Expose
    private String StopPolicy;

    /**
    * Thread Count
    */
    @SerializedName("ThreadCount")
    @Expose
    private Long ThreadCount;

    /**
     * Get Security mode: safe.
Default mode: default. 
     * @return StopPolicy Security mode: safe.
Default mode: default.
     */
    public String getStopPolicy() {
        return this.StopPolicy;
    }

    /**
     * Set Security mode: safe.
Default mode: default.
     * @param StopPolicy Security mode: safe.
Default mode: default.
     */
    public void setStopPolicy(String StopPolicy) {
        this.StopPolicy = StopPolicy;
    }

    /**
     * Get Thread Count 
     * @return ThreadCount Thread Count
     */
    public Long getThreadCount() {
        return this.ThreadCount;
    }

    /**
     * Set Thread Count
     * @param ThreadCount Thread Count
     */
    public void setThreadCount(Long ThreadCount) {
        this.ThreadCount = ThreadCount;
    }

    public StopParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopParams(StopParams source) {
        if (source.StopPolicy != null) {
            this.StopPolicy = new String(source.StopPolicy);
        }
        if (source.ThreadCount != null) {
            this.ThreadCount = new Long(source.ThreadCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StopPolicy", this.StopPolicy);
        this.setParamSimple(map, prefix + "ThreadCount", this.ThreadCount);

    }
}

