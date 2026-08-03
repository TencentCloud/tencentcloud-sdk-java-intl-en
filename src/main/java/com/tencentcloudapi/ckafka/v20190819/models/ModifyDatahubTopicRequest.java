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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDatahubTopicRequest extends AbstractModel {

    /**
    * <p>Elastic topic name</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/86863?from_cn_redirect=1">DescribeDatahubTopics</a></p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Message retention period in milliseconds. Current min value is 60000 ms.</p>
    */
    @SerializedName("RetentionMs")
    @Expose
    private Long RetentionMs;

    /**
    * <p>Topic remark</p><p>Input parameter limit: no more than 64 characters</p>
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * <p>Tag list</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>Elastic topic name</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/86863?from_cn_redirect=1">DescribeDatahubTopics</a></p> 
     * @return Name <p>Elastic topic name</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/86863?from_cn_redirect=1">DescribeDatahubTopics</a></p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Elastic topic name</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/86863?from_cn_redirect=1">DescribeDatahubTopics</a></p>
     * @param Name <p>Elastic topic name</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/86863?from_cn_redirect=1">DescribeDatahubTopics</a></p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Message retention period in milliseconds. Current min value is 60000 ms.</p> 
     * @return RetentionMs <p>Message retention period in milliseconds. Current min value is 60000 ms.</p>
     */
    public Long getRetentionMs() {
        return this.RetentionMs;
    }

    /**
     * Set <p>Message retention period in milliseconds. Current min value is 60000 ms.</p>
     * @param RetentionMs <p>Message retention period in milliseconds. Current min value is 60000 ms.</p>
     */
    public void setRetentionMs(Long RetentionMs) {
        this.RetentionMs = RetentionMs;
    }

    /**
     * Get <p>Topic remark</p><p>Input parameter limit: no more than 64 characters</p> 
     * @return Note <p>Topic remark</p><p>Input parameter limit: no more than 64 characters</p>
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set <p>Topic remark</p><p>Input parameter limit: no more than 64 characters</p>
     * @param Note <p>Topic remark</p><p>Input parameter limit: no more than 64 characters</p>
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get <p>Tag list</p> 
     * @return Tags <p>Tag list</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag list</p>
     * @param Tags <p>Tag list</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public ModifyDatahubTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDatahubTopicRequest(ModifyDatahubTopicRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RetentionMs != null) {
            this.RetentionMs = new Long(source.RetentionMs);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RetentionMs", this.RetentionMs);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

