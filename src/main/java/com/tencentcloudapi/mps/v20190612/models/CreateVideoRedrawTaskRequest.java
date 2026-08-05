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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVideoRedrawTaskRequest extends AbstractModel {

    /**
    * <p>Input the url information of the video to be redrawn</p>
    */
    @SerializedName("Input")
    @Expose
    private VideoRedrawInput Input;

    /**
    * <p>User cos information, used to store the generation result</p>
    */
    @SerializedName("CosInfo")
    @Expose
    private VideoRedrawCosInfo CosInfo;

    /**
    * <p>ai redrawing task information</p>
    */
    @SerializedName("TaskInfo")
    @Expose
    private VideoRedrawTaskInfo TaskInfo;

    /**
     * Get <p>Input the url information of the video to be redrawn</p> 
     * @return Input <p>Input the url information of the video to be redrawn</p>
     */
    public VideoRedrawInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>Input the url information of the video to be redrawn</p>
     * @param Input <p>Input the url information of the video to be redrawn</p>
     */
    public void setInput(VideoRedrawInput Input) {
        this.Input = Input;
    }

    /**
     * Get <p>User cos information, used to store the generation result</p> 
     * @return CosInfo <p>User cos information, used to store the generation result</p>
     */
    public VideoRedrawCosInfo getCosInfo() {
        return this.CosInfo;
    }

    /**
     * Set <p>User cos information, used to store the generation result</p>
     * @param CosInfo <p>User cos information, used to store the generation result</p>
     */
    public void setCosInfo(VideoRedrawCosInfo CosInfo) {
        this.CosInfo = CosInfo;
    }

    /**
     * Get <p>ai redrawing task information</p> 
     * @return TaskInfo <p>ai redrawing task information</p>
     */
    public VideoRedrawTaskInfo getTaskInfo() {
        return this.TaskInfo;
    }

    /**
     * Set <p>ai redrawing task information</p>
     * @param TaskInfo <p>ai redrawing task information</p>
     */
    public void setTaskInfo(VideoRedrawTaskInfo TaskInfo) {
        this.TaskInfo = TaskInfo;
    }

    public CreateVideoRedrawTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVideoRedrawTaskRequest(CreateVideoRedrawTaskRequest source) {
        if (source.Input != null) {
            this.Input = new VideoRedrawInput(source.Input);
        }
        if (source.CosInfo != null) {
            this.CosInfo = new VideoRedrawCosInfo(source.CosInfo);
        }
        if (source.TaskInfo != null) {
            this.TaskInfo = new VideoRedrawTaskInfo(source.TaskInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "CosInfo.", this.CosInfo);
        this.setParamObj(map, prefix + "TaskInfo.", this.TaskInfo);

    }
}

