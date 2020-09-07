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

public class UrlRedirectRule extends AbstractModel{

    /**
    * Redirect status code. Valid values: 301, 302
    */
    @SerializedName("RedirectStatusCode")
    @Expose
    private Long RedirectStatusCode;

    /**
    * Pattern of the URL to be matched, which can contain up to 1,024 characters. Full-path match and regex match are supported.
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * Target URL, which must begin with `/` and can contain up to 1,024 characters.
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
     * Get Redirect status code. Valid values: 301, 302 
     * @return RedirectStatusCode Redirect status code. Valid values: 301, 302
     */
    public Long getRedirectStatusCode() {
        return this.RedirectStatusCode;
    }

    /**
     * Set Redirect status code. Valid values: 301, 302
     * @param RedirectStatusCode Redirect status code. Valid values: 301, 302
     */
    public void setRedirectStatusCode(Long RedirectStatusCode) {
        this.RedirectStatusCode = RedirectStatusCode;
    }

    /**
     * Get Pattern of the URL to be matched, which can contain up to 1,024 characters. Full-path match and regex match are supported. 
     * @return Pattern Pattern of the URL to be matched, which can contain up to 1,024 characters. Full-path match and regex match are supported.
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set Pattern of the URL to be matched, which can contain up to 1,024 characters. Full-path match and regex match are supported.
     * @param Pattern Pattern of the URL to be matched, which can contain up to 1,024 characters. Full-path match and regex match are supported.
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get Target URL, which must begin with `/` and can contain up to 1,024 characters. 
     * @return RedirectUrl Target URL, which must begin with `/` and can contain up to 1,024 characters.
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set Target URL, which must begin with `/` and can contain up to 1,024 characters.
     * @param RedirectUrl Target URL, which must begin with `/` and can contain up to 1,024 characters.
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RedirectStatusCode", this.RedirectStatusCode);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);

    }
}

