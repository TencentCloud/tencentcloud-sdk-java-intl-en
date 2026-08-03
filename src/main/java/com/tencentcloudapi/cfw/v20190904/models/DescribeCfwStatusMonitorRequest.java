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

public class DescribeCfwStatusMonitorRequest extends AbstractModel {

    /**
    * Operation type. describe_scene means discovery of scenarios and secondary dropdown options; fetch_scene means acquisition of scenario-based snapshots. Required.
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * Firewall scenario type. Supports internet_edge (Internet edge firewall), nat_cluster (NAT border firewall - cluster), nat_ha (NAT border firewall - primary/secondary), vpc_cluster (VPC boundary firewall - cluster), vpc_ha (VPC boundary firewall - primary/secondary). Required.
    */
    @SerializedName("FirewallType")
    @Expose
    private String FirewallType;

    /**
    * Secondary dropdown option ID. fetch_scene is imported as needed, and the value comes from selection.available_options[].ID returned by describe_scene. internet_edge is the region, NAT is the instance ID, and VPC bandwidth scenario is the firewall group ID. The connections aggregation scenario for VPC_cluster ignores this parameter.
    */
    @SerializedName("SelectionId")
    @Expose
    private String SelectionId;

    /**
    * Secondary dropdown display name. Can be used as an alternative to SelectionId for matching by name. The value comes from selection.available_options[].name returned by describe_scene.
    */
    @SerializedName("SelectionName")
    @Expose
    private String SelectionName;

    /**
    * Engine instance ID. Mainly used in vpc ha scenarios where a firewall group corresponds to multiple instances. Preferentially use the selection.available_options[].instance_ID returned by describe_scene. If only instance_ids are available, select a string value from the array.
    */
    @SerializedName("SelectionInstanceId")
    @Expose
    private String SelectionInstanceId;

    /**
    * Metrics tab. fetch_scene can be passed; used when not passed, this scenario default value. Support bandwidth, connections.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Perspective under the metric. fetch_scene is optional; the default value for this scenario is used when not provided. Supports ip, subnet, session, switch, and vpc. The actual usable composite is subject to the return from describe_scene.
    */
    @SerializedName("Perspective")
    @Expose
    private String Perspective;

    /**
    * NAT primary/secondary number of connections IP perspective range. External means external IP, asset means Asset IP. Only nat_ha + connections + ip is used. Other group input will return InvalidParameter.
    */
    @SerializedName("IpScope")
    @Expose
    private String IpScope;

    /**
    * Preset time range. Default 24h; used by fetch_scene. Supports 5m, 15m, 30m, 1h, 6h, 24h, 3d, 7d, 30d, today, yesterday, day before yesterday, this week, last week, this month.
    */
    @SerializedName("TimePreset")
    @Expose
    private String TimePreset;

    /**
    * Custom start time. Format YYYY-MM-DD HH:MM:SS; must be specified together with EndTime, maximum span 30 days.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Custom end time. Format YYYY-MM-DD HH:MM:SS; must be consistent with StartTime at the same time, maximum span 30 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Page number, starting from 1. Default is 1; used for the fetch_scene list viewing angle.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Entries per page. Default 10, value 1 to 100; used for the viewing angle of the fetch_scene list.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Whether to only get overview data. When true, fetch_scene only requests overview, skips table/detail, and is suitable for viewing scenario snapshot summary.
    */
    @SerializedName("OverviewOnly")
    @Expose
    private Boolean OverviewOnly;

    /**
    * Original offset coverage. Option, overwrites the calculation result of Page after input; value 0 to 10000.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting field. Option. InputMax and OutputMax are supported for the Internet boundary IP and NAT IP/subnet perspective. SwitchName is supported for the VPC switch perspective. FlowMax is supported for the VPC IP/VPC perspective. Do not pass other groups.
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * Sorting order. Default desc; supports asc, desc.
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * Filter condition list. Reserved.
    */
    @SerializedName("Filters")
    @Expose
    private CfwStatusMonitorFilter [] Filters;

    /**
     * Get Operation type. describe_scene means discovery of scenarios and secondary dropdown options; fetch_scene means acquisition of scenario-based snapshots. Required. 
     * @return Op Operation type. describe_scene means discovery of scenarios and secondary dropdown options; fetch_scene means acquisition of scenario-based snapshots. Required.
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set Operation type. describe_scene means discovery of scenarios and secondary dropdown options; fetch_scene means acquisition of scenario-based snapshots. Required.
     * @param Op Operation type. describe_scene means discovery of scenarios and secondary dropdown options; fetch_scene means acquisition of scenario-based snapshots. Required.
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get Firewall scenario type. Supports internet_edge (Internet edge firewall), nat_cluster (NAT border firewall - cluster), nat_ha (NAT border firewall - primary/secondary), vpc_cluster (VPC boundary firewall - cluster), vpc_ha (VPC boundary firewall - primary/secondary). Required. 
     * @return FirewallType Firewall scenario type. Supports internet_edge (Internet edge firewall), nat_cluster (NAT border firewall - cluster), nat_ha (NAT border firewall - primary/secondary), vpc_cluster (VPC boundary firewall - cluster), vpc_ha (VPC boundary firewall - primary/secondary). Required.
     */
    public String getFirewallType() {
        return this.FirewallType;
    }

    /**
     * Set Firewall scenario type. Supports internet_edge (Internet edge firewall), nat_cluster (NAT border firewall - cluster), nat_ha (NAT border firewall - primary/secondary), vpc_cluster (VPC boundary firewall - cluster), vpc_ha (VPC boundary firewall - primary/secondary). Required.
     * @param FirewallType Firewall scenario type. Supports internet_edge (Internet edge firewall), nat_cluster (NAT border firewall - cluster), nat_ha (NAT border firewall - primary/secondary), vpc_cluster (VPC boundary firewall - cluster), vpc_ha (VPC boundary firewall - primary/secondary). Required.
     */
    public void setFirewallType(String FirewallType) {
        this.FirewallType = FirewallType;
    }

    /**
     * Get Secondary dropdown option ID. fetch_scene is imported as needed, and the value comes from selection.available_options[].ID returned by describe_scene. internet_edge is the region, NAT is the instance ID, and VPC bandwidth scenario is the firewall group ID. The connections aggregation scenario for VPC_cluster ignores this parameter. 
     * @return SelectionId Secondary dropdown option ID. fetch_scene is imported as needed, and the value comes from selection.available_options[].ID returned by describe_scene. internet_edge is the region, NAT is the instance ID, and VPC bandwidth scenario is the firewall group ID. The connections aggregation scenario for VPC_cluster ignores this parameter.
     */
    public String getSelectionId() {
        return this.SelectionId;
    }

    /**
     * Set Secondary dropdown option ID. fetch_scene is imported as needed, and the value comes from selection.available_options[].ID returned by describe_scene. internet_edge is the region, NAT is the instance ID, and VPC bandwidth scenario is the firewall group ID. The connections aggregation scenario for VPC_cluster ignores this parameter.
     * @param SelectionId Secondary dropdown option ID. fetch_scene is imported as needed, and the value comes from selection.available_options[].ID returned by describe_scene. internet_edge is the region, NAT is the instance ID, and VPC bandwidth scenario is the firewall group ID. The connections aggregation scenario for VPC_cluster ignores this parameter.
     */
    public void setSelectionId(String SelectionId) {
        this.SelectionId = SelectionId;
    }

    /**
     * Get Secondary dropdown display name. Can be used as an alternative to SelectionId for matching by name. The value comes from selection.available_options[].name returned by describe_scene. 
     * @return SelectionName Secondary dropdown display name. Can be used as an alternative to SelectionId for matching by name. The value comes from selection.available_options[].name returned by describe_scene.
     */
    public String getSelectionName() {
        return this.SelectionName;
    }

    /**
     * Set Secondary dropdown display name. Can be used as an alternative to SelectionId for matching by name. The value comes from selection.available_options[].name returned by describe_scene.
     * @param SelectionName Secondary dropdown display name. Can be used as an alternative to SelectionId for matching by name. The value comes from selection.available_options[].name returned by describe_scene.
     */
    public void setSelectionName(String SelectionName) {
        this.SelectionName = SelectionName;
    }

    /**
     * Get Engine instance ID. Mainly used in vpc ha scenarios where a firewall group corresponds to multiple instances. Preferentially use the selection.available_options[].instance_ID returned by describe_scene. If only instance_ids are available, select a string value from the array. 
     * @return SelectionInstanceId Engine instance ID. Mainly used in vpc ha scenarios where a firewall group corresponds to multiple instances. Preferentially use the selection.available_options[].instance_ID returned by describe_scene. If only instance_ids are available, select a string value from the array.
     */
    public String getSelectionInstanceId() {
        return this.SelectionInstanceId;
    }

    /**
     * Set Engine instance ID. Mainly used in vpc ha scenarios where a firewall group corresponds to multiple instances. Preferentially use the selection.available_options[].instance_ID returned by describe_scene. If only instance_ids are available, select a string value from the array.
     * @param SelectionInstanceId Engine instance ID. Mainly used in vpc ha scenarios where a firewall group corresponds to multiple instances. Preferentially use the selection.available_options[].instance_ID returned by describe_scene. If only instance_ids are available, select a string value from the array.
     */
    public void setSelectionInstanceId(String SelectionInstanceId) {
        this.SelectionInstanceId = SelectionInstanceId;
    }

    /**
     * Get Metrics tab. fetch_scene can be passed; used when not passed, this scenario default value. Support bandwidth, connections. 
     * @return Metric Metrics tab. fetch_scene can be passed; used when not passed, this scenario default value. Support bandwidth, connections.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Metrics tab. fetch_scene can be passed; used when not passed, this scenario default value. Support bandwidth, connections.
     * @param Metric Metrics tab. fetch_scene can be passed; used when not passed, this scenario default value. Support bandwidth, connections.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Perspective under the metric. fetch_scene is optional; the default value for this scenario is used when not provided. Supports ip, subnet, session, switch, and vpc. The actual usable composite is subject to the return from describe_scene. 
     * @return Perspective Perspective under the metric. fetch_scene is optional; the default value for this scenario is used when not provided. Supports ip, subnet, session, switch, and vpc. The actual usable composite is subject to the return from describe_scene.
     */
    public String getPerspective() {
        return this.Perspective;
    }

    /**
     * Set Perspective under the metric. fetch_scene is optional; the default value for this scenario is used when not provided. Supports ip, subnet, session, switch, and vpc. The actual usable composite is subject to the return from describe_scene.
     * @param Perspective Perspective under the metric. fetch_scene is optional; the default value for this scenario is used when not provided. Supports ip, subnet, session, switch, and vpc. The actual usable composite is subject to the return from describe_scene.
     */
    public void setPerspective(String Perspective) {
        this.Perspective = Perspective;
    }

    /**
     * Get NAT primary/secondary number of connections IP perspective range. External means external IP, asset means Asset IP. Only nat_ha + connections + ip is used. Other group input will return InvalidParameter. 
     * @return IpScope NAT primary/secondary number of connections IP perspective range. External means external IP, asset means Asset IP. Only nat_ha + connections + ip is used. Other group input will return InvalidParameter.
     */
    public String getIpScope() {
        return this.IpScope;
    }

    /**
     * Set NAT primary/secondary number of connections IP perspective range. External means external IP, asset means Asset IP. Only nat_ha + connections + ip is used. Other group input will return InvalidParameter.
     * @param IpScope NAT primary/secondary number of connections IP perspective range. External means external IP, asset means Asset IP. Only nat_ha + connections + ip is used. Other group input will return InvalidParameter.
     */
    public void setIpScope(String IpScope) {
        this.IpScope = IpScope;
    }

    /**
     * Get Preset time range. Default 24h; used by fetch_scene. Supports 5m, 15m, 30m, 1h, 6h, 24h, 3d, 7d, 30d, today, yesterday, day before yesterday, this week, last week, this month. 
     * @return TimePreset Preset time range. Default 24h; used by fetch_scene. Supports 5m, 15m, 30m, 1h, 6h, 24h, 3d, 7d, 30d, today, yesterday, day before yesterday, this week, last week, this month.
     */
    public String getTimePreset() {
        return this.TimePreset;
    }

    /**
     * Set Preset time range. Default 24h; used by fetch_scene. Supports 5m, 15m, 30m, 1h, 6h, 24h, 3d, 7d, 30d, today, yesterday, day before yesterday, this week, last week, this month.
     * @param TimePreset Preset time range. Default 24h; used by fetch_scene. Supports 5m, 15m, 30m, 1h, 6h, 24h, 3d, 7d, 30d, today, yesterday, day before yesterday, this week, last week, this month.
     */
    public void setTimePreset(String TimePreset) {
        this.TimePreset = TimePreset;
    }

    /**
     * Get Custom start time. Format YYYY-MM-DD HH:MM:SS; must be specified together with EndTime, maximum span 30 days. 
     * @return StartTime Custom start time. Format YYYY-MM-DD HH:MM:SS; must be specified together with EndTime, maximum span 30 days.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Custom start time. Format YYYY-MM-DD HH:MM:SS; must be specified together with EndTime, maximum span 30 days.
     * @param StartTime Custom start time. Format YYYY-MM-DD HH:MM:SS; must be specified together with EndTime, maximum span 30 days.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Custom end time. Format YYYY-MM-DD HH:MM:SS; must be consistent with StartTime at the same time, maximum span 30 days. 
     * @return EndTime Custom end time. Format YYYY-MM-DD HH:MM:SS; must be consistent with StartTime at the same time, maximum span 30 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Custom end time. Format YYYY-MM-DD HH:MM:SS; must be consistent with StartTime at the same time, maximum span 30 days.
     * @param EndTime Custom end time. Format YYYY-MM-DD HH:MM:SS; must be consistent with StartTime at the same time, maximum span 30 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Page number, starting from 1. Default is 1; used for the fetch_scene list viewing angle. 
     * @return Page Page number, starting from 1. Default is 1; used for the fetch_scene list viewing angle.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page number, starting from 1. Default is 1; used for the fetch_scene list viewing angle.
     * @param Page Page number, starting from 1. Default is 1; used for the fetch_scene list viewing angle.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Entries per page. Default 10, value 1 to 100; used for the viewing angle of the fetch_scene list. 
     * @return Limit Entries per page. Default 10, value 1 to 100; used for the viewing angle of the fetch_scene list.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Entries per page. Default 10, value 1 to 100; used for the viewing angle of the fetch_scene list.
     * @param Limit Entries per page. Default 10, value 1 to 100; used for the viewing angle of the fetch_scene list.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Whether to only get overview data. When true, fetch_scene only requests overview, skips table/detail, and is suitable for viewing scenario snapshot summary. 
     * @return OverviewOnly Whether to only get overview data. When true, fetch_scene only requests overview, skips table/detail, and is suitable for viewing scenario snapshot summary.
     */
    public Boolean getOverviewOnly() {
        return this.OverviewOnly;
    }

    /**
     * Set Whether to only get overview data. When true, fetch_scene only requests overview, skips table/detail, and is suitable for viewing scenario snapshot summary.
     * @param OverviewOnly Whether to only get overview data. When true, fetch_scene only requests overview, skips table/detail, and is suitable for viewing scenario snapshot summary.
     */
    public void setOverviewOnly(Boolean OverviewOnly) {
        this.OverviewOnly = OverviewOnly;
    }

    /**
     * Get Original offset coverage. Option, overwrites the calculation result of Page after input; value 0 to 10000. 
     * @return Offset Original offset coverage. Option, overwrites the calculation result of Page after input; value 0 to 10000.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Original offset coverage. Option, overwrites the calculation result of Page after input; value 0 to 10000.
     * @param Offset Original offset coverage. Option, overwrites the calculation result of Page after input; value 0 to 10000.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting field. Option. InputMax and OutputMax are supported for the Internet boundary IP and NAT IP/subnet perspective. SwitchName is supported for the VPC switch perspective. FlowMax is supported for the VPC IP/VPC perspective. Do not pass other groups. 
     * @return SortBy Sorting field. Option. InputMax and OutputMax are supported for the Internet boundary IP and NAT IP/subnet perspective. SwitchName is supported for the VPC switch perspective. FlowMax is supported for the VPC IP/VPC perspective. Do not pass other groups.
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sorting field. Option. InputMax and OutputMax are supported for the Internet boundary IP and NAT IP/subnet perspective. SwitchName is supported for the VPC switch perspective. FlowMax is supported for the VPC IP/VPC perspective. Do not pass other groups.
     * @param SortBy Sorting field. Option. InputMax and OutputMax are supported for the Internet boundary IP and NAT IP/subnet perspective. SwitchName is supported for the VPC switch perspective. FlowMax is supported for the VPC IP/VPC perspective. Do not pass other groups.
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get Sorting order. Default desc; supports asc, desc. 
     * @return SortOrder Sorting order. Default desc; supports asc, desc.
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set Sorting order. Default desc; supports asc, desc.
     * @param SortOrder Sorting order. Default desc; supports asc, desc.
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get Filter condition list. Reserved. 
     * @return Filters Filter condition list. Reserved.
     */
    public CfwStatusMonitorFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition list. Reserved.
     * @param Filters Filter condition list. Reserved.
     */
    public void setFilters(CfwStatusMonitorFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCfwStatusMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwStatusMonitorRequest(DescribeCfwStatusMonitorRequest source) {
        if (source.Op != null) {
            this.Op = new String(source.Op);
        }
        if (source.FirewallType != null) {
            this.FirewallType = new String(source.FirewallType);
        }
        if (source.SelectionId != null) {
            this.SelectionId = new String(source.SelectionId);
        }
        if (source.SelectionName != null) {
            this.SelectionName = new String(source.SelectionName);
        }
        if (source.SelectionInstanceId != null) {
            this.SelectionInstanceId = new String(source.SelectionInstanceId);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Perspective != null) {
            this.Perspective = new String(source.Perspective);
        }
        if (source.IpScope != null) {
            this.IpScope = new String(source.IpScope);
        }
        if (source.TimePreset != null) {
            this.TimePreset = new String(source.TimePreset);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OverviewOnly != null) {
            this.OverviewOnly = new Boolean(source.OverviewOnly);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
        if (source.Filters != null) {
            this.Filters = new CfwStatusMonitorFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CfwStatusMonitorFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamSimple(map, prefix + "FirewallType", this.FirewallType);
        this.setParamSimple(map, prefix + "SelectionId", this.SelectionId);
        this.setParamSimple(map, prefix + "SelectionName", this.SelectionName);
        this.setParamSimple(map, prefix + "SelectionInstanceId", this.SelectionInstanceId);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Perspective", this.Perspective);
        this.setParamSimple(map, prefix + "IpScope", this.IpScope);
        this.setParamSimple(map, prefix + "TimePreset", this.TimePreset);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OverviewOnly", this.OverviewOnly);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

