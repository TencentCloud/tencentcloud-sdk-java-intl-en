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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationMNPRelInfoResp extends AbstractModel {

    /**
    * Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * Mini program icon
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * Mini program type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * Introduction
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

    /**
    * Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPDesc")
    @Expose
    private String MNPDesc;

    /**
    * Effectiveness. 1: Not effective 2: Effective
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EffectStatus")
    @Expose
    private Long EffectStatus;

    /**
    * Effective version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EffectMNPVersion")
    @Expose
    private String EffectMNPVersion;

    /**
    * Online version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPOnlineVersion")
    @Expose
    private String MNPOnlineVersion;

    /**
    * 0: Not released; 1: Released
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
     * Get Mini program ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPId Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPId Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Mini program name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPName Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPName Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get Mini program icon
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPIcon Mini program icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set Mini program icon
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPIcon Mini program icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    /**
     * Get Mini program type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPType Mini program type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPType() {
        return this.MNPType;
    }

    /**
     * Set Mini program type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPType Mini program type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPType(String MNPType) {
        this.MNPType = MNPType;
    }

    /**
     * Get Introduction
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPIntro Introduction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set Introduction
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPIntro Introduction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
    }

    /**
     * Get Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPDesc Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPDesc() {
        return this.MNPDesc;
    }

    /**
     * Set Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPDesc Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPDesc(String MNPDesc) {
        this.MNPDesc = MNPDesc;
    }

    /**
     * Get Effectiveness. 1: Not effective 2: Effective
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EffectStatus Effectiveness. 1: Not effective 2: Effective
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEffectStatus() {
        return this.EffectStatus;
    }

    /**
     * Set Effectiveness. 1: Not effective 2: Effective
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EffectStatus Effectiveness. 1: Not effective 2: Effective
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEffectStatus(Long EffectStatus) {
        this.EffectStatus = EffectStatus;
    }

    /**
     * Get Effective version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EffectMNPVersion Effective version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEffectMNPVersion() {
        return this.EffectMNPVersion;
    }

    /**
     * Set Effective version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EffectMNPVersion Effective version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEffectMNPVersion(String EffectMNPVersion) {
        this.EffectMNPVersion = EffectMNPVersion;
    }

    /**
     * Get Online version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPOnlineVersion Online version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPOnlineVersion() {
        return this.MNPOnlineVersion;
    }

    /**
     * Set Online version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPOnlineVersion Online version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPOnlineVersion(String MNPOnlineVersion) {
        this.MNPOnlineVersion = MNPOnlineVersion;
    }

    /**
     * Get 0: Not released; 1: Released
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OnlineStatus 0: Not released; 1: Released
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set 0: Not released; 1: Released
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OnlineStatus 0: Not released; 1: Released
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    public ApplicationMNPRelInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationMNPRelInfoResp(ApplicationMNPRelInfoResp source) {
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.MNPIcon != null) {
            this.MNPIcon = new String(source.MNPIcon);
        }
        if (source.MNPType != null) {
            this.MNPType = new String(source.MNPType);
        }
        if (source.MNPIntro != null) {
            this.MNPIntro = new String(source.MNPIntro);
        }
        if (source.MNPDesc != null) {
            this.MNPDesc = new String(source.MNPDesc);
        }
        if (source.EffectStatus != null) {
            this.EffectStatus = new Long(source.EffectStatus);
        }
        if (source.EffectMNPVersion != null) {
            this.EffectMNPVersion = new String(source.EffectMNPVersion);
        }
        if (source.MNPOnlineVersion != null) {
            this.MNPOnlineVersion = new String(source.MNPOnlineVersion);
        }
        if (source.OnlineStatus != null) {
            this.OnlineStatus = new Long(source.OnlineStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "MNPIcon", this.MNPIcon);
        this.setParamSimple(map, prefix + "MNPType", this.MNPType);
        this.setParamSimple(map, prefix + "MNPIntro", this.MNPIntro);
        this.setParamSimple(map, prefix + "MNPDesc", this.MNPDesc);
        this.setParamSimple(map, prefix + "EffectStatus", this.EffectStatus);
        this.setParamSimple(map, prefix + "EffectMNPVersion", this.EffectMNPVersion);
        this.setParamSimple(map, prefix + "MNPOnlineVersion", this.MNPOnlineVersion);
        this.setParamSimple(map, prefix + "OnlineStatus", this.OnlineStatus);

    }
}

