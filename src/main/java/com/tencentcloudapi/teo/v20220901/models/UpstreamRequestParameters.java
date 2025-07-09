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

public class UpstreamRequestParameters extends AbstractModel {

    /**
    * Query string configuration. optional. if not provided, it will not be configured.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("QueryString")
    @Expose
    private UpstreamRequestQueryString QueryString;

    /**
    * Cookie configuration. optional. if not provided, it will not be configured.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Cookie")
    @Expose
    private UpstreamRequestCookie Cookie;

    /**
     * Get Query string configuration. optional. if not provided, it will not be configured.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return QueryString Query string configuration. optional. if not provided, it will not be configured.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public UpstreamRequestQueryString getQueryString() {
        return this.QueryString;
    }

    /**
     * Set Query string configuration. optional. if not provided, it will not be configured.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param QueryString Query string configuration. optional. if not provided, it will not be configured.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setQueryString(UpstreamRequestQueryString QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get Cookie configuration. optional. if not provided, it will not be configured.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return Cookie Cookie configuration. optional. if not provided, it will not be configured.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public UpstreamRequestCookie getCookie() {
        return this.Cookie;
    }

    /**
     * Set Cookie configuration. optional. if not provided, it will not be configured.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param Cookie Cookie configuration. optional. if not provided, it will not be configured.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setCookie(UpstreamRequestCookie Cookie) {
        this.Cookie = Cookie;
    }

    public UpstreamRequestParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamRequestParameters(UpstreamRequestParameters source) {
        if (source.QueryString != null) {
            this.QueryString = new UpstreamRequestQueryString(source.QueryString);
        }
        if (source.Cookie != null) {
            this.Cookie = new UpstreamRequestCookie(source.Cookie);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "QueryString.", this.QueryString);
        this.setParamObj(map, prefix + "Cookie.", this.Cookie);

    }
}

