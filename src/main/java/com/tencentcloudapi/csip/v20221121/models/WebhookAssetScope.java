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

public class WebhookAssetScope extends AbstractModel {

    /**
    * Asset scope type (aligned with NotifyAssetRange)
Enumeration values:
1: All hosts (removable)
2: Specified hosts
3: Select by tag
    */
    @SerializedName("AssetRange")
    @Expose
    private Long AssetRange;

    /**
    * quuid list of selected hosts. It takes effect only when AssetRange=2.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Excluded host quuid list. This parameter takes effect only when AssetRange is 1.
    */
    @SerializedName("ExcludedInstanceIds")
    @Expose
    private String [] ExcludedInstanceIds;

    /**
    * Security center tag ID list. It takes effect only when AssetRange is 3.
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
    * List of Tencent Cloud tags. It takes effect only when AssetRange is set to 3.
Input parameter limitation: when AssetRange=3, TagIds and CloudTags cannot be empty at the same time.
    */
    @SerializedName("CloudTags")
    @Expose
    private String [] CloudTags;

    /**
     * Get Asset scope type (aligned with NotifyAssetRange)
Enumeration values:
1: All hosts (removable)
2: Specified hosts
3: Select by tag 
     * @return AssetRange Asset scope type (aligned with NotifyAssetRange)
Enumeration values:
1: All hosts (removable)
2: Specified hosts
3: Select by tag
     */
    public Long getAssetRange() {
        return this.AssetRange;
    }

    /**
     * Set Asset scope type (aligned with NotifyAssetRange)
Enumeration values:
1: All hosts (removable)
2: Specified hosts
3: Select by tag
     * @param AssetRange Asset scope type (aligned with NotifyAssetRange)
Enumeration values:
1: All hosts (removable)
2: Specified hosts
3: Select by tag
     */
    public void setAssetRange(Long AssetRange) {
        this.AssetRange = AssetRange;
    }

    /**
     * Get quuid list of selected hosts. It takes effect only when AssetRange=2. 
     * @return InstanceIds quuid list of selected hosts. It takes effect only when AssetRange=2.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set quuid list of selected hosts. It takes effect only when AssetRange=2.
     * @param InstanceIds quuid list of selected hosts. It takes effect only when AssetRange=2.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Excluded host quuid list. This parameter takes effect only when AssetRange is 1. 
     * @return ExcludedInstanceIds Excluded host quuid list. This parameter takes effect only when AssetRange is 1.
     */
    public String [] getExcludedInstanceIds() {
        return this.ExcludedInstanceIds;
    }

    /**
     * Set Excluded host quuid list. This parameter takes effect only when AssetRange is 1.
     * @param ExcludedInstanceIds Excluded host quuid list. This parameter takes effect only when AssetRange is 1.
     */
    public void setExcludedInstanceIds(String [] ExcludedInstanceIds) {
        this.ExcludedInstanceIds = ExcludedInstanceIds;
    }

    /**
     * Get Security center tag ID list. It takes effect only when AssetRange is 3. 
     * @return TagIds Security center tag ID list. It takes effect only when AssetRange is 3.
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set Security center tag ID list. It takes effect only when AssetRange is 3.
     * @param TagIds Security center tag ID list. It takes effect only when AssetRange is 3.
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get List of Tencent Cloud tags. It takes effect only when AssetRange is set to 3.
Input parameter limitation: when AssetRange=3, TagIds and CloudTags cannot be empty at the same time. 
     * @return CloudTags List of Tencent Cloud tags. It takes effect only when AssetRange is set to 3.
Input parameter limitation: when AssetRange=3, TagIds and CloudTags cannot be empty at the same time.
     */
    public String [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set List of Tencent Cloud tags. It takes effect only when AssetRange is set to 3.
Input parameter limitation: when AssetRange=3, TagIds and CloudTags cannot be empty at the same time.
     * @param CloudTags List of Tencent Cloud tags. It takes effect only when AssetRange is set to 3.
Input parameter limitation: when AssetRange=3, TagIds and CloudTags cannot be empty at the same time.
     */
    public void setCloudTags(String [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    public WebhookAssetScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebhookAssetScope(WebhookAssetScope source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetRange", this.AssetRange);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "ExcludedInstanceIds.", this.ExcludedInstanceIds);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);
        this.setParamArraySimple(map, prefix + "CloudTags.", this.CloudTags);

    }
}

