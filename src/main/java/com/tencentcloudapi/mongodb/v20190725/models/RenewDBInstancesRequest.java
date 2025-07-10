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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewDBInstancesRequest extends AbstractModel {

    /**
    * Specifies the ID or IDs of one or multiple instances to be renewed.
 - You can obtain the IDs from **InstanceIds** in the return values of the [DescribeDBInstances](https://intl.cloud.tencent.com/document/product/240/38568?from_cn_redirect=1) API.
 - The maximum number of instances for each renewal request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * The parameter setting for the prepaid mode (monthly subscription mode). This parameter can specify the renewal period, whether to set automatic renewal, and other attributes of the monthly subscription instance. This parameter is mandatory in monthly subscription.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
     * Get Specifies the ID or IDs of one or multiple instances to be renewed.
 - You can obtain the IDs from **InstanceIds** in the return values of the [DescribeDBInstances](https://intl.cloud.tencent.com/document/product/240/38568?from_cn_redirect=1) API.
 - The maximum number of instances for each renewal request is 100. 
     * @return InstanceIds Specifies the ID or IDs of one or multiple instances to be renewed.
 - You can obtain the IDs from **InstanceIds** in the return values of the [DescribeDBInstances](https://intl.cloud.tencent.com/document/product/240/38568?from_cn_redirect=1) API.
 - The maximum number of instances for each renewal request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Specifies the ID or IDs of one or multiple instances to be renewed.
 - You can obtain the IDs from **InstanceIds** in the return values of the [DescribeDBInstances](https://intl.cloud.tencent.com/document/product/240/38568?from_cn_redirect=1) API.
 - The maximum number of instances for each renewal request is 100.
     * @param InstanceIds Specifies the ID or IDs of one or multiple instances to be renewed.
 - You can obtain the IDs from **InstanceIds** in the return values of the [DescribeDBInstances](https://intl.cloud.tencent.com/document/product/240/38568?from_cn_redirect=1) API.
 - The maximum number of instances for each renewal request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get The parameter setting for the prepaid mode (monthly subscription mode). This parameter can specify the renewal period, whether to set automatic renewal, and other attributes of the monthly subscription instance. This parameter is mandatory in monthly subscription. 
     * @return InstanceChargePrepaid The parameter setting for the prepaid mode (monthly subscription mode). This parameter can specify the renewal period, whether to set automatic renewal, and other attributes of the monthly subscription instance. This parameter is mandatory in monthly subscription.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set The parameter setting for the prepaid mode (monthly subscription mode). This parameter can specify the renewal period, whether to set automatic renewal, and other attributes of the monthly subscription instance. This parameter is mandatory in monthly subscription.
     * @param InstanceChargePrepaid The parameter setting for the prepaid mode (monthly subscription mode). This parameter can specify the renewal period, whether to set automatic renewal, and other attributes of the monthly subscription instance. This parameter is mandatory in monthly subscription.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    public RenewDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewDBInstancesRequest(RenewDBInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);

    }
}

