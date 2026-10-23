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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceParamsRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Instance ID. Support batch querying.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Parameter name search criteria. Fuzzy matching is supported.
    */
    @SerializedName("ParamKeyword")
    @Expose
    private String ParamKeyword;

    /**
    * Whether it is a global parameter
    */
    @SerializedName("IsGlobal")
    @Expose
    private String IsGlobal;

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
     * Get Instance ID. Support batch querying. 
     * @return InstanceIds Instance ID. Support batch querying.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID. Support batch querying.
     * @param InstanceIds Instance ID. Support batch querying.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Parameter name search criteria. Fuzzy matching is supported. 
     * @return ParamKeyword Parameter name search criteria. Fuzzy matching is supported.
     */
    public String getParamKeyword() {
        return this.ParamKeyword;
    }

    /**
     * Set Parameter name search criteria. Fuzzy matching is supported.
     * @param ParamKeyword Parameter name search criteria. Fuzzy matching is supported.
     */
    public void setParamKeyword(String ParamKeyword) {
        this.ParamKeyword = ParamKeyword;
    }

    /**
     * Get Whether it is a global parameter 
     * @return IsGlobal Whether it is a global parameter
     */
    public String getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether it is a global parameter
     * @param IsGlobal Whether it is a global parameter
     */
    public void setIsGlobal(String IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    public DescribeInstanceParamsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceParamsRequest(DescribeInstanceParamsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ParamKeyword != null) {
            this.ParamKeyword = new String(source.ParamKeyword);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new String(source.IsGlobal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ParamKeyword", this.ParamKeyword);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);

    }
}

