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

public class CcnRoute extends AbstractModel {

    /**
    * The ID of the routing policy
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * Destination
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * The type of the next hop (associated instance type). Available types: VPC, DIRECTCONNECT
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * The next hop (associated instance)
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The name of the next hop (associated instance name)
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * The region of the next hop (the region of the associated instance)
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * Update Time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Whether the route is enabled
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * The UIN (root account) to which the associated instance belongs
    */
    @SerializedName("InstanceUin")
    @Expose
    private String InstanceUin;

    /**
    * Additional status of the route
    */
    @SerializedName("ExtraState")
    @Expose
    private String ExtraState;

    /**
    * Whether it is a dynamic route
    */
    @SerializedName("IsBgp")
    @Expose
    private Boolean IsBgp;

    /**
    * Route priority
    */
    @SerializedName("RoutePriority")
    @Expose
    private Long RoutePriority;

    /**
    * Next hop port name (associated instance’s port name)
    */
    @SerializedName("InstanceExtraName")
    @Expose
    private String InstanceExtraName;

    /**
     * Get The ID of the routing policy 
     * @return RouteId The ID of the routing policy
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set The ID of the routing policy
     * @param RouteId The ID of the routing policy
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get Destination 
     * @return DestinationCidrBlock Destination
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set Destination
     * @param DestinationCidrBlock Destination
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get The type of the next hop (associated instance type). Available types: VPC, DIRECTCONNECT 
     * @return InstanceType The type of the next hop (associated instance type). Available types: VPC, DIRECTCONNECT
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set The type of the next hop (associated instance type). Available types: VPC, DIRECTCONNECT
     * @param InstanceType The type of the next hop (associated instance type). Available types: VPC, DIRECTCONNECT
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get The next hop (associated instance) 
     * @return InstanceId The next hop (associated instance)
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The next hop (associated instance)
     * @param InstanceId The next hop (associated instance)
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The name of the next hop (associated instance name) 
     * @return InstanceName The name of the next hop (associated instance name)
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set The name of the next hop (associated instance name)
     * @param InstanceName The name of the next hop (associated instance name)
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get The region of the next hop (the region of the associated instance) 
     * @return InstanceRegion The region of the next hop (the region of the associated instance)
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set The region of the next hop (the region of the associated instance)
     * @param InstanceRegion The region of the next hop (the region of the associated instance)
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get Update Time 
     * @return UpdateTime Update Time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update Time
     * @param UpdateTime Update Time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Whether the route is enabled 
     * @return Enabled Whether the route is enabled
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether the route is enabled
     * @param Enabled Whether the route is enabled
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get The UIN (root account) to which the associated instance belongs 
     * @return InstanceUin The UIN (root account) to which the associated instance belongs
     */
    public String getInstanceUin() {
        return this.InstanceUin;
    }

    /**
     * Set The UIN (root account) to which the associated instance belongs
     * @param InstanceUin The UIN (root account) to which the associated instance belongs
     */
    public void setInstanceUin(String InstanceUin) {
        this.InstanceUin = InstanceUin;
    }

    /**
     * Get Additional status of the route 
     * @return ExtraState Additional status of the route
     */
    public String getExtraState() {
        return this.ExtraState;
    }

    /**
     * Set Additional status of the route
     * @param ExtraState Additional status of the route
     */
    public void setExtraState(String ExtraState) {
        this.ExtraState = ExtraState;
    }

    /**
     * Get Whether it is a dynamic route 
     * @return IsBgp Whether it is a dynamic route
     */
    public Boolean getIsBgp() {
        return this.IsBgp;
    }

    /**
     * Set Whether it is a dynamic route
     * @param IsBgp Whether it is a dynamic route
     */
    public void setIsBgp(Boolean IsBgp) {
        this.IsBgp = IsBgp;
    }

    /**
     * Get Route priority 
     * @return RoutePriority Route priority
     */
    public Long getRoutePriority() {
        return this.RoutePriority;
    }

    /**
     * Set Route priority
     * @param RoutePriority Route priority
     */
    public void setRoutePriority(Long RoutePriority) {
        this.RoutePriority = RoutePriority;
    }

    /**
     * Get Next hop port name (associated instance’s port name) 
     * @return InstanceExtraName Next hop port name (associated instance’s port name)
     */
    public String getInstanceExtraName() {
        return this.InstanceExtraName;
    }

    /**
     * Set Next hop port name (associated instance’s port name)
     * @param InstanceExtraName Next hop port name (associated instance’s port name)
     */
    public void setInstanceExtraName(String InstanceExtraName) {
        this.InstanceExtraName = InstanceExtraName;
    }

    public CcnRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnRoute(CcnRoute source) {
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.InstanceUin != null) {
            this.InstanceUin = new String(source.InstanceUin);
        }
        if (source.ExtraState != null) {
            this.ExtraState = new String(source.ExtraState);
        }
        if (source.IsBgp != null) {
            this.IsBgp = new Boolean(source.IsBgp);
        }
        if (source.RoutePriority != null) {
            this.RoutePriority = new Long(source.RoutePriority);
        }
        if (source.InstanceExtraName != null) {
            this.InstanceExtraName = new String(source.InstanceExtraName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "InstanceUin", this.InstanceUin);
        this.setParamSimple(map, prefix + "ExtraState", this.ExtraState);
        this.setParamSimple(map, prefix + "IsBgp", this.IsBgp);
        this.setParamSimple(map, prefix + "RoutePriority", this.RoutePriority);
        this.setParamSimple(map, prefix + "InstanceExtraName", this.InstanceExtraName);

    }
}

