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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyWebVerificationBizTokenIntlRequest extends AbstractModel {

    /**
    * The web callback URL to redirect to after the verification is completed, including the protocol, hostname, and path. 
After the verification process is completed, the BizToken of this process will be spliced to the callback URL in the format of https://www.tencentcloud.com/products/faceid?token={BizToken} before redirect.
Example: https://www.tencentcloud.com/products/faceid.
    */
    @SerializedName("RedirectURL")
    @Expose
    private String RedirectURL;

    /**
    * The Base64-encoded string (max 8 MB in size) of the photo to be compared.The Data URI scheme header needs to be removed from the encoded string
Example: xhBQAAACBjSFJNAAB6****AAAASUVORK5CYII=
    */
    @SerializedName("CompareImageBase64")
    @Expose
    private String CompareImageBase64;

    /**
    * The passthrough parameter of the business, max 1,000 characters, which will be returned in GetWebVerificationResultIntl.
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * The parameter control the page configuration.
Example: {"AutoSkip": true,"CheckMode": 1,"IdCardType": "HKIDCard"}
    */
    @SerializedName("Config")
    @Expose
    private WebVerificationConfigIntl Config;

    /**
     * Get The web callback URL to redirect to after the verification is completed, including the protocol, hostname, and path. 
After the verification process is completed, the BizToken of this process will be spliced to the callback URL in the format of https://www.tencentcloud.com/products/faceid?token={BizToken} before redirect.
Example: https://www.tencentcloud.com/products/faceid. 
     * @return RedirectURL The web callback URL to redirect to after the verification is completed, including the protocol, hostname, and path. 
After the verification process is completed, the BizToken of this process will be spliced to the callback URL in the format of https://www.tencentcloud.com/products/faceid?token={BizToken} before redirect.
Example: https://www.tencentcloud.com/products/faceid.
     */
    public String getRedirectURL() {
        return this.RedirectURL;
    }

    /**
     * Set The web callback URL to redirect to after the verification is completed, including the protocol, hostname, and path. 
After the verification process is completed, the BizToken of this process will be spliced to the callback URL in the format of https://www.tencentcloud.com/products/faceid?token={BizToken} before redirect.
Example: https://www.tencentcloud.com/products/faceid.
     * @param RedirectURL The web callback URL to redirect to after the verification is completed, including the protocol, hostname, and path. 
After the verification process is completed, the BizToken of this process will be spliced to the callback URL in the format of https://www.tencentcloud.com/products/faceid?token={BizToken} before redirect.
Example: https://www.tencentcloud.com/products/faceid.
     */
    public void setRedirectURL(String RedirectURL) {
        this.RedirectURL = RedirectURL;
    }

    /**
     * Get The Base64-encoded string (max 8 MB in size) of the photo to be compared.The Data URI scheme header needs to be removed from the encoded string
Example: xhBQAAACBjSFJNAAB6****AAAASUVORK5CYII= 
     * @return CompareImageBase64 The Base64-encoded string (max 8 MB in size) of the photo to be compared.The Data URI scheme header needs to be removed from the encoded string
Example: xhBQAAACBjSFJNAAB6****AAAASUVORK5CYII=
     */
    public String getCompareImageBase64() {
        return this.CompareImageBase64;
    }

    /**
     * Set The Base64-encoded string (max 8 MB in size) of the photo to be compared.The Data URI scheme header needs to be removed from the encoded string
Example: xhBQAAACBjSFJNAAB6****AAAASUVORK5CYII=
     * @param CompareImageBase64 The Base64-encoded string (max 8 MB in size) of the photo to be compared.The Data URI scheme header needs to be removed from the encoded string
Example: xhBQAAACBjSFJNAAB6****AAAASUVORK5CYII=
     */
    public void setCompareImageBase64(String CompareImageBase64) {
        this.CompareImageBase64 = CompareImageBase64;
    }

    /**
     * Get The passthrough parameter of the business, max 1,000 characters, which will be returned in GetWebVerificationResultIntl. 
     * @return Extra The passthrough parameter of the business, max 1,000 characters, which will be returned in GetWebVerificationResultIntl.
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set The passthrough parameter of the business, max 1,000 characters, which will be returned in GetWebVerificationResultIntl.
     * @param Extra The passthrough parameter of the business, max 1,000 characters, which will be returned in GetWebVerificationResultIntl.
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get The parameter control the page configuration.
Example: {"AutoSkip": true,"CheckMode": 1,"IdCardType": "HKIDCard"} 
     * @return Config The parameter control the page configuration.
Example: {"AutoSkip": true,"CheckMode": 1,"IdCardType": "HKIDCard"}
     */
    public WebVerificationConfigIntl getConfig() {
        return this.Config;
    }

    /**
     * Set The parameter control the page configuration.
Example: {"AutoSkip": true,"CheckMode": 1,"IdCardType": "HKIDCard"}
     * @param Config The parameter control the page configuration.
Example: {"AutoSkip": true,"CheckMode": 1,"IdCardType": "HKIDCard"}
     */
    public void setConfig(WebVerificationConfigIntl Config) {
        this.Config = Config;
    }

    public ApplyWebVerificationBizTokenIntlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyWebVerificationBizTokenIntlRequest(ApplyWebVerificationBizTokenIntlRequest source) {
        if (source.RedirectURL != null) {
            this.RedirectURL = new String(source.RedirectURL);
        }
        if (source.CompareImageBase64 != null) {
            this.CompareImageBase64 = new String(source.CompareImageBase64);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.Config != null) {
            this.Config = new WebVerificationConfigIntl(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RedirectURL", this.RedirectURL);
        this.setParamSimple(map, prefix + "CompareImageBase64", this.CompareImageBase64);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

