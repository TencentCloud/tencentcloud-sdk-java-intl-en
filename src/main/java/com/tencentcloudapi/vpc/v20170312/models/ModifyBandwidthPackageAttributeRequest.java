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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBandwidthPackageAttributeRequest extends AbstractModel{

    /**
    * The unique ID of the bandwidth package.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * The name of the bandwidth package.
    */
    @SerializedName("BandwidthPackageName")
    @Expose
    private String BandwidthPackageName;

    /**
    * The billing mode of the bandwidth package.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * When a monthly-subscribed bandwidth package is returned, whether to convert it to a pay-as-you-go bandwidth packages. Default value: `No`
    */
    @SerializedName("MigrateOnRefund")
    @Expose
    private Boolean MigrateOnRefund;

    /**
     * Get The unique ID of the bandwidth package. 
     * @return BandwidthPackageId The unique ID of the bandwidth package.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set The unique ID of the bandwidth package.
     * @param BandwidthPackageId The unique ID of the bandwidth package.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get The name of the bandwidth package. 
     * @return BandwidthPackageName The name of the bandwidth package.
     */
    public String getBandwidthPackageName() {
        return this.BandwidthPackageName;
    }

    /**
     * Set The name of the bandwidth package.
     * @param BandwidthPackageName The name of the bandwidth package.
     */
    public void setBandwidthPackageName(String BandwidthPackageName) {
        this.BandwidthPackageName = BandwidthPackageName;
    }

    /**
     * Get The billing mode of the bandwidth package. 
     * @return ChargeType The billing mode of the bandwidth package.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set The billing mode of the bandwidth package.
     * @param ChargeType The billing mode of the bandwidth package.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get When a monthly-subscribed bandwidth package is returned, whether to convert it to a pay-as-you-go bandwidth packages. Default value: `No` 
     * @return MigrateOnRefund When a monthly-subscribed bandwidth package is returned, whether to convert it to a pay-as-you-go bandwidth packages. Default value: `No`
     */
    public Boolean getMigrateOnRefund() {
        return this.MigrateOnRefund;
    }

    /**
     * Set When a monthly-subscribed bandwidth package is returned, whether to convert it to a pay-as-you-go bandwidth packages. Default value: `No`
     * @param MigrateOnRefund When a monthly-subscribed bandwidth package is returned, whether to convert it to a pay-as-you-go bandwidth packages. Default value: `No`
     */
    public void setMigrateOnRefund(Boolean MigrateOnRefund) {
        this.MigrateOnRefund = MigrateOnRefund;
    }

    public ModifyBandwidthPackageAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBandwidthPackageAttributeRequest(ModifyBandwidthPackageAttributeRequest source) {
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.BandwidthPackageName != null) {
            this.BandwidthPackageName = new String(source.BandwidthPackageName);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.MigrateOnRefund != null) {
            this.MigrateOnRefund = new Boolean(source.MigrateOnRefund);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "BandwidthPackageName", this.BandwidthPackageName);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "MigrateOnRefund", this.MigrateOnRefund);

    }
}

