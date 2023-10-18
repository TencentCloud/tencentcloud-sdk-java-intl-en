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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDomainBuyLog extends AbstractModel {

    /**
    * The log ID.
    */
    @SerializedName("LogId")
    @Expose
    private Long LogId;

    /**
    * The bulk operation type. Valid values: `new` (register domains), `batch_transfer_prohibition_on` (enable transfer prohibition), `batch_transfer_prohibition_off` (disable transfer prohibition), `batch_update_prohibition_on` (enable update prohibition), `batch_update_prohibition_off` (disable update prohibition).
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The quantity.
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * The execution status. Valid values: `doing`, `done`
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The submission time.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
     * Get The log ID. 
     * @return LogId The log ID.
     */
    public Long getLogId() {
        return this.LogId;
    }

    /**
     * Set The log ID.
     * @param LogId The log ID.
     */
    public void setLogId(Long LogId) {
        this.LogId = LogId;
    }

    /**
     * Get The bulk operation type. Valid values: `new` (register domains), `batch_transfer_prohibition_on` (enable transfer prohibition), `batch_transfer_prohibition_off` (disable transfer prohibition), `batch_update_prohibition_on` (enable update prohibition), `batch_update_prohibition_off` (disable update prohibition). 
     * @return Action The bulk operation type. Valid values: `new` (register domains), `batch_transfer_prohibition_on` (enable transfer prohibition), `batch_transfer_prohibition_off` (disable transfer prohibition), `batch_update_prohibition_on` (enable update prohibition), `batch_update_prohibition_off` (disable update prohibition).
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set The bulk operation type. Valid values: `new` (register domains), `batch_transfer_prohibition_on` (enable transfer prohibition), `batch_transfer_prohibition_off` (disable transfer prohibition), `batch_update_prohibition_on` (enable update prohibition), `batch_update_prohibition_off` (disable update prohibition).
     * @param Action The bulk operation type. Valid values: `new` (register domains), `batch_transfer_prohibition_on` (enable transfer prohibition), `batch_transfer_prohibition_off` (disable transfer prohibition), `batch_update_prohibition_on` (enable update prohibition), `batch_update_prohibition_off` (disable update prohibition).
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get The quantity. 
     * @return Number The quantity.
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set The quantity.
     * @param Number The quantity.
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get The execution status. Valid values: `doing`, `done` 
     * @return Status The execution status. Valid values: `doing`, `done`
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The execution status. Valid values: `doing`, `done`
     * @param Status The execution status. Valid values: `doing`, `done`
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The submission time. 
     * @return CreatedOn The submission time.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set The submission time.
     * @param CreatedOn The submission time.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    public BatchDomainBuyLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDomainBuyLog(BatchDomainBuyLog source) {
        if (source.LogId != null) {
            this.LogId = new Long(source.LogId);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);

    }
}

