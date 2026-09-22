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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RefererAuthPolicy extends AbstractModel {

    /**
    * [Referer hotlink protection](https://www.tencentcloud.com/document/product/266/14046?from_cn_redirect=1) setting status. Available values:
<li>Enabled: enable;</li>
<li>Disabled: Disabled.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Referer verification type. Available values:
<li>Black: blocklist method validation. An HTTP request carrying a certain Referer in the Referers list will be rejected.</li>
<li>White: whitelist method validation. HTTP requests are allowed only when they carry a Referer in the Referers list.</li>
When Status is Enabled, AuthType must be assigned a value.
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * List of Referer fields used for verification. Supports up to 400 Referer fields. When Status is Enabled, Referers cannot be an empty array. The format of Referer follows the reference domain format.
    */
    @SerializedName("Referers")
    @Expose
    private String [] Referers;

    /**
    * Whether to allow access to this domain name with a null Referer. Available values:
<li>Yes: yes.</li>
<li>No: no.</li>
When Status is Enabled, BlankRefererAllowed must be assigned a value.
    */
    @SerializedName("BlankRefererAllowed")
    @Expose
    private String BlankRefererAllowed;

    /**
     * Get [Referer hotlink protection](https://www.tencentcloud.com/document/product/266/14046?from_cn_redirect=1) setting status. Available values:
<li>Enabled: enable;</li>
<li>Disabled: Disabled.</li> 
     * @return Status [Referer hotlink protection](https://www.tencentcloud.com/document/product/266/14046?from_cn_redirect=1) setting status. Available values:
<li>Enabled: enable;</li>
<li>Disabled: Disabled.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set [Referer hotlink protection](https://www.tencentcloud.com/document/product/266/14046?from_cn_redirect=1) setting status. Available values:
<li>Enabled: enable;</li>
<li>Disabled: Disabled.</li>
     * @param Status [Referer hotlink protection](https://www.tencentcloud.com/document/product/266/14046?from_cn_redirect=1) setting status. Available values:
<li>Enabled: enable;</li>
<li>Disabled: Disabled.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Referer verification type. Available values:
<li>Black: blocklist method validation. An HTTP request carrying a certain Referer in the Referers list will be rejected.</li>
<li>White: whitelist method validation. HTTP requests are allowed only when they carry a Referer in the Referers list.</li>
When Status is Enabled, AuthType must be assigned a value. 
     * @return AuthType Referer verification type. Available values:
<li>Black: blocklist method validation. An HTTP request carrying a certain Referer in the Referers list will be rejected.</li>
<li>White: whitelist method validation. HTTP requests are allowed only when they carry a Referer in the Referers list.</li>
When Status is Enabled, AuthType must be assigned a value.
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set Referer verification type. Available values:
<li>Black: blocklist method validation. An HTTP request carrying a certain Referer in the Referers list will be rejected.</li>
<li>White: whitelist method validation. HTTP requests are allowed only when they carry a Referer in the Referers list.</li>
When Status is Enabled, AuthType must be assigned a value.
     * @param AuthType Referer verification type. Available values:
<li>Black: blocklist method validation. An HTTP request carrying a certain Referer in the Referers list will be rejected.</li>
<li>White: whitelist method validation. HTTP requests are allowed only when they carry a Referer in the Referers list.</li>
When Status is Enabled, AuthType must be assigned a value.
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get List of Referer fields used for verification. Supports up to 400 Referer fields. When Status is Enabled, Referers cannot be an empty array. The format of Referer follows the reference domain format. 
     * @return Referers List of Referer fields used for verification. Supports up to 400 Referer fields. When Status is Enabled, Referers cannot be an empty array. The format of Referer follows the reference domain format.
     */
    public String [] getReferers() {
        return this.Referers;
    }

    /**
     * Set List of Referer fields used for verification. Supports up to 400 Referer fields. When Status is Enabled, Referers cannot be an empty array. The format of Referer follows the reference domain format.
     * @param Referers List of Referer fields used for verification. Supports up to 400 Referer fields. When Status is Enabled, Referers cannot be an empty array. The format of Referer follows the reference domain format.
     */
    public void setReferers(String [] Referers) {
        this.Referers = Referers;
    }

    /**
     * Get Whether to allow access to this domain name with a null Referer. Available values:
<li>Yes: yes.</li>
<li>No: no.</li>
When Status is Enabled, BlankRefererAllowed must be assigned a value. 
     * @return BlankRefererAllowed Whether to allow access to this domain name with a null Referer. Available values:
<li>Yes: yes.</li>
<li>No: no.</li>
When Status is Enabled, BlankRefererAllowed must be assigned a value.
     */
    public String getBlankRefererAllowed() {
        return this.BlankRefererAllowed;
    }

    /**
     * Set Whether to allow access to this domain name with a null Referer. Available values:
<li>Yes: yes.</li>
<li>No: no.</li>
When Status is Enabled, BlankRefererAllowed must be assigned a value.
     * @param BlankRefererAllowed Whether to allow access to this domain name with a null Referer. Available values:
<li>Yes: yes.</li>
<li>No: no.</li>
When Status is Enabled, BlankRefererAllowed must be assigned a value.
     */
    public void setBlankRefererAllowed(String BlankRefererAllowed) {
        this.BlankRefererAllowed = BlankRefererAllowed;
    }

    public RefererAuthPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefererAuthPolicy(RefererAuthPolicy source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.Referers != null) {
            this.Referers = new String[source.Referers.length];
            for (int i = 0; i < source.Referers.length; i++) {
                this.Referers[i] = new String(source.Referers[i]);
            }
        }
        if (source.BlankRefererAllowed != null) {
            this.BlankRefererAllowed = new String(source.BlankRefererAllowed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamArraySimple(map, prefix + "Referers.", this.Referers);
        this.setParamSimple(map, prefix + "BlankRefererAllowed", this.BlankRefererAllowed);

    }
}

