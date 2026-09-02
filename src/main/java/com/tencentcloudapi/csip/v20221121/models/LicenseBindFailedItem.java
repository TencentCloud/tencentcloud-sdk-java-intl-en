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

public class LicenseBindFailedItem extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Reason for failure
    */
    @SerializedName("ExceptionMessage")
    @Expose
    private String ExceptionMessage;

    /**
    * Fixing suggestion
    */
    @SerializedName("FixMessage")
    @Expose
    private String FixMessage;

    /**
    * Additional Information on Machine
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Reason for failure 
     * @return ExceptionMessage Reason for failure
     */
    public String getExceptionMessage() {
        return this.ExceptionMessage;
    }

    /**
     * Set Reason for failure
     * @param ExceptionMessage Reason for failure
     */
    public void setExceptionMessage(String ExceptionMessage) {
        this.ExceptionMessage = ExceptionMessage;
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

    /**
     * Get Additional Information on Machine 
     * @return MachineExtraInfo Additional Information on Machine
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Additional Information on Machine
     * @param MachineExtraInfo Additional Information on Machine
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public LicenseBindFailedItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseBindFailedItem(LicenseBindFailedItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ExceptionMessage != null) {
            this.ExceptionMessage = new String(source.ExceptionMessage);
        }
        if (source.FixMessage != null) {
            this.FixMessage = new String(source.FixMessage);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ExceptionMessage", this.ExceptionMessage);
        this.setParamSimple(map, prefix + "FixMessage", this.FixMessage);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

