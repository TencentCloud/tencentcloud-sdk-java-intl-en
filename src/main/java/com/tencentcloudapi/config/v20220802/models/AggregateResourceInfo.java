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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AggregateResourceInfo extends AbstractModel {

    /**
    * Resource type
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource name
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Region

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * Resource Status

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResourceStatus")
    @Expose
    private String ResourceStatus;

    /**
    * Whether to delete. 1: Deleted; 0: Not deleted.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResourceDelete")
    @Expose
    private Long ResourceDelete;

    /**
    * Resource creation time

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResourceCreateTime")
    @Expose
    private String ResourceCreateTime;

    /**
    * Tag information

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Availability zone

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResourceZone")
    @Expose
    private String ResourceZone;

    /**
    * Compliance status
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ComplianceResult")
    @Expose
    private String ComplianceResult;

    /**
    * Resource owner uid
    */
    @SerializedName("ResourceOwnerId")
    @Expose
    private Long ResourceOwnerId;

    /**
    * User nickname
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("ResourceOwnerName")
    @Expose
    private String ResourceOwnerName;

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
     * Get Resource name 
     * @return ResourceName Resource name
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name
     * @param ResourceName Resource name
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
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
     * Get Region

Note: This field may return null, indicating that no valid value is found. 
     * @return ResourceRegion Region

Note: This field may return null, indicating that no valid value is found.
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set Region

Note: This field may return null, indicating that no valid value is found.
     * @param ResourceRegion Region

Note: This field may return null, indicating that no valid value is found.
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get Resource Status

Note: This field may return null, indicating that no valid value is found. 
     * @return ResourceStatus Resource Status

Note: This field may return null, indicating that no valid value is found.
     */
    public String getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set Resource Status

Note: This field may return null, indicating that no valid value is found.
     * @param ResourceStatus Resource Status

Note: This field may return null, indicating that no valid value is found.
     */
    public void setResourceStatus(String ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    /**
     * Get Whether to delete. 1: Deleted; 0: Not deleted.
Note: This field may return null, indicating that no valid value is found. 
     * @return ResourceDelete Whether to delete. 1: Deleted; 0: Not deleted.
Note: This field may return null, indicating that no valid value is found.
     */
    public Long getResourceDelete() {
        return this.ResourceDelete;
    }

    /**
     * Set Whether to delete. 1: Deleted; 0: Not deleted.
Note: This field may return null, indicating that no valid value is found.
     * @param ResourceDelete Whether to delete. 1: Deleted; 0: Not deleted.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setResourceDelete(Long ResourceDelete) {
        this.ResourceDelete = ResourceDelete;
    }

    /**
     * Get Resource creation time

Note: This field may return null, indicating that no valid value is found. 
     * @return ResourceCreateTime Resource creation time

Note: This field may return null, indicating that no valid value is found.
     */
    public String getResourceCreateTime() {
        return this.ResourceCreateTime;
    }

    /**
     * Set Resource creation time

Note: This field may return null, indicating that no valid value is found.
     * @param ResourceCreateTime Resource creation time

Note: This field may return null, indicating that no valid value is found.
     */
    public void setResourceCreateTime(String ResourceCreateTime) {
        this.ResourceCreateTime = ResourceCreateTime;
    }

    /**
     * Get Tag information

Note: This field may return null, indicating that no valid value is found. 
     * @return Tags Tag information

Note: This field may return null, indicating that no valid value is found.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information

Note: This field may return null, indicating that no valid value is found.
     * @param Tags Tag information

Note: This field may return null, indicating that no valid value is found.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Availability zone

Note: This field may return null, indicating that no valid value is found. 
     * @return ResourceZone Availability zone

Note: This field may return null, indicating that no valid value is found.
     */
    public String getResourceZone() {
        return this.ResourceZone;
    }

    /**
     * Set Availability zone

Note: This field may return null, indicating that no valid value is found.
     * @param ResourceZone Availability zone

Note: This field may return null, indicating that no valid value is found.
     */
    public void setResourceZone(String ResourceZone) {
        this.ResourceZone = ResourceZone;
    }

    /**
     * Get Compliance status
Note: This field may return null, indicating that no valid value is found. 
     * @return ComplianceResult Compliance status
Note: This field may return null, indicating that no valid value is found.
     */
    public String getComplianceResult() {
        return this.ComplianceResult;
    }

    /**
     * Set Compliance status
Note: This field may return null, indicating that no valid value is found.
     * @param ComplianceResult Compliance status
Note: This field may return null, indicating that no valid value is found.
     */
    public void setComplianceResult(String ComplianceResult) {
        this.ComplianceResult = ComplianceResult;
    }

    /**
     * Get Resource owner uid 
     * @return ResourceOwnerId Resource owner uid
     */
    public Long getResourceOwnerId() {
        return this.ResourceOwnerId;
    }

    /**
     * Set Resource owner uid
     * @param ResourceOwnerId Resource owner uid
     */
    public void setResourceOwnerId(Long ResourceOwnerId) {
        this.ResourceOwnerId = ResourceOwnerId;
    }

    /**
     * Get User nickname
Note: This field may return null, indicating that no valid value is found. 
     * @return ResourceOwnerName User nickname
Note: This field may return null, indicating that no valid value is found.
     */
    public String getResourceOwnerName() {
        return this.ResourceOwnerName;
    }

    /**
     * Set User nickname
Note: This field may return null, indicating that no valid value is found.
     * @param ResourceOwnerName User nickname
Note: This field may return null, indicating that no valid value is found.
     */
    public void setResourceOwnerName(String ResourceOwnerName) {
        this.ResourceOwnerName = ResourceOwnerName;
    }

    public AggregateResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AggregateResourceInfo(AggregateResourceInfo source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new String(source.ResourceStatus);
        }
        if (source.ResourceDelete != null) {
            this.ResourceDelete = new Long(source.ResourceDelete);
        }
        if (source.ResourceCreateTime != null) {
            this.ResourceCreateTime = new String(source.ResourceCreateTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ResourceZone != null) {
            this.ResourceZone = new String(source.ResourceZone);
        }
        if (source.ComplianceResult != null) {
            this.ComplianceResult = new String(source.ComplianceResult);
        }
        if (source.ResourceOwnerId != null) {
            this.ResourceOwnerId = new Long(source.ResourceOwnerId);
        }
        if (source.ResourceOwnerName != null) {
            this.ResourceOwnerName = new String(source.ResourceOwnerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);
        this.setParamSimple(map, prefix + "ResourceDelete", this.ResourceDelete);
        this.setParamSimple(map, prefix + "ResourceCreateTime", this.ResourceCreateTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ResourceZone", this.ResourceZone);
        this.setParamSimple(map, prefix + "ComplianceResult", this.ComplianceResult);
        this.setParamSimple(map, prefix + "ResourceOwnerId", this.ResourceOwnerId);
        this.setParamSimple(map, prefix + "ResourceOwnerName", this.ResourceOwnerName);

    }
}

