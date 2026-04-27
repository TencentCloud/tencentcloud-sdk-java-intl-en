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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePublicIpsRequest extends AbstractModel {

    /**
    * Filter by public network instance ID (substring match, union of multiple values)
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String [] NetworkInstanceId;

    /**
    * Filter by availability zone/IDC
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Filter by IP (substring match, union of multiple values)
    */
    @SerializedName("Ip")
    @Expose
    private String [] Ip;

    /**
    * Filter by status, available values: `InUse`, `Unbound` (multiple values are combined with OR)
    */
    @SerializedName("State")
    @Expose
    private String [] State;

    /**
    * Filter by IP version. Available values: `Ipv4`, `Ipv6` (multiple values are combined).
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * Sort by creation time, available values: `asc`, `desc` (default `desc`)
    */
    @SerializedName("OrderByCreateTime")
    @Expose
    private String OrderByCreateTime;

    /**
    * Sort by update time, available values: `asc`, `desc` (priority is higher than sort by creation time)
    */
    @SerializedName("OrderByUpdateTime")
    @Expose
    private String OrderByUpdateTime;

    /**
    * Pagination offset, default 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items per page. Default 20. Maximum 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Filter by public network instance ID (substring match, union of multiple values) 
     * @return NetworkInstanceId Filter by public network instance ID (substring match, union of multiple values)
     */
    public String [] getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set Filter by public network instance ID (substring match, union of multiple values)
     * @param NetworkInstanceId Filter by public network instance ID (substring match, union of multiple values)
     */
    public void setNetworkInstanceId(String [] NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get Filter by availability zone/IDC 
     * @return ZoneId Filter by availability zone/IDC
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Filter by availability zone/IDC
     * @param ZoneId Filter by availability zone/IDC
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Filter by IP (substring match, union of multiple values) 
     * @return Ip Filter by IP (substring match, union of multiple values)
     */
    public String [] getIp() {
        return this.Ip;
    }

    /**
     * Set Filter by IP (substring match, union of multiple values)
     * @param Ip Filter by IP (substring match, union of multiple values)
     */
    public void setIp(String [] Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Filter by status, available values: `InUse`, `Unbound` (multiple values are combined with OR) 
     * @return State Filter by status, available values: `InUse`, `Unbound` (multiple values are combined with OR)
     */
    public String [] getState() {
        return this.State;
    }

    /**
     * Set Filter by status, available values: `InUse`, `Unbound` (multiple values are combined with OR)
     * @param State Filter by status, available values: `InUse`, `Unbound` (multiple values are combined with OR)
     */
    public void setState(String [] State) {
        this.State = State;
    }

    /**
     * Get Filter by IP version. Available values: `Ipv4`, `Ipv6` (multiple values are combined). 
     * @return Type Filter by IP version. Available values: `Ipv4`, `Ipv6` (multiple values are combined).
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set Filter by IP version. Available values: `Ipv4`, `Ipv6` (multiple values are combined).
     * @param Type Filter by IP version. Available values: `Ipv4`, `Ipv6` (multiple values are combined).
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get Sort by creation time, available values: `asc`, `desc` (default `desc`) 
     * @return OrderByCreateTime Sort by creation time, available values: `asc`, `desc` (default `desc`)
     */
    public String getOrderByCreateTime() {
        return this.OrderByCreateTime;
    }

    /**
     * Set Sort by creation time, available values: `asc`, `desc` (default `desc`)
     * @param OrderByCreateTime Sort by creation time, available values: `asc`, `desc` (default `desc`)
     */
    public void setOrderByCreateTime(String OrderByCreateTime) {
        this.OrderByCreateTime = OrderByCreateTime;
    }

    /**
     * Get Sort by update time, available values: `asc`, `desc` (priority is higher than sort by creation time) 
     * @return OrderByUpdateTime Sort by update time, available values: `asc`, `desc` (priority is higher than sort by creation time)
     */
    public String getOrderByUpdateTime() {
        return this.OrderByUpdateTime;
    }

    /**
     * Set Sort by update time, available values: `asc`, `desc` (priority is higher than sort by creation time)
     * @param OrderByUpdateTime Sort by update time, available values: `asc`, `desc` (priority is higher than sort by creation time)
     */
    public void setOrderByUpdateTime(String OrderByUpdateTime) {
        this.OrderByUpdateTime = OrderByUpdateTime;
    }

    /**
     * Get Pagination offset, default 0 
     * @return Offset Pagination offset, default 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, default 0
     * @param Offset Pagination offset, default 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of items per page. Default 20. Maximum 100. 
     * @return Limit Number of items per page. Default 20. Maximum 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page. Default 20. Maximum 100.
     * @param Limit Number of items per page. Default 20. Maximum 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePublicIpsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicIpsRequest(DescribePublicIpsRequest source) {
        if (source.NetworkInstanceId != null) {
            this.NetworkInstanceId = new String[source.NetworkInstanceId.length];
            for (int i = 0; i < source.NetworkInstanceId.length; i++) {
                this.NetworkInstanceId[i] = new String(source.NetworkInstanceId[i]);
            }
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Ip != null) {
            this.Ip = new String[source.Ip.length];
            for (int i = 0; i < source.Ip.length; i++) {
                this.Ip[i] = new String(source.Ip[i]);
            }
        }
        if (source.State != null) {
            this.State = new String[source.State.length];
            for (int i = 0; i < source.State.length; i++) {
                this.State[i] = new String(source.State[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.OrderByCreateTime != null) {
            this.OrderByCreateTime = new String(source.OrderByCreateTime);
        }
        if (source.OrderByUpdateTime != null) {
            this.OrderByUpdateTime = new String(source.OrderByUpdateTime);
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
        this.setParamArraySimple(map, prefix + "NetworkInstanceId.", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Ip.", this.Ip);
        this.setParamArraySimple(map, prefix + "State.", this.State);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamSimple(map, prefix + "OrderByCreateTime", this.OrderByCreateTime);
        this.setParamSimple(map, prefix + "OrderByUpdateTime", this.OrderByUpdateTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

