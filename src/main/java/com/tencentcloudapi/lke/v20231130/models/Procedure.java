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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Procedure extends AbstractModel {

    /**
    * English name of execution process.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Chinese name for display.
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Status: processing, success, failed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Number of consumed tokens.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Debugging information.
    */
    @SerializedName("Debugging")
    @Expose
    private ProcedureDebugging Debugging;

    /**
    * Billing resource status, 1: available; 2: unavailable.
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
     * Get English name of execution process. 
     * @return Name English name of execution process.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set English name of execution process.
     * @param Name English name of execution process.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Chinese name for display. 
     * @return Title Chinese name for display.
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Chinese name for display.
     * @param Title Chinese name for display.
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Status: processing, success, failed. 
     * @return Status Status: processing, success, failed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status: processing, success, failed.
     * @param Status Status: processing, success, failed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Number of consumed tokens. 
     * @return Count Number of consumed tokens.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of consumed tokens.
     * @param Count Number of consumed tokens.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Debugging information. 
     * @return Debugging Debugging information.
     */
    public ProcedureDebugging getDebugging() {
        return this.Debugging;
    }

    /**
     * Set Debugging information.
     * @param Debugging Debugging information.
     */
    public void setDebugging(ProcedureDebugging Debugging) {
        this.Debugging = Debugging;
    }

    /**
     * Get Billing resource status, 1: available; 2: unavailable. 
     * @return ResourceStatus Billing resource status, 1: available; 2: unavailable.
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set Billing resource status, 1: available; 2: unavailable.
     * @param ResourceStatus Billing resource status, 1: available; 2: unavailable.
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    public Procedure() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Procedure(Procedure source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Debugging != null) {
            this.Debugging = new ProcedureDebugging(source.Debugging);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "Debugging.", this.Debugging);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);

    }
}

