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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSAttackEventRequest extends AbstractModel {

    /**
    * Start time. Time range: 30 days.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time. The query time range (`EndTime` - `StartTime`) must be up to 31 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Collection of ddos policy groups. If left blank, all policies are selected by default.
    */
    @SerializedName("PolicyIds")
    @Expose
    private Long [] PolicyIds;

    /**
    * Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the announcement: [Tencent Cloud EdgeOne Cloud API Change Notification](https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1). You can import up to 100 site IDs. To query all site data under the Tencent Cloud root account, use `*` instead. To query account-level data, you need permission for all site resources of this interface.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Number limit of paginated query. Default value: 20. Maximum number of query entries: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Parameter to show attack details. If set to `false`, only the number of attacks is returned. If set to `true`, attack details are returned.
    */
    @SerializedName("ShowDetail")
    @Expose
    private Boolean ShowDetail;

    /**
    * Data ownership region. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data;</li>
<li>global: global data;</li>If this parameter is not input, the default value `global` is used.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Sorting field. Valid values:
<li>MaxBandWidth: bandwidth peak;</li>
<li>AttackStartTime: attack start time.</li>If not specified, the default value is AttackStartTime.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting method. Valid values:
<li>asc: in ascending order;</li>
<li>desc: in descending order.</li> If not specified, the default value is desc.
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get Start time. Time range: 30 days. 
     * @return StartTime Start time. Time range: 30 days.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time. Time range: 30 days.
     * @param StartTime Start time. Time range: 30 days.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. The query time range (`EndTime` - `StartTime`) must be up to 31 days. 
     * @return EndTime End time. The query time range (`EndTime` - `StartTime`) must be up to 31 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. The query time range (`EndTime` - `StartTime`) must be up to 31 days.
     * @param EndTime End time. The query time range (`EndTime` - `StartTime`) must be up to 31 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Collection of ddos policy groups. If left blank, all policies are selected by default. 
     * @return PolicyIds Collection of ddos policy groups. If left blank, all policies are selected by default.
     */
    public Long [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set Collection of ddos policy groups. If left blank, all policies are selected by default.
     * @param PolicyIds Collection of ddos policy groups. If left blank, all policies are selected by default.
     */
    public void setPolicyIds(Long [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the announcement: [Tencent Cloud EdgeOne Cloud API Change Notification](https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1). You can import up to 100 site IDs. To query all site data under the Tencent Cloud root account, use `*` instead. To query account-level data, you need permission for all site resources of this interface. 
     * @return ZoneIds Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the announcement: [Tencent Cloud EdgeOne Cloud API Change Notification](https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1). You can import up to 100 site IDs. To query all site data under the Tencent Cloud root account, use `*` instead. To query account-level data, you need permission for all site resources of this interface.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the announcement: [Tencent Cloud EdgeOne Cloud API Change Notification](https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1). You can import up to 100 site IDs. To query all site data under the Tencent Cloud root account, use `*` instead. To query account-level data, you need permission for all site resources of this interface.
     * @param ZoneIds Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the announcement: [Tencent Cloud EdgeOne Cloud API Change Notification](https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1). You can import up to 100 site IDs. To query all site data under the Tencent Cloud root account, use `*` instead. To query account-level data, you need permission for all site resources of this interface.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Number limit of paginated query. Default value: 20. Maximum number of query entries: 1000. 
     * @return Limit Number limit of paginated query. Default value: 20. Maximum number of query entries: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number limit of paginated query. Default value: 20. Maximum number of query entries: 1000.
     * @param Limit Number limit of paginated query. Default value: 20. Maximum number of query entries: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page offset. Default value: 0 
     * @return Offset Page offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset. Default value: 0
     * @param Offset Page offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Parameter to show attack details. If set to `false`, only the number of attacks is returned. If set to `true`, attack details are returned. 
     * @return ShowDetail Parameter to show attack details. If set to `false`, only the number of attacks is returned. If set to `true`, attack details are returned.
     */
    public Boolean getShowDetail() {
        return this.ShowDetail;
    }

    /**
     * Set Parameter to show attack details. If set to `false`, only the number of attacks is returned. If set to `true`, attack details are returned.
     * @param ShowDetail Parameter to show attack details. If set to `false`, only the number of attacks is returned. If set to `true`, attack details are returned.
     */
    public void setShowDetail(Boolean ShowDetail) {
        this.ShowDetail = ShowDetail;
    }

    /**
     * Get Data ownership region. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data;</li>
<li>global: global data;</li>If this parameter is not input, the default value `global` is used. 
     * @return Area Data ownership region. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data;</li>
<li>global: global data;</li>If this parameter is not input, the default value `global` is used.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Data ownership region. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data;</li>
<li>global: global data;</li>If this parameter is not input, the default value `global` is used.
     * @param Area Data ownership region. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data;</li>
<li>global: global data;</li>If this parameter is not input, the default value `global` is used.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Sorting field. Valid values:
<li>MaxBandWidth: bandwidth peak;</li>
<li>AttackStartTime: attack start time.</li>If not specified, the default value is AttackStartTime. 
     * @return OrderBy Sorting field. Valid values:
<li>MaxBandWidth: bandwidth peak;</li>
<li>AttackStartTime: attack start time.</li>If not specified, the default value is AttackStartTime.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. Valid values:
<li>MaxBandWidth: bandwidth peak;</li>
<li>AttackStartTime: attack start time.</li>If not specified, the default value is AttackStartTime.
     * @param OrderBy Sorting field. Valid values:
<li>MaxBandWidth: bandwidth peak;</li>
<li>AttackStartTime: attack start time.</li>If not specified, the default value is AttackStartTime.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method. Valid values:
<li>asc: in ascending order;</li>
<li>desc: in descending order.</li> If not specified, the default value is desc. 
     * @return OrderType Sorting method. Valid values:
<li>asc: in ascending order;</li>
<li>desc: in descending order.</li> If not specified, the default value is desc.
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Sorting method. Valid values:
<li>asc: in ascending order;</li>
<li>desc: in descending order.</li> If not specified, the default value is desc.
     * @param OrderType Sorting method. Valid values:
<li>asc: in ascending order;</li>
<li>desc: in descending order.</li> If not specified, the default value is desc.
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public DescribeDDoSAttackEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSAttackEventRequest(DescribeDDoSAttackEventRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new Long[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new Long(source.PolicyIds[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ShowDetail != null) {
            this.ShowDetail = new Boolean(source.ShowDetail);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ShowDetail", this.ShowDetail);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

