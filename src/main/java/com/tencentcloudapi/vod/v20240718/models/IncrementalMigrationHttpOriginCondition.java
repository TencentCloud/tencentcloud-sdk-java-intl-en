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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncrementalMigrationHttpOriginCondition extends AbstractModel {

    /**
    * HTTP code to trigger back-to-source conditions. If not filled, the default value is `404`.
    */
    @SerializedName("HttpStatusCode")
    @Expose
    private Long HttpStatusCode;

    /**
    * Object key prefix to trigger back-to-source conditions
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
     * Get HTTP code to trigger back-to-source conditions. If not filled, the default value is `404`. 
     * @return HttpStatusCode HTTP code to trigger back-to-source conditions. If not filled, the default value is `404`.
     */
    public Long getHttpStatusCode() {
        return this.HttpStatusCode;
    }

    /**
     * Set HTTP code to trigger back-to-source conditions. If not filled, the default value is `404`.
     * @param HttpStatusCode HTTP code to trigger back-to-source conditions. If not filled, the default value is `404`.
     */
    public void setHttpStatusCode(Long HttpStatusCode) {
        this.HttpStatusCode = HttpStatusCode;
    }

    /**
     * Get Object key prefix to trigger back-to-source conditions 
     * @return Prefix Object key prefix to trigger back-to-source conditions
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set Object key prefix to trigger back-to-source conditions
     * @param Prefix Object key prefix to trigger back-to-source conditions
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    public IncrementalMigrationHttpOriginCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementalMigrationHttpOriginCondition(IncrementalMigrationHttpOriginCondition source) {
        if (source.HttpStatusCode != null) {
            this.HttpStatusCode = new Long(source.HttpStatusCode);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HttpStatusCode", this.HttpStatusCode);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);

    }
}

