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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneMappingsItem extends AbstractModel {

    /**
    * <p>Subnet ID.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Availability zone ID. A maximum of 10 availability zones can be added. If the current region supports 2 or more availability zones, at least 2 availability zones are required.<br>You can obtain the availability zone information corresponding to the availability zone ID through the <a href="https://www.tencentcloud.com/document/api/1822/133727?from_cn_redirect=1">DescribeZones</a> API.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>ID of the EIP bound to the public network instance.</p>
    */
    @SerializedName("LoadBalancerAddress")
    @Expose
    private LoadBalancerAddress LoadBalancerAddress;

    /**
     * Get <p>Subnet ID.</p> 
     * @return SubnetId <p>Subnet ID.</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID.</p>
     * @param SubnetId <p>Subnet ID.</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Availability zone ID. A maximum of 10 availability zones can be added. If the current region supports 2 or more availability zones, at least 2 availability zones are required.<br>You can obtain the availability zone information corresponding to the availability zone ID through the <a href="https://www.tencentcloud.com/document/api/1822/133727?from_cn_redirect=1">DescribeZones</a> API.</p> 
     * @return ZoneId <p>Availability zone ID. A maximum of 10 availability zones can be added. If the current region supports 2 or more availability zones, at least 2 availability zones are required.<br>You can obtain the availability zone information corresponding to the availability zone ID through the <a href="https://www.tencentcloud.com/document/api/1822/133727?from_cn_redirect=1">DescribeZones</a> API.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Availability zone ID. A maximum of 10 availability zones can be added. If the current region supports 2 or more availability zones, at least 2 availability zones are required.<br>You can obtain the availability zone information corresponding to the availability zone ID through the <a href="https://www.tencentcloud.com/document/api/1822/133727?from_cn_redirect=1">DescribeZones</a> API.</p>
     * @param ZoneId <p>Availability zone ID. A maximum of 10 availability zones can be added. If the current region supports 2 or more availability zones, at least 2 availability zones are required.<br>You can obtain the availability zone information corresponding to the availability zone ID through the <a href="https://www.tencentcloud.com/document/api/1822/133727?from_cn_redirect=1">DescribeZones</a> API.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>ID of the EIP bound to the public network instance.</p> 
     * @return LoadBalancerAddress <p>ID of the EIP bound to the public network instance.</p>
     */
    public LoadBalancerAddress getLoadBalancerAddress() {
        return this.LoadBalancerAddress;
    }

    /**
     * Set <p>ID of the EIP bound to the public network instance.</p>
     * @param LoadBalancerAddress <p>ID of the EIP bound to the public network instance.</p>
     */
    public void setLoadBalancerAddress(LoadBalancerAddress LoadBalancerAddress) {
        this.LoadBalancerAddress = LoadBalancerAddress;
    }

    public ZoneMappingsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneMappingsItem(ZoneMappingsItem source) {
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.LoadBalancerAddress != null) {
            this.LoadBalancerAddress = new LoadBalancerAddress(source.LoadBalancerAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "LoadBalancerAddress.", this.LoadBalancerAddress);

    }
}

