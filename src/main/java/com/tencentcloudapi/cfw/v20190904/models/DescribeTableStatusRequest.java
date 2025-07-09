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

public class DescribeTableStatusRequest extends AbstractModel {

    /**
    * Edge ID between two VPCs, required for VPCs
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * Status value. 0: the only default value
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * NAT region, required for NAT
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Direction. 0: outbound; 1: inbound. 0 by default
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get Edge ID between two VPCs, required for VPCs 
     * @return EdgeId Edge ID between two VPCs, required for VPCs
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set Edge ID between two VPCs, required for VPCs
     * @param EdgeId Edge ID between two VPCs, required for VPCs
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get Status value. 0: the only default value 
     * @return Status Status value. 0: the only default value
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status value. 0: the only default value
     * @param Status Status value. 0: the only default value
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get NAT region, required for NAT 
     * @return Area NAT region, required for NAT
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set NAT region, required for NAT
     * @param Area NAT region, required for NAT
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

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

    public DescribeTableStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableStatusRequest(DescribeTableStatusRequest source) {
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

