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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceTagsRequest extends AbstractModel {

    /**
    * Creator `uin`
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * Resource region.
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * Service type.
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Resource prefix
    */
    @SerializedName("ResourcePrefix")
    @Expose
    private String ResourcePrefix;

    /**
    * Unique resource ID. Queries with `ResourceId` only may be slow or fail to return results. We recommend you also enter `ServiceType`, `ResourcePrefix`, and `ResourceRegion` (which can be ignored for resources that don't have the region attribute) when entering `ResourceId`.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Data offset. Default value: 0. It must be an integer multiple of the `Limit` parameter
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page. Default value: 15
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Whether it is a COS resource (0 or 1). This parameter is required when the entered `ResourceId` is a COS resource.
    */
    @SerializedName("CosResourceId")
    @Expose
    private Long CosResourceId;

    /**
     * Get Creator `uin` 
     * @return CreateUin Creator `uin`
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set Creator `uin`
     * @param CreateUin Creator `uin`
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Resource region. 
     * @return ResourceRegion Resource region.
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set Resource region.
     * @param ResourceRegion Resource region.
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get Service type. 
     * @return ServiceType Service type.
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Service type.
     * @param ServiceType Service type.
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Resource prefix 
     * @return ResourcePrefix Resource prefix
     */
    public String getResourcePrefix() {
        return this.ResourcePrefix;
    }

    /**
     * Set Resource prefix
     * @param ResourcePrefix Resource prefix
     */
    public void setResourcePrefix(String ResourcePrefix) {
        this.ResourcePrefix = ResourcePrefix;
    }

    /**
     * Get Unique resource ID. Queries with `ResourceId` only may be slow or fail to return results. We recommend you also enter `ServiceType`, `ResourcePrefix`, and `ResourceRegion` (which can be ignored for resources that don't have the region attribute) when entering `ResourceId`. 
     * @return ResourceId Unique resource ID. Queries with `ResourceId` only may be slow or fail to return results. We recommend you also enter `ServiceType`, `ResourcePrefix`, and `ResourceRegion` (which can be ignored for resources that don't have the region attribute) when entering `ResourceId`.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Unique resource ID. Queries with `ResourceId` only may be slow or fail to return results. We recommend you also enter `ServiceType`, `ResourcePrefix`, and `ResourceRegion` (which can be ignored for resources that don't have the region attribute) when entering `ResourceId`.
     * @param ResourceId Unique resource ID. Queries with `ResourceId` only may be slow or fail to return results. We recommend you also enter `ServiceType`, `ResourcePrefix`, and `ResourceRegion` (which can be ignored for resources that don't have the region attribute) when entering `ResourceId`.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Data offset. Default value: 0. It must be an integer multiple of the `Limit` parameter 
     * @return Offset Data offset. Default value: 0. It must be an integer multiple of the `Limit` parameter
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset. Default value: 0. It must be an integer multiple of the `Limit` parameter
     * @param Offset Data offset. Default value: 0. It must be an integer multiple of the `Limit` parameter
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page. Default value: 15 
     * @return Limit Number of entries per page. Default value: 15
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Default value: 15
     * @param Limit Number of entries per page. Default value: 15
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Whether it is a COS resource (0 or 1). This parameter is required when the entered `ResourceId` is a COS resource. 
     * @return CosResourceId Whether it is a COS resource (0 or 1). This parameter is required when the entered `ResourceId` is a COS resource.
     */
    public Long getCosResourceId() {
        return this.CosResourceId;
    }

    /**
     * Set Whether it is a COS resource (0 or 1). This parameter is required when the entered `ResourceId` is a COS resource.
     * @param CosResourceId Whether it is a COS resource (0 or 1). This parameter is required when the entered `ResourceId` is a COS resource.
     */
    public void setCosResourceId(Long CosResourceId) {
        this.CosResourceId = CosResourceId;
    }

    public DescribeResourceTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceTagsRequest(DescribeResourceTagsRequest source) {
        if (source.CreateUin != null) {
            this.CreateUin = new Long(source.CreateUin);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ResourcePrefix != null) {
            this.ResourcePrefix = new String(source.ResourcePrefix);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CosResourceId != null) {
            this.CosResourceId = new Long(source.CosResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ResourcePrefix", this.ResourcePrefix);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CosResourceId", this.CosResourceId);

    }
}

