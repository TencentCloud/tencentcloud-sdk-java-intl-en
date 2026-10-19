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

public class CosAccessInfo extends AbstractModel {

    /**
    * Access account uin
    */
    @SerializedName("AccessUin")
    @Expose
    private String AccessUin;

    /**
    * Accessible account uid
    */
    @SerializedName("AccessUid")
    @Expose
    private String AccessUid;

    /**
    * Nickname
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Identifier 
1 Root account
2 Sub-account
    */
    @SerializedName("Identity")
    @Expose
    private Long Identity;

    /**
    * Root Account Name
    */
    @SerializedName("MainNickName")
    @Expose
    private String MainNickName;

    /**
    * List of accessible AKs
    */
    @SerializedName("AkList")
    @Expose
    private String [] AkList;

    /**
    * Number of accessible permissions
    */
    @SerializedName("CamPolicyCount")
    @Expose
    private Long CamPolicyCount;

    /**
    * Last modified Unix timestamp in milliseconds
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Access account uin 
     * @return AccessUin Access account uin
     */
    public String getAccessUin() {
        return this.AccessUin;
    }

    /**
     * Set Access account uin
     * @param AccessUin Access account uin
     */
    public void setAccessUin(String AccessUin) {
        this.AccessUin = AccessUin;
    }

    /**
     * Get Accessible account uid 
     * @return AccessUid Accessible account uid
     */
    public String getAccessUid() {
        return this.AccessUid;
    }

    /**
     * Set Accessible account uid
     * @param AccessUid Accessible account uid
     */
    public void setAccessUid(String AccessUid) {
        this.AccessUid = AccessUid;
    }

    /**
     * Get Nickname 
     * @return NickName Nickname
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Nickname
     * @param NickName Nickname
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get Identifier 
1 Root account
2 Sub-account 
     * @return Identity Identifier 
1 Root account
2 Sub-account
     */
    public Long getIdentity() {
        return this.Identity;
    }

    /**
     * Set Identifier 
1 Root account
2 Sub-account
     * @param Identity Identifier 
1 Root account
2 Sub-account
     */
    public void setIdentity(Long Identity) {
        this.Identity = Identity;
    }

    /**
     * Get Root Account Name 
     * @return MainNickName Root Account Name
     */
    public String getMainNickName() {
        return this.MainNickName;
    }

    /**
     * Set Root Account Name
     * @param MainNickName Root Account Name
     */
    public void setMainNickName(String MainNickName) {
        this.MainNickName = MainNickName;
    }

    /**
     * Get List of accessible AKs 
     * @return AkList List of accessible AKs
     */
    public String [] getAkList() {
        return this.AkList;
    }

    /**
     * Set List of accessible AKs
     * @param AkList List of accessible AKs
     */
    public void setAkList(String [] AkList) {
        this.AkList = AkList;
    }

    /**
     * Get Number of accessible permissions 
     * @return CamPolicyCount Number of accessible permissions
     */
    public Long getCamPolicyCount() {
        return this.CamPolicyCount;
    }

    /**
     * Set Number of accessible permissions
     * @param CamPolicyCount Number of accessible permissions
     */
    public void setCamPolicyCount(Long CamPolicyCount) {
        this.CamPolicyCount = CamPolicyCount;
    }

    /**
     * Get Last modified Unix timestamp in milliseconds 
     * @return UpdateTime Last modified Unix timestamp in milliseconds
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified Unix timestamp in milliseconds
     * @param UpdateTime Last modified Unix timestamp in milliseconds
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public CosAccessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAccessInfo(CosAccessInfo source) {
        if (source.AccessUin != null) {
            this.AccessUin = new String(source.AccessUin);
        }
        if (source.AccessUid != null) {
            this.AccessUid = new String(source.AccessUid);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Identity != null) {
            this.Identity = new Long(source.Identity);
        }
        if (source.MainNickName != null) {
            this.MainNickName = new String(source.MainNickName);
        }
        if (source.AkList != null) {
            this.AkList = new String[source.AkList.length];
            for (int i = 0; i < source.AkList.length; i++) {
                this.AkList[i] = new String(source.AkList[i]);
            }
        }
        if (source.CamPolicyCount != null) {
            this.CamPolicyCount = new Long(source.CamPolicyCount);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessUin", this.AccessUin);
        this.setParamSimple(map, prefix + "AccessUid", this.AccessUid);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Identity", this.Identity);
        this.setParamSimple(map, prefix + "MainNickName", this.MainNickName);
        this.setParamArraySimple(map, prefix + "AkList.", this.AkList);
        this.setParamSimple(map, prefix + "CamPolicyCount", this.CamPolicyCount);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

