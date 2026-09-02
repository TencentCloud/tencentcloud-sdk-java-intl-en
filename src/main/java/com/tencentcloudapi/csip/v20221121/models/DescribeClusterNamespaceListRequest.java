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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterNamespaceListRequest extends AbstractModel {

    /**
    * <p>Cluster asset id</p>
    */
    @SerializedName("ClusterAssetId")
    @Expose
    private String ClusterAssetId;

    /**
    * <p>Common filter criteria list. Supported filter fields:<br>Name: namespace name, fuzzy matching.<br>Label: tag, fuzzy matching (matches either the key or value of a tag; any match counts).</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * <p>Group account member id.</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Cluster ca certificate md5 value, unique identifier of the cluster</p>
    */
    @SerializedName("ClusterCaMD5")
    @Expose
    private String ClusterCaMD5;

    /**
     * Get <p>Cluster asset id</p> 
     * @return ClusterAssetId <p>Cluster asset id</p>
     * @deprecated
     */
    @Deprecated
    public String getClusterAssetId() {
        return this.ClusterAssetId;
    }

    /**
     * Set <p>Cluster asset id</p>
     * @param ClusterAssetId <p>Cluster asset id</p>
     * @deprecated
     */
    @Deprecated
    public void setClusterAssetId(String ClusterAssetId) {
        this.ClusterAssetId = ClusterAssetId;
    }

    /**
     * Get <p>Common filter criteria list. Supported filter fields:<br>Name: namespace name, fuzzy matching.<br>Label: tag, fuzzy matching (matches either the key or value of a tag; any match counts).</p> 
     * @return Filter <p>Common filter criteria list. Supported filter fields:<br>Name: namespace name, fuzzy matching.<br>Label: tag, fuzzy matching (matches either the key or value of a tag; any match counts).</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>Common filter criteria list. Supported filter fields:<br>Name: namespace name, fuzzy matching.<br>Label: tag, fuzzy matching (matches either the key or value of a tag; any match counts).</p>
     * @param Filter <p>Common filter criteria list. Supported filter fields:<br>Name: namespace name, fuzzy matching.<br>Label: tag, fuzzy matching (matches either the key or value of a tag; any match counts).</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>Group account member id.</p> 
     * @return MemberId <p>Group account member id.</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id.</p>
     * @param MemberId <p>Group account member id.</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Cluster ca certificate md5 value, unique identifier of the cluster</p> 
     * @return ClusterCaMD5 <p>Cluster ca certificate md5 value, unique identifier of the cluster</p>
     */
    public String getClusterCaMD5() {
        return this.ClusterCaMD5;
    }

    /**
     * Set <p>Cluster ca certificate md5 value, unique identifier of the cluster</p>
     * @param ClusterCaMD5 <p>Cluster ca certificate md5 value, unique identifier of the cluster</p>
     */
    public void setClusterCaMD5(String ClusterCaMD5) {
        this.ClusterCaMD5 = ClusterCaMD5;
    }

    public DescribeClusterNamespaceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterNamespaceListRequest(DescribeClusterNamespaceListRequest source) {
        if (source.ClusterAssetId != null) {
            this.ClusterAssetId = new String(source.ClusterAssetId);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.ClusterCaMD5 != null) {
            this.ClusterCaMD5 = new String(source.ClusterCaMD5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterAssetId", this.ClusterAssetId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "ClusterCaMD5", this.ClusterCaMD5);

    }
}

