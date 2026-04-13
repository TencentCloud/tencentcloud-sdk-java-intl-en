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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloseDBExtranetAccessRequest extends AbstractModel {

    /**
    * Specifies the instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en). such as postgres-6r233v55.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Specifies whether to close public network Ipv6. 1: yes. 0: no. default value: 0.
    */
    @SerializedName("IsIpv6")
    @Expose
    private Long IsIpv6;

    /**
     * Get Specifies the instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en). such as postgres-6r233v55. 
     * @return DBInstanceId Specifies the instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en). such as postgres-6r233v55.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Specifies the instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en). such as postgres-6r233v55.
     * @param DBInstanceId Specifies the instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en). such as postgres-6r233v55.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Specifies whether to close public network Ipv6. 1: yes. 0: no. default value: 0. 
     * @return IsIpv6 Specifies whether to close public network Ipv6. 1: yes. 0: no. default value: 0.
     */
    public Long getIsIpv6() {
        return this.IsIpv6;
    }

    /**
     * Set Specifies whether to close public network Ipv6. 1: yes. 0: no. default value: 0.
     * @param IsIpv6 Specifies whether to close public network Ipv6. 1: yes. 0: no. default value: 0.
     */
    public void setIsIpv6(Long IsIpv6) {
        this.IsIpv6 = IsIpv6;
    }

    public CloseDBExtranetAccessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloseDBExtranetAccessRequest(CloseDBExtranetAccessRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.IsIpv6 != null) {
            this.IsIpv6 = new Long(source.IsIpv6);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "IsIpv6", this.IsIpv6);

    }
}

