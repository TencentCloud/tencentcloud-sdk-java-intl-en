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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDatahubTopicRequest extends AbstractModel{

    /**
    * Topic name, which is a string of up to 128 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Number of partitions, which should be greater than 0.
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * Message retention period in milliseconds. The current minimum value is 60,000 ms.
    */
    @SerializedName("RetentionMs")
    @Expose
    private Long RetentionMs;

    /**
    * Topic remarks, which are a string of up to 128 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * Tag list
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Topic name, which is a string of up to 128 characters. It can contain letters, digits, and hyphens (-) and must start with a letter. 
     * @return Name Topic name, which is a string of up to 128 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Topic name, which is a string of up to 128 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
     * @param Name Topic name, which is a string of up to 128 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Number of partitions, which should be greater than 0. 
     * @return PartitionNum Number of partitions, which should be greater than 0.
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set Number of partitions, which should be greater than 0.
     * @param PartitionNum Number of partitions, which should be greater than 0.
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get Message retention period in milliseconds. The current minimum value is 60,000 ms. 
     * @return RetentionMs Message retention period in milliseconds. The current minimum value is 60,000 ms.
     */
    public Long getRetentionMs() {
        return this.RetentionMs;
    }

    /**
     * Set Message retention period in milliseconds. The current minimum value is 60,000 ms.
     * @param RetentionMs Message retention period in milliseconds. The current minimum value is 60,000 ms.
     */
    public void setRetentionMs(Long RetentionMs) {
        this.RetentionMs = RetentionMs;
    }

    /**
     * Get Topic remarks, which are a string of up to 128 characters. It can contain letters, digits, and hyphens (-) and must start with a letter. 
     * @return Note Topic remarks, which are a string of up to 128 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Topic remarks, which are a string of up to 128 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
     * @param Note Topic remarks, which are a string of up to 128 characters. It can contain letters, digits, and hyphens (-) and must start with a letter.
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get Tag list 
     * @return Tags Tag list
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list
     * @param Tags Tag list
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateDatahubTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDatahubTopicRequest(CreateDatahubTopicRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
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
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "RetentionMs", this.RetentionMs);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

