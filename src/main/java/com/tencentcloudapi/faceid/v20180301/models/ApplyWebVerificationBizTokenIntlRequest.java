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
    * <p>The Web redirect URL after verification, including the protocol header, host name, and path, for example, https://www.tencentcloud.com/products/faceid.<br>After the verification process is completed, the BizToken of the current process is appended to the redirect URL, and the redirect is performed in the format of https://www.tencentcloud.com/products/faceid?token={BizToken}.</p>
    */
    @SerializedName("RedirectURL")
    @Expose
    private String RedirectURL;

    /**
    * <p>Base64-encoded string of the comparison photo. The Data URI scheme header needs to be removed from the encoded string, and the size cannot exceed 8 MB.</p>
    */
    @SerializedName("CompareImageBase64")
    @Expose
    private String CompareImageBase64;

    /**
    * <p>Business passthrough parameter, with a maximum length of 1,000 characters. It is returned in the GetWebVerificationResultIntl API.</p>
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * <p>Id generated in the console configuration</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>Related configurations of the custom verification page.</p>
    */
    @SerializedName("Config")
    @Expose
    private WebVerificationConfigIntl Config;

    /**
     * Get <p>The Web redirect URL after verification, including the protocol header, host name, and path, for example, https://www.tencentcloud.com/products/faceid.<br>After the verification process is completed, the BizToken of the current process is appended to the redirect URL, and the redirect is performed in the format of https://www.tencentcloud.com/products/faceid?token={BizToken}.</p> 
     * @return RedirectURL <p>The Web redirect URL after verification, including the protocol header, host name, and path, for example, https://www.tencentcloud.com/products/faceid.<br>After the verification process is completed, the BizToken of the current process is appended to the redirect URL, and the redirect is performed in the format of https://www.tencentcloud.com/products/faceid?token={BizToken}.</p>
     */
    public String getRedirectURL() {
        return this.RedirectURL;
    }

    /**
     * Set <p>The Web redirect URL after verification, including the protocol header, host name, and path, for example, https://www.tencentcloud.com/products/faceid.<br>After the verification process is completed, the BizToken of the current process is appended to the redirect URL, and the redirect is performed in the format of https://www.tencentcloud.com/products/faceid?token={BizToken}.</p>
     * @param RedirectURL <p>The Web redirect URL after verification, including the protocol header, host name, and path, for example, https://www.tencentcloud.com/products/faceid.<br>After the verification process is completed, the BizToken of the current process is appended to the redirect URL, and the redirect is performed in the format of https://www.tencentcloud.com/products/faceid?token={BizToken}.</p>
     */
    public void setRedirectURL(String RedirectURL) {
        this.RedirectURL = RedirectURL;
    }

    /**
     * Get <p>Base64-encoded string of the comparison photo. The Data URI scheme header needs to be removed from the encoded string, and the size cannot exceed 8 MB.</p> 
     * @return CompareImageBase64 <p>Base64-encoded string of the comparison photo. The Data URI scheme header needs to be removed from the encoded string, and the size cannot exceed 8 MB.</p>
     */
    public String getCompareImageBase64() {
        return this.CompareImageBase64;
    }

    /**
     * Set <p>Base64-encoded string of the comparison photo. The Data URI scheme header needs to be removed from the encoded string, and the size cannot exceed 8 MB.</p>
     * @param CompareImageBase64 <p>Base64-encoded string of the comparison photo. The Data URI scheme header needs to be removed from the encoded string, and the size cannot exceed 8 MB.</p>
     */
    public void setCompareImageBase64(String CompareImageBase64) {
        this.CompareImageBase64 = CompareImageBase64;
    }

    /**
     * Get <p>Business passthrough parameter, with a maximum length of 1,000 characters. It is returned in the GetWebVerificationResultIntl API.</p> 
     * @return Extra <p>Business passthrough parameter, with a maximum length of 1,000 characters. It is returned in the GetWebVerificationResultIntl API.</p>
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>Business passthrough parameter, with a maximum length of 1,000 characters. It is returned in the GetWebVerificationResultIntl API.</p>
     * @param Extra <p>Business passthrough parameter, with a maximum length of 1,000 characters. It is returned in the GetWebVerificationResultIntl API.</p>
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get <p>Id generated in the console configuration</p> 
     * @return RuleId <p>Id generated in the console configuration</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Id generated in the console configuration</p>
     * @param RuleId <p>Id generated in the console configuration</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>Related configurations of the custom verification page.</p> 
     * @return Config <p>Related configurations of the custom verification page.</p>
     */
    public WebVerificationConfigIntl getConfig() {
        return this.Config;
    }

    /**
     * Set <p>Related configurations of the custom verification page.</p>
     * @param Config <p>Related configurations of the custom verification page.</p>
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
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
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
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

