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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourceTags extends AbstractModel {

    /**
    * Cluster ID or CVM ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 6-segment resource expression
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Resource prefix
    */
    @SerializedName("ResourcePrefix")
    @Expose
    private String ResourcePrefix;

    /**
    * ap-beijing
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * emr
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * List of deleted tags
    */
    @SerializedName("DeleteTags")
    @Expose
    private Tag [] DeleteTags;

    /**
    * List of added tags
    */
    @SerializedName("AddTags")
    @Expose
    private Tag [] AddTags;

    /**
    * List of modified tags
    */
    @SerializedName("ModifyTags")
    @Expose
    private Tag [] ModifyTags;

    /**
     * Get Cluster ID or CVM ID 
     * @return ResourceId Cluster ID or CVM ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Cluster ID or CVM ID
     * @param ResourceId Cluster ID or CVM ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 6-segment resource expression 
     * @return Resource 6-segment resource expression
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 6-segment resource expression
     * @param Resource 6-segment resource expression
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
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
     * Get ap-beijing 
     * @return ResourceRegion ap-beijing
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set ap-beijing
     * @param ResourceRegion ap-beijing
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get emr 
     * @return ServiceType emr
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set emr
     * @param ServiceType emr
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get List of deleted tags 
     * @return DeleteTags List of deleted tags
     */
    public Tag [] getDeleteTags() {
        return this.DeleteTags;
    }

    /**
     * Set List of deleted tags
     * @param DeleteTags List of deleted tags
     */
    public void setDeleteTags(Tag [] DeleteTags) {
        this.DeleteTags = DeleteTags;
    }

    /**
     * Get List of added tags 
     * @return AddTags List of added tags
     */
    public Tag [] getAddTags() {
        return this.AddTags;
    }

    /**
     * Set List of added tags
     * @param AddTags List of added tags
     */
    public void setAddTags(Tag [] AddTags) {
        this.AddTags = AddTags;
    }

    /**
     * Get List of modified tags 
     * @return ModifyTags List of modified tags
     */
    public Tag [] getModifyTags() {
        return this.ModifyTags;
    }

    /**
     * Set List of modified tags
     * @param ModifyTags List of modified tags
     */
    public void setModifyTags(Tag [] ModifyTags) {
        this.ModifyTags = ModifyTags;
    }

    public ModifyResourceTags() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceTags(ModifyResourceTags source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.ResourcePrefix != null) {
            this.ResourcePrefix = new String(source.ResourcePrefix);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.DeleteTags != null) {
            this.DeleteTags = new Tag[source.DeleteTags.length];
            for (int i = 0; i < source.DeleteTags.length; i++) {
                this.DeleteTags[i] = new Tag(source.DeleteTags[i]);
            }
        }
        if (source.AddTags != null) {
            this.AddTags = new Tag[source.AddTags.length];
            for (int i = 0; i < source.AddTags.length; i++) {
                this.AddTags[i] = new Tag(source.AddTags[i]);
            }
        }
        if (source.ModifyTags != null) {
            this.ModifyTags = new Tag[source.ModifyTags.length];
            for (int i = 0; i < source.ModifyTags.length; i++) {
                this.ModifyTags[i] = new Tag(source.ModifyTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "ResourcePrefix", this.ResourcePrefix);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamArrayObj(map, prefix + "DeleteTags.", this.DeleteTags);
        this.setParamArrayObj(map, prefix + "AddTags.", this.AddTags);
        this.setParamArrayObj(map, prefix + "ModifyTags.", this.ModifyTags);

    }
}

