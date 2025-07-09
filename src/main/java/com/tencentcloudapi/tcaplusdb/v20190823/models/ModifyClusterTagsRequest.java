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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterTagsRequest extends AbstractModel {

    /**
    * The ID of the cluster whose tags need to be modified
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The list of tags to add or modify
    */
    @SerializedName("ReplaceTags")
    @Expose
    private TagInfoUnit [] ReplaceTags;

    /**
    * Tags to delete
    */
    @SerializedName("DeleteTags")
    @Expose
    private TagInfoUnit [] DeleteTags;

    /**
     * Get The ID of the cluster whose tags need to be modified 
     * @return ClusterId The ID of the cluster whose tags need to be modified
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The ID of the cluster whose tags need to be modified
     * @param ClusterId The ID of the cluster whose tags need to be modified
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The list of tags to add or modify 
     * @return ReplaceTags The list of tags to add or modify
     */
    public TagInfoUnit [] getReplaceTags() {
        return this.ReplaceTags;
    }

    /**
     * Set The list of tags to add or modify
     * @param ReplaceTags The list of tags to add or modify
     */
    public void setReplaceTags(TagInfoUnit [] ReplaceTags) {
        this.ReplaceTags = ReplaceTags;
    }

    /**
     * Get Tags to delete 
     * @return DeleteTags Tags to delete
     */
    public TagInfoUnit [] getDeleteTags() {
        return this.DeleteTags;
    }

    /**
     * Set Tags to delete
     * @param DeleteTags Tags to delete
     */
    public void setDeleteTags(TagInfoUnit [] DeleteTags) {
        this.DeleteTags = DeleteTags;
    }

    public ModifyClusterTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterTagsRequest(ModifyClusterTagsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ReplaceTags != null) {
            this.ReplaceTags = new TagInfoUnit[source.ReplaceTags.length];
            for (int i = 0; i < source.ReplaceTags.length; i++) {
                this.ReplaceTags[i] = new TagInfoUnit(source.ReplaceTags[i]);
            }
        }
        if (source.DeleteTags != null) {
            this.DeleteTags = new TagInfoUnit[source.DeleteTags.length];
            for (int i = 0; i < source.DeleteTags.length; i++) {
                this.DeleteTags[i] = new TagInfoUnit(source.DeleteTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "ReplaceTags.", this.ReplaceTags);
        this.setParamArrayObj(map, prefix + "DeleteTags.", this.DeleteTags);

    }
}

