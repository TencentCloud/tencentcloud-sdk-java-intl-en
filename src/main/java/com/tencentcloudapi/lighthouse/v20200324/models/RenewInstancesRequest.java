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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewInstancesRequest extends AbstractModel {

    /**
    * IDs of one or more instances to be operated. The value can be obtained from the `InstanceId` parameter returned by the [DescribeInstances](https://intl.cloud.tencent.com/document/api/1207/47573?from_cn_redirect=1) API. Up to 100 instances can be requested at a time.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Prepaid mode, i.e., monthly subscription. This parameter can specify the purchase period and other attributes such as auto-renewal. It is required for prepaid instances.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * Whether to renew elastic data disks. Values: 
`TRUE`: Renew the elastic data disks attached to the instance as well when the related instance is renewed.
`FALSE`: Do not renew the elastic data disks attached to the instance as well when the related instance is renewed.
Default: `TRUE`
    */
    @SerializedName("RenewDataDisk")
    @Expose
    private Boolean RenewDataDisk;

    /**
    * Whether to automatically use vouchers. Values:
`TRUE`: Use vouchers for payment automatically.
`FALSE`: Do not use vouchers for payment automatically.
Default: `FALSE`.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
     * Get IDs of one or more instances to be operated. The value can be obtained from the `InstanceId` parameter returned by the [DescribeInstances](https://intl.cloud.tencent.com/document/api/1207/47573?from_cn_redirect=1) API. Up to 100 instances can be requested at a time. 
     * @return InstanceIds IDs of one or more instances to be operated. The value can be obtained from the `InstanceId` parameter returned by the [DescribeInstances](https://intl.cloud.tencent.com/document/api/1207/47573?from_cn_redirect=1) API. Up to 100 instances can be requested at a time.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set IDs of one or more instances to be operated. The value can be obtained from the `InstanceId` parameter returned by the [DescribeInstances](https://intl.cloud.tencent.com/document/api/1207/47573?from_cn_redirect=1) API. Up to 100 instances can be requested at a time.
     * @param InstanceIds IDs of one or more instances to be operated. The value can be obtained from the `InstanceId` parameter returned by the [DescribeInstances](https://intl.cloud.tencent.com/document/api/1207/47573?from_cn_redirect=1) API. Up to 100 instances can be requested at a time.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Prepaid mode, i.e., monthly subscription. This parameter can specify the purchase period and other attributes such as auto-renewal. It is required for prepaid instances. 
     * @return InstanceChargePrepaid Prepaid mode, i.e., monthly subscription. This parameter can specify the purchase period and other attributes such as auto-renewal. It is required for prepaid instances.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set Prepaid mode, i.e., monthly subscription. This parameter can specify the purchase period and other attributes such as auto-renewal. It is required for prepaid instances.
     * @param InstanceChargePrepaid Prepaid mode, i.e., monthly subscription. This parameter can specify the purchase period and other attributes such as auto-renewal. It is required for prepaid instances.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get Whether to renew elastic data disks. Values: 
`TRUE`: Renew the elastic data disks attached to the instance as well when the related instance is renewed.
`FALSE`: Do not renew the elastic data disks attached to the instance as well when the related instance is renewed.
Default: `TRUE` 
     * @return RenewDataDisk Whether to renew elastic data disks. Values: 
`TRUE`: Renew the elastic data disks attached to the instance as well when the related instance is renewed.
`FALSE`: Do not renew the elastic data disks attached to the instance as well when the related instance is renewed.
Default: `TRUE`
     */
    public Boolean getRenewDataDisk() {
        return this.RenewDataDisk;
    }

    /**
     * Set Whether to renew elastic data disks. Values: 
`TRUE`: Renew the elastic data disks attached to the instance as well when the related instance is renewed.
`FALSE`: Do not renew the elastic data disks attached to the instance as well when the related instance is renewed.
Default: `TRUE`
     * @param RenewDataDisk Whether to renew elastic data disks. Values: 
`TRUE`: Renew the elastic data disks attached to the instance as well when the related instance is renewed.
`FALSE`: Do not renew the elastic data disks attached to the instance as well when the related instance is renewed.
Default: `TRUE`
     */
    public void setRenewDataDisk(Boolean RenewDataDisk) {
        this.RenewDataDisk = RenewDataDisk;
    }

    /**
     * Get Whether to automatically use vouchers. Values:
`TRUE`: Use vouchers for payment automatically.
`FALSE`: Do not use vouchers for payment automatically.
Default: `FALSE`. 
     * @return AutoVoucher Whether to automatically use vouchers. Values:
`TRUE`: Use vouchers for payment automatically.
`FALSE`: Do not use vouchers for payment automatically.
Default: `FALSE`.
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically use vouchers. Values:
`TRUE`: Use vouchers for payment automatically.
`FALSE`: Do not use vouchers for payment automatically.
Default: `FALSE`.
     * @param AutoVoucher Whether to automatically use vouchers. Values:
`TRUE`: Use vouchers for payment automatically.
`FALSE`: Do not use vouchers for payment automatically.
Default: `FALSE`.
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    public RenewInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewInstancesRequest(RenewInstancesRequest source) {
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
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "RenewDataDisk", this.RenewDataDisk);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);

    }
}

