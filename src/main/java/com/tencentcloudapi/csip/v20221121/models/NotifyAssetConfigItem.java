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

public class NotifyAssetConfigItem extends AbstractModel {

    /**
    * <p>Module name</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>Submodule</p>
    */
    @SerializedName("SubModule")
    @Expose
    private String SubModule;

    /**
    * <p>Asset scope</p><p>Enumeration values:</p><ul><li>0: meaningless</li><li>1: all</li><li>2: selected</li><li>3: by tag</li></ul>
    */
    @SerializedName("AssetRange")
    @Expose
    private Long AssetRange;

    /**
    * <p>ID of selected instances</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>Removed instance ID</p>
    */
    @SerializedName("ExcludedInstanceIds")
    @Expose
    private String [] ExcludedInstanceIds;

    /**
    * <p>Tag ID</p>
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
    * <p>Cloud tag</p>
    */
    @SerializedName("CloudTags")
    @Expose
    private String [] CloudTags;

    /**
    * <p>Total.</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get <p>Module name</p> 
     * @return Module <p>Module name</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>Module name</p>
     * @param Module <p>Module name</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>Submodule</p> 
     * @return SubModule <p>Submodule</p>
     */
    public String getSubModule() {
        return this.SubModule;
    }

    /**
     * Set <p>Submodule</p>
     * @param SubModule <p>Submodule</p>
     */
    public void setSubModule(String SubModule) {
        this.SubModule = SubModule;
    }

    /**
     * Get <p>Asset scope</p><p>Enumeration values:</p><ul><li>0: meaningless</li><li>1: all</li><li>2: selected</li><li>3: by tag</li></ul> 
     * @return AssetRange <p>Asset scope</p><p>Enumeration values:</p><ul><li>0: meaningless</li><li>1: all</li><li>2: selected</li><li>3: by tag</li></ul>
     */
    public Long getAssetRange() {
        return this.AssetRange;
    }

    /**
     * Set <p>Asset scope</p><p>Enumeration values:</p><ul><li>0: meaningless</li><li>1: all</li><li>2: selected</li><li>3: by tag</li></ul>
     * @param AssetRange <p>Asset scope</p><p>Enumeration values:</p><ul><li>0: meaningless</li><li>1: all</li><li>2: selected</li><li>3: by tag</li></ul>
     */
    public void setAssetRange(Long AssetRange) {
        this.AssetRange = AssetRange;
    }

    /**
     * Get <p>ID of selected instances</p> 
     * @return InstanceIds <p>ID of selected instances</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>ID of selected instances</p>
     * @param InstanceIds <p>ID of selected instances</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>Removed instance ID</p> 
     * @return ExcludedInstanceIds <p>Removed instance ID</p>
     */
    public String [] getExcludedInstanceIds() {
        return this.ExcludedInstanceIds;
    }

    /**
     * Set <p>Removed instance ID</p>
     * @param ExcludedInstanceIds <p>Removed instance ID</p>
     */
    public void setExcludedInstanceIds(String [] ExcludedInstanceIds) {
        this.ExcludedInstanceIds = ExcludedInstanceIds;
    }

    /**
     * Get <p>Tag ID</p> 
     * @return TagIds <p>Tag ID</p>
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set <p>Tag ID</p>
     * @param TagIds <p>Tag ID</p>
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get <p>Cloud tag</p> 
     * @return CloudTags <p>Cloud tag</p>
     */
    public String [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set <p>Cloud tag</p>
     * @param CloudTags <p>Cloud tag</p>
     */
    public void setCloudTags(String [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get <p>Total.</p> 
     * @return TotalCount <p>Total.</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>Total.</p>
     * @param TotalCount <p>Total.</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public NotifyAssetConfigItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotifyAssetConfigItem(NotifyAssetConfigItem source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.SubModule != null) {
            this.SubModule = new String(source.SubModule);
        }
        if (source.AssetRange != null) {
            this.AssetRange = new Long(source.AssetRange);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ExcludedInstanceIds != null) {
            this.ExcludedInstanceIds = new String[source.ExcludedInstanceIds.length];
            for (int i = 0; i < source.ExcludedInstanceIds.length; i++) {
                this.ExcludedInstanceIds[i] = new String(source.ExcludedInstanceIds[i]);
            }
        }
        if (source.TagIds != null) {
            this.TagIds = new Long[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new Long(source.TagIds[i]);
            }
        }
        if (source.CloudTags != null) {
            this.CloudTags = new String[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new String(source.CloudTags[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "SubModule", this.SubModule);
        this.setParamSimple(map, prefix + "AssetRange", this.AssetRange);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "ExcludedInstanceIds.", this.ExcludedInstanceIds);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);
        this.setParamArraySimple(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

