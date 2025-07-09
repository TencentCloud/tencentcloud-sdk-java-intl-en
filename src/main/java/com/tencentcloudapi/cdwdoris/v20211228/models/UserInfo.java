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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfo extends AbstractModel {

    /**
    * Cluster instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Password
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * The IP address of the user link
    */
    @SerializedName("WhiteHost")
    @Expose
    private String WhiteHost;

    /**
    * IP address of the user link before modification
    */
    @SerializedName("OldWhiteHost")
    @Expose
    private String OldWhiteHost;

    /**
    * Description
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * Original password
    */
    @SerializedName("OldPwd")
    @Expose
    private String OldPwd;

    /**
    * UIN of the bound sub-user
    */
    @SerializedName("CamUin")
    @Expose
    private String CamUin;

    /**
    * Ranger group id list
    */
    @SerializedName("CamRangerGroupIds")
    @Expose
    private Long [] CamRangerGroupIds;

    /**
     * Get Cluster instance ID. 
     * @return InstanceId Cluster instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster instance ID.
     * @param InstanceId Cluster instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Username 
     * @return UserName Username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
     * @param UserName Username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Password 
     * @return PassWord Password
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set Password
     * @param PassWord Password
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get The IP address of the user link 
     * @return WhiteHost The IP address of the user link
     */
    public String getWhiteHost() {
        return this.WhiteHost;
    }

    /**
     * Set The IP address of the user link
     * @param WhiteHost The IP address of the user link
     */
    public void setWhiteHost(String WhiteHost) {
        this.WhiteHost = WhiteHost;
    }

    /**
     * Get IP address of the user link before modification 
     * @return OldWhiteHost IP address of the user link before modification
     */
    public String getOldWhiteHost() {
        return this.OldWhiteHost;
    }

    /**
     * Set IP address of the user link before modification
     * @param OldWhiteHost IP address of the user link before modification
     */
    public void setOldWhiteHost(String OldWhiteHost) {
        this.OldWhiteHost = OldWhiteHost;
    }

    /**
     * Get Description 
     * @return Describe Description
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Description
     * @param Describe Description
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get Original password 
     * @return OldPwd Original password
     */
    public String getOldPwd() {
        return this.OldPwd;
    }

    /**
     * Set Original password
     * @param OldPwd Original password
     */
    public void setOldPwd(String OldPwd) {
        this.OldPwd = OldPwd;
    }

    /**
     * Get UIN of the bound sub-user 
     * @return CamUin UIN of the bound sub-user
     */
    public String getCamUin() {
        return this.CamUin;
    }

    /**
     * Set UIN of the bound sub-user
     * @param CamUin UIN of the bound sub-user
     */
    public void setCamUin(String CamUin) {
        this.CamUin = CamUin;
    }

    /**
     * Get Ranger group id list 
     * @return CamRangerGroupIds Ranger group id list
     */
    public Long [] getCamRangerGroupIds() {
        return this.CamRangerGroupIds;
    }

    /**
     * Set Ranger group id list
     * @param CamRangerGroupIds Ranger group id list
     */
    public void setCamRangerGroupIds(Long [] CamRangerGroupIds) {
        this.CamRangerGroupIds = CamRangerGroupIds;
    }

    public UserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfo(UserInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
        if (source.WhiteHost != null) {
            this.WhiteHost = new String(source.WhiteHost);
        }
        if (source.OldWhiteHost != null) {
            this.OldWhiteHost = new String(source.OldWhiteHost);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.OldPwd != null) {
            this.OldPwd = new String(source.OldPwd);
        }
        if (source.CamUin != null) {
            this.CamUin = new String(source.CamUin);
        }
        if (source.CamRangerGroupIds != null) {
            this.CamRangerGroupIds = new Long[source.CamRangerGroupIds.length];
            for (int i = 0; i < source.CamRangerGroupIds.length; i++) {
                this.CamRangerGroupIds[i] = new Long(source.CamRangerGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "WhiteHost", this.WhiteHost);
        this.setParamSimple(map, prefix + "OldWhiteHost", this.OldWhiteHost);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "OldPwd", this.OldPwd);
        this.setParamSimple(map, prefix + "CamUin", this.CamUin);
        this.setParamArraySimple(map, prefix + "CamRangerGroupIds.", this.CamRangerGroupIds);

    }
}

