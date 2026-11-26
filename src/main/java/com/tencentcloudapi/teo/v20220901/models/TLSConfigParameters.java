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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TLSConfigParameters extends AbstractModel {

    /**
    * TLS version. At least one is required. If multiple versions are specified, they need to be consecutive version numbers. For example, if you enable TLS 1, 1.1, 1.2, and 1.3, you cannot only enable 1 and 1.2 while disabling 1.1. Valid values: <li>TLSv1: TLSv1 version</li><li>TLSv1.1: TLSv1.1 version</li><li>TLSv1.2: TLSv1.2 version</li><li>TLSv1.3: TLSv1.3 version.</li>
    */
    @SerializedName("Version")
    @Expose
    private String [] Version;

    /**
    * Cipher suite. For details, see [TLS version and cipher suite description](https://www.tencentcloud.com/document/product/1552/86545?from_cn_redirect=1). Valid values: <li>loose-v2023: loose-v2023 cipher suite;</li><li>general-v2023: general-v2023 cipher suite;</li><li>strict-v2023: strict-v2023 cipher suite.</li>
    */
    @SerializedName("CipherSuite")
    @Expose
    private String CipherSuite;

    /**
     * Get TLS version. At least one is required. If multiple versions are specified, they need to be consecutive version numbers. For example, if you enable TLS 1, 1.1, 1.2, and 1.3, you cannot only enable 1 and 1.2 while disabling 1.1. Valid values: <li>TLSv1: TLSv1 version</li><li>TLSv1.1: TLSv1.1 version</li><li>TLSv1.2: TLSv1.2 version</li><li>TLSv1.3: TLSv1.3 version.</li> 
     * @return Version TLS version. At least one is required. If multiple versions are specified, they need to be consecutive version numbers. For example, if you enable TLS 1, 1.1, 1.2, and 1.3, you cannot only enable 1 and 1.2 while disabling 1.1. Valid values: <li>TLSv1: TLSv1 version</li><li>TLSv1.1: TLSv1.1 version</li><li>TLSv1.2: TLSv1.2 version</li><li>TLSv1.3: TLSv1.3 version.</li>
     */
    public String [] getVersion() {
        return this.Version;
    }

    /**
     * Set TLS version. At least one is required. If multiple versions are specified, they need to be consecutive version numbers. For example, if you enable TLS 1, 1.1, 1.2, and 1.3, you cannot only enable 1 and 1.2 while disabling 1.1. Valid values: <li>TLSv1: TLSv1 version</li><li>TLSv1.1: TLSv1.1 version</li><li>TLSv1.2: TLSv1.2 version</li><li>TLSv1.3: TLSv1.3 version.</li>
     * @param Version TLS version. At least one is required. If multiple versions are specified, they need to be consecutive version numbers. For example, if you enable TLS 1, 1.1, 1.2, and 1.3, you cannot only enable 1 and 1.2 while disabling 1.1. Valid values: <li>TLSv1: TLSv1 version</li><li>TLSv1.1: TLSv1.1 version</li><li>TLSv1.2: TLSv1.2 version</li><li>TLSv1.3: TLSv1.3 version.</li>
     */
    public void setVersion(String [] Version) {
        this.Version = Version;
    }

    /**
     * Get Cipher suite. For details, see [TLS version and cipher suite description](https://www.tencentcloud.com/document/product/1552/86545?from_cn_redirect=1). Valid values: <li>loose-v2023: loose-v2023 cipher suite;</li><li>general-v2023: general-v2023 cipher suite;</li><li>strict-v2023: strict-v2023 cipher suite.</li> 
     * @return CipherSuite Cipher suite. For details, see [TLS version and cipher suite description](https://www.tencentcloud.com/document/product/1552/86545?from_cn_redirect=1). Valid values: <li>loose-v2023: loose-v2023 cipher suite;</li><li>general-v2023: general-v2023 cipher suite;</li><li>strict-v2023: strict-v2023 cipher suite.</li>
     */
    public String getCipherSuite() {
        return this.CipherSuite;
    }

    /**
     * Set Cipher suite. For details, see [TLS version and cipher suite description](https://www.tencentcloud.com/document/product/1552/86545?from_cn_redirect=1). Valid values: <li>loose-v2023: loose-v2023 cipher suite;</li><li>general-v2023: general-v2023 cipher suite;</li><li>strict-v2023: strict-v2023 cipher suite.</li>
     * @param CipherSuite Cipher suite. For details, see [TLS version and cipher suite description](https://www.tencentcloud.com/document/product/1552/86545?from_cn_redirect=1). Valid values: <li>loose-v2023: loose-v2023 cipher suite;</li><li>general-v2023: general-v2023 cipher suite;</li><li>strict-v2023: strict-v2023 cipher suite.</li>
     */
    public void setCipherSuite(String CipherSuite) {
        this.CipherSuite = CipherSuite;
    }

    public TLSConfigParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TLSConfigParameters(TLSConfigParameters source) {
        if (source.Version != null) {
            this.Version = new String[source.Version.length];
            for (int i = 0; i < source.Version.length; i++) {
                this.Version[i] = new String(source.Version[i]);
            }
        }
        if (source.CipherSuite != null) {
            this.CipherSuite = new String(source.CipherSuite);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Version.", this.Version);
        this.setParamSimple(map, prefix + "CipherSuite", this.CipherSuite);

    }
}

