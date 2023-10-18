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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAllRuleStatusRequest extends AbstractModel {

    /**
    * Status. 0: all disabled; 1: all enabled
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Direction. 0: outbound; 1: inbound
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Edge ID value
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * NAT region
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get Status. 0: all disabled; 1: all enabled 
     * @return Status Status. 0: all disabled; 1: all enabled
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: all disabled; 1: all enabled
     * @param Status Status. 0: all disabled; 1: all enabled
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Direction. 0: outbound; 1: inbound 
     * @return Direction Direction. 0: outbound; 1: inbound
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Direction. 0: outbound; 1: inbound
     * @param Direction Direction. 0: outbound; 1: inbound
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Edge ID value 
     * @return EdgeId Edge ID value
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set Edge ID value
     * @param EdgeId Edge ID value
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
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

    public ModifyAllRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAllRuleStatusRequest(ModifyAllRuleStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

