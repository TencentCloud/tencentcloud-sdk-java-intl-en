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

public class ModifyTableTagsRequest extends AbstractModel{

    /**
    * The ID of the cluster where table tags need to be modified
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The list of tables whose tags need to be modified
    */
    @SerializedName("SelectedTables")
    @Expose
    private SelectedTableInfoNew [] SelectedTables;

    /**
    * The list of tags to add or modify
    */
    @SerializedName("ReplaceTags")
    @Expose
    private TagInfoUnit [] ReplaceTags;

    /**
    * The list of tags to delete
    */
    @SerializedName("DeleteTags")
    @Expose
    private TagInfoUnit [] DeleteTags;

    /**
     * Get The ID of the cluster where table tags need to be modified 
     * @return ClusterId The ID of the cluster where table tags need to be modified
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The ID of the cluster where table tags need to be modified
     * @param ClusterId The ID of the cluster where table tags need to be modified
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The list of tables whose tags need to be modified 
     * @return SelectedTables The list of tables whose tags need to be modified
     */
    public SelectedTableInfoNew [] getSelectedTables() {
        return this.SelectedTables;
    }

    /**
     * Set The list of tables whose tags need to be modified
     * @param SelectedTables The list of tables whose tags need to be modified
     */
    public void setSelectedTables(SelectedTableInfoNew [] SelectedTables) {
        this.SelectedTables = SelectedTables;
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
     * Get The list of tags to delete 
     * @return DeleteTags The list of tags to delete
     */
    public TagInfoUnit [] getDeleteTags() {
        return this.DeleteTags;
    }

    /**
     * Set The list of tags to delete
     * @param DeleteTags The list of tags to delete
     */
    public void setDeleteTags(TagInfoUnit [] DeleteTags) {
        this.DeleteTags = DeleteTags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "SelectedTables.", this.SelectedTables);
        this.setParamArrayObj(map, prefix + "ReplaceTags.", this.ReplaceTags);
        this.setParamArrayObj(map, prefix + "DeleteTags.", this.DeleteTags);

    }
}

