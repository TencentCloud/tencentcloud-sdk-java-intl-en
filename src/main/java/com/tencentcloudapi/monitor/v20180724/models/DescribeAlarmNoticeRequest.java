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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmNoticeRequest extends AbstractModel{

    /**
    * Module name. Enter "monitor" here
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Alarm notification template ID
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

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
     * Get Alarm notification template ID 
     * @return NoticeId Alarm notification template ID
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set Alarm notification template ID
     * @param NoticeId Alarm notification template ID
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    public DescribeAlarmNoticeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmNoticeRequest(DescribeAlarmNoticeRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);

    }
}

