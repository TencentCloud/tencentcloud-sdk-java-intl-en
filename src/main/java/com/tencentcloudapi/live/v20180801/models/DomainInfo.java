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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainInfo extends AbstractModel {

    /**
    * LVB domain name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Domain name type:
0: push.
1: playback.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Domain name status:
0: deactivated.
1: activated.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The time when the domain was added.
Note: Beijing time (UTC+8) is used.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Whether there is a CNAME record pointing to a fixed rule domain name:
0: no.
1: yes.
    */
    @SerializedName("BCName")
    @Expose
    private Long BCName;

    /**
    * Domain name corresponding to CNAME record.
    */
    @SerializedName("TargetDomain")
    @Expose
    private String TargetDomain;

    /**
    * Playback region. This parameter is valid only if `Type` is 1.
1: in Mainland China.
2: global.
3: outside Mainland China.
    */
    @SerializedName("PlayType")
    @Expose
    private Long PlayType;

    /**
    * Whether it is LCB:
0: LVB.
1: LCB.
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Long IsDelayLive;

    /**
    * Information of currently used CNAME record.
    */
    @SerializedName("CurrentCName")
    @Expose
    private String CurrentCName;

    /**
    * Disused parameter, which can be ignored.
    */
    @SerializedName("RentTag")
    @Expose
    private Long RentTag;

    /**
    * A disused parameter.
Note: Beijing time (UTC+8) is used.
    */
    @SerializedName("RentExpireTime")
    @Expose
    private String RentExpireTime;

    /**
    * 0: LVB.
1: LVB on Mini Program.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsMiniProgramLive")
    @Expose
    private Long IsMiniProgramLive;

    /**
     * Get LVB domain name. 
     * @return Name LVB domain name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set LVB domain name.
     * @param Name LVB domain name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Domain name type:
0: push.
1: playback. 
     * @return Type Domain name type:
0: push.
1: playback.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Domain name type:
0: push.
1: playback.
     * @param Type Domain name type:
0: push.
1: playback.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Domain name status:
0: deactivated.
1: activated. 
     * @return Status Domain name status:
0: deactivated.
1: activated.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Domain name status:
0: deactivated.
1: activated.
     * @param Status Domain name status:
0: deactivated.
1: activated.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The time when the domain was added.
Note: Beijing time (UTC+8) is used. 
     * @return CreateTime The time when the domain was added.
Note: Beijing time (UTC+8) is used.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The time when the domain was added.
Note: Beijing time (UTC+8) is used.
     * @param CreateTime The time when the domain was added.
Note: Beijing time (UTC+8) is used.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Whether there is a CNAME record pointing to a fixed rule domain name:
0: no.
1: yes. 
     * @return BCName Whether there is a CNAME record pointing to a fixed rule domain name:
0: no.
1: yes.
     */
    public Long getBCName() {
        return this.BCName;
    }

    /**
     * Set Whether there is a CNAME record pointing to a fixed rule domain name:
0: no.
1: yes.
     * @param BCName Whether there is a CNAME record pointing to a fixed rule domain name:
0: no.
1: yes.
     */
    public void setBCName(Long BCName) {
        this.BCName = BCName;
    }

    /**
     * Get Domain name corresponding to CNAME record. 
     * @return TargetDomain Domain name corresponding to CNAME record.
     */
    public String getTargetDomain() {
        return this.TargetDomain;
    }

    /**
     * Set Domain name corresponding to CNAME record.
     * @param TargetDomain Domain name corresponding to CNAME record.
     */
    public void setTargetDomain(String TargetDomain) {
        this.TargetDomain = TargetDomain;
    }

    /**
     * Get Playback region. This parameter is valid only if `Type` is 1.
1: in Mainland China.
2: global.
3: outside Mainland China. 
     * @return PlayType Playback region. This parameter is valid only if `Type` is 1.
1: in Mainland China.
2: global.
3: outside Mainland China.
     */
    public Long getPlayType() {
        return this.PlayType;
    }

    /**
     * Set Playback region. This parameter is valid only if `Type` is 1.
1: in Mainland China.
2: global.
3: outside Mainland China.
     * @param PlayType Playback region. This parameter is valid only if `Type` is 1.
1: in Mainland China.
2: global.
3: outside Mainland China.
     */
    public void setPlayType(Long PlayType) {
        this.PlayType = PlayType;
    }

    /**
     * Get Whether it is LCB:
0: LVB.
1: LCB. 
     * @return IsDelayLive Whether it is LCB:
0: LVB.
1: LCB.
     */
    public Long getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * Set Whether it is LCB:
0: LVB.
1: LCB.
     * @param IsDelayLive Whether it is LCB:
0: LVB.
1: LCB.
     */
    public void setIsDelayLive(Long IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * Get Information of currently used CNAME record. 
     * @return CurrentCName Information of currently used CNAME record.
     */
    public String getCurrentCName() {
        return this.CurrentCName;
    }

    /**
     * Set Information of currently used CNAME record.
     * @param CurrentCName Information of currently used CNAME record.
     */
    public void setCurrentCName(String CurrentCName) {
        this.CurrentCName = CurrentCName;
    }

    /**
     * Get Disused parameter, which can be ignored. 
     * @return RentTag Disused parameter, which can be ignored.
     */
    public Long getRentTag() {
        return this.RentTag;
    }

    /**
     * Set Disused parameter, which can be ignored.
     * @param RentTag Disused parameter, which can be ignored.
     */
    public void setRentTag(Long RentTag) {
        this.RentTag = RentTag;
    }

    /**
     * Get A disused parameter.
Note: Beijing time (UTC+8) is used. 
     * @return RentExpireTime A disused parameter.
Note: Beijing time (UTC+8) is used.
     */
    public String getRentExpireTime() {
        return this.RentExpireTime;
    }

    /**
     * Set A disused parameter.
Note: Beijing time (UTC+8) is used.
     * @param RentExpireTime A disused parameter.
Note: Beijing time (UTC+8) is used.
     */
    public void setRentExpireTime(String RentExpireTime) {
        this.RentExpireTime = RentExpireTime;
    }

    /**
     * Get 0: LVB.
1: LVB on Mini Program.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsMiniProgramLive 0: LVB.
1: LVB on Mini Program.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsMiniProgramLive() {
        return this.IsMiniProgramLive;
    }

    /**
     * Set 0: LVB.
1: LVB on Mini Program.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsMiniProgramLive 0: LVB.
1: LVB on Mini Program.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsMiniProgramLive(Long IsMiniProgramLive) {
        this.IsMiniProgramLive = IsMiniProgramLive;
    }

    public DomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainInfo(DomainInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BCName != null) {
            this.BCName = new Long(source.BCName);
        }
        if (source.TargetDomain != null) {
            this.TargetDomain = new String(source.TargetDomain);
        }
        if (source.PlayType != null) {
            this.PlayType = new Long(source.PlayType);
        }
        if (source.IsDelayLive != null) {
            this.IsDelayLive = new Long(source.IsDelayLive);
        }
        if (source.CurrentCName != null) {
            this.CurrentCName = new String(source.CurrentCName);
        }
        if (source.RentTag != null) {
            this.RentTag = new Long(source.RentTag);
        }
        if (source.RentExpireTime != null) {
            this.RentExpireTime = new String(source.RentExpireTime);
        }
        if (source.IsMiniProgramLive != null) {
            this.IsMiniProgramLive = new Long(source.IsMiniProgramLive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BCName", this.BCName);
        this.setParamSimple(map, prefix + "TargetDomain", this.TargetDomain);
        this.setParamSimple(map, prefix + "PlayType", this.PlayType);
        this.setParamSimple(map, prefix + "IsDelayLive", this.IsDelayLive);
        this.setParamSimple(map, prefix + "CurrentCName", this.CurrentCName);
        this.setParamSimple(map, prefix + "RentTag", this.RentTag);
        this.setParamSimple(map, prefix + "RentExpireTime", this.RentExpireTime);
        this.setParamSimple(map, prefix + "IsMiniProgramLive", this.IsMiniProgramLive);

    }
}

