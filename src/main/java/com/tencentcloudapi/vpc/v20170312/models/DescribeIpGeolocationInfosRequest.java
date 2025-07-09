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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpGeolocationInfosRequest extends AbstractModel {

    /**
    * The list of IP addresses (only IPv4 addresses are available currently) to be queried; upper limit: 100
    */
    @SerializedName("AddressIps")
    @Expose
    private String [] AddressIps;

    /**
    * Fields of the IP addresses to be queried.
    */
    @SerializedName("Fields")
    @Expose
    private IpField Fields;

    /**
     * Get The list of IP addresses (only IPv4 addresses are available currently) to be queried; upper limit: 100 
     * @return AddressIps The list of IP addresses (only IPv4 addresses are available currently) to be queried; upper limit: 100
     */
    public String [] getAddressIps() {
        return this.AddressIps;
    }

    /**
     * Set The list of IP addresses (only IPv4 addresses are available currently) to be queried; upper limit: 100
     * @param AddressIps The list of IP addresses (only IPv4 addresses are available currently) to be queried; upper limit: 100
     */
    public void setAddressIps(String [] AddressIps) {
        this.AddressIps = AddressIps;
    }

    /**
     * Get Fields of the IP addresses to be queried. 
     * @return Fields Fields of the IP addresses to be queried.
     */
    public IpField getFields() {
        return this.Fields;
    }

    /**
     * Set Fields of the IP addresses to be queried.
     * @param Fields Fields of the IP addresses to be queried.
     */
    public void setFields(IpField Fields) {
        this.Fields = Fields;
    }

    public DescribeIpGeolocationInfosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIpGeolocationInfosRequest(DescribeIpGeolocationInfosRequest source) {
        if (source.AddressIps != null) {
            this.AddressIps = new String[source.AddressIps.length];
            for (int i = 0; i < source.AddressIps.length; i++) {
                this.AddressIps[i] = new String(source.AddressIps[i]);
            }
        }
        if (source.Fields != null) {
            this.Fields = new IpField(source.Fields);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressIps.", this.AddressIps);
        this.setParamObj(map, prefix + "Fields.", this.Fields);

    }
}

