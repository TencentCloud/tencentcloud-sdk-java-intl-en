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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddressInfo extends AbstractModel{

    /**
    * Public IP information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicIPAddressInfo")
    @Expose
    private PublicIPAddressInfo PublicIPAddressInfo;

    /**
    * Private IP information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateIPAddressInfo")
    @Expose
    private PrivateIPAddressInfo PrivateIPAddressInfo;

    /**
    * Public IPv6 information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicIPv6AddressInfo")
    @Expose
    private PublicIPAddressInfo PublicIPv6AddressInfo;

    /**
     * Get Public IP information of the instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PublicIPAddressInfo Public IP information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PublicIPAddressInfo getPublicIPAddressInfo() {
        return this.PublicIPAddressInfo;
    }

    /**
     * Set Public IP information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PublicIPAddressInfo Public IP information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicIPAddressInfo(PublicIPAddressInfo PublicIPAddressInfo) {
        this.PublicIPAddressInfo = PublicIPAddressInfo;
    }

    /**
     * Get Private IP information of the instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PrivateIPAddressInfo Private IP information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PrivateIPAddressInfo getPrivateIPAddressInfo() {
        return this.PrivateIPAddressInfo;
    }

    /**
     * Set Private IP information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PrivateIPAddressInfo Private IP information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateIPAddressInfo(PrivateIPAddressInfo PrivateIPAddressInfo) {
        this.PrivateIPAddressInfo = PrivateIPAddressInfo;
    }

    /**
     * Get Public IPv6 information of the instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PublicIPv6AddressInfo Public IPv6 information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PublicIPAddressInfo getPublicIPv6AddressInfo() {
        return this.PublicIPv6AddressInfo;
    }

    /**
     * Set Public IPv6 information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PublicIPv6AddressInfo Public IPv6 information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicIPv6AddressInfo(PublicIPAddressInfo PublicIPv6AddressInfo) {
        this.PublicIPv6AddressInfo = PublicIPv6AddressInfo;
    }

    public AddressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddressInfo(AddressInfo source) {
        if (source.PublicIPAddressInfo != null) {
            this.PublicIPAddressInfo = new PublicIPAddressInfo(source.PublicIPAddressInfo);
        }
        if (source.PrivateIPAddressInfo != null) {
            this.PrivateIPAddressInfo = new PrivateIPAddressInfo(source.PrivateIPAddressInfo);
        }
        if (source.PublicIPv6AddressInfo != null) {
            this.PublicIPv6AddressInfo = new PublicIPAddressInfo(source.PublicIPv6AddressInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PublicIPAddressInfo.", this.PublicIPAddressInfo);
        this.setParamObj(map, prefix + "PrivateIPAddressInfo.", this.PrivateIPAddressInfo);
        this.setParamObj(map, prefix + "PublicIPv6AddressInfo.", this.PublicIPv6AddressInfo);

    }
}

