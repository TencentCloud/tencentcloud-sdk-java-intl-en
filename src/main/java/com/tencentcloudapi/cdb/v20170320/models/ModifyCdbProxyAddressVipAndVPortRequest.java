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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCdbProxyAddressVipAndVPortRequest extends AbstractModel {

    /**
    * Proxy group ID. Obtain through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Proxy group address ID. Obtain through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
    */
    @SerializedName("ProxyAddressId")
    @Expose
    private String ProxyAddressId;

    /**
    * VPC ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Private subnet ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * IP. If not specified, the system will assign an available IP under subnet.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Port. Default value 3306, value ranges from 1024 to 65535.
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * Old IP valid hours. Measurement unit: hr, default value: 24, value ranges from 0 to 168.
    */
    @SerializedName("ReleaseDuration")
    @Expose
    private Long ReleaseDuration;

    /**
     * Get Proxy group ID. Obtain through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API. 
     * @return ProxyGroupId Proxy group ID. Obtain through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set Proxy group ID. Obtain through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
     * @param ProxyGroupId Proxy group ID. Obtain through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get Proxy group address ID. Obtain through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API. 
     * @return ProxyAddressId Proxy group address ID. Obtain through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
     */
    public String getProxyAddressId() {
        return this.ProxyAddressId;
    }

    /**
     * Set Proxy group address ID. Obtain through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
     * @param ProxyAddressId Proxy group address ID. Obtain through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
     */
    public void setProxyAddressId(String ProxyAddressId) {
        this.ProxyAddressId = ProxyAddressId;
    }

    /**
     * Get VPC ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return UniqVpcId VPC ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param UniqVpcId VPC ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Private subnet ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return UniqSubnetId Private subnet ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Private subnet ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param UniqSubnetId Private subnet ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get IP. If not specified, the system will assign an available IP under subnet. 
     * @return Vip IP. If not specified, the system will assign an available IP under subnet.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IP. If not specified, the system will assign an available IP under subnet.
     * @param Vip IP. If not specified, the system will assign an available IP under subnet.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Port. Default value 3306, value ranges from 1024 to 65535. 
     * @return VPort Port. Default value 3306, value ranges from 1024 to 65535.
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set Port. Default value 3306, value ranges from 1024 to 65535.
     * @param VPort Port. Default value 3306, value ranges from 1024 to 65535.
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get Old IP valid hours. Measurement unit: hr, default value: 24, value ranges from 0 to 168. 
     * @return ReleaseDuration Old IP valid hours. Measurement unit: hr, default value: 24, value ranges from 0 to 168.
     */
    public Long getReleaseDuration() {
        return this.ReleaseDuration;
    }

    /**
     * Set Old IP valid hours. Measurement unit: hr, default value: 24, value ranges from 0 to 168.
     * @param ReleaseDuration Old IP valid hours. Measurement unit: hr, default value: 24, value ranges from 0 to 168.
     */
    public void setReleaseDuration(Long ReleaseDuration) {
        this.ReleaseDuration = ReleaseDuration;
    }

    public ModifyCdbProxyAddressVipAndVPortRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCdbProxyAddressVipAndVPortRequest(ModifyCdbProxyAddressVipAndVPortRequest source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ProxyAddressId != null) {
            this.ProxyAddressId = new String(source.ProxyAddressId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.ReleaseDuration != null) {
            this.ReleaseDuration = new Long(source.ReleaseDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ProxyAddressId", this.ProxyAddressId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "ReleaseDuration", this.ReleaseDuration);

    }
}

