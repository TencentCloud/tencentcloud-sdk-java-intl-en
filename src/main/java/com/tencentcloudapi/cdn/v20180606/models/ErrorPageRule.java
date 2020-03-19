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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorPageRule extends AbstractModel{

    /**
    * Status code
Supports 400, 403, 404, 500.
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * Redirect status code settings
Supports 301 or 302.
    */
    @SerializedName("RedirectCode")
    @Expose
    private Long RedirectCode;

    /**
    * Redirect URL
Requires a full redirect path, such as https://www.test.com/error.html.
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
     * Get Status code
Supports 400, 403, 404, 500. 
     * @return StatusCode Status code
Supports 400, 403, 404, 500.
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set Status code
Supports 400, 403, 404, 500.
     * @param StatusCode Status code
Supports 400, 403, 404, 500.
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get Redirect status code settings
Supports 301 or 302. 
     * @return RedirectCode Redirect status code settings
Supports 301 or 302.
     */
    public Long getRedirectCode() {
        return this.RedirectCode;
    }

    /**
     * Set Redirect status code settings
Supports 301 or 302.
     * @param RedirectCode Redirect status code settings
Supports 301 or 302.
     */
    public void setRedirectCode(Long RedirectCode) {
        this.RedirectCode = RedirectCode;
    }

    /**
     * Get Redirect URL
Requires a full redirect path, such as https://www.test.com/error.html. 
     * @return RedirectUrl Redirect URL
Requires a full redirect path, such as https://www.test.com/error.html.
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set Redirect URL
Requires a full redirect path, such as https://www.test.com/error.html.
     * @param RedirectUrl Redirect URL
Requires a full redirect path, such as https://www.test.com/error.html.
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "RedirectCode", this.RedirectCode);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);

    }
}

