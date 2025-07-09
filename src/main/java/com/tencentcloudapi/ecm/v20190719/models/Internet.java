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

public class Internet extends AbstractModel {

    /**
    * Private network information list of the instance, with the primary ENI followed by secondary ENIs in the order of binding.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateIPAddressSet")
    @Expose
    private PrivateIPAddressInfo [] PrivateIPAddressSet;

    /**
    * Public network information list of the instance, with the primary ENI followed by secondary ENIs in the order of binding.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicIPAddressSet")
    @Expose
    private PublicIPAddressInfo [] PublicIPAddressSet;

    /**
    * Network information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceNetworkInfoSet")
    @Expose
    private InstanceNetworkInfo [] InstanceNetworkInfoSet;

    /**
     * Get Private network information list of the instance, with the primary ENI followed by secondary ENIs in the order of binding.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PrivateIPAddressSet Private network information list of the instance, with the primary ENI followed by secondary ENIs in the order of binding.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PrivateIPAddressInfo [] getPrivateIPAddressSet() {
        return this.PrivateIPAddressSet;
    }

    /**
     * Set Private network information list of the instance, with the primary ENI followed by secondary ENIs in the order of binding.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PrivateIPAddressSet Private network information list of the instance, with the primary ENI followed by secondary ENIs in the order of binding.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateIPAddressSet(PrivateIPAddressInfo [] PrivateIPAddressSet) {
        this.PrivateIPAddressSet = PrivateIPAddressSet;
    }

    /**
     * Get Public network information list of the instance, with the primary ENI followed by secondary ENIs in the order of binding.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PublicIPAddressSet Public network information list of the instance, with the primary ENI followed by secondary ENIs in the order of binding.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PublicIPAddressInfo [] getPublicIPAddressSet() {
        return this.PublicIPAddressSet;
    }

    /**
     * Set Public network information list of the instance, with the primary ENI followed by secondary ENIs in the order of binding.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PublicIPAddressSet Public network information list of the instance, with the primary ENI followed by secondary ENIs in the order of binding.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicIPAddressSet(PublicIPAddressInfo [] PublicIPAddressSet) {
        this.PublicIPAddressSet = PublicIPAddressSet;
    }

    /**
     * Get Network information of the instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceNetworkInfoSet Network information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public InstanceNetworkInfo [] getInstanceNetworkInfoSet() {
        return this.InstanceNetworkInfoSet;
    }

    /**
     * Set Network information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceNetworkInfoSet Network information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceNetworkInfoSet(InstanceNetworkInfo [] InstanceNetworkInfoSet) {
        this.InstanceNetworkInfoSet = InstanceNetworkInfoSet;
    }

    public Internet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Internet(Internet source) {
        if (source.PrivateIPAddressSet != null) {
            this.PrivateIPAddressSet = new PrivateIPAddressInfo[source.PrivateIPAddressSet.length];
            for (int i = 0; i < source.PrivateIPAddressSet.length; i++) {
                this.PrivateIPAddressSet[i] = new PrivateIPAddressInfo(source.PrivateIPAddressSet[i]);
            }
        }
        if (source.PublicIPAddressSet != null) {
            this.PublicIPAddressSet = new PublicIPAddressInfo[source.PublicIPAddressSet.length];
            for (int i = 0; i < source.PublicIPAddressSet.length; i++) {
                this.PublicIPAddressSet[i] = new PublicIPAddressInfo(source.PublicIPAddressSet[i]);
            }
        }
        if (source.InstanceNetworkInfoSet != null) {
            this.InstanceNetworkInfoSet = new InstanceNetworkInfo[source.InstanceNetworkInfoSet.length];
            for (int i = 0; i < source.InstanceNetworkInfoSet.length; i++) {
                this.InstanceNetworkInfoSet[i] = new InstanceNetworkInfo(source.InstanceNetworkInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PrivateIPAddressSet.", this.PrivateIPAddressSet);
        this.setParamArrayObj(map, prefix + "PublicIPAddressSet.", this.PublicIPAddressSet);
        this.setParamArrayObj(map, prefix + "InstanceNetworkInfoSet.", this.InstanceNetworkInfoSet);

    }
}

