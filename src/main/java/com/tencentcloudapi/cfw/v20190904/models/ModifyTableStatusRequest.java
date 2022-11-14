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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTableStatusRequest extends AbstractModel{

    /**
    * Edge ID between two VPCs
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * Status value. 1: table locked; 2: table unlocked
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * NAT region
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 0: outbound; 1: inbound
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get Edge ID between two VPCs 
     * @return EdgeId Edge ID between two VPCs
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set Edge ID between two VPCs
     * @param EdgeId Edge ID between two VPCs
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get Status value. 1: table locked; 2: table unlocked 
     * @return Status Status value. 1: table locked; 2: table unlocked
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status value. 1: table locked; 2: table unlocked
     * @param Status Status value. 1: table locked; 2: table unlocked
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get NAT region 
     * @return Area NAT region
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set NAT region
     * @param Area NAT region
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 0: outbound; 1: inbound 
     * @return Direction 0: outbound; 1: inbound
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 0: outbound; 1: inbound
     * @param Direction 0: outbound; 1: inbound
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public ModifyTableStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTableStatusRequest(ModifyTableStatusRequest source) {
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

