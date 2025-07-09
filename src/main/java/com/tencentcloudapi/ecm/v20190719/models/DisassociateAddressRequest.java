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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateAddressRequest extends AbstractModel {

    /**
    * ECM region
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * Unique EIP ID, such as `eip-11112222`.
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * Indicates whether to assign a general public IP after unbinding an EIP. Valid values:
TRUE: yes
FALSE: no.
Default value: FALSE.

You can specify this parameter only under the following conditions:
You can specify this parameter only when you unbind an EIP from the primary private IP of the primary ENI.
An account can reassign a general public IP after unbinding an EIP 10 times a day. More information can be obtained through the `DescribeAddressQuota` API.
    */
    @SerializedName("ReallocateNormalPublicIp")
    @Expose
    private Boolean ReallocateNormalPublicIp;

    /**
     * Get ECM region 
     * @return EcmRegion ECM region
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM region
     * @param EcmRegion ECM region
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get Unique EIP ID, such as `eip-11112222`. 
     * @return AddressId Unique EIP ID, such as `eip-11112222`.
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set Unique EIP ID, such as `eip-11112222`.
     * @param AddressId Unique EIP ID, such as `eip-11112222`.
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get Indicates whether to assign a general public IP after unbinding an EIP. Valid values:
TRUE: yes
FALSE: no.
Default value: FALSE.

You can specify this parameter only under the following conditions:
You can specify this parameter only when you unbind an EIP from the primary private IP of the primary ENI.
An account can reassign a general public IP after unbinding an EIP 10 times a day. More information can be obtained through the `DescribeAddressQuota` API. 
     * @return ReallocateNormalPublicIp Indicates whether to assign a general public IP after unbinding an EIP. Valid values:
TRUE: yes
FALSE: no.
Default value: FALSE.

You can specify this parameter only under the following conditions:
You can specify this parameter only when you unbind an EIP from the primary private IP of the primary ENI.
An account can reassign a general public IP after unbinding an EIP 10 times a day. More information can be obtained through the `DescribeAddressQuota` API.
     */
    public Boolean getReallocateNormalPublicIp() {
        return this.ReallocateNormalPublicIp;
    }

    /**
     * Set Indicates whether to assign a general public IP after unbinding an EIP. Valid values:
TRUE: yes
FALSE: no.
Default value: FALSE.

You can specify this parameter only under the following conditions:
You can specify this parameter only when you unbind an EIP from the primary private IP of the primary ENI.
An account can reassign a general public IP after unbinding an EIP 10 times a day. More information can be obtained through the `DescribeAddressQuota` API.
     * @param ReallocateNormalPublicIp Indicates whether to assign a general public IP after unbinding an EIP. Valid values:
TRUE: yes
FALSE: no.
Default value: FALSE.

You can specify this parameter only under the following conditions:
You can specify this parameter only when you unbind an EIP from the primary private IP of the primary ENI.
An account can reassign a general public IP after unbinding an EIP 10 times a day. More information can be obtained through the `DescribeAddressQuota` API.
     */
    public void setReallocateNormalPublicIp(Boolean ReallocateNormalPublicIp) {
        this.ReallocateNormalPublicIp = ReallocateNormalPublicIp;
    }

    public DisassociateAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateAddressRequest(DisassociateAddressRequest source) {
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.ReallocateNormalPublicIp != null) {
            this.ReallocateNormalPublicIp = new Boolean(source.ReallocateNormalPublicIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "ReallocateNormalPublicIp", this.ReallocateNormalPublicIp);

    }
}

