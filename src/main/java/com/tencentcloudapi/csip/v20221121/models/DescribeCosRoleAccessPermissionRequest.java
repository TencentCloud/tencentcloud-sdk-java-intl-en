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

public class DescribeCosRoleAccessPermissionRequest extends AbstractModel {

    /**
    * Associated appid
    */
    @SerializedName("RelAppId")
    @Expose
    private Long RelAppId;

    /**
    * Role id to view
    */
    @SerializedName("RelRoleId")
    @Expose
    private String RelRoleId;

    /**
    * Bucket name
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * Filter.
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
     * Get Associated appid 
     * @return RelAppId Associated appid
     */
    public Long getRelAppId() {
        return this.RelAppId;
    }

    /**
     * Set Associated appid
     * @param RelAppId Associated appid
     */
    public void setRelAppId(Long RelAppId) {
        this.RelAppId = RelAppId;
    }

    /**
     * Get Role id to view 
     * @return RelRoleId Role id to view
     */
    public String getRelRoleId() {
        return this.RelRoleId;
    }

    /**
     * Set Role id to view
     * @param RelRoleId Role id to view
     */
    public void setRelRoleId(String RelRoleId) {
        this.RelRoleId = RelRoleId;
    }

    /**
     * Get Bucket name 
     * @return BucketName Bucket name
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Bucket name
     * @param BucketName Bucket name
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get Filter. 
     * @return Filter Filter.
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set Filter.
     * @param Filter Filter.
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    public DescribeCosRoleAccessPermissionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCosRoleAccessPermissionRequest(DescribeCosRoleAccessPermissionRequest source) {
        if (source.RelAppId != null) {
            this.RelAppId = new Long(source.RelAppId);
        }
        if (source.RelRoleId != null) {
            this.RelRoleId = new String(source.RelRoleId);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RelAppId", this.RelAppId);
        this.setParamSimple(map, prefix + "RelRoleId", this.RelRoleId);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

