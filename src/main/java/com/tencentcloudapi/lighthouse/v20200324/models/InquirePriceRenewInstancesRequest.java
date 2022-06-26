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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceRenewInstancesRequest extends AbstractModel{

    /**
    * Instance to be renewed.
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
    * Whether to renew the data disk
    */
    @SerializedName("RenewDataDisk")
    @Expose
    private Boolean RenewDataDisk;

    /**
    * Whether the data disk has the same expiration time as the instance
    */
    @SerializedName("AlignInstanceExpiredTime")
    @Expose
    private Boolean AlignInstanceExpiredTime;

    /**
     * Get Instance to be renewed. 
     * @return InstanceIds Instance to be renewed.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance to be renewed.
     * @param InstanceIds Instance to be renewed.
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
     * Get Whether to renew the data disk 
     * @return RenewDataDisk Whether to renew the data disk
     */
    public Boolean getRenewDataDisk() {
        return this.RenewDataDisk;
    }

    /**
     * Set Whether to renew the data disk
     * @param RenewDataDisk Whether to renew the data disk
     */
    public void setRenewDataDisk(Boolean RenewDataDisk) {
        this.RenewDataDisk = RenewDataDisk;
    }

    /**
     * Get Whether the data disk has the same expiration time as the instance 
     * @return AlignInstanceExpiredTime Whether the data disk has the same expiration time as the instance
     */
    public Boolean getAlignInstanceExpiredTime() {
        return this.AlignInstanceExpiredTime;
    }

    /**
     * Set Whether the data disk has the same expiration time as the instance
     * @param AlignInstanceExpiredTime Whether the data disk has the same expiration time as the instance
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

