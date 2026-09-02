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

public class LicenseBindTaskDetail extends AbstractModel {

    /**
    * <p>UUID of the CVM instance</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>Error information.</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * <p>0 in execution, 1 successful, 2 failed</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Repair advice</p>
    */
    @SerializedName("FixMessage")
    @Expose
    private String FixMessage;

    /**
    * <p>Additional information of machine</p>
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get <p>UUID of the CVM instance</p> 
     * @return Quuid <p>UUID of the CVM instance</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>UUID of the CVM instance</p>
     * @param Quuid <p>UUID of the CVM instance</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>Error information.</p> 
     * @return ErrMsg <p>Error information.</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>Error information.</p>
     * @param ErrMsg <p>Error information.</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get <p>0 in execution, 1 successful, 2 failed</p> 
     * @return Status <p>0 in execution, 1 successful, 2 failed</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>0 in execution, 1 successful, 2 failed</p>
     * @param Status <p>0 in execution, 1 successful, 2 failed</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Repair advice</p> 
     * @return FixMessage <p>Repair advice</p>
     */
    public String getFixMessage() {
        return this.FixMessage;
    }

    /**
     * Set <p>Repair advice</p>
     * @param FixMessage <p>Repair advice</p>
     */
    public void setFixMessage(String FixMessage) {
        this.FixMessage = FixMessage;
    }

    /**
     * Get <p>Additional information of machine</p> 
     * @return MachineExtraInfo <p>Additional information of machine</p>
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set <p>Additional information of machine</p>
     * @param MachineExtraInfo <p>Additional information of machine</p>
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public LicenseBindTaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseBindTaskDetail(LicenseBindTaskDetail source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FixMessage", this.FixMessage);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

