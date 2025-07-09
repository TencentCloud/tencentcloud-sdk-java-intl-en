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

public class VpnGatewayRoute extends AbstractModel {

    /**
    * Destination IDC IP range
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * Next hop type (type of the associated instance). Valid values: `VPNCONN` (VPN tunnel) and `CCN` (CCN instance)
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance ID of the next hop
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Priority. Valid values: `0` and `100`
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Status. Valid values: `ENABLE` and `DISABLE`
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Route ID
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * Route type. Valid values: `VPC`, `CCN` (CCN-propagated route), `Static`, and `BGP`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Destination IDC IP range 
     * @return DestinationCidrBlock Destination IDC IP range
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set Destination IDC IP range
     * @param DestinationCidrBlock Destination IDC IP range
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get Next hop type (type of the associated instance). Valid values: `VPNCONN` (VPN tunnel) and `CCN` (CCN instance) 
     * @return InstanceType Next hop type (type of the associated instance). Valid values: `VPNCONN` (VPN tunnel) and `CCN` (CCN instance)
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Next hop type (type of the associated instance). Valid values: `VPNCONN` (VPN tunnel) and `CCN` (CCN instance)
     * @param InstanceType Next hop type (type of the associated instance). Valid values: `VPNCONN` (VPN tunnel) and `CCN` (CCN instance)
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance ID of the next hop 
     * @return InstanceId Instance ID of the next hop
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID of the next hop
     * @param InstanceId Instance ID of the next hop
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Priority. Valid values: `0` and `100` 
     * @return Priority Priority. Valid values: `0` and `100`
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority. Valid values: `0` and `100`
     * @param Priority Priority. Valid values: `0` and `100`
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Status. Valid values: `ENABLE` and `DISABLE` 
     * @return Status Status. Valid values: `ENABLE` and `DISABLE`
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Valid values: `ENABLE` and `DISABLE`
     * @param Status Status. Valid values: `ENABLE` and `DISABLE`
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Route ID 
     * @return RouteId Route ID
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set Route ID
     * @param RouteId Route ID
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get Route type. Valid values: `VPC`, `CCN` (CCN-propagated route), `Static`, and `BGP`. 
     * @return Type Route type. Valid values: `VPC`, `CCN` (CCN-propagated route), `Static`, and `BGP`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Route type. Valid values: `VPC`, `CCN` (CCN-propagated route), `Static`, and `BGP`.
     * @param Type Route type. Valid values: `VPC`, `CCN` (CCN-propagated route), `Static`, and `BGP`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The creation time. 
     * @return CreateTime The creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
     * @param CreateTime The creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The update time. 
     * @return UpdateTime The update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The update time.
     * @param UpdateTime The update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public VpnGatewayRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpnGatewayRoute(VpnGatewayRoute source) {
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

