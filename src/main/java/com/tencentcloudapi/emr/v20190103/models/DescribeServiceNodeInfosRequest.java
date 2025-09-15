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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServiceNodeInfosRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Page number.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Page size.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Searching fields.
    */
    @SerializedName("SearchText")
    @Expose
    private String SearchText;

    /**
    * Configuration status. -2: configuration failed; -1: configuration expired; 1: synchronized; -99: all.
    */
    @SerializedName("ConfStatus")
    @Expose
    private Long ConfStatus;

    /**
    * Filter criteria: Maintenance status

0 indicates all statuses.
1 indicates normal.
2 indicates the maintenance status.

    */
    @SerializedName("MaintainStateId")
    @Expose
    private Long MaintainStateId;

    /**
    * Filter criteria: Operation status

0 indicates all statuses.
1 indicates started.
2 indicates stopped.
    */
    @SerializedName("OperatorStateId")
    @Expose
    private Long OperatorStateId;

    /**
    * Filter criteria: health status.
0 indicates unavailable.
1 indicates good.
-2 indicates unknown.
-99 indicates all.
-3 indicates potential risks.
-4 indicates undetected.
    */
    @SerializedName("HealthStateId")
    @Expose
    private String HealthStateId;

    /**
    * Service component names (in all caps, for example, YARN).
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Node names: master, core, task, common, and router.
    */
    @SerializedName("NodeTypeName")
    @Expose
    private String NodeTypeName;

    /**
    * Filter criteria: whether DN is in the maintenance status.
0 indicates all statuses.
1 indicates the maintenance status.
    */
    @SerializedName("DataNodeMaintenanceId")
    @Expose
    private Long DataNodeMaintenanceId;

    /**
    * Searchable fields (currently supported SearchType: ipv4).
    */
    @SerializedName("SearchFields")
    @Expose
    private SearchItem [] SearchFields;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Page number. 
     * @return Offset Page number.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number.
     * @param Offset Page number.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Page size. 
     * @return Limit Page size.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page size.
     * @param Limit Page size.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Searching fields. 
     * @return SearchText Searching fields.
     */
    public String getSearchText() {
        return this.SearchText;
    }

    /**
     * Set Searching fields.
     * @param SearchText Searching fields.
     */
    public void setSearchText(String SearchText) {
        this.SearchText = SearchText;
    }

    /**
     * Get Configuration status. -2: configuration failed; -1: configuration expired; 1: synchronized; -99: all. 
     * @return ConfStatus Configuration status. -2: configuration failed; -1: configuration expired; 1: synchronized; -99: all.
     */
    public Long getConfStatus() {
        return this.ConfStatus;
    }

    /**
     * Set Configuration status. -2: configuration failed; -1: configuration expired; 1: synchronized; -99: all.
     * @param ConfStatus Configuration status. -2: configuration failed; -1: configuration expired; 1: synchronized; -99: all.
     */
    public void setConfStatus(Long ConfStatus) {
        this.ConfStatus = ConfStatus;
    }

    /**
     * Get Filter criteria: Maintenance status

0 indicates all statuses.
1 indicates normal.
2 indicates the maintenance status.
 
     * @return MaintainStateId Filter criteria: Maintenance status

0 indicates all statuses.
1 indicates normal.
2 indicates the maintenance status.

     */
    public Long getMaintainStateId() {
        return this.MaintainStateId;
    }

    /**
     * Set Filter criteria: Maintenance status

0 indicates all statuses.
1 indicates normal.
2 indicates the maintenance status.

     * @param MaintainStateId Filter criteria: Maintenance status

0 indicates all statuses.
1 indicates normal.
2 indicates the maintenance status.

     */
    public void setMaintainStateId(Long MaintainStateId) {
        this.MaintainStateId = MaintainStateId;
    }

    /**
     * Get Filter criteria: Operation status

0 indicates all statuses.
1 indicates started.
2 indicates stopped. 
     * @return OperatorStateId Filter criteria: Operation status

0 indicates all statuses.
1 indicates started.
2 indicates stopped.
     */
    public Long getOperatorStateId() {
        return this.OperatorStateId;
    }

    /**
     * Set Filter criteria: Operation status

0 indicates all statuses.
1 indicates started.
2 indicates stopped.
     * @param OperatorStateId Filter criteria: Operation status

0 indicates all statuses.
1 indicates started.
2 indicates stopped.
     */
    public void setOperatorStateId(Long OperatorStateId) {
        this.OperatorStateId = OperatorStateId;
    }

    /**
     * Get Filter criteria: health status.
0 indicates unavailable.
1 indicates good.
-2 indicates unknown.
-99 indicates all.
-3 indicates potential risks.
-4 indicates undetected. 
     * @return HealthStateId Filter criteria: health status.
0 indicates unavailable.
1 indicates good.
-2 indicates unknown.
-99 indicates all.
-3 indicates potential risks.
-4 indicates undetected.
     */
    public String getHealthStateId() {
        return this.HealthStateId;
    }

    /**
     * Set Filter criteria: health status.
0 indicates unavailable.
1 indicates good.
-2 indicates unknown.
-99 indicates all.
-3 indicates potential risks.
-4 indicates undetected.
     * @param HealthStateId Filter criteria: health status.
0 indicates unavailable.
1 indicates good.
-2 indicates unknown.
-99 indicates all.
-3 indicates potential risks.
-4 indicates undetected.
     */
    public void setHealthStateId(String HealthStateId) {
        this.HealthStateId = HealthStateId;
    }

    /**
     * Get Service component names (in all caps, for example, YARN). 
     * @return ServiceName Service component names (in all caps, for example, YARN).
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service component names (in all caps, for example, YARN).
     * @param ServiceName Service component names (in all caps, for example, YARN).
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Node names: master, core, task, common, and router. 
     * @return NodeTypeName Node names: master, core, task, common, and router.
     */
    public String getNodeTypeName() {
        return this.NodeTypeName;
    }

    /**
     * Set Node names: master, core, task, common, and router.
     * @param NodeTypeName Node names: master, core, task, common, and router.
     */
    public void setNodeTypeName(String NodeTypeName) {
        this.NodeTypeName = NodeTypeName;
    }

    /**
     * Get Filter criteria: whether DN is in the maintenance status.
0 indicates all statuses.
1 indicates the maintenance status. 
     * @return DataNodeMaintenanceId Filter criteria: whether DN is in the maintenance status.
0 indicates all statuses.
1 indicates the maintenance status.
     */
    public Long getDataNodeMaintenanceId() {
        return this.DataNodeMaintenanceId;
    }

    /**
     * Set Filter criteria: whether DN is in the maintenance status.
0 indicates all statuses.
1 indicates the maintenance status.
     * @param DataNodeMaintenanceId Filter criteria: whether DN is in the maintenance status.
0 indicates all statuses.
1 indicates the maintenance status.
     */
    public void setDataNodeMaintenanceId(Long DataNodeMaintenanceId) {
        this.DataNodeMaintenanceId = DataNodeMaintenanceId;
    }

    /**
     * Get Searchable fields (currently supported SearchType: ipv4). 
     * @return SearchFields Searchable fields (currently supported SearchType: ipv4).
     */
    public SearchItem [] getSearchFields() {
        return this.SearchFields;
    }

    /**
     * Set Searchable fields (currently supported SearchType: ipv4).
     * @param SearchFields Searchable fields (currently supported SearchType: ipv4).
     */
    public void setSearchFields(SearchItem [] SearchFields) {
        this.SearchFields = SearchFields;
    }

    public DescribeServiceNodeInfosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceNodeInfosRequest(DescribeServiceNodeInfosRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchText != null) {
            this.SearchText = new String(source.SearchText);
        }
        if (source.ConfStatus != null) {
            this.ConfStatus = new Long(source.ConfStatus);
        }
        if (source.MaintainStateId != null) {
            this.MaintainStateId = new Long(source.MaintainStateId);
        }
        if (source.OperatorStateId != null) {
            this.OperatorStateId = new Long(source.OperatorStateId);
        }
        if (source.HealthStateId != null) {
            this.HealthStateId = new String(source.HealthStateId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.NodeTypeName != null) {
            this.NodeTypeName = new String(source.NodeTypeName);
        }
        if (source.DataNodeMaintenanceId != null) {
            this.DataNodeMaintenanceId = new Long(source.DataNodeMaintenanceId);
        }
        if (source.SearchFields != null) {
            this.SearchFields = new SearchItem[source.SearchFields.length];
            for (int i = 0; i < source.SearchFields.length; i++) {
                this.SearchFields[i] = new SearchItem(source.SearchFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchText", this.SearchText);
        this.setParamSimple(map, prefix + "ConfStatus", this.ConfStatus);
        this.setParamSimple(map, prefix + "MaintainStateId", this.MaintainStateId);
        this.setParamSimple(map, prefix + "OperatorStateId", this.OperatorStateId);
        this.setParamSimple(map, prefix + "HealthStateId", this.HealthStateId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "NodeTypeName", this.NodeTypeName);
        this.setParamSimple(map, prefix + "DataNodeMaintenanceId", this.DataNodeMaintenanceId);
        this.setParamArrayObj(map, prefix + "SearchFields.", this.SearchFields);

    }
}

