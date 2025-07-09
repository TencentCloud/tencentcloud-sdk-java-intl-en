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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAllAccessControlRuleRequest extends AbstractModel {

    /**
    * Direction. 0: outbound; 1: inbound. 0 by default
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Deletes all the access control rules for inter-VPC firewall toggles associated with the EdgeId. It is empty by default. Enter either EdgeId or Area.
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * Deletes all the access control rules for NAT firewalls of this region. It is empty by default. Enter either EdgeId or Area.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get Direction. 0: outbound; 1: inbound. 0 by default 
     * @return Direction Direction. 0: outbound; 1: inbound. 0 by default
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Direction. 0: outbound; 1: inbound. 0 by default
     * @param Direction Direction. 0: outbound; 1: inbound. 0 by default
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Deletes all the access control rules for inter-VPC firewall toggles associated with the EdgeId. It is empty by default. Enter either EdgeId or Area. 
     * @return EdgeId Deletes all the access control rules for inter-VPC firewall toggles associated with the EdgeId. It is empty by default. Enter either EdgeId or Area.
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set Deletes all the access control rules for inter-VPC firewall toggles associated with the EdgeId. It is empty by default. Enter either EdgeId or Area.
     * @param EdgeId Deletes all the access control rules for inter-VPC firewall toggles associated with the EdgeId. It is empty by default. Enter either EdgeId or Area.
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get Deletes all the access control rules for NAT firewalls of this region. It is empty by default. Enter either EdgeId or Area. 
     * @return Area Deletes all the access control rules for NAT firewalls of this region. It is empty by default. Enter either EdgeId or Area.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Deletes all the access control rules for NAT firewalls of this region. It is empty by default. Enter either EdgeId or Area.
     * @param Area Deletes all the access control rules for NAT firewalls of this region. It is empty by default. Enter either EdgeId or Area.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DeleteAllAccessControlRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAllAccessControlRuleRequest(DeleteAllAccessControlRuleRequest source) {
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

