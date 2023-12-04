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

public class RenewDisksRequest extends AbstractModel {

    /**
    * IDs of cloud disks. The value can be obtained from the `DiskId` parameter returned by the [DescribeDisks](https://intl.cloud.tencent.com/document/product/1207/66093?from_cn_redirect=1) API. Up to 50 disks can be requested at a time.
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Parameter settings for renewing the monthly subscribed cloud disk.
    */
    @SerializedName("RenewDiskChargePrepaid")
    @Expose
    private RenewDiskChargePrepaid RenewDiskChargePrepaid;

    /**
    * Whether to use the vouchers automatically. It defaults to No.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
     * Get IDs of cloud disks. The value can be obtained from the `DiskId` parameter returned by the [DescribeDisks](https://intl.cloud.tencent.com/document/product/1207/66093?from_cn_redirect=1) API. Up to 50 disks can be requested at a time. 
     * @return DiskIds IDs of cloud disks. The value can be obtained from the `DiskId` parameter returned by the [DescribeDisks](https://intl.cloud.tencent.com/document/product/1207/66093?from_cn_redirect=1) API. Up to 50 disks can be requested at a time.
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set IDs of cloud disks. The value can be obtained from the `DiskId` parameter returned by the [DescribeDisks](https://intl.cloud.tencent.com/document/product/1207/66093?from_cn_redirect=1) API. Up to 50 disks can be requested at a time.
     * @param DiskIds IDs of cloud disks. The value can be obtained from the `DiskId` parameter returned by the [DescribeDisks](https://intl.cloud.tencent.com/document/product/1207/66093?from_cn_redirect=1) API. Up to 50 disks can be requested at a time.
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Parameter settings for renewing the monthly subscribed cloud disk. 
     * @return RenewDiskChargePrepaid Parameter settings for renewing the monthly subscribed cloud disk.
     */
    public RenewDiskChargePrepaid getRenewDiskChargePrepaid() {
        return this.RenewDiskChargePrepaid;
    }

    /**
     * Set Parameter settings for renewing the monthly subscribed cloud disk.
     * @param RenewDiskChargePrepaid Parameter settings for renewing the monthly subscribed cloud disk.
     */
    public void setRenewDiskChargePrepaid(RenewDiskChargePrepaid RenewDiskChargePrepaid) {
        this.RenewDiskChargePrepaid = RenewDiskChargePrepaid;
    }

    /**
     * Get Whether to use the vouchers automatically. It defaults to No. 
     * @return AutoVoucher Whether to use the vouchers automatically. It defaults to No.
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to use the vouchers automatically. It defaults to No.
     * @param AutoVoucher Whether to use the vouchers automatically. It defaults to No.
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    public RenewDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewDisksRequest(RenewDisksRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.RenewDiskChargePrepaid != null) {
            this.RenewDiskChargePrepaid = new RenewDiskChargePrepaid(source.RenewDiskChargePrepaid);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamObj(map, prefix + "RenewDiskChargePrepaid.", this.RenewDiskChargePrepaid);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);

    }
}

