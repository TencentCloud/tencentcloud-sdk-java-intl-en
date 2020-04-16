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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceTagsByTagKeysRequest extends AbstractModel{

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
    * Resource region
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * Unique resource ID
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * Resource tag key
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * Number of entries per page. Default value: 400
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Data offset. Default value: 0. It must be an integer multiple of the `Limit` parameter
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
     * Get Resource tag key 
     * @return TagKeys Resource tag key
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set Resource tag key
     * @param TagKeys Resource tag key
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get Number of entries per page. Default value: 400 
     * @return Limit Number of entries per page. Default value: 400
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Default value: 400
     * @param Limit Number of entries per page. Default value: 400
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ResourcePrefix", this.ResourcePrefix);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

