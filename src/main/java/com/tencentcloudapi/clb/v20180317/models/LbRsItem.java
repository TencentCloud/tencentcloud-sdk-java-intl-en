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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LbRsItem extends AbstractModel {

    /**
    * VPC ID in string format. Only string format is supported.
Can be queried through the [DescribeVpcs](https://www.tencentcloud.comom/document/api/215/15778?from_cn_redirect=1) api.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Specifies the private IP address for backend querying, which can be CVM or eni.
Can be queried through the [DescribeAddresses](https://www.tencentcloud.comom/document/product/215/16702?from_cn_redirect=1) api.
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
     * Get VPC ID in string format. Only string format is supported.
Can be queried through the [DescribeVpcs](https://www.tencentcloud.comom/document/api/215/15778?from_cn_redirect=1) api. 
     * @return VpcId VPC ID in string format. Only string format is supported.
Can be queried through the [DescribeVpcs](https://www.tencentcloud.comom/document/api/215/15778?from_cn_redirect=1) api.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID in string format. Only string format is supported.
Can be queried through the [DescribeVpcs](https://www.tencentcloud.comom/document/api/215/15778?from_cn_redirect=1) api.
     * @param VpcId VPC ID in string format. Only string format is supported.
Can be queried through the [DescribeVpcs](https://www.tencentcloud.comom/document/api/215/15778?from_cn_redirect=1) api.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Specifies the private IP address for backend querying, which can be CVM or eni.
Can be queried through the [DescribeAddresses](https://www.tencentcloud.comom/document/product/215/16702?from_cn_redirect=1) api. 
     * @return PrivateIp Specifies the private IP address for backend querying, which can be CVM or eni.
Can be queried through the [DescribeAddresses](https://www.tencentcloud.comom/document/product/215/16702?from_cn_redirect=1) api.
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Specifies the private IP address for backend querying, which can be CVM or eni.
Can be queried through the [DescribeAddresses](https://www.tencentcloud.comom/document/product/215/16702?from_cn_redirect=1) api.
     * @param PrivateIp Specifies the private IP address for backend querying, which can be CVM or eni.
Can be queried through the [DescribeAddresses](https://www.tencentcloud.comom/document/product/215/16702?from_cn_redirect=1) api.
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    public LbRsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LbRsItem(LbRsItem source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);

    }
}

