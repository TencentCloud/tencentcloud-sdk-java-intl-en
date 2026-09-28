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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotifyUnbindTargetRequest extends AbstractModel {

    /**
    * IP list of the backend service.
> **VpcId** (**NumericVpcId**) and **Ips** must be set simultaneously.
    */
    @SerializedName("Ips")
    @Expose
    private String [] Ips;

    /**
    * Numeric ID of the VPC that the backend service belongs to.
> **VpcId** (**NumericVpcId**) and **Ips** must be set simultaneously.
    */
    @SerializedName("NumericVpcId")
    @Expose
    private Long NumericVpcId;

    /**
     * Get IP list of the backend service.
> **VpcId** (**NumericVpcId**) and **Ips** must be set simultaneously. 
     * @return Ips IP list of the backend service.
> **VpcId** (**NumericVpcId**) and **Ips** must be set simultaneously.
     */
    public String [] getIps() {
        return this.Ips;
    }

    /**
     * Set IP list of the backend service.
> **VpcId** (**NumericVpcId**) and **Ips** must be set simultaneously.
     * @param Ips IP list of the backend service.
> **VpcId** (**NumericVpcId**) and **Ips** must be set simultaneously.
     */
    public void setIps(String [] Ips) {
        this.Ips = Ips;
    }

    /**
     * Get Numeric ID of the VPC that the backend service belongs to.
> **VpcId** (**NumericVpcId**) and **Ips** must be set simultaneously. 
     * @return NumericVpcId Numeric ID of the VPC that the backend service belongs to.
> **VpcId** (**NumericVpcId**) and **Ips** must be set simultaneously.
     */
    public Long getNumericVpcId() {
        return this.NumericVpcId;
    }

    /**
     * Set Numeric ID of the VPC that the backend service belongs to.
> **VpcId** (**NumericVpcId**) and **Ips** must be set simultaneously.
     * @param NumericVpcId Numeric ID of the VPC that the backend service belongs to.
> **VpcId** (**NumericVpcId**) and **Ips** must be set simultaneously.
     */
    public void setNumericVpcId(Long NumericVpcId) {
        this.NumericVpcId = NumericVpcId;
    }

    public NotifyUnbindTargetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotifyUnbindTargetRequest(NotifyUnbindTargetRequest source) {
        if (source.Ips != null) {
            this.Ips = new String[source.Ips.length];
            for (int i = 0; i < source.Ips.length; i++) {
                this.Ips[i] = new String(source.Ips[i]);
            }
        }
        if (source.NumericVpcId != null) {
            this.NumericVpcId = new Long(source.NumericVpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ips.", this.Ips);
        this.setParamSimple(map, prefix + "NumericVpcId", this.NumericVpcId);

    }
}

