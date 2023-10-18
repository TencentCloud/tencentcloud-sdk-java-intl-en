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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWhitelistRequest extends AbstractModel {

    /**
    * Instance ID, such as taw-123
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * uin: business identifier
    */
    @SerializedName("WhitelistUin")
    @Expose
    private String WhitelistUin;

    /**
    * Business identifier
    */
    @SerializedName("Aid")
    @Expose
    private String Aid;

    /**
     * Get Instance ID, such as taw-123 
     * @return InstanceID Instance ID, such as taw-123
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID, such as taw-123
     * @param InstanceID Instance ID, such as taw-123
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
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

    /**
     * Get uin: business identifier 
     * @return WhitelistUin uin: business identifier
     */
    public String getWhitelistUin() {
        return this.WhitelistUin;
    }

    /**
     * Set uin: business identifier
     * @param WhitelistUin uin: business identifier
     */
    public void setWhitelistUin(String WhitelistUin) {
        this.WhitelistUin = WhitelistUin;
    }

    /**
     * Get Business identifier 
     * @return Aid Business identifier
     */
    public String getAid() {
        return this.Aid;
    }

    /**
     * Set Business identifier
     * @param Aid Business identifier
     */
    public void setAid(String Aid) {
        this.Aid = Aid;
    }

    public CreateWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWhitelistRequest(CreateWhitelistRequest source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.WhitelistUin != null) {
            this.WhitelistUin = new String(source.WhitelistUin);
        }
        if (source.Aid != null) {
            this.Aid = new String(source.Aid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "WhitelistUin", this.WhitelistUin);
        this.setParamSimple(map, prefix + "Aid", this.Aid);

    }
}

