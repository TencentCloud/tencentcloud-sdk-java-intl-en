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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderFlowPackageRequest extends AbstractModel {

    /**
    * Traffic package specification type. Values are as follows:
DEVICE_1_FLOW_20G,DEVICE_2_FLOW_50G,
DEVICE_3_FLOW_100G,
DEVICE_5_FLOW_500G represents traffic packages of 20G, 50G, 100G, and 500G gear selection.
Gear selection also impacts the bandwidth cap of the data transfer plan.
20G: Bind up to 1 device.
50G: Bind up to 2 devices.
100G: Bind up to 3 devices.
500G: Bind up to 5 devices.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Device ID list bound to the data transfer plan. Number of bundled instances depends on the specification tiers of the plan.
20G: Bind up to 1 device.
50G: Bind up to 2 devices.
100G: Bind up to 3 devices.
500G: Bind up to 5 devices.
    */
    @SerializedName("DeviceList")
    @Expose
    private String [] DeviceList;

    /**
    * Whether the service is automatically renewed conflicts with traffic truncation. You can only enable one option.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Boolean AutoRenewFlag;

    /**
    * Region flag. 0: Chinese mainland, 1: outside the Chinese mainland
    */
    @SerializedName("PackageRegion")
    @Expose
    private Long PackageRegion;

    /**
    * Whether traffic truncation is enabled. This option conflicts with auto renewal.
    */
    @SerializedName("FlowTruncFlag")
    @Expose
    private Boolean FlowTruncFlag;

    /**
    * Whether to automatically select voucher. Default false.
Selection strategy for multiple vouchers: Deduct vouchers by this priority - voucher that can offset the total amount of the Payment Order, voucher with the earliest Expiration, voucher with the maximum deductible amount, voucher with the minimum balance, cash voucher. Only one voucher can be deducted at most.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * Designated voucher ID. This parameter is invalid when selecting voucher automatically. Only one voucher can be input.
Note: If the designated voucher does not meet the order deduction conditions, proceed with normal payment without deducting the voucher.
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
     * Get Traffic package specification type. Values are as follows:
DEVICE_1_FLOW_20G,DEVICE_2_FLOW_50G,
DEVICE_3_FLOW_100G,
DEVICE_5_FLOW_500G represents traffic packages of 20G, 50G, 100G, and 500G gear selection.
Gear selection also impacts the bandwidth cap of the data transfer plan.
20G: Bind up to 1 device.
50G: Bind up to 2 devices.
100G: Bind up to 3 devices.
500G: Bind up to 5 devices. 
     * @return PackageType Traffic package specification type. Values are as follows:
DEVICE_1_FLOW_20G,DEVICE_2_FLOW_50G,
DEVICE_3_FLOW_100G,
DEVICE_5_FLOW_500G represents traffic packages of 20G, 50G, 100G, and 500G gear selection.
Gear selection also impacts the bandwidth cap of the data transfer plan.
20G: Bind up to 1 device.
50G: Bind up to 2 devices.
100G: Bind up to 3 devices.
500G: Bind up to 5 devices.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Traffic package specification type. Values are as follows:
DEVICE_1_FLOW_20G,DEVICE_2_FLOW_50G,
DEVICE_3_FLOW_100G,
DEVICE_5_FLOW_500G represents traffic packages of 20G, 50G, 100G, and 500G gear selection.
Gear selection also impacts the bandwidth cap of the data transfer plan.
20G: Bind up to 1 device.
50G: Bind up to 2 devices.
100G: Bind up to 3 devices.
500G: Bind up to 5 devices.
     * @param PackageType Traffic package specification type. Values are as follows:
DEVICE_1_FLOW_20G,DEVICE_2_FLOW_50G,
DEVICE_3_FLOW_100G,
DEVICE_5_FLOW_500G represents traffic packages of 20G, 50G, 100G, and 500G gear selection.
Gear selection also impacts the bandwidth cap of the data transfer plan.
20G: Bind up to 1 device.
50G: Bind up to 2 devices.
100G: Bind up to 3 devices.
500G: Bind up to 5 devices.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Device ID list bound to the data transfer plan. Number of bundled instances depends on the specification tiers of the plan.
20G: Bind up to 1 device.
50G: Bind up to 2 devices.
100G: Bind up to 3 devices.
500G: Bind up to 5 devices. 
     * @return DeviceList Device ID list bound to the data transfer plan. Number of bundled instances depends on the specification tiers of the plan.
20G: Bind up to 1 device.
50G: Bind up to 2 devices.
100G: Bind up to 3 devices.
500G: Bind up to 5 devices.
     */
    public String [] getDeviceList() {
        return this.DeviceList;
    }

    /**
     * Set Device ID list bound to the data transfer plan. Number of bundled instances depends on the specification tiers of the plan.
20G: Bind up to 1 device.
50G: Bind up to 2 devices.
100G: Bind up to 3 devices.
500G: Bind up to 5 devices.
     * @param DeviceList Device ID list bound to the data transfer plan. Number of bundled instances depends on the specification tiers of the plan.
20G: Bind up to 1 device.
50G: Bind up to 2 devices.
100G: Bind up to 3 devices.
500G: Bind up to 5 devices.
     */
    public void setDeviceList(String [] DeviceList) {
        this.DeviceList = DeviceList;
    }

    /**
     * Get Whether the service is automatically renewed conflicts with traffic truncation. You can only enable one option. 
     * @return AutoRenewFlag Whether the service is automatically renewed conflicts with traffic truncation. You can only enable one option.
     */
    public Boolean getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether the service is automatically renewed conflicts with traffic truncation. You can only enable one option.
     * @param AutoRenewFlag Whether the service is automatically renewed conflicts with traffic truncation. You can only enable one option.
     */
    public void setAutoRenewFlag(Boolean AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Region flag. 0: Chinese mainland, 1: outside the Chinese mainland 
     * @return PackageRegion Region flag. 0: Chinese mainland, 1: outside the Chinese mainland
     */
    public Long getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set Region flag. 0: Chinese mainland, 1: outside the Chinese mainland
     * @param PackageRegion Region flag. 0: Chinese mainland, 1: outside the Chinese mainland
     */
    public void setPackageRegion(Long PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    /**
     * Get Whether traffic truncation is enabled. This option conflicts with auto renewal. 
     * @return FlowTruncFlag Whether traffic truncation is enabled. This option conflicts with auto renewal.
     */
    public Boolean getFlowTruncFlag() {
        return this.FlowTruncFlag;
    }

    /**
     * Set Whether traffic truncation is enabled. This option conflicts with auto renewal.
     * @param FlowTruncFlag Whether traffic truncation is enabled. This option conflicts with auto renewal.
     */
    public void setFlowTruncFlag(Boolean FlowTruncFlag) {
        this.FlowTruncFlag = FlowTruncFlag;
    }

    /**
     * Get Whether to automatically select voucher. Default false.
Selection strategy for multiple vouchers: Deduct vouchers by this priority - voucher that can offset the total amount of the Payment Order, voucher with the earliest Expiration, voucher with the maximum deductible amount, voucher with the minimum balance, cash voucher. Only one voucher can be deducted at most. 
     * @return AutoVoucher Whether to automatically select voucher. Default false.
Selection strategy for multiple vouchers: Deduct vouchers by this priority - voucher that can offset the total amount of the Payment Order, voucher with the earliest Expiration, voucher with the maximum deductible amount, voucher with the minimum balance, cash voucher. Only one voucher can be deducted at most.
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically select voucher. Default false.
Selection strategy for multiple vouchers: Deduct vouchers by this priority - voucher that can offset the total amount of the Payment Order, voucher with the earliest Expiration, voucher with the maximum deductible amount, voucher with the minimum balance, cash voucher. Only one voucher can be deducted at most.
     * @param AutoVoucher Whether to automatically select voucher. Default false.
Selection strategy for multiple vouchers: Deduct vouchers by this priority - voucher that can offset the total amount of the Payment Order, voucher with the earliest Expiration, voucher with the maximum deductible amount, voucher with the minimum balance, cash voucher. Only one voucher can be deducted at most.
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Designated voucher ID. This parameter is invalid when selecting voucher automatically. Only one voucher can be input.
Note: If the designated voucher does not meet the order deduction conditions, proceed with normal payment without deducting the voucher. 
     * @return VoucherIds Designated voucher ID. This parameter is invalid when selecting voucher automatically. Only one voucher can be input.
Note: If the designated voucher does not meet the order deduction conditions, proceed with normal payment without deducting the voucher.
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set Designated voucher ID. This parameter is invalid when selecting voucher automatically. Only one voucher can be input.
Note: If the designated voucher does not meet the order deduction conditions, proceed with normal payment without deducting the voucher.
     * @param VoucherIds Designated voucher ID. This parameter is invalid when selecting voucher automatically. Only one voucher can be input.
Note: If the designated voucher does not meet the order deduction conditions, proceed with normal payment without deducting the voucher.
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    public OrderFlowPackageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderFlowPackageRequest(OrderFlowPackageRequest source) {
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.DeviceList != null) {
            this.DeviceList = new String[source.DeviceList.length];
            for (int i = 0; i < source.DeviceList.length; i++) {
                this.DeviceList[i] = new String(source.DeviceList[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Boolean(source.AutoRenewFlag);
        }
        if (source.PackageRegion != null) {
            this.PackageRegion = new Long(source.PackageRegion);
        }
        if (source.FlowTruncFlag != null) {
            this.FlowTruncFlag = new Boolean(source.FlowTruncFlag);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamArraySimple(map, prefix + "DeviceList.", this.DeviceList);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PackageRegion", this.PackageRegion);
        this.setParamSimple(map, prefix + "FlowTruncFlag", this.FlowTruncFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);

    }
}

