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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQNamespacesRequest extends AbstractModel{

    /**
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The max number of returned results.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Search by name.
    */
    @SerializedName("NameKeyword")
    @Expose
    private String NameKeyword;

    /**
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
     * Get The max number of returned results. 
     * @return Limit The max number of returned results.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The max number of returned results.
     * @param Limit The max number of returned results.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Search by name. 
     * @return NameKeyword Search by name.
     */
    public String getNameKeyword() {
        return this.NameKeyword;
    }

    /**
     * Set Search by name.
     * @param NameKeyword Search by name.
     */
    public void setNameKeyword(String NameKeyword) {
        this.NameKeyword = NameKeyword;
    }

    public DescribeRocketMQNamespacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQNamespacesRequest(DescribeRocketMQNamespacesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.NameKeyword != null) {
            this.NameKeyword = new String(source.NameKeyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NameKeyword", this.NameKeyword);

    }
}

