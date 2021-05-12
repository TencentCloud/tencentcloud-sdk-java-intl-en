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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiscoveredResourceResponse extends AbstractModel{

    /**
    * Last update time
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * Resource type
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Tag details
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * Current resource configuration details
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceInfo")
    @Expose
    private String ResourceInfo;

    /**
    * Resource region
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * Resource alias
    */
    @SerializedName("ResourceAlias")
    @Expose
    private String ResourceAlias;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Last update time 
     * @return LastUpdateTime Last update time
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set Last update time
     * @param LastUpdateTime Last update time
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get Resource type 
     * @return ResourceType Resource type
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type
     * @param ResourceType Resource type
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource creation time
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CreateTime Resource creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Resource creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CreateTime Resource creation time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Tag details
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Tag Tag details
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Tag details
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Tag Tag details
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Current resource configuration details
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ResourceInfo Current resource configuration details
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getResourceInfo() {
        return this.ResourceInfo;
    }

    /**
     * Set Current resource configuration details
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ResourceInfo Current resource configuration details
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setResourceInfo(String ResourceInfo) {
        this.ResourceInfo = ResourceInfo;
    }

    /**
     * Get Resource region
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ResourceRegion Resource region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set Resource region
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ResourceRegion Resource region
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get Resource alias 
     * @return ResourceAlias Resource alias
     */
    public String getResourceAlias() {
        return this.ResourceAlias;
    }

    /**
     * Set Resource alias
     * @param ResourceAlias Resource alias
     */
    public void setResourceAlias(String ResourceAlias) {
        this.ResourceAlias = ResourceAlias;
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

    public DescribeDiscoveredResourceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiscoveredResourceResponse(DescribeDiscoveredResourceResponse source) {
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.ResourceInfo != null) {
            this.ResourceInfo = new String(source.ResourceInfo);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourceAlias != null) {
            this.ResourceAlias = new String(source.ResourceAlias);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "ResourceInfo", this.ResourceInfo);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ResourceAlias", this.ResourceAlias);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

