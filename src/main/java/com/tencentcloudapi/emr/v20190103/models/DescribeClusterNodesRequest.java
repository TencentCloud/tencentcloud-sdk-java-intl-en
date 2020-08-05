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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterNodesRequest extends AbstractModel{

    /**
    * Cluster instance ID in the format of emr-xxxxxxxx
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Node flag. Valid values:
<li>all: gets the information of nodes in all types except TencentDB information.</li>
<li>master: gets master node information.</li>
<li>core: gets core node information.</li>
<li>task: gets task node information.</li>
<li>common: gets common node information.</li>
<li>router: gets router node information.</li>
<li>db: gets TencentDB information in normal status.</li>
Note: only the above values are supported for the time being. Entering other values will cause errors.
    */
    @SerializedName("NodeFlag")
    @Expose
    private String NodeFlag;

    /**
    * Page number. Default value: 0, indicating the first page.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results per page. Default value: 100. Maximum value: 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
    * 
    */
    @SerializedName("SearchFields")
    @Expose
    private SearchItem [] SearchFields;

    /**
     * Get Cluster instance ID in the format of emr-xxxxxxxx 
     * @return InstanceId Cluster instance ID in the format of emr-xxxxxxxx
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster instance ID in the format of emr-xxxxxxxx
     * @param InstanceId Cluster instance ID in the format of emr-xxxxxxxx
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Node flag. Valid values:
<li>all: gets the information of nodes in all types except TencentDB information.</li>
<li>master: gets master node information.</li>
<li>core: gets core node information.</li>
<li>task: gets task node information.</li>
<li>common: gets common node information.</li>
<li>router: gets router node information.</li>
<li>db: gets TencentDB information in normal status.</li>
Note: only the above values are supported for the time being. Entering other values will cause errors. 
     * @return NodeFlag Node flag. Valid values:
<li>all: gets the information of nodes in all types except TencentDB information.</li>
<li>master: gets master node information.</li>
<li>core: gets core node information.</li>
<li>task: gets task node information.</li>
<li>common: gets common node information.</li>
<li>router: gets router node information.</li>
<li>db: gets TencentDB information in normal status.</li>
Note: only the above values are supported for the time being. Entering other values will cause errors.
     */
    public String getNodeFlag() {
        return this.NodeFlag;
    }

    /**
     * Set Node flag. Valid values:
<li>all: gets the information of nodes in all types except TencentDB information.</li>
<li>master: gets master node information.</li>
<li>core: gets core node information.</li>
<li>task: gets task node information.</li>
<li>common: gets common node information.</li>
<li>router: gets router node information.</li>
<li>db: gets TencentDB information in normal status.</li>
Note: only the above values are supported for the time being. Entering other values will cause errors.
     * @param NodeFlag Node flag. Valid values:
<li>all: gets the information of nodes in all types except TencentDB information.</li>
<li>master: gets master node information.</li>
<li>core: gets core node information.</li>
<li>task: gets task node information.</li>
<li>common: gets common node information.</li>
<li>router: gets router node information.</li>
<li>db: gets TencentDB information in normal status.</li>
Note: only the above values are supported for the time being. Entering other values will cause errors.
     */
    public void setNodeFlag(String NodeFlag) {
        this.NodeFlag = NodeFlag;
    }

    /**
     * Get Page number. Default value: 0, indicating the first page. 
     * @return Offset Page number. Default value: 0, indicating the first page.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number. Default value: 0, indicating the first page.
     * @param Offset Page number. Default value: 0, indicating the first page.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results per page. Default value: 100. Maximum value: 100 
     * @return Limit Number of returned results per page. Default value: 100. Maximum value: 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results per page. Default value: 100. Maximum value: 100
     * @param Limit Number of returned results per page. Default value: 100. Maximum value: 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get  
     * @return HardwareResourceType 
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set 
     * @param HardwareResourceType 
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    /**
     * Get  
     * @return SearchFields 
     */
    public SearchItem [] getSearchFields() {
        return this.SearchFields;
    }

    /**
     * Set 
     * @param SearchFields 
     */
    public void setSearchFields(SearchItem [] SearchFields) {
        this.SearchFields = SearchFields;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NodeFlag", this.NodeFlag);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "HardwareResourceType", this.HardwareResourceType);
        this.setParamArrayObj(map, prefix + "SearchFields.", this.SearchFields);

    }
}

