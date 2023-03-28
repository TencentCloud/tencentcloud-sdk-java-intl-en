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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntlBatchDetails extends AbstractModel{

    /**
    * The ID of the bulk task.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * The task status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The reason.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * The reason, expressed in Chinese.
    */
    @SerializedName("ReasonZh")
    @Expose
    private String ReasonZh;

    /**
     * Get The ID of the bulk task. 
     * @return Id The ID of the bulk task.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set The ID of the bulk task.
     * @param Id The ID of the bulk task.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get The task status. 
     * @return Status The task status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The task status.
     * @param Status The task status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The reason. 
     * @return Reason The reason.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set The reason.
     * @param Reason The reason.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get The reason, expressed in Chinese. 
     * @return ReasonZh The reason, expressed in Chinese.
     */
    public String getReasonZh() {
        return this.ReasonZh;
    }

    /**
     * Set The reason, expressed in Chinese.
     * @param ReasonZh The reason, expressed in Chinese.
     */
    public void setReasonZh(String ReasonZh) {
        this.ReasonZh = ReasonZh;
    }

    public IntlBatchDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntlBatchDetails(IntlBatchDetails source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.ReasonZh != null) {
            this.ReasonZh = new String(source.ReasonZh);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "ReasonZh", this.ReasonZh);

    }
}

