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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewInstanceRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Auto-renewal flag and purchase duration in months for prepayment. Valid values: 0: Manual renewal; 1: Auto-renewal; 2: No renewal and no notification.
    */
    @SerializedName("RegistryChargePrepaid")
    @Expose
    private RegistryChargePrepaid RegistryChargePrepaid;

    /**
    * Valid values: 0: renewal; 1: change from pay-as-you-go to monthly subscription billing
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
     * Get Instance ID 
     * @return RegistryId Instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID
     * @param RegistryId Instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Auto-renewal flag and purchase duration in months for prepayment. Valid values: 0: Manual renewal; 1: Auto-renewal; 2: No renewal and no notification. 
     * @return RegistryChargePrepaid Auto-renewal flag and purchase duration in months for prepayment. Valid values: 0: Manual renewal; 1: Auto-renewal; 2: No renewal and no notification.
     */
    public RegistryChargePrepaid getRegistryChargePrepaid() {
        return this.RegistryChargePrepaid;
    }

    /**
     * Set Auto-renewal flag and purchase duration in months for prepayment. Valid values: 0: Manual renewal; 1: Auto-renewal; 2: No renewal and no notification.
     * @param RegistryChargePrepaid Auto-renewal flag and purchase duration in months for prepayment. Valid values: 0: Manual renewal; 1: Auto-renewal; 2: No renewal and no notification.
     */
    public void setRegistryChargePrepaid(RegistryChargePrepaid RegistryChargePrepaid) {
        this.RegistryChargePrepaid = RegistryChargePrepaid;
    }

    /**
     * Get Valid values: 0: renewal; 1: change from pay-as-you-go to monthly subscription billing 
     * @return Flag Valid values: 0: renewal; 1: change from pay-as-you-go to monthly subscription billing
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set Valid values: 0: renewal; 1: change from pay-as-you-go to monthly subscription billing
     * @param Flag Valid values: 0: renewal; 1: change from pay-as-you-go to monthly subscription billing
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    public RenewInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewInstanceRequest(RenewInstanceRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RegistryChargePrepaid != null) {
            this.RegistryChargePrepaid = new RegistryChargePrepaid(source.RegistryChargePrepaid);
        }
        if (source.Flag != null) {
            this.Flag = new Long(source.Flag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamObj(map, prefix + "RegistryChargePrepaid.", this.RegistryChargePrepaid);
        this.setParamSimple(map, prefix + "Flag", this.Flag);

    }
}

