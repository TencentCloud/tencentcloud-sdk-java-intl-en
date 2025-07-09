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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceRenewInstancesRequest extends AbstractModel {

    /**
    * IDs of the instances to be renewed. Each request can contain up to 50 instances at a time. You can get an instance ID from the `InstanceId` returned by the [DescribeInstances](https://intl.cloud.tencent.com/document/api/1207/47573?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Parameter setting for prepaid mode. This parameter can specify the renewal period, whether to enable auto-renewal, and other attributes of the monthly subscribed instances.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * Whether to renew the data disk. Default: `false`.
    */
    @SerializedName("RenewDataDisk")
    @Expose
    private Boolean RenewDataDisk;

    /**
    * Whether to align the data disk expiration with the instance expiration time. Default: `false`.
    */
    @SerializedName("AlignInstanceExpiredTime")
    @Expose
    private Boolean AlignInstanceExpiredTime;

    /**
     * Get IDs of the instances to be renewed. Each request can contain up to 50 instances at a time. You can get an instance ID from the `InstanceId` returned by the [DescribeInstances](https://intl.cloud.tencent.com/document/api/1207/47573?from_cn_redirect=1) API. 
     * @return InstanceIds IDs of the instances to be renewed. Each request can contain up to 50 instances at a time. You can get an instance ID from the `InstanceId` returned by the [DescribeInstances](https://intl.cloud.tencent.com/document/api/1207/47573?from_cn_redirect=1) API.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set IDs of the instances to be renewed. Each request can contain up to 50 instances at a time. You can get an instance ID from the `InstanceId` returned by the [DescribeInstances](https://intl.cloud.tencent.com/document/api/1207/47573?from_cn_redirect=1) API.
     * @param InstanceIds IDs of the instances to be renewed. Each request can contain up to 50 instances at a time. You can get an instance ID from the `InstanceId` returned by the [DescribeInstances](https://intl.cloud.tencent.com/document/api/1207/47573?from_cn_redirect=1) API.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Parameter setting for prepaid mode. This parameter can specify the renewal period, whether to enable auto-renewal, and other attributes of the monthly subscribed instances. 
     * @return InstanceChargePrepaid Parameter setting for prepaid mode. This parameter can specify the renewal period, whether to enable auto-renewal, and other attributes of the monthly subscribed instances.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set Parameter setting for prepaid mode. This parameter can specify the renewal period, whether to enable auto-renewal, and other attributes of the monthly subscribed instances.
     * @param InstanceChargePrepaid Parameter setting for prepaid mode. This parameter can specify the renewal period, whether to enable auto-renewal, and other attributes of the monthly subscribed instances.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get Whether to renew the data disk. Default: `false`. 
     * @return RenewDataDisk Whether to renew the data disk. Default: `false`.
     */
    public Boolean getRenewDataDisk() {
        return this.RenewDataDisk;
    }

    /**
     * Set Whether to renew the data disk. Default: `false`.
     * @param RenewDataDisk Whether to renew the data disk. Default: `false`.
     */
    public void setRenewDataDisk(Boolean RenewDataDisk) {
        this.RenewDataDisk = RenewDataDisk;
    }

    /**
     * Get Whether to align the data disk expiration with the instance expiration time. Default: `false`. 
     * @return AlignInstanceExpiredTime Whether to align the data disk expiration with the instance expiration time. Default: `false`.
     */
    public Boolean getAlignInstanceExpiredTime() {
        return this.AlignInstanceExpiredTime;
    }

    /**
     * Set Whether to align the data disk expiration with the instance expiration time. Default: `false`.
     * @param AlignInstanceExpiredTime Whether to align the data disk expiration with the instance expiration time. Default: `false`.
     */
    public void setAlignInstanceExpiredTime(Boolean AlignInstanceExpiredTime) {
        this.AlignInstanceExpiredTime = AlignInstanceExpiredTime;
    }

    public InquirePriceRenewInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceRenewInstancesRequest(InquirePriceRenewInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.RenewDataDisk != null) {
            this.RenewDataDisk = new Boolean(source.RenewDataDisk);
        }
        if (source.AlignInstanceExpiredTime != null) {
            this.AlignInstanceExpiredTime = new Boolean(source.AlignInstanceExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "RenewDataDisk", this.RenewDataDisk);
        this.setParamSimple(map, prefix + "AlignInstanceExpiredTime", this.AlignInstanceExpiredTime);

    }
}

