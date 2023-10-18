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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusInstancesRequest extends AbstractModel {

    /**
    * Queries by instance ID or IDs. Instance ID is in the format of `prom-xxxxxxxx`. Up to 100 instances can be queried in one request.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Filter by instance status
<ul>
<li>1: Creating</li>
<li>2: Running</li>
<li>3: Abnormal</li>
<li>4: Rebooting</li>
<li>5: Terminating</li>
<li>6: Service suspended</li>
<li>8: Suspending service for overdue payment</li>
<li>9: Service suspended for overdue payment</li>
</ul>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long [] InstanceStatus;

    /**
    * Filter by instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Filter by AZ in the format of `ap-guangzhou-1`
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Filter by tag key-value pair. The `tag-key` should be replaced with a specific tag key.
    */
    @SerializedName("TagFilters")
    @Expose
    private PrometheusTag [] TagFilters;

    /**
    * Filter by instance IPv4 address
    */
    @SerializedName("IPv4Address")
    @Expose
    private String [] IPv4Address;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter by billing mode
<li>2: Monthly subscription</li>
<li>3: Pay-as-you-go</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private Long InstanceChargeType;

    /**
     * Get Queries by instance ID or IDs. Instance ID is in the format of `prom-xxxxxxxx`. Up to 100 instances can be queried in one request. 
     * @return InstanceIds Queries by instance ID or IDs. Instance ID is in the format of `prom-xxxxxxxx`. Up to 100 instances can be queried in one request.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Queries by instance ID or IDs. Instance ID is in the format of `prom-xxxxxxxx`. Up to 100 instances can be queried in one request.
     * @param InstanceIds Queries by instance ID or IDs. Instance ID is in the format of `prom-xxxxxxxx`. Up to 100 instances can be queried in one request.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Filter by instance status
<ul>
<li>1: Creating</li>
<li>2: Running</li>
<li>3: Abnormal</li>
<li>4: Rebooting</li>
<li>5: Terminating</li>
<li>6: Service suspended</li>
<li>8: Suspending service for overdue payment</li>
<li>9: Service suspended for overdue payment</li>
</ul> 
     * @return InstanceStatus Filter by instance status
<ul>
<li>1: Creating</li>
<li>2: Running</li>
<li>3: Abnormal</li>
<li>4: Rebooting</li>
<li>5: Terminating</li>
<li>6: Service suspended</li>
<li>8: Suspending service for overdue payment</li>
<li>9: Service suspended for overdue payment</li>
</ul>
     */
    public Long [] getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Filter by instance status
<ul>
<li>1: Creating</li>
<li>2: Running</li>
<li>3: Abnormal</li>
<li>4: Rebooting</li>
<li>5: Terminating</li>
<li>6: Service suspended</li>
<li>8: Suspending service for overdue payment</li>
<li>9: Service suspended for overdue payment</li>
</ul>
     * @param InstanceStatus Filter by instance status
<ul>
<li>1: Creating</li>
<li>2: Running</li>
<li>3: Abnormal</li>
<li>4: Rebooting</li>
<li>5: Terminating</li>
<li>6: Service suspended</li>
<li>8: Suspending service for overdue payment</li>
<li>9: Service suspended for overdue payment</li>
</ul>
     */
    public void setInstanceStatus(Long [] InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Filter by instance name 
     * @return InstanceName Filter by instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Filter by instance name
     * @param InstanceName Filter by instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Filter by AZ in the format of `ap-guangzhou-1` 
     * @return Zones Filter by AZ in the format of `ap-guangzhou-1`
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set Filter by AZ in the format of `ap-guangzhou-1`
     * @param Zones Filter by AZ in the format of `ap-guangzhou-1`
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Filter by tag key-value pair. The `tag-key` should be replaced with a specific tag key. 
     * @return TagFilters Filter by tag key-value pair. The `tag-key` should be replaced with a specific tag key.
     */
    public PrometheusTag [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set Filter by tag key-value pair. The `tag-key` should be replaced with a specific tag key.
     * @param TagFilters Filter by tag key-value pair. The `tag-key` should be replaced with a specific tag key.
     */
    public void setTagFilters(PrometheusTag [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get Filter by instance IPv4 address 
     * @return IPv4Address Filter by instance IPv4 address
     */
    public String [] getIPv4Address() {
        return this.IPv4Address;
    }

    /**
     * Set Filter by instance IPv4 address
     * @param IPv4Address Filter by instance IPv4 address
     */
    public void setIPv4Address(String [] IPv4Address) {
        this.IPv4Address = IPv4Address;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter by billing mode
<li>2: Monthly subscription</li>
<li>3: Pay-as-you-go</li> 
     * @return InstanceChargeType Filter by billing mode
<li>2: Monthly subscription</li>
<li>3: Pay-as-you-go</li>
     */
    public Long getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Filter by billing mode
<li>2: Monthly subscription</li>
<li>3: Pay-as-you-go</li>
     * @param InstanceChargeType Filter by billing mode
<li>2: Monthly subscription</li>
<li>3: Pay-as-you-go</li>
     */
    public void setInstanceChargeType(Long InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    public DescribePrometheusInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusInstancesRequest(DescribePrometheusInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long[source.InstanceStatus.length];
            for (int i = 0; i < source.InstanceStatus.length; i++) {
                this.InstanceStatus[i] = new Long(source.InstanceStatus[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.TagFilters != null) {
            this.TagFilters = new PrometheusTag[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new PrometheusTag(source.TagFilters[i]);
            }
        }
        if (source.IPv4Address != null) {
            this.IPv4Address = new String[source.IPv4Address.length];
            for (int i = 0; i < source.IPv4Address.length; i++) {
                this.IPv4Address[i] = new String(source.IPv4Address[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new Long(source.InstanceChargeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "InstanceStatus.", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamArraySimple(map, prefix + "IPv4Address.", this.IPv4Address);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);

    }
}

