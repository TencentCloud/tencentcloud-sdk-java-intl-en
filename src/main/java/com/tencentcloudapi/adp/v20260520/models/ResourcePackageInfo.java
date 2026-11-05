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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourcePackageInfo extends AbstractModel {

    /**
    * <p>Package type</p><p>Enumeration values:</p><ul><li>1: Free edition</li><li>2: Pro edition</li><li>3: Enterprise edition</li></ul>
    */
    @SerializedName("PackageType")
    @Expose
    private Long PackageType;

    /**
    * <p>Total resource package quantity</p>
    */
    @SerializedName("ResourceTotal")
    @Expose
    private Long ResourceTotal;

    /**
    * <p>Resource package usage</p>
    */
    @SerializedName("ResourceUsage")
    @Expose
    private Float ResourceUsage;

    /**
    * <p>Knowledge base capacity.</p>
    */
    @SerializedName("KnowledgeCapacity")
    @Expose
    private Float KnowledgeCapacity;

    /**
    * <p>Knowledge base amount</p>
    */
    @SerializedName("KnowledgeUsage")
    @Expose
    private Float KnowledgeUsage;

    /**
    * <p>Resource pack status</p><p>Enumeration values:</p><ul><li>1: Normal</li><li>3: Expired</li><li>4: About to expire</li></ul>
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
     * Get <p>Package type</p><p>Enumeration values:</p><ul><li>1: Free edition</li><li>2: Pro edition</li><li>3: Enterprise edition</li></ul> 
     * @return PackageType <p>Package type</p><p>Enumeration values:</p><ul><li>1: Free edition</li><li>2: Pro edition</li><li>3: Enterprise edition</li></ul>
     */
    public Long getPackageType() {
        return this.PackageType;
    }

    /**
     * Set <p>Package type</p><p>Enumeration values:</p><ul><li>1: Free edition</li><li>2: Pro edition</li><li>3: Enterprise edition</li></ul>
     * @param PackageType <p>Package type</p><p>Enumeration values:</p><ul><li>1: Free edition</li><li>2: Pro edition</li><li>3: Enterprise edition</li></ul>
     */
    public void setPackageType(Long PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get <p>Total resource package quantity</p> 
     * @return ResourceTotal <p>Total resource package quantity</p>
     */
    public Long getResourceTotal() {
        return this.ResourceTotal;
    }

    /**
     * Set <p>Total resource package quantity</p>
     * @param ResourceTotal <p>Total resource package quantity</p>
     */
    public void setResourceTotal(Long ResourceTotal) {
        this.ResourceTotal = ResourceTotal;
    }

    /**
     * Get <p>Resource package usage</p> 
     * @return ResourceUsage <p>Resource package usage</p>
     */
    public Float getResourceUsage() {
        return this.ResourceUsage;
    }

    /**
     * Set <p>Resource package usage</p>
     * @param ResourceUsage <p>Resource package usage</p>
     */
    public void setResourceUsage(Float ResourceUsage) {
        this.ResourceUsage = ResourceUsage;
    }

    /**
     * Get <p>Knowledge base capacity.</p> 
     * @return KnowledgeCapacity <p>Knowledge base capacity.</p>
     */
    public Float getKnowledgeCapacity() {
        return this.KnowledgeCapacity;
    }

    /**
     * Set <p>Knowledge base capacity.</p>
     * @param KnowledgeCapacity <p>Knowledge base capacity.</p>
     */
    public void setKnowledgeCapacity(Float KnowledgeCapacity) {
        this.KnowledgeCapacity = KnowledgeCapacity;
    }

    /**
     * Get <p>Knowledge base amount</p> 
     * @return KnowledgeUsage <p>Knowledge base amount</p>
     */
    public Float getKnowledgeUsage() {
        return this.KnowledgeUsage;
    }

    /**
     * Set <p>Knowledge base amount</p>
     * @param KnowledgeUsage <p>Knowledge base amount</p>
     */
    public void setKnowledgeUsage(Float KnowledgeUsage) {
        this.KnowledgeUsage = KnowledgeUsage;
    }

    /**
     * Get <p>Resource pack status</p><p>Enumeration values:</p><ul><li>1: Normal</li><li>3: Expired</li><li>4: About to expire</li></ul> 
     * @return ResourceStatus <p>Resource pack status</p><p>Enumeration values:</p><ul><li>1: Normal</li><li>3: Expired</li><li>4: About to expire</li></ul>
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set <p>Resource pack status</p><p>Enumeration values:</p><ul><li>1: Normal</li><li>3: Expired</li><li>4: About to expire</li></ul>
     * @param ResourceStatus <p>Resource pack status</p><p>Enumeration values:</p><ul><li>1: Normal</li><li>3: Expired</li><li>4: About to expire</li></ul>
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    public ResourcePackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourcePackageInfo(ResourcePackageInfo source) {
        if (source.PackageType != null) {
            this.PackageType = new Long(source.PackageType);
        }
        if (source.ResourceTotal != null) {
            this.ResourceTotal = new Long(source.ResourceTotal);
        }
        if (source.ResourceUsage != null) {
            this.ResourceUsage = new Float(source.ResourceUsage);
        }
        if (source.KnowledgeCapacity != null) {
            this.KnowledgeCapacity = new Float(source.KnowledgeCapacity);
        }
        if (source.KnowledgeUsage != null) {
            this.KnowledgeUsage = new Float(source.KnowledgeUsage);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "ResourceTotal", this.ResourceTotal);
        this.setParamSimple(map, prefix + "ResourceUsage", this.ResourceUsage);
        this.setParamSimple(map, prefix + "KnowledgeCapacity", this.KnowledgeCapacity);
        this.setParamSimple(map, prefix + "KnowledgeUsage", this.KnowledgeUsage);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);

    }
}

