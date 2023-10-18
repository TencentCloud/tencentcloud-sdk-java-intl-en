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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyK8sApiAbnormalEventStatusRequest extends AbstractModel {

    /**
    * Event ID set
    */
    @SerializedName("EventIDSet")
    @Expose
    private Long [] EventIDSet;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Event ID set 
     * @return EventIDSet Event ID set
     */
    public Long [] getEventIDSet() {
        return this.EventIDSet;
    }

    /**
     * Set Event ID set
     * @param EventIDSet Event ID set
     */
    public void setEventIDSet(Long [] EventIDSet) {
        this.EventIDSet = EventIDSet;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyK8sApiAbnormalEventStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyK8sApiAbnormalEventStatusRequest(ModifyK8sApiAbnormalEventStatusRequest source) {
        if (source.EventIDSet != null) {
            this.EventIDSet = new Long[source.EventIDSet.length];
            for (int i = 0; i < source.EventIDSet.length; i++) {
                this.EventIDSet[i] = new Long(source.EventIDSet[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EventIDSet.", this.EventIDSet);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

