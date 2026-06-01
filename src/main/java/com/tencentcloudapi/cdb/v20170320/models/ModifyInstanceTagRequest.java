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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceTagRequest extends AbstractModel {

    /**
    * Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Tags to add or modify. ReplaceTags or DeleteTags is mandatory to fill in one.
    */
    @SerializedName("ReplaceTags")
    @Expose
    private TagInfo [] ReplaceTags;

    /**
    * Tag to delete. ReplaceTags or DeleteTags is mandatory to fill in one.
    */
    @SerializedName("DeleteTags")
    @Expose
    private TagInfo [] DeleteTags;

    /**
     * Get Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Tags to add or modify. ReplaceTags or DeleteTags is mandatory to fill in one. 
     * @return ReplaceTags Tags to add or modify. ReplaceTags or DeleteTags is mandatory to fill in one.
     */
    public TagInfo [] getReplaceTags() {
        return this.ReplaceTags;
    }

    /**
     * Set Tags to add or modify. ReplaceTags or DeleteTags is mandatory to fill in one.
     * @param ReplaceTags Tags to add or modify. ReplaceTags or DeleteTags is mandatory to fill in one.
     */
    public void setReplaceTags(TagInfo [] ReplaceTags) {
        this.ReplaceTags = ReplaceTags;
    }

    /**
     * Get Tag to delete. ReplaceTags or DeleteTags is mandatory to fill in one. 
     * @return DeleteTags Tag to delete. ReplaceTags or DeleteTags is mandatory to fill in one.
     */
    public TagInfo [] getDeleteTags() {
        return this.DeleteTags;
    }

    /**
     * Set Tag to delete. ReplaceTags or DeleteTags is mandatory to fill in one.
     * @param DeleteTags Tag to delete. ReplaceTags or DeleteTags is mandatory to fill in one.
     */
    public void setDeleteTags(TagInfo [] DeleteTags) {
        this.DeleteTags = DeleteTags;
    }

    public ModifyInstanceTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceTagRequest(ModifyInstanceTagRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ReplaceTags != null) {
            this.ReplaceTags = new TagInfo[source.ReplaceTags.length];
            for (int i = 0; i < source.ReplaceTags.length; i++) {
                this.ReplaceTags[i] = new TagInfo(source.ReplaceTags[i]);
            }
        }
        if (source.DeleteTags != null) {
            this.DeleteTags = new TagInfo[source.DeleteTags.length];
            for (int i = 0; i < source.DeleteTags.length; i++) {
                this.DeleteTags[i] = new TagInfo(source.DeleteTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "ReplaceTags.", this.ReplaceTags);
        this.setParamArrayObj(map, prefix + "DeleteTags.", this.DeleteTags);

    }
}

