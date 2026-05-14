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

public class OrderPerLicenseRequest extends AbstractModel {

    /**
    * Device ID for purchasing a permanent License. If it is an unactivated device from the manufacturer, use HardwareId.
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Device type. 0: SDK, 1: CPE. Enter 0 when creating or activating a device as a user. Enter 1 when creating a device to be activated as a manufacturer.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Rollback or not (delete device) after purchase fail, default false. If the device is bound to a currently effective traffic package, rollback is not allowed.
    */
    @SerializedName("RollBack")
    @Expose
    private Boolean RollBack;

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
     * Get Device ID for purchasing a permanent License. If it is an unactivated device from the manufacturer, use HardwareId. 
     * @return DeviceId Device ID for purchasing a permanent License. If it is an unactivated device from the manufacturer, use HardwareId.
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device ID for purchasing a permanent License. If it is an unactivated device from the manufacturer, use HardwareId.
     * @param DeviceId Device ID for purchasing a permanent License. If it is an unactivated device from the manufacturer, use HardwareId.
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Device type. 0: SDK, 1: CPE. Enter 0 when creating or activating a device as a user. Enter 1 when creating a device to be activated as a manufacturer. 
     * @return Type Device type. 0: SDK, 1: CPE. Enter 0 when creating or activating a device as a user. Enter 1 when creating a device to be activated as a manufacturer.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Device type. 0: SDK, 1: CPE. Enter 0 when creating or activating a device as a user. Enter 1 when creating a device to be activated as a manufacturer.
     * @param Type Device type. 0: SDK, 1: CPE. Enter 0 when creating or activating a device as a user. Enter 1 when creating a device to be activated as a manufacturer.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Rollback or not (delete device) after purchase fail, default false. If the device is bound to a currently effective traffic package, rollback is not allowed. 
     * @return RollBack Rollback or not (delete device) after purchase fail, default false. If the device is bound to a currently effective traffic package, rollback is not allowed.
     */
    public Boolean getRollBack() {
        return this.RollBack;
    }

    /**
     * Set Rollback or not (delete device) after purchase fail, default false. If the device is bound to a currently effective traffic package, rollback is not allowed.
     * @param RollBack Rollback or not (delete device) after purchase fail, default false. If the device is bound to a currently effective traffic package, rollback is not allowed.
     */
    public void setRollBack(Boolean RollBack) {
        this.RollBack = RollBack;
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

    public OrderPerLicenseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderPerLicenseRequest(OrderPerLicenseRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.RollBack != null) {
            this.RollBack = new Boolean(source.RollBack);
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
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RollBack", this.RollBack);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);

    }
}

