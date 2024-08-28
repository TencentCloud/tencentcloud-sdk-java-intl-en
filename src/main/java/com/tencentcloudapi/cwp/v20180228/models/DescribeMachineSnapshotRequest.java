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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachineSnapshotRequest extends AbstractModel {

    /**
    * CVM ID collection
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * Inquiry snapshot type: 0 - latest one; 1 - all
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Number of Pagination
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination step size
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get CVM ID collection 
     * @return Quuids CVM ID collection
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set CVM ID collection
     * @param Quuids CVM ID collection
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get Inquiry snapshot type: 0 - latest one; 1 - all 
     * @return Type Inquiry snapshot type: 0 - latest one; 1 - all
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Inquiry snapshot type: 0 - latest one; 1 - all
     * @param Type Inquiry snapshot type: 0 - latest one; 1 - all
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Number of Pagination 
     * @return Limit Number of Pagination
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of Pagination
     * @param Limit Number of Pagination
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination step size 
     * @return Offset Pagination step size
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination step size
     * @param Offset Pagination step size
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeMachineSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachineSnapshotRequest(DescribeMachineSnapshotRequest source) {
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
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
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

