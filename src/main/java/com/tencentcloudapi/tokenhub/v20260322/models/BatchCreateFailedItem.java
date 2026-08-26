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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchCreateFailedItem extends AbstractModel {

    /**
    * Serial number of the failed item (starting from 1, corresponding to the suffix number).
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * Name of the failed item.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Failure reason.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get Serial number of the failed item (starting from 1, corresponding to the suffix number). 
     * @return Index Serial number of the failed item (starting from 1, corresponding to the suffix number).
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set Serial number of the failed item (starting from 1, corresponding to the suffix number).
     * @param Index Serial number of the failed item (starting from 1, corresponding to the suffix number).
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get Name of the failed item. 
     * @return Name Name of the failed item.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the failed item.
     * @param Name Name of the failed item.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Failure reason. 
     * @return Reason Failure reason.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Failure reason.
     * @param Reason Failure reason.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public BatchCreateFailedItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCreateFailedItem(BatchCreateFailedItem source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

