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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseUnBindRsp extends AbstractModel {

    /**
    * QUUID CVM uuid, lightweight server uuid, edge computing uuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Reason for failure
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get QUUID CVM uuid, lightweight server uuid, edge computing uuid 
     * @return Quuid QUUID CVM uuid, lightweight server uuid, edge computing uuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set QUUID CVM uuid, lightweight server uuid, edge computing uuid
     * @param Quuid QUUID CVM uuid, lightweight server uuid, edge computing uuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Reason for failure 
     * @return ErrMsg Reason for failure
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set Reason for failure
     * @param ErrMsg Reason for failure
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public LicenseUnBindRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseUnBindRsp(LicenseUnBindRsp source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

