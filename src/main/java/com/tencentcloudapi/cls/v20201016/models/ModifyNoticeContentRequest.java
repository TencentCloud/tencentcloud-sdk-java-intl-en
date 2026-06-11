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

public class ModifyNoticeContentRequest extends AbstractModel {

    /**
    * Notification content template ID. Obtain the notification content template ID by searching the notification content template (https://www.tencentcloud.com/document/api/614/111714?from_cn_redirect=1).
    */
    @SerializedName("NoticeContentId")
    @Expose
    private String NoticeContentId;

    /**
    * Notification content template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Content language of the notification.

0-Chinese by default, 1-English
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Notification content template details.
    */
    @SerializedName("NoticeContents")
    @Expose
    private NoticeContent [] NoticeContents;

    /**
     * Get Notification content template ID. Obtain the notification content template ID by searching the notification content template (https://www.tencentcloud.com/document/api/614/111714?from_cn_redirect=1). 
     * @return NoticeContentId Notification content template ID. Obtain the notification content template ID by searching the notification content template (https://www.tencentcloud.com/document/api/614/111714?from_cn_redirect=1).
     */
    public String getNoticeContentId() {
        return this.NoticeContentId;
    }

    /**
     * Set Notification content template ID. Obtain the notification content template ID by searching the notification content template (https://www.tencentcloud.com/document/api/614/111714?from_cn_redirect=1).
     * @param NoticeContentId Notification content template ID. Obtain the notification content template ID by searching the notification content template (https://www.tencentcloud.com/document/api/614/111714?from_cn_redirect=1).
     */
    public void setNoticeContentId(String NoticeContentId) {
        this.NoticeContentId = NoticeContentId;
    }

    /**
     * Get Notification content template name. 
     * @return Name Notification content template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Notification content template name.
     * @param Name Notification content template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Content language of the notification.

0-Chinese by default, 1-English 
     * @return Type Content language of the notification.

0-Chinese by default, 1-English
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Content language of the notification.

0-Chinese by default, 1-English
     * @param Type Content language of the notification.

0-Chinese by default, 1-English
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Notification content template details. 
     * @return NoticeContents Notification content template details.
     */
    public NoticeContent [] getNoticeContents() {
        return this.NoticeContents;
    }

    /**
     * Set Notification content template details.
     * @param NoticeContents Notification content template details.
     */
    public void setNoticeContents(NoticeContent [] NoticeContents) {
        this.NoticeContents = NoticeContents;
    }

    public ModifyNoticeContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNoticeContentRequest(ModifyNoticeContentRequest source) {
        if (source.NoticeContentId != null) {
            this.NoticeContentId = new String(source.NoticeContentId);
        }
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
        this.setParamSimple(map, prefix + "NoticeContentId", this.NoticeContentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "NoticeContents.", this.NoticeContents);

    }
}

