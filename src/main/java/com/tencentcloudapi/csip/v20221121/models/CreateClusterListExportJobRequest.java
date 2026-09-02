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

public class CreateClusterListExportJobRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>List of Universal Filter Criteria. Supported filter fields:<br>ClusterId: CLUSTER ID, exact match.<br>ClusterName: CLUSTER name, fuzzy matching.<br>ClusterType: CLUSTER type, exact match. Values: TKE_MANAGED_CLUSTER (Tencent Cloud Standard CLUSTER), TKE_INDEPENDENT_CLUSTER (Standard CLUSTER Master SELF-maintenance), TKE_SERVERLESS_CLUSTER (SERVERLESS CLUSTER), TKE_EDGE_CLUSTER (EDGE CLUSTER), SELF_BUILT (SELF-BUILT within Tencent Cloud), SELF_BUILT_OTHER (non-Tencent Cloud SELF-BUILT/hybrid cloud).<br>RunStatus: CLUSTER Running status, exact match. Values: Running, Exception, Unknown.<br>AccessedStatus: access status, exact match. Values: AccessedNone (not integrated), AccessedInstalling (is being connected), AccessedException (access Exception), AccessedInstalled (integrated).<br>DefendStatus: protection status, exact match. Values: Enabled (defended), Partial (Partial protection), Disabled (no protection).<br>RiskStatus: risk check status, exact match.<br>RiskLevel: risk level, exact match. Values: CRITICAL, HIGH, MEDIUM, LOW, NONE (no risk).<br>HasHighRisk: only filter clusters with HIGH risk or higher. No value is required. Passing in HasHighRisk takes effect.<br>Region: Region, exact match.<br>OwnerName: owner, fuzzy matching.<br>ClusterAssetIds: CLUSTER asset ID, exact match.<br>ExcludeClusterAssetIds: excluded CLUSTER asset ID, exact exclusion.</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * <p>Exportable fields</p>
    */
    @SerializedName("ExportFields")
    @Expose
    private String [] ExportFields;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>List of Universal Filter Criteria. Supported filter fields:<br>ClusterId: CLUSTER ID, exact match.<br>ClusterName: CLUSTER name, fuzzy matching.<br>ClusterType: CLUSTER type, exact match. Values: TKE_MANAGED_CLUSTER (Tencent Cloud Standard CLUSTER), TKE_INDEPENDENT_CLUSTER (Standard CLUSTER Master SELF-maintenance), TKE_SERVERLESS_CLUSTER (SERVERLESS CLUSTER), TKE_EDGE_CLUSTER (EDGE CLUSTER), SELF_BUILT (SELF-BUILT within Tencent Cloud), SELF_BUILT_OTHER (non-Tencent Cloud SELF-BUILT/hybrid cloud).<br>RunStatus: CLUSTER Running status, exact match. Values: Running, Exception, Unknown.<br>AccessedStatus: access status, exact match. Values: AccessedNone (not integrated), AccessedInstalling (is being connected), AccessedException (access Exception), AccessedInstalled (integrated).<br>DefendStatus: protection status, exact match. Values: Enabled (defended), Partial (Partial protection), Disabled (no protection).<br>RiskStatus: risk check status, exact match.<br>RiskLevel: risk level, exact match. Values: CRITICAL, HIGH, MEDIUM, LOW, NONE (no risk).<br>HasHighRisk: only filter clusters with HIGH risk or higher. No value is required. Passing in HasHighRisk takes effect.<br>Region: Region, exact match.<br>OwnerName: owner, fuzzy matching.<br>ClusterAssetIds: CLUSTER asset ID, exact match.<br>ExcludeClusterAssetIds: excluded CLUSTER asset ID, exact exclusion.</p> 
     * @return Filter <p>List of Universal Filter Criteria. Supported filter fields:<br>ClusterId: CLUSTER ID, exact match.<br>ClusterName: CLUSTER name, fuzzy matching.<br>ClusterType: CLUSTER type, exact match. Values: TKE_MANAGED_CLUSTER (Tencent Cloud Standard CLUSTER), TKE_INDEPENDENT_CLUSTER (Standard CLUSTER Master SELF-maintenance), TKE_SERVERLESS_CLUSTER (SERVERLESS CLUSTER), TKE_EDGE_CLUSTER (EDGE CLUSTER), SELF_BUILT (SELF-BUILT within Tencent Cloud), SELF_BUILT_OTHER (non-Tencent Cloud SELF-BUILT/hybrid cloud).<br>RunStatus: CLUSTER Running status, exact match. Values: Running, Exception, Unknown.<br>AccessedStatus: access status, exact match. Values: AccessedNone (not integrated), AccessedInstalling (is being connected), AccessedException (access Exception), AccessedInstalled (integrated).<br>DefendStatus: protection status, exact match. Values: Enabled (defended), Partial (Partial protection), Disabled (no protection).<br>RiskStatus: risk check status, exact match.<br>RiskLevel: risk level, exact match. Values: CRITICAL, HIGH, MEDIUM, LOW, NONE (no risk).<br>HasHighRisk: only filter clusters with HIGH risk or higher. No value is required. Passing in HasHighRisk takes effect.<br>Region: Region, exact match.<br>OwnerName: owner, fuzzy matching.<br>ClusterAssetIds: CLUSTER asset ID, exact match.<br>ExcludeClusterAssetIds: excluded CLUSTER asset ID, exact exclusion.</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>List of Universal Filter Criteria. Supported filter fields:<br>ClusterId: CLUSTER ID, exact match.<br>ClusterName: CLUSTER name, fuzzy matching.<br>ClusterType: CLUSTER type, exact match. Values: TKE_MANAGED_CLUSTER (Tencent Cloud Standard CLUSTER), TKE_INDEPENDENT_CLUSTER (Standard CLUSTER Master SELF-maintenance), TKE_SERVERLESS_CLUSTER (SERVERLESS CLUSTER), TKE_EDGE_CLUSTER (EDGE CLUSTER), SELF_BUILT (SELF-BUILT within Tencent Cloud), SELF_BUILT_OTHER (non-Tencent Cloud SELF-BUILT/hybrid cloud).<br>RunStatus: CLUSTER Running status, exact match. Values: Running, Exception, Unknown.<br>AccessedStatus: access status, exact match. Values: AccessedNone (not integrated), AccessedInstalling (is being connected), AccessedException (access Exception), AccessedInstalled (integrated).<br>DefendStatus: protection status, exact match. Values: Enabled (defended), Partial (Partial protection), Disabled (no protection).<br>RiskStatus: risk check status, exact match.<br>RiskLevel: risk level, exact match. Values: CRITICAL, HIGH, MEDIUM, LOW, NONE (no risk).<br>HasHighRisk: only filter clusters with HIGH risk or higher. No value is required. Passing in HasHighRisk takes effect.<br>Region: Region, exact match.<br>OwnerName: owner, fuzzy matching.<br>ClusterAssetIds: CLUSTER asset ID, exact match.<br>ExcludeClusterAssetIds: excluded CLUSTER asset ID, exact exclusion.</p>
     * @param Filter <p>List of Universal Filter Criteria. Supported filter fields:<br>ClusterId: CLUSTER ID, exact match.<br>ClusterName: CLUSTER name, fuzzy matching.<br>ClusterType: CLUSTER type, exact match. Values: TKE_MANAGED_CLUSTER (Tencent Cloud Standard CLUSTER), TKE_INDEPENDENT_CLUSTER (Standard CLUSTER Master SELF-maintenance), TKE_SERVERLESS_CLUSTER (SERVERLESS CLUSTER), TKE_EDGE_CLUSTER (EDGE CLUSTER), SELF_BUILT (SELF-BUILT within Tencent Cloud), SELF_BUILT_OTHER (non-Tencent Cloud SELF-BUILT/hybrid cloud).<br>RunStatus: CLUSTER Running status, exact match. Values: Running, Exception, Unknown.<br>AccessedStatus: access status, exact match. Values: AccessedNone (not integrated), AccessedInstalling (is being connected), AccessedException (access Exception), AccessedInstalled (integrated).<br>DefendStatus: protection status, exact match. Values: Enabled (defended), Partial (Partial protection), Disabled (no protection).<br>RiskStatus: risk check status, exact match.<br>RiskLevel: risk level, exact match. Values: CRITICAL, HIGH, MEDIUM, LOW, NONE (no risk).<br>HasHighRisk: only filter clusters with HIGH risk or higher. No value is required. Passing in HasHighRisk takes effect.<br>Region: Region, exact match.<br>OwnerName: owner, fuzzy matching.<br>ClusterAssetIds: CLUSTER asset ID, exact match.<br>ExcludeClusterAssetIds: excluded CLUSTER asset ID, exact exclusion.</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>Exportable fields</p> 
     * @return ExportFields <p>Exportable fields</p>
     */
    public String [] getExportFields() {
        return this.ExportFields;
    }

    /**
     * Set <p>Exportable fields</p>
     * @param ExportFields <p>Exportable fields</p>
     */
    public void setExportFields(String [] ExportFields) {
        this.ExportFields = ExportFields;
    }

    public CreateClusterListExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterListExportJobRequest(CreateClusterListExportJobRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.ExportFields != null) {
            this.ExportFields = new String[source.ExportFields.length];
            for (int i = 0; i < source.ExportFields.length; i++) {
                this.ExportFields[i] = new String(source.ExportFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "ExportFields.", this.ExportFields);

    }
}

