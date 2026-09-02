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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDspmAssetDataScanTaskStatusRequest extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskIds")
    @Expose
    private Long [] TaskIds;

    /**
    * <p>Task status.</p><p>Enumeration values: </p><ul><li>1: Recognizing</li><li>2: Recognition terminated</li><li>3: Recognition successful</li><li>4: Recognition failed</li><li>5: Suspended</li><li>0: Unrecognized</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Task ID.</p> 
     * @return TaskIds <p>Task ID.</p>
     */
    public Long [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskIds <p>Task ID.</p>
     */
    public void setTaskIds(Long [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get <p>Task status.</p><p>Enumeration values: </p><ul><li>1: Recognizing</li><li>2: Recognition terminated</li><li>3: Recognition successful</li><li>4: Recognition failed</li><li>5: Suspended</li><li>0: Unrecognized</li></ul> 
     * @return Status <p>Task status.</p><p>Enumeration values: </p><ul><li>1: Recognizing</li><li>2: Recognition terminated</li><li>3: Recognition successful</li><li>4: Recognition failed</li><li>5: Suspended</li><li>0: Unrecognized</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status.</p><p>Enumeration values: </p><ul><li>1: Recognizing</li><li>2: Recognition terminated</li><li>3: Recognition successful</li><li>4: Recognition failed</li><li>5: Suspended</li><li>0: Unrecognized</li></ul>
     * @param Status <p>Task status.</p><p>Enumeration values: </p><ul><li>1: Recognizing</li><li>2: Recognition terminated</li><li>3: Recognition successful</li><li>4: Recognition failed</li><li>5: Suspended</li><li>0: Unrecognized</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public ModifyDspmAssetDataScanTaskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmAssetDataScanTaskStatusRequest(ModifyDspmAssetDataScanTaskStatusRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new Long[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new Long(source.TaskIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

