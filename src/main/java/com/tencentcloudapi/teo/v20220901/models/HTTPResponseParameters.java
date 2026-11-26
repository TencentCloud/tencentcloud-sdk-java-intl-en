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

public class HTTPResponseParameters extends AbstractModel {

    /**
    * status code. Supports 2XX, 4XX, 5XX, excluding 499, 514, 101, 301, 302, 303, 509, 520-599.
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * page ID.
    */
    @SerializedName("ResponsePage")
    @Expose
    private String ResponsePage;

    /**
     * Get status code. Supports 2XX, 4XX, 5XX, excluding 499, 514, 101, 301, 302, 303, 509, 520-599. 
     * @return StatusCode status code. Supports 2XX, 4XX, 5XX, excluding 499, 514, 101, 301, 302, 303, 509, 520-599.
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set status code. Supports 2XX, 4XX, 5XX, excluding 499, 514, 101, 301, 302, 303, 509, 520-599.
     * @param StatusCode status code. Supports 2XX, 4XX, 5XX, excluding 499, 514, 101, 301, 302, 303, 509, 520-599.
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get page ID. 
     * @return ResponsePage page ID.
     */
    public String getResponsePage() {
        return this.ResponsePage;
    }

    /**
     * Set page ID.
     * @param ResponsePage page ID.
     */
    public void setResponsePage(String ResponsePage) {
        this.ResponsePage = ResponsePage;
    }

    public HTTPResponseParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPResponseParameters(HTTPResponseParameters source) {
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.ResponsePage != null) {
            this.ResponsePage = new String(source.ResponsePage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "ResponsePage", this.ResponsePage);

    }
}

