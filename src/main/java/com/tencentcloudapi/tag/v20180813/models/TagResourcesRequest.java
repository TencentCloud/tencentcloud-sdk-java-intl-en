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

public class TagResourcesRequest extends AbstractModel{

    /**
    * Six-segment resource description list. Tencent Cloud uses a six-segment value to describe a resource. For more information, see [CAM](https://intl.cloud.tencent.com/document/product/598/67350?from_cn_redirect=1) > Overview > API List > Six-Segment Resource Information.
For example, ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
Value range of N: 0–9
    */
    @SerializedName("ResourceList")
    @Expose
    private String [] ResourceList;

    /**
    * Tag key and value.
If multiple tags are specified, all such tags will be created and bound to the specified resources.
For each resource, each tag key can have only one value. If you try to add an existing tag key, the corresponding tag value will be updated to the new value.
Non-existent tags will be automatically created.
Value range of N: 0–9
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Six-segment resource description list. Tencent Cloud uses a six-segment value to describe a resource. For more information, see [CAM](https://intl.cloud.tencent.com/document/product/598/67350?from_cn_redirect=1) > Overview > API List > Six-Segment Resource Information.
For example, ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
Value range of N: 0–9 
     * @return ResourceList Six-segment resource description list. Tencent Cloud uses a six-segment value to describe a resource. For more information, see [CAM](https://intl.cloud.tencent.com/document/product/598/67350?from_cn_redirect=1) > Overview > API List > Six-Segment Resource Information.
For example, ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
Value range of N: 0–9
     */
    public String [] getResourceList() {
        return this.ResourceList;
    }

    /**
     * Set Six-segment resource description list. Tencent Cloud uses a six-segment value to describe a resource. For more information, see [CAM](https://intl.cloud.tencent.com/document/product/598/67350?from_cn_redirect=1) > Overview > API List > Six-Segment Resource Information.
For example, ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
Value range of N: 0–9
     * @param ResourceList Six-segment resource description list. Tencent Cloud uses a six-segment value to describe a resource. For more information, see [CAM](https://intl.cloud.tencent.com/document/product/598/67350?from_cn_redirect=1) > Overview > API List > Six-Segment Resource Information.
For example, ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}.
Value range of N: 0–9
     */
    public void setResourceList(String [] ResourceList) {
        this.ResourceList = ResourceList;
    }

    /**
     * Get Tag key and value.
If multiple tags are specified, all such tags will be created and bound to the specified resources.
For each resource, each tag key can have only one value. If you try to add an existing tag key, the corresponding tag value will be updated to the new value.
Non-existent tags will be automatically created.
Value range of N: 0–9 
     * @return Tags Tag key and value.
If multiple tags are specified, all such tags will be created and bound to the specified resources.
For each resource, each tag key can have only one value. If you try to add an existing tag key, the corresponding tag value will be updated to the new value.
Non-existent tags will be automatically created.
Value range of N: 0–9
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag key and value.
If multiple tags are specified, all such tags will be created and bound to the specified resources.
For each resource, each tag key can have only one value. If you try to add an existing tag key, the corresponding tag value will be updated to the new value.
Non-existent tags will be automatically created.
Value range of N: 0–9
     * @param Tags Tag key and value.
If multiple tags are specified, all such tags will be created and bound to the specified resources.
For each resource, each tag key can have only one value. If you try to add an existing tag key, the corresponding tag value will be updated to the new value.
Non-existent tags will be automatically created.
Value range of N: 0–9
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public TagResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagResourcesRequest(TagResourcesRequest source) {
        if (source.ResourceList != null) {
            this.ResourceList = new String[source.ResourceList.length];
            for (int i = 0; i < source.ResourceList.length; i++) {
                this.ResourceList[i] = new String(source.ResourceList[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ResourceList.", this.ResourceList);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

