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

public class DescribeNetworkInterfaceLimitResponse extends AbstractModel{

    /**
    * Quota of ENIs mounted to a CVM instance in a standard way
    */
    @SerializedName("EniQuantity")
    @Expose
    private Long EniQuantity;

    /**
    * Quota of IP addresses that can be allocated to each standard-mounted ENI
    */
    @SerializedName("EniPrivateIpAddressQuantity")
    @Expose
    private Long EniPrivateIpAddressQuantity;

    /**
    * Quota of ENIs mounted to a CVM instance as an extension
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtendEniQuantity")
    @Expose
    private Long ExtendEniQuantity;

    /**
    * Quota of IP addresses that can be allocated to each extension-mounted ENI.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtendEniPrivateIpAddressQuantity")
    @Expose
    private Long ExtendEniPrivateIpAddressQuantity;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Quota of ENIs mounted to a CVM instance in a standard way 
     * @return EniQuantity Quota of ENIs mounted to a CVM instance in a standard way
     */
    public Long getEniQuantity() {
        return this.EniQuantity;
    }

    /**
     * Set Quota of ENIs mounted to a CVM instance in a standard way
     * @param EniQuantity Quota of ENIs mounted to a CVM instance in a standard way
     */
    public void setEniQuantity(Long EniQuantity) {
        this.EniQuantity = EniQuantity;
    }

    /**
     * Get Quota of IP addresses that can be allocated to each standard-mounted ENI 
     * @return EniPrivateIpAddressQuantity Quota of IP addresses that can be allocated to each standard-mounted ENI
     */
    public Long getEniPrivateIpAddressQuantity() {
        return this.EniPrivateIpAddressQuantity;
    }

    /**
     * Set Quota of IP addresses that can be allocated to each standard-mounted ENI
     * @param EniPrivateIpAddressQuantity Quota of IP addresses that can be allocated to each standard-mounted ENI
     */
    public void setEniPrivateIpAddressQuantity(Long EniPrivateIpAddressQuantity) {
        this.EniPrivateIpAddressQuantity = EniPrivateIpAddressQuantity;
    }

    /**
     * Get Quota of ENIs mounted to a CVM instance as an extension
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ExtendEniQuantity Quota of ENIs mounted to a CVM instance as an extension
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getExtendEniQuantity() {
        return this.ExtendEniQuantity;
    }

    /**
     * Set Quota of ENIs mounted to a CVM instance as an extension
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ExtendEniQuantity Quota of ENIs mounted to a CVM instance as an extension
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExtendEniQuantity(Long ExtendEniQuantity) {
        this.ExtendEniQuantity = ExtendEniQuantity;
    }

    /**
     * Get Quota of IP addresses that can be allocated to each extension-mounted ENI.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ExtendEniPrivateIpAddressQuantity Quota of IP addresses that can be allocated to each extension-mounted ENI.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getExtendEniPrivateIpAddressQuantity() {
        return this.ExtendEniPrivateIpAddressQuantity;
    }

    /**
     * Set Quota of IP addresses that can be allocated to each extension-mounted ENI.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ExtendEniPrivateIpAddressQuantity Quota of IP addresses that can be allocated to each extension-mounted ENI.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExtendEniPrivateIpAddressQuantity(Long ExtendEniPrivateIpAddressQuantity) {
        this.ExtendEniPrivateIpAddressQuantity = ExtendEniPrivateIpAddressQuantity;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeNetworkInterfaceLimitResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkInterfaceLimitResponse(DescribeNetworkInterfaceLimitResponse source) {
        if (source.EniQuantity != null) {
            this.EniQuantity = new Long(source.EniQuantity);
        }
        if (source.EniPrivateIpAddressQuantity != null) {
            this.EniPrivateIpAddressQuantity = new Long(source.EniPrivateIpAddressQuantity);
        }
        if (source.ExtendEniQuantity != null) {
            this.ExtendEniQuantity = new Long(source.ExtendEniQuantity);
        }
        if (source.ExtendEniPrivateIpAddressQuantity != null) {
            this.ExtendEniPrivateIpAddressQuantity = new Long(source.ExtendEniPrivateIpAddressQuantity);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EniQuantity", this.EniQuantity);
        this.setParamSimple(map, prefix + "EniPrivateIpAddressQuantity", this.EniPrivateIpAddressQuantity);
        this.setParamSimple(map, prefix + "ExtendEniQuantity", this.ExtendEniQuantity);
        this.setParamSimple(map, prefix + "ExtendEniPrivateIpAddressQuantity", this.ExtendEniPrivateIpAddressQuantity);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

