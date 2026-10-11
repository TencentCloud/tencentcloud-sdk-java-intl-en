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

public class DescribeClusterNodesRequest extends AbstractModel {

    /**
    * Cluster ID, such as emr-xxxxxxxx.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Node identifier. Valid values:
<li>all: indicates retrieving all types of nodes, except CDB information.</li>
<li>master: indicates retrieving Master node information.</li>
<li>core: indicates retrieving Core node information.</li>
<li>task: indicates retrieving Task node information.</li>
<li>common: indicates retrieving Common node information.</li>
<li>router: indicates retrieving Router node information.</li>
<li>db: indicates retrieving CDB information in the normal status.</li>
<li>recyle: indicates retrieving information of nodes isolated in the recycle bin, including CDB information.</li>
<li>renew: indicates retrieving information of all nodes pending renewal, including CDB information. Auto-renewed nodes will not be returned.</li>
Note: Only the values above are supported currently. Entering other values will result in an error.
    */
    @SerializedName("NodeFlag")
    @Expose
    private String NodeFlag;

    /**
    * Whether to carry CDB information when all node information is exported in CSV format.
    */
    @SerializedName("ExportDb")
    @Expose
    private Boolean ExportDb;

    /**
    * Page number. The default value is 0, indicating the first page.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items returned per page. Default value: 100. Maximum value: 100.
If both offset and limit are not set, or both are set to 0, all data will be returned.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Resource type. Valid values: all (default), host, and pod.
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
    * Searchable fields.
    */
    @SerializedName("SearchFields")
    @Expose
    private SearchItem [] SearchFields;

    /**
    * Sorting field.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Whether to sort data in ascending order. Valid values: 1 (yes) and 0 (no).
    */
    @SerializedName("Asc")
    @Expose
    private Long Asc;

    /**
     * Get Cluster ID, such as emr-xxxxxxxx. 
     * @return InstanceId Cluster ID, such as emr-xxxxxxxx.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID, such as emr-xxxxxxxx.
     * @param InstanceId Cluster ID, such as emr-xxxxxxxx.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Node identifier. Valid values:
<li>all: indicates retrieving all types of nodes, except CDB information.</li>
<li>master: indicates retrieving Master node information.</li>
<li>core: indicates retrieving Core node information.</li>
<li>task: indicates retrieving Task node information.</li>
<li>common: indicates retrieving Common node information.</li>
<li>router: indicates retrieving Router node information.</li>
<li>db: indicates retrieving CDB information in the normal status.</li>
<li>recyle: indicates retrieving information of nodes isolated in the recycle bin, including CDB information.</li>
<li>renew: indicates retrieving information of all nodes pending renewal, including CDB information. Auto-renewed nodes will not be returned.</li>
Note: Only the values above are supported currently. Entering other values will result in an error. 
     * @return NodeFlag Node identifier. Valid values:
<li>all: indicates retrieving all types of nodes, except CDB information.</li>
<li>master: indicates retrieving Master node information.</li>
<li>core: indicates retrieving Core node information.</li>
<li>task: indicates retrieving Task node information.</li>
<li>common: indicates retrieving Common node information.</li>
<li>router: indicates retrieving Router node information.</li>
<li>db: indicates retrieving CDB information in the normal status.</li>
<li>recyle: indicates retrieving information of nodes isolated in the recycle bin, including CDB information.</li>
<li>renew: indicates retrieving information of all nodes pending renewal, including CDB information. Auto-renewed nodes will not be returned.</li>
Note: Only the values above are supported currently. Entering other values will result in an error.
     */
    public String getNodeFlag() {
        return this.NodeFlag;
    }

    /**
     * Set Node identifier. Valid values:
<li>all: indicates retrieving all types of nodes, except CDB information.</li>
<li>master: indicates retrieving Master node information.</li>
<li>core: indicates retrieving Core node information.</li>
<li>task: indicates retrieving Task node information.</li>
<li>common: indicates retrieving Common node information.</li>
<li>router: indicates retrieving Router node information.</li>
<li>db: indicates retrieving CDB information in the normal status.</li>
<li>recyle: indicates retrieving information of nodes isolated in the recycle bin, including CDB information.</li>
<li>renew: indicates retrieving information of all nodes pending renewal, including CDB information. Auto-renewed nodes will not be returned.</li>
Note: Only the values above are supported currently. Entering other values will result in an error.
     * @param NodeFlag Node identifier. Valid values:
<li>all: indicates retrieving all types of nodes, except CDB information.</li>
<li>master: indicates retrieving Master node information.</li>
<li>core: indicates retrieving Core node information.</li>
<li>task: indicates retrieving Task node information.</li>
<li>common: indicates retrieving Common node information.</li>
<li>router: indicates retrieving Router node information.</li>
<li>db: indicates retrieving CDB information in the normal status.</li>
<li>recyle: indicates retrieving information of nodes isolated in the recycle bin, including CDB information.</li>
<li>renew: indicates retrieving information of all nodes pending renewal, including CDB information. Auto-renewed nodes will not be returned.</li>
Note: Only the values above are supported currently. Entering other values will result in an error.
     */
    public void setNodeFlag(String NodeFlag) {
        this.NodeFlag = NodeFlag;
    }

    /**
     * Get Whether to carry CDB information when all node information is exported in CSV format. 
     * @return ExportDb Whether to carry CDB information when all node information is exported in CSV format.
     */
    public Boolean getExportDb() {
        return this.ExportDb;
    }

    /**
     * Set Whether to carry CDB information when all node information is exported in CSV format.
     * @param ExportDb Whether to carry CDB information when all node information is exported in CSV format.
     */
    public void setExportDb(Boolean ExportDb) {
        this.ExportDb = ExportDb;
    }

    /**
     * Get Page number. The default value is 0, indicating the first page. 
     * @return Offset Page number. The default value is 0, indicating the first page.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number. The default value is 0, indicating the first page.
     * @param Offset Page number. The default value is 0, indicating the first page.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of items returned per page. Default value: 100. Maximum value: 100.
If both offset and limit are not set, or both are set to 0, all data will be returned. 
     * @return Limit Number of items returned per page. Default value: 100. Maximum value: 100.
If both offset and limit are not set, or both are set to 0, all data will be returned.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items returned per page. Default value: 100. Maximum value: 100.
If both offset and limit are not set, or both are set to 0, all data will be returned.
     * @param Limit Number of items returned per page. Default value: 100. Maximum value: 100.
If both offset and limit are not set, or both are set to 0, all data will be returned.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Resource type. Valid values: all (default), host, and pod. 
     * @return HardwareResourceType Resource type. Valid values: all (default), host, and pod.
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set Resource type. Valid values: all (default), host, and pod.
     * @param HardwareResourceType Resource type. Valid values: all (default), host, and pod.
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    /**
     * Get Searchable fields. 
     * @return SearchFields Searchable fields.
     */
    public SearchItem [] getSearchFields() {
        return this.SearchFields;
    }

    /**
     * Set Searchable fields.
     * @param SearchFields Searchable fields.
     */
    public void setSearchFields(SearchItem [] SearchFields) {
        this.SearchFields = SearchFields;
    }

    /**
     * Get Sorting field. 
     * @return OrderField Sorting field.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Sorting field.
     * @param OrderField Sorting field.
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Whether to sort data in ascending order. Valid values: 1 (yes) and 0 (no). 
     * @return Asc Whether to sort data in ascending order. Valid values: 1 (yes) and 0 (no).
     */
    public Long getAsc() {
        return this.Asc;
    }

    /**
     * Set Whether to sort data in ascending order. Valid values: 1 (yes) and 0 (no).
     * @param Asc Whether to sort data in ascending order. Valid values: 1 (yes) and 0 (no).
     */
    public void setAsc(Long Asc) {
        this.Asc = Asc;
    }

    public DescribeClusterNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterNodesRequest(DescribeClusterNodesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeFlag != null) {
            this.NodeFlag = new String(source.NodeFlag);
        }
        if (source.ExportDb != null) {
            this.ExportDb = new Boolean(source.ExportDb);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.HardwareResourceType != null) {
            this.HardwareResourceType = new String(source.HardwareResourceType);
        }
        if (source.SearchFields != null) {
            this.SearchFields = new SearchItem[source.SearchFields.length];
            for (int i = 0; i < source.SearchFields.length; i++) {
                this.SearchFields[i] = new SearchItem(source.SearchFields[i]);
            }
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Asc != null) {
            this.Asc = new Long(source.Asc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NodeFlag", this.NodeFlag);
        this.setParamSimple(map, prefix + "ExportDb", this.ExportDb);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "HardwareResourceType", this.HardwareResourceType);
        this.setParamArrayObj(map, prefix + "SearchFields.", this.SearchFields);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Asc", this.Asc);

    }
}

