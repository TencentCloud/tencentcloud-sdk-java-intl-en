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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewInstanceRequest extends AbstractModel {

    /**
    * Validity period in months
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The parameter used to determine whether to modify the billing mode. <ul><li>If you want to change the billing mode from pay-as-you-go to monthly subscription, specify this parameter as <b>prepaid</b>. </li><li>If the current instance is monthly subscribed, this parameter is not required. </li></ul>
    */
    @SerializedName("ModifyPayMode")
    @Expose
    private String ModifyPayMode;

    /**
     * Get Validity period in months 
     * @return Period Validity period in months
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Validity period in months
     * @param Period Validity period in months
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

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
     * Get The parameter used to determine whether to modify the billing mode. <ul><li>If you want to change the billing mode from pay-as-you-go to monthly subscription, specify this parameter as <b>prepaid</b>. </li><li>If the current instance is monthly subscribed, this parameter is not required. </li></ul> 
     * @return ModifyPayMode The parameter used to determine whether to modify the billing mode. <ul><li>If you want to change the billing mode from pay-as-you-go to monthly subscription, specify this parameter as <b>prepaid</b>. </li><li>If the current instance is monthly subscribed, this parameter is not required. </li></ul>
     */
    public String getModifyPayMode() {
        return this.ModifyPayMode;
    }

    /**
     * Set The parameter used to determine whether to modify the billing mode. <ul><li>If you want to change the billing mode from pay-as-you-go to monthly subscription, specify this parameter as <b>prepaid</b>. </li><li>If the current instance is monthly subscribed, this parameter is not required. </li></ul>
     * @param ModifyPayMode The parameter used to determine whether to modify the billing mode. <ul><li>If you want to change the billing mode from pay-as-you-go to monthly subscription, specify this parameter as <b>prepaid</b>. </li><li>If the current instance is monthly subscribed, this parameter is not required. </li></ul>
     */
    public void setModifyPayMode(String ModifyPayMode) {
        this.ModifyPayMode = ModifyPayMode;
    }

    public RenewInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewInstanceRequest(RenewInstanceRequest source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ModifyPayMode != null) {
            this.ModifyPayMode = new String(source.ModifyPayMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ModifyPayMode", this.ModifyPayMode);

    }
}

