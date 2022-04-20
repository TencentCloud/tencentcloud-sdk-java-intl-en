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

public class ModifyResourceTagsRequest extends AbstractModel{

    /**
    * [Six-segment resource description](https://intl.cloud.tencent.com/document/product/598/10606?from_cn_redirect=1)
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * The tags to be added or modified. If the resource described by `Resource` is not associated with the input tag keys, an association will be added. If the tag keys are already associated, the values corresponding to the associated tag keys will be modified to the input values. This API must contain either `ReplaceTags` or `DeleteTag`, and these two parameters cannot include the same tag keys. This parameter can be omitted, but it cannot be an empty array.
    */
    @SerializedName("ReplaceTags")
    @Expose
    private Tag [] ReplaceTags;

    /**
    * The tags to be disassociated. This API must contain either `ReplaceTags` or `DeleteTag`, and these two parameters cannot include the same tag keys. This parameter can be omitted, but it cannot be an empty array.
    */
    @SerializedName("DeleteTags")
    @Expose
    private TagKeyObject [] DeleteTags;

    /**
     * Get [Six-segment resource description](https://intl.cloud.tencent.com/document/product/598/10606?from_cn_redirect=1) 
     * @return Resource [Six-segment resource description](https://intl.cloud.tencent.com/document/product/598/10606?from_cn_redirect=1)
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set [Six-segment resource description](https://intl.cloud.tencent.com/document/product/598/10606?from_cn_redirect=1)
     * @param Resource [Six-segment resource description](https://intl.cloud.tencent.com/document/product/598/10606?from_cn_redirect=1)
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get The tags to be added or modified. If the resource described by `Resource` is not associated with the input tag keys, an association will be added. If the tag keys are already associated, the values corresponding to the associated tag keys will be modified to the input values. This API must contain either `ReplaceTags` or `DeleteTag`, and these two parameters cannot include the same tag keys. This parameter can be omitted, but it cannot be an empty array. 
     * @return ReplaceTags The tags to be added or modified. If the resource described by `Resource` is not associated with the input tag keys, an association will be added. If the tag keys are already associated, the values corresponding to the associated tag keys will be modified to the input values. This API must contain either `ReplaceTags` or `DeleteTag`, and these two parameters cannot include the same tag keys. This parameter can be omitted, but it cannot be an empty array.
     */
    public Tag [] getReplaceTags() {
        return this.ReplaceTags;
    }

    /**
     * Set The tags to be added or modified. If the resource described by `Resource` is not associated with the input tag keys, an association will be added. If the tag keys are already associated, the values corresponding to the associated tag keys will be modified to the input values. This API must contain either `ReplaceTags` or `DeleteTag`, and these two parameters cannot include the same tag keys. This parameter can be omitted, but it cannot be an empty array.
     * @param ReplaceTags The tags to be added or modified. If the resource described by `Resource` is not associated with the input tag keys, an association will be added. If the tag keys are already associated, the values corresponding to the associated tag keys will be modified to the input values. This API must contain either `ReplaceTags` or `DeleteTag`, and these two parameters cannot include the same tag keys. This parameter can be omitted, but it cannot be an empty array.
     */
    public void setReplaceTags(Tag [] ReplaceTags) {
        this.ReplaceTags = ReplaceTags;
    }

    /**
     * Get The tags to be disassociated. This API must contain either `ReplaceTags` or `DeleteTag`, and these two parameters cannot include the same tag keys. This parameter can be omitted, but it cannot be an empty array. 
     * @return DeleteTags The tags to be disassociated. This API must contain either `ReplaceTags` or `DeleteTag`, and these two parameters cannot include the same tag keys. This parameter can be omitted, but it cannot be an empty array.
     */
    public TagKeyObject [] getDeleteTags() {
        return this.DeleteTags;
    }

    /**
     * Set The tags to be disassociated. This API must contain either `ReplaceTags` or `DeleteTag`, and these two parameters cannot include the same tag keys. This parameter can be omitted, but it cannot be an empty array.
     * @param DeleteTags The tags to be disassociated. This API must contain either `ReplaceTags` or `DeleteTag`, and these two parameters cannot include the same tag keys. This parameter can be omitted, but it cannot be an empty array.
     */
    public void setDeleteTags(TagKeyObject [] DeleteTags) {
        this.DeleteTags = DeleteTags;
    }

    public ModifyResourceTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceTagsRequest(ModifyResourceTagsRequest source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.ReplaceTags != null) {
            this.ReplaceTags = new Tag[source.ReplaceTags.length];
            for (int i = 0; i < source.ReplaceTags.length; i++) {
                this.ReplaceTags[i] = new Tag(source.ReplaceTags[i]);
            }
        }
        if (source.DeleteTags != null) {
            this.DeleteTags = new TagKeyObject[source.DeleteTags.length];
            for (int i = 0; i < source.DeleteTags.length; i++) {
                this.DeleteTags[i] = new TagKeyObject(source.DeleteTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamArrayObj(map, prefix + "ReplaceTags.", this.ReplaceTags);
        this.setParamArrayObj(map, prefix + "DeleteTags.", this.DeleteTags);

    }
}

