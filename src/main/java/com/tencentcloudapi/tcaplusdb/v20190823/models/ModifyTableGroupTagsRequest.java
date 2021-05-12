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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTableGroupTagsRequest extends AbstractModel{

    /**
    * The ID of the cluster where table group tags need to be modified
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The ID of the table group whose tags need to be modified
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

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
     * Get The ID of the cluster where table group tags need to be modified 
     * @return ClusterId The ID of the cluster where table group tags need to be modified
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The ID of the cluster where table group tags need to be modified
     * @param ClusterId The ID of the cluster where table group tags need to be modified
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The ID of the table group whose tags need to be modified 
     * @return TableGroupId The ID of the table group whose tags need to be modified
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set The ID of the table group whose tags need to be modified
     * @param TableGroupId The ID of the table group whose tags need to be modified
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
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

    public ModifyTableGroupTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTableGroupTagsRequest(ModifyTableGroupTagsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
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
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamArrayObj(map, prefix + "ReplaceTags.", this.ReplaceTags);
        this.setParamArrayObj(map, prefix + "DeleteTags.", this.DeleteTags);

    }
}

