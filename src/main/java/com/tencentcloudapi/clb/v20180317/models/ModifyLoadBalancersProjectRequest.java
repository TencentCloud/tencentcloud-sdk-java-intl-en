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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoadBalancersProjectRequest extends AbstractModel {

    /**
    * One or more load balancing instance ids to be operated. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) API to query the ids.
Specifies the maximum length supported by the list is 20.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * Project ID. You can obtain it through the [DescribeProject](https://intl.cloud.tencent.com/document/api/651/78725?from_cn_redirect=1) API.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get One or more load balancing instance ids to be operated. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) API to query the ids.
Specifies the maximum length supported by the list is 20. 
     * @return LoadBalancerIds One or more load balancing instance ids to be operated. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) API to query the ids.
Specifies the maximum length supported by the list is 20.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set One or more load balancing instance ids to be operated. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) API to query the ids.
Specifies the maximum length supported by the list is 20.
     * @param LoadBalancerIds One or more load balancing instance ids to be operated. you can call the [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1) API to query the ids.
Specifies the maximum length supported by the list is 20.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get Project ID. You can obtain it through the [DescribeProject](https://intl.cloud.tencent.com/document/api/651/78725?from_cn_redirect=1) API. 
     * @return ProjectId Project ID. You can obtain it through the [DescribeProject](https://intl.cloud.tencent.com/document/api/651/78725?from_cn_redirect=1) API.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. You can obtain it through the [DescribeProject](https://intl.cloud.tencent.com/document/api/651/78725?from_cn_redirect=1) API.
     * @param ProjectId Project ID. You can obtain it through the [DescribeProject](https://intl.cloud.tencent.com/document/api/651/78725?from_cn_redirect=1) API.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    public ModifyLoadBalancersProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoadBalancersProjectRequest(ModifyLoadBalancersProjectRequest source) {
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

