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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGrafanaInstancesRequest extends AbstractModel{

    /**
    * Offset for query
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items to be queried
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Array of instance IDs
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Instance name, which supports fuzzy search by prefix.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Query status
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long [] InstanceStatus;

    /**
    * Array of tag filters
    */
    @SerializedName("TagFilters")
    @Expose
    private PrometheusTag [] TagFilters;

    /**
     * Get Offset for query 
     * @return Offset Offset for query
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset for query
     * @param Offset Offset for query
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of items to be queried 
     * @return Limit Number of items to be queried
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items to be queried
     * @param Limit Number of items to be queried
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Array of instance IDs 
     * @return InstanceIds Array of instance IDs
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Array of instance IDs
     * @param InstanceIds Array of instance IDs
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Instance name, which supports fuzzy search by prefix. 
     * @return InstanceName Instance name, which supports fuzzy search by prefix.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name, which supports fuzzy search by prefix.
     * @param InstanceName Instance name, which supports fuzzy search by prefix.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Query status 
     * @return InstanceStatus Query status
     */
    public Long [] getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Query status
     * @param InstanceStatus Query status
     */
    public void setInstanceStatus(Long [] InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Array of tag filters 
     * @return TagFilters Array of tag filters
     */
    public PrometheusTag [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set Array of tag filters
     * @param TagFilters Array of tag filters
     */
    public void setTagFilters(PrometheusTag [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeGrafanaInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGrafanaInstancesRequest(DescribeGrafanaInstancesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long[source.InstanceStatus.length];
            for (int i = 0; i < source.InstanceStatus.length; i++) {
                this.InstanceStatus[i] = new Long(source.InstanceStatus[i]);
            }
        }
        if (source.TagFilters != null) {
            this.TagFilters = new PrometheusTag[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new PrometheusTag(source.TagFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "InstanceStatus.", this.InstanceStatus);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

