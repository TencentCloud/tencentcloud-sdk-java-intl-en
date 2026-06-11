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

public class DeleteNoticeContentRequest extends AbstractModel {

    /**
    * Notification content template ID. Get the notification content template ID by searching the notification content template (https://www.tencentcloud.com/document/api/614/111714?from_cn_redirect=1).
    */
    @SerializedName("NoticeContentId")
    @Expose
    private String NoticeContentId;

    /**
     * Get Notification content template ID. Get the notification content template ID by searching the notification content template (https://www.tencentcloud.com/document/api/614/111714?from_cn_redirect=1). 
     * @return NoticeContentId Notification content template ID. Get the notification content template ID by searching the notification content template (https://www.tencentcloud.com/document/api/614/111714?from_cn_redirect=1).
     */
    public String getNoticeContentId() {
        return this.NoticeContentId;
    }

    /**
     * Set Notification content template ID. Get the notification content template ID by searching the notification content template (https://www.tencentcloud.com/document/api/614/111714?from_cn_redirect=1).
     * @param NoticeContentId Notification content template ID. Get the notification content template ID by searching the notification content template (https://www.tencentcloud.com/document/api/614/111714?from_cn_redirect=1).
     */
    public void setNoticeContentId(String NoticeContentId) {
        this.NoticeContentId = NoticeContentId;
    }

    public DeleteNoticeContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteNoticeContentRequest(DeleteNoticeContentRequest source) {
        if (source.NoticeContentId != null) {
            this.NoticeContentId = new String(source.NoticeContentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeContentId", this.NoticeContentId);

    }
}

