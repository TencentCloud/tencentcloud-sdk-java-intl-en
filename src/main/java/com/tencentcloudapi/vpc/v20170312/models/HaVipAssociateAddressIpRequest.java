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

public class HaVipAssociateAddressIpRequest extends AbstractModel{

    /**
    * The unique `ID` of the `HAVIP`, such as `havip-9o233uri`. This must be a `HAVIP` that has not been bound to an `EIP`
    */
    @SerializedName("HaVipId")
    @Expose
    private String HaVipId;

    /**
    * The Elastic `IP`. This must be an `EIP` that has not been bound to a `HAVIP`
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
     * Get The unique `ID` of the `HAVIP`, such as `havip-9o233uri`. This must be a `HAVIP` that has not been bound to an `EIP` 
     * @return HaVipId The unique `ID` of the `HAVIP`, such as `havip-9o233uri`. This must be a `HAVIP` that has not been bound to an `EIP`
     */
    public String getHaVipId() {
        return this.HaVipId;
    }

    /**
     * Set The unique `ID` of the `HAVIP`, such as `havip-9o233uri`. This must be a `HAVIP` that has not been bound to an `EIP`
     * @param HaVipId The unique `ID` of the `HAVIP`, such as `havip-9o233uri`. This must be a `HAVIP` that has not been bound to an `EIP`
     */
    public void setHaVipId(String HaVipId) {
        this.HaVipId = HaVipId;
    }

    /**
     * Get The Elastic `IP`. This must be an `EIP` that has not been bound to a `HAVIP` 
     * @return AddressIp The Elastic `IP`. This must be an `EIP` that has not been bound to a `HAVIP`
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set The Elastic `IP`. This must be an `EIP` that has not been bound to a `HAVIP`
     * @param AddressIp The Elastic `IP`. This must be an `EIP` that has not been bound to a `HAVIP`
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    public HaVipAssociateAddressIpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HaVipAssociateAddressIpRequest(HaVipAssociateAddressIpRequest source) {
        if (source.HaVipId != null) {
            this.HaVipId = new String(source.HaVipId);
        }
        if (source.AddressIp != null) {
            this.AddressIp = new String(source.AddressIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HaVipId", this.HaVipId);
        this.setParamSimple(map, prefix + "AddressIp", this.AddressIp);

    }
}

