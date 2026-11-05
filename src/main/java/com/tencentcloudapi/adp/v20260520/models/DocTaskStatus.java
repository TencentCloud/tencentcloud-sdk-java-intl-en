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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocTaskStatus extends AbstractModel {

    /**
    * <p>List of completed historical task types</p>
    */
    @SerializedName("CompletedTaskTypeList")
    @Expose
    private Long [] CompletedTaskTypeList;

    /**
    * <p>List of supported task types in progress</p>
    */
    @SerializedName("OngoingTaskTypeList")
    @Expose
    private Long [] OngoingTaskTypeList;

    /**
     * Get <p>List of completed historical task types</p> 
     * @return CompletedTaskTypeList <p>List of completed historical task types</p>
     */
    public Long [] getCompletedTaskTypeList() {
        return this.CompletedTaskTypeList;
    }

    /**
     * Set <p>List of completed historical task types</p>
     * @param CompletedTaskTypeList <p>List of completed historical task types</p>
     */
    public void setCompletedTaskTypeList(Long [] CompletedTaskTypeList) {
        this.CompletedTaskTypeList = CompletedTaskTypeList;
    }

    /**
     * Get <p>List of supported task types in progress</p> 
     * @return OngoingTaskTypeList <p>List of supported task types in progress</p>
     */
    public Long [] getOngoingTaskTypeList() {
        return this.OngoingTaskTypeList;
    }

    /**
     * Set <p>List of supported task types in progress</p>
     * @param OngoingTaskTypeList <p>List of supported task types in progress</p>
     */
    public void setOngoingTaskTypeList(Long [] OngoingTaskTypeList) {
        this.OngoingTaskTypeList = OngoingTaskTypeList;
    }

    public DocTaskStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocTaskStatus(DocTaskStatus source) {
        if (source.CompletedTaskTypeList != null) {
            this.CompletedTaskTypeList = new Long[source.CompletedTaskTypeList.length];
            for (int i = 0; i < source.CompletedTaskTypeList.length; i++) {
                this.CompletedTaskTypeList[i] = new Long(source.CompletedTaskTypeList[i]);
            }
        }
        if (source.OngoingTaskTypeList != null) {
            this.OngoingTaskTypeList = new Long[source.OngoingTaskTypeList.length];
            for (int i = 0; i < source.OngoingTaskTypeList.length; i++) {
                this.OngoingTaskTypeList[i] = new Long(source.OngoingTaskTypeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CompletedTaskTypeList.", this.CompletedTaskTypeList);
        this.setParamArraySimple(map, prefix + "OngoingTaskTypeList.", this.OngoingTaskTypeList);

    }
}

