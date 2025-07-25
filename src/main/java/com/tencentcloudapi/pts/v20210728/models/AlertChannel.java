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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlertChannel extends AbstractModel {

    /**
    * Notification template ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * AMP consumer ID.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AMPConsumerId")
    @Expose
    private String AMPConsumerId;

    /**
     * Get Notification template ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return NoticeId Notification template ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set Notification template ID.

Note: This field may return null, indicating that no valid value is found.
     * @param NoticeId Notification template ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    /**
     * Get AMP consumer ID.

Note: This field may return null, indicating that no valid value is found. 
     * @return AMPConsumerId AMP consumer ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getAMPConsumerId() {
        return this.AMPConsumerId;
    }

    /**
     * Set AMP consumer ID.

Note: This field may return null, indicating that no valid value is found.
     * @param AMPConsumerId AMP consumer ID.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAMPConsumerId(String AMPConsumerId) {
        this.AMPConsumerId = AMPConsumerId;
    }

    public AlertChannel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlertChannel(AlertChannel source) {
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.AMPConsumerId != null) {
            this.AMPConsumerId = new String(source.AMPConsumerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamSimple(map, prefix + "AMPConsumerId", this.AMPConsumerId);

    }
}

