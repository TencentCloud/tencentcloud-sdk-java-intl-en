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

public class DeleteAcRuleRequest extends AbstractModel{

    /**
    * The ID of the rule to delete. It can be queried via the DescribeAcLists API.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Direction. 0: outbound; 1: inbound
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Edge ID between two VPCs
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * NAT region, e.g. ap-shanghai/ap-guangzhou/ap-chongqing
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get The ID of the rule to delete. It can be queried via the DescribeAcLists API. 
     * @return Id The ID of the rule to delete. It can be queried via the DescribeAcLists API.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set The ID of the rule to delete. It can be queried via the DescribeAcLists API.
     * @param Id The ID of the rule to delete. It can be queried via the DescribeAcLists API.
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get NAT region, e.g. ap-shanghai/ap-guangzhou/ap-chongqing 
     * @return Area NAT region, e.g. ap-shanghai/ap-guangzhou/ap-chongqing
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set NAT region, e.g. ap-shanghai/ap-guangzhou/ap-chongqing
     * @param Area NAT region, e.g. ap-shanghai/ap-guangzhou/ap-chongqing
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DeleteAcRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAcRuleRequest(DeleteAcRuleRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

