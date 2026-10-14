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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeLicenseRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li>Default value: platinum
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * Indicates whether to use vouchers automatically<li>0: Do not use automatically.</li><li>1: Use automatically.</li>Default value: 0.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Voucher ID list. Only one voucher can be specified.
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li><li>If no parameter is passed, the original status is maintained by default. When passing a parameter, note that it can only change from not enabled to enabled, and cannot change from enabled to not enabled</li>
    */
    @SerializedName("BasicSecurityType")
    @Expose
    private Long BasicSecurityType;

    /**
    * Whether to force restart <li>true: force restart</li><li>false: do not force restart</li> Default value: false
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li>Default value: platinum 
     * @return LicenseType License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li>Default value: platinum
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li>Default value: platinum
     * @param LicenseType License type<li>oss: open source edition</li><li>basic: basic version</li><li>platinum: platinum version</li>Default value: platinum
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get Indicates whether to use vouchers automatically<li>0: Do not use automatically.</li><li>1: Use automatically.</li>Default value: 0. 
     * @return AutoVoucher Indicates whether to use vouchers automatically<li>0: Do not use automatically.</li><li>1: Use automatically.</li>Default value: 0.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Indicates whether to use vouchers automatically<li>0: Do not use automatically.</li><li>1: Use automatically.</li>Default value: 0.
     * @param AutoVoucher Indicates whether to use vouchers automatically<li>0: Do not use automatically.</li><li>1: Use automatically.</li>Default value: 0.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Voucher ID list. Only one voucher can be specified. 
     * @return VoucherIds Voucher ID list. Only one voucher can be specified.
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set Voucher ID list. Only one voucher can be specified.
     * @param VoucherIds Voucher ID list. Only one voucher can be specified.
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li><li>If no parameter is passed, the original status is maintained by default. When passing a parameter, note that it can only change from not enabled to enabled, and cannot change from enabled to not enabled</li> 
     * @return BasicSecurityType Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li><li>If no parameter is passed, the original status is maintained by default. When passing a parameter, note that it can only change from not enabled to enabled, and cannot change from enabled to not enabled</li>
     */
    public Long getBasicSecurityType() {
        return this.BasicSecurityType;
    }

    /**
     * Set Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li><li>If no parameter is passed, the original status is maintained by default. When passing a parameter, note that it can only change from not enabled to enabled, and cannot change from enabled to not enabled</li>
     * @param BasicSecurityType Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li><li>If no parameter is passed, the original status is maintained by default. When passing a parameter, note that it can only change from not enabled to enabled, and cannot change from enabled to not enabled</li>
     */
    public void setBasicSecurityType(Long BasicSecurityType) {
        this.BasicSecurityType = BasicSecurityType;
    }

    /**
     * Get Whether to force restart <li>true: force restart</li><li>false: do not force restart</li> Default value: false 
     * @return ForceRestart Whether to force restart <li>true: force restart</li><li>false: do not force restart</li> Default value: false
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set Whether to force restart <li>true: force restart</li><li>false: do not force restart</li> Default value: false
     * @param ForceRestart Whether to force restart <li>true: force restart</li><li>false: do not force restart</li> Default value: false
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    public UpgradeLicenseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeLicenseRequest(UpgradeLicenseRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.BasicSecurityType != null) {
            this.BasicSecurityType = new Long(source.BasicSecurityType);
        }
        if (source.ForceRestart != null) {
            this.ForceRestart = new Boolean(source.ForceRestart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "BasicSecurityType", this.BasicSecurityType);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);

    }
}

