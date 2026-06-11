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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNoticeContentRequest extends AbstractModel {

    /**
    * Template name. Supports a maximum of 255 bytes.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template content language. Valid values: 0: Chinese; 1: English.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Detailed configurations of a template.
    */
    @SerializedName("NoticeContents")
    @Expose
    private NoticeContent [] NoticeContents;

    /**
     * Get Template name. Supports a maximum of 255 bytes. 
     * @return Name Template name. Supports a maximum of 255 bytes.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name. Supports a maximum of 255 bytes.
     * @param Name Template name. Supports a maximum of 255 bytes.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template content language. Valid values: 0: Chinese; 1: English. 
     * @return Type Template content language. Valid values: 0: Chinese; 1: English.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Template content language. Valid values: 0: Chinese; 1: English.
     * @param Type Template content language. Valid values: 0: Chinese; 1: English.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Detailed configurations of a template. 
     * @return NoticeContents Detailed configurations of a template.
     */
    public NoticeContent [] getNoticeContents() {
        return this.NoticeContents;
    }

    /**
     * Set Detailed configurations of a template.
     * @param NoticeContents Detailed configurations of a template.
     */
    public void setNoticeContents(NoticeContent [] NoticeContents) {
        this.NoticeContents = NoticeContents;
    }

    public CreateNoticeContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNoticeContentRequest(CreateNoticeContentRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.NoticeContents != null) {
            this.NoticeContents = new NoticeContent[source.NoticeContents.length];
            for (int i = 0; i < source.NoticeContents.length; i++) {
                this.NoticeContents[i] = new NoticeContent(source.NoticeContents[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "NoticeContents.", this.NoticeContents);

    }
}

