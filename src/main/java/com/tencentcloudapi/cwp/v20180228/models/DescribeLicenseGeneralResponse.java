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

public class DescribeLicenseGeneralResponse extends AbstractModel {

    /**
    * <p>Total number of licenses (including unavailable licenses such as isolated and expired ones)</p>
    */
    @SerializedName("LicenseCnt")
    @Expose
    private Long LicenseCnt;

    /**
    * <p>Available licenses</p>
    */
    @SerializedName("AvailableLicenseCnt")
    @Expose
    private Long AvailableLicenseCnt;

    /**
    * <p>Number of available Pro Edition licenses (including postpaid licenses)</p>
    */
    @SerializedName("AvailableProVersionLicenseCnt")
    @Expose
    private Long AvailableProVersionLicenseCnt;

    /**
    * <p>Number of available Ultimate Edition licenses</p>
    */
    @SerializedName("AvailableFlagshipVersionLicenseCnt")
    @Expose
    private Long AvailableFlagshipVersionLicenseCnt;

    /**
    * <p>Number of licenses expiring within 15 days</p>
    */
    @SerializedName("NearExpiryLicenseCnt")
    @Expose
    private Long NearExpiryLicenseCnt;

    /**
    * <p>Number of expired licenses (excluding deleted records)</p>
    */
    @SerializedName("ExpireLicenseCnt")
    @Expose
    private Long ExpireLicenseCnt;

    /**
    * <p>Automatic upgrade switch status. Default value: false. true: enabled; false: disabled.</p>
    */
    @SerializedName("AutoOpenStatus")
    @Expose
    private Boolean AutoOpenStatus;

    /**
    * <p>PROVERSION_POSTPAY: Pro Edition - postpaid; PROVERSION_PREPAY: Pro Edition - prepaid; FLAGSHIP_PREPAY: Ultimate Edition - prepaid.</p>
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * <p>Whether automatic upgrade has been enabled before</p>
    */
    @SerializedName("IsOpenStatusHistory")
    @Expose
    private Boolean IsOpenStatusHistory;

    /**
    * <p>Number of used licenses</p>
    */
    @SerializedName("UsedLicenseCnt")
    @Expose
    private Long UsedLicenseCnt;

    /**
    * <p>Number of unexpired licenses</p>
    */
    @SerializedName("NotExpiredLicenseCnt")
    @Expose
    private Long NotExpiredLicenseCnt;

    /**
    * <p>Total number of Ultimate Edition licenses (valid orders)</p>
    */
    @SerializedName("FlagshipVersionLicenseCnt")
    @Expose
    private Long FlagshipVersionLicenseCnt;

    /**
    * <p>Total number of Pro Edition licenses (valid orders)</p>
    */
    @SerializedName("ProVersionLicenseCnt")
    @Expose
    private Long ProVersionLicenseCnt;

    /**
    * <p>Lightweight edition total number of licenses (valid order licenses count)</p>
    */
    @SerializedName("CwpVersionLicenseCnt")
    @Expose
    private Long CwpVersionLicenseCnt;

    /**
    * <p>Number of available Lightweight Edition licenses</p>
    */
    @SerializedName("AvailableLHLicenseCnt")
    @Expose
    private Long AvailableLHLicenseCnt;

    /**
    * <p>Auto-purchase switch. true: enabled; false: disabled.</p>
    */
    @SerializedName("AutoRepurchaseSwitch")
    @Expose
    private Boolean AutoRepurchaseSwitch;

    /**
    * <p>Whether auto-purchase orders are automatically renewed. true: enabled; false: disabled.</p>
    */
    @SerializedName("AutoRepurchaseRenewSwitch")
    @Expose
    private Boolean AutoRepurchaseRenewSwitch;

    /**
    * <p>Number of terminated orders</p>
    */
    @SerializedName("DestroyOrderNum")
    @Expose
    private Long DestroyOrderNum;

    /**
    * <p>Auto-renewal switch for auto-purchase. true: enabled; false: disabled.</p>
    */
    @SerializedName("RepurchaseRenewSwitch")
    @Expose
    private Boolean RepurchaseRenewSwitch;

    /**
    * <p>Whether to automatically bind RASP protection to newly added machines. false: disabled; true: enabled.</p>
    */
    @SerializedName("AutoBindRaspSwitch")
    @Expose
    private Boolean AutoBindRaspSwitch;

    /**
    * <p>Whether to automatically enable RASP protection for newly added machines. false: disabled; true: enabled.</p>
    */
    @SerializedName("AutoOpenRaspSwitch")
    @Expose
    private Boolean AutoOpenRaspSwitch;

    /**
    * <p>Whether the auto-downgrade switch is enabled</p>
    */
    @SerializedName("AutoDowngradeSwitch")
    @Expose
    private Boolean AutoDowngradeSwitch;

    /**
    * <p>Number of available AI Protection Edition licenses</p>
    */
    @SerializedName("AvailableAISecurityLicenseCnt")
    @Expose
    private Long AvailableAISecurityLicenseCnt;

    /**
    * <p>Total number of AI Protection Edition licenses</p>
    */
    @SerializedName("AISecurityVersionLicenseCnt")
    @Expose
    private Long AISecurityVersionLicenseCnt;

    /**
    * <p>Number of available licenses after combining application protection licenses with Ultimate Edition licenses</p>
    */
    @SerializedName("ApplicationAvailableLicenseCnt")
    @Expose
    private Long ApplicationAvailableLicenseCnt;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Total number of licenses (including unavailable licenses such as isolated and expired ones)</p> 
     * @return LicenseCnt <p>Total number of licenses (including unavailable licenses such as isolated and expired ones)</p>
     */
    public Long getLicenseCnt() {
        return this.LicenseCnt;
    }

    /**
     * Set <p>Total number of licenses (including unavailable licenses such as isolated and expired ones)</p>
     * @param LicenseCnt <p>Total number of licenses (including unavailable licenses such as isolated and expired ones)</p>
     */
    public void setLicenseCnt(Long LicenseCnt) {
        this.LicenseCnt = LicenseCnt;
    }

    /**
     * Get <p>Available licenses</p> 
     * @return AvailableLicenseCnt <p>Available licenses</p>
     */
    public Long getAvailableLicenseCnt() {
        return this.AvailableLicenseCnt;
    }

    /**
     * Set <p>Available licenses</p>
     * @param AvailableLicenseCnt <p>Available licenses</p>
     */
    public void setAvailableLicenseCnt(Long AvailableLicenseCnt) {
        this.AvailableLicenseCnt = AvailableLicenseCnt;
    }

    /**
     * Get <p>Number of available Pro Edition licenses (including postpaid licenses)</p> 
     * @return AvailableProVersionLicenseCnt <p>Number of available Pro Edition licenses (including postpaid licenses)</p>
     */
    public Long getAvailableProVersionLicenseCnt() {
        return this.AvailableProVersionLicenseCnt;
    }

    /**
     * Set <p>Number of available Pro Edition licenses (including postpaid licenses)</p>
     * @param AvailableProVersionLicenseCnt <p>Number of available Pro Edition licenses (including postpaid licenses)</p>
     */
    public void setAvailableProVersionLicenseCnt(Long AvailableProVersionLicenseCnt) {
        this.AvailableProVersionLicenseCnt = AvailableProVersionLicenseCnt;
    }

    /**
     * Get <p>Number of available Ultimate Edition licenses</p> 
     * @return AvailableFlagshipVersionLicenseCnt <p>Number of available Ultimate Edition licenses</p>
     */
    public Long getAvailableFlagshipVersionLicenseCnt() {
        return this.AvailableFlagshipVersionLicenseCnt;
    }

    /**
     * Set <p>Number of available Ultimate Edition licenses</p>
     * @param AvailableFlagshipVersionLicenseCnt <p>Number of available Ultimate Edition licenses</p>
     */
    public void setAvailableFlagshipVersionLicenseCnt(Long AvailableFlagshipVersionLicenseCnt) {
        this.AvailableFlagshipVersionLicenseCnt = AvailableFlagshipVersionLicenseCnt;
    }

    /**
     * Get <p>Number of licenses expiring within 15 days</p> 
     * @return NearExpiryLicenseCnt <p>Number of licenses expiring within 15 days</p>
     */
    public Long getNearExpiryLicenseCnt() {
        return this.NearExpiryLicenseCnt;
    }

    /**
     * Set <p>Number of licenses expiring within 15 days</p>
     * @param NearExpiryLicenseCnt <p>Number of licenses expiring within 15 days</p>
     */
    public void setNearExpiryLicenseCnt(Long NearExpiryLicenseCnt) {
        this.NearExpiryLicenseCnt = NearExpiryLicenseCnt;
    }

    /**
     * Get <p>Number of expired licenses (excluding deleted records)</p> 
     * @return ExpireLicenseCnt <p>Number of expired licenses (excluding deleted records)</p>
     */
    public Long getExpireLicenseCnt() {
        return this.ExpireLicenseCnt;
    }

    /**
     * Set <p>Number of expired licenses (excluding deleted records)</p>
     * @param ExpireLicenseCnt <p>Number of expired licenses (excluding deleted records)</p>
     */
    public void setExpireLicenseCnt(Long ExpireLicenseCnt) {
        this.ExpireLicenseCnt = ExpireLicenseCnt;
    }

    /**
     * Get <p>Automatic upgrade switch status. Default value: false. true: enabled; false: disabled.</p> 
     * @return AutoOpenStatus <p>Automatic upgrade switch status. Default value: false. true: enabled; false: disabled.</p>
     */
    public Boolean getAutoOpenStatus() {
        return this.AutoOpenStatus;
    }

    /**
     * Set <p>Automatic upgrade switch status. Default value: false. true: enabled; false: disabled.</p>
     * @param AutoOpenStatus <p>Automatic upgrade switch status. Default value: false. true: enabled; false: disabled.</p>
     */
    public void setAutoOpenStatus(Boolean AutoOpenStatus) {
        this.AutoOpenStatus = AutoOpenStatus;
    }

    /**
     * Get <p>PROVERSION_POSTPAY: Pro Edition - postpaid; PROVERSION_PREPAY: Pro Edition - prepaid; FLAGSHIP_PREPAY: Ultimate Edition - prepaid.</p> 
     * @return ProtectType <p>PROVERSION_POSTPAY: Pro Edition - postpaid; PROVERSION_PREPAY: Pro Edition - prepaid; FLAGSHIP_PREPAY: Ultimate Edition - prepaid.</p>
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set <p>PROVERSION_POSTPAY: Pro Edition - postpaid; PROVERSION_PREPAY: Pro Edition - prepaid; FLAGSHIP_PREPAY: Ultimate Edition - prepaid.</p>
     * @param ProtectType <p>PROVERSION_POSTPAY: Pro Edition - postpaid; PROVERSION_PREPAY: Pro Edition - prepaid; FLAGSHIP_PREPAY: Ultimate Edition - prepaid.</p>
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get <p>Whether automatic upgrade has been enabled before</p> 
     * @return IsOpenStatusHistory <p>Whether automatic upgrade has been enabled before</p>
     */
    public Boolean getIsOpenStatusHistory() {
        return this.IsOpenStatusHistory;
    }

    /**
     * Set <p>Whether automatic upgrade has been enabled before</p>
     * @param IsOpenStatusHistory <p>Whether automatic upgrade has been enabled before</p>
     */
    public void setIsOpenStatusHistory(Boolean IsOpenStatusHistory) {
        this.IsOpenStatusHistory = IsOpenStatusHistory;
    }

    /**
     * Get <p>Number of used licenses</p> 
     * @return UsedLicenseCnt <p>Number of used licenses</p>
     */
    public Long getUsedLicenseCnt() {
        return this.UsedLicenseCnt;
    }

    /**
     * Set <p>Number of used licenses</p>
     * @param UsedLicenseCnt <p>Number of used licenses</p>
     */
    public void setUsedLicenseCnt(Long UsedLicenseCnt) {
        this.UsedLicenseCnt = UsedLicenseCnt;
    }

    /**
     * Get <p>Number of unexpired licenses</p> 
     * @return NotExpiredLicenseCnt <p>Number of unexpired licenses</p>
     */
    public Long getNotExpiredLicenseCnt() {
        return this.NotExpiredLicenseCnt;
    }

    /**
     * Set <p>Number of unexpired licenses</p>
     * @param NotExpiredLicenseCnt <p>Number of unexpired licenses</p>
     */
    public void setNotExpiredLicenseCnt(Long NotExpiredLicenseCnt) {
        this.NotExpiredLicenseCnt = NotExpiredLicenseCnt;
    }

    /**
     * Get <p>Total number of Ultimate Edition licenses (valid orders)</p> 
     * @return FlagshipVersionLicenseCnt <p>Total number of Ultimate Edition licenses (valid orders)</p>
     */
    public Long getFlagshipVersionLicenseCnt() {
        return this.FlagshipVersionLicenseCnt;
    }

    /**
     * Set <p>Total number of Ultimate Edition licenses (valid orders)</p>
     * @param FlagshipVersionLicenseCnt <p>Total number of Ultimate Edition licenses (valid orders)</p>
     */
    public void setFlagshipVersionLicenseCnt(Long FlagshipVersionLicenseCnt) {
        this.FlagshipVersionLicenseCnt = FlagshipVersionLicenseCnt;
    }

    /**
     * Get <p>Total number of Pro Edition licenses (valid orders)</p> 
     * @return ProVersionLicenseCnt <p>Total number of Pro Edition licenses (valid orders)</p>
     */
    public Long getProVersionLicenseCnt() {
        return this.ProVersionLicenseCnt;
    }

    /**
     * Set <p>Total number of Pro Edition licenses (valid orders)</p>
     * @param ProVersionLicenseCnt <p>Total number of Pro Edition licenses (valid orders)</p>
     */
    public void setProVersionLicenseCnt(Long ProVersionLicenseCnt) {
        this.ProVersionLicenseCnt = ProVersionLicenseCnt;
    }

    /**
     * Get <p>Lightweight edition total number of licenses (valid order licenses count)</p> 
     * @return CwpVersionLicenseCnt <p>Lightweight edition total number of licenses (valid order licenses count)</p>
     */
    public Long getCwpVersionLicenseCnt() {
        return this.CwpVersionLicenseCnt;
    }

    /**
     * Set <p>Lightweight edition total number of licenses (valid order licenses count)</p>
     * @param CwpVersionLicenseCnt <p>Lightweight edition total number of licenses (valid order licenses count)</p>
     */
    public void setCwpVersionLicenseCnt(Long CwpVersionLicenseCnt) {
        this.CwpVersionLicenseCnt = CwpVersionLicenseCnt;
    }

    /**
     * Get <p>Number of available Lightweight Edition licenses</p> 
     * @return AvailableLHLicenseCnt <p>Number of available Lightweight Edition licenses</p>
     */
    public Long getAvailableLHLicenseCnt() {
        return this.AvailableLHLicenseCnt;
    }

    /**
     * Set <p>Number of available Lightweight Edition licenses</p>
     * @param AvailableLHLicenseCnt <p>Number of available Lightweight Edition licenses</p>
     */
    public void setAvailableLHLicenseCnt(Long AvailableLHLicenseCnt) {
        this.AvailableLHLicenseCnt = AvailableLHLicenseCnt;
    }

    /**
     * Get <p>Auto-purchase switch. true: enabled; false: disabled.</p> 
     * @return AutoRepurchaseSwitch <p>Auto-purchase switch. true: enabled; false: disabled.</p>
     */
    public Boolean getAutoRepurchaseSwitch() {
        return this.AutoRepurchaseSwitch;
    }

    /**
     * Set <p>Auto-purchase switch. true: enabled; false: disabled.</p>
     * @param AutoRepurchaseSwitch <p>Auto-purchase switch. true: enabled; false: disabled.</p>
     */
    public void setAutoRepurchaseSwitch(Boolean AutoRepurchaseSwitch) {
        this.AutoRepurchaseSwitch = AutoRepurchaseSwitch;
    }

    /**
     * Get <p>Whether auto-purchase orders are automatically renewed. true: enabled; false: disabled.</p> 
     * @return AutoRepurchaseRenewSwitch <p>Whether auto-purchase orders are automatically renewed. true: enabled; false: disabled.</p>
     */
    public Boolean getAutoRepurchaseRenewSwitch() {
        return this.AutoRepurchaseRenewSwitch;
    }

    /**
     * Set <p>Whether auto-purchase orders are automatically renewed. true: enabled; false: disabled.</p>
     * @param AutoRepurchaseRenewSwitch <p>Whether auto-purchase orders are automatically renewed. true: enabled; false: disabled.</p>
     */
    public void setAutoRepurchaseRenewSwitch(Boolean AutoRepurchaseRenewSwitch) {
        this.AutoRepurchaseRenewSwitch = AutoRepurchaseRenewSwitch;
    }

    /**
     * Get <p>Number of terminated orders</p> 
     * @return DestroyOrderNum <p>Number of terminated orders</p>
     */
    public Long getDestroyOrderNum() {
        return this.DestroyOrderNum;
    }

    /**
     * Set <p>Number of terminated orders</p>
     * @param DestroyOrderNum <p>Number of terminated orders</p>
     */
    public void setDestroyOrderNum(Long DestroyOrderNum) {
        this.DestroyOrderNum = DestroyOrderNum;
    }

    /**
     * Get <p>Auto-renewal switch for auto-purchase. true: enabled; false: disabled.</p> 
     * @return RepurchaseRenewSwitch <p>Auto-renewal switch for auto-purchase. true: enabled; false: disabled.</p>
     */
    public Boolean getRepurchaseRenewSwitch() {
        return this.RepurchaseRenewSwitch;
    }

    /**
     * Set <p>Auto-renewal switch for auto-purchase. true: enabled; false: disabled.</p>
     * @param RepurchaseRenewSwitch <p>Auto-renewal switch for auto-purchase. true: enabled; false: disabled.</p>
     */
    public void setRepurchaseRenewSwitch(Boolean RepurchaseRenewSwitch) {
        this.RepurchaseRenewSwitch = RepurchaseRenewSwitch;
    }

    /**
     * Get <p>Whether to automatically bind RASP protection to newly added machines. false: disabled; true: enabled.</p> 
     * @return AutoBindRaspSwitch <p>Whether to automatically bind RASP protection to newly added machines. false: disabled; true: enabled.</p>
     */
    public Boolean getAutoBindRaspSwitch() {
        return this.AutoBindRaspSwitch;
    }

    /**
     * Set <p>Whether to automatically bind RASP protection to newly added machines. false: disabled; true: enabled.</p>
     * @param AutoBindRaspSwitch <p>Whether to automatically bind RASP protection to newly added machines. false: disabled; true: enabled.</p>
     */
    public void setAutoBindRaspSwitch(Boolean AutoBindRaspSwitch) {
        this.AutoBindRaspSwitch = AutoBindRaspSwitch;
    }

    /**
     * Get <p>Whether to automatically enable RASP protection for newly added machines. false: disabled; true: enabled.</p> 
     * @return AutoOpenRaspSwitch <p>Whether to automatically enable RASP protection for newly added machines. false: disabled; true: enabled.</p>
     */
    public Boolean getAutoOpenRaspSwitch() {
        return this.AutoOpenRaspSwitch;
    }

    /**
     * Set <p>Whether to automatically enable RASP protection for newly added machines. false: disabled; true: enabled.</p>
     * @param AutoOpenRaspSwitch <p>Whether to automatically enable RASP protection for newly added machines. false: disabled; true: enabled.</p>
     */
    public void setAutoOpenRaspSwitch(Boolean AutoOpenRaspSwitch) {
        this.AutoOpenRaspSwitch = AutoOpenRaspSwitch;
    }

    /**
     * Get <p>Whether the auto-downgrade switch is enabled</p> 
     * @return AutoDowngradeSwitch <p>Whether the auto-downgrade switch is enabled</p>
     */
    public Boolean getAutoDowngradeSwitch() {
        return this.AutoDowngradeSwitch;
    }

    /**
     * Set <p>Whether the auto-downgrade switch is enabled</p>
     * @param AutoDowngradeSwitch <p>Whether the auto-downgrade switch is enabled</p>
     */
    public void setAutoDowngradeSwitch(Boolean AutoDowngradeSwitch) {
        this.AutoDowngradeSwitch = AutoDowngradeSwitch;
    }

    /**
     * Get <p>Number of available AI Protection Edition licenses</p> 
     * @return AvailableAISecurityLicenseCnt <p>Number of available AI Protection Edition licenses</p>
     */
    public Long getAvailableAISecurityLicenseCnt() {
        return this.AvailableAISecurityLicenseCnt;
    }

    /**
     * Set <p>Number of available AI Protection Edition licenses</p>
     * @param AvailableAISecurityLicenseCnt <p>Number of available AI Protection Edition licenses</p>
     */
    public void setAvailableAISecurityLicenseCnt(Long AvailableAISecurityLicenseCnt) {
        this.AvailableAISecurityLicenseCnt = AvailableAISecurityLicenseCnt;
    }

    /**
     * Get <p>Total number of AI Protection Edition licenses</p> 
     * @return AISecurityVersionLicenseCnt <p>Total number of AI Protection Edition licenses</p>
     */
    public Long getAISecurityVersionLicenseCnt() {
        return this.AISecurityVersionLicenseCnt;
    }

    /**
     * Set <p>Total number of AI Protection Edition licenses</p>
     * @param AISecurityVersionLicenseCnt <p>Total number of AI Protection Edition licenses</p>
     */
    public void setAISecurityVersionLicenseCnt(Long AISecurityVersionLicenseCnt) {
        this.AISecurityVersionLicenseCnt = AISecurityVersionLicenseCnt;
    }

    /**
     * Get <p>Number of available licenses after combining application protection licenses with Ultimate Edition licenses</p> 
     * @return ApplicationAvailableLicenseCnt <p>Number of available licenses after combining application protection licenses with Ultimate Edition licenses</p>
     */
    public Long getApplicationAvailableLicenseCnt() {
        return this.ApplicationAvailableLicenseCnt;
    }

    /**
     * Set <p>Number of available licenses after combining application protection licenses with Ultimate Edition licenses</p>
     * @param ApplicationAvailableLicenseCnt <p>Number of available licenses after combining application protection licenses with Ultimate Edition licenses</p>
     */
    public void setApplicationAvailableLicenseCnt(Long ApplicationAvailableLicenseCnt) {
        this.ApplicationAvailableLicenseCnt = ApplicationAvailableLicenseCnt;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeLicenseGeneralResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLicenseGeneralResponse(DescribeLicenseGeneralResponse source) {
        if (source.LicenseCnt != null) {
            this.LicenseCnt = new Long(source.LicenseCnt);
        }
        if (source.AvailableLicenseCnt != null) {
            this.AvailableLicenseCnt = new Long(source.AvailableLicenseCnt);
        }
        if (source.AvailableProVersionLicenseCnt != null) {
            this.AvailableProVersionLicenseCnt = new Long(source.AvailableProVersionLicenseCnt);
        }
        if (source.AvailableFlagshipVersionLicenseCnt != null) {
            this.AvailableFlagshipVersionLicenseCnt = new Long(source.AvailableFlagshipVersionLicenseCnt);
        }
        if (source.NearExpiryLicenseCnt != null) {
            this.NearExpiryLicenseCnt = new Long(source.NearExpiryLicenseCnt);
        }
        if (source.ExpireLicenseCnt != null) {
            this.ExpireLicenseCnt = new Long(source.ExpireLicenseCnt);
        }
        if (source.AutoOpenStatus != null) {
            this.AutoOpenStatus = new Boolean(source.AutoOpenStatus);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
        if (source.IsOpenStatusHistory != null) {
            this.IsOpenStatusHistory = new Boolean(source.IsOpenStatusHistory);
        }
        if (source.UsedLicenseCnt != null) {
            this.UsedLicenseCnt = new Long(source.UsedLicenseCnt);
        }
        if (source.NotExpiredLicenseCnt != null) {
            this.NotExpiredLicenseCnt = new Long(source.NotExpiredLicenseCnt);
        }
        if (source.FlagshipVersionLicenseCnt != null) {
            this.FlagshipVersionLicenseCnt = new Long(source.FlagshipVersionLicenseCnt);
        }
        if (source.ProVersionLicenseCnt != null) {
            this.ProVersionLicenseCnt = new Long(source.ProVersionLicenseCnt);
        }
        if (source.CwpVersionLicenseCnt != null) {
            this.CwpVersionLicenseCnt = new Long(source.CwpVersionLicenseCnt);
        }
        if (source.AvailableLHLicenseCnt != null) {
            this.AvailableLHLicenseCnt = new Long(source.AvailableLHLicenseCnt);
        }
        if (source.AutoRepurchaseSwitch != null) {
            this.AutoRepurchaseSwitch = new Boolean(source.AutoRepurchaseSwitch);
        }
        if (source.AutoRepurchaseRenewSwitch != null) {
            this.AutoRepurchaseRenewSwitch = new Boolean(source.AutoRepurchaseRenewSwitch);
        }
        if (source.DestroyOrderNum != null) {
            this.DestroyOrderNum = new Long(source.DestroyOrderNum);
        }
        if (source.RepurchaseRenewSwitch != null) {
            this.RepurchaseRenewSwitch = new Boolean(source.RepurchaseRenewSwitch);
        }
        if (source.AutoBindRaspSwitch != null) {
            this.AutoBindRaspSwitch = new Boolean(source.AutoBindRaspSwitch);
        }
        if (source.AutoOpenRaspSwitch != null) {
            this.AutoOpenRaspSwitch = new Boolean(source.AutoOpenRaspSwitch);
        }
        if (source.AutoDowngradeSwitch != null) {
            this.AutoDowngradeSwitch = new Boolean(source.AutoDowngradeSwitch);
        }
        if (source.AvailableAISecurityLicenseCnt != null) {
            this.AvailableAISecurityLicenseCnt = new Long(source.AvailableAISecurityLicenseCnt);
        }
        if (source.AISecurityVersionLicenseCnt != null) {
            this.AISecurityVersionLicenseCnt = new Long(source.AISecurityVersionLicenseCnt);
        }
        if (source.ApplicationAvailableLicenseCnt != null) {
            this.ApplicationAvailableLicenseCnt = new Long(source.ApplicationAvailableLicenseCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseCnt", this.LicenseCnt);
        this.setParamSimple(map, prefix + "AvailableLicenseCnt", this.AvailableLicenseCnt);
        this.setParamSimple(map, prefix + "AvailableProVersionLicenseCnt", this.AvailableProVersionLicenseCnt);
        this.setParamSimple(map, prefix + "AvailableFlagshipVersionLicenseCnt", this.AvailableFlagshipVersionLicenseCnt);
        this.setParamSimple(map, prefix + "NearExpiryLicenseCnt", this.NearExpiryLicenseCnt);
        this.setParamSimple(map, prefix + "ExpireLicenseCnt", this.ExpireLicenseCnt);
        this.setParamSimple(map, prefix + "AutoOpenStatus", this.AutoOpenStatus);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);
        this.setParamSimple(map, prefix + "IsOpenStatusHistory", this.IsOpenStatusHistory);
        this.setParamSimple(map, prefix + "UsedLicenseCnt", this.UsedLicenseCnt);
        this.setParamSimple(map, prefix + "NotExpiredLicenseCnt", this.NotExpiredLicenseCnt);
        this.setParamSimple(map, prefix + "FlagshipVersionLicenseCnt", this.FlagshipVersionLicenseCnt);
        this.setParamSimple(map, prefix + "ProVersionLicenseCnt", this.ProVersionLicenseCnt);
        this.setParamSimple(map, prefix + "CwpVersionLicenseCnt", this.CwpVersionLicenseCnt);
        this.setParamSimple(map, prefix + "AvailableLHLicenseCnt", this.AvailableLHLicenseCnt);
        this.setParamSimple(map, prefix + "AutoRepurchaseSwitch", this.AutoRepurchaseSwitch);
        this.setParamSimple(map, prefix + "AutoRepurchaseRenewSwitch", this.AutoRepurchaseRenewSwitch);
        this.setParamSimple(map, prefix + "DestroyOrderNum", this.DestroyOrderNum);
        this.setParamSimple(map, prefix + "RepurchaseRenewSwitch", this.RepurchaseRenewSwitch);
        this.setParamSimple(map, prefix + "AutoBindRaspSwitch", this.AutoBindRaspSwitch);
        this.setParamSimple(map, prefix + "AutoOpenRaspSwitch", this.AutoOpenRaspSwitch);
        this.setParamSimple(map, prefix + "AutoDowngradeSwitch", this.AutoDowngradeSwitch);
        this.setParamSimple(map, prefix + "AvailableAISecurityLicenseCnt", this.AvailableAISecurityLicenseCnt);
        this.setParamSimple(map, prefix + "AISecurityVersionLicenseCnt", this.AISecurityVersionLicenseCnt);
        this.setParamSimple(map, prefix + "ApplicationAvailableLicenseCnt", this.ApplicationAvailableLicenseCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

