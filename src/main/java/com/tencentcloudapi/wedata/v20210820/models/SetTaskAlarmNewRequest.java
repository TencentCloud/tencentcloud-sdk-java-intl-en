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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetTaskAlarmNewRequest extends AbstractModel {

    /**
    * Setting Task Timeout Alert and Failure Alert Information
    */
    @SerializedName("AlarmInfoList")
    @Expose
    private AlarmInfo [] AlarmInfoList;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get Setting Task Timeout Alert and Failure Alert Information 
     * @return AlarmInfoList Setting Task Timeout Alert and Failure Alert Information
     */
    public AlarmInfo [] getAlarmInfoList() {
        return this.AlarmInfoList;
    }

    /**
     * Set Setting Task Timeout Alert and Failure Alert Information
     * @param AlarmInfoList Setting Task Timeout Alert and Failure Alert Information
     */
    public void setAlarmInfoList(AlarmInfo [] AlarmInfoList) {
        this.AlarmInfoList = AlarmInfoList;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public SetTaskAlarmNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetTaskAlarmNewRequest(SetTaskAlarmNewRequest source) {
        if (source.AlarmInfoList != null) {
            this.AlarmInfoList = new AlarmInfo[source.AlarmInfoList.length];
            for (int i = 0; i < source.AlarmInfoList.length; i++) {
                this.AlarmInfoList[i] = new AlarmInfo(source.AlarmInfoList[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AlarmInfoList.", this.AlarmInfoList);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

