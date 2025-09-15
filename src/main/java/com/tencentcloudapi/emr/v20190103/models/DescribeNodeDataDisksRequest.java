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

public class DescribeNodeDataDisksRequest extends AbstractModel {

    /**
    * ID of the EMR cluster instance.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ID list of node CVM instances.
    */
    @SerializedName("CvmInstanceIds")
    @Expose
    private String [] CvmInstanceIds;

    /**
    * Filter criteria for querying cloud disks.
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Fuzzy search.
    */
    @SerializedName("InnerSearch")
    @Expose
    private String InnerSearch;

    /**
    * Number of items returned per page. The default value is 100, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Data offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get ID of the EMR cluster instance. 
     * @return InstanceId ID of the EMR cluster instance.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the EMR cluster instance.
     * @param InstanceId ID of the EMR cluster instance.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ID list of node CVM instances. 
     * @return CvmInstanceIds ID list of node CVM instances.
     */
    public String [] getCvmInstanceIds() {
        return this.CvmInstanceIds;
    }

    /**
     * Set ID list of node CVM instances.
     * @param CvmInstanceIds ID list of node CVM instances.
     */
    public void setCvmInstanceIds(String [] CvmInstanceIds) {
        this.CvmInstanceIds = CvmInstanceIds;
    }

    /**
     * Get Filter criteria for querying cloud disks. 
     * @return Filters Filter criteria for querying cloud disks.
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria for querying cloud disks.
     * @param Filters Filter criteria for querying cloud disks.
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Fuzzy search. 
     * @return InnerSearch Fuzzy search.
     */
    public String getInnerSearch() {
        return this.InnerSearch;
    }

    /**
     * Set Fuzzy search.
     * @param InnerSearch Fuzzy search.
     */
    public void setInnerSearch(String InnerSearch) {
        this.InnerSearch = InnerSearch;
    }

    /**
     * Get Number of items returned per page. The default value is 100, and the maximum value is 100. 
     * @return Limit Number of items returned per page. The default value is 100, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items returned per page. The default value is 100, and the maximum value is 100.
     * @param Limit Number of items returned per page. The default value is 100, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Data offset. 
     * @return Offset Data offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset.
     * @param Offset Data offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeNodeDataDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNodeDataDisksRequest(DescribeNodeDataDisksRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CvmInstanceIds != null) {
            this.CvmInstanceIds = new String[source.CvmInstanceIds.length];
            for (int i = 0; i < source.CvmInstanceIds.length; i++) {
                this.CvmInstanceIds[i] = new String(source.CvmInstanceIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.InnerSearch != null) {
            this.InnerSearch = new String(source.InnerSearch);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "CvmInstanceIds.", this.CvmInstanceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "InnerSearch", this.InnerSearch);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

