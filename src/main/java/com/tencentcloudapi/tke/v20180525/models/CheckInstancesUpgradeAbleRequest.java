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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckInstancesUpgradeAbleRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Specify the node list to check. If it’s not passed in, all nodes of the cluster will be checked.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Upgrade type, enum values: reset (Reinstallation and Upgrade, supports major and minor versions), hot (In-place Rolling Minor Version Upgrade), major (In-place Rolling Major Version Upgrade).
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filtering
    */
    @SerializedName("Filter")
    @Expose
    private Filter [] Filter;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Specify the node list to check. If it’s not passed in, all nodes of the cluster will be checked. 
     * @return InstanceIds Specify the node list to check. If it’s not passed in, all nodes of the cluster will be checked.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Specify the node list to check. If it’s not passed in, all nodes of the cluster will be checked.
     * @param InstanceIds Specify the node list to check. If it’s not passed in, all nodes of the cluster will be checked.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Upgrade type, enum values: reset (Reinstallation and Upgrade, supports major and minor versions), hot (In-place Rolling Minor Version Upgrade), major (In-place Rolling Major Version Upgrade). 
     * @return UpgradeType Upgrade type, enum values: reset (Reinstallation and Upgrade, supports major and minor versions), hot (In-place Rolling Minor Version Upgrade), major (In-place Rolling Major Version Upgrade).
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set Upgrade type, enum values: reset (Reinstallation and Upgrade, supports major and minor versions), hot (In-place Rolling Minor Version Upgrade), major (In-place Rolling Major Version Upgrade).
     * @param UpgradeType Upgrade type, enum values: reset (Reinstallation and Upgrade, supports major and minor versions), hot (In-place Rolling Minor Version Upgrade), major (In-place Rolling Major Version Upgrade).
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination limit 
     * @return Limit Pagination limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination limit
     * @param Limit Pagination limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filtering 
     * @return Filter Filtering
     */
    public Filter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set Filtering
     * @param Filter Filtering
     */
    public void setFilter(Filter [] Filter) {
        this.Filter = Filter;
    }

    public CheckInstancesUpgradeAbleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckInstancesUpgradeAbleRequest(CheckInstancesUpgradeAbleRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filter != null) {
            this.Filter = new Filter[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new Filter(source.Filter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);

    }
}

