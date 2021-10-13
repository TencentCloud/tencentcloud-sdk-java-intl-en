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

public class UrlSignatureAuthPolicy extends AbstractModel{

    /**
    * Whether to enable or disable [key hotlink protection](https://intl.cloud.tencent.com/document/product/266/33986). Valid values:
<li>`Enabled`: enable</li>
<li>`Disabled`: disable</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The key for generating the signature of [key hotlink protection](https://intl.cloud.tencent.com/document/product/266/33986).
`EncryptedKey` can contain 8-40 bytes, and cannot contain non-printable characters.
    */
    @SerializedName("EncryptedKey")
    @Expose
    private String EncryptedKey;

    /**
     * Get Whether to enable or disable [key hotlink protection](https://intl.cloud.tencent.com/document/product/266/33986). Valid values:
<li>`Enabled`: enable</li>
<li>`Disabled`: disable</li> 
     * @return Status Whether to enable or disable [key hotlink protection](https://intl.cloud.tencent.com/document/product/266/33986). Valid values:
<li>`Enabled`: enable</li>
<li>`Disabled`: disable</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Whether to enable or disable [key hotlink protection](https://intl.cloud.tencent.com/document/product/266/33986). Valid values:
<li>`Enabled`: enable</li>
<li>`Disabled`: disable</li>
     * @param Status Whether to enable or disable [key hotlink protection](https://intl.cloud.tencent.com/document/product/266/33986). Valid values:
<li>`Enabled`: enable</li>
<li>`Disabled`: disable</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The key for generating the signature of [key hotlink protection](https://intl.cloud.tencent.com/document/product/266/33986).
`EncryptedKey` can contain 8-40 bytes, and cannot contain non-printable characters. 
     * @return EncryptedKey The key for generating the signature of [key hotlink protection](https://intl.cloud.tencent.com/document/product/266/33986).
`EncryptedKey` can contain 8-40 bytes, and cannot contain non-printable characters.
     */
    public String getEncryptedKey() {
        return this.EncryptedKey;
    }

    /**
     * Set The key for generating the signature of [key hotlink protection](https://intl.cloud.tencent.com/document/product/266/33986).
`EncryptedKey` can contain 8-40 bytes, and cannot contain non-printable characters.
     * @param EncryptedKey The key for generating the signature of [key hotlink protection](https://intl.cloud.tencent.com/document/product/266/33986).
`EncryptedKey` can contain 8-40 bytes, and cannot contain non-printable characters.
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

