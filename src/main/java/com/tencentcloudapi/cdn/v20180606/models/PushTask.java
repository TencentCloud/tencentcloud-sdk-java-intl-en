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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PushTask extends AbstractModel{

    /**
    * Prefetch task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Prefetched URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Prefetch task status
`fail`: prefetch failed
`done`: prefetch succeeded
`process`: prefetch in progress
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Prefetch progress in percentage
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * Prefetch task submission time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Prefetch region
`mainland`: within Mainland China
`overseas`: outside Mainland China
`global`: global
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Prefetch task update time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Prefetch task ID 
     * @return TaskId Prefetch task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Prefetch task ID
     * @param TaskId Prefetch task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Prefetched URL 
     * @return Url Prefetched URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Prefetched URL
     * @param Url Prefetched URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Prefetch task status
`fail`: prefetch failed
`done`: prefetch succeeded
`process`: prefetch in progress 
     * @return Status Prefetch task status
`fail`: prefetch failed
`done`: prefetch succeeded
`process`: prefetch in progress
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Prefetch task status
`fail`: prefetch failed
`done`: prefetch succeeded
`process`: prefetch in progress
     * @param Status Prefetch task status
`fail`: prefetch failed
`done`: prefetch succeeded
`process`: prefetch in progress
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Prefetch progress in percentage 
     * @return Percent Prefetch progress in percentage
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set Prefetch progress in percentage
     * @param Percent Prefetch progress in percentage
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get Prefetch task submission time 
     * @return CreateTime Prefetch task submission time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Prefetch task submission time
     * @param CreateTime Prefetch task submission time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Prefetch region
`mainland`: within Mainland China
`overseas`: outside Mainland China
`global`: global 
     * @return Area Prefetch region
`mainland`: within Mainland China
`overseas`: outside Mainland China
`global`: global
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Prefetch region
`mainland`: within Mainland China
`overseas`: outside Mainland China
`global`: global
     * @param Area Prefetch region
`mainland`: within Mainland China
`overseas`: outside Mainland China
`global`: global
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Prefetch task update time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Prefetch task update time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Prefetch task update time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Prefetch task update time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

