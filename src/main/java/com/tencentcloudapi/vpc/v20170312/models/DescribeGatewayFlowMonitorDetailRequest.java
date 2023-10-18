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

public class DescribeGatewayFlowMonitorDetailRequest extends AbstractModel {

    /**
    * The point in time. This indicates details of this minute will be queried. For example, in `2019-02-28 18:15:20`, details at `18:15` will be queried.
    */
    @SerializedName("TimePoint")
    @Expose
    private String TimePoint;

    /**
    * The instance ID of the VPN gateway, such as `vpn-ltjahce6`.
    */
    @SerializedName("VpnId")
    @Expose
    private String VpnId;

    /**
    * The instance ID of the Direct Connect gateway, such as `dcg-ltjahce6`.
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
    * The instance ID of the peering connection, such as `pcx-ltjahce6`.
    */
    @SerializedName("PeeringConnectionId")
    @Expose
    private String PeeringConnectionId;

    /**
    * The instance ID of the NAT gateway, such as `nat-ltjahce6`.
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The returned quantity.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The order field supports `InPkg`, `OutPkg`, `InTraffic`, and `OutTraffic`.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Order methods. Ascending: `ASC`, Descending: `DESC`.
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get The point in time. This indicates details of this minute will be queried. For example, in `2019-02-28 18:15:20`, details at `18:15` will be queried. 
     * @return TimePoint The point in time. This indicates details of this minute will be queried. For example, in `2019-02-28 18:15:20`, details at `18:15` will be queried.
     */
    public String getTimePoint() {
        return this.TimePoint;
    }

    /**
     * Set The point in time. This indicates details of this minute will be queried. For example, in `2019-02-28 18:15:20`, details at `18:15` will be queried.
     * @param TimePoint The point in time. This indicates details of this minute will be queried. For example, in `2019-02-28 18:15:20`, details at `18:15` will be queried.
     */
    public void setTimePoint(String TimePoint) {
        this.TimePoint = TimePoint;
    }

    /**
     * Get The instance ID of the VPN gateway, such as `vpn-ltjahce6`. 
     * @return VpnId The instance ID of the VPN gateway, such as `vpn-ltjahce6`.
     */
    public String getVpnId() {
        return this.VpnId;
    }

    /**
     * Set The instance ID of the VPN gateway, such as `vpn-ltjahce6`.
     * @param VpnId The instance ID of the VPN gateway, such as `vpn-ltjahce6`.
     */
    public void setVpnId(String VpnId) {
        this.VpnId = VpnId;
    }

    /**
     * Get The instance ID of the Direct Connect gateway, such as `dcg-ltjahce6`. 
     * @return DirectConnectGatewayId The instance ID of the Direct Connect gateway, such as `dcg-ltjahce6`.
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * Set The instance ID of the Direct Connect gateway, such as `dcg-ltjahce6`.
     * @param DirectConnectGatewayId The instance ID of the Direct Connect gateway, such as `dcg-ltjahce6`.
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * Get The instance ID of the peering connection, such as `pcx-ltjahce6`. 
     * @return PeeringConnectionId The instance ID of the peering connection, such as `pcx-ltjahce6`.
     */
    public String getPeeringConnectionId() {
        return this.PeeringConnectionId;
    }

    /**
     * Set The instance ID of the peering connection, such as `pcx-ltjahce6`.
     * @param PeeringConnectionId The instance ID of the peering connection, such as `pcx-ltjahce6`.
     */
    public void setPeeringConnectionId(String PeeringConnectionId) {
        this.PeeringConnectionId = PeeringConnectionId;
    }

    /**
     * Get The instance ID of the NAT gateway, such as `nat-ltjahce6`. 
     * @return NatId The instance ID of the NAT gateway, such as `nat-ltjahce6`.
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * Set The instance ID of the NAT gateway, such as `nat-ltjahce6`.
     * @param NatId The instance ID of the NAT gateway, such as `nat-ltjahce6`.
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The returned quantity. 
     * @return Limit The returned quantity.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The returned quantity.
     * @param Limit The returned quantity.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The order field supports `InPkg`, `OutPkg`, `InTraffic`, and `OutTraffic`. 
     * @return OrderField The order field supports `InPkg`, `OutPkg`, `InTraffic`, and `OutTraffic`.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set The order field supports `InPkg`, `OutPkg`, `InTraffic`, and `OutTraffic`.
     * @param OrderField The order field supports `InPkg`, `OutPkg`, `InTraffic`, and `OutTraffic`.
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Order methods. Ascending: `ASC`, Descending: `DESC`. 
     * @return OrderDirection Order methods. Ascending: `ASC`, Descending: `DESC`.
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set Order methods. Ascending: `ASC`, Descending: `DESC`.
     * @param OrderDirection Order methods. Ascending: `ASC`, Descending: `DESC`.
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public DescribeGatewayFlowMonitorDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatewayFlowMonitorDetailRequest(DescribeGatewayFlowMonitorDetailRequest source) {
        if (source.TimePoint != null) {
            this.TimePoint = new String(source.TimePoint);
        }
        if (source.VpnId != null) {
            this.VpnId = new String(source.VpnId);
        }
        if (source.DirectConnectGatewayId != null) {
            this.DirectConnectGatewayId = new String(source.DirectConnectGatewayId);
        }
        if (source.PeeringConnectionId != null) {
            this.PeeringConnectionId = new String(source.PeeringConnectionId);
        }
        if (source.NatId != null) {
            this.NatId = new String(source.NatId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimePoint", this.TimePoint);
        this.setParamSimple(map, prefix + "VpnId", this.VpnId);
        this.setParamSimple(map, prefix + "DirectConnectGatewayId", this.DirectConnectGatewayId);
        this.setParamSimple(map, prefix + "PeeringConnectionId", this.PeeringConnectionId);
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

