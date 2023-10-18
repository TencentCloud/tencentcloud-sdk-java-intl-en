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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainCountInfo extends AbstractModel {

    /**
    * Number of eligible domains
    */
    @SerializedName("DomainTotal")
    @Expose
    private Long DomainTotal;

    /**
    * Number of all domains that can be viewed by the user
    */
    @SerializedName("AllTotal")
    @Expose
    private Long AllTotal;

    /**
    * Number of domains added under the user account
    */
    @SerializedName("MineTotal")
    @Expose
    private Long MineTotal;

    /**
    * Number of domains shared with the user
    */
    @SerializedName("ShareTotal")
    @Expose
    private Long ShareTotal;

    /**
    * Number of paid domains
    */
    @SerializedName("VipTotal")
    @Expose
    private Long VipTotal;

    /**
    * Number of suspended domains
    */
    @SerializedName("PauseTotal")
    @Expose
    private Long PauseTotal;

    /**
    * Number of domains with a DNS configuration error
    */
    @SerializedName("ErrorTotal")
    @Expose
    private Long ErrorTotal;

    /**
    * Number of locked domains
    */
    @SerializedName("LockTotal")
    @Expose
    private Long LockTotal;

    /**
    * Number of blocked domains
    */
    @SerializedName("SpamTotal")
    @Expose
    private Long SpamTotal;

    /**
    * Number of domains that will expire within 30 days
    */
    @SerializedName("VipExpire")
    @Expose
    private Long VipExpire;

    /**
    * Number of domains shared with others
    */
    @SerializedName("ShareOutTotal")
    @Expose
    private Long ShareOutTotal;

    /**
    * Number of domains in the specified group
    */
    @SerializedName("GroupTotal")
    @Expose
    private Long GroupTotal;

    /**
     * Get Number of eligible domains 
     * @return DomainTotal Number of eligible domains
     */
    public Long getDomainTotal() {
        return this.DomainTotal;
    }

    /**
     * Set Number of eligible domains
     * @param DomainTotal Number of eligible domains
     */
    public void setDomainTotal(Long DomainTotal) {
        this.DomainTotal = DomainTotal;
    }

    /**
     * Get Number of all domains that can be viewed by the user 
     * @return AllTotal Number of all domains that can be viewed by the user
     */
    public Long getAllTotal() {
        return this.AllTotal;
    }

    /**
     * Set Number of all domains that can be viewed by the user
     * @param AllTotal Number of all domains that can be viewed by the user
     */
    public void setAllTotal(Long AllTotal) {
        this.AllTotal = AllTotal;
    }

    /**
     * Get Number of domains added under the user account 
     * @return MineTotal Number of domains added under the user account
     */
    public Long getMineTotal() {
        return this.MineTotal;
    }

    /**
     * Set Number of domains added under the user account
     * @param MineTotal Number of domains added under the user account
     */
    public void setMineTotal(Long MineTotal) {
        this.MineTotal = MineTotal;
    }

    /**
     * Get Number of domains shared with the user 
     * @return ShareTotal Number of domains shared with the user
     */
    public Long getShareTotal() {
        return this.ShareTotal;
    }

    /**
     * Set Number of domains shared with the user
     * @param ShareTotal Number of domains shared with the user
     */
    public void setShareTotal(Long ShareTotal) {
        this.ShareTotal = ShareTotal;
    }

    /**
     * Get Number of paid domains 
     * @return VipTotal Number of paid domains
     */
    public Long getVipTotal() {
        return this.VipTotal;
    }

    /**
     * Set Number of paid domains
     * @param VipTotal Number of paid domains
     */
    public void setVipTotal(Long VipTotal) {
        this.VipTotal = VipTotal;
    }

    /**
     * Get Number of suspended domains 
     * @return PauseTotal Number of suspended domains
     */
    public Long getPauseTotal() {
        return this.PauseTotal;
    }

    /**
     * Set Number of suspended domains
     * @param PauseTotal Number of suspended domains
     */
    public void setPauseTotal(Long PauseTotal) {
        this.PauseTotal = PauseTotal;
    }

    /**
     * Get Number of domains with a DNS configuration error 
     * @return ErrorTotal Number of domains with a DNS configuration error
     */
    public Long getErrorTotal() {
        return this.ErrorTotal;
    }

    /**
     * Set Number of domains with a DNS configuration error
     * @param ErrorTotal Number of domains with a DNS configuration error
     */
    public void setErrorTotal(Long ErrorTotal) {
        this.ErrorTotal = ErrorTotal;
    }

    /**
     * Get Number of locked domains 
     * @return LockTotal Number of locked domains
     */
    public Long getLockTotal() {
        return this.LockTotal;
    }

    /**
     * Set Number of locked domains
     * @param LockTotal Number of locked domains
     */
    public void setLockTotal(Long LockTotal) {
        this.LockTotal = LockTotal;
    }

    /**
     * Get Number of blocked domains 
     * @return SpamTotal Number of blocked domains
     */
    public Long getSpamTotal() {
        return this.SpamTotal;
    }

    /**
     * Set Number of blocked domains
     * @param SpamTotal Number of blocked domains
     */
    public void setSpamTotal(Long SpamTotal) {
        this.SpamTotal = SpamTotal;
    }

    /**
     * Get Number of domains that will expire within 30 days 
     * @return VipExpire Number of domains that will expire within 30 days
     */
    public Long getVipExpire() {
        return this.VipExpire;
    }

    /**
     * Set Number of domains that will expire within 30 days
     * @param VipExpire Number of domains that will expire within 30 days
     */
    public void setVipExpire(Long VipExpire) {
        this.VipExpire = VipExpire;
    }

    /**
     * Get Number of domains shared with others 
     * @return ShareOutTotal Number of domains shared with others
     */
    public Long getShareOutTotal() {
        return this.ShareOutTotal;
    }

    /**
     * Set Number of domains shared with others
     * @param ShareOutTotal Number of domains shared with others
     */
    public void setShareOutTotal(Long ShareOutTotal) {
        this.ShareOutTotal = ShareOutTotal;
    }

    /**
     * Get Number of domains in the specified group 
     * @return GroupTotal Number of domains in the specified group
     */
    public Long getGroupTotal() {
        return this.GroupTotal;
    }

    /**
     * Set Number of domains in the specified group
     * @param GroupTotal Number of domains in the specified group
     */
    public void setGroupTotal(Long GroupTotal) {
        this.GroupTotal = GroupTotal;
    }

    public DomainCountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainCountInfo(DomainCountInfo source) {
        if (source.DomainTotal != null) {
            this.DomainTotal = new Long(source.DomainTotal);
        }
        if (source.AllTotal != null) {
            this.AllTotal = new Long(source.AllTotal);
        }
        if (source.MineTotal != null) {
            this.MineTotal = new Long(source.MineTotal);
        }
        if (source.ShareTotal != null) {
            this.ShareTotal = new Long(source.ShareTotal);
        }
        if (source.VipTotal != null) {
            this.VipTotal = new Long(source.VipTotal);
        }
        if (source.PauseTotal != null) {
            this.PauseTotal = new Long(source.PauseTotal);
        }
        if (source.ErrorTotal != null) {
            this.ErrorTotal = new Long(source.ErrorTotal);
        }
        if (source.LockTotal != null) {
            this.LockTotal = new Long(source.LockTotal);
        }
        if (source.SpamTotal != null) {
            this.SpamTotal = new Long(source.SpamTotal);
        }
        if (source.VipExpire != null) {
            this.VipExpire = new Long(source.VipExpire);
        }
        if (source.ShareOutTotal != null) {
            this.ShareOutTotal = new Long(source.ShareOutTotal);
        }
        if (source.GroupTotal != null) {
            this.GroupTotal = new Long(source.GroupTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainTotal", this.DomainTotal);
        this.setParamSimple(map, prefix + "AllTotal", this.AllTotal);
        this.setParamSimple(map, prefix + "MineTotal", this.MineTotal);
        this.setParamSimple(map, prefix + "ShareTotal", this.ShareTotal);
        this.setParamSimple(map, prefix + "VipTotal", this.VipTotal);
        this.setParamSimple(map, prefix + "PauseTotal", this.PauseTotal);
        this.setParamSimple(map, prefix + "ErrorTotal", this.ErrorTotal);
        this.setParamSimple(map, prefix + "LockTotal", this.LockTotal);
        this.setParamSimple(map, prefix + "SpamTotal", this.SpamTotal);
        this.setParamSimple(map, prefix + "VipExpire", this.VipExpire);
        this.setParamSimple(map, prefix + "ShareOutTotal", this.ShareOutTotal);
        this.setParamSimple(map, prefix + "GroupTotal", this.GroupTotal);

    }
}

