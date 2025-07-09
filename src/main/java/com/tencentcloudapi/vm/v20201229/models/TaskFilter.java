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
package com.tencentcloudapi.vm.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskFilter extends AbstractModel {

    /**
    * This field is used to pass in the business type of a task as a filter. `Biztype` is the specific number of the policy, which is used for API scheduling and can be configured in the CMS console. Different `Biztype` values are associated with different business scenarios and moderation policies, so you need to verify the `Biztype` before calling this API. `Biztype` can contain 3–32 digits, letters, and underscores.<br>Note: when this parameter is not passed in, tasks will not be filtered by business type by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BizType")
    @Expose
    private String [] BizType;

    /**
    * This field is used to pass in the type of a video moderation task as a filter. Valid values: **VIDEO** (video on demand moderation), **AUDIO** (audio on demand moderation), **LIVE_VIDEO** (video live streaming moderation), **LIVE_AUDIO** (audio live streaming moderation).<br>Note: when this parameter is not passed in, tasks will not be filtered by task type by default.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * This field is used to pass in the operation suggestion of a video moderation task as a filter. Valid values: **Block**, **Review**, **Pass**.<br>Note: when this parameter is not passed in, tasks will not be filtered by operation suggestion by default.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * This field is used to pass in the status of a moderation task as a filter. Valid values: **FINISH** (task completed), **PENDING** (task pending), **RUNNING** (task in progress), **ERROR** (task error), **CANCELLED** (task canceled).<br>Note: when this parameter is not passed in, tasks will not be filtered by task status by default.
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
     * Get This field is used to pass in the business type of a task as a filter. `Biztype` is the specific number of the policy, which is used for API scheduling and can be configured in the CMS console. Different `Biztype` values are associated with different business scenarios and moderation policies, so you need to verify the `Biztype` before calling this API. `Biztype` can contain 3–32 digits, letters, and underscores.<br>Note: when this parameter is not passed in, tasks will not be filtered by business type by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BizType This field is used to pass in the business type of a task as a filter. `Biztype` is the specific number of the policy, which is used for API scheduling and can be configured in the CMS console. Different `Biztype` values are associated with different business scenarios and moderation policies, so you need to verify the `Biztype` before calling this API. `Biztype` can contain 3–32 digits, letters, and underscores.<br>Note: when this parameter is not passed in, tasks will not be filtered by business type by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBizType() {
        return this.BizType;
    }

    /**
     * Set This field is used to pass in the business type of a task as a filter. `Biztype` is the specific number of the policy, which is used for API scheduling and can be configured in the CMS console. Different `Biztype` values are associated with different business scenarios and moderation policies, so you need to verify the `Biztype` before calling this API. `Biztype` can contain 3–32 digits, letters, and underscores.<br>Note: when this parameter is not passed in, tasks will not be filtered by business type by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BizType This field is used to pass in the business type of a task as a filter. `Biztype` is the specific number of the policy, which is used for API scheduling and can be configured in the CMS console. Different `Biztype` values are associated with different business scenarios and moderation policies, so you need to verify the `Biztype` before calling this API. `Biztype` can contain 3–32 digits, letters, and underscores.<br>Note: when this parameter is not passed in, tasks will not be filtered by business type by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBizType(String [] BizType) {
        this.BizType = BizType;
    }

    /**
     * Get This field is used to pass in the type of a video moderation task as a filter. Valid values: **VIDEO** (video on demand moderation), **AUDIO** (audio on demand moderation), **LIVE_VIDEO** (video live streaming moderation), **LIVE_AUDIO** (audio live streaming moderation).<br>Note: when this parameter is not passed in, tasks will not be filtered by task type by default. 
     * @return Type This field is used to pass in the type of a video moderation task as a filter. Valid values: **VIDEO** (video on demand moderation), **AUDIO** (audio on demand moderation), **LIVE_VIDEO** (video live streaming moderation), **LIVE_AUDIO** (audio live streaming moderation).<br>Note: when this parameter is not passed in, tasks will not be filtered by task type by default.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set This field is used to pass in the type of a video moderation task as a filter. Valid values: **VIDEO** (video on demand moderation), **AUDIO** (audio on demand moderation), **LIVE_VIDEO** (video live streaming moderation), **LIVE_AUDIO** (audio live streaming moderation).<br>Note: when this parameter is not passed in, tasks will not be filtered by task type by default.
     * @param Type This field is used to pass in the type of a video moderation task as a filter. Valid values: **VIDEO** (video on demand moderation), **AUDIO** (audio on demand moderation), **LIVE_VIDEO** (video live streaming moderation), **LIVE_AUDIO** (audio live streaming moderation).<br>Note: when this parameter is not passed in, tasks will not be filtered by task type by default.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get This field is used to pass in the operation suggestion of a video moderation task as a filter. Valid values: **Block**, **Review**, **Pass**.<br>Note: when this parameter is not passed in, tasks will not be filtered by operation suggestion by default. 
     * @return Suggestion This field is used to pass in the operation suggestion of a video moderation task as a filter. Valid values: **Block**, **Review**, **Pass**.<br>Note: when this parameter is not passed in, tasks will not be filtered by operation suggestion by default.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set This field is used to pass in the operation suggestion of a video moderation task as a filter. Valid values: **Block**, **Review**, **Pass**.<br>Note: when this parameter is not passed in, tasks will not be filtered by operation suggestion by default.
     * @param Suggestion This field is used to pass in the operation suggestion of a video moderation task as a filter. Valid values: **Block**, **Review**, **Pass**.<br>Note: when this parameter is not passed in, tasks will not be filtered by operation suggestion by default.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get This field is used to pass in the status of a moderation task as a filter. Valid values: **FINISH** (task completed), **PENDING** (task pending), **RUNNING** (task in progress), **ERROR** (task error), **CANCELLED** (task canceled).<br>Note: when this parameter is not passed in, tasks will not be filtered by task status by default. 
     * @return TaskStatus This field is used to pass in the status of a moderation task as a filter. Valid values: **FINISH** (task completed), **PENDING** (task pending), **RUNNING** (task in progress), **ERROR** (task error), **CANCELLED** (task canceled).<br>Note: when this parameter is not passed in, tasks will not be filtered by task status by default.
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set This field is used to pass in the status of a moderation task as a filter. Valid values: **FINISH** (task completed), **PENDING** (task pending), **RUNNING** (task in progress), **ERROR** (task error), **CANCELLED** (task canceled).<br>Note: when this parameter is not passed in, tasks will not be filtered by task status by default.
     * @param TaskStatus This field is used to pass in the status of a moderation task as a filter. Valid values: **FINISH** (task completed), **PENDING** (task pending), **RUNNING** (task in progress), **ERROR** (task error), **CANCELLED** (task canceled).<br>Note: when this parameter is not passed in, tasks will not be filtered by task status by default.
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public TaskFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskFilter(TaskFilter source) {
        if (source.BizType != null) {
            this.BizType = new String[source.BizType.length];
            for (int i = 0; i < source.BizType.length; i++) {
                this.BizType[i] = new String(source.BizType[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BizType.", this.BizType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);

    }
}

