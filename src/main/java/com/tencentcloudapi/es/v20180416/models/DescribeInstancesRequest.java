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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel{

    /**
    * AZ of the cluster instance. If this is not passed in, all AZs are used by default
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * List of cluster instance IDs
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * List of cluster instance names
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * Pagination start value. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sort by field <li>1: instance ID </li><li>2: instance name </li><li>3: AZ </li><li>4: creation time </li>If `orderKey` is not passed in, sort by creation time in descending order
    */
    @SerializedName("OrderByKey")
    @Expose
    private Long OrderByKey;

    /**
    * Sorting order <li>0: ascending </li><li>1: descending </li>If orderByKey is passed in but orderByType is not, ascending order is used by default
    */
    @SerializedName("OrderByType")
    @Expose
    private Long OrderByType;

    /**
    * Node tag information list
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * VPC VIP list
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * List of availability zones
    */
    @SerializedName("ZoneList")
    @Expose
    private String [] ZoneList;

    /**
    * Health status filter list
    */
    @SerializedName("HealthStatus")
    @Expose
    private Long [] HealthStatus;

    /**
     * Get AZ of the cluster instance. If this is not passed in, all AZs are used by default 
     * @return Zone AZ of the cluster instance. If this is not passed in, all AZs are used by default
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ of the cluster instance. If this is not passed in, all AZs are used by default
     * @param Zone AZ of the cluster instance. If this is not passed in, all AZs are used by default
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get List of cluster instance IDs 
     * @return InstanceIds List of cluster instance IDs
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set List of cluster instance IDs
     * @param InstanceIds List of cluster instance IDs
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get List of cluster instance names 
     * @return InstanceNames List of cluster instance names
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set List of cluster instance names
     * @param InstanceNames List of cluster instance names
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get Pagination start value. Default value: 0 
     * @return Offset Pagination start value. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination start value. Default value: 0
     * @param Offset Pagination start value. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page. Default value: 20 
     * @return Limit Number of entries per page. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Default value: 20
     * @param Limit Number of entries per page. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sort by field <li>1: instance ID </li><li>2: instance name </li><li>3: AZ </li><li>4: creation time </li>If `orderKey` is not passed in, sort by creation time in descending order 
     * @return OrderByKey Sort by field <li>1: instance ID </li><li>2: instance name </li><li>3: AZ </li><li>4: creation time </li>If `orderKey` is not passed in, sort by creation time in descending order
     */
    public Long getOrderByKey() {
        return this.OrderByKey;
    }

    /**
     * Set Sort by field <li>1: instance ID </li><li>2: instance name </li><li>3: AZ </li><li>4: creation time </li>If `orderKey` is not passed in, sort by creation time in descending order
     * @param OrderByKey Sort by field <li>1: instance ID </li><li>2: instance name </li><li>3: AZ </li><li>4: creation time </li>If `orderKey` is not passed in, sort by creation time in descending order
     */
    public void setOrderByKey(Long OrderByKey) {
        this.OrderByKey = OrderByKey;
    }

    /**
     * Get Sorting order <li>0: ascending </li><li>1: descending </li>If orderByKey is passed in but orderByType is not, ascending order is used by default 
     * @return OrderByType Sorting order <li>0: ascending </li><li>1: descending </li>If orderByKey is passed in but orderByType is not, ascending order is used by default
     */
    public Long getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting order <li>0: ascending </li><li>1: descending </li>If orderByKey is passed in but orderByType is not, ascending order is used by default
     * @param OrderByType Sorting order <li>0: ascending </li><li>1: descending </li>If orderByKey is passed in but orderByType is not, ascending order is used by default
     */
    public void setOrderByType(Long OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Node tag information list 
     * @return TagList Node tag information list
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set Node tag information list
     * @param TagList Node tag information list
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get VPC VIP list 
     * @return IpList VPC VIP list
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set VPC VIP list
     * @param IpList VPC VIP list
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get List of availability zones 
     * @return ZoneList List of availability zones
     */
    public String [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set List of availability zones
     * @param ZoneList List of availability zones
     */
    public void setZoneList(String [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get Health status filter list 
     * @return HealthStatus Health status filter list
     */
    public Long [] getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set Health status filter list
     * @param HealthStatus Health status filter list
     */
    public void setHealthStatus(Long [] HealthStatus) {
        this.HealthStatus = HealthStatus;
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
        this.setParamArraySimple(map, prefix + "ZoneList.", this.ZoneList);
        this.setParamArraySimple(map, prefix + "HealthStatus.", this.HealthStatus);

    }
}

