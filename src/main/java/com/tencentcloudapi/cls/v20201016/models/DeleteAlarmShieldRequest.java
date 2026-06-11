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

public class DeleteAlarmShieldRequest extends AbstractModel {

    /**
    * Blocking rule id. Retrieve the blocking rule id by [searching for alert masking configuration rules](https://www.tencentcloud.com/document/api/614/103650?from_cn_redirect=1).
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Notification channel group id. Retrieve the notification channel group id by [searching alert masking configuration rules](https://www.tencentcloud.com/document/api/614/103650?from_cn_redirect=1).
    */
    @SerializedName("AlarmNoticeId")
    @Expose
    private String AlarmNoticeId;

    /**
     * Get Blocking rule id. Retrieve the blocking rule id by [searching for alert masking configuration rules](https://www.tencentcloud.com/document/api/614/103650?from_cn_redirect=1). 
     * @return TaskId Blocking rule id. Retrieve the blocking rule id by [searching for alert masking configuration rules](https://www.tencentcloud.com/document/api/614/103650?from_cn_redirect=1).
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Blocking rule id. Retrieve the blocking rule id by [searching for alert masking configuration rules](https://www.tencentcloud.com/document/api/614/103650?from_cn_redirect=1).
     * @param TaskId Blocking rule id. Retrieve the blocking rule id by [searching for alert masking configuration rules](https://www.tencentcloud.com/document/api/614/103650?from_cn_redirect=1).
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Notification channel group id. Retrieve the notification channel group id by [searching alert masking configuration rules](https://www.tencentcloud.com/document/api/614/103650?from_cn_redirect=1). 
     * @return AlarmNoticeId Notification channel group id. Retrieve the notification channel group id by [searching alert masking configuration rules](https://www.tencentcloud.com/document/api/614/103650?from_cn_redirect=1).
     */
    public String getAlarmNoticeId() {
        return this.AlarmNoticeId;
    }

    /**
     * Set Notification channel group id. Retrieve the notification channel group id by [searching alert masking configuration rules](https://www.tencentcloud.com/document/api/614/103650?from_cn_redirect=1).
     * @param AlarmNoticeId Notification channel group id. Retrieve the notification channel group id by [searching alert masking configuration rules](https://www.tencentcloud.com/document/api/614/103650?from_cn_redirect=1).
     */
    public void setAlarmNoticeId(String AlarmNoticeId) {
        this.AlarmNoticeId = AlarmNoticeId;
    }

    public DeleteAlarmShieldRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAlarmShieldRequest(DeleteAlarmShieldRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.AlarmNoticeId != null) {
            this.AlarmNoticeId = new String(source.AlarmNoticeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "AlarmNoticeId", this.AlarmNoticeId);

    }
}

