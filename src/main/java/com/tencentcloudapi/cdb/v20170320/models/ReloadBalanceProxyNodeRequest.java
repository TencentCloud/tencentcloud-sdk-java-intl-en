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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReloadBalanceProxyNodeRequest extends AbstractModel {

    /**
    * Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Proxy group address ID. You can obtain it through the API [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1).
Note:
1. For dual-node instances, this parameter is optional. If not provided, load balancing will be performed for ALL proxy group addresses.
2. For cloud disk edition instances, this parameter is required.
    */
    @SerializedName("ProxyAddressId")
    @Expose
    private String ProxyAddressId;

    /**
     * Get Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API. 
     * @return ProxyGroupId Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
     * @param ProxyGroupId Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get Proxy group address ID. You can obtain it through the API [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1).
Note:
1. For dual-node instances, this parameter is optional. If not provided, load balancing will be performed for ALL proxy group addresses.
2. For cloud disk edition instances, this parameter is required. 
     * @return ProxyAddressId Proxy group address ID. You can obtain it through the API [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1).
Note:
1. For dual-node instances, this parameter is optional. If not provided, load balancing will be performed for ALL proxy group addresses.
2. For cloud disk edition instances, this parameter is required.
     */
    public String getProxyAddressId() {
        return this.ProxyAddressId;
    }

    /**
     * Set Proxy group address ID. You can obtain it through the API [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1).
Note:
1. For dual-node instances, this parameter is optional. If not provided, load balancing will be performed for ALL proxy group addresses.
2. For cloud disk edition instances, this parameter is required.
     * @param ProxyAddressId Proxy group address ID. You can obtain it through the API [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1).
Note:
1. For dual-node instances, this parameter is optional. If not provided, load balancing will be performed for ALL proxy group addresses.
2. For cloud disk edition instances, this parameter is required.
     */
    public void setProxyAddressId(String ProxyAddressId) {
        this.ProxyAddressId = ProxyAddressId;
    }

    public ReloadBalanceProxyNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReloadBalanceProxyNodeRequest(ReloadBalanceProxyNodeRequest source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ProxyAddressId != null) {
            this.ProxyAddressId = new String(source.ProxyAddressId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ProxyAddressId", this.ProxyAddressId);

    }
}

