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

public class LicenseBindScheduleItem extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Binding status. 0: initialization; 1: successful; 2: failed; 3: skipped.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Error message
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * Fixing suggestion
    */
    @SerializedName("FixMessage")
    @Expose
    private String FixMessage;

    /**
     * Get Instance ID. 
     * @return Quuid Instance ID.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Instance ID.
     * @param Quuid Instance ID.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Binding status. 0: initialization; 1: successful; 2: failed; 3: skipped. 
     * @return Status Binding status. 0: initialization; 1: successful; 2: failed; 3: skipped.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Binding status. 0: initialization; 1: successful; 2: failed; 3: skipped.
     * @param Status Binding status. 0: initialization; 1: successful; 2: failed; 3: skipped.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Error message 
     * @return ErrMsg Error message
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set Error message
     * @param ErrMsg Error message
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get Fixing suggestion 
     * @return FixMessage Fixing suggestion
     */
    public String getFixMessage() {
        return this.FixMessage;
    }

    /**
     * Set Fixing suggestion
     * @param FixMessage Fixing suggestion
     */
    public void setFixMessage(String FixMessage) {
        this.FixMessage = FixMessage;
    }

    public LicenseBindScheduleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseBindScheduleItem(LicenseBindScheduleItem source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.FixMessage != null) {
            this.FixMessage = new String(source.FixMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "FixMessage", this.FixMessage);

    }
}

