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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBParamsRequest extends AbstractModel {

    /**
    * cn/dn
    */
    @SerializedName("NodeTypes")
    @Expose
    private String [] NodeTypes;

    /**
    * Limit.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * InstanceId.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get cn/dn 
     * @return NodeTypes cn/dn
     */
    public String [] getNodeTypes() {
        return this.NodeTypes;
    }

    /**
     * Set cn/dn
     * @param NodeTypes cn/dn
     */
    public void setNodeTypes(String [] NodeTypes) {
        this.NodeTypes = NodeTypes;
    }

    /**
     * Get Limit. 
     * @return Limit Limit.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit.
     * @param Limit Limit.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get InstanceId. 
     * @return InstanceId InstanceId.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set InstanceId.
     * @param InstanceId InstanceId.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DescribeDBParamsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBParamsRequest(DescribeDBParamsRequest source) {
        if (source.NodeTypes != null) {
            this.NodeTypes = new String[source.NodeTypes.length];
            for (int i = 0; i < source.NodeTypes.length; i++) {
                this.NodeTypes[i] = new String(source.NodeTypes[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NodeTypes.", this.NodeTypes);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

