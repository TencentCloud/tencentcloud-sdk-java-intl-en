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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Dependence extends AbstractModel{

    /**
    * Dependency start task name 
    */
    @SerializedName("StartTask")
    @Expose
    private String StartTask;

    /**
    * Dependency end task name 
    */
    @SerializedName("EndTask")
    @Expose
    private String EndTask;

    /**
     * Get Dependency start task name  
     * @return StartTask Dependency start task name 
     */
    public String getStartTask() {
        return this.StartTask;
    }

    /**
     * Set Dependency start task name 
     * @param StartTask Dependency start task name 
     */
    public void setStartTask(String StartTask) {
        this.StartTask = StartTask;
    }

    /**
     * Get Dependency end task name  
     * @return EndTask Dependency end task name 
     */
    public String getEndTask() {
        return this.EndTask;
    }

    /**
     * Set Dependency end task name 
     * @param EndTask Dependency end task name 
     */
    public void setEndTask(String EndTask) {
        this.EndTask = EndTask;
    }

    public Dependence() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Dependence(Dependence source) {
        if (source.StartTask != null) {
            this.StartTask = new String(source.StartTask);
        }
        if (source.EndTask != null) {
            this.EndTask = new String(source.EndTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTask", this.StartTask);
        this.setParamSimple(map, prefix + "EndTask", this.EndTask);

    }
}

