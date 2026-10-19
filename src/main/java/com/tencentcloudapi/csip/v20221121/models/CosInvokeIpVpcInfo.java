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

public class CosInvokeIpVpcInfo extends AbstractModel {

    /**
    * uin of the account to which the vpc belongs
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * App ID of the VPC.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Nickname.
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * VPC ID information
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC name
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
     * Get uin of the account to which the vpc belongs 
     * @return Uin uin of the account to which the vpc belongs
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set uin of the account to which the vpc belongs
     * @param Uin uin of the account to which the vpc belongs
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get App ID of the VPC. 
     * @return AppId App ID of the VPC.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set App ID of the VPC.
     * @param AppId App ID of the VPC.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Nickname. 
     * @return NickName Nickname.
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Nickname.
     * @param NickName Nickname.
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get VPC ID information 
     * @return VpcId VPC ID information
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID information
     * @param VpcId VPC ID information
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC name 
     * @return VpcName VPC name
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name
     * @param VpcName VPC name
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    public CosInvokeIpVpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosInvokeIpVpcInfo(CosInvokeIpVpcInfo source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);

    }
}

