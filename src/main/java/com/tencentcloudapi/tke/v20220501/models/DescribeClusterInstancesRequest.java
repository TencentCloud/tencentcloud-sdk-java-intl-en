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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterInstancesRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Offset. Default value: 0. For more information on Offset, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20, maximum value: 100. For more information on Limit, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria list:
InstanceIds (Instance ID), InstanceType (Instance type: Regular, Native, Virtual, External), VagueIpAddress (Fuzzy matching IP), Labels (k8s node label), NodePoolNames (Node pool name), VagueInstanceName (Fuzzy matching node name), InstanceStates (Node status), Unschedulable (Cordoning status), NodePoolIds (Node pool ID)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sorting information
    */
    @SerializedName("SortBy")
    @Expose
    private SortBy SortBy;

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
     * Get Offset. Default value: 0. For more information on Offset, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Offset Offset. Default value: 0. For more information on Offset, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0. For more information on Offset, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Offset Offset. Default value: 0. For more information on Offset, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20, maximum value: 100. For more information on Limit, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Limit Number of returned results. Default value: 20, maximum value: 100. For more information on Limit, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20, maximum value: 100. For more information on Limit, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Limit Number of returned results. Default value: 20, maximum value: 100. For more information on Limit, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria list:
InstanceIds (Instance ID), InstanceType (Instance type: Regular, Native, Virtual, External), VagueIpAddress (Fuzzy matching IP), Labels (k8s node label), NodePoolNames (Node pool name), VagueInstanceName (Fuzzy matching node name), InstanceStates (Node status), Unschedulable (Cordoning status), NodePoolIds (Node pool ID) 
     * @return Filters Filter criteria list:
InstanceIds (Instance ID), InstanceType (Instance type: Regular, Native, Virtual, External), VagueIpAddress (Fuzzy matching IP), Labels (k8s node label), NodePoolNames (Node pool name), VagueInstanceName (Fuzzy matching node name), InstanceStates (Node status), Unschedulable (Cordoning status), NodePoolIds (Node pool ID)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria list:
InstanceIds (Instance ID), InstanceType (Instance type: Regular, Native, Virtual, External), VagueIpAddress (Fuzzy matching IP), Labels (k8s node label), NodePoolNames (Node pool name), VagueInstanceName (Fuzzy matching node name), InstanceStates (Node status), Unschedulable (Cordoning status), NodePoolIds (Node pool ID)
     * @param Filters Filter criteria list:
InstanceIds (Instance ID), InstanceType (Instance type: Regular, Native, Virtual, External), VagueIpAddress (Fuzzy matching IP), Labels (k8s node label), NodePoolNames (Node pool name), VagueInstanceName (Fuzzy matching node name), InstanceStates (Node status), Unschedulable (Cordoning status), NodePoolIds (Node pool ID)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting information 
     * @return SortBy Sorting information
     */
    public SortBy getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sorting information
     * @param SortBy Sorting information
     */
    public void setSortBy(SortBy SortBy) {
        this.SortBy = SortBy;
    }

    public DescribeClusterInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterInstancesRequest(DescribeClusterInstancesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SortBy != null) {
            this.SortBy = new SortBy(source.SortBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "SortBy.", this.SortBy);

    }
}

