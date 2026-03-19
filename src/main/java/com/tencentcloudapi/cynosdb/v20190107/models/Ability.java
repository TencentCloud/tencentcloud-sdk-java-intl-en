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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Ability extends AbstractModel {

    /**
    * Whether secondary AZ is supported
    */
    @SerializedName("IsSupportSlaveZone")
    @Expose
    private String IsSupportSlaveZone;

    /**
    * The causes for no support from an availability zone.
    */
    @SerializedName("NonsupportSlaveZoneReason")
    @Expose
    private String NonsupportSlaveZoneReason;

    /**
    * Whether read-only instance is supported
    */
    @SerializedName("IsSupportRo")
    @Expose
    private String IsSupportRo;

    /**
    * Reasons why RO instances are not supported.
    */
    @SerializedName("NonsupportRoReason")
    @Expose
    private String NonsupportRoReason;

    /**
    * Whether manual snapshot backup initiation is supported.
    */
    @SerializedName("IsSupportManualSnapshot")
    @Expose
    private String IsSupportManualSnapshot;

    /**
    * Whether transparent data encryption is supported.
    */
    @SerializedName("IsSupportTransparentDataEncryption")
    @Expose
    private String IsSupportTransparentDataEncryption;

    /**
    * Reasons for no support of transparent data encryption.
    */
    @SerializedName("NoSupportTransparentDataEncryptionReason")
    @Expose
    private String NoSupportTransparentDataEncryptionReason;

    /**
    * Whether manual initiation of logical backup is supported.
    */
    @SerializedName("IsSupportManualLogic")
    @Expose
    private String IsSupportManualLogic;

    /**
    * Enable global encryption.
    */
    @SerializedName("IsSupportGlobalEncryption")
    @Expose
    private String IsSupportGlobalEncryption;

    /**
    * The causes for unsupported global encryption.
    */
    @SerializedName("NoSupportGlobalEncryptionReason")
    @Expose
    private String NoSupportGlobalEncryptionReason;

    /**
    * Status code for unsupported tde reason.
    */
    @SerializedName("NoSupportTransparentDataEncryptionReasonCode")
    @Expose
    private String NoSupportTransparentDataEncryptionReasonCode;

    /**
    * Status code for unsupported global encryption.
    */
    @SerializedName("NoSupportGlobalEncryptionReasonCode")
    @Expose
    private String NoSupportGlobalEncryptionReasonCode;

    /**
     * Get Whether secondary AZ is supported 
     * @return IsSupportSlaveZone Whether secondary AZ is supported
     */
    public String getIsSupportSlaveZone() {
        return this.IsSupportSlaveZone;
    }

    /**
     * Set Whether secondary AZ is supported
     * @param IsSupportSlaveZone Whether secondary AZ is supported
     */
    public void setIsSupportSlaveZone(String IsSupportSlaveZone) {
        this.IsSupportSlaveZone = IsSupportSlaveZone;
    }

    /**
     * Get The causes for no support from an availability zone. 
     * @return NonsupportSlaveZoneReason The causes for no support from an availability zone.
     */
    public String getNonsupportSlaveZoneReason() {
        return this.NonsupportSlaveZoneReason;
    }

    /**
     * Set The causes for no support from an availability zone.
     * @param NonsupportSlaveZoneReason The causes for no support from an availability zone.
     */
    public void setNonsupportSlaveZoneReason(String NonsupportSlaveZoneReason) {
        this.NonsupportSlaveZoneReason = NonsupportSlaveZoneReason;
    }

    /**
     * Get Whether read-only instance is supported 
     * @return IsSupportRo Whether read-only instance is supported
     */
    public String getIsSupportRo() {
        return this.IsSupportRo;
    }

    /**
     * Set Whether read-only instance is supported
     * @param IsSupportRo Whether read-only instance is supported
     */
    public void setIsSupportRo(String IsSupportRo) {
        this.IsSupportRo = IsSupportRo;
    }

    /**
     * Get Reasons why RO instances are not supported. 
     * @return NonsupportRoReason Reasons why RO instances are not supported.
     */
    public String getNonsupportRoReason() {
        return this.NonsupportRoReason;
    }

    /**
     * Set Reasons why RO instances are not supported.
     * @param NonsupportRoReason Reasons why RO instances are not supported.
     */
    public void setNonsupportRoReason(String NonsupportRoReason) {
        this.NonsupportRoReason = NonsupportRoReason;
    }

    /**
     * Get Whether manual snapshot backup initiation is supported. 
     * @return IsSupportManualSnapshot Whether manual snapshot backup initiation is supported.
     */
    public String getIsSupportManualSnapshot() {
        return this.IsSupportManualSnapshot;
    }

    /**
     * Set Whether manual snapshot backup initiation is supported.
     * @param IsSupportManualSnapshot Whether manual snapshot backup initiation is supported.
     */
    public void setIsSupportManualSnapshot(String IsSupportManualSnapshot) {
        this.IsSupportManualSnapshot = IsSupportManualSnapshot;
    }

    /**
     * Get Whether transparent data encryption is supported. 
     * @return IsSupportTransparentDataEncryption Whether transparent data encryption is supported.
     */
    public String getIsSupportTransparentDataEncryption() {
        return this.IsSupportTransparentDataEncryption;
    }

    /**
     * Set Whether transparent data encryption is supported.
     * @param IsSupportTransparentDataEncryption Whether transparent data encryption is supported.
     */
    public void setIsSupportTransparentDataEncryption(String IsSupportTransparentDataEncryption) {
        this.IsSupportTransparentDataEncryption = IsSupportTransparentDataEncryption;
    }

    /**
     * Get Reasons for no support of transparent data encryption. 
     * @return NoSupportTransparentDataEncryptionReason Reasons for no support of transparent data encryption.
     */
    public String getNoSupportTransparentDataEncryptionReason() {
        return this.NoSupportTransparentDataEncryptionReason;
    }

    /**
     * Set Reasons for no support of transparent data encryption.
     * @param NoSupportTransparentDataEncryptionReason Reasons for no support of transparent data encryption.
     */
    public void setNoSupportTransparentDataEncryptionReason(String NoSupportTransparentDataEncryptionReason) {
        this.NoSupportTransparentDataEncryptionReason = NoSupportTransparentDataEncryptionReason;
    }

    /**
     * Get Whether manual initiation of logical backup is supported. 
     * @return IsSupportManualLogic Whether manual initiation of logical backup is supported.
     */
    public String getIsSupportManualLogic() {
        return this.IsSupportManualLogic;
    }

    /**
     * Set Whether manual initiation of logical backup is supported.
     * @param IsSupportManualLogic Whether manual initiation of logical backup is supported.
     */
    public void setIsSupportManualLogic(String IsSupportManualLogic) {
        this.IsSupportManualLogic = IsSupportManualLogic;
    }

    /**
     * Get Enable global encryption. 
     * @return IsSupportGlobalEncryption Enable global encryption.
     */
    public String getIsSupportGlobalEncryption() {
        return this.IsSupportGlobalEncryption;
    }

    /**
     * Set Enable global encryption.
     * @param IsSupportGlobalEncryption Enable global encryption.
     */
    public void setIsSupportGlobalEncryption(String IsSupportGlobalEncryption) {
        this.IsSupportGlobalEncryption = IsSupportGlobalEncryption;
    }

    /**
     * Get The causes for unsupported global encryption. 
     * @return NoSupportGlobalEncryptionReason The causes for unsupported global encryption.
     */
    public String getNoSupportGlobalEncryptionReason() {
        return this.NoSupportGlobalEncryptionReason;
    }

    /**
     * Set The causes for unsupported global encryption.
     * @param NoSupportGlobalEncryptionReason The causes for unsupported global encryption.
     */
    public void setNoSupportGlobalEncryptionReason(String NoSupportGlobalEncryptionReason) {
        this.NoSupportGlobalEncryptionReason = NoSupportGlobalEncryptionReason;
    }

    /**
     * Get Status code for unsupported tde reason. 
     * @return NoSupportTransparentDataEncryptionReasonCode Status code for unsupported tde reason.
     */
    public String getNoSupportTransparentDataEncryptionReasonCode() {
        return this.NoSupportTransparentDataEncryptionReasonCode;
    }

    /**
     * Set Status code for unsupported tde reason.
     * @param NoSupportTransparentDataEncryptionReasonCode Status code for unsupported tde reason.
     */
    public void setNoSupportTransparentDataEncryptionReasonCode(String NoSupportTransparentDataEncryptionReasonCode) {
        this.NoSupportTransparentDataEncryptionReasonCode = NoSupportTransparentDataEncryptionReasonCode;
    }

    /**
     * Get Status code for unsupported global encryption. 
     * @return NoSupportGlobalEncryptionReasonCode Status code for unsupported global encryption.
     */
    public String getNoSupportGlobalEncryptionReasonCode() {
        return this.NoSupportGlobalEncryptionReasonCode;
    }

    /**
     * Set Status code for unsupported global encryption.
     * @param NoSupportGlobalEncryptionReasonCode Status code for unsupported global encryption.
     */
    public void setNoSupportGlobalEncryptionReasonCode(String NoSupportGlobalEncryptionReasonCode) {
        this.NoSupportGlobalEncryptionReasonCode = NoSupportGlobalEncryptionReasonCode;
    }

    public Ability() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Ability(Ability source) {
        if (source.IsSupportSlaveZone != null) {
            this.IsSupportSlaveZone = new String(source.IsSupportSlaveZone);
        }
        if (source.NonsupportSlaveZoneReason != null) {
            this.NonsupportSlaveZoneReason = new String(source.NonsupportSlaveZoneReason);
        }
        if (source.IsSupportRo != null) {
            this.IsSupportRo = new String(source.IsSupportRo);
        }
        if (source.NonsupportRoReason != null) {
            this.NonsupportRoReason = new String(source.NonsupportRoReason);
        }
        if (source.IsSupportManualSnapshot != null) {
            this.IsSupportManualSnapshot = new String(source.IsSupportManualSnapshot);
        }
        if (source.IsSupportTransparentDataEncryption != null) {
            this.IsSupportTransparentDataEncryption = new String(source.IsSupportTransparentDataEncryption);
        }
        if (source.NoSupportTransparentDataEncryptionReason != null) {
            this.NoSupportTransparentDataEncryptionReason = new String(source.NoSupportTransparentDataEncryptionReason);
        }
        if (source.IsSupportManualLogic != null) {
            this.IsSupportManualLogic = new String(source.IsSupportManualLogic);
        }
        if (source.IsSupportGlobalEncryption != null) {
            this.IsSupportGlobalEncryption = new String(source.IsSupportGlobalEncryption);
        }
        if (source.NoSupportGlobalEncryptionReason != null) {
            this.NoSupportGlobalEncryptionReason = new String(source.NoSupportGlobalEncryptionReason);
        }
        if (source.NoSupportTransparentDataEncryptionReasonCode != null) {
            this.NoSupportTransparentDataEncryptionReasonCode = new String(source.NoSupportTransparentDataEncryptionReasonCode);
        }
        if (source.NoSupportGlobalEncryptionReasonCode != null) {
            this.NoSupportGlobalEncryptionReasonCode = new String(source.NoSupportGlobalEncryptionReasonCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSupportSlaveZone", this.IsSupportSlaveZone);
        this.setParamSimple(map, prefix + "NonsupportSlaveZoneReason", this.NonsupportSlaveZoneReason);
        this.setParamSimple(map, prefix + "IsSupportRo", this.IsSupportRo);
        this.setParamSimple(map, prefix + "NonsupportRoReason", this.NonsupportRoReason);
        this.setParamSimple(map, prefix + "IsSupportManualSnapshot", this.IsSupportManualSnapshot);
        this.setParamSimple(map, prefix + "IsSupportTransparentDataEncryption", this.IsSupportTransparentDataEncryption);
        this.setParamSimple(map, prefix + "NoSupportTransparentDataEncryptionReason", this.NoSupportTransparentDataEncryptionReason);
        this.setParamSimple(map, prefix + "IsSupportManualLogic", this.IsSupportManualLogic);
        this.setParamSimple(map, prefix + "IsSupportGlobalEncryption", this.IsSupportGlobalEncryption);
        this.setParamSimple(map, prefix + "NoSupportGlobalEncryptionReason", this.NoSupportGlobalEncryptionReason);
        this.setParamSimple(map, prefix + "NoSupportTransparentDataEncryptionReasonCode", this.NoSupportTransparentDataEncryptionReasonCode);
        this.setParamSimple(map, prefix + "NoSupportGlobalEncryptionReasonCode", this.NoSupportGlobalEncryptionReasonCode);

    }
}

