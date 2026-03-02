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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskChargePrepaid extends AbstractModel {

    /**
    * Specifies the duration for purchasing cloud block storage (cbs) in months. default unit: month. valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Automatic renewal flag. valid values:.
<ul>
<Li>NOTIFY_AND_AUTO_RENEW: notifies expiry and renews automatically.</li>.
<Li>NOTIFY_AND_MANUAL_RENEW: notifies expiry but does not renew automatically.</li>.
<Li>DISABLE_NOTIFY_AND_MANUAL_RENEW: no notification is sent upon expiration, and the instance is not renewed automatically.</li>.
</ul>
Default value: NOTIFY_AND_MANUAL_RENEW.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Specifies the current expiration time of the child machine when the expiration time of the cloud block storage needs to align with the mounted child machine. you can input this parameter. if Period is input at this time, it indicates the duration of child machine renewal. the cloud disk will automatically renew according to the expiration time after the child machine is renewed.
    */
    @SerializedName("CurInstanceDeadline")
    @Expose
    private String CurInstanceDeadline;

    /**
     * Get Specifies the duration for purchasing cloud block storage (cbs) in months. default unit: month. valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36. 
     * @return Period Specifies the duration for purchasing cloud block storage (cbs) in months. default unit: month. valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Specifies the duration for purchasing cloud block storage (cbs) in months. default unit: month. valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
     * @param Period Specifies the duration for purchasing cloud block storage (cbs) in months. default unit: month. valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Automatic renewal flag. valid values:.
<ul>
<Li>NOTIFY_AND_AUTO_RENEW: notifies expiry and renews automatically.</li>.
<Li>NOTIFY_AND_MANUAL_RENEW: notifies expiry but does not renew automatically.</li>.
<Li>DISABLE_NOTIFY_AND_MANUAL_RENEW: no notification is sent upon expiration, and the instance is not renewed automatically.</li>.
</ul>
Default value: NOTIFY_AND_MANUAL_RENEW. 
     * @return RenewFlag Automatic renewal flag. valid values:.
<ul>
<Li>NOTIFY_AND_AUTO_RENEW: notifies expiry and renews automatically.</li>.
<Li>NOTIFY_AND_MANUAL_RENEW: notifies expiry but does not renew automatically.</li>.
<Li>DISABLE_NOTIFY_AND_MANUAL_RENEW: no notification is sent upon expiration, and the instance is not renewed automatically.</li>.
</ul>
Default value: NOTIFY_AND_MANUAL_RENEW.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Automatic renewal flag. valid values:.
<ul>
<Li>NOTIFY_AND_AUTO_RENEW: notifies expiry and renews automatically.</li>.
<Li>NOTIFY_AND_MANUAL_RENEW: notifies expiry but does not renew automatically.</li>.
<Li>DISABLE_NOTIFY_AND_MANUAL_RENEW: no notification is sent upon expiration, and the instance is not renewed automatically.</li>.
</ul>
Default value: NOTIFY_AND_MANUAL_RENEW.
     * @param RenewFlag Automatic renewal flag. valid values:.
<ul>
<Li>NOTIFY_AND_AUTO_RENEW: notifies expiry and renews automatically.</li>.
<Li>NOTIFY_AND_MANUAL_RENEW: notifies expiry but does not renew automatically.</li>.
<Li>DISABLE_NOTIFY_AND_MANUAL_RENEW: no notification is sent upon expiration, and the instance is not renewed automatically.</li>.
</ul>
Default value: NOTIFY_AND_MANUAL_RENEW.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Specifies the current expiration time of the child machine when the expiration time of the cloud block storage needs to align with the mounted child machine. you can input this parameter. if Period is input at this time, it indicates the duration of child machine renewal. the cloud disk will automatically renew according to the expiration time after the child machine is renewed. 
     * @return CurInstanceDeadline Specifies the current expiration time of the child machine when the expiration time of the cloud block storage needs to align with the mounted child machine. you can input this parameter. if Period is input at this time, it indicates the duration of child machine renewal. the cloud disk will automatically renew according to the expiration time after the child machine is renewed.
     */
    public String getCurInstanceDeadline() {
        return this.CurInstanceDeadline;
    }

    /**
     * Set Specifies the current expiration time of the child machine when the expiration time of the cloud block storage needs to align with the mounted child machine. you can input this parameter. if Period is input at this time, it indicates the duration of child machine renewal. the cloud disk will automatically renew according to the expiration time after the child machine is renewed.
     * @param CurInstanceDeadline Specifies the current expiration time of the child machine when the expiration time of the cloud block storage needs to align with the mounted child machine. you can input this parameter. if Period is input at this time, it indicates the duration of child machine renewal. the cloud disk will automatically renew according to the expiration time after the child machine is renewed.
     */
    public void setCurInstanceDeadline(String CurInstanceDeadline) {
        this.CurInstanceDeadline = CurInstanceDeadline;
    }

    public DiskChargePrepaid() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskChargePrepaid(DiskChargePrepaid source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.CurInstanceDeadline != null) {
            this.CurInstanceDeadline = new String(source.CurInstanceDeadline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "CurInstanceDeadline", this.CurInstanceDeadline);

    }
}

