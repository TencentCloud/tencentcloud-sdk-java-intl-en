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
    * URL to be matched. Only URLs are supported, while parameters are not. The exact match is used by default. In regex match, up to 5 wildcards `*` are supported. The URL can contain up to 1,024 characters.
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * Target URL, starting with `/` and excluding parameters. The path can contain up to 1,024 characters. The wildcards in the matching path can be respectively captured using `$1`, `$2`, `$3`, `$4`, and `$5`. Up to 10 values can be captured.
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * Target host. It should be a standard domain name starting with `http://` or `https://`. If it is left empty, “http://[current domain name]” will be used by default.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RedirectHost")
    @Expose
    private String RedirectHost;

    /**
    * Whether to use full-path matching or arbitrary matching
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FullMatch")
    @Expose
    private Boolean FullMatch;

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
     * Get URL to be matched. Only URLs are supported, while parameters are not. The exact match is used by default. In regex match, up to 5 wildcards `*` are supported. The URL can contain up to 1,024 characters. 
     * @return Pattern URL to be matched. Only URLs are supported, while parameters are not. The exact match is used by default. In regex match, up to 5 wildcards `*` are supported. The URL can contain up to 1,024 characters.
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set URL to be matched. Only URLs are supported, while parameters are not. The exact match is used by default. In regex match, up to 5 wildcards `*` are supported. The URL can contain up to 1,024 characters.
     * @param Pattern URL to be matched. Only URLs are supported, while parameters are not. The exact match is used by default. In regex match, up to 5 wildcards `*` are supported. The URL can contain up to 1,024 characters.
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get Target URL, starting with `/` and excluding parameters. The path can contain up to 1,024 characters. The wildcards in the matching path can be respectively captured using `$1`, `$2`, `$3`, `$4`, and `$5`. Up to 10 values can be captured. 
     * @return RedirectUrl Target URL, starting with `/` and excluding parameters. The path can contain up to 1,024 characters. The wildcards in the matching path can be respectively captured using `$1`, `$2`, `$3`, `$4`, and `$5`. Up to 10 values can be captured.
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set Target URL, starting with `/` and excluding parameters. The path can contain up to 1,024 characters. The wildcards in the matching path can be respectively captured using `$1`, `$2`, `$3`, `$4`, and `$5`. Up to 10 values can be captured.
     * @param RedirectUrl Target URL, starting with `/` and excluding parameters. The path can contain up to 1,024 characters. The wildcards in the matching path can be respectively captured using `$1`, `$2`, `$3`, `$4`, and `$5`. Up to 10 values can be captured.
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get Target host. It should be a standard domain name starting with `http://` or `https://`. If it is left empty, “http://[current domain name]” will be used by default.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RedirectHost Target host. It should be a standard domain name starting with `http://` or `https://`. If it is left empty, “http://[current domain name]” will be used by default.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRedirectHost() {
        return this.RedirectHost;
    }

    /**
     * Set Target host. It should be a standard domain name starting with `http://` or `https://`. If it is left empty, “http://[current domain name]” will be used by default.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RedirectHost Target host. It should be a standard domain name starting with `http://` or `https://`. If it is left empty, “http://[current domain name]” will be used by default.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRedirectHost(String RedirectHost) {
        this.RedirectHost = RedirectHost;
    }

    /**
     * Get Whether to use full-path matching or arbitrary matching
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FullMatch Whether to use full-path matching or arbitrary matching
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getFullMatch() {
        return this.FullMatch;
    }

    /**
     * Set Whether to use full-path matching or arbitrary matching
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FullMatch Whether to use full-path matching or arbitrary matching
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFullMatch(Boolean FullMatch) {
        this.FullMatch = FullMatch;
    }

    public UrlRedirectRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UrlRedirectRule(UrlRedirectRule source) {
        if (source.RedirectStatusCode != null) {
            this.RedirectStatusCode = new Long(source.RedirectStatusCode);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
        if (source.RedirectHost != null) {
            this.RedirectHost = new String(source.RedirectHost);
        }
        if (source.FullMatch != null) {
            this.FullMatch = new Boolean(source.FullMatch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RedirectStatusCode", this.RedirectStatusCode);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);
        this.setParamSimple(map, prefix + "RedirectHost", this.RedirectHost);
        this.setParamSimple(map, prefix + "FullMatch", this.FullMatch);

    }
}

