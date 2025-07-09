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

public class DescribeResourceTagsByResourceIdsSeqRequest extends AbstractModel {

    /**
    * Service type
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
    * Unique resource ID
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * Resource region
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

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
     * Get Service type 
     * @return ServiceType Service type
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Service type
     * @param ServiceType Service type
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
     * Get Unique resource ID 
     * @return ResourceIds Unique resource ID
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set Unique resource ID
     * @param ResourceIds Unique resource ID
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get Resource region 
     * @return ResourceRegion Resource region
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set Resource region
     * @param ResourceRegion Resource region
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
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

    public DescribeResourceTagsByResourceIdsSeqRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceTagsByResourceIdsSeqRequest(DescribeResourceTagsByResourceIdsSeqRequest source) {
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ResourcePrefix != null) {
            this.ResourcePrefix = new String(source.ResourcePrefix);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ResourcePrefix", this.ResourcePrefix);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

