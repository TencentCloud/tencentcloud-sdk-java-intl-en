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

public class ModifyMachinesLoginTypeTask extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>1-In progress, 2 completed</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Successfully executed count.</p>
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * <p>Host list of failed execution</p>
    */
    @SerializedName("FailList")
    @Expose
    private ModifyLoginTypeFailInfo [] FailList;

    /**
    * <p>List of instance IDs with successful modification.</p>
    */
    @SerializedName("SuccessInstances")
    @Expose
    private String [] SuccessInstances;

    /**
    * <p>List of instance IDs being modified</p>
    */
    @SerializedName("ProgressingInstances")
    @Expose
    private String [] ProgressingInstances;

    /**
    * <p>Number of failed hosts</p>
    */
    @SerializedName("FailedHostCount")
    @Expose
    private Long FailedHostCount;

    /**
     * Get <p>Task ID.</p> 
     * @return Id <p>Task ID.</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Task ID.</p>
     * @param Id <p>Task ID.</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>1-In progress, 2 completed</p> 
     * @return Status <p>1-In progress, 2 completed</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>1-In progress, 2 completed</p>
     * @param Status <p>1-In progress, 2 completed</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Successfully executed count.</p> 
     * @return SuccessCount <p>Successfully executed count.</p>
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set <p>Successfully executed count.</p>
     * @param SuccessCount <p>Successfully executed count.</p>
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get <p>Host list of failed execution</p> 
     * @return FailList <p>Host list of failed execution</p>
     */
    public ModifyLoginTypeFailInfo [] getFailList() {
        return this.FailList;
    }

    /**
     * Set <p>Host list of failed execution</p>
     * @param FailList <p>Host list of failed execution</p>
     */
    public void setFailList(ModifyLoginTypeFailInfo [] FailList) {
        this.FailList = FailList;
    }

    /**
     * Get <p>List of instance IDs with successful modification.</p> 
     * @return SuccessInstances <p>List of instance IDs with successful modification.</p>
     */
    public String [] getSuccessInstances() {
        return this.SuccessInstances;
    }

    /**
     * Set <p>List of instance IDs with successful modification.</p>
     * @param SuccessInstances <p>List of instance IDs with successful modification.</p>
     */
    public void setSuccessInstances(String [] SuccessInstances) {
        this.SuccessInstances = SuccessInstances;
    }

    /**
     * Get <p>List of instance IDs being modified</p> 
     * @return ProgressingInstances <p>List of instance IDs being modified</p>
     */
    public String [] getProgressingInstances() {
        return this.ProgressingInstances;
    }

    /**
     * Set <p>List of instance IDs being modified</p>
     * @param ProgressingInstances <p>List of instance IDs being modified</p>
     */
    public void setProgressingInstances(String [] ProgressingInstances) {
        this.ProgressingInstances = ProgressingInstances;
    }

    /**
     * Get <p>Number of failed hosts</p> 
     * @return FailedHostCount <p>Number of failed hosts</p>
     */
    public Long getFailedHostCount() {
        return this.FailedHostCount;
    }

    /**
     * Set <p>Number of failed hosts</p>
     * @param FailedHostCount <p>Number of failed hosts</p>
     */
    public void setFailedHostCount(Long FailedHostCount) {
        this.FailedHostCount = FailedHostCount;
    }

    public ModifyMachinesLoginTypeTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMachinesLoginTypeTask(ModifyMachinesLoginTypeTask source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailList != null) {
            this.FailList = new ModifyLoginTypeFailInfo[source.FailList.length];
            for (int i = 0; i < source.FailList.length; i++) {
                this.FailList[i] = new ModifyLoginTypeFailInfo(source.FailList[i]);
            }
        }
        if (source.SuccessInstances != null) {
            this.SuccessInstances = new String[source.SuccessInstances.length];
            for (int i = 0; i < source.SuccessInstances.length; i++) {
                this.SuccessInstances[i] = new String(source.SuccessInstances[i]);
            }
        }
        if (source.ProgressingInstances != null) {
            this.ProgressingInstances = new String[source.ProgressingInstances.length];
            for (int i = 0; i < source.ProgressingInstances.length; i++) {
                this.ProgressingInstances[i] = new String(source.ProgressingInstances[i]);
            }
        }
        if (source.FailedHostCount != null) {
            this.FailedHostCount = new Long(source.FailedHostCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamArrayObj(map, prefix + "FailList.", this.FailList);
        this.setParamArraySimple(map, prefix + "SuccessInstances.", this.SuccessInstances);
        this.setParamArraySimple(map, prefix + "ProgressingInstances.", this.ProgressingInstances);
        this.setParamSimple(map, prefix + "FailedHostCount", this.FailedHostCount);

    }
}

