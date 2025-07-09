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

public class DeleteAlarmNoticesRequest extends AbstractModel {

    /**
    * Module name. Enter "monitor" here
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Alarm notification template ID list
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
    * Binding between a notification template and a policy
    */
    @SerializedName("NoticeBindPolicys")
    @Expose
    private NoticeBindPolicys [] NoticeBindPolicys;

    /**
     * Get Module name. Enter "monitor" here 
     * @return Module Module name. Enter "monitor" here
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Module name. Enter "monitor" here
     * @param Module Module name. Enter "monitor" here
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Alarm notification template ID list 
     * @return NoticeIds Alarm notification template ID list
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set Alarm notification template ID list
     * @param NoticeIds Alarm notification template ID list
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    /**
     * Get Binding between a notification template and a policy 
     * @return NoticeBindPolicys Binding between a notification template and a policy
     */
    public NoticeBindPolicys [] getNoticeBindPolicys() {
        return this.NoticeBindPolicys;
    }

    /**
     * Set Binding between a notification template and a policy
     * @param NoticeBindPolicys Binding between a notification template and a policy
     */
    public void setNoticeBindPolicys(NoticeBindPolicys [] NoticeBindPolicys) {
        this.NoticeBindPolicys = NoticeBindPolicys;
    }

    public DeleteAlarmNoticesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAlarmNoticesRequest(DeleteAlarmNoticesRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.NoticeIds != null) {
            this.NoticeIds = new String[source.NoticeIds.length];
            for (int i = 0; i < source.NoticeIds.length; i++) {
                this.NoticeIds[i] = new String(source.NoticeIds[i]);
            }
        }
        if (source.NoticeBindPolicys != null) {
            this.NoticeBindPolicys = new NoticeBindPolicys[source.NoticeBindPolicys.length];
            for (int i = 0; i < source.NoticeBindPolicys.length; i++) {
                this.NoticeBindPolicys[i] = new NoticeBindPolicys(source.NoticeBindPolicys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArraySimple(map, prefix + "NoticeIds.", this.NoticeIds);
        this.setParamArrayObj(map, prefix + "NoticeBindPolicys.", this.NoticeBindPolicys);

    }
}

