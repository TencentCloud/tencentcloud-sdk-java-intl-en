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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NoticeOnCallUsersInfo extends AbstractModel {

    /**
    * <p>Notification template id</p><p>Parameter format: notice-xxxxxxxx</p>
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * <p>Send group information, corresponding to each configuration in the notification template</p>
    */
    @SerializedName("SendGroups")
    @Expose
    private NoticeSendGroup [] SendGroups;

    /**
     * Get <p>Notification template id</p><p>Parameter format: notice-xxxxxxxx</p> 
     * @return NoticeId <p>Notification template id</p><p>Parameter format: notice-xxxxxxxx</p>
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set <p>Notification template id</p><p>Parameter format: notice-xxxxxxxx</p>
     * @param NoticeId <p>Notification template id</p><p>Parameter format: notice-xxxxxxxx</p>
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    /**
     * Get <p>Send group information, corresponding to each configuration in the notification template</p> 
     * @return SendGroups <p>Send group information, corresponding to each configuration in the notification template</p>
     */
    public NoticeSendGroup [] getSendGroups() {
        return this.SendGroups;
    }

    /**
     * Set <p>Send group information, corresponding to each configuration in the notification template</p>
     * @param SendGroups <p>Send group information, corresponding to each configuration in the notification template</p>
     */
    public void setSendGroups(NoticeSendGroup [] SendGroups) {
        this.SendGroups = SendGroups;
    }

    public NoticeOnCallUsersInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeOnCallUsersInfo(NoticeOnCallUsersInfo source) {
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.SendGroups != null) {
            this.SendGroups = new NoticeSendGroup[source.SendGroups.length];
            for (int i = 0; i < source.SendGroups.length; i++) {
                this.SendGroups[i] = new NoticeSendGroup(source.SendGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamArrayObj(map, prefix + "SendGroups.", this.SendGroups);

    }
}

