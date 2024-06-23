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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpsTaskCanvasInfoList extends AbstractModel {

    /**
    * Canvas Task Information
    */
    @SerializedName("TasksList")
    @Expose
    private OpsTaskCanvasDto [] TasksList;

    /**
    * Canvas Task Link Information
    */
    @SerializedName("LinksList")
    @Expose
    private OpsTaskLinkInfoDto [] LinksList;

    /**
    * Canvas Cyclic Dependency Task Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CirculateTaskList")
    @Expose
    private OpsTaskCanvasDto CirculateTaskList;

    /**
     * Get Canvas Task Information 
     * @return TasksList Canvas Task Information
     */
    public OpsTaskCanvasDto [] getTasksList() {
        return this.TasksList;
    }

    /**
     * Set Canvas Task Information
     * @param TasksList Canvas Task Information
     */
    public void setTasksList(OpsTaskCanvasDto [] TasksList) {
        this.TasksList = TasksList;
    }

    /**
     * Get Canvas Task Link Information 
     * @return LinksList Canvas Task Link Information
     */
    public OpsTaskLinkInfoDto [] getLinksList() {
        return this.LinksList;
    }

    /**
     * Set Canvas Task Link Information
     * @param LinksList Canvas Task Link Information
     */
    public void setLinksList(OpsTaskLinkInfoDto [] LinksList) {
        this.LinksList = LinksList;
    }

    /**
     * Get Canvas Cyclic Dependency Task Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CirculateTaskList Canvas Cyclic Dependency Task Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public OpsTaskCanvasDto getCirculateTaskList() {
        return this.CirculateTaskList;
    }

    /**
     * Set Canvas Cyclic Dependency Task Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CirculateTaskList Canvas Cyclic Dependency Task Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCirculateTaskList(OpsTaskCanvasDto CirculateTaskList) {
        this.CirculateTaskList = CirculateTaskList;
    }

    public OpsTaskCanvasInfoList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpsTaskCanvasInfoList(OpsTaskCanvasInfoList source) {
        if (source.TasksList != null) {
            this.TasksList = new OpsTaskCanvasDto[source.TasksList.length];
            for (int i = 0; i < source.TasksList.length; i++) {
                this.TasksList[i] = new OpsTaskCanvasDto(source.TasksList[i]);
            }
        }
        if (source.LinksList != null) {
            this.LinksList = new OpsTaskLinkInfoDto[source.LinksList.length];
            for (int i = 0; i < source.LinksList.length; i++) {
                this.LinksList[i] = new OpsTaskLinkInfoDto(source.LinksList[i]);
            }
        }
        if (source.CirculateTaskList != null) {
            this.CirculateTaskList = new OpsTaskCanvasDto(source.CirculateTaskList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TasksList.", this.TasksList);
        this.setParamArrayObj(map, prefix + "LinksList.", this.LinksList);
        this.setParamObj(map, prefix + "CirculateTaskList.", this.CirculateTaskList);

    }
}

