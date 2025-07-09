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

public class TaskLockStatus extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Lock Holder
    */
    @SerializedName("Locker")
    @Expose
    private String Locker;

    /**
    * Is the current operating user the lock holder? 1 means yes, 0 means no
    */
    @SerializedName("IsLocker")
    @Expose
    private Long IsLocker;

    /**
    * Is lock contention possible? 1 means yes, 0 means no
    */
    @SerializedName("IsRob")
    @Expose
    private Long IsRob;

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Lock Holder 
     * @return Locker Lock Holder
     */
    public String getLocker() {
        return this.Locker;
    }

    /**
     * Set Lock Holder
     * @param Locker Lock Holder
     */
    public void setLocker(String Locker) {
        this.Locker = Locker;
    }

    /**
     * Get Is the current operating user the lock holder? 1 means yes, 0 means no 
     * @return IsLocker Is the current operating user the lock holder? 1 means yes, 0 means no
     */
    public Long getIsLocker() {
        return this.IsLocker;
    }

    /**
     * Set Is the current operating user the lock holder? 1 means yes, 0 means no
     * @param IsLocker Is the current operating user the lock holder? 1 means yes, 0 means no
     */
    public void setIsLocker(Long IsLocker) {
        this.IsLocker = IsLocker;
    }

    /**
     * Get Is lock contention possible? 1 means yes, 0 means no 
     * @return IsRob Is lock contention possible? 1 means yes, 0 means no
     */
    public Long getIsRob() {
        return this.IsRob;
    }

    /**
     * Set Is lock contention possible? 1 means yes, 0 means no
     * @param IsRob Is lock contention possible? 1 means yes, 0 means no
     */
    public void setIsRob(Long IsRob) {
        this.IsRob = IsRob;
    }

    public TaskLockStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskLockStatus(TaskLockStatus source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Locker != null) {
            this.Locker = new String(source.Locker);
        }
        if (source.IsLocker != null) {
            this.IsLocker = new Long(source.IsLocker);
        }
        if (source.IsRob != null) {
            this.IsRob = new Long(source.IsRob);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Locker", this.Locker);
        this.setParamSimple(map, prefix + "IsLocker", this.IsLocker);
        this.setParamSimple(map, prefix + "IsRob", this.IsRob);

    }
}

