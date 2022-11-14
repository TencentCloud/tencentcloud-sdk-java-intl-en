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

public class DescribeAcListsRequest extends AbstractModel{

    /**
    * Protocol
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Policy
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * Search value
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * Number of entries per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Indicates whether it is outbound or inbound. 1: inbound; 0: outbound
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * EdgeId value
    */
    @SerializedName("EdgeId")
    @Expose
    private String EdgeId;

    /**
    * Indicates whether the rule is enabled. '0': disabled; '1': enabled. '0' by default
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Region
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Protocol 
     * @return Protocol Protocol
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol
     * @param Protocol Protocol
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Policy 
     * @return Strategy Policy
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Policy
     * @param Strategy Policy
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get Search value 
     * @return SearchValue Search value
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set Search value
     * @param SearchValue Search value
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get Number of entries per page 
     * @return Limit Number of entries per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page
     * @param Limit Number of entries per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Indicates whether it is outbound or inbound. 1: inbound; 0: outbound 
     * @return Direction Indicates whether it is outbound or inbound. 1: inbound; 0: outbound
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Indicates whether it is outbound or inbound. 1: inbound; 0: outbound
     * @param Direction Indicates whether it is outbound or inbound. 1: inbound; 0: outbound
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get EdgeId value 
     * @return EdgeId EdgeId value
     */
    public String getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set EdgeId value
     * @param EdgeId EdgeId value
     */
    public void setEdgeId(String EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get Indicates whether the rule is enabled. '0': disabled; '1': enabled. '0' by default 
     * @return Status Indicates whether the rule is enabled. '0': disabled; '1': enabled. '0' by default
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Indicates whether the rule is enabled. '0': disabled; '1': enabled. '0' by default
     * @param Status Indicates whether the rule is enabled. '0': disabled; '1': enabled. '0' by default
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Region 
     * @return Area Region
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Region
     * @param Area Region
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DescribeAcListsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAcListsRequest(DescribeAcListsRequest source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.EdgeId != null) {
            this.EdgeId = new String(source.EdgeId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

