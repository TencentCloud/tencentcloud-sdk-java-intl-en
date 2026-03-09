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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineageNodeInfo extends AbstractModel {

    /**
    * Current resource.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resource")
    @Expose
    private LineageResource Resource;

    /**
    * Relationship.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Relation")
    @Expose
    private LineageRelation Relation;

    /**
    * Upstream quantity.
    */
    @SerializedName("DownStreamCount")
    @Expose
    private Long DownStreamCount;

    /**
    * Downstream quantity.
    */
    @SerializedName("UpStreamCount")
    @Expose
    private Long UpStreamCount;

    /**
     * Get Current resource.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Resource Current resource.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LineageResource getResource() {
        return this.Resource;
    }

    /**
     * Set Current resource.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Resource Current resource.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResource(LineageResource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Relationship.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Relation Relationship.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LineageRelation getRelation() {
        return this.Relation;
    }

    /**
     * Set Relationship.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Relation Relationship.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRelation(LineageRelation Relation) {
        this.Relation = Relation;
    }

    /**
     * Get Upstream quantity. 
     * @return DownStreamCount Upstream quantity.
     */
    public Long getDownStreamCount() {
        return this.DownStreamCount;
    }

    /**
     * Set Upstream quantity.
     * @param DownStreamCount Upstream quantity.
     */
    public void setDownStreamCount(Long DownStreamCount) {
        this.DownStreamCount = DownStreamCount;
    }

    /**
     * Get Downstream quantity. 
     * @return UpStreamCount Downstream quantity.
     */
    public Long getUpStreamCount() {
        return this.UpStreamCount;
    }

    /**
     * Set Downstream quantity.
     * @param UpStreamCount Downstream quantity.
     */
    public void setUpStreamCount(Long UpStreamCount) {
        this.UpStreamCount = UpStreamCount;
    }

    public LineageNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineageNodeInfo(LineageNodeInfo source) {
        if (source.Resource != null) {
            this.Resource = new LineageResource(source.Resource);
        }
        if (source.Relation != null) {
            this.Relation = new LineageRelation(source.Relation);
        }
        if (source.DownStreamCount != null) {
            this.DownStreamCount = new Long(source.DownStreamCount);
        }
        if (source.UpStreamCount != null) {
            this.UpStreamCount = new Long(source.UpStreamCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamObj(map, prefix + "Relation.", this.Relation);
        this.setParamSimple(map, prefix + "DownStreamCount", this.DownStreamCount);
        this.setParamSimple(map, prefix + "UpStreamCount", this.UpStreamCount);

    }
}

