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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeParamTemplateInfoResponse extends AbstractModel{

    /**
    * Number of instance parameters
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Parameter template ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Parameter template name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Instance type. Valid values: `1` (Redis 2.8 memory edition in cluster architecture), `2` (Redis 2.8 memory edition in standard architecture), `3` (CKV 3.2 memory edition in standard architecture), `4` (CKV 3.2 memory edition in cluster architecture), `5` (Redis 2.8 memory edition in standalone architecture), `6` (Redis 4.0 memory edition in standard architecture), `7` (Redis 4.0 memory edition in cluster architecture), `8` (Redis 5.0 memory edition in standard architecture), `9` (Redis 5.0 memory edition in cluster architecture)
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * Parameter template description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Parameter details
    */
    @SerializedName("Items")
    @Expose
    private ParameterDetail [] Items;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of instance parameters 
     * @return TotalCount Number of instance parameters
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of instance parameters
     * @param TotalCount Number of instance parameters
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Parameter template ID 
     * @return TemplateId Parameter template ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Parameter template ID
     * @param TemplateId Parameter template ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Parameter template name 
     * @return Name Parameter template name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter template name
     * @param Name Parameter template name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Instance type. Valid values: `1` (Redis 2.8 memory edition in cluster architecture), `2` (Redis 2.8 memory edition in standard architecture), `3` (CKV 3.2 memory edition in standard architecture), `4` (CKV 3.2 memory edition in cluster architecture), `5` (Redis 2.8 memory edition in standalone architecture), `6` (Redis 4.0 memory edition in standard architecture), `7` (Redis 4.0 memory edition in cluster architecture), `8` (Redis 5.0 memory edition in standard architecture), `9` (Redis 5.0 memory edition in cluster architecture) 
     * @return ProductType Instance type. Valid values: `1` (Redis 2.8 memory edition in cluster architecture), `2` (Redis 2.8 memory edition in standard architecture), `3` (CKV 3.2 memory edition in standard architecture), `4` (CKV 3.2 memory edition in cluster architecture), `5` (Redis 2.8 memory edition in standalone architecture), `6` (Redis 4.0 memory edition in standard architecture), `7` (Redis 4.0 memory edition in cluster architecture), `8` (Redis 5.0 memory edition in standard architecture), `9` (Redis 5.0 memory edition in cluster architecture)
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set Instance type. Valid values: `1` (Redis 2.8 memory edition in cluster architecture), `2` (Redis 2.8 memory edition in standard architecture), `3` (CKV 3.2 memory edition in standard architecture), `4` (CKV 3.2 memory edition in cluster architecture), `5` (Redis 2.8 memory edition in standalone architecture), `6` (Redis 4.0 memory edition in standard architecture), `7` (Redis 4.0 memory edition in cluster architecture), `8` (Redis 5.0 memory edition in standard architecture), `9` (Redis 5.0 memory edition in cluster architecture)
     * @param ProductType Instance type. Valid values: `1` (Redis 2.8 memory edition in cluster architecture), `2` (Redis 2.8 memory edition in standard architecture), `3` (CKV 3.2 memory edition in standard architecture), `4` (CKV 3.2 memory edition in cluster architecture), `5` (Redis 2.8 memory edition in standalone architecture), `6` (Redis 4.0 memory edition in standard architecture), `7` (Redis 4.0 memory edition in cluster architecture), `8` (Redis 5.0 memory edition in standard architecture), `9` (Redis 5.0 memory edition in cluster architecture)
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get Parameter template description 
     * @return Description Parameter template description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Parameter template description
     * @param Description Parameter template description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Parameter details 
     * @return Items Parameter details
     */
    public ParameterDetail [] getItems() {
        return this.Items;
    }

    /**
     * Set Parameter details
     * @param Items Parameter details
     */
    public void setItems(ParameterDetail [] Items) {
        this.Items = Items;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeParamTemplateInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeParamTemplateInfoResponse(DescribeParamTemplateInfoResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProductType != null) {
            this.ProductType = new Long(source.ProductType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Items != null) {
            this.Items = new ParameterDetail[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ParameterDetail(source.Items[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

