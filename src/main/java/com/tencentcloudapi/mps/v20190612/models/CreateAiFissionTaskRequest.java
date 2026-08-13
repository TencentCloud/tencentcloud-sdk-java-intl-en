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

public class CreateAiFissionTaskRequest extends AbstractModel {

    /**
    * <p>ai video fission input information</p>
    */
    @SerializedName("Input")
    @Expose
    private AiFissionInput Input;

    /**
    * <p>User cos information</p>
    */
    @SerializedName("CosInfo")
    @Expose
    private VideoDramaCosInfo CosInfo;

    /**
    * <p>ai video fission task info</p>
    */
    @SerializedName("TaskInfo")
    @Expose
    private FissionTaskInfo TaskInfo;

    /**
     * Get <p>ai video fission input information</p> 
     * @return Input <p>ai video fission input information</p>
     */
    public AiFissionInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>ai video fission input information</p>
     * @param Input <p>ai video fission input information</p>
     */
    public void setInput(AiFissionInput Input) {
        this.Input = Input;
    }

    /**
     * Get <p>User cos information</p> 
     * @return CosInfo <p>User cos information</p>
     */
    public VideoDramaCosInfo getCosInfo() {
        return this.CosInfo;
    }

    /**
     * Set <p>User cos information</p>
     * @param CosInfo <p>User cos information</p>
     */
    public void setCosInfo(VideoDramaCosInfo CosInfo) {
        this.CosInfo = CosInfo;
    }

    /**
     * Get <p>ai video fission task info</p> 
     * @return TaskInfo <p>ai video fission task info</p>
     */
    public FissionTaskInfo getTaskInfo() {
        return this.TaskInfo;
    }

    /**
     * Set <p>ai video fission task info</p>
     * @param TaskInfo <p>ai video fission task info</p>
     */
    public void setTaskInfo(FissionTaskInfo TaskInfo) {
        this.TaskInfo = TaskInfo;
    }

    public CreateAiFissionTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAiFissionTaskRequest(CreateAiFissionTaskRequest source) {
        if (source.Input != null) {
            this.Input = new AiFissionInput(source.Input);
        }
        if (source.CosInfo != null) {
            this.CosInfo = new VideoDramaCosInfo(source.CosInfo);
        }
        if (source.TaskInfo != null) {
            this.TaskInfo = new FissionTaskInfo(source.TaskInfo);
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

