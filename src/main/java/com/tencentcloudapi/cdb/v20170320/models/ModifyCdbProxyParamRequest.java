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

public class ModifyCdbProxyParamRequest extends AbstractModel {

    /**
    * Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Connection pool threshold. Value ranges from above 0 to less than or equal to 300.
Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be equal to or greater than MySQL 8.0 20230630.
    */
    @SerializedName("ConnectionPoolLimit")
    @Expose
    private Long ConnectionPoolLimit;

    /**
     * Get Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

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
     * Get Connection pool threshold. Value ranges from above 0 to less than or equal to 300.
Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be equal to or greater than MySQL 8.0 20230630. 
     * @return ConnectionPoolLimit Connection pool threshold. Value ranges from above 0 to less than or equal to 300.
Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be equal to or greater than MySQL 8.0 20230630.
     */
    public Long getConnectionPoolLimit() {
        return this.ConnectionPoolLimit;
    }

    /**
     * Set Connection pool threshold. Value ranges from above 0 to less than or equal to 300.
Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be equal to or greater than MySQL 8.0 20230630.
     * @param ConnectionPoolLimit Connection pool threshold. Value ranges from above 0 to less than or equal to 300.
Note: If you need to use the database proxy connection pool capability, the kernel minor version of the MySQL 8.0 primary instance must be equal to or greater than MySQL 8.0 20230630.
     */
    public void setConnectionPoolLimit(Long ConnectionPoolLimit) {
        this.ConnectionPoolLimit = ConnectionPoolLimit;
    }

    public ModifyCdbProxyParamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCdbProxyParamRequest(ModifyCdbProxyParamRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ConnectionPoolLimit != null) {
            this.ConnectionPoolLimit = new Long(source.ConnectionPoolLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ConnectionPoolLimit", this.ConnectionPoolLimit);

    }
}

