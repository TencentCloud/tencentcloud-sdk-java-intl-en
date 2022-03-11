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

public class InstanceNetworkInfo extends AbstractModel{

    /**
    * Private and public IP information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressInfoSet")
    @Expose
    private AddressInfo [] AddressInfoSet;

    /**
    * ENI ID.
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * ENI name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetworkInterfaceName")
    @Expose
    private String NetworkInterfaceName;

    /**
    * Primary ENI attribute. Valid values: true: primary ENI; false: secondary ENI.
    */
    @SerializedName("Primary")
    @Expose
    private Boolean Primary;

    /**
     * Get Private and public IP information of the instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AddressInfoSet Private and public IP information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AddressInfo [] getAddressInfoSet() {
        return this.AddressInfoSet;
    }

    /**
     * Set Private and public IP information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AddressInfoSet Private and public IP information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressInfoSet(AddressInfo [] AddressInfoSet) {
        this.AddressInfoSet = AddressInfoSet;
    }

    /**
     * Get ENI ID. 
     * @return NetworkInterfaceId ENI ID.
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set ENI ID.
     * @param NetworkInterfaceId ENI ID.
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get ENI name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NetworkInterfaceName ENI name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNetworkInterfaceName() {
        return this.NetworkInterfaceName;
    }

    /**
     * Set ENI name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NetworkInterfaceName ENI name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNetworkInterfaceName(String NetworkInterfaceName) {
        this.NetworkInterfaceName = NetworkInterfaceName;
    }

    /**
     * Get Primary ENI attribute. Valid values: true: primary ENI; false: secondary ENI. 
     * @return Primary Primary ENI attribute. Valid values: true: primary ENI; false: secondary ENI.
     */
    public Boolean getPrimary() {
        return this.Primary;
    }

    /**
     * Set Primary ENI attribute. Valid values: true: primary ENI; false: secondary ENI.
     * @param Primary Primary ENI attribute. Valid values: true: primary ENI; false: secondary ENI.
     */
    public void setPrimary(Boolean Primary) {
        this.Primary = Primary;
    }

    public InstanceNetworkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNetworkInfo(InstanceNetworkInfo source) {
        if (source.AddressInfoSet != null) {
            this.AddressInfoSet = new AddressInfo[source.AddressInfoSet.length];
            for (int i = 0; i < source.AddressInfoSet.length; i++) {
                this.AddressInfoSet[i] = new AddressInfo(source.AddressInfoSet[i]);
            }
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.NetworkInterfaceName != null) {
            this.NetworkInterfaceName = new String(source.NetworkInterfaceName);
        }
        if (source.Primary != null) {
            this.Primary = new Boolean(source.Primary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AddressInfoSet.", this.AddressInfoSet);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "NetworkInterfaceName", this.NetworkInterfaceName);
        this.setParamSimple(map, prefix + "Primary", this.Primary);

    }
}

