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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduleTask extends AbstractModel{

    /**
    * The scheme ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The scheme status. Valid values:
<li>PROCESSING</li>
<li>FINISH</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The information of the file processed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * The metadata of the source video.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * The output of the scheme.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActivityResultSet")
    @Expose
    private ActivityResult [] ActivityResultSet;

    /**
     * Get The scheme ID. 
     * @return TaskId The scheme ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The scheme ID.
     * @param TaskId The scheme ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The scheme status. Valid values:
<li>PROCESSING</li>
<li>FINISH</li> 
     * @return Status The scheme status. Valid values:
<li>PROCESSING</li>
<li>FINISH</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The scheme status. Valid values:
<li>PROCESSING</li>
<li>FINISH</li>
     * @param Status The scheme status. Valid values:
<li>PROCESSING</li>
<li>FINISH</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The information of the file processed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InputInfo The information of the file processed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set The information of the file processed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InputInfo The information of the file processed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get The metadata of the source video.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetaData The metadata of the source video.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set The metadata of the source video.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetaData The metadata of the source video.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get The output of the scheme.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActivityResultSet The output of the scheme.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ActivityResult [] getActivityResultSet() {
        return this.ActivityResultSet;
    }

    /**
     * Set The output of the scheme.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActivityResultSet The output of the scheme.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActivityResultSet(ActivityResult [] ActivityResultSet) {
        this.ActivityResultSet = ActivityResultSet;
    }

    public ScheduleTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduleTask(ScheduleTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.ActivityResultSet != null) {
            this.ActivityResultSet = new ActivityResult[source.ActivityResultSet.length];
            for (int i = 0; i < source.ActivityResultSet.length; i++) {
                this.ActivityResultSet[i] = new ActivityResult(source.ActivityResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamArrayObj(map, prefix + "ActivityResultSet.", this.ActivityResultSet);

    }
}

