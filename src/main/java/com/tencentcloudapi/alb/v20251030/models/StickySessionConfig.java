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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StickySessionConfig extends AbstractModel {

    /**
    * Whether to enable session persistence.
- **true**: enabled.
- **false**: not enabled.
    */
    @SerializedName("StickySessionEnabled")
    @Expose
    private Boolean StickySessionEnabled;

    /**
    * Custom Cookie name.
Length: 1-255 characters. It can only contain English letters and digits, and cannot be `tgw_l7_tg_route`. This field is a reserved field for the session persistence Cookie between target groups.
>This parameter takes effect only when **StickySessionEnabled** is **true**.
    */
    @SerializedName("Cookie")
    @Expose
    private String Cookie;

    /**
    * Session hold time.
Value range: **1-86400**. Unit: **seconds**.
Default value: **1000**.
>This parameter takes effect only when **StickySessionEnabled** is **true**.
    */
    @SerializedName("CookieTimeout")
    @Expose
    private Long CookieTimeout;

    /**
    * Session persistence type (the way cookies are handled).
- **Insert** (default value): Embed a Cookie. When a client accesses the backend service for the first time, the application CLB will embed a Cookie in the Return Request. The next time the client carries this Cookie in a request, load balancing will forward the request to the same backend service as last time.
- **Rewrite**: Rewrite the Cookie. Load balancing rewrites the user-defined Cookie. The next client request carries the Cookie, and load balancing forwards the request to the same backend service as the last request.
>This parameter takes effect only when **StickySessionEnabled** is **true**.
    */
    @SerializedName("StickySessionType")
    @Expose
    private String StickySessionType;

    /**
     * Get Whether to enable session persistence.
- **true**: enabled.
- **false**: not enabled. 
     * @return StickySessionEnabled Whether to enable session persistence.
- **true**: enabled.
- **false**: not enabled.
     */
    public Boolean getStickySessionEnabled() {
        return this.StickySessionEnabled;
    }

    /**
     * Set Whether to enable session persistence.
- **true**: enabled.
- **false**: not enabled.
     * @param StickySessionEnabled Whether to enable session persistence.
- **true**: enabled.
- **false**: not enabled.
     */
    public void setStickySessionEnabled(Boolean StickySessionEnabled) {
        this.StickySessionEnabled = StickySessionEnabled;
    }

    /**
     * Get Custom Cookie name.
Length: 1-255 characters. It can only contain English letters and digits, and cannot be `tgw_l7_tg_route`. This field is a reserved field for the session persistence Cookie between target groups.
>This parameter takes effect only when **StickySessionEnabled** is **true**. 
     * @return Cookie Custom Cookie name.
Length: 1-255 characters. It can only contain English letters and digits, and cannot be `tgw_l7_tg_route`. This field is a reserved field for the session persistence Cookie between target groups.
>This parameter takes effect only when **StickySessionEnabled** is **true**.
     */
    public String getCookie() {
        return this.Cookie;
    }

    /**
     * Set Custom Cookie name.
Length: 1-255 characters. It can only contain English letters and digits, and cannot be `tgw_l7_tg_route`. This field is a reserved field for the session persistence Cookie between target groups.
>This parameter takes effect only when **StickySessionEnabled** is **true**.
     * @param Cookie Custom Cookie name.
Length: 1-255 characters. It can only contain English letters and digits, and cannot be `tgw_l7_tg_route`. This field is a reserved field for the session persistence Cookie between target groups.
>This parameter takes effect only when **StickySessionEnabled** is **true**.
     */
    public void setCookie(String Cookie) {
        this.Cookie = Cookie;
    }

    /**
     * Get Session hold time.
Value range: **1-86400**. Unit: **seconds**.
Default value: **1000**.
>This parameter takes effect only when **StickySessionEnabled** is **true**. 
     * @return CookieTimeout Session hold time.
Value range: **1-86400**. Unit: **seconds**.
Default value: **1000**.
>This parameter takes effect only when **StickySessionEnabled** is **true**.
     */
    public Long getCookieTimeout() {
        return this.CookieTimeout;
    }

    /**
     * Set Session hold time.
Value range: **1-86400**. Unit: **seconds**.
Default value: **1000**.
>This parameter takes effect only when **StickySessionEnabled** is **true**.
     * @param CookieTimeout Session hold time.
Value range: **1-86400**. Unit: **seconds**.
Default value: **1000**.
>This parameter takes effect only when **StickySessionEnabled** is **true**.
     */
    public void setCookieTimeout(Long CookieTimeout) {
        this.CookieTimeout = CookieTimeout;
    }

    /**
     * Get Session persistence type (the way cookies are handled).
- **Insert** (default value): Embed a Cookie. When a client accesses the backend service for the first time, the application CLB will embed a Cookie in the Return Request. The next time the client carries this Cookie in a request, load balancing will forward the request to the same backend service as last time.
- **Rewrite**: Rewrite the Cookie. Load balancing rewrites the user-defined Cookie. The next client request carries the Cookie, and load balancing forwards the request to the same backend service as the last request.
>This parameter takes effect only when **StickySessionEnabled** is **true**. 
     * @return StickySessionType Session persistence type (the way cookies are handled).
- **Insert** (default value): Embed a Cookie. When a client accesses the backend service for the first time, the application CLB will embed a Cookie in the Return Request. The next time the client carries this Cookie in a request, load balancing will forward the request to the same backend service as last time.
- **Rewrite**: Rewrite the Cookie. Load balancing rewrites the user-defined Cookie. The next client request carries the Cookie, and load balancing forwards the request to the same backend service as the last request.
>This parameter takes effect only when **StickySessionEnabled** is **true**.
     */
    public String getStickySessionType() {
        return this.StickySessionType;
    }

    /**
     * Set Session persistence type (the way cookies are handled).
- **Insert** (default value): Embed a Cookie. When a client accesses the backend service for the first time, the application CLB will embed a Cookie in the Return Request. The next time the client carries this Cookie in a request, load balancing will forward the request to the same backend service as last time.
- **Rewrite**: Rewrite the Cookie. Load balancing rewrites the user-defined Cookie. The next client request carries the Cookie, and load balancing forwards the request to the same backend service as the last request.
>This parameter takes effect only when **StickySessionEnabled** is **true**.
     * @param StickySessionType Session persistence type (the way cookies are handled).
- **Insert** (default value): Embed a Cookie. When a client accesses the backend service for the first time, the application CLB will embed a Cookie in the Return Request. The next time the client carries this Cookie in a request, load balancing will forward the request to the same backend service as last time.
- **Rewrite**: Rewrite the Cookie. Load balancing rewrites the user-defined Cookie. The next client request carries the Cookie, and load balancing forwards the request to the same backend service as the last request.
>This parameter takes effect only when **StickySessionEnabled** is **true**.
     */
    public void setStickySessionType(String StickySessionType) {
        this.StickySessionType = StickySessionType;
    }

    public StickySessionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StickySessionConfig(StickySessionConfig source) {
        if (source.StickySessionEnabled != null) {
            this.StickySessionEnabled = new Boolean(source.StickySessionEnabled);
        }
        if (source.Cookie != null) {
            this.Cookie = new String(source.Cookie);
        }
        if (source.CookieTimeout != null) {
            this.CookieTimeout = new Long(source.CookieTimeout);
        }
        if (source.StickySessionType != null) {
            this.StickySessionType = new String(source.StickySessionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StickySessionEnabled", this.StickySessionEnabled);
        this.setParamSimple(map, prefix + "Cookie", this.Cookie);
        this.setParamSimple(map, prefix + "CookieTimeout", this.CookieTimeout);
        this.setParamSimple(map, prefix + "StickySessionType", this.StickySessionType);

    }
}

