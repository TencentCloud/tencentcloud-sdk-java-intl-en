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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseBindTaskDetail extends AbstractModel {

    /**
    * CVM UUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Error message
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 0-in progress; 1-succeeded; 2-failed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Fix suggestion
    */
    @SerializedName("FixMessage")
    @Expose
    private String FixMessage;

    /**
    * Additional information of machine
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get CVM UUID 
     * @return Quuid CVM UUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set CVM UUID
     * @param Quuid CVM UUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
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
     * Get 0-in progress; 1-succeeded; 2-failed 
     * @return Status 0-in progress; 1-succeeded; 2-failed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0-in progress; 1-succeeded; 2-failed
     * @param Status 0-in progress; 1-succeeded; 2-failed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Fix suggestion 
     * @return FixMessage Fix suggestion
     */
    public String getFixMessage() {
        return this.FixMessage;
    }

    /**
     * Set Fix suggestion
     * @param FixMessage Fix suggestion
     */
    public void setFixMessage(String FixMessage) {
        this.FixMessage = FixMessage;
    }

    /**
     * Get Additional information of machine
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineExtraInfo Additional information of machine
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Additional information of machine
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineExtraInfo Additional information of machine
Note: This field may return null, indicating that no valid values can be obtained.
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

