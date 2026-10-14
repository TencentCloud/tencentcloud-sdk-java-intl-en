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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * <p>AZ to which the cluster instance belongs. All AZs are selected by default if this parameter is not specified.</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Cluster instance ID list</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>Cluster instance name list.</p>
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * <p>Pagination starting value. Default value: 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Page size. Default value: 20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Sorting field<li>1: Instance ID</li><li>2: Instance name</li><li>3: Availability zone</li><li>4: Creation time</li>If orderByKey is not transmitted, sort by creation time in descending order</p>
    */
    @SerializedName("OrderByKey")
    @Expose
    private Long OrderByKey;

    /**
    * <p>Sorting method<li>0: ascending</li><li>1: descending</li>If orderByKey is passed but orderByType is not, ascending by default</p>
    */
    @SerializedName("OrderByType")
    @Expose
    private Long OrderByType;

    /**
    * <p>Node tag information list</p>
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * <p>Private network vip list</p>
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * <p>IP list of cluster nodes</p>
    */
    @SerializedName("NodeIps")
    @Expose
    private String [] NodeIps;

    /**
    * <p>Availability zone list</p>
    */
    @SerializedName("ZoneList")
    @Expose
    private String [] ZoneList;

    /**
    * <p>Health status filter list: 0 represents green, 1 represents yellow, 2 represents red, -1 represents unknown</p>
    */
    @SerializedName("HealthStatus")
    @Expose
    private Long [] HealthStatus;

    /**
    * <p>Vpc list filter item</p>
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * <p>cdc cluster id</p>
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
     * Get <p>AZ to which the cluster instance belongs. All AZs are selected by default if this parameter is not specified.</p> 
     * @return Zone <p>AZ to which the cluster instance belongs. All AZs are selected by default if this parameter is not specified.</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ to which the cluster instance belongs. All AZs are selected by default if this parameter is not specified.</p>
     * @param Zone <p>AZ to which the cluster instance belongs. All AZs are selected by default if this parameter is not specified.</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Cluster instance ID list</p> 
     * @return InstanceIds <p>Cluster instance ID list</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>Cluster instance ID list</p>
     * @param InstanceIds <p>Cluster instance ID list</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>Cluster instance name list.</p> 
     * @return InstanceNames <p>Cluster instance name list.</p>
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set <p>Cluster instance name list.</p>
     * @param InstanceNames <p>Cluster instance name list.</p>
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get <p>Pagination starting value. Default value: 0</p> 
     * @return Offset <p>Pagination starting value. Default value: 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination starting value. Default value: 0</p>
     * @param Offset <p>Pagination starting value. Default value: 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Page size. Default value: 20</p> 
     * @return Limit <p>Page size. Default value: 20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Page size. Default value: 20</p>
     * @param Limit <p>Page size. Default value: 20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Sorting field<li>1: Instance ID</li><li>2: Instance name</li><li>3: Availability zone</li><li>4: Creation time</li>If orderByKey is not transmitted, sort by creation time in descending order</p> 
     * @return OrderByKey <p>Sorting field<li>1: Instance ID</li><li>2: Instance name</li><li>3: Availability zone</li><li>4: Creation time</li>If orderByKey is not transmitted, sort by creation time in descending order</p>
     */
    public Long getOrderByKey() {
        return this.OrderByKey;
    }

    /**
     * Set <p>Sorting field<li>1: Instance ID</li><li>2: Instance name</li><li>3: Availability zone</li><li>4: Creation time</li>If orderByKey is not transmitted, sort by creation time in descending order</p>
     * @param OrderByKey <p>Sorting field<li>1: Instance ID</li><li>2: Instance name</li><li>3: Availability zone</li><li>4: Creation time</li>If orderByKey is not transmitted, sort by creation time in descending order</p>
     */
    public void setOrderByKey(Long OrderByKey) {
        this.OrderByKey = OrderByKey;
    }

    /**
     * Get <p>Sorting method<li>0: ascending</li><li>1: descending</li>If orderByKey is passed but orderByType is not, ascending by default</p> 
     * @return OrderByType <p>Sorting method<li>0: ascending</li><li>1: descending</li>If orderByKey is passed but orderByType is not, ascending by default</p>
     */
    public Long getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set <p>Sorting method<li>0: ascending</li><li>1: descending</li>If orderByKey is passed but orderByType is not, ascending by default</p>
     * @param OrderByType <p>Sorting method<li>0: ascending</li><li>1: descending</li>If orderByKey is passed but orderByType is not, ascending by default</p>
     */
    public void setOrderByType(Long OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get <p>Node tag information list</p> 
     * @return TagList <p>Node tag information list</p>
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>Node tag information list</p>
     * @param TagList <p>Node tag information list</p>
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>Private network vip list</p> 
     * @return IpList <p>Private network vip list</p>
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set <p>Private network vip list</p>
     * @param IpList <p>Private network vip list</p>
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get <p>IP list of cluster nodes</p> 
     * @return NodeIps <p>IP list of cluster nodes</p>
     */
    public String [] getNodeIps() {
        return this.NodeIps;
    }

    /**
     * Set <p>IP list of cluster nodes</p>
     * @param NodeIps <p>IP list of cluster nodes</p>
     */
    public void setNodeIps(String [] NodeIps) {
        this.NodeIps = NodeIps;
    }

    /**
     * Get <p>Availability zone list</p> 
     * @return ZoneList <p>Availability zone list</p>
     */
    public String [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set <p>Availability zone list</p>
     * @param ZoneList <p>Availability zone list</p>
     */
    public void setZoneList(String [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get <p>Health status filter list: 0 represents green, 1 represents yellow, 2 represents red, -1 represents unknown</p> 
     * @return HealthStatus <p>Health status filter list: 0 represents green, 1 represents yellow, 2 represents red, -1 represents unknown</p>
     */
    public Long [] getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set <p>Health status filter list: 0 represents green, 1 represents yellow, 2 represents red, -1 represents unknown</p>
     * @param HealthStatus <p>Health status filter list: 0 represents green, 1 represents yellow, 2 represents red, -1 represents unknown</p>
     */
    public void setHealthStatus(Long [] HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get <p>Vpc list filter item</p> 
     * @return VpcIds <p>Vpc list filter item</p>
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set <p>Vpc list filter item</p>
     * @param VpcIds <p>Vpc list filter item</p>
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get <p>cdc cluster id</p> 
     * @return CdcId <p>cdc cluster id</p>
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>cdc cluster id</p>
     * @param CdcId <p>cdc cluster id</p>
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceNames != null) {
            this.InstanceNames = new String[source.InstanceNames.length];
            for (int i = 0; i < source.InstanceNames.length; i++) {
                this.InstanceNames[i] = new String(source.InstanceNames[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderByKey != null) {
            this.OrderByKey = new Long(source.OrderByKey);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new Long(source.OrderByType);
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.NodeIps != null) {
            this.NodeIps = new String[source.NodeIps.length];
            for (int i = 0; i < source.NodeIps.length; i++) {
                this.NodeIps[i] = new String(source.NodeIps[i]);
            }
        }
        if (source.ZoneList != null) {
            this.ZoneList = new String[source.ZoneList.length];
            for (int i = 0; i < source.ZoneList.length; i++) {
                this.ZoneList[i] = new String(source.ZoneList[i]);
            }
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new Long[source.HealthStatus.length];
            for (int i = 0; i < source.HealthStatus.length; i++) {
                this.HealthStatus[i] = new Long(source.HealthStatus[i]);
            }
        }
        if (source.VpcIds != null) {
            this.VpcIds = new String[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new String(source.VpcIds[i]);
            }
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "InstanceNames.", this.InstanceNames);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderByKey", this.OrderByKey);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamArraySimple(map, prefix + "NodeIps.", this.NodeIps);
        this.setParamArraySimple(map, prefix + "ZoneList.", this.ZoneList);
        this.setParamArraySimple(map, prefix + "HealthStatus.", this.HealthStatus);
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}

