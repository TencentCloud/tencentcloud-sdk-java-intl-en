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

public class DescribeVpnConnectionsRequest extends AbstractModel {

    /**
    * The instance ID of the VPN tunnel, such as `vpnx-f49l6u0z`. Each request can have a maximum of 100 instances. `VpnConnectionIds` and `Filters` cannot be specified at the same time.
    */
    @SerializedName("VpnConnectionIds")
    @Expose
    private String [] VpnConnectionIds;

    /**
    * Filter condition. In each request, the upper limit for `Filters` is 10 and 5 for `Filter.Values`. `VpnConnectionIds` and `Filters` cannot be specified at the same time.
<li>vpc-id - String - VPC instance ID, such as `vpc-0a36uwkr`.</li>
<li>vpn-gateway-id - String - VPN gateway instance ID, such as `vpngw-p4lmqawn`.</li>
<li>customer-gateway-id - String - Customer gateway instance ID, such as `cgw-l4rblw63`.</li>
<li>vpn-connection-name - String - Connection name, such as `test-vpn`.</li>
<li>vpn-connection-id - String - Connection instance ID, such as `vpnx-5p7vkch8"`.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The Offset. The default value is 0. For more information about Offset, see the relevant section in the API Introduction.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of values to be returned. The default value is 20. Maximum is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The instance ID of the VPN tunnel, such as `vpnx-f49l6u0z`. Each request can have a maximum of 100 instances. `VpnConnectionIds` and `Filters` cannot be specified at the same time. 
     * @return VpnConnectionIds The instance ID of the VPN tunnel, such as `vpnx-f49l6u0z`. Each request can have a maximum of 100 instances. `VpnConnectionIds` and `Filters` cannot be specified at the same time.
     */
    public String [] getVpnConnectionIds() {
        return this.VpnConnectionIds;
    }

    /**
     * Set The instance ID of the VPN tunnel, such as `vpnx-f49l6u0z`. Each request can have a maximum of 100 instances. `VpnConnectionIds` and `Filters` cannot be specified at the same time.
     * @param VpnConnectionIds The instance ID of the VPN tunnel, such as `vpnx-f49l6u0z`. Each request can have a maximum of 100 instances. `VpnConnectionIds` and `Filters` cannot be specified at the same time.
     */
    public void setVpnConnectionIds(String [] VpnConnectionIds) {
        this.VpnConnectionIds = VpnConnectionIds;
    }

    /**
     * Get Filter condition. In each request, the upper limit for `Filters` is 10 and 5 for `Filter.Values`. `VpnConnectionIds` and `Filters` cannot be specified at the same time.
<li>vpc-id - String - VPC instance ID, such as `vpc-0a36uwkr`.</li>
<li>vpn-gateway-id - String - VPN gateway instance ID, such as `vpngw-p4lmqawn`.</li>
<li>customer-gateway-id - String - Customer gateway instance ID, such as `cgw-l4rblw63`.</li>
<li>vpn-connection-name - String - Connection name, such as `test-vpn`.</li>
<li>vpn-connection-id - String - Connection instance ID, such as `vpnx-5p7vkch8"`.</li> 
     * @return Filters Filter condition. In each request, the upper limit for `Filters` is 10 and 5 for `Filter.Values`. `VpnConnectionIds` and `Filters` cannot be specified at the same time.
<li>vpc-id - String - VPC instance ID, such as `vpc-0a36uwkr`.</li>
<li>vpn-gateway-id - String - VPN gateway instance ID, such as `vpngw-p4lmqawn`.</li>
<li>customer-gateway-id - String - Customer gateway instance ID, such as `cgw-l4rblw63`.</li>
<li>vpn-connection-name - String - Connection name, such as `test-vpn`.</li>
<li>vpn-connection-id - String - Connection instance ID, such as `vpnx-5p7vkch8"`.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. In each request, the upper limit for `Filters` is 10 and 5 for `Filter.Values`. `VpnConnectionIds` and `Filters` cannot be specified at the same time.
<li>vpc-id - String - VPC instance ID, such as `vpc-0a36uwkr`.</li>
<li>vpn-gateway-id - String - VPN gateway instance ID, such as `vpngw-p4lmqawn`.</li>
<li>customer-gateway-id - String - Customer gateway instance ID, such as `cgw-l4rblw63`.</li>
<li>vpn-connection-name - String - Connection name, such as `test-vpn`.</li>
<li>vpn-connection-id - String - Connection instance ID, such as `vpnx-5p7vkch8"`.</li>
     * @param Filters Filter condition. In each request, the upper limit for `Filters` is 10 and 5 for `Filter.Values`. `VpnConnectionIds` and `Filters` cannot be specified at the same time.
<li>vpc-id - String - VPC instance ID, such as `vpc-0a36uwkr`.</li>
<li>vpn-gateway-id - String - VPN gateway instance ID, such as `vpngw-p4lmqawn`.</li>
<li>customer-gateway-id - String - Customer gateway instance ID, such as `cgw-l4rblw63`.</li>
<li>vpn-connection-name - String - Connection name, such as `test-vpn`.</li>
<li>vpn-connection-id - String - Connection instance ID, such as `vpnx-5p7vkch8"`.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The Offset. The default value is 0. For more information about Offset, see the relevant section in the API Introduction. 
     * @return Offset The Offset. The default value is 0. For more information about Offset, see the relevant section in the API Introduction.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The Offset. The default value is 0. For more information about Offset, see the relevant section in the API Introduction.
     * @param Offset The Offset. The default value is 0. For more information about Offset, see the relevant section in the API Introduction.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of values to be returned. The default value is 20. Maximum is 100. 
     * @return Limit Number of values to be returned. The default value is 20. Maximum is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of values to be returned. The default value is 20. Maximum is 100.
     * @param Limit Number of values to be returned. The default value is 20. Maximum is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeVpnConnectionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpnConnectionsRequest(DescribeVpnConnectionsRequest source) {
        if (source.VpnConnectionIds != null) {
            this.VpnConnectionIds = new String[source.VpnConnectionIds.length];
            for (int i = 0; i < source.VpnConnectionIds.length; i++) {
                this.VpnConnectionIds[i] = new String(source.VpnConnectionIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VpnConnectionIds.", this.VpnConnectionIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

