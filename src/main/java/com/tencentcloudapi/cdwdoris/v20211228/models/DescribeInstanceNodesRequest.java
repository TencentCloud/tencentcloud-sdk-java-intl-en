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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceNodesRequest extends AbstractModel {

    /**
    * Cluster instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Cluster role type, defaulted as "data node".
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * Pagination parameters. The first page is 0, and the second page is 10.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination parameters. The pagination step length is 10 by default.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Display policy, and all items are displayed when All is selected.
    */
    @SerializedName("DisplayPolicy")
    @Expose
    private String DisplayPolicy;

    /**
     * Get Cluster instance ID 
     * @return InstanceId Cluster instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster instance ID
     * @param InstanceId Cluster instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Cluster role type, defaulted as "data node". 
     * @return NodeRole Cluster role type, defaulted as "data node".
     */
    public String getNodeRole() {
        return this.NodeRole;
    }

    /**
     * Set Cluster role type, defaulted as "data node".
     * @param NodeRole Cluster role type, defaulted as "data node".
     */
    public void setNodeRole(String NodeRole) {
        this.NodeRole = NodeRole;
    }

    /**
     * Get Pagination parameters. The first page is 0, and the second page is 10. 
     * @return Offset Pagination parameters. The first page is 0, and the second page is 10.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameters. The first page is 0, and the second page is 10.
     * @param Offset Pagination parameters. The first page is 0, and the second page is 10.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination parameters. The pagination step length is 10 by default. 
     * @return Limit Pagination parameters. The pagination step length is 10 by default.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameters. The pagination step length is 10 by default.
     * @param Limit Pagination parameters. The pagination step length is 10 by default.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Display policy, and all items are displayed when All is selected. 
     * @return DisplayPolicy Display policy, and all items are displayed when All is selected.
     */
    public String getDisplayPolicy() {
        return this.DisplayPolicy;
    }

    /**
     * Set Display policy, and all items are displayed when All is selected.
     * @param DisplayPolicy Display policy, and all items are displayed when All is selected.
     */
    public void setDisplayPolicy(String DisplayPolicy) {
        this.DisplayPolicy = DisplayPolicy;
    }

    public DescribeInstanceNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceNodesRequest(DescribeInstanceNodesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeRole != null) {
            this.NodeRole = new String(source.NodeRole);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DisplayPolicy != null) {
            this.DisplayPolicy = new String(source.DisplayPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DisplayPolicy", this.DisplayPolicy);

    }
}

