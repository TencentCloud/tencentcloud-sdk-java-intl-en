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

public class CreateAddressTemplateRequest extends AbstractModel{

    /**
    * The name of the IP address template
    */
    @SerializedName("AddressTemplateName")
    @Expose
    private String AddressTemplateName;

    /**
    * Address information, including IP, CIDR and IP address range.
    */
    @SerializedName("Addresses")
    @Expose
    private String [] Addresses;

    /**
     * Get The name of the IP address template 
     * @return AddressTemplateName The name of the IP address template
     */
    public String getAddressTemplateName() {
        return this.AddressTemplateName;
    }

    /**
     * Set The name of the IP address template
     * @param AddressTemplateName The name of the IP address template
     */
    public void setAddressTemplateName(String AddressTemplateName) {
        this.AddressTemplateName = AddressTemplateName;
    }

    /**
     * Get Address information, including IP, CIDR and IP address range. 
     * @return Addresses Address information, including IP, CIDR and IP address range.
     */
    public String [] getAddresses() {
        return this.Addresses;
    }

    /**
     * Set Address information, including IP, CIDR and IP address range.
     * @param Addresses Address information, including IP, CIDR and IP address range.
     */
    public void setAddresses(String [] Addresses) {
        this.Addresses = Addresses;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateName", this.AddressTemplateName);
        this.setParamArraySimple(map, prefix + "Addresses.", this.Addresses);

    }
}

