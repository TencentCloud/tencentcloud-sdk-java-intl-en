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

public class UrlSignatureAuthPolicy extends AbstractModel {

    /**
    * [Key hotlink protection](https://www.tencentcloud.com/document/product/266/14047?from_cn_redirect=1) setting status. Available values:
<li>Enabled: enablement.</li>
<li>Disabled: disabled.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Key used for generating signature in [Key hotlink protection](https://www.tencentcloud.com/document/product/266/14047?from_cn_redirect=1).
The length of the EncryptedKey string is 8–40 bytes. It cannot contain invisible characters.
    */
    @SerializedName("EncryptedKey")
    @Expose
    private String EncryptedKey;

    /**
     * Get [Key hotlink protection](https://www.tencentcloud.com/document/product/266/14047?from_cn_redirect=1) setting status. Available values:
<li>Enabled: enablement.</li>
<li>Disabled: disabled.</li> 
     * @return Status [Key hotlink protection](https://www.tencentcloud.com/document/product/266/14047?from_cn_redirect=1) setting status. Available values:
<li>Enabled: enablement.</li>
<li>Disabled: disabled.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set [Key hotlink protection](https://www.tencentcloud.com/document/product/266/14047?from_cn_redirect=1) setting status. Available values:
<li>Enabled: enablement.</li>
<li>Disabled: disabled.</li>
     * @param Status [Key hotlink protection](https://www.tencentcloud.com/document/product/266/14047?from_cn_redirect=1) setting status. Available values:
<li>Enabled: enablement.</li>
<li>Disabled: disabled.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Key used for generating signature in [Key hotlink protection](https://www.tencentcloud.com/document/product/266/14047?from_cn_redirect=1).
The length of the EncryptedKey string is 8–40 bytes. It cannot contain invisible characters. 
     * @return EncryptedKey Key used for generating signature in [Key hotlink protection](https://www.tencentcloud.com/document/product/266/14047?from_cn_redirect=1).
The length of the EncryptedKey string is 8–40 bytes. It cannot contain invisible characters.
     */
    public String getEncryptedKey() {
        return this.EncryptedKey;
    }

    /**
     * Set Key used for generating signature in [Key hotlink protection](https://www.tencentcloud.com/document/product/266/14047?from_cn_redirect=1).
The length of the EncryptedKey string is 8–40 bytes. It cannot contain invisible characters.
     * @param EncryptedKey Key used for generating signature in [Key hotlink protection](https://www.tencentcloud.com/document/product/266/14047?from_cn_redirect=1).
The length of the EncryptedKey string is 8–40 bytes. It cannot contain invisible characters.
     */
    public void setEncryptedKey(String EncryptedKey) {
        this.EncryptedKey = EncryptedKey;
    }

    public UrlSignatureAuthPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UrlSignatureAuthPolicy(UrlSignatureAuthPolicy source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EncryptedKey != null) {
            this.EncryptedKey = new String(source.EncryptedKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EncryptedKey", this.EncryptedKey);

    }
}

