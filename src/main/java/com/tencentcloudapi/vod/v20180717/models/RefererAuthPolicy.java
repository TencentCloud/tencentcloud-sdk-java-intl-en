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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RefererAuthPolicy extends AbstractModel{

    /**
    * [Referer hotlink protection](https://intl.cloud.tencent.com/document/product/266/33985) status. Valid values:
<li>Enabled</li>
<li>Disabled</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Referer authentication method. Valid values:
<li>`Black`: blocklist</li>
<li>`White`: allowlist</li>
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * List for referer authentication
    */
    @SerializedName("Referers")
    @Expose
    private String [] Referers;

    /**
    * Whether to allow requests with empty referer to access this domain name. Valid values:
<li>Yes</li>
<li>No</li>
    */
    @SerializedName("BlankRefererAllowed")
    @Expose
    private String BlankRefererAllowed;

    /**
     * Get [Referer hotlink protection](https://intl.cloud.tencent.com/document/product/266/33985) status. Valid values:
<li>Enabled</li>
<li>Disabled</li> 
     * @return Status [Referer hotlink protection](https://intl.cloud.tencent.com/document/product/266/33985) status. Valid values:
<li>Enabled</li>
<li>Disabled</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set [Referer hotlink protection](https://intl.cloud.tencent.com/document/product/266/33985) status. Valid values:
<li>Enabled</li>
<li>Disabled</li>
     * @param Status [Referer hotlink protection](https://intl.cloud.tencent.com/document/product/266/33985) status. Valid values:
<li>Enabled</li>
<li>Disabled</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Referer authentication method. Valid values:
<li>`Black`: blocklist</li>
<li>`White`: allowlist</li> 
     * @return AuthType Referer authentication method. Valid values:
<li>`Black`: blocklist</li>
<li>`White`: allowlist</li>
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set Referer authentication method. Valid values:
<li>`Black`: blocklist</li>
<li>`White`: allowlist</li>
     * @param AuthType Referer authentication method. Valid values:
<li>`Black`: blocklist</li>
<li>`White`: allowlist</li>
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get List for referer authentication 
     * @return Referers List for referer authentication
     */
    public String [] getReferers() {
        return this.Referers;
    }

    /**
     * Set List for referer authentication
     * @param Referers List for referer authentication
     */
    public void setReferers(String [] Referers) {
        this.Referers = Referers;
    }

    /**
     * Get Whether to allow requests with empty referer to access this domain name. Valid values:
<li>Yes</li>
<li>No</li> 
     * @return BlankRefererAllowed Whether to allow requests with empty referer to access this domain name. Valid values:
<li>Yes</li>
<li>No</li>
     */
    public String getBlankRefererAllowed() {
        return this.BlankRefererAllowed;
    }

    /**
     * Set Whether to allow requests with empty referer to access this domain name. Valid values:
<li>Yes</li>
<li>No</li>
     * @param BlankRefererAllowed Whether to allow requests with empty referer to access this domain name. Valid values:
<li>Yes</li>
<li>No</li>
     */
    public void setBlankRefererAllowed(String BlankRefererAllowed) {
        this.BlankRefererAllowed = BlankRefererAllowed;
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

