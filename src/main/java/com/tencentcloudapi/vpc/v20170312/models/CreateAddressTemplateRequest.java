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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAddressTemplateRequest extends AbstractModel {

    /**
    * IP address template name.
    */
    @SerializedName("AddressTemplateName")
    @Expose
    private String AddressTemplateName;

    /**
    * The address information can be presented by the IP, CIDR block or IP address range. Either Addresses or AddressesExtra is required.
    */
    @SerializedName("Addresses")
    @Expose
    private String [] Addresses;

    /**
    * The address information can contain remarks and be presented by the IP, CIDR block or IP address range. Either Addresses or AddressesExtra is required.
    */
    @SerializedName("AddressesExtra")
    @Expose
    private AddressInfo [] AddressesExtra;

    /**
     * Get IP address template name. 
     * @return AddressTemplateName IP address template name.
     */
    public String getAddressTemplateName() {
        return this.AddressTemplateName;
    }

    /**
     * Set IP address template name.
     * @param AddressTemplateName IP address template name.
     */
    public void setAddressTemplateName(String AddressTemplateName) {
        this.AddressTemplateName = AddressTemplateName;
    }

    /**
     * Get The address information can be presented by the IP, CIDR block or IP address range. Either Addresses or AddressesExtra is required. 
     * @return Addresses The address information can be presented by the IP, CIDR block or IP address range. Either Addresses or AddressesExtra is required.
     */
    public String [] getAddresses() {
        return this.Addresses;
    }

    /**
     * Set The address information can be presented by the IP, CIDR block or IP address range. Either Addresses or AddressesExtra is required.
     * @param Addresses The address information can be presented by the IP, CIDR block or IP address range. Either Addresses or AddressesExtra is required.
     */
    public void setAddresses(String [] Addresses) {
        this.Addresses = Addresses;
    }

    /**
     * Get The address information can contain remarks and be presented by the IP, CIDR block or IP address range. Either Addresses or AddressesExtra is required. 
     * @return AddressesExtra The address information can contain remarks and be presented by the IP, CIDR block or IP address range. Either Addresses or AddressesExtra is required.
     */
    public AddressInfo [] getAddressesExtra() {
        return this.AddressesExtra;
    }

    /**
     * Set The address information can contain remarks and be presented by the IP, CIDR block or IP address range. Either Addresses or AddressesExtra is required.
     * @param AddressesExtra The address information can contain remarks and be presented by the IP, CIDR block or IP address range. Either Addresses or AddressesExtra is required.
     */
    public void setAddressesExtra(AddressInfo [] AddressesExtra) {
        this.AddressesExtra = AddressesExtra;
    }

    public CreateAddressTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAddressTemplateRequest(CreateAddressTemplateRequest source) {
        if (source.AddressTemplateName != null) {
            this.AddressTemplateName = new String(source.AddressTemplateName);
        }
        if (source.Addresses != null) {
            this.Addresses = new String[source.Addresses.length];
            for (int i = 0; i < source.Addresses.length; i++) {
                this.Addresses[i] = new String(source.Addresses[i]);
            }
        }
        if (source.AddressesExtra != null) {
            this.AddressesExtra = new AddressInfo[source.AddressesExtra.length];
            for (int i = 0; i < source.AddressesExtra.length; i++) {
                this.AddressesExtra[i] = new AddressInfo(source.AddressesExtra[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateName", this.AddressTemplateName);
        this.setParamArraySimple(map, prefix + "Addresses.", this.Addresses);
        this.setParamArrayObj(map, prefix + "AddressesExtra.", this.AddressesExtra);

    }
}

